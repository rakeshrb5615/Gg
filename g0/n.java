package g0;
public final class n {
    public static final g0.n k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static n()
    {
        int v6_3;
        g0.n v0_0 = g0.b.c;
        float v1_18 = ((float) ((((double) g0.b.m()) * 4634156444089534796) / 4636737291354636288));
        float[] v2_4 = g0.b.a;
        int v6_0 = v0_0[0];
        int v7_0 = v2_4[0];
        float v10_5 = v0_0[1];
        float v12_0 = v0_0[2];
        int v7_7 = ((v7_0[2] * v12_0) + ((v7_0[1] * v10_5) + (v7_0[0] * v6_0)));
        float v11_3 = v2_4[1];
        float v11_6 = ((v11_3[2] * v12_0) + ((v11_3[1] * v10_5) + (v11_3[0] * v6_0)));
        float[] v2_0 = v2_4[2];
        float v12_2 = ((v12_0 * v2_0[2]) + ((v10_5 * v2_0[1]) + (v6_0 * v2_0[0])));
        if (((double) 1065353216) < 4606281698874543309) {
            v6_3 = 1059565076;
        } else {
            v6_3 = 1060152279;
        }
        int v18 = v6_3;
        float v10_13 = 1065353216;
        int v6_10 = ((1065353216 - (((float) Math.exp(((double) (((- v1_18) - 1109917696) / 1119354880)))) * 1049508068)) * 1065353216);
        g0.n v13_14 = ((double) v6_10);
        if (v13_14 <= 4607182418800017408) {
            if (v13_14 < 0) {
                v6_10 = 0;
            }
        } else {
            v6_10 = 1065353216;
        }
        float v15_9 = ((((1120403456 / v11_6) * v6_10) + 1065353216) - v6_10);
        g0.n v13_20 = ((((1120403456 / v12_2) * v6_10) + 1065353216) - v6_10);
        float[] v2_3 = new float[3];
        v2_3[0] = ((((1120403456 / v7_7) * v6_10) + 1065353216) - v6_10);
        v2_3[1] = v15_9;
        v2_3[2] = v13_20;
        g0.n v13_24 = (v10_13 / ((1084227584 * v1_18) + v10_13));
        float v14_11 = (((v13_24 * v13_24) * v13_24) * v13_24);
        float v10_14 = (1065353216 - v14_11);
        g0.n v13_4 = ((((1036831949 * v10_14) * v10_14) * ((float) Math.cbrt((((double) v1_18) * 4617315517961601024)))) + (v14_11 * v1_18));
        float v14_1 = (g0.b.m() / v0_0[1]);
        g0.n v0_2 = ((double) v14_1);
        float v23 = (((float) Math.sqrt(v0_2)) + 1069379748);
        float v16 = (1060739482 / ((float) Math.pow(v0_2, 4596373779694328218)));
        float v1_6 = ((float) Math.pow((((double) ((v2_3[1] * v13_4) * v11_6)) / 4636737291354636288), 4601237667291888353));
        double v3_8 = ((float) Math.pow((((double) ((v2_3[2] * v13_4) * v12_2)) / 4636737291354636288), 4601237667291888353));
        float[] v4_1 = new float[3];
        v4_1[0] = ((float) Math.pow((((double) ((v2_3[0] * v13_4) * v7_7)) / 4636737291354636288), 4601237667291888353));
        v4_1[1] = v1_6;
        v4_1[2] = v3_8;
        g0.n v0_12 = v4_1[0];
        g0.n v0_14 = v4_1[1];
        float v10_7 = ((v0_14 * 1137180672) / (v0_14 + 1104742973));
        g0.n v0_16 = v4_1[2];
        float v1_9 = ((1137180672 * v0_16) / (v0_16 + 1104742973));
        g0.n v0_18 = new float[3];
        v0_18[0] = ((v0_12 * 1137180672) / (v0_12 + 1104742973));
        v0_18[1] = v10_7;
        v0_18[2] = v1_9;
        g0.n.k = new g0.n(v14_1, (((v0_18[2] * 1028443341) + ((v0_18[0] * 1073741824) + v0_18[1])) * v16), v16, v16, v18, 1065353216, v2_3, v13_4, ((float) Math.pow(((double) v13_4), 4598175219545276416)), v23);
        return;
    }

    public n(float p1, float p2, float p3, float p4, float p5, float p6, float[] p7, float p8, float p9, float p10)
    {
        this.f = p1;
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        this.g = p7;
        this.h = p8;
        this.i = p9;
        this.j = p10;
        return;
    }
}
