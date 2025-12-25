package f2;
public final class f extends f2.s {
    public static final String[] H;
    public static final f2.b I;
    public static final f2.b J;
    public static final f2.b K;
    public static final f2.b L;
    public static final f2.b M;

    static f()
    {
        f2.f.H = new String[] {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"});
        f2.f.I = new f2.b("topLeft", 0, android.graphics.PointF);
        f2.f.J = new f2.b("bottomRight", 1, android.graphics.PointF);
        f2.f.K = new f2.b("bottomRight", 2, android.graphics.PointF);
        f2.f.L = new f2.b("topLeft", 3, android.graphics.PointF);
        f2.f.M = new f2.b("position", 4, android.graphics.PointF);
        return;
    }

    public static void M(f2.a0 p6)
    {
        android.view.ViewParent v0_0 = p6.b;
        java.util.HashMap v6_1 = p6.a;
        if ((!v0_0.isLaidOut()) && ((v0_0.getWidth() == 0) && (v0_0.getHeight() == 0))) {
            return;
        } else {
            v6_1.put("android:changeBounds:bounds", new android.graphics.Rect(v0_0.getLeft(), v0_0.getTop(), v0_0.getRight(), v0_0.getBottom()));
            v6_1.put("android:changeBounds:parent", v0_0.getParent());
            return;
        }
    }

    public final void e(f2.a0 p1)
    {
        f2.f.M(p1);
        return;
    }

    public final void j(f2.a0 p1)
    {
        f2.f.M(p1);
        return;
    }

    public final android.animation.Animator n(android.view.ViewGroup p19, f2.a0 p20, f2.a0 p21)
    {
        if (p20 != 0) {
            android.animation.ObjectAnimator v1_7 = p20.a;
            if (p21 != null) {
                f2.d v4_3 = p21.a;
                float v6_11 = ((android.view.ViewGroup) v1_7.get("android:changeBounds:parent"));
                Object vtmp2 = v4_3.get("android:changeBounds:parent");
                if ((v6_11 != 0) && (((android.view.ViewGroup) vtmp2) != null)) {
                    int v16;
                    android.view.ViewGroup v2_1 = p21.b;
                    float v6_6 = ((android.graphics.Rect) v1_7.get("android:changeBounds:bounds"));
                    int v5_10 = ((android.graphics.Rect) v4_3.get("android:changeBounds:bounds"));
                    float v7_4 = v6_6.left;
                    float v8_3 = v5_10.left;
                    int v9_2 = v6_6.top;
                    float v10_2 = v5_10.top;
                    float v11_1 = v6_6.right;
                    int v12 = v5_10.right;
                    float v6_7 = v6_6.bottom;
                    int v5_11 = v5_10.bottom;
                    a6.e v13_1 = (v11_1 - v7_4);
                    int v14 = (v6_7 - v9_2);
                    int v15 = (v12 - v8_3);
                    f2.s v3_5 = (v5_11 - v10_2);
                    android.animation.ObjectAnimator v1_9 = ((android.graphics.Rect) v1_7.get("android:changeBounds:clip"));
                    f2.f v0_3 = ((android.graphics.Rect) v4_3.get("android:changeBounds:clip"));
                    if (((v13_1 == null) || (v14 == 0)) && ((v15 == 0) || (v3_5 == null))) {
                        v16 = 0;
                    } else {
                        if ((v7_4 == v8_3) && (v9_2 == v10_2)) {
                            v16 = 0;
                        } else {
                            v16 = 1;
                        }
                        if ((v11_1 != v12) || (v6_7 != v5_11)) {
                            v16++;
                        }
                    }
                    if (((v1_9 != null) && (!v1_9.equals(v0_3))) || ((v1_9 == null) && (v0_3 != null))) {
                        v16++;
                    }
                    f2.f v0_4 = v16;
                    if (v0_4 > null) {
                        f2.f v0_0;
                        android.animation.ObjectAnimator v1_4;
                        f2.c0.a(v2_1, v7_4, v9_2, v11_1, v6_7);
                        if (v0_4 != 2) {
                            v0_0 = this;
                            if ((v7_4 == v8_3) && (v9_2 == v10_2)) {
                                f2.s v3_6 = ((float) v11_1);
                                float v6_8 = ((float) v6_7);
                                float v7_5 = ((float) v12);
                                int v5_13 = ((float) v5_11);
                                this.C.getClass();
                                v1_4 = android.animation.ObjectAnimator.ofObject(v2_1, f2.f.K, 0, a6.e.e(v3_6, v6_8, v7_5, v5_13));
                            } else {
                                f2.s v3_8 = ((float) v7_4);
                                float v6_10 = ((float) v9_2);
                                float v7_6 = ((float) v8_3);
                                float v8_4 = ((float) v10_2);
                                this.C.getClass();
                                v1_4 = android.animation.ObjectAnimator.ofObject(v2_1, f2.f.L, 0, a6.e.e(v3_8, v6_10, v7_6, v8_4));
                            }
                        } else {
                            if ((v13_1 != v15) || (v14 != v3_5)) {
                                v0_0 = this;
                                f2.s v3_11 = new f2.e(v2_1);
                                float v7_0 = ((float) v7_4);
                                int v9_0 = ((float) v9_2);
                                float v8_0 = ((float) v8_3);
                                float v10_0 = ((float) v10_2);
                                this.C.getClass();
                                float v7_2 = android.animation.ObjectAnimator.ofObject(v3_11, f2.f.I, 0, a6.e.e(v7_0, v9_0, v8_0, v10_0));
                                float v10_1 = ((float) v11_1);
                                float v6_0 = ((float) v6_7);
                                float v11_0 = ((float) v12);
                                int v5_1 = ((float) v5_11);
                                this.C.getClass();
                                int v5_4 = android.animation.ObjectAnimator.ofObject(v3_11, f2.f.J, 0, a6.e.e(v10_1, v6_0, v11_0, v5_1));
                                float v6_3 = new android.animation.AnimatorSet();
                                android.animation.ObjectAnimator v1_1 = new android.animation.Animator[2];
                                v1_1[0] = v7_2;
                                v1_1[1] = v5_4;
                                v6_3.playTogether(v1_1);
                                v6_3.addListener(new f2.c(v3_11));
                                v1_4 = v6_3;
                            } else {
                                v0_0 = this;
                                f2.s v3_0 = ((float) v7_4);
                                int v5_5 = ((float) v9_2);
                                float v6_4 = ((float) v8_3);
                                float v7_3 = ((float) v10_2);
                                this.C.getClass();
                                v1_4 = android.animation.ObjectAnimator.ofObject(v2_1, f2.f.M, 0, a6.e.e(v3_0, v5_5, v6_4, v7_3));
                            }
                        }
                        if ((v2_1.getParent() instanceof android.view.ViewGroup)) {
                            android.view.ViewGroup v2_3 = ((android.view.ViewGroup) v2_1.getParent());
                            c4.b.d0(v2_3, 1);
                            v0_0.r().a(new f2.d(v2_3));
                        }
                        return v1_4;
                    }
                }
            }
        }
        return 0;
    }

    public final String[] t()
    {
        return f2.f.H;
    }
}
