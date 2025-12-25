package y0;
public abstract class b extends q0.b {
    public static final android.graphics.Rect n;
    public static final c5.c o;
    public static final v3.f p;
    public final android.graphics.Rect d;
    public final android.graphics.Rect e;
    public final android.graphics.Rect f;
    public final int[] g;
    public final android.view.accessibility.AccessibilityManager h;
    public final android.view.View i;
    public y0.a j;
    public int k;
    public int l;
    public int m;

    static b()
    {
        y0.b.n = new android.graphics.Rect(2147483647, 2147483647, -2147483648, -2147483648);
        y0.b.o = new c5.c();
        y0.b.p = new v3.f();
        return;
    }

    public b(android.view.View p3)
    {
        this.d = new android.graphics.Rect();
        this.e = new android.graphics.Rect();
        this.f = new android.graphics.Rect();
        int v0_2 = new int[2];
        this.g = v0_2;
        this.k = -2147483648;
        this.l = -2147483648;
        this.m = -2147483648;
        this.i = p3;
        this.h = ((android.view.accessibility.AccessibilityManager) p3.getContext().getSystemService("accessibility"));
        p3.setFocusable(1);
        if (p3.getImportantForAccessibility() == 0) {
            p3.setImportantForAccessibility(1);
        }
        return;
    }

    public final j6.o b(android.view.View p1)
    {
        if (this.j == null) {
            this.j = new y0.a(this);
        }
        return this.j;
    }

    public final void d(android.view.View p3, r0.c p4)
    {
        this.a.onInitializeAccessibilityNodeInfo(p3, p4.a);
        this.t(p4);
        return;
    }

    public final boolean j(int p3)
    {
        if (this.l == p3) {
            this.l = -2147483648;
            this.v(p3, 0);
            this.x(p3, 8);
            return 1;
        } else {
            return 0;
        }
    }

    public final android.view.accessibility.AccessibilityEvent k(int p5, int p6)
    {
        android.view.View v1 = this.i;
        if (p5 == -1) {
            RuntimeException v5_1 = android.view.accessibility.AccessibilityEvent.obtain(p6);
            v1.onInitializeAccessibilityEvent(v5_1);
            return v5_1;
        } else {
            String v6_2 = android.view.accessibility.AccessibilityEvent.obtain(p6);
            CharSequence v0_1 = this.r(p5);
            v6_2.getText().add(v0_1.g());
            CharSequence v0_2 = v0_1.a;
            v6_2.setContentDescription(v0_2.getContentDescription());
            v6_2.setScrollable(v0_2.isScrollable());
            v6_2.setPassword(v0_2.isPassword());
            v6_2.setEnabled(v0_2.isEnabled());
            v6_2.setChecked(v0_2.isChecked());
            if ((v6_2.getText().isEmpty()) && (v6_2.getContentDescription() == null)) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            } else {
                v6_2.setClassName(v0_2.getClassName());
                v6_2.setSource(v1, p5);
                v6_2.setPackageName(v1.getContext().getPackageName());
                return v6_2;
            }
        }
    }

    public final r0.c l(int p10)
    {
        int v0_0 = android.view.accessibility.AccessibilityNodeInfo.obtain();
        r0.c v1_1 = new r0.c(v0_0);
        v0_0.setEnabled(1);
        v0_0.setFocusable(1);
        v1_1.i("android.view.View");
        int v3_5 = y0.b.n;
        v0_0.setBoundsInParent(v3_5);
        v0_0.setBoundsInScreen(v3_5);
        android.view.View v4 = this.i;
        v0_0.setParent(v4);
        this.u(p10, v1_1);
        if ((v1_1.g() == null) && (v0_0.getContentDescription() == null)) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        } else {
            android.graphics.Rect v5_2 = this.e;
            v1_1.f(v5_2);
            if (v5_2.equals(v3_5)) {
                throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            } else {
                android.graphics.Rect v5_4 = v0_0.getActions();
                if ((v5_4 & 64) != 0) {
                    throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                } else {
                    if ((v5_4 & 128) != 0) {
                        throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
                    } else {
                        v0_0.setPackageName(v4.getContext().getPackageName());
                        v1_1.b = p10;
                        v0_0.setSource(v4, p10);
                        if (this.k != p10) {
                            v0_0.setAccessibilityFocused(0);
                            v1_1.a(64);
                        } else {
                            v0_0.setAccessibilityFocused(1);
                            v1_1.a(128);
                        }
                        android.view.ViewParent v10_17;
                        if (this.l != p10) {
                            v10_17 = 0;
                        } else {
                            v10_17 = 1;
                        }
                        if (v10_17 == null) {
                            if (v0_0.isFocusable()) {
                                v1_1.a(1);
                            }
                        } else {
                            v1_1.a(2);
                        }
                        v0_0.setFocused(v10_17);
                        android.view.ViewParent v10_18 = this.g;
                        v4.getLocationOnScreen(v10_18);
                        android.graphics.Rect v5_13 = this.d;
                        v0_0.getBoundsInScreen(v5_13);
                        if (v5_13.equals(v3_5)) {
                            v1_1.f(v5_13);
                            v5_13.offset((v10_18[0] - v4.getScrollX()), (v10_18[1] - v4.getScrollY()));
                        }
                        int v3_6 = this.f;
                        if (v4.getLocalVisibleRect(v3_6)) {
                            v3_6.offset((v10_18[0] - v4.getScrollX()), (v10_18[1] - v4.getScrollY()));
                            if (v5_13.intersect(v3_6)) {
                                v0_0.setBoundsInScreen(v5_13);
                                if ((!v5_13.isEmpty()) && (v4.getWindowVisibility() == 0)) {
                                    android.view.ViewParent v10_6 = v4.getParent();
                                    while ((v10_6 instanceof android.view.View)) {
                                        android.view.ViewParent v10_8 = ((android.view.View) v10_6);
                                        if ((v10_8.getAlpha() > 0) && (v10_8.getVisibility() == 0)) {
                                            v10_6 = v10_8.getParent();
                                        }
                                    }
                                    if (v10_6 != null) {
                                        v1_1.a.setVisibleToUser(1);
                                    }
                                }
                            }
                        }
                        return v1_1;
                    }
                }
            }
        }
    }

    public final boolean m(android.view.MotionEvent p7)
    {
        int v0_0 = this.h;
        if ((v0_0.isEnabled()) && (v0_0.isTouchExplorationEnabled())) {
            int v0_4 = p7.getAction();
            if ((v0_4 == 7) || (v0_4 == 9)) {
                int v7_2 = this.n(p7.getX(), p7.getY());
                int v0_2 = this.m;
                if (v0_2 != v7_2) {
                    this.m = v7_2;
                    this.x(v7_2, 128);
                    this.x(v0_2, 256);
                }
                if (v7_2 == -2147483648) {
                    return 0;
                }
            } else {
                if (v0_4 == 10) {
                    int v7_4 = this.m;
                    if (v7_4 == -2147483648) {
                        return 0;
                    } else {
                        if (v7_4 != -2147483648) {
                            this.m = -2147483648;
                            this.x(-2147483648, 128);
                            this.x(v7_4, 256);
                            return 1;
                        }
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public abstract int n();

    public abstract void o();

    public final void p(int p4)
    {
        if ((p4 != -2147483648) && (this.h.isEnabled())) {
            android.view.View v0_3 = this.i;
            android.view.ViewParent v1 = v0_3.getParent();
            if (v1 != null) {
                android.view.accessibility.AccessibilityEvent v4_1 = this.k(p4, 2048);
                v4_1.setContentChangeTypes(0);
                v1.requestSendAccessibilityEvent(v0_3, v4_1);
            }
        }
        return;
    }

    public final boolean q(int p19, android.graphics.Rect p20)
    {
        int v3_5 = new java.util.ArrayList();
        this.o(v3_5);
        r.k v4_1 = new r.k();
        Object v6_4 = 0;
        while (v6_4 < v3_5.size()) {
            v4_1.d(((Integer) v3_5.get(v6_4)).intValue(), this.l(((Integer) v3_5.get(v6_4)).intValue()));
            v6_4++;
        }
        int v3_3;
        int v3_0 = this.l;
        if (v3_0 != -2147483648) {
            v3_3 = ((r0.c) v4_1.b(v3_0));
        } else {
            v3_3 = 0;
        }
        int v2_5;
        int v7_4;
        r0.c v16_0;
        c5.c v8_0 = y0.b.o;
        int v9_1 = y0.b.p;
        int v10_1 = this.i;
        if ((p19 == 1) || (p19 == 2)) {
            int v5_15;
            v2_5 = -1;
            v7_4 = 0;
            if (v10_1.getLayoutDirection() != 1) {
                v5_15 = 0;
            } else {
                v5_15 = 1;
            }
            v9_1.getClass();
            Object v6_6 = v4_1.c;
            int v9_3 = new java.util.ArrayList(v6_6);
            int v10_2 = 0;
            while (v10_2 < v6_6) {
                v9_3.add(((r0.c) v4_1.e(v10_2)));
                v10_2++;
            }
            Object v6_10;
            java.util.Collections.sort(v9_3, new y0.c(v5_15, v8_0));
            if (p19 == 1) {
                int[] v1_8 = v9_3.size();
                if (v3_3 != 0) {
                    v1_8 = v9_3.indexOf(v3_3);
                }
                int[] v1_9 = (v1_8 - 1);
                if (v1_9 < null) {
                    v6_10 = 0;
                } else {
                    v6_10 = v9_3.get(v1_9);
                }
            } else {
                if (p19 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                } else {
                    int v10_3;
                    int[] v1_12 = v9_3.size();
                    if (v3_3 != 0) {
                        v10_3 = v9_3.lastIndexOf(v3_3);
                    } else {
                        v10_3 = -1;
                    }
                    int v10_4 = (v10_3 + 1);
                    if (v10_4 >= v1_12) {
                    } else {
                        v6_10 = v9_3.get(v10_4);
                    }
                }
            }
            v16_0 = ((r0.c) v6_10);
        } else {
            if ((p19 != 17) && ((p19 != 33) && ((p19 != 66) && (p19 != 130)))) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            } else {
                int v10_0;
                android.graphics.Rect v13_2 = new android.graphics.Rect();
                int v5_16 = this.l;
                if (v5_16 == -2147483648) {
                    if (p20 == null) {
                        int v2_0 = v10_1.getWidth();
                        int v5_0 = v10_1.getHeight();
                        if (p19 == 17) {
                            v10_0 = -1;
                            v13_2.set(v2_0, 0, v2_0, v5_0);
                        } else {
                            if (p19 == 33) {
                                v10_0 = -1;
                                v13_2.set(0, v5_0, v2_0, v5_0);
                            } else {
                                if (p19 == 66) {
                                    v10_0 = -1;
                                    v13_2.set(-1, 0, -1, v5_0);
                                } else {
                                    if (p19 != 130) {
                                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    } else {
                                        v10_0 = -1;
                                        v13_2.set(0, -1, v2_0, -1);
                                    }
                                }
                            }
                        }
                    } else {
                        v13_2.set(p20);
                        v10_0 = -1;
                    }
                } else {
                    this.r(v5_16).f(v13_2);
                }
                int v2_4 = new android.graphics.Rect(v13_2);
                if (p19 == 17) {
                    v7_4 = 0;
                    v2_4.offset((v13_2.width() + 1), 0);
                } else {
                    if (p19 == 33) {
                        v7_4 = 0;
                        v2_4.offset(0, (v13_2.height() + 1));
                    } else {
                        if (p19 == 66) {
                            v7_4 = 0;
                            v2_4.offset((- (v13_2.width() + 1)), 0);
                        } else {
                            if (p19 != 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            } else {
                                v7_4 = 0;
                                v2_4.offset(0, (- (v13_2.height() + 1)));
                            }
                        }
                    }
                }
                v9_1.getClass();
                int v5_12 = v4_1.c;
                Object v6_1 = new android.graphics.Rect();
                int v9_0 = v7_4;
                v16_0 = 0;
                while (v9_0 < v5_12) {
                    r0.c v11_1 = ((r0.c) v4_1.e(v9_0));
                    if (v11_1 != v3_3) {
                        v8_0.getClass();
                        v11_1.f(v6_1);
                        if (y0.d.e(p19, v13_2, v6_1)) {
                            if ((y0.d.e(p19, v13_2, v2_4)) && (!y0.d.b(p19, v13_2, v6_1, v2_4))) {
                                if (!y0.d.b(p19, v13_2, v2_4, v6_1)) {
                                    int v12_5 = y0.d.f(p19, v13_2, v6_1);
                                    int v14_2 = ((y0.d.g(p19, v13_2, v6_1) * y0.d.g(p19, v13_2, v6_1)) + ((v12_5 * 13) * v12_5));
                                    int v12_6 = y0.d.f(p19, v13_2, v2_4);
                                    if (v14_2 >= ((y0.d.g(p19, v13_2, v2_4) * y0.d.g(p19, v13_2, v2_4)) + ((v12_6 * 13) * v12_6))) {
                                        v9_0++;
                                    }
                                }
                            }
                            v2_4.set(v6_1);
                            v16_0 = v11_1;
                        }
                    }
                }
                v2_5 = v10_0;
            }
        }
        int[] v1_5 = v16_0;
        int v7_5;
        if (v1_5 != null) {
            int v5_13 = v7_4;
            while (v5_13 < v4_1.c) {
                if (v4_1.b[v5_13] != v1_5) {
                    v5_13++;
                } else {
                    int v12_0 = v5_13;
                }
                v7_5 = v4_1.a[v12_0];
            }
            v12_0 = v2_5;
        } else {
            v7_5 = -2147483648;
        }
        return this.w(v7_5);
    }

    public final r0.c r(int p7)
    {
        if (p7 != -1) {
            return this.l(p7);
        } else {
            RuntimeException v7_4 = this.i;
            String v0_5 = android.view.accessibility.AccessibilityNodeInfo.obtain(v7_4);
            r0.c v1_1 = new r0.c(v0_5);
            v7_4.onInitializeAccessibilityNodeInfo(v0_5);
            java.util.ArrayList v2_1 = new java.util.ArrayList();
            this.o(v2_1);
            if ((v0_5.getChildCount() > 0) && (v2_1.size() > 0)) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            } else {
                String v0_4 = v2_1.size();
                int v3 = 0;
                while (v3 < v0_4) {
                    v1_1.a.addChild(v7_4, ((Integer) v2_1.get(v3)).intValue());
                    v3++;
                }
                return v1_1;
            }
        }
    }

    public abstract boolean s();

    public void t(r0.c p1)
    {
        return;
    }

    public abstract void u();

    public void v(int p1, boolean p2)
    {
        return;
    }

    public final boolean w(int p3)
    {
        int v0_0 = this.i;
        if ((v0_0.isFocused()) || (v0_0.requestFocus())) {
            int v0_3 = this.l;
            if (v0_3 != p3) {
                if (v0_3 != -2147483648) {
                    this.j(v0_3);
                }
                if (p3 != -2147483648) {
                    this.l = p3;
                    this.v(p3, 1);
                    this.x(p3, 8);
                    return 1;
                }
            }
        }
        return 0;
    }

    public final void x(int p3, int p4)
    {
        if ((p3 != -2147483648) && (this.h.isEnabled())) {
            android.view.View v0_3 = this.i;
            android.view.ViewParent v1 = v0_3.getParent();
            if (v1 != null) {
                v1.requestSendAccessibilityEvent(v0_3, this.k(p3, p4));
            }
        }
        return;
    }
}
