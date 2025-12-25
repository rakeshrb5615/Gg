package h;
public abstract class i extends androidx.fragment.app.j0 implements h.j {
    public h.c0 a;

    public final void addContentView(android.view.View p4, android.view.ViewGroup$LayoutParams p5)
    {
        this.initializeViewTreeOwners();
        h.c0 v0_1 = ((h.c0) this.h());
        v0_1.z();
        ((android.view.ViewGroup) v0_1.H.findViewById(16908290)).addView(p4, p5);
        v0_1.s.a(v0_1.r.getCallback());
        return;
    }

    public final void attachBaseContext(android.content.Context p10)
    {
        Object v0_4 = ((h.c0) this.h());
        v0_4.V = 1;
        l.c v2_4 = v0_4.Z;
        if (v2_4 == -100) {
            v2_4 = h.p.b;
        }
        Object v0_1 = v0_4.F(p10, v2_4);
        if (h.p.g(p10)) {
            h.p.p(p10);
        }
        l.c v2_1 = h.c0.s(p10);
        try {
            if (!(p10 instanceof android.view.ContextThemeWrapper)) {
                try {
                    if (!(p10 instanceof l.c)) {
                        if (h.c0.q0) {
                            int v7_2;
                            int v3_14 = new android.content.res.Configuration();
                            v3_14.uiMode = -1;
                            v3_14.fontScale = 0;
                            int v3_17 = p10.createConfigurationContext(v3_14).getResources().getConfiguration();
                            String v6_4 = p10.getResources().getConfiguration();
                            v3_17.uiMode = v6_4.uiMode;
                            if (v3_17.equals(v6_4)) {
                                v7_2 = 0;
                            } else {
                                v7_2 = new android.content.res.Configuration();
                                v7_2.fontScale = 0;
                                if (v3_17.diff(v6_4) != 0) {
                                    int v8_19 = v6_4.fontScale;
                                    if (v3_17.fontScale != v8_19) {
                                        v7_2.fontScale = v8_19;
                                    }
                                    int v8_20 = v6_4.mcc;
                                    if (v3_17.mcc != v8_20) {
                                        v7_2.mcc = v8_20;
                                    }
                                    int v8_21 = v6_4.mnc;
                                    if (v3_17.mnc != v8_21) {
                                        v7_2.mnc = v8_21;
                                    }
                                    h.u.a(v3_17, v6_4, v7_2);
                                    int v8_22 = v6_4.touchscreen;
                                    if (v3_17.touchscreen != v8_22) {
                                        v7_2.touchscreen = v8_22;
                                    }
                                    int v8_23 = v6_4.keyboard;
                                    if (v3_17.keyboard != v8_23) {
                                        v7_2.keyboard = v8_23;
                                    }
                                    int v8_24 = v6_4.keyboardHidden;
                                    if (v3_17.keyboardHidden != v8_24) {
                                        v7_2.keyboardHidden = v8_24;
                                    }
                                    int v8_25 = v6_4.navigation;
                                    if (v3_17.navigation != v8_25) {
                                        v7_2.navigation = v8_25;
                                    }
                                    int v8_26 = v6_4.navigationHidden;
                                    if (v3_17.navigationHidden != v8_26) {
                                        v7_2.navigationHidden = v8_26;
                                    }
                                    int v8_27 = v6_4.orientation;
                                    if (v3_17.orientation != v8_27) {
                                        v7_2.orientation = v8_27;
                                    }
                                    int v8_1 = (v6_4.screenLayout & 15);
                                    if ((v3_17.screenLayout & 15) != v8_1) {
                                        v7_2.screenLayout = (v7_2.screenLayout | v8_1);
                                    }
                                    int v8_3 = (v6_4.screenLayout & 192);
                                    if ((v3_17.screenLayout & 192) != v8_3) {
                                        v7_2.screenLayout = (v7_2.screenLayout | v8_3);
                                    }
                                    int v8_5 = (v6_4.screenLayout & 48);
                                    if ((v3_17.screenLayout & 48) != v8_5) {
                                        v7_2.screenLayout = (v7_2.screenLayout | v8_5);
                                    }
                                    int v8_7 = (v6_4.screenLayout & 768);
                                    if ((v3_17.screenLayout & 768) != v8_7) {
                                        v7_2.screenLayout = (v7_2.screenLayout | v8_7);
                                    }
                                    int v8_9 = (v6_4.colorMode & 3);
                                    if ((v3_17.colorMode & 3) != v8_9) {
                                        v7_2.colorMode = (v7_2.colorMode | v8_9);
                                    }
                                    int v8_11 = (v6_4.colorMode & 12);
                                    if ((v3_17.colorMode & 12) != v8_11) {
                                        v7_2.colorMode = (v7_2.colorMode | v8_11);
                                    }
                                    int v8_13 = (v6_4.uiMode & 15);
                                    if ((v3_17.uiMode & 15) != v8_13) {
                                        v7_2.uiMode = (v7_2.uiMode | v8_13);
                                    }
                                    int v8_15 = (v6_4.uiMode & 48);
                                    if ((v3_17.uiMode & 48) != v8_15) {
                                        v7_2.uiMode = (v7_2.uiMode | v8_15);
                                    }
                                    int v8_16 = v6_4.screenWidthDp;
                                    if (v3_17.screenWidthDp != v8_16) {
                                        v7_2.screenWidthDp = v8_16;
                                    }
                                    int v8_17 = v6_4.screenHeightDp;
                                    if (v3_17.screenHeightDp != v8_17) {
                                        v7_2.screenHeightDp = v8_17;
                                    }
                                    int v8_18 = v6_4.smallestScreenWidthDp;
                                    if (v3_17.smallestScreenWidthDp != v8_18) {
                                        v7_2.smallestScreenWidthDp = v8_18;
                                    }
                                    int v4_35 = v6_4.densityDpi;
                                    if (v3_17.densityDpi != v4_35) {
                                        v7_2.densityDpi = v4_35;
                                    }
                                }
                            }
                            Object v0_2 = h.c0.w(p10, v0_1, v2_1, v7_2, 1);
                            l.c v2_3 = new l.c(p10, 2132017802);
                            v2_3.a(v0_2);
                            try {
                                if (p10.getTheme() != null) {
                                    reflect.InvocationTargetException v10_2 = v2_3.getTheme();
                                    if (android.os.Build$VERSION.SDK_INT < 29) {
                                        try {
                                            if (!g0.b.g) {
                                                try {
                                                    int v3_6 = android.content.res.Resources$Theme.getDeclaredMethod("rebase", 0);
                                                    g0.b.f = v3_6;
                                                    v3_6.setAccessible(1);
                                                } catch (int v3_7) {
                                                    android.util.Log.i("ResourcesCompat", "Failed to retrieve rebase() method", v3_7);
                                                }
                                                g0.b.g = 1;
                                            }
                                        } catch (reflect.InvocationTargetException v10_4) {
                                            throw v10_4;
                                        }
                                        String v1_0 = g0.b.f;
                                        if (v1_0 != null) {
                                            try {
                                                v1_0.invoke(v10_2, 0);
                                            } catch (reflect.InvocationTargetException v10_3) {
                                                android.util.Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", v10_3);
                                                g0.b.f = 0;
                                            } catch (reflect.InvocationTargetException v10_3) {
                                            }
                                        }
                                    } else {
                                        g0.l.a(v10_2);
                                    }
                                }
                            } catch (NullPointerException) {
                            }
                            p10 = v2_3;
                        }
                    } else {
                        ((l.c) p10).a(h.c0.w(p10, v0_1, v2_1, 0, 0));
                    }
                } catch (IllegalStateException) {
                }
            } else {
                ((android.view.ContextThemeWrapper) p10).applyOverrideConfiguration(h.c0.w(p10, v0_1, v2_1, 0, 0));
            }
        } catch (IllegalStateException) {
        }
        super.attachBaseContext(p10);
        return;
    }

    public final void closeOptionsMenu()
    {
        ((h.c0) this.h()).D();
        if (this.getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
        return;
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent p2)
    {
        p2.getKeyCode();
        ((h.c0) this.h()).D();
        return super.dispatchKeyEvent(p2);
    }

    public final android.view.View findViewById(int p2)
    {
        android.view.Window v0_1 = ((h.c0) this.h());
        v0_1.z();
        return v0_1.r.findViewById(p2);
    }

    public final android.view.MenuInflater getMenuInflater()
    {
        l.h v0_2 = ((h.c0) this.h());
        if (v0_2.v == null) {
            android.content.Context v2_0;
            v0_2.D();
            android.content.Context v2_1 = v0_2.u;
            if (v2_1 == null) {
                v2_0 = v0_2.q;
            } else {
                v2_0 = v2_1.X();
            }
            v0_2.v = new l.h(v2_0);
        }
        return v0_2.v;
    }

    public final android.content.res.Resources getResources()
    {
        return super.getResources();
    }

    public final h.p h()
    {
        if (this.a == null) {
            this.a = new h.c0(this, 0, this, this);
        }
        return this.a;
    }

    public final void invalidateOptionsMenu()
    {
        this.h().e();
        return;
    }

    public final void onConfigurationChanged(android.content.res.Configuration p5)
    {
        super.onConfigurationChanged(p5);
        Throwable v5_3 = ((h.c0) this.h());
        if ((v5_3.M) && (v5_3.G)) {
            v5_3.D();
            int v0_6 = v5_3.u;
            if (v0_6 != 0) {
                v0_6.a0(v0_6.f.getResources().getBoolean(2131034112));
            }
        }
        try {
        } catch (Throwable v5_4) {
            throw v5_4;
        }
        android.content.res.Configuration v1_5 = ((r.g) n.u.a().a.b.get(v5_3.q));
        if (v1_5 != null) {
            v1_5.a();
        }
        v5_3.Y = new android.content.res.Configuration(v5_3.q.getResources().getConfiguration());
        v5_3.q(0, 0);
        return;
    }

    public final void onContentChanged()
    {
        return;
    }

    public void onDestroy()
    {
        super.onDestroy();
        this.h().i();
        return;
    }

    public final boolean onMenuItemSelected(int p5, android.view.MenuItem p6)
    {
        if (!super.onMenuItemSelected(p5, p6)) {
            android.content.pm.PackageManager$NameNotFoundException v5_11 = ((h.c0) this.h());
            v5_11.D();
            android.content.pm.PackageManager$NameNotFoundException v5_16 = v5_11.u;
            if ((p6.getItemId() == 16908332) && ((v5_16 != null) && ((((n.f3) v5_16.j).b & 4) != 0))) {
                android.content.pm.PackageManager$NameNotFoundException v5_6 = d0.d.a(this);
                if (v5_6 != null) {
                    if (!this.shouldUpRecreateTask(v5_6)) {
                        this.navigateUpTo(v5_6);
                        return 1;
                    } else {
                        android.content.pm.PackageManager$NameNotFoundException v5_8 = new java.util.ArrayList();
                        IllegalArgumentException v6_3 = d0.d.a(this);
                        if (v6_3 == null) {
                            v6_3 = d0.d.a(this);
                        }
                        if (v6_3 != null) {
                            android.content.Intent v1_1 = v6_3.getComponent();
                            if (v1_1 == null) {
                                v1_1 = v6_3.resolveActivity(this.getPackageManager());
                            }
                            int v3 = v5_8.size();
                            try {
                                android.content.Intent v1_3 = d0.d.b(this, v1_1);
                            } catch (android.content.pm.PackageManager$NameNotFoundException v5_9) {
                                android.util.Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                throw new IllegalArgumentException(v5_9);
                            }
                            while (v1_3 != null) {
                                v5_8.add(v3, v1_3);
                                v1_3 = d0.d.b(this, v1_3.getComponent());
                            }
                            v5_8.add(v6_3);
                        }
                        if (v5_8.isEmpty()) {
                            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                        } else {
                            IllegalArgumentException v6_9 = new android.content.Intent[0];
                            android.content.pm.PackageManager$NameNotFoundException v5_15 = ((android.content.Intent[]) v5_8.toArray(v6_9));
                            v5_15[0] = new android.content.Intent(v5_15[0]).addFlags(268484608);
                            if (!e0.c.startActivities(this, v5_15, 0)) {
                                IllegalArgumentException v6_16 = new android.content.Intent(v5_15[(v5_15.length - 1)]);
                                v6_16.addFlags(268435456);
                                this.startActivity(v6_16);
                            }
                            try {
                                this.finishAffinity();
                            } catch (IllegalStateException) {
                                this.finish();
                            }
                            return 1;
                        }
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final void onPostCreate(android.os.Bundle p1)
    {
        super.onPostCreate(p1);
        ((h.c0) this.h()).z();
        return;
    }

    public final void onPostResume()
    {
        super.onPostResume();
        h.n0 v0_1 = ((h.c0) this.h());
        v0_1.D();
        h.n0 v0_2 = v0_1.u;
        if (v0_2 != null) {
            v0_2.y = 1;
        }
        return;
    }

    public final void onStart()
    {
        super.onStart();
        ((h.c0) this.h()).q(1, 0);
        return;
    }

    public void onStop()
    {
        super.onStop();
        l.j v0_1 = ((h.c0) this.h());
        v0_1.D();
        l.j v0_2 = v0_1.u;
        if (v0_2 != null) {
            v0_2.y = 0;
            l.j v0_3 = v0_2.x;
            if (v0_3 != null) {
                v0_3.a();
            }
        }
        return;
    }

    public final void onTitleChanged(CharSequence p1, int p2)
    {
        super.onTitleChanged(p1, p2);
        this.h().o(p1);
        return;
    }

    public final void openOptionsMenu()
    {
        ((h.c0) this.h()).D();
        if (this.getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
        return;
    }

    public final void setContentView(int p2)
    {
        this.initializeViewTreeOwners();
        this.h().l(p2);
        return;
    }

    public void setContentView(android.view.View p2)
    {
        this.initializeViewTreeOwners();
        this.h().m(p2);
        return;
    }

    public final void setContentView(android.view.View p2, android.view.ViewGroup$LayoutParams p3)
    {
        this.initializeViewTreeOwners();
        this.h().n(p2, p3);
        return;
    }

    public final void setTheme(int p2)
    {
        super.setTheme(p2);
        ((h.c0) this.h()).a0 = p2;
        return;
    }

    public final void supportInvalidateOptionsMenu()
    {
        this.h().e();
        return;
    }
}
