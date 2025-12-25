package h;
public final class x implements android.view.Window$Callback {
    public final android.view.Window$Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final synthetic h.c0 e;

    public x(h.c0 p1, android.view.Window$Callback p2)
    {
        this.e = p1;
        if (p2 == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        } else {
            this.a = p2;
            return;
        }
    }

    public final void a(android.view.Window$Callback p3)
    {
        try {
            this.b = 1;
            p3.onContentChanged();
            this.b = 0;
            return;
        } catch (Throwable v3_1) {
            this.b = 0;
            throw v3_1;
        }
    }

    public final boolean b(int p2, android.view.Menu p3)
    {
        return this.a.onMenuOpened(p2, p3);
    }

    public final void c(int p2, android.view.Menu p3)
    {
        this.a.onPanelClosed(p2, p3);
        return;
    }

    public final void d(java.util.List p2, android.view.Menu p3, int p4)
    {
        l.l.a(this.a, p2, p3, p4);
        return;
    }

    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent p2)
    {
        return this.a.dispatchGenericMotionEvent(p2);
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent p3)
    {
        android.view.Window$Callback v1 = this.a;
        if (!this.c) {
            if ((!this.e.x(p3)) && (!v1.dispatchKeyEvent(p3))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return v1.dispatchKeyEvent(p3);
        }
    }

    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent p7)
    {
        if (!this.a.dispatchKeyShortcutEvent(p7)) {
            int v7_2;
            boolean v0_7 = p7.getKeyCode();
            h.c0 v2 = this.e;
            v2.D();
            int v3_4 = v2.u;
            if (v3_4 == 0) {
                boolean v0_3 = v2.T;
                if ((!v0_3) || (!v2.I(v0_3, p7.getKeyCode(), p7))) {
                    if (v2.T == null) {
                        boolean v0_6 = v2.C(0);
                        v2.J(v0_6, p7);
                        int v7_1 = v2.I(v0_6, p7.getKeyCode(), p7);
                        v0_6.k = 0;
                        if (v7_1 != 0) {
                            v7_2 = 1;
                            if (v7_2 == 0) {
                                return 0;
                            }
                            return 1;
                        }
                    }
                    v7_2 = 0;
                } else {
                    int v7_3 = v2.T;
                    if (v7_3 == 0) {
                    } else {
                        v7_3.l = 1;
                    }
                }
            } else {
                boolean v0_2;
                int v3_0 = v3_4.n;
                if (v3_0 != 0) {
                    int v3_1 = v3_0.d;
                    if (v3_1 == 0) {
                        v0_2 = 0;
                    } else {
                        int v5_3;
                        if (android.view.KeyCharacterMap.load(p7.getDeviceId()).getKeyboardType() == 1) {
                            v5_3 = 0;
                        } else {
                            v5_3 = 1;
                        }
                        v3_1.setQwertyMode(v5_3);
                        v0_2 = v3_1.performShortcut(v0_7, p7, 0);
                    }
                }
                if (!v0_2) {
                }
            }
        }
        return 1;
    }

    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p2)
    {
        return this.a.dispatchPopulateAccessibilityEvent(p2);
    }

    public final boolean dispatchTouchEvent(android.view.MotionEvent p2)
    {
        return this.a.dispatchTouchEvent(p2);
    }

    public final boolean dispatchTrackballEvent(android.view.MotionEvent p2)
    {
        return this.a.dispatchTrackballEvent(p2);
    }

    public final void onActionModeFinished(android.view.ActionMode p2)
    {
        this.a.onActionModeFinished(p2);
        return;
    }

    public final void onActionModeStarted(android.view.ActionMode p2)
    {
        this.a.onActionModeStarted(p2);
        return;
    }

    public final void onAttachedToWindow()
    {
        this.a.onAttachedToWindow();
        return;
    }

    public final void onContentChanged()
    {
        if (this.b) {
            this.a.onContentChanged();
        }
        return;
    }

    public final boolean onCreatePanelMenu(int p2, android.view.Menu p3)
    {
        if ((p2 != 0) || ((p3 instanceof m.m))) {
            return this.a.onCreatePanelMenu(p2, p3);
        } else {
            return 0;
        }
    }

    public final android.view.View onCreatePanelView(int p2)
    {
        return this.a.onCreatePanelView(p2);
    }

    public final void onDetachedFromWindow()
    {
        this.a.onDetachedFromWindow();
        return;
    }

    public final boolean onMenuItemSelected(int p2, android.view.MenuItem p3)
    {
        return this.a.onMenuItemSelected(p2, p3);
    }

    public final boolean onMenuOpened(int p3, android.view.Menu p4)
    {
        this.b(p3, p4);
        if (p3 == 108) {
            ClassCastException v3_6 = this.e;
            v3_6.D();
            ClassCastException v3_7 = v3_6.u;
            if (v3_7 != null) {
                java.util.ArrayList v4_2 = v3_7.r;
                if (1 != v3_7.q) {
                    v3_7.q = 1;
                    if (v4_2.size() > 0) {
                        v4_2.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return 1;
    }

    public final void onPanelClosed(int p3, android.view.Menu p4)
    {
        if (!this.d) {
            this.c(p3, p4);
            boolean v1_1 = this.e;
            if (p3 != 108) {
                if (p3 == null) {
                    ClassCastException v3_6 = v1_1.C(p3);
                    if (v3_6.m) {
                        v1_1.v(v3_6, 0);
                    }
                }
            } else {
                v1_1.D();
                ClassCastException v3_1 = v1_1.u;
                if (v3_1 != null) {
                    boolean v4_2 = v3_1.r;
                    if (v3_1.q) {
                        v3_1.q = 0;
                        if (v4_2.size() > 0) {
                            v4_2.get(0).getClass();
                            throw new ClassCastException();
                        }
                    }
                }
            }
            return;
        } else {
            this.a.onPanelClosed(p3, p4);
            return;
        }
    }

    public final void onPointerCaptureChanged(boolean p2)
    {
        l.m.a(this.a, p2);
        return;
    }

    public final boolean onPreparePanel(int p4, android.view.View p5, android.view.Menu p6)
    {
        int v0_1;
        if (!(p6 instanceof m.m)) {
            v0_1 = 0;
        } else {
            v0_1 = ((m.m) p6);
        }
        if ((p4) || (v0_1 != 0)) {
            if (v0_1 != 0) {
                v0_1.x = 1;
            }
            boolean v4_1 = this.a.onPreparePanel(p4, p5, p6);
            if (v0_1 != 0) {
                v0_1.x = 0;
            }
            return v4_1;
        } else {
            return 0;
        }
    }

    public final void onProvideKeyboardShortcuts(java.util.List p3, android.view.Menu p4, int p5)
    {
        m.m v0_2 = this.e.C(0).h;
        if (v0_2 == null) {
            this.d(p3, p4, p5);
            return;
        } else {
            this.d(p3, v0_2, p5);
            return;
        }
    }

    public final boolean onSearchRequested()
    {
        return this.a.onSearchRequested();
    }

    public final boolean onSearchRequested(android.view.SearchEvent p2)
    {
        return l.k.a(this.a, p2);
    }

    public final void onWindowAttributesChanged(android.view.WindowManager$LayoutParams p2)
    {
        this.a.onWindowAttributesChanged(p2);
        return;
    }

    public final void onWindowFocusChanged(boolean p2)
    {
        this.a.onWindowFocusChanged(p2);
        return;
    }

    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode$Callback p1)
    {
        return 0;
    }

    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode$Callback p10, int p11)
    {
        android.view.Window$Callback v0_0 = this.e;
        if ((v0_0.F) && (p11 == null)) {
            h.q v1_2 = v0_0.q;
            j6.s v11_2 = new j6.s(v1_2, p10);
            android.view.View v10_29 = v0_0.A;
            if (v10_29 != null) {
                v10_29.a();
            }
            android.view.View v10_2 = new k2.c(v0_0, v11_2, 22, 0);
            v0_0.D();
            int v2_6 = v0_0.u;
            if (v2_6 != 0) {
                int v6_8 = v2_6.n;
                if (v6_8 != 0) {
                    v6_8.a();
                }
                v2_6.h.setHideOnContentScrollEnabled(0);
                v2_6.k.e();
                int v6_12 = new h.m0(v2_6, v2_6.k.getContext(), v10_2);
                int v7_7 = v6_12.d;
                v7_7.w();
                try {
                    boolean v8_3 = ((j6.s) v6_12.e.b).n(v6_12, v7_7);
                    v7_7.v();
                } catch (android.view.View v10_28) {
                    v7_7.v();
                    throw v10_28;
                }
                if (!v8_3) {
                    v6_12 = 0;
                } else {
                    v2_6.n = v6_12;
                    v6_12.i();
                    v2_6.k.c(v6_12);
                    v2_6.W(1);
                }
                v0_0.A = v6_12;
            }
            if (v0_0.A == null) {
                int v2_10 = v0_0.E;
                if (v2_10 != 0) {
                    v2_10.b();
                }
                int v2_11 = v0_0.A;
                if (v2_11 != 0) {
                    v2_11.a();
                }
                if (v0_0.B == null) {
                    if (!v0_0.P) {
                        int v2_16 = ((androidx.appcompat.widget.ViewStubCompat) v0_0.H.findViewById(2131361861));
                        if (v2_16 != 0) {
                            int v6_15;
                            v0_0.D();
                            int v6_14 = v0_0.u;
                            if (v6_14 == 0) {
                                v6_15 = 0;
                            } else {
                                v6_15 = v6_14.X();
                            }
                            if (v6_15 != 0) {
                                v1_2 = v6_15;
                            }
                            v2_16.setLayoutInflater(android.view.LayoutInflater.from(v1_2));
                            v0_0.B = ((androidx.appcompat.widget.ActionBarContextView) v2_16.a());
                        }
                    } else {
                        int v2_18 = new android.util.TypedValue();
                        int v6_16 = v1_2.getTheme();
                        v6_16.resolveAttribute(2130968588, v2_18, 1);
                        if (v2_18.resourceId != 0) {
                            int v7_12 = v1_2.getResources().newTheme();
                            v7_12.setTo(v6_16);
                            v7_12.applyStyle(v2_18.resourceId, 1);
                            int v6_19 = new l.c(v1_2, 0);
                            v6_19.getTheme().setTo(v7_12);
                            v1_2 = v6_19;
                        }
                        v0_0.B = new androidx.appcompat.widget.ActionBarContextView(v1_2, 0);
                        int v6_3 = new android.widget.PopupWindow(v1_2, 0, 2130968603);
                        v0_0.C = v6_3;
                        v6_3.setWindowLayoutType(2);
                        v0_0.C.setContentView(v0_0.B);
                        v0_0.C.setWidth(-1);
                        v1_2.getTheme().resolveAttribute(2130968582, v2_18, 1);
                        v0_0.B.setContentHeight(android.util.TypedValue.complexToDimensionPixelSize(v2_18.data, v1_2.getResources().getDisplayMetrics()));
                        v0_0.C.setHeight(-2);
                        v0_0.D = new h.q(v0_0, 1);
                    }
                }
                if (v0_0.B != null) {
                    h.q v1_10 = v0_0.E;
                    if (v1_10 != null) {
                        v1_10.b();
                    }
                    v0_0.B.e();
                    int v2_5 = v0_0.B.getContext();
                    int v6_7 = v0_0.B;
                    h.q v1_13 = new l.d();
                    v1_13.c = v2_5;
                    v1_13.d = v6_7;
                    v1_13.e = v10_2;
                    android.view.View v10_4 = new m.m(v6_7.getContext());
                    v10_4.l = 1;
                    v1_13.n = v10_4;
                    v10_4.e = v1_13;
                    if (!v11_2.n(v1_13, v10_4)) {
                        v0_0.A = 0;
                    } else {
                        v1_13.i();
                        v0_0.B.c(v1_13);
                        v0_0.A = v1_13;
                        if (!v0_0.G) {
                            v0_0.B.setAlpha(1065353216);
                            v0_0.B.setVisibility(0);
                            if ((v0_0.B.getParent() instanceof android.view.View)) {
                                q0.g0.c(((android.view.View) v0_0.B.getParent()));
                            }
                        } else {
                            android.view.View v10_8 = v0_0.H;
                            if ((v10_8 == null) || (!v10_8.isLaidOut())) {
                            } else {
                                v0_0.B.setAlpha(0);
                                android.view.View v10_20 = q0.q0.b(v0_0.B);
                                v10_20.a(1065353216);
                                v0_0.E = v10_20;
                                v10_20.d(new h.s(v0_0, 1));
                            }
                        }
                        if (v0_0.C != null) {
                            v0_0.r.getDecorView().post(v0_0.D);
                        }
                    }
                }
                v0_0.L();
                v0_0.A = v0_0.A;
            }
            v0_0.L();
            android.view.View v10_25 = v0_0.A;
            if (v10_25 == null) {
                return 0;
            } else {
                return v11_2.f(v10_25);
            }
        } else {
            return l.k.b(this.a, p10, p11);
        }
    }
}
