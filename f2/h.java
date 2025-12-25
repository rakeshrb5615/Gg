package f2;
public final class h extends f2.s {
    public static final String[] I;
    public final int H;

    static h()
    {
        f2.h.I = new String[] {"android:visibility:visibility", "android:visibility:parent"});
        return;
    }

    public h()
    {
        this.H = 3;
        return;
    }

    public h(int p1)
    {
        this.H = p1;
        return;
    }

    public static void M(f2.a0 p3)
    {
        String v0_0 = p3.b;
        java.util.HashMap v3_1 = p3.a;
        v3_1.put("android:visibility:visibility", Integer.valueOf(v0_0.getVisibility()));
        v3_1.put("android:visibility:parent", v0_0.getParent());
        int[] v1_1 = new int[2];
        v0_0.getLocationOnScreen(v1_1);
        v3_1.put("android:visibility:screenLocation", v1_1);
        return;
    }

    public static float O(f2.a0 p1, float p2)
    {
        if (p1 != 0) {
            float v1_3 = ((Float) p1.a.get("android:fade:transitionAlpha"));
            if (v1_3 != 0) {
                return v1_3.floatValue();
            }
        }
        return p2;
    }

    public static f2.h0 P(f2.a0 p8, f2.a0 p9)
    {
        f2.h0 v0_1 = new f2.h0();
        v0_1.a = 0;
        v0_1.b = 0;
        if (p8 == null) {
            v0_1.c = -1;
            v0_1.e = 0;
        } else {
            java.util.HashMap v6_0 = p8.a;
            if (!v6_0.containsKey("android:visibility:visibility")) {
            } else {
                v0_1.c = ((Integer) v6_0.get("android:visibility:visibility")).intValue();
                v0_1.e = ((android.view.ViewGroup) v6_0.get("android:visibility:parent"));
            }
        }
        if (p9 == 0) {
            v0_1.d = -1;
            v0_1.f = 0;
        } else {
            java.util.HashMap v6_3 = p9.a;
            if (!v6_3.containsKey("android:visibility:visibility")) {
            } else {
                v0_1.d = ((Integer) v6_3.get("android:visibility:visibility")).intValue();
                v0_1.f = ((android.view.ViewGroup) v6_3.get("android:visibility:parent"));
            }
        }
        if ((p8 == null) || (p9 == 0)) {
            if ((p8 != null) || (v0_1.d != 0)) {
                if ((p9 == 0) && (v0_1.c == 0)) {
                    v0_1.b = 0;
                    v0_1.a = 1;
                }
            } else {
                v0_1.b = 1;
                v0_1.a = 1;
                return v0_1;
            }
        } else {
            android.view.ViewGroup v8_3 = v0_1.c;
            int v9_1 = v0_1.d;
            if ((v8_3 != v9_1) || (v0_1.e != v0_1.f)) {
                if (v8_3 == v9_1) {
                    if (v0_1.f != null) {
                        if (v0_1.e == null) {
                            v0_1.b = 1;
                            v0_1.a = 1;
                            return v0_1;
                        }
                    } else {
                        v0_1.b = 0;
                        v0_1.a = 1;
                        return v0_1;
                    }
                } else {
                    if (v8_3 != null) {
                        if (v9_1 == 0) {
                            v0_1.b = 1;
                            v0_1.a = 1;
                            return v0_1;
                        }
                    } else {
                        v0_1.b = 0;
                        v0_1.a = 1;
                        return v0_1;
                    }
                }
            }
        }
        return v0_1;
    }

    public final android.animation.ObjectAnimator N(android.view.View p3, float p4, float p5)
    {
        if (p4 != p5) {
            f2.c0.a.S(p3, p4);
            float[] v0_3 = new float[1];
            v0_3[0] = p5;
            android.animation.ObjectAnimator v4_1 = android.animation.ObjectAnimator.ofFloat(p3, f2.c0.b, v0_3);
            f2.g v5_2 = new f2.g(p3);
            v4_1.addListener(v5_2);
            this.r().a(v5_2);
            return v4_1;
        } else {
            return 0;
        }
    }

    public final void e(f2.a0 p1)
    {
        f2.h.M(p1);
        return;
    }

    public final void j(f2.a0 p3)
    {
        f2.h.M(p3);
        int v0_0 = p3.b;
        Float v1_0 = ((Float) v0_0.getTag(2131362552));
        if (v1_0 == null) {
            if (v0_0.getVisibility() != 0) {
                v1_0 = Float.valueOf(0);
            } else {
                v1_0 = Float.valueOf(f2.c0.a.G(v0_0));
            }
        }
        p3.a.put("android:fade:transitionAlpha", v1_0);
        return;
    }

    public final android.animation.Animator n(android.view.ViewGroup p25, f2.a0 p26, f2.a0 p27)
    {
        int v16;
        int v4_11 = f2.h.P(p26, p27);
        if ((!v4_11.a) || ((v4_11.e == null) && (v4_11.f == null))) {
            v16 = 0;
        } else {
            int v7_0 = this.H;
            int v10_2 = 1;
            if (!v4_11.b) {
                int v4_4 = v4_11.d;
                if (((v7_0 & 2) == 2) && (p26 != null)) {
                    int v12_4;
                    int v7_2 = p26.b;
                    if (p27 == null) {
                        v12_4 = 0;
                    } else {
                        v12_4 = p27.b;
                    }
                    int v18;
                    int v17;
                    f2.h v22;
                    android.graphics.Matrix v6_0;
                    float v14_3 = ((android.view.View) v7_2.getTag(2131362366));
                    if (v14_3 == 0) {
                        if ((v12_4 != 0) && (v12_4.getParent() != null)) {
                            if ((v4_4 != 4) && (v7_2 != v12_4)) {
                                int v15_4 = 1;
                                v12_4 = 0;
                                float v14_7 = 0;
                            } else {
                                v15_4 = 0;
                                v14_7 = v12_4;
                                v12_4 = 0;
                            }
                        } else {
                            if (v12_4 == 0) {
                            } else {
                                v15_4 = 0;
                            }
                        }
                        int v21;
                        if (v15_4 == 0) {
                            v22 = v4_4;
                            v18 = 1;
                            v17 = 0;
                            v21 = v14_7;
                            v16 = 0;
                            v14_3 = v12_4;
                        } else {
                            if (v7_2.getParent() != null) {
                                if (!(v7_2.getParent() instanceof android.view.View)) {
                                } else {
                                    int v15_9 = ((android.view.View) v7_2.getParent());
                                    v16 = 0;
                                    v17 = 0;
                                    if (f2.h.P(this.u(v15_9, 1), this.q(v15_9, 1)).a) {
                                        v22 = v4_4;
                                        v18 = 1;
                                        v21 = v14_7;
                                        android.graphics.Bitmap v0_23 = v15_9.getId();
                                        if ((v15_9.getParent() != null) || (v0_23 == -1)) {
                                        } else {
                                            p25.findViewById(v0_23);
                                        }
                                    } else {
                                        int v19_1;
                                        android.graphics.Matrix v6_5 = new android.graphics.Matrix();
                                        v6_5.setTranslate(((float) (- v15_9.getScrollX())), ((float) (- v15_9.getScrollY())));
                                        float v11_9 = f2.c0.a;
                                        v11_9.X(v7_2, v6_5);
                                        v11_9.Y(p25, v6_5);
                                        float v11_1 = new android.graphics.RectF(0, 0, ((float) v7_2.getWidth()), ((float) v7_2.getHeight()));
                                        v6_5.mapRect(v11_1);
                                        int v12_3 = Math.round(v11_1.left);
                                        int v15_3 = Math.round(v11_1.top);
                                        v18 = 1;
                                        int v10_1 = Math.round(v11_1.right);
                                        int v13_1 = Math.round(v11_1.bottom);
                                        android.widget.ImageView v9_1 = new android.widget.ImageView(v7_2.getContext());
                                        v9_1.setScaleType(android.widget.ImageView$ScaleType.CENTER_CROP);
                                        int v5_4 = v7_2.isAttachedToWindow();
                                        if ((p25 == null) || (!p25.isAttachedToWindow())) {
                                            v19_1 = 0;
                                        } else {
                                            v19_1 = 1;
                                        }
                                        int v5_5;
                                        android.graphics.Bitmap v0_1;
                                        android.view.ViewGroup v8_0;
                                        int v19_2;
                                        if (v5_4 != 0) {
                                            v19_2 = v5_4;
                                            v8_0 = 0;
                                            v5_5 = 0;
                                            v21 = v14_7;
                                            float v14_0 = Math.round(v11_1.width());
                                            v22 = v4_4;
                                            int v4_0 = Math.round(v11_1.height());
                                            if ((v14_0 <= 0) || (v4_0 <= 0)) {
                                                v0_1 = 0;
                                            } else {
                                                android.view.ViewGroupOverlay v3_3 = Math.min(1065353216, (1233125376 / ((float) (v14_0 * v4_0))));
                                                android.graphics.Bitmap v0_5 = Math.round((((float) v14_0) * v3_3));
                                                int v4_3 = Math.round((((float) v4_0) * v3_3));
                                                v6_5.postTranslate((- v11_1.left), (- v11_1.top));
                                                v6_5.postScale(v3_3, v3_3);
                                                if (!f2.z.a) {
                                                    v0_1 = android.graphics.Bitmap.createBitmap(v0_5, v4_3, android.graphics.Bitmap$Config.ARGB_8888);
                                                    android.view.ViewGroupOverlay v3_7 = new android.graphics.Canvas(v0_1);
                                                    v3_7.concat(v6_5);
                                                    v7_2.draw(v3_7);
                                                } else {
                                                    android.view.ViewGroupOverlay v3_9 = new android.graphics.Picture();
                                                    android.graphics.Bitmap v0_6 = v3_9.beginRecording(v0_5, v4_3);
                                                    v0_6.concat(v6_5);
                                                    v7_2.draw(v0_6);
                                                    v3_9.endRecording();
                                                    v0_1 = e0.a.b(v3_9);
                                                }
                                            }
                                            if (v19_2 == 0) {
                                                p25.getOverlay().remove(v7_2);
                                                v8_0.addView(v7_2, v5_5);
                                            }
                                        } else {
                                            if (v19_1 != 0) {
                                                v8_0 = ((android.view.ViewGroup) v7_2.getParent());
                                                int v19_4 = v8_0.indexOfChild(v7_2);
                                                q0.q0.a(p25, v7_2);
                                                v19_2 = v5_4;
                                                v5_5 = v19_4;
                                            } else {
                                                v22 = v4_4;
                                                v21 = v14_7;
                                                v0_1 = 0;
                                            }
                                        }
                                        if (v0_1 != null) {
                                            v9_1.setImageBitmap(v0_1);
                                        }
                                        v9_1.measure(android.view.View$MeasureSpec.makeMeasureSpec((v10_1 - v12_3), 1073741824), android.view.View$MeasureSpec.makeMeasureSpec((v13_1 - v15_3), 1073741824));
                                        v9_1.layout(v12_3, v15_3, v10_1, v13_1);
                                        v14_3 = v9_1;
                                    }
                                }
                            } else {
                                v22 = v4_4;
                                v18 = 1;
                                v10_2 = 0;
                                v17 = 0;
                                v6_0 = v14_7;
                                v16 = 0;
                                v14_3 = v7_2;
                                if (v14_3 == 0) {
                                    if (v6_0 != null) {
                                        android.graphics.Bitmap v0_9 = v6_0.getVisibility();
                                        f2.c0.b(v6_0, v17);
                                        f2.s v1_2 = f2.c0.a;
                                        v1_2.getClass();
                                        android.animation.ObjectAnimator v2_2 = this.N(v6_0, f2.h.O(p26, 1065353216), 0);
                                        if (v2_2 == null) {
                                            v1_2.S(v6_0, f2.h.O(p27, 1065353216));
                                        }
                                        if (v2_2 == null) {
                                            f2.c0.b(v6_0, v0_9);
                                            return v2_2;
                                        } else {
                                            android.graphics.Bitmap v0_11 = new f2.f0(v6_0, v22);
                                            v2_2.addListener(v0_11);
                                            this.r().a(v0_11);
                                            return v2_2;
                                        }
                                    }
                                } else {
                                    if (v10_2 == 0) {
                                        android.graphics.Bitmap v0_14 = ((int[]) p26.a.get("android:visibility:screenLocation"));
                                        android.view.ViewGroupOverlay v3_16 = v0_14[v17];
                                        android.graphics.Bitmap v0_15 = v0_14[v18];
                                        int v4_8 = new int[2];
                                        p25.getLocationOnScreen(v4_8);
                                        v14_3.offsetLeftAndRight(((v3_16 - v4_8[v17]) - v14_3.getLeft()));
                                        v14_3.offsetTopAndBottom(((v0_15 - v4_8[v18]) - v14_3.getTop()));
                                        q0.q0.a(p25, v14_3);
                                    }
                                    android.graphics.Bitmap v0_18 = f2.c0.a;
                                    v0_18.getClass();
                                    android.animation.ObjectAnimator v2_4 = this.N(v14_3, f2.h.O(p26, 1065353216), 0);
                                    if (v2_4 == null) {
                                        v0_18.S(v14_3, f2.h.O(p27, 1065353216));
                                    }
                                    if (v10_2 == 0) {
                                        if (v2_4 != null) {
                                            v7_2.setTag(2131362366, v14_3);
                                            android.graphics.Bitmap v0_21 = new f2.g0(this, p25, v14_3, v7_2);
                                            v2_4.addListener(v0_21);
                                            v2_4.addPauseListener(v0_21);
                                            this.r().a(v0_21);
                                        } else {
                                            p25.getOverlay().remove(v14_3);
                                            return v2_4;
                                        }
                                    }
                                    return v2_4;
                                }
                                return v16;
                            }
                        }
                        v10_2 = v17;
                        v6_0 = v21;
                    } else {
                        v22 = v4_4;
                        v18 = 1;
                        v17 = 0;
                        v6_0 = 0;
                        v16 = 0;
                    }
                }
            } else {
                if (((v7_0 & 1) == 1) && (p27 != null)) {
                    f2.s v1_7 = p27.b;
                    if (p26 == null) {
                        android.view.ViewGroupOverlay v3_25 = ((android.view.View) v1_7.getParent());
                        if (f2.h.P(this.q(v3_25, 0), this.u(v3_25, 0)).a) {
                        }
                    }
                    f2.c0.a.getClass();
                    return this.N(v1_7, f2.h.O(p26, 0), 1065353216);
                }
            }
        }
        return v16;
    }

    public final String[] t()
    {
        return f2.h.I;
    }

    public final boolean v(f2.a0 p4, f2.a0 p5)
    {
        if (((p4 != 0) || (p5 != 0)) && ((p4 == 0) || ((p5 == 0) || (p5.a.containsKey("android:visibility:visibility") == p4.a.containsKey("android:visibility:visibility"))))) {
            int v4_1 = f2.h.P(p4, p5);
            if ((v4_1.a) && ((v4_1.c == 0) || (v4_1.d == 0))) {
                return 1;
            }
        }
        return 0;
    }
}
