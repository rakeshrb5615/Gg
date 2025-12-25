package i2;
public final class l {
    public static i2.l r;
    public final android.content.Context a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final android.content.SharedPreferences q;

    public l(android.content.Context p6)
    {
        android.content.Context v0 = p6.getApplicationContext();
        this.a = v0;
        this.q = j5.t1.z(p6);
        int v1_4 = p6.getResources();
        this.b = e0.c.getColor(p6, 2131099794);
        this.c = e0.c.getColor(p6, 2131100822);
        this.d = e0.c.getColor(p6, 2131100819);
        this.e = e0.c.getColor(p6, 2131100820);
        this.f = v1_4.getString(2131952366);
        this.g = v1_4.getString(2131952372);
        this.h = v1_4.getString(2131952478);
        this.i = v1_4.getString(2131952383);
        this.j = v1_4.getString(2131952363);
        this.k = p6.getResources().getString(2131952216);
        this.l = p6.getResources().getString(2131951755);
        p6.getResources().getString(2131952347);
        v1_4.getString(2131952205);
        v1_4.getString(2131952359);
        this.m = p6.getResources().getString(2131952087);
        v1_4.getString(2131951892);
        v1_4.getString(2131952297);
        this.n = p6.getString(2131951815);
        this.o = p6.getString(2131951749);
        this.p = p6.getString(2131952299);
        e0.c.getColor(v0, 2131099794);
        e0.c.getColor(v0, 2131099794);
        e0.c.getColor(v0, 2131099782);
        e0.c.getColor(v0, 2131100830);
        e0.c.getColor(v0, 2131099806);
        e0.c.getColor(v0, 2131099783);
        return;
    }

    public static int a(int p3, float p4)
    {
        float[] v0_1 = new float[3];
        h0.a.b(android.graphics.Color.red(p3), android.graphics.Color.green(p3), android.graphics.Color.blue(p3), v0_1);
        v0_1[2] = Math.max(0, Math.min(1065353216, (v0_1[2] * p4)));
        return h0.a.a(v0_1);
    }

    public static int b(int p3, float p4)
    {
        float[] v0_1 = new float[3];
        android.graphics.Color.colorToHSV(p3, v0_1);
        int v2_2 = (v0_1[1] * p4);
        v0_1[1] = v2_2;
        v0_1[1] = Math.max(0, Math.min(1065353216, v2_2));
        return android.graphics.Color.HSVToColor(android.graphics.Color.alpha(p3), v0_1);
    }

    public static int d(int p7, int p8, double p9)
    {
        double v0_1 = (4607182418800017408 - p9);
        return android.graphics.Color.rgb(Math.min(((int) ((((double) android.graphics.Color.red(p8)) * p9) + (((double) android.graphics.Color.red(p7)) * v0_1))), 255), Math.min(((int) ((((double) android.graphics.Color.green(p8)) * p9) + (((double) android.graphics.Color.green(p7)) * v0_1))), 255), Math.min(((int) ((p9 * ((double) android.graphics.Color.blue(p8))) + (v0_1 * ((double) android.graphics.Color.blue(p7))))), 255));
    }

    public static int e(int p4)
    {
        return android.graphics.Color.rgb(Math.min(255, Math.max(0, android.graphics.Color.red(p4))), Math.min(255, Math.max(0, android.graphics.Color.green(p4))), Math.min(255, Math.max(0, android.graphics.Color.blue(p4))));
    }

    public static int f(int p5, int p6, float p7, float p8, float p9, float p10)
    {
        int v0 = android.graphics.Color.red(p5);
        int v1 = android.graphics.Color.green(p5);
        int v5_1 = android.graphics.Color.blue(p5);
        int v2 = android.graphics.Color.red(p6);
        int v3 = android.graphics.Color.green(p6);
        int v4 = android.graphics.Color.blue(p6);
        if ((v0 != v2) || ((v1 != v3) || (v5_1 != v4))) {
            int v7_5;
            int v8_3 = (((1065353216 / (p9 - p8)) * (p7 - p8)) * p10);
            int v6_2 = (1065353216 - v8_3);
            int v7_4 = ((int) ((((float) v2) * v8_3) + (((float) v0) * v6_2)));
            int v9_7 = ((int) ((((float) v3) * v8_3) + (((float) v1) * v6_2)));
            int v6_6 = ((int) ((((float) v4) * v8_3) + (((float) v5_1) * v6_2)));
            if (v0 <= v2) {
                v7_5 = Math.min(v7_4, v2);
            } else {
                v7_5 = Math.max(v7_4, v2);
            }
            int v8_4;
            if (v1 <= v3) {
                v8_4 = Math.min(v9_7, v3);
            } else {
                v8_4 = Math.max(v9_7, v3);
            }
            int v5_2;
            if (v5_1 <= v4) {
                v5_2 = Math.min(v6_6, v4);
            } else {
                v5_2 = Math.max(v6_6, v4);
            }
            return android.graphics.Color.rgb(v7_5, v8_4, v5_2);
        } else {
            return p6;
        }
    }

    public static void g(int[] p2, int p3)
    {
        p2[0] = ((p3 >> 24) & 255);
        p2[1] = ((p3 >> 16) & 255);
        p2[2] = ((p3 >> 8) & 255);
        p2[3] = (p3 & 255);
        return;
    }

    public static int[] h(int p3)
    {
        return new int[] {((p3 >> 24) & 255), ((p3 >> 16) & 255), ((p3 >> 8) & 255), (p3 & 255)});
    }

    public static void i(android.view.View p4, int p5, int p6)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        if (!(p4 instanceof android.widget.TextView)) {
            if ((p4 instanceof android.widget.ImageView)) {
                android.animation.ValueAnimator v4_8 = ((android.widget.ImageView) p4).getDrawable();
                if (v4_8 != null) {
                    v0_1.add(v4_8.mutate());
                }
            }
        } else {
            android.animation.ValueAnimator v4_3 = ((android.widget.TextView) p4).getCompoundDrawables();
            boolean v1_0 = v4_3.length;
            int v2 = 0;
            while (v2 < v1_0) {
                android.graphics.drawable.Drawable v3_0 = v4_3[v2];
                if (v3_0 != null) {
                    v0_1.add(v3_0.mutate());
                }
                v2++;
            }
        }
        if (!v0_1.isEmpty()) {
            android.animation.ValueAnimator v4_6 = android.animation.ValueAnimator.ofArgb(new int[] {p5, p6}));
            v4_6.setDuration(300);
            v4_6.addUpdateListener(new i2.j(v0_1, 0));
            v4_6.start();
            return;
        } else {
            return;
        }
    }

    public static void j(i2.l p0, android.view.View p1, boolean p2, int p3, int p4, int p5)
    {
        if ((p1 != null) && (p0 != 0)) {
            p1.setSelected(p2);
            int v0_2 = p0.o();
            if (p2 == 0) {
                if (v0_2 != 0) {
                    p4 = p3;
                }
            } else {
                p4 = p5;
            }
            int v0_1 = a.a.t(p1, p3);
            p1.setTag(2131361998, Integer.valueOf(p4));
            i2.l.i(p1, v0_1, p4);
        }
        return;
    }

    public static int[][] k(android.content.Context p7, int p8, int p9, int p10, int p11)
    {
        android.content.res.TypedArray v7_1 = p7.getResources();
        android.content.res.TypedArray v8_1 = v7_1.obtainTypedArray(p8);
        android.content.res.TypedArray v9_1 = v7_1.obtainTypedArray(p9);
        android.content.res.TypedArray v10_1 = v7_1.obtainTypedArray(p10);
        android.content.res.TypedArray v7_2 = v7_1.obtainTypedArray(p11);
        int[][] v0_0 = new int[2];
        v0_0[1] = 3;
        v0_0[0] = 7;
        int[][] v0_2 = ((int[][]) reflect.Array.newInstance(Integer.TYPE, v0_0));
        int v4_2 = 0;
        while (v4_2 < 3) {
            v0_2[0][v4_2] = v7_2.getColor(v4_2, 0);
            v0_2[1][v4_2] = v8_1.getColor(v4_2, 0);
            v0_2[2][v4_2] = v9_1.getColor(v4_2, 0);
            v0_2[3][v4_2] = v9_1.getColor(v4_2, 0);
            v0_2[4][v4_2] = v10_1.getColor(v4_2, 0);
            v0_2[5][v4_2] = v7_2.getColor(v4_2, 0);
            v0_2[6][v4_2] = v8_1.getColor(v4_2, 0);
            v4_2++;
        }
        v8_1.recycle();
        v9_1.recycle();
        v10_1.recycle();
        v7_2.recycle();
        return v0_2;
    }

    public static declared_synchronized i2.l l(android.content.Context p2)
    {
        if (i2.l.r == null) {
            i2.l.r = new i2.l(p2);
        }
        return i2.l.r;
    }

    public static float m(float p1, float p2, float p3)
    {
        return ((1065353216 / (p3 - p2)) * (p1 - p2));
    }

    public static boolean n(int p6)
    {
        if ((4607182418800017408 - (((((double) android.graphics.Color.blue(p6)) * 4592878986383488713) + ((((double) android.graphics.Color.green(p6)) * 4603462445507809378) + (((double) android.graphics.Color.red(p6)) * 4599057925072241033))) / 4643176031446892544)) < 4602678819172646912) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void p(android.view.ViewGroup p10, boolean p11, i2.l p12, int p13, int p14, boolean p15)
    {
        int v0 = 0;
        while (v0 < p10.getChildCount()) {
            boolean v9;
            int v6_0;
            i2.l v2;
            android.view.View v3 = p10.getChildAt(v0);
            if (!(v3 instanceof android.view.ViewGroup)) {
                boolean v5_0;
                v2 = p12;
                v6_0 = p14;
                v9 = p15;
                boolean v4_0 = v3.isSelected();
                if (!p11) {
                    v5_0 = p13;
                } else {
                    v5_0 = p14;
                }
                if ((p15) && (!p11)) {
                    int v7_0 = p13;
                } else {
                    v7_0 = p14;
                }
                i2.l.j(p12, v3, v4_0, v5_0, p14, v7_0);
            } else {
                int v7_1;
                int v8;
                if (!p11) {
                    v7_1 = p13;
                    v8 = p14;
                } else {
                    v7_1 = p14;
                    v8 = p14;
                }
                v9 = p15;
                i2.l.p(((android.view.ViewGroup) v3), p11, p12, v7_1, v8, p15);
                v2 = p12;
                v6_0 = v8;
            }
            v0++;
            p12 = v2;
            p14 = v6_0;
            p15 = v9;
        }
        return;
    }

    public static void s(android.content.Context p2, com.google.android.material.slider.Slider p3, int p4, int p5)
    {
        int v0_1 = e0.c.getColor(p2, 2131100819);
        android.content.res.ColorStateList v2_6 = e0.c.getColor(p2, 2131100820);
        if (!p3.isEnabled()) {
            p3.setTrackActiveTintList(android.content.res.ColorStateList.valueOf(v0_1));
            p3.setTrackInactiveTintList(android.content.res.ColorStateList.valueOf(v2_6));
            p3.setThumbTintList(android.content.res.ColorStateList.valueOf(v0_1));
            return;
        } else {
            p3.setTrackActiveTintList(android.content.res.ColorStateList.valueOf(p4));
            p3.setTrackInactiveTintList(android.content.res.ColorStateList.valueOf(p5));
            p3.setThumbTintList(android.content.res.ColorStateList.valueOf(p4));
            return;
        }
    }

    public static void t(android.app.Activity p2, boolean p3)
    {
        if (p2 != null) {
            if (android.os.Build$VERSION.SDK_INT < 34) {
                android.view.View v2_5 = p2.getWindow().getDecorView();
                int v0_2 = v2_5.getSystemUiVisibility();
                if (p3 == 0) {
                    v2_5.setSystemUiVisibility((v0_2 & -8193));
                    return;
                } else {
                    v2_5.setSystemUiVisibility((v0_2 | 8192));
                    return;
                }
            } else {
                android.view.View v2_3 = p2.getWindow().getDecorView().getWindowInsetsController();
                if (v2_3 != null) {
                    if (p3 == 0) {
                        v2_3.setSystemBarsAppearance(0, 8);
                    } else {
                        v2_3.setSystemBarsAppearance(8, 8);
                        return;
                    }
                }
            }
        }
        return;
    }

    public final void c(android.app.Activity p8, android.view.ViewGroup p9, boolean p10)
    {
        int v2 = 0;
        android.view.ViewGroup v0_5 = this.q.getInt(this.p, 0);
        boolean v1_1 = this.o();
        int v4 = this.c;
        if (((v0_5 != 8) || (!p10)) && (v1_1)) {
            v4 = this.b;
        }
        while (v2 < p9.getChildCount()) {
            android.view.ViewGroup v0_2 = p9.getChildAt(v2);
            if (!(v0_2 instanceof android.widget.TextView)) {
                if ((v0_2 instanceof android.view.ViewGroup)) {
                    this.c(p8, ((android.view.ViewGroup) v0_2), p10);
                }
            } else {
                i2.k v5_1;
                android.view.ViewGroup v0_4 = ((android.widget.TextView) v0_2);
                android.animation.ValueAnimator v3_2 = v0_4.getCurrentTextColor();
                if (!v0_4.isEnabled()) {
                    if (!v1_1) {
                        v5_1 = this.e;
                    } else {
                        v5_1 = this.d;
                    }
                } else {
                    v5_1 = v4;
                }
                if (v3_2 != v4) {
                    android.animation.ValueAnimator v3_4 = android.animation.ValueAnimator.ofArgb(new int[] {v3_2, v5_1}));
                    v3_4.setDuration(300);
                    v3_4.addUpdateListener(new i2.k(1, v0_4));
                    v3_4.start();
                }
            }
            v2++;
        }
        i2.l.t(p8, v1_1);
        return;
    }

    public final boolean o()
    {
        int v0_1 = j5.t1.z(this.a);
        String v2_6 = this.j;
        boolean v1_5 = v0_1.getString(this.h, v2_6);
        int v3_0 = v0_1.getInt(this.n, 0);
        float v5_3 = (((float) v0_1.getInt(this.o, 0)) * 1008981770);
        float v6_2 = v0_1.getFloat(this.i, 1086324736);
        float v7_1 = v0_1.getFloat(this.f, 1086324736);
        int v0_2 = v0_1.getFloat(this.g, 1099956224);
        if ((v1_5.contains(v2_6)) || ((v1_5.contains(this.k)) || ((v1_5.equals(this.l)) || (v1_5.contains(this.m))))) {
            v5_3 = 0;
        }
        boolean v1_4 = ((float) (4599075939470750515 - ((double) (v5_3 * 1059481190))));
        if ((v6_2 <= (v7_1 - v1_4)) || ((v6_2 >= (v0_2 + v1_4)) || (v3_0 >= 25))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void q(android.app.Activity p5, android.view.ViewGroup p6)
    {
        boolean v0 = this.o();
        int v1 = 0;
        while (v1 < p6.getChildCount()) {
            android.view.ViewGroup v2_3 = p6.getChildAt(v1);
            if (!(v2_3 instanceof android.widget.TextView)) {
                if ((v2_3 instanceof android.view.ViewGroup)) {
                    this.q(p5, ((android.view.ViewGroup) v2_3));
                }
            } else {
                android.view.ViewGroup v2_1 = ((android.widget.TextView) v2_3);
                if (!v0) {
                    v2_1.setTextColor(this.c);
                } else {
                    v2_1.setTextColor(this.b);
                }
            }
            i2.l.t(p5, v0);
            v1++;
        }
        return;
    }

    public final void r(android.view.ViewGroup p10, int p11)
    {
        int v0_1;
        int v0_0 = this.o();
        if (p11 != 0) {
            v0_1 = p11;
        } else {
            if (v0_0 == 0) {
                v0_1 = this.c;
            } else {
                v0_1 = this.b;
            }
        }
        int v2 = 0;
        while (v2 < p10.getChildCount()) {
            android.view.ViewGroup v3_1 = p10.getChildAt(v2);
            if (!(v3_1 instanceof androidx.recyclerview.widget.RecyclerView)) {
                if (!(v3_1 instanceof android.widget.TextView)) {
                    if (!(v3_1 instanceof android.widget.ImageView)) {
                        if ((v3_1 instanceof android.view.ViewGroup)) {
                            this.r(((android.view.ViewGroup) v3_1), p11);
                        }
                    } else {
                        android.view.ViewGroup v3_3 = ((android.widget.ImageView) v3_1);
                        android.graphics.drawable.Drawable v4_4 = v3_3.getDrawable();
                        if (v4_4 != null) {
                            android.graphics.drawable.Drawable v4_5 = v4_4.mutate();
                            v4_5.setTint(v0_1);
                            v3_3.setImageDrawable(v4_5);
                        }
                    }
                } else {
                    android.view.ViewGroup v3_4 = ((android.widget.TextView) v3_1);
                    android.graphics.drawable.Drawable v4_6 = v3_4.getCompoundDrawables();
                    android.graphics.drawable.Drawable v6_0 = new android.graphics.drawable.Drawable[4];
                    int v7_0 = 0;
                    while (v7_0 < 4) {
                        int v8_1 = v4_6[v7_0];
                        if (v8_1 == 0) {
                            v6_0[v7_0] = 0;
                        } else {
                            int v8_3 = v8_1.mutate();
                            v8_3.setTint(v0_1);
                            v6_0[v7_0] = v8_3;
                        }
                        v7_0++;
                    }
                    v3_4.setCompoundDrawablesWithIntrinsicBounds(v6_0[0], v6_0[1], v6_0[2], v6_0[3]);
                }
            }
            v2++;
        }
        return;
    }

    public final void u(com.google.android.material.materialswitch.MaterialSwitch p7, int p8)
    {
        int[] v4_2 = new int[0];
        int[] v4_3 = this.c;
        android.content.res.ColorStateList v0_1 = new android.content.res.ColorStateList(new int[][] {new int[] {16842912}), v4_2}), new int[] {p8, v4_3}));
        int v5_0 = new int[0];
        int v5_1 = this.b;
        android.content.res.ColorStateList v8_3 = new android.content.res.ColorStateList(new int[][] {new int[] {16842912}), v5_0}), new int[] {v4_3, v5_1}));
        int[] v4_1 = new int[0];
        android.content.res.ColorStateList v2_4 = new android.content.res.ColorStateList(new int[][] {new int[] {16842912}), v4_1}), new int[] {0, v5_1}));
        if (p7 != null) {
            p7.setTrackTintList(v0_1);
            p7.setThumbTintList(v8_3);
            p7.setTrackDecorationTintList(v2_4);
            return;
        } else {
            return;
        }
    }
}
