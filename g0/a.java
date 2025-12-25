package g0;
public final class a {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public a(float p1, float p2, float p3, float p4, float p5, float p6)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        return;
    }

    public static g0.a a(int p26)
    {
        float v0_0 = g0.n.k;
        float v1_11 = g0.b.f(android.graphics.Color.red(p26));
        float v2_22 = g0.b.f(android.graphics.Color.green(p26));
        float v3_2 = g0.b.f(android.graphics.Color.blue(p26));
        float v4_1 = g0.b.d;
        float v6_0 = v4_1[0];
        float v6_3 = ((v6_0[2] * v3_2) + ((v6_0[1] * v2_22) + (v6_0[0] * v1_11)));
        float v9_3 = v4_1[1];
        float v9_6 = ((v9_3[2] * v3_2) + ((v9_3[1] * v2_22) + (v9_3[0] * v1_11)));
        float v4_7 = v4_1[2];
        float v3_31 = ((v3_2 * v4_7[2]) + ((v2_22 * v4_7[1]) + (v1_11 * v4_7[0])));
        float v1_13 = g0.b.a;
        float v2_15 = v1_13[0];
        float v4_10 = v1_13[1];
        float v1_14 = v1_13[2];
        float v1_16 = v0_0.g;
        float v6_8 = v0_0.i;
        float v9_9 = v0_0.d;
        float v10_12 = v0_0.a;
        float v5_25 = (v1_16[0] * ((v2_15[2] * v3_31) + ((v2_15[1] * v9_6) + (v2_15[0] * v6_3))));
        float v2_21 = (v1_16[1] * ((v4_10[2] * v3_31) + ((v4_10[1] * v9_6) + (v4_10[0] * v6_3))));
        float v1_18 = (v1_16[2] * ((v3_31 * v1_14[2]) + ((v9_6 * v1_14[1]) + (v6_3 * v1_14[0]))));
        float v3_34 = v0_0.h;
        float v4_16 = ((float) Math.pow((((double) (Math.abs(v5_25) * v3_34)) / 4636737291354636288), 4601237667291888353));
        double v7_0 = ((float) Math.pow((((double) (Math.abs(v2_21) * v3_34)) / 4636737291354636288), 4601237667291888353));
        float v3_1 = ((float) Math.pow((((double) (Math.abs(v1_18) * v3_34)) / 4636737291354636288), 4601237667291888353));
        float v5_3 = (((Math.signum(v5_25) * 1137180672) * v4_16) / (v4_16 + 1104742973));
        float v2_3 = (((Math.signum(v2_21) * 1137180672) * v7_0) / (v7_0 + 1104742973));
        float v1_3 = (((Math.signum(v1_18) * 1137180672) * v3_1) / (v3_1 + 1104742973));
        float v3_6 = ((double) v1_3);
        double v7_5 = (((float) (((((double) v2_3) * -4600427019358961664) + (((double) v5_3) * 4622382067542392832)) + v3_6)) / 1093664768);
        float v3_9 = (((float) (((double) (v5_3 + v2_3)) - (v3_6 * 4611686018427387904))) / 1091567616);
        float v2_4 = (v2_3 * 1101004800);
        long v11_13 = (((1101529088 * v1_3) + ((v5_3 * 1101004800) + v2_4)) / 1101004800);
        float v1_8 = ((((float) Math.atan2(((double) v3_9), ((double) v7_5))) * 1127481344) / 1078530011);
        if (v1_8 >= 0) {
            if (v1_8 >= 1135869952) {
                v1_8 -= 1135869952;
            }
        } else {
            v1_8 += 1135869952;
        }
        double v12_1;
        float v4_6 = ((1078530011 * v1_8) / 1127481344);
        float v26_1 = v3_9;
        float v2_12 = (((float) Math.pow(((double) ((((((v5_3 * 1109393408) + v2_4) + v1_3) / 1101004800) * v0_0.b) / v10_12)), ((double) (v0_0.j * v9_9)))) * 1120403456);
        Math.sqrt(((double) (v2_12 / 1120403456)));
        if (((double) v1_8) >= 4626362123713081508) {
            v12_1 = v1_8;
        } else {
            v12_1 = (1135869952 + v1_8);
        }
        float v0_3 = (((float) Math.pow((4610064722561534525 - Math.pow(4598895795485655695, ((double) v0_0.f))), 4604750475001237340)) * ((float) Math.pow(((double) ((((((((float) (Math.cos((((((double) v12_1) * 4614256656552045848) / 4640537203540230144) + 4611686018427387904)) + 4615739258092021350)) * 1048576000) * 1164993142) * v0_0.e) * v0_0.c) * ((float) Math.sqrt(((double) ((v26_1 * v26_1) + (v7_5 * v7_5)))))) / (v11_13 + 1050421494))), 4606281698874543309)));
        float v21 = (v0_3 * ((float) Math.sqrt((((double) v2_12) / 4636737291354636288))));
        float v6_4 = (v6_8 * v21);
        Math.sqrt(((double) ((v0_3 * v9_9) / (v10_12 + 1082130432))));
        float v0_10 = (((float) Math.log(((double) ((v6_4 * 1018873617) + 1065353216)))) * 1110405192);
        float v3_27 = ((double) v4_6);
        return new g0.a(v1_8, v21, v2_12, ((1071225242 * v2_12) / ((1004888130 * v2_12) + 1065353216)), (v0_10 * ((float) Math.cos(v3_27))), (v0_10 * ((float) Math.sin(v3_27))));
    }

    public static g0.a b(float p12, float p13, float p14)
    {
        float v0_0 = g0.n.k;
        float v1_13 = (((double) p12) / 4636737291354636288);
        Math.sqrt(v1_13);
        double v4_0 = (v0_0.i * p13);
        Math.sqrt(((double) (((p13 / ((float) Math.sqrt(v1_13))) * v0_0.d) / (v0_0.a + 1082130432))));
        float v1_14 = (((float) Math.log(((((double) v4_0) * 4582228873984682964) + 4607182418800017408))) * 1110405192);
        double v2_4 = ((double) ((1078530011 * p14) / 1127481344));
        return new g0.a(p14, p13, p12, ((1071225242 * p12) / ((1004888130 * p12) + 1065353216)), (v1_14 * ((float) Math.cos(v2_4))), (v1_14 * ((float) Math.sin(v2_4))));
    }

    public final int c(g0.n p20)
    {
        float v2_8;
        float v2_16 = this.b;
        float v4_17 = this.c;
        if (((double) v2_16) == 0) {
            v2_8 = 0;
        } else {
            float v9_18 = ((double) v4_17);
            if (v9_18 != 0) {
                v2_8 = (v2_16 / ((float) Math.sqrt((v9_18 / 4636737291354636288))));
            }
        }
        float v2_21 = ((float) Math.pow((((double) v2_8) / Math.pow((4610064722561534525 - Math.pow(4598895795485655695, ((double) p20.f))), 4604750475001237340)), 4607682818758614130));
        float v11_14 = ((double) ((this.a * 1078530011) / 1127481344));
        float v9_17 = ((p20.a * ((float) Math.pow((((double) v4_17) / 4636737291354636288), ((4607182418800017408 / ((double) p20.d)) / ((double) p20.j))))) / p20.b);
        float v4_19 = ((float) Math.sin(v11_14));
        int v7_17 = ((float) Math.cos(v11_14));
        float v8_9 = ((((1050421494 + v9_17) * 1102577664) * v2_21) / (((v2_21 * 1121452032) * v4_19) + (((1093664768 * v2_21) * v7_17) + (((((((float) (Math.cos((4611686018427387904 + v11_14)) + 4615739258092021350)) * 1048576000) * 1164993142) * p20.e) * p20.c) * 1102577664))));
        int v7_18 = (v7_17 * v8_9);
        float v8_10 = (v8_9 * v4_19);
        float v9_19 = (v9_17 * 1139146752);
        float v3_4 = (((1133510656 * v8_10) + ((1138851840 * v7_18) + v9_19)) / 1152344064);
        float v4_4 = (((v9_19 - (1147060224 * v7_18)) - (1132625920 * v8_10)) / 1152344064);
        float v9_2 = (((v9_19 - (v7_18 * 1130102784)) - (v8_10 * 1170530304)) / 1152344064);
        int v7_7 = (1120403456 / p20.h);
        int v1_1 = p20.g;
        float v3_9 = (((Math.signum(v3_4) * v7_7) * ((float) Math.pow(((double) ((float) Math.max(0, ((((double) Math.abs(v3_4)) * 4628329633800288993) / (4645744490609377280 - ((double) Math.abs(v3_4))))))), 4612543846927839427))) / v1_1[0]);
        float v4_8 = (((Math.signum(v4_4) * v7_7) * ((float) Math.pow(((double) ((float) Math.max(0, ((((double) Math.abs(v4_4)) * 4628329633800288993) / (4645744490609377280 - ((double) Math.abs(v4_4))))))), 4612543846927839427))) / v1_1[1]);
        float v5_4 = (((Math.signum(v9_2) * v7_7) * ((float) Math.pow(((double) ((float) Math.max(0, ((((double) Math.abs(v9_2)) * 4628329633800288993) / (4645744490609377280 - ((double) Math.abs(v9_2))))))), 4612543846927839427))) / v1_1[2]);
        int v1_3 = g0.b.b;
        float v8_1 = v1_3[0];
        float v9_8 = v1_3[1];
        int v1_4 = v1_3[2];
        return h0.a.c(((double) ((v8_1[2] * v5_4) + ((v8_1[1] * v4_8) + (v8_1[0] * v3_9)))), ((double) ((v9_8[2] * v5_4) + ((v9_8[1] * v4_8) + (v9_8[0] * v3_9)))), ((double) ((v5_4 * v1_4[2]) + ((v4_8 * v1_4[1]) + (v3_9 * v1_4[0])))));
    }
}
