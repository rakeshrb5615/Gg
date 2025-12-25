package h;
public final class c0 extends h.p implements m.k, android.view.LayoutInflater$Factory2 {
    public static final r.j o0;
    public static final int[] p0;
    public static final boolean q0;
    public l.a A;
    public androidx.appcompat.widget.ActionBarContextView B;
    public android.widget.PopupWindow C;
    public h.q D;
    public q0.t0 E;
    public final boolean F;
    public boolean G;
    public android.view.ViewGroup H;
    public android.widget.TextView I;
    public android.view.View J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public h.b0[] S;
    public h.b0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public android.content.res.Configuration Y;
    public final int Z;
    public int a0;
    public int b0;
    public boolean c0;
    public h.y d0;
    public h.y e0;
    public boolean f0;
    public int g0;
    public final h.q h0;
    public boolean i0;
    public android.graphics.Rect j0;
    public android.graphics.Rect k0;
    public h.h0 l0;
    public android.window.OnBackInvokedDispatcher m0;
    public android.window.OnBackInvokedCallback n0;
    public final Object p;
    public final android.content.Context q;
    public android.view.Window r;
    public h.x s;
    public final Object t;
    public h.n0 u;
    public l.h v;
    public CharSequence w;
    public n.j1 x;
    public h.r y;
    public h.r z;

    static c0()
    {
        h.c0.o0 = new r.j(0);
        h.c0.p0 = new int[] {16842836});
        h.c0.q0 = ("robolectric".equals(android.os.Build.FINGERPRINT) ^ 1);
        return;
    }

    public c0(android.content.Context p5, android.view.Window p6, h.j p7, Object p8)
    {
        h.i v0_0 = 0;
        this.E = 0;
        this.F = 1;
        this.Z = -100;
        this.h0 = new h.q(this, 0);
        this.q = p5;
        this.t = p7;
        this.p = p8;
        if ((p8 instanceof android.app.Dialog)) {
            while (p5 != null) {
                if (!(p5 instanceof h.i)) {
                    if (!(p5 instanceof android.content.ContextWrapper)) {
                        break;
                    }
                    p5 = ((android.content.ContextWrapper) p5).getBaseContext();
                } else {
                    v0_0 = ((h.i) p5);
                    break;
                }
            }
            if (v0_0 != null) {
                this.Z = ((h.c0) v0_0.h()).Z;
            }
        }
        if (this.Z == -100) {
            boolean v7_4 = h.c0.o0;
            android.content.Context v5_10 = ((Integer) v7_4.get(this.p.getClass().getName()));
            if (v5_10 != null) {
                this.Z = v5_10.intValue();
                v7_4.remove(this.p.getClass().getName());
            }
        }
        if (p6 != null) {
            this.r(p6);
        }
        n.u.d();
        return;
    }

    public static m0.h s(android.content.Context p5)
    {
        if (android.os.Build$VERSION.SDK_INT < 33) {
            m0.h v0_4 = h.p.c;
            if (v0_4 != null) {
                m0.h v0_8;
                android.os.LocaleList v1_5 = v0_4.a;
                m0.h v5_2 = h.u.b(p5.getApplicationContext().getResources().getConfiguration());
                if (!v0_4.b()) {
                    m0.h v0_3 = new java.util.LinkedHashSet();
                    int v2_0 = 0;
                    while (v2_0 < (v5_2.a.a.size() + v1_5.a.size())) {
                        java.util.Locale v3_7;
                        if (v2_0 >= v1_5.a.size()) {
                            v3_7 = v5_2.a.a.get((v2_0 - v1_5.a.size()));
                        } else {
                            v3_7 = v1_5.a.get(v2_0);
                        }
                        if (v3_7 != null) {
                            v0_3.add(v3_7);
                        }
                        v2_0++;
                    }
                    android.os.LocaleList v1_2 = new java.util.Locale[v0_3.size()];
                    v0_8 = new m0.h(new m0.i(new android.os.LocaleList(((java.util.Locale[]) v0_3.toArray(v1_2)))));
                } else {
                    v0_8 = m0.h.b;
                }
                if (!v0_8.b()) {
                    return v0_8;
                } else {
                    return v5_2;
                }
            }
        }
        return 0;
    }

    public static android.content.res.Configuration w(android.content.Context p1, int p2, m0.h p3, android.content.res.Configuration p4, boolean p5)
    {
        int v1_4;
        if (p2 == 1) {
            v1_4 = 16;
        } else {
            if (p2 == 2) {
                v1_4 = 32;
            } else {
                if (p5 == 0) {
                    v1_4 = (p1.getApplicationContext().getResources().getConfiguration().uiMode & 48);
                } else {
                    v1_4 = 0;
                }
            }
        }
        android.content.res.Configuration v2_2 = new android.content.res.Configuration();
        v2_2.fontScale = 0;
        if (p4 != 0) {
            v2_2.setTo(p4);
        }
        v2_2.uiMode = (v1_4 | (v2_2.uiMode & -49));
        if (p3 != null) {
            h.u.d(v2_2, p3);
        }
        return v2_2;
    }

    public final void A()
    {
        if (this.r == null) {
            IllegalStateException v0_3 = this.p;
            if ((v0_3 instanceof android.app.Activity)) {
                this.r(((android.app.Activity) v0_3).getWindow());
            }
        }
        if (this.r == null) {
            throw new IllegalStateException("We have not been given a Window");
        } else {
            return;
        }
    }

    public final h.z B(android.content.Context p4)
    {
        if (this.d0 == null) {
            if (b8.g.e == null) {
                b8.g v4_3 = p4.getApplicationContext();
                b8.g.e = new b8.g(v4_3, ((android.location.LocationManager) v4_3.getSystemService("location")));
            }
            this.d0 = new h.y(this, b8.g.e);
        }
        return this.d0;
    }

    public final h.b0 C(int p5)
    {
        h.b0 v0 = this.S;
        if ((v0 == null) || (v0.length <= p5)) {
            h.b0 v2_4 = new h.b0[(p5 + 1)];
            if (v0 != null) {
                System.arraycopy(v0, 0, v2_4, 0, v0.length);
            }
            this.S = v2_4;
            v0 = v2_4;
        }
        h.b0 v2_0 = v0[p5];
        if (v2_0 == null) {
            v2_0 = new h.b0();
            v2_0.a = p5;
            v2_0.n = 0;
            v0[p5] = v2_0;
        }
        return v2_0;
    }

    public final void D()
    {
        this.z();
        if ((this.M) && (this.u == null)) {
            android.app.Dialog v0_5 = this.p;
            if (!(v0_5 instanceof android.app.Activity)) {
                if ((v0_5 instanceof android.app.Dialog)) {
                    this.u = new h.n0(((android.app.Dialog) v0_5));
                }
            } else {
                this.u = new h.n0(((android.app.Activity) v0_5), this.N);
            }
            android.app.Dialog v0_3 = this.u;
            if (v0_3 != null) {
                v0_3.Z(this.i0);
            }
        }
        return;
    }

    public final void E(int p3)
    {
        this.g0 = ((1 << p3) | this.g0);
        if (!this.f0) {
            this.r.getDecorView().postOnAnimation(this.h0);
            this.f0 = 1;
        }
        return;
    }

    public final int F(android.content.Context p3, int p4)
    {
        if (p4 != -100) {
            if (p4 != -1) {
                if (p4 == null) {
                    if (((android.app.UiModeManager) p3.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return this.B(p3).e();
                    }
                    return -1;
                } else {
                    if ((p4 != 1) && (p4 != 2)) {
                        if (p4 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        } else {
                            if (this.e0 == null) {
                                this.e0 = new h.y(this, p3);
                            }
                            return this.e0.e();
                        }
                    }
                }
            }
            return p4;
        }
        return -1;
    }

    public final boolean G()
    {
        m.o v0_0 = this.U;
        this.U = 0;
        m.o v2_5 = this.C(0);
        if (!v2_5.m) {
            m.o v0_7 = this.A;
            if (v0_7 == null) {
                this.D();
                m.o v0_1 = this.u;
                if (v0_1 != null) {
                    m.o v0_2 = v0_1.j;
                    if (v0_2 != null) {
                        m.o v2_3 = ((n.f3) v0_2).a.R;
                        if ((v2_3 != null) && (v2_3.b != null)) {
                            m.o v0_6;
                            m.o v0_5 = ((n.f3) v0_2).a.R;
                            if (v0_5 != null) {
                                v0_6 = v0_5.b;
                            } else {
                                v0_6 = 0;
                            }
                            if (v0_6 == null) {
                                return 1;
                            } else {
                                v0_6.collapseActionView();
                                return 1;
                            }
                        }
                    }
                }
                return 0;
            } else {
                v0_7.a();
                return 1;
            }
        } else {
            if (v0_0 == null) {
                this.v(v2_5, 1);
                return 1;
            }
        }
        return 1;
    }

    public final void H(h.b0 p18, android.view.KeyEvent p19)
    {
        int v3 = p18.a;
        if ((!p18.m) && (!this.X)) {
            android.view.View v2_34 = this.q;
            if ((v3 != 0) || ((v2_34.getResources().getConfiguration().screenLayout & 15) != 4)) {
                android.view.WindowManager v4_5 = this.r.getCallback();
                if ((v4_5 == null) || (v4_5.onMenuOpened(v3, p18.h))) {
                    android.view.WindowManager v4_9 = ((android.view.WindowManager) v2_34.getSystemService("window"));
                    if ((v4_9 != null) && (this.J(p18, p19))) {
                        int v10_1;
                        h.a0 v6_24 = p18.e;
                        if ((v6_24 != null) && (!p18.n)) {
                            android.view.View v2_27 = p18.g;
                            if (v2_27 == null) {
                                v10_1 = -2;
                            } else {
                                android.view.View v2_28 = v2_27.getLayoutParams();
                                if ((v2_28 == null) || (v2_28.width != -1)) {
                                } else {
                                    v10_1 = -1;
                                }
                            }
                        } else {
                            if (v6_24 != null) {
                                if ((p18.n) && (v6_24.getChildCount() > 0)) {
                                    p18.e.removeAllViews();
                                }
                            } else {
                                h.a0 v6_27;
                                this.D();
                                h.a0 v6_26 = this.u;
                                if (v6_26 == null) {
                                    v6_27 = 0;
                                } else {
                                    v6_27 = v6_26.X();
                                }
                                if (v6_27 != null) {
                                    v2_34 = v6_27;
                                }
                                h.a0 v6_29 = new android.util.TypedValue();
                                android.view.View v9_13 = v2_34.getResources().newTheme();
                                v9_13.setTo(v2_34.getTheme());
                                v9_13.resolveAttribute(2130968581, v6_29, 1);
                                int v10_4 = v6_29.resourceId;
                                if (v10_4 != 0) {
                                    v9_13.applyStyle(v10_4, 1);
                                }
                                v9_13.resolveAttribute(2130969607, v6_29, 1);
                                h.a0 v6_30 = v6_29.resourceId;
                                if (v6_30 == null) {
                                    v9_13.applyStyle(2132017790, 1);
                                } else {
                                    v9_13.applyStyle(v6_30, 1);
                                }
                                h.a0 v6_33 = new l.c(v2_34, 0);
                                v6_33.getTheme().setTo(v9_13);
                                p18.j = v6_33;
                                android.view.View v2_37 = v6_33.obtainStyledAttributes(g.a.j);
                                p18.b = v2_37.getResourceId(86, 0);
                                p18.d = v2_37.getResourceId(1, 0);
                                v2_37.recycle();
                                p18.e = new h.a0(this, p18.j);
                                p18.c = 81;
                            }
                            android.view.View v2_3 = p18.g;
                            if (v2_3 == null) {
                                if (p18.h != null) {
                                    if (this.z == null) {
                                        this.z = new h.r(this, 3);
                                    }
                                    android.view.View v2_8 = this.z;
                                    if (p18.i == null) {
                                        h.a0 v6_5 = new m.i(p18.j);
                                        p18.i = v6_5;
                                        v6_5.e = v2_8;
                                        android.view.View v2_9 = p18.h;
                                        v2_9.b(v6_5, v2_9.a);
                                    }
                                    android.view.View v2_10 = p18.i;
                                    if (v2_10.d == null) {
                                        v2_10.d = ((androidx.appcompat.view.menu.ExpandedMenuView) v2_10.b.inflate(2131558413, p18.e, 0));
                                        if (v2_10.f == null) {
                                            v2_10.f = new m.h(v2_10);
                                        }
                                        v2_10.d.setAdapter(v2_10.f);
                                        v2_10.d.setOnItemClickListener(v2_10);
                                    }
                                    android.view.View v2_11 = v2_10.d;
                                    p18.f = v2_11;
                                    if (v2_11 != null) {
                                        if (p18.f != null) {
                                            if (p18.g == null) {
                                                android.view.View v2_14 = p18.i;
                                                if (v2_14.f == null) {
                                                    v2_14.f = new m.h(v2_14);
                                                }
                                                if (v2_14.f.getCount() <= 0) {
                                                    p18.n = 1;
                                                    return;
                                                }
                                            }
                                            android.view.View v2_18 = p18.f.getLayoutParams();
                                            if (v2_18 == null) {
                                                v2_18 = new android.view.ViewGroup$LayoutParams(-2, -2);
                                            }
                                            p18.e.setBackgroundResource(p18.b);
                                            h.a0 v6_19 = p18.f.getParent();
                                            if ((v6_19 instanceof android.view.ViewGroup)) {
                                                ((android.view.ViewGroup) v6_19).removeView(p18.f);
                                            }
                                            p18.e.addView(p18.f, v2_18);
                                            if (p18.f.hasFocus()) {
                                            } else {
                                                p18.f.requestFocus();
                                            }
                                        }
                                    }
                                }
                            } else {
                                p18.f = v2_3;
                            }
                        }
                        p18.l = 0;
                        android.view.View v9_10 = new android.view.WindowManager$LayoutParams(v10_1, -2, 0, 0, 1002, 8519680, -3);
                        v9_10.gravity = p18.c;
                        v9_10.windowAnimations = p18.d;
                        v4_9.addView(p18.e, v9_10);
                        p18.m = 1;
                        if (v3 != 0) {
                            return;
                        } else {
                            this.L();
                            return;
                        }
                    }
                } else {
                    this.v(p18, 1);
                    return;
                }
            }
        }
        return;
    }

    public final boolean I(h.b0 p3, int p4, android.view.KeyEvent p5)
    {
        boolean v1 = 0;
        if (!p5.isSystem()) {
            if ((p3.k) || (this.J(p3, p5))) {
                m.m v3_1 = p3.h;
                if (v3_1 != null) {
                    v1 = v3_1.performShortcut(p4, p5, 1);
                }
            }
            return v1;
        } else {
            return 0;
        }
    }

    public final boolean J(h.b0 p13, android.view.KeyEvent p14)
    {
        if (!this.X) {
            boolean v2_4 = p13.a;
            if (!p13.k) {
                m.m v0_8 = this.T;
                if ((v0_8 != null) && (v0_8 != p13)) {
                    this.v(v0_8, 0);
                }
                m.m v0_3 = this.r.getCallback();
                if (v0_3 != null) {
                    p13.g = v0_3.onCreatePanelView(v2_4);
                }
                if ((v2_4) && (v2_4 != 108)) {
                    int v5 = 0;
                } else {
                    v5 = 1;
                }
                if (v5 != 0) {
                    l.c v6_3 = this.x;
                    if (v6_3 != null) {
                        l.c v6_4 = ((androidx.appcompat.widget.ActionBarOverlayLayout) v6_3);
                        v6_4.k();
                        ((n.f3) v6_4.e).l = 1;
                    }
                }
                if (p13.g == null) {
                    l.c v6_8 = p13.h;
                    if ((v6_8 == null) || (p13.o)) {
                        if (v6_8 == null) {
                            l.c v6_9 = this.q;
                            if (((!v2_4) || (v2_4 == 108)) && (this.x != null)) {
                                android.content.res.Resources$Theme v9_2;
                                l.c v4_9 = new android.util.TypedValue();
                                android.content.Context v8_3 = v6_9.getTheme();
                                v8_3.resolveAttribute(2130968588, v4_9, 1);
                                if (v4_9.resourceId == 0) {
                                    v8_3.resolveAttribute(2130968589, v4_9, 1);
                                    v9_2 = 0;
                                } else {
                                    v9_2 = v6_9.getResources().newTheme();
                                    v9_2.setTo(v8_3);
                                    v9_2.applyStyle(v4_9.resourceId, 1);
                                    v9_2.resolveAttribute(2130968589, v4_9, 1);
                                }
                                if (v4_9.resourceId != 0) {
                                    if (v9_2 == null) {
                                        v9_2 = v6_9.getResources().newTheme();
                                        v9_2.setTo(v8_3);
                                    }
                                    v9_2.applyStyle(v4_9.resourceId, 1);
                                }
                                if (v9_2 != null) {
                                    l.c v4_12 = new l.c(v6_9, 0);
                                    v4_12.getTheme().setTo(v9_2);
                                    v6_9 = v4_12;
                                }
                            }
                            l.c v4_14 = new m.m(v6_9);
                            v4_14.e = this;
                            l.c v6_11 = p13.h;
                            if (v4_14 != v6_11) {
                                if (v6_11 != null) {
                                    v6_11.r(p13.i);
                                }
                                p13.h = v4_14;
                                l.c v6_12 = p13.i;
                                if (v6_12 != null) {
                                    v4_14.b(v6_12, v4_14.a);
                                }
                            }
                            if (p13.h == null) {
                                return 0;
                            }
                        }
                        if (v5 != 0) {
                            l.c v4_16 = this.x;
                            if (v4_16 != null) {
                                if (this.y == null) {
                                    this.y = new h.r(this, 2);
                                }
                                ((androidx.appcompat.widget.ActionBarOverlayLayout) v4_16).l(p13.h, this.y);
                            }
                        }
                        p13.h.w();
                        if (v0_3.onCreatePanelMenu(v2_4, p13.h)) {
                            p13.o = 0;
                        } else {
                            h.r v14_8 = p13.h;
                            if (v14_8 != null) {
                                if (v14_8 != null) {
                                    v14_8.r(p13.i);
                                }
                                p13.h = 0;
                            }
                            if (v5 == 0) {
                                return 0;
                            } else {
                                androidx.appcompat.widget.ActionBarOverlayLayout v13_2 = this.x;
                                if (v13_2 == null) {
                                    return 0;
                                } else {
                                    ((androidx.appcompat.widget.ActionBarOverlayLayout) v13_2).l(0, this.y);
                                    return 0;
                                }
                            }
                        }
                    }
                    p13.h.w();
                    boolean v2_2 = p13.p;
                    if (v2_2) {
                        p13.h.s(v2_2);
                        p13.p = 0;
                    }
                    if (v0_3.onPreparePanel(0, p13.g, p13.h)) {
                        h.r v14_1;
                        if (p14 == null) {
                            v14_1 = -1;
                        } else {
                            v14_1 = p14.getDeviceId();
                        }
                        h.r v14_4;
                        if (android.view.KeyCharacterMap.load(v14_1).getKeyboardType() == 1) {
                            v14_4 = 0;
                        } else {
                            v14_4 = 1;
                        }
                        p13.h.setQwertyMode(v14_4);
                        p13.h.v();
                    } else {
                        if (v5 != 0) {
                            h.r v14_6 = this.x;
                            if (v14_6 != null) {
                                ((androidx.appcompat.widget.ActionBarOverlayLayout) v14_6).l(0, this.y);
                            }
                        }
                        p13.h.v();
                        return 0;
                    }
                }
                p13.k = 1;
                p13.l = 0;
                this.T = p13;
                return 1;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public final void K()
    {
        if (this.G) {
            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
        } else {
            return;
        }
    }

    public final void L()
    {
        if (android.os.Build$VERSION.SDK_INT >= 33) {
            android.window.OnBackInvokedDispatcher v1_1 = 0;
            if ((this.m0 != null) && ((this.C(0).m) || (this.A != null))) {
                v1_1 = 1;
            }
            if ((v1_1 == null) || (this.n0 != null)) {
                if (v1_1 == null) {
                    int v0_3 = this.n0;
                    if (v0_3 != 0) {
                        h.w.c(this.m0, v0_3);
                        this.n0 = 0;
                    }
                }
            } else {
                this.n0 = h.w.b(this.m0, this);
                return;
            }
        }
        return;
    }

    public final boolean b(m.m p8, android.view.MenuItem p9)
    {
        android.view.Window$Callback v0_1 = this.r.getCallback();
        if ((v0_1 != null) && (!this.X)) {
            int v3;
            boolean v8_3 = p8.k();
            h.b0[] v2_1 = this.S;
            if (v2_1 == null) {
                v3 = 0;
            } else {
                v3 = v2_1.length;
            }
            int v4 = 0;
            while (v4 < v3) {
                int v5 = v2_1[v4];
                if ((v5 == 0) || (v5.h != v8_3)) {
                    v4++;
                }
                if (v5 != 0) {
                    return v0_1.onMenuItemSelected(v5.a, p9);
                }
            }
            v5 = 0;
        }
        return 0;
    }

    public final void d()
    {
        String v0_2 = android.view.LayoutInflater.from(this.q);
        if (v0_2.getFactory() != null) {
            if (!(v0_2.getFactory2() instanceof h.c0)) {
                android.util.Log.i("AppCompatDelegate", "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s");
            }
            return;
        } else {
            v0_2.setFactory2(this);
            return;
        }
    }

    public final void e()
    {
        if (this.u != null) {
            this.D();
            this.u.getClass();
            this.E(0);
        }
        return;
    }

    public final void f(m.m p6)
    {
        n.k v6_0 = this.x;
        if (v6_0 != null) {
            n.k v6_15 = ((androidx.appcompat.widget.ActionBarOverlayLayout) v6_0);
            v6_15.k();
            n.k v6_20 = ((n.f3) v6_15.e).a;
            if (v6_20.getVisibility() == 0) {
                n.k v6_1 = v6_20.a;
                if ((v6_1 != null) && (v6_1.y)) {
                    if (android.view.ViewConfiguration.get(this.q).hasPermanentMenuKey()) {
                        n.k v6_7 = ((androidx.appcompat.widget.ActionBarOverlayLayout) this.x);
                        v6_7.k();
                        n.k v6_11 = ((n.f3) v6_7.e).a.a;
                        if (v6_11 == null) {
                            n.k v6_14 = this.C(0);
                            v6_14.n = 1;
                            this.v(v6_14, 0);
                            this.H(v6_14, 0);
                            return;
                        } else {
                            n.k v6_12 = v6_11.z;
                            if ((v6_12 == null) || ((v6_12.A == null) && (!v6_12.f()))) {
                                v6_14 = this.C(0);
                                v6_14.n = 1;
                                this.v(v6_14, 0);
                                this.H(v6_14, 0);
                                return;
                            }
                        }
                    }
                    n.k v6_17 = this.r.getCallback();
                    h.q v2_3 = ((androidx.appcompat.widget.ActionBarOverlayLayout) this.x);
                    v2_3.k();
                    h.q v2_7 = ((n.f3) v2_3.e).a.a;
                    if (v2_7 == null) {
                        if ((v6_17 != null) && (!this.X)) {
                            if ((this.f0) && ((1 & this.g0) != 0)) {
                                h.q v2_13 = this.h0;
                                this.r.getDecorView().removeCallbacks(v2_13);
                                v2_13.run();
                            }
                            m.m v0_13 = this.C(0);
                            h.q v2_14 = v0_13.h;
                            if ((v2_14 != null) && ((!v0_13.o) && (v6_17.onPreparePanel(0, v0_13.g, v2_14)))) {
                                v6_17.onMenuOpened(108, v0_13.h);
                                n.k v6_22 = ((androidx.appcompat.widget.ActionBarOverlayLayout) this.x);
                                v6_22.k();
                                n.k v6_26 = ((n.f3) v6_22.e).a.a;
                                if (v6_26 != null) {
                                    n.k v6_27 = v6_26.z;
                                    if (v6_27 != null) {
                                        v6_27.l();
                                    }
                                }
                            }
                        }
                    } else {
                        h.q v2_8 = v2_7.z;
                        if ((v2_8 == null) || (!v2_8.f())) {
                        } else {
                            m.m v0_16 = ((androidx.appcompat.widget.ActionBarOverlayLayout) this.x);
                            v0_16.k();
                            m.m v0_4 = ((n.f3) v0_16.e).a.a;
                            if (v0_4 != null) {
                                m.m v0_5 = v0_4.z;
                                if (v0_5 != null) {
                                    v0_5.c();
                                }
                            }
                            if (!this.X) {
                                v6_17.onPanelClosed(108, this.C(0).h);
                                return;
                            }
                        }
                    }
                    return;
                }
            }
        }
        v6_14 = this.C(0);
        v6_14.n = 1;
        this.v(v6_14, 0);
        this.H(v6_14, 0);
        return;
    }

    public final void h()
    {
        this.V = 1;
        this.q(0, 1);
        this.A();
        Object v1_6 = this.p;
        if ((v1_6 instanceof android.app.Activity)) {
            try {
                Object v1_7 = ((android.app.Activity) v1_6);
                try {
                    Object v1_0 = d0.d.c(v1_7, v1_7.getComponentName());
                } catch (Object v1_1) {
                    throw new IllegalArgumentException(v1_1);
                }
                if (v1_0 != null) {
                    Object v1_2 = this.u;
                    if (v1_2 != null) {
                        v1_2.Z(1);
                    } else {
                        this.i0 = 1;
                    }
                }
                try {
                    h.p.j(this);
                    h.p.m.add(new ref.WeakReference(this));
                } catch (Throwable v0_1) {
                    throw v0_1;
                }
            } catch (IllegalArgumentException) {
                v1_0 = 0;
            }
        }
        this.Y = new android.content.res.Configuration(this.q.getResources().getConfiguration());
        this.W = 1;
        return;
    }

    public final void i()
    {
        if ((this.p instanceof android.app.Activity)) {
            try {
                h.p.j(this);
            } catch (String v1_9) {
                throw v1_9;
            }
        }
        if (this.f0) {
            this.r.getDecorView().removeCallbacks(this.h0);
        }
        this.X = 1;
        if (this.Z == -100) {
            h.c0.o0.remove(this.p.getClass().getName());
        } else {
            h.y v0_5 = this.p;
            if ((!(v0_5 instanceof android.app.Activity)) || (!((android.app.Activity) v0_5).isChangingConfigurations())) {
            } else {
                h.c0.o0.put(this.p.getClass().getName(), Integer.valueOf(this.Z));
            }
        }
        h.y v0_10 = this.d0;
        if (v0_10 != null) {
            v0_10.c();
        }
        h.y v0_11 = this.e0;
        if (v0_11 != null) {
            v0_11.c();
        }
        return;
    }

    public final boolean k(int p6)
    {
        if (p6 != 8) {
            if (p6 == 9) {
                android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
                p6 = 109;
            }
        } else {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            p6 = 108;
        }
        if ((!this.Q) || (p6 != 108)) {
            if ((this.M) && (p6 == 1)) {
                this.M = 0;
            }
            if (p6 == 1) {
                this.K();
                this.Q = 1;
                return 1;
            } else {
                if (p6 == 2) {
                    this.K();
                    this.K = 1;
                    return 1;
                } else {
                    if (p6 == 5) {
                        this.K();
                        this.L = 1;
                        return 1;
                    } else {
                        if (p6 == 10) {
                            this.K();
                            this.O = 1;
                            return 1;
                        } else {
                            if (p6 == 108) {
                                this.K();
                                this.M = 1;
                                return 1;
                            } else {
                                if (p6 == 109) {
                                    this.K();
                                    this.N = 1;
                                    return 1;
                                } else {
                                    return this.r.requestFeature(p6);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return 0;
        }
    }

    public final void l(int p3)
    {
        this.z();
        android.view.Window$Callback v0_4 = ((android.view.ViewGroup) this.H.findViewById(16908290));
        v0_4.removeAllViews();
        android.view.LayoutInflater.from(this.q).inflate(p3, v0_4);
        this.s.a(this.r.getCallback());
        return;
    }

    public final void m(android.view.View p3)
    {
        this.z();
        android.view.Window$Callback v0_3 = ((android.view.ViewGroup) this.H.findViewById(16908290));
        v0_3.removeAllViews();
        v0_3.addView(p3);
        this.s.a(this.r.getCallback());
        return;
    }

    public final void n(android.view.View p3, android.view.ViewGroup$LayoutParams p4)
    {
        this.z();
        android.view.ViewGroup v0_2 = ((android.view.ViewGroup) this.H.findViewById(16908290));
        v0_2.removeAllViews();
        v0_2.addView(p3, p4);
        this.s.a(this.r.getCallback());
        return;
    }

    public final void o(CharSequence p4)
    {
        this.w = p4;
        android.view.View v0_0 = this.x;
        if (v0_0 == null) {
            android.view.View v0_3 = this.u;
            if (v0_3 == null) {
                android.view.View v0_4 = this.I;
                if (v0_4 != null) {
                    v0_4.setText(p4);
                }
            } else {
                android.view.View v0_6 = ((n.f3) v0_3.j);
                if (!v0_6.g) {
                    androidx.appcompat.widget.Toolbar v1_1 = v0_6.a;
                    v0_6.h = p4;
                    if ((v0_6.b & 8) != 0) {
                        v1_1.setTitle(p4);
                        if (v0_6.g) {
                            q0.q0.o(v1_1.getRootView(), p4);
                            return;
                        }
                    }
                }
            }
            return;
        } else {
            v0_0.setWindowTitle(p4);
            return;
        }
    }

    public final android.view.View onCreateView(android.view.View p9, String p10, android.content.Context p11, android.util.AttributeSet p12)
    {
        int v1 = 0;
        if (this.l0 == null) {
            Throwable v0_5 = this.q;
            android.content.res.TypedArray v9_24 = v0_5.obtainStyledAttributes(g.a.j);
            q0.e0 v2_45 = v9_24.getString(116);
            v9_24.recycle();
            if (v2_45 != null) {
                try {
                    this.l0 = ((h.h0) v0_5.getClassLoader().loadClass(v2_45).getDeclaredConstructor(v1).newInstance(0));
                } catch (Throwable v0_1) {
                    android.content.res.TypedArray v9_10 = v0_1;
                    Throwable v0_3 = new StringBuilder("Failed to instantiate custom view inflater ");
                    v0_3.append(v2_45);
                    v0_3.append(". Falling back to default.");
                    android.util.Log.i("AppCompatDelegate", v0_3.toString(), v9_10);
                    this.l0 = new h.h0();
                }
            } else {
                this.l0 = new h.h0();
            }
        }
        android.content.res.TypedArray v9_23 = this.l0;
        Class vtmp3 = v9_23.getClass();
        Throwable v0_7 = p11.obtainStyledAttributes(p12, g.a.y, 0, 0);
        q0.e0 v2_0 = 4;
        int v3_9 = v0_7.getResourceId(4, 0);
        if (v3_9 != 0) {
            android.util.Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        Throwable v0_12;
        v0_7.recycle();
        if ((v3_9 == 0) || (((p11 instanceof l.c)) && (((l.c) p11).a == v3_9))) {
            v0_12 = p11;
        } else {
            v0_12 = new l.c(p11, v3_9);
        }
        p10.getClass();
        switch (p10.hashCode()) {
            case -1946472170:
                if (p10.equals("RatingBar")) {
                    v2_0 = 0;
                } else {
                    v2_0 = -1;
                }
                break;
            case -1455429095:
                if (p10.equals("CheckedTextView")) {
                    v2_0 = 1;
                } else {
                }
                break;
            case -1346021293:
                if (p10.equals("MultiAutoCompleteTextView")) {
                    v2_0 = 2;
                } else {
                }
                break;
            case -938935918:
                if (p10.equals("TextView")) {
                    v2_0 = 3;
                } else {
                }
                break;
            case -937446323:
                if (p10.equals("ImageButton")) {
                } else {
                }
                break;
            case -658531749:
                if (p10.equals("SeekBar")) {
                    v2_0 = 5;
                } else {
                }
                break;
            case -339785223:
                if (p10.equals("Spinner")) {
                    v2_0 = 6;
                } else {
                }
                break;
            case 776382189:
                if (p10.equals("RadioButton")) {
                    v2_0 = 7;
                } else {
                }
                break;
            case 799298502:
                if (p10.equals("ToggleButton")) {
                    v2_0 = 8;
                } else {
                }
                break;
            case 1125864064:
                if (p10.equals("ImageView")) {
                    v2_0 = 9;
                } else {
                }
                break;
            case 1413872058:
                if (p10.equals("AutoCompleteTextView")) {
                    v2_0 = 10;
                } else {
                }
                break;
            case 1601505219:
                if (p10.equals("CheckBox")) {
                    v2_0 = 11;
                } else {
                }
                break;
            case 1666676343:
                if (p10.equals("EditText")) {
                    v2_0 = 12;
                } else {
                }
                break;
            case 2001146706:
                if (p10.equals("Button")) {
                    v2_0 = 13;
                } else {
                }
                break;
            default:
        }
        q0.e0 v2_15;
        switch (v2_0) {
            case 0:
                v2_15 = new n.e0(v0_12, p12);
                break;
            case 1:
                v2_15 = new n.s(v0_12, p12);
                break;
            case 2:
                v2_15 = new n.a0(v0_12, p12);
                break;
            case 3:
                v2_15 = v9_23.e(v0_12, p12);
                break;
            case 4:
                v2_15 = new n.y(v0_12, p12, 2130969254);
                break;
            case 5:
                v2_15 = new n.g0(v0_12, p12);
                break;
            case 6:
                v2_15 = new n.r0(v0_12, p12);
                break;
            case 7:
                v2_15 = v9_23.d(v0_12, p12);
                break;
            case 8:
                v2_15 = new n.h1(v0_12, p12);
                break;
            case 9:
                v2_15 = new n.z(v0_12, p12, 0);
                break;
            case 10:
                v2_15 = v9_23.a(v0_12, p12);
                break;
            case 11:
                v2_15 = v9_23.c(v0_12, p12);
                break;
            case 12:
                v2_15 = new n.w(v0_12, p12);
                break;
            case 13:
                v2_15 = v9_23.b(v0_12, p12);
                break;
            default:
                v2_15 = 0;
        }
        if ((v2_15 != null) || (p11 == v0_12)) {
            v1 = v2_15;
        } else {
            java.util.WeakHashMap v11_1 = v9_23.a;
            if (p10.equals("view")) {
                p10 = p12.getAttributeValue(0, "class");
            }
            try {
                v11_1[0] = v0_12;
                v11_1[1] = p12;
            } catch (Exception) {
                v11_1[0] = v1;
                v11_1[1] = v1;
            } catch (Throwable v0_0) {
                android.content.res.TypedArray v9_6 = v0_0;
                v11_1[0] = v1;
                v11_1[1] = v1;
                throw v9_6;
            }
            if (-1 != p10.indexOf(46)) {
                android.content.res.TypedArray v9_5 = v9_23.f(v0_12, p10, 0);
                v11_1[0] = 0;
                v11_1[1] = 0;
                v1 = v9_5;
            } else {
                q0.e0 v2_29 = 0;
                while (v2_29 < 3) {
                    int v3_5 = v9_23.f(v0_12, p10, h.h0.g[v2_29]);
                    if (v3_5 == 0) {
                        v2_29++;
                    } else {
                        v11_1[0] = 0;
                        v11_1[1] = 0;
                        v1 = v3_5;
                    }
                }
                v11_1[0] = 0;
                v11_1[1] = 0;
            }
        }
        if (v1 != 0) {
            android.content.res.TypedArray v9_8 = v1.getContext();
            if (((v9_8 instanceof android.content.ContextWrapper)) && (v1.hasOnClickListeners())) {
                android.content.res.TypedArray v9_9 = v9_8.obtainStyledAttributes(p12, h.h0.c);
                Boolean v10_5 = v9_9.getString(0);
                if (v10_5 != null) {
                    v1.setOnClickListener(new h.g0(v1, v10_5));
                }
                v9_9.recycle();
            }
            if (android.os.Build$VERSION.SDK_INT <= 28) {
                android.content.res.TypedArray v9_13 = v0_12.obtainStyledAttributes(p12, h.h0.d);
                if (v9_13.hasValue(0)) {
                    new q0.e0(2131362477, Boolean, 0, 28, 3).g(v1, Boolean.valueOf(v9_13.getBoolean(0, 0)));
                }
                v9_13.recycle();
                android.content.res.TypedArray v9_15 = v0_12.obtainStyledAttributes(p12, h.h0.e);
                if (v9_15.hasValue(0)) {
                    q0.q0.o(v1, v9_15.getString(0));
                }
                v9_15.recycle();
                android.content.res.TypedArray v9_17 = v0_12.obtainStyledAttributes(p12, h.h0.f);
                if (v9_17.hasValue(0)) {
                    new q0.e0(2131362483, Boolean, 0, 28, 0).g(v1, Boolean.valueOf(v9_17.getBoolean(0, 0)));
                }
                v9_17.recycle();
            }
        }
        return v1;
    }

    public final android.view.View onCreateView(String p2, android.content.Context p3, android.util.AttributeSet p4)
    {
        return this.onCreateView(0, p2, p3, p4);
    }

    public final boolean q(boolean p13, boolean p14)
    {
        androidx.lifecycle.o v1_0 = 0;
        if (!this.X) {
            int v2 = this.Z;
            if (v2 == -100) {
                v2 = h.p.b;
            }
            m0.h v5_1;
            android.content.Context v0_2 = this.q;
            int v3_13 = this.F(v0_2, v2);
            androidx.lifecycle.g0 v4_0 = android.os.Build$VERSION.SDK_INT;
            if (v4_0 >= 33) {
                v5_1 = 0;
            } else {
                v5_1 = h.c0.s(v0_2);
            }
            if ((p14 == null) && (v5_1 != null)) {
                v5_1 = h.u.b(v0_2.getResources().getConfiguration());
            }
            int v3_12;
            android.os.Handler v14_9 = h.c0.w(v0_2, v3_13, v5_1, 0, 0);
            boolean v7 = 1;
            android.app.Activity v8_1 = this.p;
            if ((this.c0) || (!(v8_1 instanceof android.app.Activity))) {
                this.c0 = 1;
                v3_12 = this.b0;
            } else {
                int v3_8 = v0_2.getPackageManager();
                if (v3_8 != 0) {
                    androidx.lifecycle.g0 v4_4;
                    if (v4_0 < 29) {
                        v4_4 = 786432;
                    } else {
                        v4_4 = 269221888;
                    }
                    try {
                        int v3_9 = v3_8.getActivityInfo(new android.content.ComponentName(v0_2, v8_1.getClass()), v4_4);
                    } catch (int v3_10) {
                        android.util.Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", v3_10);
                        this.b0 = 0;
                    }
                    if (v3_9 == 0) {
                    } else {
                        this.b0 = v3_9.configChanges;
                    }
                } else {
                    v3_12 = 0;
                }
            }
            androidx.lifecycle.g0 v4_6 = this.Y;
            if (v4_6 == null) {
                v4_6 = v0_2.getResources().getConfiguration();
            }
            m0.h v5_2;
            int v9_5 = (v4_6.uiMode & 48);
            Class v10_2 = (v14_9.uiMode & 48);
            androidx.lifecycle.g0 v4_8 = h.u.b(v4_6);
            if (v5_1 != null) {
                v5_2 = h.u.b(v14_9);
            } else {
                v5_2 = 0;
            }
            int v9_6;
            if (v9_5 == v10_2) {
                v9_6 = 0;
            } else {
                v9_6 = 512;
            }
            if ((v5_2 != null) && (!v4_8.equals(v5_2))) {
                v9_6 |= 8196;
            }
            if (((((~ v3_12) & v9_6) == 0) || ((!p13) || ((!this.V) || ((!h.c0.q0) && (!this.W))))) || (!(v8_1 instanceof android.app.Activity))) {
                boolean v13_1 = 0;
            } else {
                boolean v13_32 = ((android.app.Activity) v8_1);
                if (v13_32.isChild()) {
                } else {
                    androidx.lifecycle.g0 v4_13 = android.os.Build$VERSION.SDK_INT;
                    if ((v4_13 >= 31) && ((v9_6 & 8192) != 0)) {
                        v13_32.getWindow().getDecorView().setLayoutDirection(v14_9.getLayoutDirection());
                    }
                    if (v4_13 < 28) {
                        new android.os.Handler(v13_32.getMainLooper()).post(new androidx.lifecycle.g0(v13_32, 3));
                    } else {
                        v13_32.recreate();
                    }
                    v13_1 = 1;
                }
            }
            if ((v13_1) || (v9_6 == 0)) {
                v7 = v13_1;
            } else {
                if ((v9_6 & v3_12) == v9_6) {
                    v1_0 = 1;
                }
                boolean v13_3 = v0_2.getResources();
                android.os.Handler v14_6 = new android.content.res.Configuration(v13_3.getConfiguration());
                v14_6.uiMode = ((v13_3.getConfiguration().uiMode & -49) | v10_2);
                if (v5_2 != null) {
                    h.u.d(v14_6, v5_2);
                }
                v13_3.updateConfiguration(v14_6, 0);
                boolean v13_4 = this.a0;
                if (v13_4) {
                    v0_2.setTheme(v13_4);
                    v0_2.getTheme().applyStyle(this.a0, 1);
                }
                if ((v1_0 != null) && ((v8_1 instanceof android.app.Activity))) {
                    android.app.Activity v8_0 = ((android.app.Activity) v8_1);
                    if (!(v8_0 instanceof androidx.lifecycle.u)) {
                        if ((this.W) && (!this.X)) {
                            v8_0.onConfigurationChanged(v14_6);
                        }
                    } else {
                        if (((androidx.lifecycle.w) ((androidx.lifecycle.u) v8_0).getLifecycle()).c.compareTo(androidx.lifecycle.o.c) >= 0) {
                            v8_0.onConfigurationChanged(v14_6);
                        }
                    }
                }
            }
            if (v5_2 != null) {
                h.u.c(h.u.b(v0_2.getResources().getConfiguration()));
            }
            if (v2 != 0) {
                boolean v13_19 = this.d0;
                if (v13_19) {
                    v13_19.c();
                }
            } else {
                this.B(v0_2).h();
            }
            if (v2 != 3) {
                boolean v13_22 = this.e0;
                if (v13_22) {
                    v13_22.c();
                }
            } else {
                if (this.e0 == null) {
                    this.e0 = new h.y(this, v0_2);
                }
                this.e0.h();
            }
            return v7;
        } else {
            return 0;
        }
    }

    public final void r(android.view.Window p8)
    {
        if (this.r != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        } else {
            android.window.OnBackInvokedCallback v1_4 = p8.getCallback();
            if ((v1_4 instanceof h.x)) {
                throw new IllegalStateException("AppCompat has already installed itself into the Window");
            } else {
                android.app.Activity v0_4;
                android.app.Activity v0_2 = new h.x(this, v1_4);
                this.s = v0_2;
                p8.setCallback(v0_2);
                android.app.Activity v0_3 = this.q;
                android.window.OnBackInvokedCallback v1_2 = v0_3.obtainStyledAttributes(0, h.c0.p0);
                if (!v1_2.hasValue(0)) {
                    v0_4 = 0;
                } else {
                    int v3_1 = v1_2.getResourceId(0, 0);
                    if (v3_1 == 0) {
                    } else {
                        v0_4 = n.u.a().a.d(v0_3, v3_1, 1);
                    }
                }
                if (v0_4 != null) {
                    p8.setBackgroundDrawable(v0_4);
                }
                v1_2.recycle();
                this.r = p8;
                if (android.os.Build$VERSION.SDK_INT >= 33) {
                    android.window.OnBackInvokedDispatcher v8_7 = this.m0;
                    if (v8_7 == null) {
                        android.app.Activity v0_6 = this.p;
                        if (v8_7 != null) {
                            android.window.OnBackInvokedCallback v1_3 = this.n0;
                            if (v1_3 != null) {
                                h.w.c(v8_7, v1_3);
                                this.n0 = 0;
                            }
                        }
                        if (!(v0_6 instanceof android.app.Activity)) {
                            this.m0 = 0;
                        } else {
                            android.app.Activity v0_7 = ((android.app.Activity) v0_6);
                            if (v0_7.getWindow() == null) {
                            } else {
                                this.m0 = h.w.a(v0_7);
                            }
                        }
                        this.L();
                    }
                }
                return;
            }
        }
    }

    public final void t(int p4, h.b0 p5, m.m p6)
    {
        if (p6 == null) {
            if ((p5 == null) && (p4 >= null)) {
                android.view.Window$Callback v0_2 = this.S;
                if (p4 < v0_2.length) {
                    p5 = v0_2[p4];
                }
            }
            if (p5 != null) {
                p6 = p5.h;
            }
        }
        if (((p5 != null) && (!p5.m)) || (this.X)) {
            return;
        } else {
            android.view.Window$Callback v5_3 = this.s;
            android.view.Window$Callback v0_1 = this.r.getCallback();
            v5_3.getClass();
            try {
                v5_3.d = 1;
                v0_1.onPanelClosed(p4, p6);
                v5_3.d = 0;
                return;
            } catch (Throwable v4_1) {
                v5_3.d = 0;
                throw v4_1;
            }
        }
    }

    public final void u(m.m p3)
    {
        if (!this.R) {
            this.R = 1;
            m.u v0_9 = ((androidx.appcompat.widget.ActionBarOverlayLayout) this.x);
            v0_9.k();
            m.u v0_1 = ((n.f3) v0_9.e).a.a;
            if (v0_1 != null) {
                m.u v0_2 = v0_1.z;
                if (v0_2 != null) {
                    v0_2.c();
                    m.u v0_3 = v0_2.z;
                    if ((v0_3 != null) && (v0_3.b())) {
                        v0_3.i.dismiss();
                    }
                }
            }
            m.u v0_7 = this.r.getCallback();
            if ((v0_7 != null) && (!this.X)) {
                v0_7.onPanelClosed(108, p3);
            }
            this.R = 0;
            return;
        } else {
            return;
        }
    }

    public final void v(h.b0 p4, boolean p5)
    {
        if ((p5 != 0) && (p4.a == 0)) {
            boolean v0_7 = this.x;
            if (v0_7) {
                boolean v0_8 = ((androidx.appcompat.widget.ActionBarOverlayLayout) v0_7);
                v0_8.k();
                boolean v0_1 = ((n.f3) v0_8.e).a.a;
                if (v0_1) {
                    boolean v0_2 = v0_1.z;
                    if ((v0_2) && (v0_2.f())) {
                        this.u(p4.h);
                        return;
                    }
                }
            }
        }
        boolean v0_6 = ((android.view.WindowManager) this.q.getSystemService("window"));
        if ((v0_6) && (p4.m)) {
            h.a0 v2_1 = p4.e;
            if (v2_1 != null) {
                v0_6.removeView(v2_1);
                if (p5 != 0) {
                    this.t(p4.a, p4, 0);
                }
            }
        }
        p4.k = 0;
        p4.l = 0;
        p4.m = 0;
        p4.f = 0;
        p4.n = 1;
        if (this.T == p4) {
            this.T = 0;
        }
        if (p4.a == 0) {
            this.L();
        }
        return;
    }

    public final boolean x(android.view.KeyEvent p7)
    {
        String v0_0 = this.p;
        int v2 = 1;
        if ((!(v0_0 instanceof q0.k)) && (!(v0_0 instanceof h.e0))) {
            if (p7.getKeyCode() == 82) {
                String v0_7 = this.s;
                android.content.Context v4_1 = this.r.getCallback();
                v0_7.getClass();
                try {
                    v0_7.c = 1;
                    android.content.Context v4_2 = v4_1.dispatchKeyEvent(p7);
                    v0_7.c = 0;
                } catch (boolean v7_24) {
                    v0_7.c = 0;
                    throw v7_24;
                }
                if (v4_2 != null) {
                    return 1;
                }
            }
            String v0_8 = p7.getKeyCode();
            if (p7.getAction() != 0) {
                if (v0_8 == 4) {
                    if (this.G()) {
                        return 1;
                    }
                } else {
                    if (v0_8 == 82) {
                        if (this.A == null) {
                            boolean v7_17;
                            String v0_11 = this.C(0);
                            boolean v3_1 = this.x;
                            android.content.Context v4_4 = this.q;
                            if (!v3_1) {
                                boolean v3_10 = v0_11.m;
                                if ((!v3_10) && (!v0_11.l)) {
                                    if (!v0_11.k) {
                                        v7_17 = 0;
                                    } else {
                                        boolean v3_13;
                                        if (!v0_11.o) {
                                            v3_13 = 1;
                                        } else {
                                            v0_11.k = 0;
                                            v3_13 = this.J(v0_11, p7);
                                        }
                                        if (!v3_13) {
                                        } else {
                                            this.H(v0_11, p7);
                                            v7_17 = 1;
                                        }
                                    }
                                } else {
                                    this.v(v0_11, 1);
                                    v7_17 = v3_10;
                                }
                            } else {
                                boolean v3_2 = ((androidx.appcompat.widget.ActionBarOverlayLayout) v3_1);
                                v3_2.k();
                                boolean v3_5 = ((n.f3) v3_2.e).a;
                                if (v3_5.getVisibility() != 0) {
                                } else {
                                    boolean v3_6 = v3_5.a;
                                    if ((!v3_6) || ((!v3_6.y) || (android.view.ViewConfiguration.get(v4_4).hasPermanentMenuKey()))) {
                                    } else {
                                        boolean v3_15 = ((androidx.appcompat.widget.ActionBarOverlayLayout) this.x);
                                        v3_15.k();
                                        boolean v3_19 = ((n.f3) v3_15.e).a.a;
                                        if (v3_19) {
                                            boolean v3_20 = v3_19.z;
                                            if ((v3_20) && (v3_20.f())) {
                                                boolean v7_10 = ((androidx.appcompat.widget.ActionBarOverlayLayout) this.x);
                                                v7_10.k();
                                                boolean v7_14 = ((n.f3) v7_10.e).a.a;
                                                if (!v7_14) {
                                                } else {
                                                    boolean v7_15 = v7_14.z;
                                                    if ((!v7_15) || (!v7_15.c())) {
                                                    }
                                                }
                                            }
                                        }
                                        if ((this.X) || (!this.J(v0_11, p7))) {
                                        } else {
                                            boolean v7_2 = ((androidx.appcompat.widget.ActionBarOverlayLayout) this.x);
                                            v7_2.k();
                                            boolean v7_6 = ((n.f3) v7_2.e).a.a;
                                            if (!v7_6) {
                                            } else {
                                                boolean v7_7 = v7_6.z;
                                                if ((!v7_7) || (!v7_7.l())) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!v7_17) {
                                return 1;
                            } else {
                                boolean v7_20 = ((android.media.AudioManager) v4_4.getApplicationContext().getSystemService("audio"));
                                if (!v7_20) {
                                    android.util.Log.w("AppCompatDelegate", "Couldn\'t get audio manager");
                                    return 1;
                                } else {
                                    v7_20.playSoundEffect(0);
                                    return 1;
                                }
                            }
                        }
                    }
                }
            } else {
                if (v0_8 == 4) {
                    if ((p7.getFlags() & 128) == 0) {
                        v2 = 0;
                    }
                    this.U = v2;
                    return 0;
                } else {
                    if (v0_8 == 82) {
                        if (p7.getRepeatCount() == 0) {
                            String v0_6 = this.C(0);
                            if (!v0_6.m) {
                                this.J(v0_6, p7);
                                return 1;
                            }
                        }
                        return 1;
                    }
                }
            }
            return 0;
        } else {
            String v0_13 = this.r.getDecorView();
            if ((v0_13 == null) || (!q4.b.n(v0_13, p7))) {
            }
        }
        return 1;
    }

    public final void y(int p4)
    {
        h.b0 v0_0 = this.C(p4);
        if (v0_0.h != null) {
            m.m v1_5 = new android.os.Bundle();
            v0_0.h.t(v1_5);
            if (v1_5.size() > 0) {
                v0_0.p = v1_5;
            }
            v0_0.h.w();
            v0_0.h.clear();
        }
        v0_0.o = 1;
        v0_0.n = 1;
        if (((p4 == 108) || (p4 == 0)) && (this.x != null)) {
            h.b0 v0_2 = this.C(0);
            v0_2.k = 0;
            this.J(v0_2, 0);
        }
        return;
    }

    public final void z()
    {
        if (!this.G) {
            m.m v0_5 = this.q;
            boolean v1_11 = g.a.j;
            androidx.appcompat.widget.ContentFrameLayout v2_21 = v0_5.obtainStyledAttributes(v1_11);
            if (!v2_21.hasValue(117)) {
                v2_21.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            } else {
                if (!v2_21.getBoolean(126, 0)) {
                    if (v2_21.getBoolean(117, 0)) {
                        this.k(108);
                    }
                } else {
                    this.k(1);
                }
                if (v2_21.getBoolean(118, 0)) {
                    this.k(109);
                }
                if (v2_21.getBoolean(119, 0)) {
                    this.k(10);
                }
                androidx.appcompat.widget.ContentFrameLayout v2_1;
                this.P = v2_21.getBoolean(0, 0);
                v2_21.recycle();
                this.A();
                this.r.getDecorView();
                androidx.appcompat.widget.ContentFrameLayout v2_20 = android.view.LayoutInflater.from(v0_5);
                if (this.Q) {
                    if (!this.O) {
                        v2_1 = ((android.view.ViewGroup) v2_20.inflate(2131558421, 0));
                    } else {
                        v2_1 = ((android.view.ViewGroup) v2_20.inflate(2131558422, 0));
                    }
                } else {
                    if (!this.P) {
                        if (!this.M) {
                            v2_1 = 0;
                        } else {
                            android.util.TypedValue v3_55;
                            androidx.appcompat.widget.ContentFrameLayout v2_26 = new android.util.TypedValue();
                            v0_5.getTheme().resolveAttribute(2130968588, v2_26, 1);
                            if (v2_26.resourceId == 0) {
                                v3_55 = v0_5;
                            } else {
                                v3_55 = new l.c(v0_5, v2_26.resourceId);
                            }
                            v2_1 = ((android.view.ViewGroup) android.view.LayoutInflater.from(v3_55).inflate(2131558423, 0));
                            android.util.TypedValue v3_60 = ((n.j1) v2_1.findViewById(2131362007));
                            this.x = v3_60;
                            v3_60.setWindowCallback(this.r.getCallback());
                            if (this.N) {
                                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.x).j(109);
                            }
                            if (this.K) {
                                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.x).j(2);
                            }
                            if (this.L) {
                                ((androidx.appcompat.widget.ActionBarOverlayLayout) this.x).j(5);
                            }
                        }
                    } else {
                        v2_1 = ((android.view.ViewGroup) v2_20.inflate(2131558412, 0));
                        this.N = 0;
                        this.M = 0;
                    }
                }
                if (v2_1 == null) {
                    boolean v1_2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                    v1_2.append(this.M);
                    v1_2.append(", windowActionBarOverlay: ");
                    v1_2.append(this.N);
                    v1_2.append(", android:windowIsFloating: ");
                    v1_2.append(this.P);
                    v1_2.append(", windowActionModeOverlay: ");
                    v1_2.append(this.O);
                    v1_2.append(", windowNoTitle: ");
                    v1_2.append(this.Q);
                    v1_2.append(" }");
                    throw new IllegalArgumentException(v1_2.toString());
                } else {
                    q0.i0.j(v2_1, new h.r(this, 0));
                    if (this.x == null) {
                        this.I = ((android.widget.TextView) v2_1.findViewById(2131362518));
                    }
                    try {
                        int v9_1 = v2_1.getClass().getMethod("makeOptionalFitsSystemWindows", 0);
                    } catch (NoSuchMethodException) {
                        android.util.Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                        android.util.TypedValue v3_16 = ((androidx.appcompat.widget.ContentFrameLayout) v2_1.findViewById(2131361847));
                        androidx.appcompat.widget.Toolbar v4_7 = ((android.view.ViewGroup) this.r.findViewById(16908290));
                        if (v4_7 != null) {
                            while (v4_7.getChildCount() > 0) {
                                android.graphics.Rect v10_6 = v4_7.getChildAt(0);
                                v4_7.removeViewAt(0);
                                v3_16.addView(v10_6);
                            }
                            v4_7.setId(-1);
                            v3_16.setId(16908290);
                            if ((v4_7 instanceof android.widget.FrameLayout)) {
                                ((android.widget.FrameLayout) v4_7).setForeground(0);
                            }
                        }
                        androidx.appcompat.widget.ContentFrameLayout v2_14;
                        this.r.setContentView(v2_1);
                        v3_16.setAttachListener(new h.r(this, 1));
                        this.H = v2_1;
                        androidx.appcompat.widget.ContentFrameLayout v2_13 = this.p;
                        if (!(v2_13 instanceof android.app.Activity)) {
                            v2_14 = this.w;
                        } else {
                            v2_14 = ((android.app.Activity) v2_13).getTitle();
                        }
                        if (!android.text.TextUtils.isEmpty(v2_14)) {
                            android.util.TypedValue v3_19 = this.x;
                            if (v3_19 == null) {
                                android.util.TypedValue v3_20 = this.u;
                                if (v3_20 == null) {
                                    android.util.TypedValue v3_21 = this.I;
                                    if (v3_21 != null) {
                                        v3_21.setText(v2_14);
                                    }
                                } else {
                                    android.util.TypedValue v3_23 = ((n.f3) v3_20.j);
                                    if (!v3_23.g) {
                                        androidx.appcompat.widget.Toolbar v4_13 = v3_23.a;
                                        v3_23.h = v2_14;
                                        if ((v3_23.b & 8) != 0) {
                                            v4_13.setTitle(v2_14);
                                            if (v3_23.g) {
                                                q0.q0.o(v4_13.getRootView(), v2_14);
                                            }
                                        }
                                    }
                                }
                            } else {
                                v3_19.setWindowTitle(v2_14);
                            }
                        }
                        androidx.appcompat.widget.ContentFrameLayout v2_18 = ((androidx.appcompat.widget.ContentFrameLayout) this.H.findViewById(16908290));
                        android.util.TypedValue v3_28 = this.r.getDecorView();
                        v2_18.m.set(v3_28.getPaddingLeft(), v3_28.getPaddingTop(), v3_28.getPaddingRight(), v3_28.getPaddingBottom());
                        if (v2_18.isLaidOut()) {
                            v2_18.requestLayout();
                        }
                        m.m v0_6 = v0_5.obtainStyledAttributes(v1_11);
                        v0_6.getValue(124, v2_18.getMinWidthMajor());
                        v0_6.getValue(125, v2_18.getMinWidthMinor());
                        if (v0_6.hasValue(122)) {
                            v0_6.getValue(122, v2_18.getFixedWidthMajor());
                        }
                        if (v0_6.hasValue(123)) {
                            v0_6.getValue(123, v2_18.getFixedWidthMinor());
                        }
                        if (v0_6.hasValue(120)) {
                            v0_6.getValue(120, v2_18.getFixedHeightMajor());
                        }
                        if (v0_6.hasValue(121)) {
                            v0_6.getValue(121, v2_18.getFixedHeightMinor());
                        }
                        v0_6.recycle();
                        v2_18.requestLayout();
                        this.G = 1;
                        m.m v0_7 = this.C(0);
                        if ((!this.X) && (v0_7.h == null)) {
                            this.E(108);
                        }
                    }
                    if (!v9_1.isAccessible()) {
                        v9_1.setAccessible(1);
                    }
                    v9_1.invoke(v2_1, 0);
                }
            }
        }
        return;
    }
}
