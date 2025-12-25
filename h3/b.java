package h3;
public final class b extends w0.a {
    public final synthetic int a;
    public final synthetic b0.a b;

    public synthetic b(b0.a p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final int b(android.view.View p3, int p4)
    {
        switch (this.a) {
            case 0:
                return p3.getLeft();
            default:
                int v0_3;
                int v3_8 = ((com.google.android.material.sidesheet.SideSheetBehavior) this.b);
                int v0_4 = v3_8.a;
                switch (v0_4.a) {
                    case 0:
                        v0_3 = (- v0_4.b.l);
                        break;
                    default:
                        v0_3 = v0_4.a();
                }
                int v3_3;
                int v3_1 = v3_8.a;
                switch (v3_1.a) {
                    case 0:
                        v3_3 = v3_1.b.o;
                        break;
                    default:
                        v3_3 = v3_1.b.m;
                }
                return c4.b.h(p4, v0_3, v3_3);
        }
    }

    public final int c(android.view.View p2, int p3)
    {
        switch (this.a) {
            case 0:
                return c4.b.h(p3, ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.b).C(), this.e());
            default:
                return p2.getTop();
        }
    }

    public int d(android.view.View p2)
    {
        switch (this.a) {
            case 1:
                int v2_2 = ((com.google.android.material.sidesheet.SideSheetBehavior) this.b);
                return (v2_2.l + v2_2.o);
            default:
                return super.d(p2);
        }
    }

    public int e()
    {
        switch (this.a) {
            case 0:
                int v0_4;
                int v0_3 = ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.b);
                if (!v0_3.I) {
                    v0_4 = v0_3.G;
                } else {
                    v0_4 = v0_3.V;
                }
                return v0_4;
            default:
                return super.e();
        }
    }

    public final void g(int p3)
    {
        switch (this.a) {
            case 0:
                if (p3 == 1) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior v3_4 = ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.b);
                    if (v3_4.K) {
                        v3_4.I(1);
                    }
                }
                return;
            default:
                if (p3 == 1) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior v3_2 = ((com.google.android.material.sidesheet.SideSheetBehavior) this.b);
                    if (v3_2.g) {
                        v3_2.w(1);
                    }
                }
                return;
        }
    }

    public final void h(android.view.View p5, int p6, int p7)
    {
        switch (this.a) {
            case 0:
                ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.b).y(p7);
                return;
            default:
                int v7_1;
                boolean v6_4 = ((com.google.android.material.sidesheet.SideSheetBehavior) this.b);
                int v7_6 = v6_4.q;
                if (v7_6 == 0) {
                    v7_1 = 0;
                } else {
                    v7_1 = ((android.view.View) v7_6.get());
                }
                if (v7_1 != 0) {
                    android.view.ViewGroup$MarginLayoutParams v0_1 = ((android.view.ViewGroup$MarginLayoutParams) v7_1.getLayoutParams());
                    if (v0_1 != null) {
                        int v1_0 = v6_4.a;
                        int v2 = p5.getLeft();
                        ClassCastException v5_2 = p5.getRight();
                        switch (v1_0.a) {
                            case 0:
                                if (v2 > v1_0.b.m) {
                                } else {
                                    v0_1.leftMargin = v5_2;
                                }
                                break;
                            default:
                                ClassCastException v5_5 = v1_0.b.m;
                                if (v2 > v5_5) {
                                } else {
                                    v0_1.rightMargin = (v5_5 - v2);
                                }
                        }
                        v7_1.setLayoutParams(v0_1);
                    }
                }
                ClassCastException v5_7 = v6_4.v;
                if (!v5_7.isEmpty()) {
                    boolean v6_1 = v6_4.a;
                    switch (v6_1.a) {
                        case 0:
                            v6_1.b();
                            v6_1.a();
                            break;
                        default:
                            int vtmp6 = v6_1.a();
                    }
                    ClassCastException v5_8 = v5_7.iterator();
                    if (v5_8.hasNext()) {
                        throw v1.a.e(v5_8);
                    }
                }
                return;
        }
    }

    public final void i(android.view.View p6, float p7, float p8)
    {
        switch (this.a) {
            case 0:
                com.google.android.material.bottomsheet.BottomSheetBehavior v0_4 = ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.b);
                float v3_0 = 6;
                if (p8 >= 0) {
                    if ((!v0_4.I) || (!v0_4.J(p6, p8))) {
                        if ((p8 != 0) && (Math.abs(p7) <= Math.abs(p8))) {
                            if (!v0_4.b) {
                                int v7_24 = p6.getTop();
                                if (Math.abs((v7_24 - v0_4.E)) < Math.abs((v7_24 - v0_4.G))) {
                                    v0_4.getClass();
                                    v0_4.getClass();
                                    v0_4.K(p6, v3_0, 1);
                                    return;
                                }
                            }
                        } else {
                            int v7_27 = p6.getTop();
                            if (!v0_4.b) {
                                int v8_25 = v0_4.E;
                                if (v7_27 >= v8_25) {
                                    if (Math.abs((v7_27 - v8_25)) < Math.abs((v7_27 - v0_4.G))) {
                                        v0_4.getClass();
                                        v0_4.getClass();
                                        v0_4.K(p6, v3_0, 1);
                                        return;
                                    }
                                } else {
                                    if (v7_27 >= Math.abs((v7_27 - v0_4.G))) {
                                        v0_4.getClass();
                                        v0_4.getClass();
                                        v0_4.K(p6, v3_0, 1);
                                        return;
                                    } else {
                                        v3_0 = 3;
                                        v0_4.getClass();
                                        v0_4.K(p6, v3_0, 1);
                                        return;
                                    }
                                }
                            } else {
                                if (Math.abs((v7_27 - v0_4.D)) < Math.abs((v7_27 - v0_4.G))) {
                                }
                            }
                        }
                        v3_0 = 4;
                    } else {
                        if (((Math.abs(p7) >= Math.abs(p8)) || (p8 <= ((float) v0_4.d))) && (p6.getTop() <= ((v0_4.C() + v0_4.V) / 2))) {
                            if ((v0_4.b) || (Math.abs((p6.getTop() - v0_4.C())) < Math.abs((p6.getTop() - v0_4.E)))) {
                            }
                        } else {
                            v3_0 = 5;
                        }
                    }
                } else {
                    if (!v0_4.b) {
                        int v7_2 = p6.getTop();
                        android.os.SystemClock.uptimeMillis();
                        v0_4.getClass();
                        if (v7_2 <= v0_4.E) {
                        }
                    }
                }
                v0_4.getClass();
                v0_4.K(p6, v3_0, 1);
                return;
            default:
                int v1_6;
                com.google.android.material.bottomsheet.BottomSheetBehavior v0_2 = ((com.google.android.material.sidesheet.SideSheetBehavior) this.b);
                switch (v0_2.a.a) {
                    case 0:
                        if (p7 <= 0) {
                            v1_6 = 0;
                        } else {
                            v1_6 = 1;
                        }
                        break;
                    default:
                        if (p7 >= 0) {
                        } else {
                        }
                }
                int v7_23;
                if (v1_6 == 0) {
                    int v1_15;
                    int v1_7 = v0_2.a;
                    switch (v1_7.a) {
                        case 0:
                            int v1_8 = v1_7.b;
                            float v2_4 = Math.abs(((v1_8.k * p7) + ((float) p6.getLeft())));
                            v1_8.getClass();
                            if (v2_4 <= 1056964608) {
                                v1_15 = 0;
                            } else {
                                v1_15 = 1;
                            }
                            break;
                        default:
                            int v1_12 = v1_7.b;
                            float v2_8 = Math.abs(((v1_12.k * p7) + ((float) p6.getRight())));
                            v1_12.getClass();
                            if (v2_8 <= 1056964608) {
                            }
                    }
                    if (v1_15 == 0) {
                        if ((p7 == 0) || (Math.abs(p7) <= Math.abs(p8))) {
                            int v7_6 = p6.getLeft();
                            if (Math.abs((v7_6 - v0_2.a.a())) < Math.abs((v7_6 - v0_2.a.b()))) {
                                v7_23 = 3;
                                v0_2.y(p6, v7_23, 1);
                                return;
                            }
                        }
                    } else {
                        int v7_15;
                        switch (v0_2.a.a) {
                            case 0:
                                if ((Math.abs(p7) <= Math.abs(p8)) || (Math.abs(p7) <= ((float) 500))) {
                                    v7_15 = 0;
                                } else {
                                    v7_15 = 1;
                                }
                            default:
                                if (Math.abs(p7) <= Math.abs(p8)) {
                                } else {
                                    if (Math.abs(p7) <= ((float) 500)) {
                                    } else {
                                    }
                                }
                        }
                        if (v7_15 == 0) {
                            int v7_22;
                            int v7_16 = v0_2.a;
                            switch (v7_16.a) {
                                case 0:
                                    if (p6.getRight() >= ((v7_16.a() - v7_16.b()) / 2)) {
                                        v7_22 = 0;
                                    } else {
                                        v7_22 = 1;
                                    }
                                    break;
                                default:
                                    if (p6.getLeft() <= ((v7_16.a() + v7_16.b.m) / 2)) {
                                    }
                            }
                            if (v7_22 == 0) {
                            }
                        }
                    }
                    v7_23 = 5;
                }
                v0_2.y(p6, v7_23, 1);
                return;
        }
    }

    public final boolean j(android.view.View p5, int p6)
    {
        switch (this.a) {
            case 0:
                com.google.android.material.bottomsheet.BottomSheetBehavior v0_2 = ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.b);
                int v1_3 = v0_2.N;
                int v2_0 = 1;
                if ((v1_3 != 1) && (!v0_2.d0)) {
                    if ((v1_3 == 3) && (v0_2.b0 == p6)) {
                        boolean v6_2;
                        boolean v6_1 = v0_2.X;
                        if (!v6_1) {
                            v6_2 = 0;
                        } else {
                            v6_2 = ((android.view.View) v6_1.get());
                        }
                        if ((v6_2) && (v6_2.canScrollVertically(-1))) {
                            v2_0 = 0;
                            return v2_0;
                        }
                    }
                    android.os.SystemClock.uptimeMillis();
                    boolean v6_5 = v0_2.W;
                    if ((!v6_5) || (v6_5.get() != p5)) {
                    }
                }
                return v2_0;
            default:
                boolean v6_8 = ((com.google.android.material.sidesheet.SideSheetBehavior) this.b);
                int v1_2 = 0;
                if (v6_8.h != 1) {
                    boolean v6_9 = v6_8.p;
                    if ((v6_9) && (v6_9.get() == p5)) {
                        v1_2 = 1;
                    }
                }
                return v1_2;
        }
    }
}
