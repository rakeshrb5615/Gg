package t0;
public final class h implements android.view.ActionMode$Callback {
    public final android.view.ActionMode$Callback a;
    public final android.widget.TextView b;
    public Class c;
    public reflect.Method d;
    public boolean e;
    public boolean f;

    public h(android.view.ActionMode$Callback p1, android.widget.TextView p2)
    {
        this.a = p1;
        this.b = p2;
        this.f = 0;
        return;
    }

    public final boolean onActionItemClicked(android.view.ActionMode p2, android.view.MenuItem p3)
    {
        return this.a.onActionItemClicked(p2, p3);
    }

    public final boolean onCreateActionMode(android.view.ActionMode p2, android.view.Menu p3)
    {
        return this.a.onCreateActionMode(p2, p3);
    }

    public final void onDestroyActionMode(android.view.ActionMode p2)
    {
        this.a.onDestroyActionMode(p2);
        return;
    }

    public final boolean onPrepareActionMode(android.view.ActionMode p14, android.view.Menu p15)
    {
        android.view.ActionMode$Callback v0_0 = this.b;
        int v1_1 = v0_0.getContext();
        android.content.pm.PackageManager v2 = v1_1.getPackageManager();
        android.view.MenuItem v4_14 = Integer.TYPE;
        if (!this.f) {
            this.f = 1;
            try {
                java.util.ArrayList v3_1 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.c = v3_1;
                this.d = v3_1.getDeclaredMethod("removeItemAt", new Class[] {v4_14}));
                this.e = 1;
            } catch (NoSuchMethodException) {
                this.c = 0;
                this.d = 0;
                this.e = 0;
            }
        }
        try {
            if ((!this.e) || (!this.c.isInstance(p15))) {
                java.util.ArrayList v3_8 = p15.getClass().getDeclaredMethod("removeItemAt", new Class[] {v4_14}));
            } else {
                v3_8 = this.d;
            }
        } catch (reflect.InvocationTargetException) {
            return this.a.onPrepareActionMode(p14, p15);
        }
        android.view.MenuItem v4_4 = (p15.size() - 1);
        while (v4_4 >= null) {
            String v8_0 = p15.getItem(v4_4);
            if ((v8_0.getIntent() != null) && ("android.intent.action.PROCESS_TEXT".equals(v8_0.getIntent().getAction()))) {
                v3_8.invoke(p15, new Object[] {Integer.valueOf(v4_4)}));
            }
            v4_4--;
        }
        java.util.ArrayList v3_10 = new java.util.ArrayList();
        if ((v1_1 instanceof android.app.Activity)) {
            android.view.MenuItem v4_13 = v2.queryIntentActivities(new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0).iterator();
            while (v4_13.hasNext()) {
                android.view.MenuItem v9_3 = ((android.content.pm.ResolveInfo) v4_13.next());
                if (!v1_1.getPackageName().equals(v9_3.activityInfo.packageName)) {
                    int v10_3 = v9_3.activityInfo;
                    if (v10_3.exported) {
                        int v10_4 = v10_3.permission;
                        if ((v10_4 == 0) || (v1_1.checkSelfPermission(v10_4) == 0)) {
                        }
                    }
                }
                v3_10.add(v9_3);
            }
        }
        int v1_0 = 0;
        while (v1_0 < v3_10.size()) {
            int v11_2;
            android.view.MenuItem v4_17 = ((android.content.pm.ResolveInfo) v3_10.get(v1_0));
            android.view.MenuItem v9_5 = p15.add(0, 0, (v1_0 + 100), v4_17.loadLabel(v2));
            int v10_10 = new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if ((!(v0_0 instanceof android.text.Editable)) || ((!v0_0.onCheckIsTextEditor()) || (!v0_0.isEnabled()))) {
                v11_2 = 0;
            } else {
                v11_2 = 1;
            }
            android.view.MenuItem v4_0 = v4_17.activityInfo;
            v9_5.setIntent(v10_10.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", (v11_2 ^ 1)).setClassName(v4_0.packageName, v4_0.name)).setShowAsAction(1);
            v1_0++;
        }
        return this.a.onPrepareActionMode(p14, p15);
    }
}
