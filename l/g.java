package l;
public final class g {
    public CharSequence A;
    public CharSequence B;
    public android.content.res.ColorStateList C;
    public android.graphics.PorterDuff$Mode D;
    public final synthetic l.h E;
    public final android.view.Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public m.p z;

    public g(l.h p1, android.view.Menu p2)
    {
        this.E = p1;
        this.C = 0;
        this.D = 0;
        this.a = p2;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 1;
        this.g = 1;
        return;
    }

    public final Object a(String p3, Class[] p4, Object[] p5)
    {
        try {
            Exception v4_2 = Class.forName(p3, 0, this.E.c.getClassLoader()).getConstructor(p4);
            v4_2.setAccessible(1);
            int v3_1 = v4_2.newInstance(p5);
            return v3_1;
        } catch (Exception v4_1) {
            String v5_2 = new StringBuilder("Cannot instantiate class: ");
            v5_2.append(v3_1);
            android.util.Log.w("SupportMenuInflater", v5_2.toString(), v4_1);
            return 0;
        }
    }

    public final void b(android.view.MenuItem p9)
    {
        j0.a v3_3;
        android.content.res.ColorStateList v0_0 = this.E;
        String v1_0 = v0_0.c;
        android.view.MenuItem vtmp3 = p9.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        String v4_0 = 0;
        if (this.r < 1) {
            v3_3 = 0;
        } else {
            v3_3 = 1;
        }
        vtmp3.setCheckable(v3_3).setTitleCondensed(this.l).setIcon(this.m);
        j0.a v2_15 = this.v;
        if (v2_15 >= null) {
            p9.setShowAsAction(v2_15);
        }
        if (this.y != null) {
            if (v1_0.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            } else {
                if (v0_0.d == null) {
                    v0_0.d = l.h.a(v1_0);
                }
                String v1_9 = v0_0.d;
                j0.a v3_9 = this.y;
                j0.a v2_20 = new l.f();
                v2_20.a = v1_9;
                String v1_10 = v1_9.getClass();
                try {
                    v2_20.b = v1_10.getMethod(v3_9, l.f.c);
                    p9.setOnMenuItemClickListener(v2_20);
                } catch (j0.a v9_4) {
                    j0.a v2_22 = v1.a.q("Couldn\'t resolve menu item onClick handler ", v3_9, " in class ");
                    v2_22.append(v1_10.getName());
                    android.content.res.ColorStateList v0_16 = new android.view.InflateException(v2_22.toString());
                    v0_16.initCause(v9_4);
                    throw v0_16;
                }
            }
        }
        if (this.r >= 2) {
            if (!(p9 instanceof m.o)) {
                if ((p9 instanceof m.t)) {
                    j0.a v2_25 = ((m.t) p9).c;
                    if (((m.t) p9).d == null) {
                        ((m.t) p9).d = v2_25.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] {Boolean.TYPE}));
                    }
                    ((m.t) p9).d.invoke(v2_25, new Object[] {Boolean.TRUE}));
                }
            } else {
                ((m.o) p9).x = ((((m.o) p9).x & -5) | 4);
            }
        }
        String v1_1 = this.x;
        if (v1_1 != null) {
            p9.setActionView(((android.view.View) this.a(v1_1, l.h.e, v0_0.a)));
            v4_0 = 1;
        }
        android.content.res.ColorStateList v0_4 = this.w;
        if (v0_4 > null) {
            if (v4_0 != null) {
                android.util.Log.w("SupportMenuInflater", "Ignoring attribute \'itemActionViewLayout\'. Action view already specified.");
            } else {
                p9.setActionView(v0_4);
            }
        }
        android.content.res.ColorStateList v0_6 = this.z;
        if (v0_6 != null) {
            if (!(p9 instanceof j0.a)) {
                android.util.Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            } else {
                ((j0.a) p9).b(v0_6);
            }
        }
        android.content.res.ColorStateList v0_8 = this.A;
        String v1_7 = (p9 instanceof j0.a);
        if (v1_7 == null) {
            p9.setContentDescription(v0_8);
        } else {
            ((j0.a) p9).setContentDescription(v0_8);
        }
        android.content.res.ColorStateList v0_9 = this.B;
        if (v1_7 == null) {
            p9.setTooltipText(v0_9);
        } else {
            ((j0.a) p9).setTooltipText(v0_9);
        }
        android.content.res.ColorStateList v0_10 = this.n;
        j0.a v2_8 = this.o;
        if (v1_7 == null) {
            p9.setAlphabeticShortcut(v0_10, v2_8);
        } else {
            ((j0.a) p9).setAlphabeticShortcut(v0_10, v2_8);
        }
        android.content.res.ColorStateList v0_11 = this.p;
        j0.a v2_9 = this.q;
        if (v1_7 == null) {
            p9.setNumericShortcut(v0_11, v2_9);
        } else {
            ((j0.a) p9).setNumericShortcut(v0_11, v2_9);
        }
        android.content.res.ColorStateList v0_12 = this.D;
        if (v0_12 != null) {
            if (v1_7 == null) {
                p9.setIconTintMode(v0_12);
            } else {
                ((j0.a) p9).setIconTintMode(v0_12);
            }
        }
        android.content.res.ColorStateList v0_13 = this.C;
        if (v0_13 != null) {
            if (v1_7 == null) {
                p9.setIconTintList(v0_13);
            } else {
                ((j0.a) p9).setIconTintList(v0_13);
            }
        }
        return;
    }
}
