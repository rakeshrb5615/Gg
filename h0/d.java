package h0;
public final class d {
    public char a;
    public final float[] b;

    public d(char p1, float[] p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public d(h0.d p2)
    {
        this.a = p2.a;
        float[] v2_1 = p2.b;
        this.b = a.a.l(v2_1, v2_1.length);
        return;
    }

    public static void a(android.graphics.Path p54, float p55, float p56, float p57, float p58, float p59, float p60, float p61, boolean p62, boolean p63)
    {
        float v4_9 = Math.toRadians(((double) p61));
        float v8_4 = Math.cos(v4_9);
        int v10_0 = Math.sin(v4_9);
        double v16_1 = v4_9;
        double v18_3 = (((((double) p56) * v10_0) + (((double) p55) * v8_4)) / ((double) p59));
        double v20_9 = (((((double) p56) * v8_4) + (((double) (- p55)) * v10_0)) / ((double) p60));
        double v26_3 = (((((double) p58) * v10_0) + (((double) p57) * v8_4)) / ((double) p59));
        double v24_9 = (((((double) p58) * v8_4) + (((double) (- p57)) * v10_0)) / ((double) p60));
        int v0_19 = (v18_3 - v26_3);
        double v28_4 = (v20_9 - v24_9);
        double v30_3 = ((v18_3 + v26_3) / 4611686018427387904);
        double v34_3 = ((v20_9 + v24_9) / 4611686018427387904);
        double v40_3 = v0_19;
        int v0_20 = ((v28_4 * v28_4) + (v0_19 * v0_19));
        if (v0_20 != 0) {
            double v42_5 = ((4607182418800017408 / v0_20) - 4598175219545276416);
            if (v42_5 >= 0) {
                double v30_4;
                double v34_4;
                double v1_5 = Math.sqrt(v42_5);
                double v6_6 = (v1_5 * v40_3);
                double v1_6 = (v1_5 * v28_4);
                if (p62 != p63) {
                    v30_4 = (v30_3 + v1_6);
                    v34_4 = (v34_3 - v6_6);
                } else {
                    v30_4 = (v30_3 - v1_6);
                    v34_4 = (v34_3 + v6_6);
                }
                float v7_3;
                android.graphics.Path v55_3 = Math.atan2((v20_9 - v34_4), (v18_3 - v30_4));
                double v1_11 = (Math.atan2((v24_9 - v34_4), (v26_3 - v30_4)) - v55_3);
                double v3_3 = v1_11 cmp 0;
                if (v3_3 < 0) {
                    v7_3 = 0;
                } else {
                    v7_3 = 1;
                }
                if (p63 != v7_3) {
                    if (v3_3 <= 0) {
                        v1_11 += 4618760256179416344;
                    } else {
                        v1_11 -= 4618760256179416344;
                    }
                }
                double v30_5 = (v30_4 * ((double) p59));
                double v34_5 = (v34_4 * ((double) p60));
                double v18_0 = ((v30_5 * v8_4) - (v34_5 * v10_0));
                double v34_1 = ((v34_5 * v8_4) + (v30_5 * v10_0));
                int v0_0 = ((int) Math.ceil(Math.abs(((v1_11 * 4616189618054758400) / 4614256656552045848))));
                double v9_4 = Math.cos(v16_1);
                double v16_0 = Math.sin(v16_1);
                double v20_1 = Math.cos(v55_3);
                double v24_0 = Math.sin(v55_3);
                double v6_0 = (- ((double) p59));
                double v26_0 = (v6_0 * v9_4);
                double v30_1 = (((double) p60) * v16_0);
                double v28_1 = ((v26_0 * v24_0) - (v30_1 * v20_1));
                double v6_1 = (v6_0 * v16_0);
                double v22_0 = (((double) p60) * v9_4);
                double v1_2 = (v1_11 / ((double) v0_0));
                double v24_2 = ((v20_1 * v22_0) + (v24_0 * v6_1));
                double v20_4 = ((double) p55);
                double v11_0 = ((double) p56);
                int v5_0 = 0;
                double v3_1 = v55_3;
                while (v5_0 < v0_0) {
                    double v36_1 = (v3_1 + v1_2);
                    double v40_0 = Math.sin(v36_1);
                    double v42_0 = Math.cos(v36_1);
                    float v8_0 = v0_0;
                    double v48 = v1_2;
                    int v0_1 = ((((((double) p59) * v9_4) * v42_0) + v18_0) - (v30_1 * v40_0));
                    double v2_0 = ((v22_0 * v40_0) + (((((double) p59) * v16_0) * v42_0) + v34_1));
                    double v44_7 = ((v26_0 * v40_0) - (v30_1 * v42_0));
                    double v40_2 = ((v42_0 * v22_0) + (v40_0 * v6_1));
                    double v42_2 = (v36_1 - v3_1);
                    double v46_4 = Math.tan((v42_2 / 4611686018427387904));
                    double v46_8 = (((Math.sqrt((((v46_4 * 4613937818241073152) * v46_4) + 4616189618054758400)) - 4607182418800017408) * Math.sin(v42_2)) / 4613937818241073152);
                    float v4_1 = ((v28_1 * v46_8) + v20_4);
                    double v11_1 = ((v24_2 * v46_8) + v11_0);
                    double v24_4 = v6_1;
                    double v6_3 = (v0_1 - (v46_8 * v44_7));
                    double v20_6 = v9_4;
                    float v8_1 = (v2_0 - (v46_8 * v40_2));
                    double v28_3 = v8_0;
                    int v29 = v5_0;
                    p54.rLineTo(0, 0);
                    p54.cubicTo(((float) v4_1), ((float) v11_1), ((float) v6_3), ((float) v8_1), ((float) v0_1), ((float) v2_0));
                    v5_0 = (v29 + 1);
                    v11_0 = v2_0;
                    v9_4 = v20_6;
                    v6_1 = v24_4;
                    v3_1 = v36_1;
                    v24_2 = v40_2;
                    v20_4 = v0_1;
                    v0_0 = v28_3;
                    v28_1 = v44_7;
                    v1_2 = v48;
                }
                return;
            } else {
                float v4_4 = new StringBuilder("Points are too far apart ");
                v4_4.append(v0_20);
                android.util.Log.w("PathParser", v4_4.toString());
                int v0_8 = ((float) (Math.sqrt(v0_20) / 4611685973391391630));
                h0.d.a(p54, p55, p56, p57, p58, (p59 * v0_8), (v0_8 * p60), p61, p62, p63);
                return;
            }
        } else {
            android.util.Log.w("PathParser", " Points are coincident");
            return;
        }
    }

    public static void b(h0.d[] p33, android.graphics.Path p34)
    {
        int v0_0 = p33;
        android.graphics.Path v1_0 = p34;
        float[] v12 = new float[6];
        int v13 = p33.length;
        float v15_7 = 0;
        float v8_3 = 0;
        int v2_34 = 109;
        while (v8_3 < v13) {
            int v22;
            int v9_0 = v0_0[v8_3];
            int v10_0 = v9_0.a;
            float v3_1 = v9_0.b;
            int v4_3 = v12[v15_7];
            int v5_2 = v12[1];
            int v6_1 = v12[2];
            int v7_1 = v12[3];
            float v11_2 = v12[4];
            int v21 = v15_7;
            float v15_1 = v12[5];
            switch (v10_0) {
                case 65:
                case 97:
                    v22 = 7;
                    break;
                case 67:
                case 99:
                    v22 = 6;
                    break;
                case 72:
                case 86:
                case 104:
                case 118:
                    v22 = 1;
                    break;
                case 81:
                case 83:
                case 113:
                case 115:
                    v22 = 4;
                    break;
                case 90:
                case 122:
                    v1_0.close();
                    v1_0.moveTo(v11_2, v15_1);
                    v4_3 = v11_2;
                    v6_1 = v4_3;
                    v5_2 = v15_1;
                    v7_1 = v5_2;
                    v22 = 2;
                    break;
                default:
            }
            int v23 = v11_2;
            int v24 = v15_1;
            float v11_3 = v4_3;
            float v15_2 = v5_2;
            int v4_21 = v21;
            while (v4_21 < v3_1.length) {
                float v3_3;
                float v15_0;
                int v30;
                int v0_1;
                int v2_0;
                float v11_0;
                int v25;
                if (v10_0 == 65) {
                    int v9_3;
                    v25 = v3_1;
                    v30 = v4_21;
                    v0_1 = v9_0;
                    v15_0 = v8_3;
                    v11_0 = v10_0;
                    int v14_17 = (v30 + 5);
                    int v27_3 = (v30 + 6);
                    if (v25[(v30 + 3)] == 0) {
                        v9_3 = v21;
                    } else {
                        v9_3 = 1;
                    }
                    int v10_3;
                    if (v25[(v30 + 4)] == 0) {
                        v10_3 = v21;
                    } else {
                        v10_3 = 1;
                    }
                    h0.d.a(p34, v11_3, v15_2, v25[v14_17], v25[v27_3], v25[v30], v25[(v30 + 1)], v25[(v30 + 2)], v9_3, v10_3);
                    v6_1 = v25[v14_17];
                    v3_3 = v25[v27_3];
                    v7_1 = v3_3;
                    v2_0 = v6_1;
                } else {
                    if (v10_0 == 67) {
                        v25 = v3_1;
                        v30 = v4_21;
                        v15_0 = v8_3;
                        v0_1 = v9_0;
                        v11_0 = v10_0;
                        float v8_0 = (v30 + 2);
                        int v9_1 = (v30 + 3);
                        int v10_1 = (v30 + 4);
                        int v14_0 = (v30 + 5);
                        v1_0.cubicTo(v25[v30], v25[(v30 + 1)], v25[v8_0], v25[v9_1], v25[v10_1], v25[v14_0]);
                        v6_1 = v25[v8_0];
                        v7_1 = v25[v9_1];
                        v3_3 = v25[v14_0];
                        v2_0 = v25[v10_1];
                    } else {
                        if (v10_0 == 72) {
                            v25 = v3_1;
                            v30 = v4_21;
                            v0_1 = v9_0;
                            v11_0 = v10_0;
                            v3_3 = v15_2;
                            v15_0 = v8_3;
                            v1_0.lineTo(v25[v30], v3_3);
                            v2_0 = v25[v30];
                        } else {
                            if (v10_0 == 81) {
                                v25 = v3_1;
                                v30 = v4_21;
                                v15_0 = v8_3;
                                v0_1 = v9_0;
                                v11_0 = v10_0;
                                int v4_4 = (v30 + 1);
                                int v5_3 = (v30 + 2);
                                int v7_2 = (v30 + 3);
                                v1_0.quadTo(v25[v30], v25[v4_4], v25[v5_3], v25[v7_2]);
                                v6_1 = v25[v30];
                                v7_1 = v25[v4_4];
                                v2_0 = v25[v5_3];
                                v3_3 = v25[v7_2];
                            } else {
                                if (v10_0 == 86) {
                                    v25 = v3_1;
                                    v30 = v4_21;
                                    v15_0 = v8_3;
                                    v0_1 = v9_0;
                                    v2_0 = v11_3;
                                    v11_0 = v10_0;
                                    v1_0.lineTo(v2_0, v25[v30]);
                                    v3_3 = v25[v30];
                                } else {
                                    if (v10_0 == 97) {
                                        int v2_9;
                                        int v9_2;
                                        v25 = v3_1;
                                        v30 = v4_21;
                                        int v14_3 = (v30 + 5);
                                        int v27_0 = (v30 + 6);
                                        if (v25[(v30 + 3)] == 0) {
                                            v2_9 = v9_0;
                                            v9_2 = v21;
                                        } else {
                                            v2_9 = v9_0;
                                            v9_2 = 1;
                                        }
                                        int v10_2;
                                        v0_1 = v2_9;
                                        int v2_10 = v11_3;
                                        v11_0 = v10_0;
                                        if (v25[(v30 + 4)] == 0) {
                                            v10_2 = v21;
                                        } else {
                                            v10_2 = 1;
                                        }
                                        float v3_10 = v15_2;
                                        v15_0 = v8_3;
                                        h0.d.a(p34, v2_10, v3_10, (v25[v14_3] + v11_3), (v25[v27_0] + v15_2), v25[v30], v25[(v30 + 1)], v25[(v30 + 2)], v9_2, v10_2);
                                        v2_0 = (v2_10 + v25[v14_3]);
                                        v3_3 = (v3_10 + v25[v27_0]);
                                        v6_1 = v2_0;
                                        v7_1 = v3_3;
                                    } else {
                                        if (v10_0 == 99) {
                                            v25 = v3_1;
                                            v30 = v4_21;
                                            int v14_4 = (v30 + 2);
                                            int v26_1 = (v30 + 3);
                                            int v27_1 = (v30 + 4);
                                            int v28_0 = (v30 + 5);
                                            v1_0.rCubicTo(v25[v30], v25[(v30 + 1)], v25[v14_4], v25[v26_1], v25[v27_1], v25[v28_0]);
                                            android.graphics.Path v1_9 = (v25[v14_4] + v11_3);
                                            int v2_13 = (v25[v26_1] + v15_2);
                                            v11_3 += v25[v27_1];
                                            v15_2 += v25[v28_0];
                                            v6_1 = v1_9;
                                            v7_1 = v2_13;
                                            v0_1 = v9_0;
                                            v2_0 = v11_3;
                                            v3_3 = v15_2;
                                            v15_0 = v8_3;
                                        } else {
                                            if (v10_0 == 104) {
                                                v25 = v3_1;
                                                v30 = v4_21;
                                                v1_0.rLineTo(v25[v30], 0);
                                                v11_3 += v25[v30];
                                            } else {
                                                int v2_18;
                                                int v4_13;
                                                float v3_17;
                                                if (v10_0 == 113) {
                                                    v25 = v3_1;
                                                    v30 = v4_21;
                                                    int v4_11 = (v30 + 1);
                                                    int v5_12 = (v30 + 2);
                                                    int v7_5 = (v30 + 3);
                                                    v1_0.rQuadTo(v25[v30], v25[v4_11], v25[v5_12], v25[v7_5]);
                                                    v2_18 = (v25[v30] + v11_3);
                                                    v3_17 = (v25[v4_11] + v15_2);
                                                    v11_3 += v25[v5_12];
                                                    v4_13 = v25[v7_5];
                                                } else {
                                                    int v2_20;
                                                    if (v10_0 == 118) {
                                                        v25 = v3_1;
                                                        v30 = v4_21;
                                                        v1_0.rLineTo(0, v25[v30]);
                                                        v2_20 = v25[v30];
                                                    } else {
                                                        if (v10_0 == 76) {
                                                            v25 = v3_1;
                                                            v30 = v4_21;
                                                            int v4_14 = (v30 + 1);
                                                            v1_0.lineTo(v25[v30], v25[v4_14]);
                                                            v2_0 = v25[v30];
                                                            v3_3 = v25[v4_14];
                                                        } else {
                                                            if (v10_0 == 77) {
                                                                v25 = v3_1;
                                                                v30 = v4_21;
                                                                v2_0 = v25[v30];
                                                                v3_3 = v25[(v30 + 1)];
                                                                if (v30 <= 0) {
                                                                    v1_0.moveTo(v2_0, v3_3);
                                                                    v23 = v2_0;
                                                                    v24 = v3_3;
                                                                } else {
                                                                    v1_0.lineTo(v2_0, v3_3);
                                                                }
                                                            } else {
                                                                if (v10_0 == 83) {
                                                                    v25 = v3_1;
                                                                    v30 = v4_21;
                                                                    if ((v2_34 == 99) || ((v2_34 == 115) || ((v2_34 == 67) || (v2_34 == 83)))) {
                                                                        v11_3 = ((v11_3 * 1073741824) - v6_1);
                                                                        v15_2 = ((v15_2 * 1073741824) - v7_1);
                                                                    }
                                                                    float v11_5 = (v30 + 1);
                                                                    int v14_10 = (v30 + 2);
                                                                    float v15_4 = (v30 + 3);
                                                                    v1_0.cubicTo(v11_3, v15_2, v25[v30], v25[v11_5], v25[v14_10], v25[v15_4]);
                                                                    v6_1 = v25[v30];
                                                                    v7_1 = v25[v11_5];
                                                                    v2_0 = v25[v14_10];
                                                                    v3_3 = v25[v15_4];
                                                                } else {
                                                                    if (v10_0 == 84) {
                                                                        v25 = v3_1;
                                                                        v30 = v4_21;
                                                                        if ((v2_34 == 113) || ((v2_34 == 116) || ((v2_34 == 81) || (v2_34 == 84)))) {
                                                                            v11_3 = ((v11_3 * 1073741824) - v6_1);
                                                                            v15_2 = ((v15_2 * 1073741824) - v7_1);
                                                                        }
                                                                        int v4_18 = (v30 + 1);
                                                                        v1_0.quadTo(v11_3, v15_2, v25[v30], v25[v4_18]);
                                                                        v2_0 = v25[v30];
                                                                        v3_3 = v25[v4_18];
                                                                        v0_1 = v9_0;
                                                                        v6_1 = v11_3;
                                                                        v7_1 = v15_2;
                                                                    } else {
                                                                        if (v10_0 == 108) {
                                                                            v25 = v3_1;
                                                                            v30 = v4_21;
                                                                            int v4_19 = (v30 + 1);
                                                                            v1_0.rLineTo(v25[v30], v25[v4_19]);
                                                                            v11_3 += v25[v30];
                                                                            v2_20 = v25[v4_19];
                                                                        } else {
                                                                            if (v10_0 == 109) {
                                                                                v25 = v3_1;
                                                                                v30 = v4_21;
                                                                                int v2_27 = v25[v30];
                                                                                v11_3 += v2_27;
                                                                                float v3_24 = v25[(v30 + 1)];
                                                                                v15_2 += v3_24;
                                                                                if (v30 <= 0) {
                                                                                    v1_0.rMoveTo(v2_27, v3_24);
                                                                                    v0_1 = v9_0;
                                                                                    v2_0 = v11_3;
                                                                                    v23 = v2_0;
                                                                                    v3_3 = v15_2;
                                                                                    v24 = v3_3;
                                                                                } else {
                                                                                    v1_0.rLineTo(v2_27, v3_24);
                                                                                }
                                                                            } else {
                                                                                if (v10_0 == 115) {
                                                                                    if ((v2_34 != 99) && ((v2_34 != 115) && ((v2_34 != 67) && (v2_34 != 83)))) {
                                                                                        int v2_28 = 0;
                                                                                        int v14_12 = 0;
                                                                                    } else {
                                                                                        v14_12 = (v15_2 - v7_1);
                                                                                        v2_28 = (v11_3 - v6_1);
                                                                                    }
                                                                                    int v5_30 = v4_21;
                                                                                    int v26_2 = (v5_30 + 1);
                                                                                    int v6_7 = v5_30;
                                                                                    int v27_2 = (v6_7 + 2);
                                                                                    int v7_7 = v6_7;
                                                                                    int v28_1 = (v7_7 + 3);
                                                                                    v25 = v3_1;
                                                                                    v30 = v7_7;
                                                                                    v1_0.rCubicTo(v2_28, v14_12, v3_1[v5_30], v3_1[v26_2], v3_1[v27_2], v3_1[v28_1]);
                                                                                    v2_18 = (v25[v30] + v11_3);
                                                                                    v3_17 = (v25[v26_2] + v15_2);
                                                                                    v11_3 += v25[v27_2];
                                                                                    v4_13 = v25[v28_1];
                                                                                } else {
                                                                                    if (v10_0 == 116) {
                                                                                        if ((v2_34 != 113) && ((v2_34 != 116) && ((v2_34 != 81) && (v2_34 != 84)))) {
                                                                                            int v2_32 = 0;
                                                                                            int v14_15 = 0;
                                                                                        } else {
                                                                                            v14_15 = (v11_3 - v6_1);
                                                                                            v2_32 = (v15_2 - v7_1);
                                                                                        }
                                                                                        int v6_9 = (v4_21 + 1);
                                                                                        v1_0.rQuadTo(v14_15, v2_32, v3_1[v4_21], v3_1[v6_9]);
                                                                                        int v2_33 = (v2_32 + v15_2);
                                                                                        v15_2 += v3_1[v6_9];
                                                                                        v7_1 = v2_33;
                                                                                        v25 = v3_1;
                                                                                        v30 = v4_21;
                                                                                        v0_1 = v9_0;
                                                                                        v2_0 = (v11_3 + v3_1[v4_21]);
                                                                                        v6_1 = (v14_15 + v11_3);
                                                                                    } else {
                                                                                        v25 = v3_1;
                                                                                        v30 = v4_21;
                                                                                        v0_1 = v9_0;
                                                                                        v2_0 = v11_3;
                                                                                    }
                                                                                    v3_3 = v15_2;
                                                                                }
                                                                            }
                                                                            v15_2 += v4_13;
                                                                            v6_1 = v2_18;
                                                                            v7_1 = v3_17;
                                                                        }
                                                                    }
                                                                    v15_2 += v2_20;
                                                                }
                                                            }
                                                        }
                                                        v15_0 = v8_3;
                                                        v0_1 = v9_0;
                                                        v11_0 = v10_0;
                                                        v4_21 = (v30 + v22);
                                                        v1_0 = p34;
                                                        v9_0 = v0_1;
                                                        v10_0 = v11_0;
                                                        v8_3 = v15_0;
                                                        v11_3 = v2_0;
                                                        v15_2 = v3_3;
                                                        v2_34 = v10_0;
                                                        v3_1 = v25;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int v0_2 = v9_0;
            float v3_27 = v15_2;
            float v15_6 = v8_3;
            v12[v21] = v11_3;
            v12[1] = v3_27;
            v12[2] = v6_1;
            v12[3] = v7_1;
            v12[4] = v23;
            v12[5] = v24;
            v2_34 = v0_2.a;
            v8_3 = (v15_6 + 1);
            v0_0 = p33;
            v1_0 = p34;
            v15_7 = v21;
        }
        return;
    }
}
