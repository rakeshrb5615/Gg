package y0;
public abstract class d {

    public static void a(com.google.android.material.textfield.TextInputLayout p5, com.google.android.material.internal.CheckableImageButton p6, android.content.res.ColorStateList p7, android.graphics.PorterDuff$Mode p8)
    {
        android.graphics.drawable.Drawable v0 = p6.getDrawable();
        if (v0 != null) {
            v0 = v0.mutate();
            if ((p7 == null) || (!p7.isStateful())) {
                v0.setTintList(p7);
            } else {
                android.content.res.ColorStateList v5_1 = p5.getDrawableState();
                int v1_0 = p6.getDrawableState();
                int v2 = v5_1.length;
                android.content.res.ColorStateList v5_2 = java.util.Arrays.copyOf(v5_1, (v5_1.length + v1_0.length));
                System.arraycopy(v1_0, 0, v5_2, v2, v1_0.length);
                v0.setTintList(android.content.res.ColorStateList.valueOf(p7.getColorForState(v5_2, p7.getDefaultColor())));
            }
            if (p8 != null) {
                v0.setTintMode(p8);
            }
        }
        if (p6.getDrawable() != v0) {
            p6.setImageDrawable(v0);
        }
        return;
    }

    public static boolean b(int p8, android.graphics.Rect p9, android.graphics.Rect p10, android.graphics.Rect p11)
    {
        String v0_0 = y0.d.c(p8, p9, p10);
        if ((!y0.d.c(p8, p9, p11)) && (v0_0 != null)) {
            if (p8 == 17) {
                if (p9.left >= p11.right) {
                    if ((p8 != 17) && (p8 != 66)) {
                        IllegalArgumentException v8_3;
                        int v9_1;
                        int v10_1 = y0.d.f(p8, p9, p10);
                        if (p8 == 17) {
                            v8_3 = p9.left;
                            v9_1 = p11.left;
                        } else {
                            if (p8 == 33) {
                                v8_3 = p9.top;
                                v9_1 = p11.top;
                            } else {
                                if (p8 == 66) {
                                    v8_3 = p11.right;
                                    v9_1 = p9.right;
                                } else {
                                    if (p8 != 130) {
                                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    } else {
                                        v8_3 = p11.bottom;
                                        v9_1 = p9.bottom;
                                    }
                                }
                            }
                        }
                        if (v10_1 >= Math.max(1, (v8_3 - v9_1))) {
                            return 0;
                        }
                    }
                }
            } else {
                if (p8 == 33) {
                    if (p9.top >= p11.bottom) {
                    }
                } else {
                    if (p8 == 66) {
                        if (p9.right <= p11.left) {
                        }
                    } else {
                        if (p8 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        } else {
                            if (p9.bottom <= p11.top) {
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return 0;
    }

    public static boolean c(int p1, android.graphics.Rect p2, android.graphics.Rect p3)
    {
        if (p1 == 17) {
            if ((p3.bottom < p2.top) || (p3.top > p2.bottom)) {
                return 0;
            } else {
                return 1;
            }
            if ((p3.right < p2.left) || (p3.left > p2.right)) {
                return 0;
            }
        } else {
            if (p1 != 33) {
                if (p1 == 66) {
                } else {
                    if (p1 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return 1;
    }

    public static android.widget.ImageView$ScaleType d(int p1)
    {
        if (p1 == null) {
            return android.widget.ImageView$ScaleType.FIT_XY;
        } else {
            if (p1 == 1) {
                return android.widget.ImageView$ScaleType.FIT_START;
            } else {
                if (p1 == 2) {
                    return android.widget.ImageView$ScaleType.FIT_CENTER;
                } else {
                    if (p1 == 3) {
                        return android.widget.ImageView$ScaleType.FIT_END;
                    } else {
                        if (p1 == 5) {
                            return android.widget.ImageView$ScaleType.CENTER_CROP;
                        } else {
                            if (p1 == 6) {
                                return android.widget.ImageView$ScaleType.CENTER_INSIDE;
                            } else {
                                return android.widget.ImageView$ScaleType.CENTER;
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean e(int p1, android.graphics.Rect p2, android.graphics.Rect p3)
    {
        if (p1 == 17) {
            int v0_5 = p3.right;
            if (((p2.right > v0_5) || (p2.left >= v0_5)) && (p2.left > p3.left)) {
                return 1;
            }
        } else {
            if (p1 == 33) {
                int v0_2 = p3.bottom;
                if (((p2.bottom > v0_2) || (p2.top >= v0_2)) && (p2.top > p3.top)) {
                    return 1;
                }
            } else {
                if (p1 == 66) {
                    int v0_4 = p3.left;
                    if (((p2.left < v0_4) || (p2.right <= v0_4)) && (p2.right < p3.right)) {
                        return 1;
                    }
                } else {
                    if (p1 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    } else {
                        int v0_7 = p3.top;
                        if (((p2.top < v0_7) || (p2.bottom <= v0_7)) && (p2.bottom < p3.bottom)) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static int f(int p1, android.graphics.Rect p2, android.graphics.Rect p3)
    {
        String v2_1;
        IllegalArgumentException v1_1;
        if (p1 == 17) {
            v1_1 = p2.left;
            v2_1 = p3.right;
        } else {
            if (p1 == 33) {
                v1_1 = p2.top;
                v2_1 = p3.bottom;
            } else {
                if (p1 == 66) {
                    v1_1 = p3.left;
                    v2_1 = p2.right;
                } else {
                    if (p1 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    } else {
                        v1_1 = p3.top;
                        v2_1 = p2.bottom;
                    }
                }
            }
        }
        return Math.max(0, (v1_1 - v2_1));
    }

    public static int g(int p1, android.graphics.Rect p2, android.graphics.Rect p3)
    {
        if (p1 != 17) {
            if (p1 != 33) {
                if (p1 == 66) {
                    return Math.abs((((p2.height() / 2) + p2.top) - ((p3.height() / 2) + p3.top)));
                } else {
                    if (p1 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((((p2.width() / 2) + p2.left) - ((p3.width() / 2) + p3.left)));
        }
        return Math.abs((((p2.height() / 2) + p2.top) - ((p3.height() / 2) + p3.top)));
    }

    public static void h(com.google.android.material.textfield.TextInputLayout p5, com.google.android.material.internal.CheckableImageButton p6, android.content.res.ColorStateList p7)
    {
        android.graphics.drawable.Drawable v0 = p6.getDrawable();
        if ((p6.getDrawable() != null) && ((p7 != null) && (p7.isStateful()))) {
            android.content.res.ColorStateList v5_1 = p5.getDrawableState();
            int v1_0 = p6.getDrawableState();
            int v2 = v5_1.length;
            android.content.res.ColorStateList v5_2 = java.util.Arrays.copyOf(v5_1, (v5_1.length + v1_0.length));
            System.arraycopy(v1_0, 0, v5_2, v2, v1_0.length);
            android.content.res.ColorStateList v5_3 = p7.getColorForState(v5_2, p7.getDefaultColor());
            android.graphics.drawable.Drawable v7_1 = v0.mutate();
            v7_1.setTintList(android.content.res.ColorStateList.valueOf(v5_3));
            p6.setImageDrawable(v7_1);
        }
        return;
    }

    public static void i(com.google.android.material.internal.CheckableImageButton p3, android.view.View$OnLongClickListener p4)
    {
        int v4_1;
        boolean v0 = p3.hasOnClickListeners();
        int v1 = 0;
        int v2 = 1;
        if (p4 == 0) {
            v4_1 = 0;
        } else {
            v4_1 = 1;
        }
        if ((v0) || (v4_1 != 0)) {
            v1 = 1;
        }
        p3.setFocusable(v1);
        p3.setClickable(v0);
        p3.setPressable(v0);
        p3.setLongClickable(v4_1);
        if (v1 == 0) {
            v2 = 2;
        }
        p3.setImportantForAccessibility(v2);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzajb j(y4.c p11, String p12)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11);
        if (!(p11 instanceof y4.n)) {
            if (!(p11 instanceof y4.e)) {
                if (!(p11 instanceof y4.a0)) {
                    if (!(p11 instanceof y4.m)) {
                        if (!(p11 instanceof y4.x)) {
                            if (!(p11 instanceof y4.g0)) {
                                throw new IllegalArgumentException("Unsupported credential type.");
                            } else {
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(((y4.g0) p11));
                                String v12_4 = ((y4.g0) p11).d;
                                if (v12_4 == null) {
                                    return new com.google.android.gms.internal.firebase-auth-api.zzajb(((y4.g0) p11).b, ((y4.g0) p11).c, ((y4.g0) p11).a, 0, ((y4.g0) p11).f, 0, p12, ((y4.g0) p11).e, ((y4.g0) p11).m);
                                } else {
                                    return v12_4;
                                }
                            }
                        } else {
                            com.google.android.gms.common.internal.Preconditions.checkNotNull(((y4.x) p11));
                            return new com.google.android.gms.internal.firebase-auth-api.zzajb(0, 0, "playgames.google.com", 0, 0, ((y4.x) p11).a, p12, 0, 0);
                        }
                    } else {
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(((y4.m) p11));
                        return new com.google.android.gms.internal.firebase-auth-api.zzajb(0, ((y4.m) p11).a, "github.com", 0, 0, 0, p12, 0, 0);
                    }
                } else {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(((y4.a0) p11));
                    return new com.google.android.gms.internal.firebase-auth-api.zzajb(0, ((y4.a0) p11).a, "twitter.com", 0, ((y4.a0) p11).b, 0, p12, 0, 0);
                }
            } else {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(((y4.e) p11));
                return new com.google.android.gms.internal.firebase-auth-api.zzajb(0, ((y4.e) p11).a, "facebook.com", 0, 0, 0, p12, 0, 0);
            }
        } else {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(((y4.n) p11));
            return new com.google.android.gms.internal.firebase-auth-api.zzajb(((y4.n) p11).a, ((y4.n) p11).b, "google.com", 0, 0, 0, p12, 0, 0);
        }
    }
}
