package q0;
public final class q {
    public android.view.ViewParent a;
    public android.view.ViewParent b;
    public final android.view.ViewGroup c;
    public boolean d;
    public int[] e;

    public q(android.view.ViewGroup p1)
    {
        this.c = p1;
        return;
    }

    public final boolean a(float p4, float p5, boolean p6)
    {
        if (this.d) {
            android.view.ViewParent v0_1 = this.e(0);
            if (v0_1 != null) {
                try {
                    return v0_1.onNestedFling(this.c, p4, p5, p6);
                } catch (AbstractMethodError v4_1) {
                    String v5_2 = new StringBuilder("ViewParent ");
                    v5_2.append(v0_1);
                    v5_2.append(" does not implement interface method onNestedFling");
                    android.util.Log.e("ViewParentCompat", v5_2.toString(), v4_1);
                }
            }
        }
        return 0;
    }

    public final boolean b(float p4, float p5)
    {
        if (this.d) {
            String v0_3 = this.e(0);
            if (v0_3 != null) {
                try {
                    return v0_3.onNestedPreFling(this.c, p4, p5);
                } catch (AbstractMethodError v4_1) {
                    String v5_2 = new StringBuilder("ViewParent ");
                    v5_2.append(v0_3);
                    v5_2.append(" does not implement interface method onNestedPreFling");
                    android.util.Log.e("ViewParentCompat", v5_2.toString(), v4_1);
                }
            }
        }
        return 0;
    }

    public final boolean c(int p13, int p14, int p15, int[] p16, int[] p17)
    {
        int v8 = 0;
        if (this.d) {
            String v1_3 = this.e(p15);
            if (v1_3 != null) {
                if ((p13 == 0) && (p14 == 0)) {
                    if (p17 != null) {
                        p17[0] = 0;
                        p17[1] = 0;
                        return 0;
                    }
                } else {
                    int v10;
                    int v11;
                    android.view.ViewGroup v2 = this.c;
                    if (p17 == null) {
                        v10 = 0;
                        v11 = 0;
                    } else {
                        v2.getLocationInWindow(p17);
                        v10 = p17[0];
                        v11 = p17[1];
                    }
                    int[] v5;
                    if (p16 != null) {
                        v5 = p16;
                    } else {
                        if (this.e == null) {
                            int v0_4 = new int[2];
                            this.e = v0_4;
                        }
                        v5 = this.e;
                    }
                    v5[0] = 0;
                    v5[1] = 0;
                    if (!(v1_3 instanceof q0.r)) {
                        if (p15 == 0) {
                            try {
                                v1_3.onNestedPreScroll(v2, p13, p14, v5);
                            } catch (int v0_7) {
                                String v3_2 = new StringBuilder("ViewParent ");
                                v3_2.append(v1_3);
                                v3_2.append(" does not implement interface method onNestedPreScroll");
                                android.util.Log.e("ViewParentCompat", v3_2.toString(), v0_7);
                            }
                        }
                    } else {
                        ((q0.r) v1_3).c(v2, p13, p14, v5, p15);
                    }
                    if (p17 != null) {
                        v2.getLocationInWindow(p17);
                        p17[0] = (p17[0] - v10);
                        p17[1] = (p17[1] - v11);
                    }
                    if ((v5[0] != 0) || (v5[1] != 0)) {
                        v8 = 1;
                    }
                }
            }
        }
        return v8;
    }

    public final boolean d(int p15, int p16, int p17, int p18, int[] p19, int p20, int[] p21)
    {
        if (this.d) {
            String v2_1 = this.e(p20);
            if (v2_1 != null) {
                if ((p15 == null) && ((p16 == 0) && ((p17 == 0) && (p18 == 0)))) {
                    if (p19 != null) {
                        p19[0] = 0;
                        p19[1] = 0;
                        return 0;
                    }
                } else {
                    int v12;
                    int v13;
                    android.view.ViewGroup v3 = this.c;
                    if (p19 == null) {
                        v12 = 0;
                        v13 = 0;
                    } else {
                        v3.getLocationInWindow(p19);
                        v12 = p19[0];
                        v13 = p19[1];
                    }
                    int[] v9;
                    if (p21 != null) {
                        v9 = p21;
                    } else {
                        if (this.e == null) {
                            String v0_4 = new int[2];
                            this.e = v0_4;
                        }
                        String v0_5 = this.e;
                        v0_5[0] = 0;
                        v0_5[1] = 0;
                        v9 = v0_5;
                    }
                    if (!(v2_1 instanceof q0.s)) {
                        v9[0] = (v9[0] + p17);
                        v9[1] = (v9[1] + p18);
                        if (!(v2_1 instanceof q0.r)) {
                            if (p20 == 0) {
                                try {
                                    v2_1.onNestedScroll(v3, p15, p16, p17, p18);
                                } catch (String v0_12) {
                                    AbstractMethodError v15_1 = v0_12;
                                    String v0_14 = new StringBuilder("ViewParent ");
                                    v0_14.append(v2_1);
                                    v0_14.append(" does not implement interface method onNestedScroll");
                                    android.util.Log.e("ViewParentCompat", v0_14.toString(), v15_1);
                                }
                            }
                        } else {
                            ((q0.r) v2_1).e(v3, p15, p16, p17, p18, p20);
                        }
                    } else {
                        ((q0.s) v2_1).d(v3, p15, p16, p17, p18, p20, v9);
                    }
                    if (p19 != null) {
                        v3.getLocationInWindow(p19);
                        p19[0] = (p19[0] - v12);
                        p19[1] = (p19[1] - v13);
                    }
                    return 1;
                }
            }
        }
        return 0;
    }

    public final android.view.ViewParent e(int p2)
    {
        if (p2 == null) {
            return this.a;
        } else {
            if (p2 == 1) {
                return this.b;
            } else {
                return 0;
            }
        }
    }

    public final boolean f(int p1)
    {
        if (this.e(p1) == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean g(int p12, int p13)
    {
        if (!this.f(p13)) {
            if (this.d) {
                String v0_3 = this.c;
                q0.r v3_0 = v0_3.getParent();
                android.view.View v4_0 = v0_3;
                while (v3_0 != null) {
                    AbstractMethodError v8_0;
                    boolean v5_0 = (v3_0 instanceof q0.r);
                    if (!v5_0) {
                        if (p13 == null) {
                            try {
                                v8_0 = v3_0.onStartNestedScroll(v4_0, v0_3, p12);
                            } catch (AbstractMethodError v8_1) {
                                String v9_1 = new StringBuilder("ViewParent ");
                                v9_1.append(v3_0);
                                v9_1.append(" does not implement interface method onStartNestedScroll");
                                android.util.Log.e("ViewParentCompat", v9_1.toString(), v8_1);
                            }
                            if (v8_0 == null) {
                                if ((v3_0 instanceof android.view.View)) {
                                    v4_0 = ((android.view.View) v3_0);
                                }
                                v3_0 = v3_0.getParent();
                            } else {
                                if (p13 == null) {
                                    this.a = v3_0;
                                } else {
                                    if (p13 == 1) {
                                        this.b = v3_0;
                                    }
                                }
                                if (!v5_0) {
                                    if (p13 != null) {
                                        return 1;
                                    } else {
                                        try {
                                            v3_0.onNestedScrollAccepted(v4_0, v0_3, p12);
                                        } catch (AbstractMethodError v12_1) {
                                            String v13_2 = new StringBuilder("ViewParent ");
                                            v13_2.append(v3_0);
                                            v13_2.append(" does not implement interface method onNestedScrollAccepted");
                                            android.util.Log.e("ViewParentCompat", v13_2.toString(), v12_1);
                                        }
                                        return 1;
                                    }
                                } else {
                                    ((q0.r) v3_0).a(v4_0, v0_3, p12, p13);
                                    return 1;
                                }
                            }
                        }
                        v8_0 = 0;
                    } else {
                        v8_0 = ((q0.r) v3_0).f(v4_0, v0_3, p12, p13);
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final void h(int p5)
    {
        String v0_0 = this.e(p5);
        if (v0_0 != null) {
            String v2_2 = this.c;
            if (!(v0_0 instanceof q0.r)) {
                if (p5 == 0) {
                    try {
                        v0_0.onStopNestedScroll(v2_2);
                    } catch (AbstractMethodError v1_2) {
                        String v2_0 = new StringBuilder("ViewParent ");
                        v2_0.append(v0_0);
                        v2_0.append(" does not implement interface method onStopNestedScroll");
                        android.util.Log.e("ViewParentCompat", v2_0.toString(), v1_2);
                    }
                }
            } else {
                ((q0.r) v0_0).b(v2_2, p5);
            }
            if (p5 == 0) {
                this.a = 0;
            } else {
                if (p5 == 1) {
                    this.b = 0;
                }
            }
        }
        return;
    }
}
