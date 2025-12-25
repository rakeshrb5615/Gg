package n2;
public final class q extends c4.b {
    public final int A;
    public int A0;
    public final int B;
    public int B0;
    public final int C;
    public int C0;
    public final int D;
    public final n2.f D0;
    public final int E;
    public final android.content.SharedPreferences E0;
    public final int F;
    public final String F0;
    public boolean G;
    public String G0;
    public final String H;
    public int H0;
    public final String I;
    public int I0;
    public final String J;
    public float J0;
    public final String K;
    public float K0;
    public final String L;
    public float L0;
    public final String M;
    public final float[] M0;
    public final String N;
    public final String O;
    public final String P;
    public final String Q;
    public final String R;
    public final String S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    public final String X;
    public float Y;
    public int Z;
    public final float[] a0;
    public final float[] b0;
    public java.nio.FloatBuffer c;
    public final float[] c0;
    public java.nio.FloatBuffer d;
    public final float[] d0;
    public final android.content.Context e;
    public final float[] e0;
    public int f;
    public float f0;
    public int g;
    public float g0;
    public float h;
    public float h0;
    public float i;
    public final boolean i0;
    public float j;
    public boolean j0;
    public float k;
    public boolean k0;
    public float l;
    public float l0;
    public float m;
    public int m0;
    public float n;
    public int n0;
    public float o;
    public int o0;
    public float p;
    public int p0;
    public float q;
    public int q0;
    public float r;
    public int r0;
    public float s;
    public int s0;
    public float t;
    public int t0;
    public float u;
    public int u0;
    public float v;
    public int v0;
    public final float w;
    public int w0;
    public float x;
    public int x0;
    public float y;
    public int y0;
    public final float[] z;
    public int z0;

    public q(n2.f p4, android.content.Context p5, boolean p6, android.content.SharedPreferences p7)
    {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 1065353216;
        this.s = 1065353216;
        this.t = 1065353216;
        float[] v0_3 = new float[4];
        v0_3 = {1065353216, 1065353216, 0, 1065353216};
        this.z = v0_3;
        int v1_0 = new float[2];
        this.a0 = v1_0;
        int v1_1 = new float[2];
        this.b0 = v1_1;
        float[] v2_0 = new float[16];
        this.c0 = v2_0;
        float[] v2_1 = new float[16];
        this.d0 = v2_1;
        int v1_3 = new float[16];
        this.e0 = v1_3;
        this.J0 = 1056964608;
        float[] v0_5 = new float[2];
        this.M0 = v0_5;
        this.D0 = p4;
        this.e = p5;
        this.i0 = p6;
        this.E0 = p7;
        this.F0 = p5.getResources().getString(2131952104);
        this.A = p5.getColor(2131100765);
        this.B = p5.getColor(2131100767);
        this.C = p5.getColor(2131100782);
        this.D = p5.getColor(2131100764);
        this.E = p5.getColor(2131100763);
        this.F = p5.getColor(2131100766);
        this.H = p5.getString(2131952361);
        this.R = p5.getString(2131952187);
        this.W = p5.getString(2131952474);
        this.X = p5.getString(2131951852);
        this.U = p5.getString(2131952475);
        this.S = p5.getString(2131951865);
        this.T = p5.getString(2131952473);
        this.V = p5.getString(2131952454);
        this.Q = p5.getResources().getString(2131952105);
        this.I = p5.getResources().getString(2131952397);
        this.J = p5.getResources().getString(2131952398);
        this.K = p5.getResources().getString(2131952417);
        this.L = p5.getResources().getString(2131952418);
        this.M = p5.getResources().getString(2131952506);
        this.N = p5.getResources().getString(2131952507);
        this.O = p5.getResources().getString(2131951934);
        this.P = p5.getResources().getString(2131951883);
        this.w = i2.m.d().e("sun");
        this.G0 = this.n0();
        return;
    }

    public static float m0(float p5, float p6, float p7)
    {
        float v6_4;
        int v5_9 = (((p5 % 1103101952) + 1103101952) % 1103101952);
        float v6_10 = (((p6 % 1103101952) + 1103101952) % 1103101952);
        float v7_3 = (((p7 % 1103101952) + 1103101952) % 1103101952);
        float v1_2 = (((v7_3 - v6_10) + 1103101952) % 1103101952);
        float v6_3 = (((v5_9 - v6_10) + 1103101952) % 1103101952);
        int v4 = 1127481344;
        if (v6_3 > v1_2) {
            v6_4 = ((((((v5_9 - v7_3) + 1103101952) % 1103101952) / (1103101952 - v1_2)) * v4) + v4);
        } else {
            v6_4 = ((v6_3 / v1_2) * 1127481344);
        }
        return ((v6_4 + 1135869952) % 1135869952);
    }

    public static float o0(java.time.ZonedDateTime p3)
    {
        if (p3 != 0) {
            return ((((float) p3.getSecond()) / 1163984896) + ((((float) p3.getMinute()) / 1114636288) + ((float) p3.getHour())));
        } else {
            return 2143289344;
        }
    }

    public final void k0(i2.v0 p19, boolean p20)
    {
        int v10_6;
        float v2_28 = java.time.ZonedDateTime.now(java.time.ZoneId.systemDefault());
        double v3_21 = v2_28.toLocalDate();
        double v6_0 = v3_21.minusDays(1);
        int v7_1 = v3_21.plusDays(1);
        boolean v8_0 = this.E0;
        double v9_3 = v8_0.getFloat(this.M, 2143289344);
        int v11_2 = v8_0.getFloat(this.N, 2143289344);
        int v12_6 = v8_0.getFloat(this.I, 1093664768);
        int v13_4 = v8_0.getFloat(this.J, 1102577664);
        int v14_3 = v8_0.getFloat(this.K, 2143289344);
        int v10_5 = v8_0.getFloat(this.L, 2143289344);
        float v4_37 = Double.parseDouble(v8_0.getString(this.O, "35.7"));
        int v15_3 = v2_28.getZone();
        double v9_11 = q4.b.q(v6_0, v9_3, v15_3);
        double v6_1 = q4.b.q(v6_0, v11_2, v15_3);
        int v11_0 = q4.b.q(v3_21, v12_6, v15_3);
        double v3_20 = q4.b.q(v3_21, v13_4, v15_3);
        int v12_7 = q4.b.q(v7_1, v14_3, v15_3);
        int v7_0 = q4.b.q(v7_1, v10_5, v15_3);
        if ((v11_0 == 0) || (v12_7 == 0)) {
            if ((v9_11 == 0) || (v11_0 == 0)) {
                v10_6 = java.time.Duration.ofMinutes(1490);
            } else {
                v10_6 = java.time.Duration.between(v9_11, v11_0);
            }
        } else {
            v10_6 = java.time.Duration.between(v11_0, v12_7);
        }
        if (v11_0 == 0) {
            if (v12_7 == 0) {
                if (v9_11 == 0) {
                    v11_0 = v2_28.minusHours(12);
                } else {
                    v11_0 = v9_11.plus(v10_6);
                }
            } else {
                v11_0 = v12_7.minus(v10_6);
            }
        }
        if (v3_20 == 0) {
            if (v7_0 == 0) {
                if (v6_1 == 0) {
                    v6_1 = 0;
                }
            } else {
                v6_1 = v7_0;
            }
        } else {
            v6_1 = v3_20;
        }
        if ((v6_1 != 0) && (v6_1.isBefore(v11_0))) {
            v6_1 = v6_1.plusDays(1);
        }
        if (v6_1 == 0) {
            v6_1 = v11_0.plusHours(12);
        }
        if (v11_0.isAfter(v2_28)) {
            v11_0 = v11_0.minus(v10_6);
        }
        if (v6_1.isBefore(v11_0)) {
            v6_1 = v6_1.plusDays(1);
        }
        if (v6_1.isAfter(v11_0)) {
            v7_0 = v6_1;
        } else {
            if ((v7_0 == 0) || (!v7_0.isAfter(v11_0))) {
                v7_0 = v11_0.plusHours(12);
            }
        }
        if (v2_28.isBefore(v11_0)) {
            v11_0 = v11_0.minus(v10_6);
            v7_0 = v7_0.minus(v10_6);
        }
        double v9_0 = java.time.Duration.between(v11_0, v7_0).getSeconds();
        int v12_2 = 0;
        if (v9_0 > 0) {
            float v2_3 = (((double) java.time.Duration.between(v11_0, v2_28).getSeconds()) / ((double) v9_0));
            if ((Double.isNaN(v2_3)) || (Double.isInfinite(v2_3))) {
                v2_3 = 0;
            }
            if (v2_3 >= 0) {
                v12_2 = v2_3;
            }
            if (v12_2 > 4607182418800017408) {
                v12_2 = 4607182418800017408;
            }
        }
        Math.abs(v4_37);
        Math.sin((v12_2 * 4614256656552045848));
        this.K0 = n2.q.o0(v11_0);
        this.L0 = n2.q.o0(v7_0);
        this.Z = v8_0.getInt(this.P, 1);
        this.H0 = Integer.parseInt(v8_0.getString(this.F0, "27"));
        this.G0 = this.n0();
        float v2_14 = p19.l();
        double v6_6 = v2_14[1];
        float v5_1 = 1135869952;
        float v2_19 = (((1135869952 - n2.q.m0(v6_6, v2_14[0], v2_14[2])) % 1135869952) + 1127481344);
        double v6_10 = (((v5_1 - n2.q.m0(v6_6, this.K0, this.L0)) % v5_1) + 1127481344);
        float v5_2 = this.f0;
        boolean v8_2 = this.a0;
        v8_2[0] = v5_2;
        double v9_5 = this.g0;
        v8_2[1] = v9_5;
        boolean v8_3 = this.b0;
        v8_3[0] = v5_2;
        v8_3[1] = v9_5;
        this.h0 = 1065353216;
        boolean v8_4 = p19.a1;
        double v9_7 = this.s;
        float v4_5 = ((((float) p19.T1[0]) / v9_7) + p19.L0[0]);
        if (v8_4 == 5) {
            v4_5 = 1066192077;
        }
        double v3_9;
        int v17;
        int v12_5 = -1097229926;
        int v15_0 = 1053609165;
        if ((!v8_4) || ((v8_4 == 1) || (v8_4 == 2))) {
            v17 = 1065353216;
            double v3_16;
            if (v8_4) {
                if (v8_4 != 1) {
                    if (v8_4 != 2) {
                        if (v8_4 != 4) {
                            v3_16 = 1051931443;
                            if (v8_4 != 5) {
                                if (!p20) {
                                    v3_16 = 1061997773;
                                }
                            } else {
                                if (p20) {
                                    v3_16 = -1105618534;
                                }
                            }
                        } else {
                            if (!p20) {
                                v3_16 = 1056964608;
                            } else {
                                v3_16 = 1043542835;
                            }
                        }
                    } else {
                        if (!p20) {
                            v3_16 = 0;
                        } else {
                            v3_16 = 1036831949;
                        }
                    }
                } else {
                    if (p20) {
                        v12_5 = 1028443341;
                    }
                    v3_16 = v12_5;
                }
            } else {
                if (!p20) {
                    v3_16 = 1033476506;
                } else {
                    v3_16 = 1041865114;
                }
            }
            float v5_8;
            this.u = -1082130432;
            if (!p20) {
                v5_8 = (this.r * 1058642330);
            } else {
                v5_8 = (v9_7 * 1053609165);
            }
            this.g0 = ((((v17 - v4_5) + 1056964608) - v3_16) * v9_7);
            if (p20) {
                v15_0 = v17;
            }
            this.h0 = v15_0;
            v3_9 = v5_8;
        } else {
            v17 = 1065353216;
            if ((v8_4 != 8) && ((v8_4 != 4) && (v8_4 != 5))) {
                if (v8_4 != 3) {
                    if (v8_4 != 9) {
                        this.u = -1087834685;
                        this.g0 = (1059648963 * v9_7);
                        v3_9 = (1048576000 * v9_7);
                    } else {
                        double v3_10;
                        if (!p20) {
                            v3_10 = -1102263091;
                        } else {
                            v3_10 = -1088841318;
                        }
                        this.u = v3_10;
                        if (!p20) {
                            v3_9 = (this.r * 1058642330);
                        } else {
                            v3_9 = (1045220557 * v9_7);
                        }
                        float v4_8;
                        if (!p20) {
                            v4_8 = (v9_7 * 1056964608);
                        } else {
                            v4_8 = (1059648963 * v9_7);
                        }
                        float v5_5;
                        this.g0 = v4_8;
                        if (!p20) {
                            v5_5 = 1053609165;
                        } else {
                            v5_5 = 1065353216;
                        }
                        this.h0 = v5_5;
                    }
                } else {
                    this.u = -1097229926;
                    this.g0 = (1057803469 * v9_7);
                    v3_9 = (this.r * 1056964608);
                    if (p20) {
                        v15_0 = 1069547520;
                    }
                    this.h0 = v15_0;
                }
            }
        }
        if (!p20) {
            this.g0 = ((v9_7 * 1056964608) + this.g0);
        }
        this.f0 = (this.r * 1056964608);
        float v4_18 = ((double) ((float) Math.toRadians(((double) v2_19))));
        float v2_22 = ((float) Math.sin(v4_18));
        float v4_20 = ((float) Math.cos(v4_18));
        if (this.Z == -1) {
            v4_20 = (- v4_20);
        }
        float v4_22;
        boolean v8_5 = this.i0;
        if ((p19.a1 != 3) || (!v8_5)) {
            v4_22 = ((v4_20 * v3_9) + this.f0);
        } else {
            v4_22 = (this.r * 1056964608);
        }
        this.h = v4_22;
        this.i = (this.g0 - ((this.h0 * v3_9) * v2_22));
        float v4_28 = ((double) ((float) Math.toRadians(((double) v6_10))));
        float v2_24 = ((float) Math.sin(v4_28));
        float v4_30 = ((float) Math.cos(v4_28));
        if (this.Z == -1) {
            v4_30 = (- v4_30);
        }
        if ((p19.a1 != 3) || (!v8_5)) {
            float v1_3 = (this.f0 + (v4_30 * v3_9));
        } else {
            v1_3 = (this.r * 1056964608);
        }
        this.n = v1_3;
        float v4_34 = (this.g0 - ((v3_9 * this.h0) * v2_24));
        this.o = v4_34;
        this.Y = ((float) Math.toDegrees(Math.atan2(((double) (v4_34 - this.i)), ((double) (this.h - v1_3)))));
        return;
    }

    public final void l0(i2.v0 p21)
    {
        double v2_22 = p21.j();
        float v3_14 = m2.a.c(this.e, p21.a1);
        float[] v4_5 = p21.a1;
        n2.i v1_15 = p21.h;
        boolean v5 = v1_15.K;
        float v7_1 = 1065353216;
        n2.i v1_14 = ((int) (Math.max(0, Math.min(v7_1, ((v7_1 - (((float) (v1_15.x * 2)) * 1008981770)) + 1056964608))) * 1132396544));
        this.I0 = v1_14;
        this.v = 1045220557;
        if (v5) {
            v1_14 = 255;
        }
        float v13_0;
        if (v4_5 != 3) {
            v13_0 = 1068289229;
        } else {
            v13_0 = 1073741824;
        }
        int v16_0;
        float v14 = v3_14[3];
        int v6_0 = this.A;
        int v9_2 = this.E;
        if ((v2_22[0] == 0) && (v2_22[1] == 0)) {
            if (v2_22[2] == 0) {
                v16_0 = 0;
                int v15_1 = this.F;
                int v10_1 = this.B;
                int v8_1 = this.C;
                if ((v2_22[3] == 0) && (v2_22[4] == 0)) {
                    this.v = 1065353216;
                    this.x = ((v13_0 * 1056964608) + this.y);
                    if (v4_5 != null) {
                        if (v4_5 != 3) {
                            v6_0 = v15_1;
                        } else {
                            if (v3_14[0] > 1094713344) {
                                v6_0 = v10_1;
                            }
                        }
                    } else {
                        v6_0 = v8_1;
                    }
                } else {
                    if (v4_5 != null) {
                        if (v4_5 == 3) {
                            v15_1 = v10_1;
                        }
                    } else {
                        v15_1 = v8_1;
                    }
                    if (v14 >= 1048576000) {
                        this.v = 1065353216;
                    } else {
                        this.v = (1082130432 * v14);
                    }
                    this.x = ((Math.min(v14, 1056964608) * v13_0) + this.y);
                    v6_0 = i2.l.d(v9_2, v15_1, ((double) v14));
                }
            } else {
                this.x = this.y;
                v6_0 = v9_2;
                v16_0 = 0;
            }
        } else {
            v16_0 = 0;
            if (v14 <= 1056964608) {
                this.v = 1065353216;
            } else {
                this.v = ((1065353216 - v14) * 1073741824);
            }
            this.x = ((this.y + v13_0) - (Math.max(v14, 1056964608) * v13_0));
            if (v4_5 != 3) {
                v6_0 = this.D;
            }
            v6_0 = i2.l.d(v6_0, v9_2, ((double) v14));
        }
        this.x = Math.max(this.y, this.x);
        this.v = Math.max(1036831949, this.v);
        double v2_16 = ((((((v6_0 >> 16) & 255) << 16) | (v1_14 << 24)) | (((v6_0 >> 8) & 255) << 8)) | (255 & v6_0));
        float[] v4_3 = this.z;
        v4_3[v16_0] = (((float) android.graphics.Color.red(v2_16)) / 1132396544);
        v4_3[1] = (((float) android.graphics.Color.green(v2_16)) / 1132396544);
        v4_3[2] = (((float) android.graphics.Color.blue(v2_16)) / 1132396544);
        v4_3[3] = (((float) v1_14) / 1132396544);
        n2.i v1_8 = this.D0.x;
        if (v1_8 != null) {
            if (!v5) {
                v7_1 = (((float) this.I0) / 1132396544);
            }
            v1_8.F = v7_1;
        }
        return;
    }

    public final String n0()
    {
        String v0_4 = this.E0.getString(this.Q, "0");
        boolean v1_7 = this.S;
        if (!java.util.Objects.equals(v1_7, v0_4)) {
            boolean v1_8 = this.R;
            if (!v1_8.equals(v0_4)) {
                if ((!this.W.equals(v0_4)) && ((!this.X.equals(v0_4)) && ((!this.U.equals(v0_4)) && (!"0".equals(v0_4))))) {
                    return this.V;
                } else {
                    return this.T;
                }
            } else {
                return v1_8;
            }
        } else {
            return v1_7;
        }
    }
}
