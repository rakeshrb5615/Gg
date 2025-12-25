package h;
public final class n0 extends j5.t1 implements n.d {
    public static final android.view.animation.AccelerateInterpolator D;
    public static final android.view.animation.DecelerateInterpolator E;
    public final h.l0 A;
    public final h.l0 B;
    public final l6.c C;
    public android.content.Context f;
    public android.content.Context g;
    public androidx.appcompat.widget.ActionBarOverlayLayout h;
    public androidx.appcompat.widget.ActionBarContainer i;
    public n.k1 j;
    public androidx.appcompat.widget.ActionBarContextView k;
    public final android.view.View l;
    public boolean m;
    public h.m0 n;
    public h.m0 o;
    public k2.c p;
    public boolean q;
    public final java.util.ArrayList r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public l.j x;
    public boolean y;
    public boolean z;

    static n0()
    {
        h.n0.D = new android.view.animation.AccelerateInterpolator();
        h.n0.E = new android.view.animation.DecelerateInterpolator();
        return;
    }

    public n0(android.app.Activity p3, boolean p4)
    {
        new java.util.ArrayList();
        this.r = new java.util.ArrayList();
        this.s = 0;
        this.t = 1;
        this.w = 1;
        this.A = new h.l0(this, 0);
        this.B = new h.l0(this, 1);
        this.C = new l6.c(this, 22);
        android.view.View v3_2 = p3.getWindow().getDecorView();
        this.Y(v3_2);
        if (p4 == 0) {
            this.l = v3_2.findViewById(16908290);
        }
        return;
    }

    public n0(android.app.Dialog p3)
    {
        new java.util.ArrayList();
        this.r = new java.util.ArrayList();
        this.s = 0;
        this.t = 1;
        this.w = 1;
        this.A = new h.l0(this, 0);
        this.B = new h.l0(this, 1);
        this.C = new l6.c(this, 22);
        this.Y(p3.getWindow().getDecorView());
        return;
    }

    public final void W(boolean p10)
    {
        if (p10 == null) {
            if (this.v) {
                this.v = 0;
                android.view.ViewPropertyAnimator v1_6 = this.h;
                if (v1_6 != null) {
                    v1_6.setShowingForActionMode(0);
                }
                this.b0(0);
            }
        } else {
            if (!this.v) {
                this.v = 1;
                java.util.ArrayList v2_0 = this.h;
                if (v2_0 != null) {
                    v2_0.setShowingForActionMode(1);
                }
                this.b0(0);
            }
        }
        if (!this.i.isLaidOut()) {
            if (p10 == null) {
                ((n.f3) this.j).a.setVisibility(0);
                this.k.setVisibility(8);
                return;
            } else {
                ((n.f3) this.j).a.setVisibility(4);
                this.k.setVisibility(0);
                return;
            }
        } else {
            androidx.appcompat.widget.ActionBarContextView v10_13;
            android.view.ViewPropertyAnimator v1_7;
            if (p10 == null) {
                androidx.appcompat.widget.ActionBarContextView v10_10 = ((n.f3) this.j);
                android.view.ViewPropertyAnimator v1_5 = q0.q0.b(v10_10.a);
                v1_5.a(1065353216);
                v1_5.c(200);
                v1_5.d(new l.i(v10_10, 0));
                v1_7 = this.k.i(8, 100);
                v10_13 = v1_5;
            } else {
                androidx.appcompat.widget.ActionBarContextView v10_15 = ((n.f3) this.j);
                v1_7 = q0.q0.b(v10_15.a);
                v1_7.a(0);
                v1_7.c(100);
                v1_7.d(new l.i(v10_15, 4));
                v10_13 = this.k.i(0, 200);
            }
            long v3_4;
            l.j v0_2 = new l.j();
            java.util.ArrayList v2_5 = v0_2.a;
            v2_5.add(v1_7);
            android.view.ViewPropertyAnimator v1_11 = ((android.view.View) v1_7.a.get());
            if (v1_11 == null) {
                v3_4 = 0;
            } else {
                v3_4 = v1_11.animate().getDuration();
            }
            android.view.ViewPropertyAnimator v1_15 = ((android.view.View) v10_13.a.get());
            if (v1_15 != null) {
                v1_15.animate().setStartDelay(v3_4);
            }
            v2_5.add(v10_13);
            v0_2.b();
            return;
        }
    }

    public final android.content.Context X()
    {
        if (this.g == null) {
            android.content.Context v0_5 = new android.util.TypedValue();
            this.f.getTheme().resolveAttribute(2130968589, v0_5, 1);
            android.content.Context v0_1 = v0_5.resourceId;
            if (v0_1 == null) {
                this.g = this.f;
            } else {
                this.g = new android.view.ContextThemeWrapper(this.f, v0_1);
            }
        }
        return this.g;
    }

    public final void Y(android.view.View p7)
    {
        float v0_10 = ((androidx.appcompat.widget.ActionBarOverlayLayout) p7.findViewById(2131362007));
        this.h = v0_10;
        if (v0_10 != 0) {
            v0_10.setActionBarVisibilityCallback(this);
        }
        float v0_9;
        float v0_29 = p7.findViewById(2131361846);
        if (!(v0_29 instanceof n.k1)) {
            if (!(v0_29 instanceof androidx.appcompat.widget.Toolbar)) {
                float v0_4;
                if (v0_29 == 0) {
                    v0_4 = "null";
                } else {
                    v0_4 = v0_29.getClass().getSimpleName();
                }
                throw new IllegalStateException("Can\'t make a decor toolbar out of ".concat(v0_4));
            } else {
                v0_9 = ((androidx.appcompat.widget.Toolbar) v0_29).getWrapper();
            }
        } else {
            v0_9 = ((n.k1) v0_29);
        }
        this.j = v0_9;
        this.k = ((androidx.appcompat.widget.ActionBarContextView) p7.findViewById(2131361854));
        IllegalStateException v7_4 = ((androidx.appcompat.widget.ActionBarContainer) p7.findViewById(2131361848));
        this.i = v7_4;
        float v0_15 = this.j;
        if ((v0_15 == 0) || ((this.k == null) || (v7_4 == null))) {
            throw new IllegalStateException(h.n0.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        } else {
            float v0_24;
            IllegalStateException v7_8 = ((n.f3) v0_15).a.getContext();
            this.f = v7_8;
            if ((((n.f3) this.j).b & 4) == 0) {
                v0_24 = 0;
            } else {
                v0_24 = 1;
            }
            if (v0_24 != 0) {
                this.m = 1;
            }
            v7_8.getApplicationInfo();
            this.j.getClass();
            this.a0(v7_8.getResources().getBoolean(2131034112));
            IllegalStateException v7_12 = this.f.obtainStyledAttributes(0, g.a.a, 2130968584, 0);
            if (v7_12.getBoolean(14, 0)) {
                float v0_31 = this.h;
                if (!v0_31.m) {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                } else {
                    this.z = 1;
                    v0_31.setHideOnContentScrollEnabled(1);
                }
            }
            float v0_2 = v7_12.getDimensionPixelSize(12, 0);
            if (v0_2 != 0) {
                q0.i0.i(this.i, ((float) v0_2));
            }
            v7_12.recycle();
            return;
        }
    }

    public final void Z(boolean p5)
    {
        if (!this.m) {
            int v5_3;
            if (p5 == 0) {
                v5_3 = 0;
            } else {
                v5_3 = 4;
            }
            n.f3 v1_1 = ((n.f3) this.j);
            int v2 = v1_1.b;
            this.m = 1;
            v1_1.a(((v5_3 & 4) | (v2 & -5)));
        }
        return;
    }

    public final void a0(boolean p2)
    {
        if (p2 != null) {
            this.i.setTabContainer(0);
            ((n.f3) this.j).getClass();
        } else {
            ((n.f3) this.j).getClass();
            this.i.setTabContainer(0);
        }
        this.j.getClass();
        ((n.f3) this.j).a.setCollapsible(0);
        this.h.setHasNonEmbeddedTabs(0);
        return;
    }

    public final void b0(boolean p12)
    {
        android.view.animation.AccelerateInterpolator v4_1 = 0;
        android.view.ViewPropertyAnimator v6_2 = this.C;
        android.view.View v7 = this.l;
        if ((this.v) || (!this.u)) {
            if (!this.w) {
                this.w = 1;
                q0.t0 v0_17 = this.x;
                if (v0_17 != null) {
                    v0_17.a();
                }
                this.i.setVisibility(0);
                h.l0 v1_2 = this.B;
                if ((this.s != 0) || ((!this.y) && (p12 == null))) {
                    this.i.setAlpha(1065353216);
                    this.i.setTranslationY(0);
                    if ((this.t) && (v7 != null)) {
                        v7.setTranslationY(0);
                    }
                    v1_2.a();
                } else {
                    this.i.setTranslationY(0);
                    q0.t0 v0_6 = ((float) (- this.i.getHeight()));
                    if (p12 != null) {
                        q0.t0 v12_3 = new int[] {0, 0});
                        this.i.getLocationInWindow(v12_3);
                        v0_6 -= ((float) v12_3[1]);
                    }
                    this.i.setTranslationY(v0_6);
                    q0.t0 v12_8 = new l.j();
                    float v5_2 = q0.q0.b(this.i);
                    v5_2.e(0);
                    android.view.View v8_2 = ((android.view.View) v5_2.a.get());
                    if (v8_2 != null) {
                        if (v6_2 != null) {
                            v4_1 = new i2.j(v6_2, v8_2);
                        }
                        v8_2.animate().setUpdateListener(v4_1);
                    }
                    android.view.ViewPropertyAnimator v6_1 = v12_8.a;
                    if (!v12_8.e) {
                        v6_1.add(v5_2);
                    }
                    if ((this.t) && (v7 != null)) {
                        v7.setTranslationY(v0_6);
                        q0.t0 v0_8 = q0.q0.b(v7);
                        v0_8.e(0);
                        if (!v12_8.e) {
                            v6_1.add(v0_8);
                        }
                    }
                    q0.t0 v0_9 = v12_8.e;
                    if (v0_9 == null) {
                        v12_8.c = h.n0.E;
                    }
                    if (v0_9 == null) {
                        v12_8.b = 250;
                    }
                    if (v0_9 == null) {
                        v12_8.d = v1_2;
                    }
                    this.x = v12_8;
                    v12_8.b();
                }
                q0.t0 v12_9 = this.h;
                if (v12_9 != null) {
                    q0.g0.c(v12_9);
                }
            }
        } else {
            if (this.w) {
                this.w = 0;
                q0.t0 v0_7 = this.x;
                if (v0_7 != null) {
                    v0_7.a();
                }
                h.l0 v1_1 = this.A;
                if ((this.s != 0) || ((!this.y) && (p12 == null))) {
                    v1_1.a();
                    return;
                } else {
                    this.i.setAlpha(1065353216);
                    this.i.setTransitioning(1);
                    q0.t0 v0_15 = new l.j();
                    float v5_6 = ((float) (- this.i.getHeight()));
                    if (p12 != null) {
                        q0.t0 v12_10 = new int[] {0, 0});
                        this.i.getLocationInWindow(v12_10);
                        v5_6 -= ((float) v12_10[1]);
                    }
                    q0.t0 v12_14 = q0.q0.b(this.i);
                    v12_14.e(v5_6);
                    android.view.View v8_5 = ((android.view.View) v12_14.a.get());
                    if (v8_5 != null) {
                        if (v6_2 != null) {
                            v4_1 = new i2.j(v6_2, v8_5);
                        }
                        v8_5.animate().setUpdateListener(v4_1);
                    }
                    android.view.ViewPropertyAnimator v6_4 = v0_15.a;
                    if (!v0_15.e) {
                        v6_4.add(v12_14);
                    }
                    if ((this.t) && (v7 != null)) {
                        q0.t0 v12_16 = q0.q0.b(v7);
                        v12_16.e(v5_6);
                        if (!v0_15.e) {
                            v6_4.add(v12_16);
                        }
                    }
                    q0.t0 v12_17 = v0_15.e;
                    if (v12_17 == null) {
                        v0_15.c = h.n0.D;
                    }
                    if (v12_17 == null) {
                        v0_15.b = 250;
                    }
                    if (v12_17 == null) {
                        v0_15.d = v1_1;
                    }
                    this.x = v0_15;
                    v0_15.b();
                    return;
                }
            }
        }
        return;
    }
}
