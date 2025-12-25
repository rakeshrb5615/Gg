package h0;
public abstract class a {
    public static final ThreadLocal a;

    static a()
    {
        h0.a.a = new ThreadLocal();
        return;
    }

    public static int a(float[] p6)
    {
        int v1_5;
        int v6_4;
        int v0_0 = 0;
        int v1_0 = p6[0];
        int v6_5 = p6[2];
        float v4_2 = ((1065353216 - Math.abs(((v6_5 * 1073741824) - 1065353216))) * p6[1]);
        int v6_3 = (v6_5 - (1056964608 * v4_2));
        float v5_1 = ((1065353216 - Math.abs((((v1_0 / 1114636288) % 1073741824) - 1065353216))) * v4_2);
        switch ((((int) v1_0) / 60)) {
            case 0:
                v0_0 = Math.round(((v4_2 + v6_3) * 1132396544));
                v1_5 = Math.round(((v5_1 + v6_3) * 1132396544));
                v6_4 = Math.round((v6_3 * 1132396544));
                break;
            case 1:
                v0_0 = Math.round(((v5_1 + v6_3) * 1132396544));
                v1_5 = Math.round(((v4_2 + v6_3) * 1132396544));
                v6_4 = Math.round((v6_3 * 1132396544));
                break;
            case 2:
                v0_0 = Math.round((v6_3 * 1132396544));
                v1_5 = Math.round(((v4_2 + v6_3) * 1132396544));
                v6_4 = Math.round(((v5_1 + v6_3) * 1132396544));
                break;
            case 3:
                v0_0 = Math.round((v6_3 * 1132396544));
                v1_5 = Math.round(((v5_1 + v6_3) * 1132396544));
                v6_4 = Math.round(((v4_2 + v6_3) * 1132396544));
                break;
            case 4:
                v0_0 = Math.round(((v5_1 + v6_3) * 1132396544));
                v1_5 = Math.round((v6_3 * 1132396544));
                v6_4 = Math.round(((v4_2 + v6_3) * 1132396544));
                break;
            case 5:
            case 6:
                v0_0 = Math.round(((v4_2 + v6_3) * 1132396544));
                v1_5 = Math.round((v6_3 * 1132396544));
                v6_4 = Math.round(((v5_1 + v6_3) * 1132396544));
                break;
            default:
                v6_4 = 0;
                v1_5 = 0;
        }
        return android.graphics.Color.rgb(h0.a.g(v0_0), h0.a.g(v1_5), h0.a.g(v6_4));
    }

    public static void b(int p7, int p8, int p9, float[] p10)
    {
        int v8_3;
        float v2_1;
        int v7_2 = (((float) p7) / 1132396544);
        int v8_6 = (((float) p8) / 1132396544);
        float v9_6 = (((float) p9) / 1132396544);
        float v0_1 = Math.max(v7_2, Math.max(v8_6, v9_6));
        float v1_1 = Math.min(v7_2, Math.min(v8_6, v9_6));
        float v2_0 = (v0_1 - v1_1);
        float v3_1 = ((v0_1 + v1_1) / 1073741824);
        float v6 = 0;
        if (v0_1 != v1_1) {
            if (v0_1 != v7_2) {
                if (v0_1 != v8_6) {
                    v8_3 = (1082130432 + ((v7_2 - v8_6) / v2_0));
                } else {
                    v8_3 = (((v9_6 - v7_2) / v2_0) + 1073741824);
                }
            } else {
                v8_3 = (((v8_6 - v9_6) / v2_0) % 1086324736);
            }
            v2_1 = (v2_0 / (1065353216 - Math.abs(((1073741824 * v3_1) - 1065353216))));
        } else {
            v8_3 = 0;
            v2_1 = 0;
        }
        int v8_8 = ((v8_3 * 1114636288) % 1135869952);
        if (v8_8 < 0) {
            v8_8 += 1135869952;
        }
        int v7_10;
        if (v8_8 >= 0) {
            v7_10 = Math.min(v8_8, 1135869952);
        } else {
            v7_10 = 0;
        }
        int v7_12;
        p10[0] = v7_10;
        if (v2_1 >= 0) {
            v7_12 = Math.min(v2_1, 1065353216);
        } else {
            v7_12 = 0;
        }
        p10[1] = v7_12;
        if (v3_1 >= 0) {
            v6 = Math.min(v3_1, 1065353216);
        }
        p10[2] = v6;
        return;
    }

    public static int c(double p17, double p19, double p21)
    {
        int v0_2;
        int v0_13 = (((-4620718437840042171 * p21) + ((-4613770284334934970 * p19) + (4614479601276245823 * p17))) / 4636737291354636288);
        long v4_5 = (((4586141601340942451 * p21) + ((4611126671353668488 * p19) + (-4616469741951580845 * p17))) / 4636737291354636288);
        long v6_8 = (((4607439123978777526 * p21) + ((-4626854141972371735 * p19) + (4588188037011619604 * p17))) / 4636737291354636288);
        if (v0_13 <= 4569365555819558681) {
            v0_2 = (v0_13 * 4623462931452961751);
        } else {
            v0_2 = ((Math.pow(v0_13, 4601177619296856747) * 4607430116779522785) - 4588087156379966505);
        }
        long v4_6;
        if (v4_5 <= 4569365555819558681) {
            v4_6 = (v4_5 * 4623462931452961751);
        } else {
            v4_6 = ((Math.pow(v4_5, 4601177619296856747) * 4607430116779522785) - 4588087156379966505);
        }
        int v2_5;
        if (v6_8 <= 4569365555819558681) {
            v2_5 = (v6_8 * 4623462931452961751);
        } else {
            v2_5 = ((Math.pow(v6_8, 4601177619296856747) * 4607430116779522785) - 4588087156379966505);
        }
        return android.graphics.Color.rgb(h0.a.g(((int) Math.round((v0_2 * 4643176031446892544)))), h0.a.g(((int) Math.round((v4_6 * 4643176031446892544)))), h0.a.g(((int) Math.round((v2_5 * 4643176031446892544)))));
    }

    public static int d(int p5, int p6, float p7)
    {
        int v0_1 = (1065353216 - p7);
        return android.graphics.Color.argb(((int) ((((float) android.graphics.Color.alpha(p6)) * p7) + (((float) android.graphics.Color.alpha(p5)) * v0_1))), ((int) ((((float) android.graphics.Color.red(p6)) * p7) + (((float) android.graphics.Color.red(p5)) * v0_1))), ((int) ((((float) android.graphics.Color.green(p6)) * p7) + (((float) android.graphics.Color.green(p5)) * v0_1))), ((int) ((((float) android.graphics.Color.blue(p6)) * p7) + (((float) android.graphics.Color.blue(p5)) * v0_1))));
    }

    public static int e(int p6, int p7)
    {
        int v0 = android.graphics.Color.alpha(p7);
        int v1 = android.graphics.Color.alpha(p6);
        int v2_1 = (255 - (((255 - v1) * (255 - v0)) / 255));
        return android.graphics.Color.argb(v2_1, h0.a.f(android.graphics.Color.red(p6), v1, android.graphics.Color.red(p7), v0, v2_1), h0.a.f(android.graphics.Color.green(p6), v1, android.graphics.Color.green(p7), v0, v2_1), h0.a.f(android.graphics.Color.blue(p6), v1, android.graphics.Color.blue(p7), v0, v2_1));
    }

    public static int f(int p0, int p1, int p2, int p3, int p4)
    {
        if (p4 != 0) {
            return ((((255 - p1) * (p2 * p3)) + ((p0 * 255) * p1)) / (p4 * 255));
        } else {
            return 0;
        }
    }

    public static int g(int p1)
    {
        if (p1 >= 0) {
            return Math.min(p1, 255);
        } else {
            return 0;
        }
    }

    public static int h(int p1, int p2)
    {
        if ((p2 < 0) || (p2 > 255)) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        } else {
            return ((p1 & 16777215) | (p2 << 24));
        }
    }
}
