package n;
public final class n2 {
    public static final android.graphics.PorterDuff$Mode f;
    public static n.n2 g;
    public static final n.m2 h;
    public java.util.WeakHashMap a;
    public final java.util.WeakHashMap b;
    public android.util.TypedValue c;
    public boolean d;
    public a5.z e;

    static n2()
    {
        n.n2.f = android.graphics.PorterDuff$Mode.SRC_IN;
        n.n2.h = new n.m2(6);
        return;
    }

    public n2()
    {
        this.b = new java.util.WeakHashMap(0);
        return;
    }

    public static declared_synchronized n.n2 b()
    {
        if (n.n2.g == null) {
            n.n2.g = new n.n2();
        }
        return n.n2.g;
    }

    public static declared_synchronized android.graphics.PorterDuffColorFilter e(int p4, android.graphics.PorterDuff$Mode p5)
    {
        n.m2 v1 = n.n2.h;
        v1.getClass();
        int v3_1 = ((31 + p4) * 31);
        android.graphics.PorterDuffColorFilter v2_2 = ((android.graphics.PorterDuffColorFilter) v1.get(Integer.valueOf((p5.hashCode() + v3_1))));
        if (v2_2 == null) {
            v2_2 = new android.graphics.PorterDuffColorFilter(p4, p5);
            v1.put(Integer.valueOf((p5.hashCode() + v3_1)), v2_2);
        }
        return v2_2;
    }

    public final android.graphics.drawable.Drawable a(android.content.Context p10, int p11)
    {
        if (this.c == null) {
            this.c = new android.util.TypedValue();
        }
        r.g v0_3 = this.c;
        p10.getResources().getValue(p11, v0_3, 1);
        long v1_3 = ((((long) v0_3.assetCookie) << 32) | ((long) v0_3.data));
        java.util.WeakHashMap v3_5 = ((r.g) this.b.get(p10));
        android.graphics.drawable.LayerDrawable v4_0 = 0;
        if (v3_5 != null) {
            int v5_1 = ((ref.WeakReference) v3_5.b(v1_3));
            if (v5_1 != 0) {
                int v5_3 = ((android.graphics.drawable.Drawable$ConstantState) v5_1.get());
                if (v5_3 == 0) {
                    int v5_5 = s.a.b(v3_5.b, v3_5.d, v1_3);
                    if (v5_5 >= 0) {
                        Object[] v6_1 = v3_5.c;
                        Object v8 = r.h.a;
                        if (v6_1[v5_5] != v8) {
                            v6_1[v5_5] = v8;
                            v3_5.a = 1;
                        }
                    }
                } else {
                    v4_0 = v5_3.newDrawable(p10.getResources());
                }
            }
        }
        if (v4_0 == null) {
            android.graphics.drawable.LayerDrawable v4_1 = 0;
            if (this.e != null) {
                if (p11 != 2131230996) {
                    if (p11 != 2131231031) {
                        if (p11 != 2131231030) {
                            if (p11 == 2131231032) {
                                v4_1 = a5.z.p(this, p10, 2131165245);
                            }
                        } else {
                            v4_1 = a5.z.p(this, p10, 2131165244);
                        }
                    } else {
                        v4_1 = a5.z.p(this, p10, 2131165243);
                    }
                } else {
                    v4_1 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[] {this.c(p10, 2131230995), this.c(p10, 2131230997)}));
                }
            }
            if (v4_1 == null) {
                return v4_1;
            } else {
                v4_1.setChangingConfigurations(v0_3.changingConfigurations);
                int v11_8 = v4_1.getConstantState();
                if (v11_8 != 0) {
                    r.g v0_6 = ((r.g) this.b.get(p10));
                    if (v0_6 == null) {
                        v0_6 = new r.g();
                        this.b.put(p10, v0_6);
                    }
                    v0_6.e(v1_3, new ref.WeakReference(v11_8));
                }
                return v4_1;
            }
        } else {
            return v4_0;
        }
    }

    public final declared_synchronized android.graphics.drawable.Drawable c(android.content.Context p2, int p3)
    {
        return this.d(p2, p3, 0);
    }

    public final declared_synchronized android.graphics.drawable.Drawable d(android.content.Context p3, int p4, boolean p5)
    {
        if (!this.d) {
            this.d = 1;
            android.graphics.drawable.Drawable v0_7 = this.c(p3, 2131231058);
            if ((v0_7 == null) || ((!(v0_7 instanceof g2.q)) && (!"android.graphics.drawable.VectorDrawable".equals(v0_7.getClass().getName())))) {
                this.d = 0;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        } else {
        }
        android.graphics.drawable.Drawable v0_5 = this.a(p3, p4);
        if (v0_5 == null) {
            v0_5 = e0.c.getDrawable(p3, p4);
        }
        if (v0_5 != null) {
            v0_5 = this.g(p3, p4, p5, v0_5);
        }
        if (v0_5 != null) {
            n.n1.a(v0_5);
        }
        return v0_5;
    }

    public final declared_synchronized android.content.res.ColorStateList f(android.content.Context p4, int p5)
    {
        r.k v0_1;
        r.k v0_0 = this.a;
        android.content.res.ColorStateList v1 = 0;
        if (v0_0 == null) {
            v0_1 = 0;
        } else {
            r.k v0_11 = ((r.k) v0_0.get(p4));
            if (v0_11 == null) {
            } else {
                v0_1 = ((android.content.res.ColorStateList) v0_11.b(p5));
            }
        }
        if (v0_1 == null) {
            r.k v0_2 = this.e;
            if (v0_2 != null) {
                v1 = v0_2.r(p4, p5);
            } else {
            }
            if (v1 != null) {
                if (this.a == null) {
                    this.a = new java.util.WeakHashMap();
                }
                r.k v0_8 = ((r.k) this.a.get(p4));
                if (v0_8 == null) {
                    v0_8 = new r.k();
                    this.a.put(p4, v0_8);
                }
                v0_8.a(p5, v1);
            }
            v0_1 = v1;
        }
        return v0_1;
    }

    public final android.graphics.drawable.Drawable g(android.content.Context p8, int p9, boolean p10, android.graphics.drawable.Drawable p11)
    {
        int v0_0 = this.f(p8, p9);
        android.graphics.PorterDuff$Mode v1_1 = 0;
        if (v0_0 == 0) {
            if (this.e != null) {
                if (p9 != 2131231040) {
                    if ((p9 == 2131231031) || ((p9 == 2131231030) || (p9 == 2131231032))) {
                        android.graphics.PorterDuff$Mode v1_2 = n.u.b;
                        a5.z.u(((android.graphics.drawable.LayerDrawable) p11).findDrawableByLayerId(16908288), n.t2.b(p8, 2130968849), v1_2);
                        a5.z.u(((android.graphics.drawable.LayerDrawable) p11).findDrawableByLayerId(16908303), n.t2.c(p8, 2130968847), v1_2);
                        a5.z.u(((android.graphics.drawable.LayerDrawable) p11).findDrawableByLayerId(16908301), n.t2.c(p8, 2130968847), v1_2);
                        return p11;
                    }
                } else {
                    android.graphics.PorterDuff$Mode v1_0 = n.u.b;
                    a5.z.u(((android.graphics.drawable.LayerDrawable) p11).findDrawableByLayerId(16908288), n.t2.c(p8, 2130968849), v1_0);
                    a5.z.u(((android.graphics.drawable.LayerDrawable) p11).findDrawableByLayerId(16908303), n.t2.c(p8, 2130968849), v1_0);
                    a5.z.u(((android.graphics.drawable.LayerDrawable) p11).findDrawableByLayerId(16908301), n.t2.c(p8, 2130968847), v1_0);
                    return p11;
                }
            }
            int v0_6 = this.e;
            int v2_0 = 0;
            if (v0_6 != 0) {
                int v0_14;
                android.graphics.drawable.Drawable v4_7;
                android.graphics.drawable.Drawable v9_2;
                android.graphics.PorterDuff$Mode v3_0 = n.u.b;
                if (!a5.z.k(((int[]) v0_6.a), p9)) {
                    if (!a5.z.k(((int[]) v0_6.c), p9)) {
                        if (!a5.z.k(((int[]) v0_6.d), p9)) {
                            if (p9 != 2131231017) {
                                if (p9 != 2131230999) {
                                    v9_2 = 0;
                                    v4_7 = 0;
                                    v0_14 = -1;
                                    if (v4_7 != null) {
                                        int v2_1 = p11.mutate();
                                        v2_1.setColorFilter(n.u.c(n.t2.c(p8, v9_2), v3_0));
                                        if (v0_14 != -1) {
                                            v2_1.setAlpha(v0_14);
                                        }
                                        v2_0 = 1;
                                    }
                                    if ((v2_0 != 0) || (p10 == null)) {
                                        return p11;
                                    } else {
                                        return 0;
                                    }
                                }
                            } else {
                                v0_14 = Math.round(1109603123);
                                v9_2 = 16842800;
                                v4_7 = 1;
                            }
                        } else {
                            v3_0 = android.graphics.PorterDuff$Mode.MULTIPLY;
                        }
                        v9_2 = 16842801;
                        v4_7 = 1;
                    } else {
                        v9_2 = 2130968847;
                    }
                } else {
                    v9_2 = 2130968849;
                }
            }
        } else {
            android.graphics.PorterDuffColorFilter v8_2 = p11.mutate();
            v8_2.setTintList(v0_0);
            if ((this.e != null) && (p9 == 2131231045)) {
                v1_1 = android.graphics.PorterDuff$Mode.MULTIPLY;
            }
            if (v1_1 != null) {
                v8_2.setTintMode(v1_1);
            }
            return v8_2;
        }
    }
}
