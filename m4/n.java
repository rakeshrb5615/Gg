package m4;
public final class n extends m4.f {
    public static final m4.n m;
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    static n()
    {
        Object[] v2 = new Object[0];
        m4.n.m = new m4.n(0, v2, 0);
        return;
    }

    public n(Object p1, Object[] p2, int p3)
    {
        this.d = p1;
        this.e = p2;
        this.f = p3;
        return;
    }

    public static m4.n b(int p19, Object[] p20, g0.d p21)
    {
        IllegalArgumentException v0_0 = p19;
        Object[] v1 = p20;
        if (p19 != 0) {
            m4.e v3_1 = 0;
            int[] v4_3 = 0;
            int v5_5 = 1;
            if (p19 != 1) {
                boolean v18_0;
                int v17_0;
                int[] v16_0;
                a.a.h(p19, (p20.length >> 1));
                int v6_0 = m4.g.f(p19);
                boolean v7_0 = 2;
                if (p19 != 1) {
                    int[] v4_0;
                    int v8 = (v6_0 - 1);
                    if (v6_0 > 128) {
                        v16_0 = 0;
                        v17_0 = 1;
                        if (v6_0 > 32768) {
                            int[] v4_9 = new int[v6_0];
                            java.util.Arrays.fill(v4_9, -1);
                            int v5_7 = 0;
                            int v6_5 = 0;
                            while (v5_7 < p19) {
                                int v9_2 = (v5_7 * 2);
                                Object v12_3 = (v6_5 * 2);
                                int v13_3 = p20[v9_2];
                                java.util.Objects.requireNonNull(v13_3);
                                int v9_4 = p20[(v9_2 ^ 1)];
                                java.util.Objects.requireNonNull(v9_4);
                                int v14_5 = a.a.U(v13_3.hashCode());
                                while(true) {
                                    boolean v18_1;
                                    int v14_6 = (v14_5 & v8);
                                    boolean v15_6 = v4_9[v14_6];
                                    if (v15_6 != -1) {
                                        v18_1 = v7_0;
                                        if (v13_3.equals(p20[v15_6])) {
                                            break;
                                        }
                                        v14_5 = (v14_6 + 1);
                                        v7_0 = v18_1;
                                    } else {
                                        v4_9[v14_6] = v12_3;
                                        if (v6_5 < v5_7) {
                                            p20[v12_3] = v13_3;
                                            p20[(v12_3 ^ 1)] = v9_4;
                                        }
                                        v6_5++;
                                        v18_1 = v7_0;
                                    }
                                    v5_7++;
                                    v7_0 = v18_1;
                                }
                                boolean v7_3 = (v15_6 ^ 1);
                                Object v12_4 = p20[v7_3];
                                java.util.Objects.requireNonNull(v12_4);
                                v3_1 = new m4.e(v13_3, v9_4, v12_4);
                                p20[v7_3] = v9_4;
                            }
                            v18_0 = v7_0;
                            if (v6_5 != p19) {
                                int v5_8 = new Object[3];
                                v5_8[0] = v4_9;
                                v5_8[1] = Integer.valueOf(v6_5);
                                v5_8[v18_0] = v3_1;
                                v3_1 = v5_8;
                                if ((v3_1 instanceof Object[])) {
                                    m4.e v3_3 = ((Object[]) v3_1);
                                    IllegalArgumentException v0_2 = ((m4.e) v3_3[v18_0]);
                                    if (p21 == null) {
                                        throw v0_2.a();
                                    } else {
                                        p21.d = v0_2;
                                        IllegalArgumentException v0_4 = v3_3[v16_0];
                                        int v2_3 = ((Integer) v3_3[v17_0]).intValue();
                                        v1 = java.util.Arrays.copyOf(p20, (v2_3 * 2));
                                        v3_1 = v0_4;
                                        v0_0 = v2_3;
                                    }
                                }
                                return new m4.n(v3_1, v1, v0_0);
                            } else {
                                v3_1 = v4_9;
                            }
                        } else {
                            v4_0 = new short[v6_0];
                            java.util.Arrays.fill(v4_0, -1);
                            int v5_0 = 0;
                            int v6_1 = 0;
                            while (v5_0 < p19) {
                                int v9_5 = (v5_0 * 2);
                                int v11_4 = (v6_1 * 2);
                                Object v12_6 = p20[v9_5];
                                java.util.Objects.requireNonNull(v12_6);
                                int v9_7 = p20[(v9_5 ^ 1)];
                                java.util.Objects.requireNonNull(v9_7);
                                int v13_0 = a.a.U(v12_6.hashCode());
                                while(true) {
                                    int v13_5 = (v13_0 & v8);
                                    int v14_1 = (v4_0[v13_5] & 65535);
                                    if (v14_1 == 65535) {
                                        break;
                                    }
                                    if (!v12_6.equals(p20[v14_1])) {
                                        v13_0 = (v13_5 + 1);
                                    } else {
                                        int v11_0 = (v14_1 ^ 1);
                                        int v13_1 = p20[v11_0];
                                        java.util.Objects.requireNonNull(v13_1);
                                        v3_1 = new m4.e(v12_6, v9_7, v13_1);
                                        p20[v11_0] = v9_7;
                                    }
                                    v5_0++;
                                }
                                v4_0[v13_5] = ((short) v11_4);
                                if (v6_1 < v5_0) {
                                    p20[v11_4] = v12_6;
                                    p20[(v11_4 ^ 1)] = v9_7;
                                }
                                v6_1++;
                            }
                            if (v6_1 != p19) {
                                int v5_9 = new Object[3];
                                v5_9[0] = v4_0;
                                v5_9[1] = Integer.valueOf(v6_1);
                                v5_9[2] = v3_1;
                                v3_1 = v5_9;
                                v18_0 = 2;
                            }
                        }
                    } else {
                        int v6_2 = new byte[v6_0];
                        java.util.Arrays.fill(v6_2, -1);
                        int v9_0 = 0;
                        int v11_2 = 0;
                        while (v9_0 < p19) {
                            Object v12_0 = (v9_0 * 2);
                            int v13_2 = (v11_2 * 2);
                            int v14_3 = p20[v12_0];
                            java.util.Objects.requireNonNull(v14_3);
                            Object v12_2 = p20[(v12_0 ^ v5_5)];
                            java.util.Objects.requireNonNull(v12_2);
                            boolean v15_4 = a.a.U(v14_3.hashCode());
                            while(true) {
                                boolean v15_5 = (v15_4 & v8);
                                int[] v16_1 = v4_3;
                                int v17_1 = v5_5;
                                int[] v4_2 = (v6_2[v15_5] & 255);
                                if (v4_2 == 255) {
                                    break;
                                }
                                if (!v14_3.equals(p20[v4_2])) {
                                    v15_4 = (v15_5 + 1);
                                    v4_3 = v16_1;
                                    v5_5 = v17_1;
                                } else {
                                    int[] v4_4 = (v4_2 ^ 1);
                                    int v5_6 = p20[v4_4];
                                    java.util.Objects.requireNonNull(v5_6);
                                    v3_1 = new m4.e(v14_3, v12_2, v5_6);
                                    p20[v4_4] = v12_2;
                                }
                                v9_0++;
                                v4_3 = v16_1;
                                v5_5 = v17_1;
                            }
                            v6_2[v15_5] = ((byte) v13_2);
                            if (v11_2 < v9_0) {
                                p20[v13_2] = v14_3;
                                p20[(v13_2 ^ 1)] = v12_2;
                            }
                            v11_2++;
                        }
                        v16_0 = v4_3;
                        v17_0 = v5_5;
                        if (v11_2 != p19) {
                            v4_0 = new Object[3];
                            v4_0[v16_0] = v6_2;
                            v4_0[v17_0] = Integer.valueOf(v11_2);
                            v4_0[2] = v3_1;
                        } else {
                            v3_1 = v6_2;
                        }
                    }
                    v3_1 = v4_0;
                } else {
                    java.util.Objects.requireNonNull(p20[0]);
                    java.util.Objects.requireNonNull(p20[1]);
                    v16_0 = 0;
                    v17_0 = 1;
                }
            } else {
                java.util.Objects.requireNonNull(p20[0]);
                java.util.Objects.requireNonNull(p20[1]);
                return new m4.n(0, p20, 1);
            }
        } else {
            return m4.n.m;
        }
    }

    public final Object get(Object p9)
    {
        Object v9_2;
        if (p9 != null) {
            Object[] v1 = this.e;
            if (this.f != 1) {
                int v2_10 = this.d;
                if (v2_10 != 0) {
                    if (!(v2_10 instanceof byte[])) {
                        if (!(v2_10 instanceof short[])) {
                            int v2_0 = ((int[]) v2_10);
                            int v4_2 = (v2_0.length - 1);
                            int v5_1 = a.a.U(p9.hashCode());
                            while(true) {
                                int v5_2 = (v5_1 & v4_2);
                                int v6_0 = v2_0[v5_2];
                                if (v6_0 != -1) {
                                    if (p9.equals(v1[v6_0])) {
                                        break;
                                    }
                                    v5_1 = (v5_2 + 1);
                                } else {
                                    v9_2 = 0;
                                }
                            }
                            v9_2 = v1[(v6_0 ^ 1)];
                        } else {
                            int v4_4 = ((short[]) v2_10);
                            int v5_3 = (v4_4.length - 1);
                            int v2_4 = a.a.U(p9.hashCode());
                            while(true) {
                                int v2_5 = (v2_4 & v5_3);
                                int v6_2 = (v4_4[v2_5] & 65535);
                                if (v6_2 != 65535) {
                                    if (p9.equals(v1[v6_2])) {
                                        break;
                                    }
                                    v2_4 = (v2_5 + 1);
                                }
                            }
                            v9_2 = v1[(v6_2 ^ 1)];
                        }
                    } else {
                        int v4_6 = ((byte[]) v2_10);
                        int v5_4 = (v4_6.length - 1);
                        int v2_8 = a.a.U(p9.hashCode());
                        while(true) {
                            int v2_9 = (v2_8 & v5_4);
                            int v6_4 = (v4_6[v2_9] & 255);
                            if (v6_4 != 255) {
                                if (p9.equals(v1[v6_4])) {
                                    break;
                                }
                                v2_8 = (v2_9 + 1);
                            }
                        }
                        v9_2 = v1[(v6_4 ^ 1)];
                    }
                }
            } else {
                int v2_12 = v1[0];
                java.util.Objects.requireNonNull(v2_12);
                if (!v2_12.equals(p9)) {
                } else {
                    v9_2 = v1[1];
                    java.util.Objects.requireNonNull(v9_2);
                }
            }
        }
        if (v9_2 != null) {
            return v9_2;
        } else {
            return 0;
        }
    }

    public final int size()
    {
        return this.f;
    }
}
