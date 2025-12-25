package i2;
public final synthetic class z implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic com.chilllive.chillwallpaperproject.MainActivity b;

    public synthetic z(com.chilllive.chillwallpaperproject.MainActivity p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void onClick(android.view.View p12)
    {
        String v2_3 = this.b;
        switch (this.a) {
            case 0:
                v2_3.onclickContact(0);
                return;
            case 1:
                v2_3.n(2131951936, v2_3.k0, 0);
                return;
            case 2:
                v2_3.n(2131952294, v2_3.l0, 0);
                return;
            case 3:
                v2_3.n(2131951655, 2131886080, 0);
                return;
            case 4:
                v2_3.onclickHelp(0);
                return;
            case 5:
                e4.a v12_6 = v2_3.b0;
                Object[] v1_4 = v12_6.a;
                String v4 = v12_6.c.getPackageName();
                d4.r v6 = v1_4.a;
                if (v6 != null) {
                    c4.l.e.h("completeUpdate(%s)", new Object[] {v4}));
                    String v2_2 = new com.google.android.gms.tasks.TaskCompletionSource();
                    v6.a().post(new c4.h(v6, v2_2, v2_2, new c4.h(v1_4, v2_2, v2_2, v4, 1), 2));
                    v2_2.getTask();
                } else {
                    e4.a v12_3 = c4.l.e;
                    v12_3.getClass();
                    if (android.util.Log.isLoggable("PlayCore", 6)) {
                        android.util.Log.e("PlayCore", d4.l.j(v12_3.b, "onError(%d)", new Object[] {Integer.valueOf(-9)})));
                    }
                    com.google.android.gms.tasks.Tasks.forException(new e4.a(-9));
                }
                return;
            default:
                v2_3.onClickLanguages(0);
                return;
        }
    }
}
