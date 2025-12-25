package androidx.datastore.preferences.protobuf;
public final class b1 {
    public static final androidx.datastore.preferences.protobuf.b1 f;
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    static b1()
    {
        int[] v2 = new int[0];
        Object[] v3 = new Object[0];
        androidx.datastore.preferences.protobuf.b1.f = new androidx.datastore.preferences.protobuf.b1(0, v2, v3, 0);
        return;
    }

    public b1(int p2, int[] p3, Object[] p4, boolean p5)
    {
        this.d = -1;
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.e = p5;
        return;
    }

    public final void a(int p4)
    {
        Object[] v0_0 = this.b;
        if (p4 > v0_0.length) {
            int v1_1 = this.a;
            int v2_1 = ((v1_1 / 2) + v1_1);
            if (v2_1 >= p4) {
                p4 = v2_1;
            }
            if (p4 < 8) {
                p4 = 8;
            }
            this.b = java.util.Arrays.copyOf(v0_0, p4);
            this.c = java.util.Arrays.copyOf(this.c, p4);
        }
        return;
    }

    public final int b()
    {
        IllegalStateException v0_0 = this.d;
        if (v0_0 == -1) {
            IllegalStateException v0_1 = 0;
            androidx.datastore.preferences.protobuf.y v1_1 = 0;
            while (v0_1 < this.a) {
                int v2_5;
                int v3_1;
                int v2_0 = this.b[v0_1];
                int v3_0 = (v2_0 >> 3);
                int v2_1 = (v2_0 & 7);
                if (v2_1 == 0) {
                    int v4_0 = ((Long) this.c[v0_1]).longValue();
                    v2_5 = androidx.datastore.preferences.protobuf.l.r0(v3_0);
                    v3_1 = androidx.datastore.preferences.protobuf.l.t0(v4_0);
                    v1_1 = ((v3_1 + v2_5) + v1_1);
                } else {
                    int v2_10;
                    if (v2_1 == 1) {
                        ((Long) this.c[v0_1]).getClass();
                        v2_10 = (androidx.datastore.preferences.protobuf.l.r0(v3_0) + 8);
                    } else {
                        if (v2_1 == 2) {
                            v2_10 = androidx.datastore.preferences.protobuf.l.p0(v3_0, ((androidx.datastore.preferences.protobuf.g) this.c[v0_1]));
                        } else {
                            if (v2_1 == 3) {
                                v2_5 = (androidx.datastore.preferences.protobuf.l.r0(v3_0) * 2);
                                v3_1 = ((androidx.datastore.preferences.protobuf.b1) this.c[v0_1]).b();
                            } else {
                                if (v2_1 != 5) {
                                    throw new IllegalStateException(androidx.datastore.preferences.protobuf.z.b());
                                } else {
                                    ((Integer) this.c[v0_1]).getClass();
                                    v2_10 = (androidx.datastore.preferences.protobuf.l.r0(v3_0) + 4);
                                }
                            }
                        }
                    }
                    v1_1 = (v2_10 + v1_1);
                }
                v0_1++;
            }
            this.d = v1_1;
            return v1_1;
        } else {
            return v0_0;
        }
    }

    public final void c(int p3, Object p4)
    {
        if (!this.e) {
            throw new UnsupportedOperationException();
        } else {
            this.a((this.a + 1));
            int v1_1 = this.a;
            this.b[v1_1] = p3;
            this.c[v1_1] = p4;
            this.a = (v1_1 + 1);
            return;
        }
    }

    public final void d(androidx.datastore.preferences.protobuf.e0 p7)
    {
        if (this.a != 0) {
            p7.getClass();
            androidx.datastore.preferences.protobuf.y v0_2 = ((androidx.datastore.preferences.protobuf.l) p7.a);
            int v1 = 0;
            while (v1 < this.a) {
                int v2_7 = this.b[v1];
                Integer v3_1 = this.c[v1];
                int v4 = (v2_7 >> 3);
                int v2_0 = (v2_7 & 7);
                if (v2_0 == 0) {
                    v0_2.N0(v4, ((Long) v3_1).longValue());
                } else {
                    if (v2_0 == 1) {
                        v0_2.D0(v4, ((Long) v3_1).longValue());
                    } else {
                        if (v2_0 == 2) {
                            v0_2.z0(v4, ((androidx.datastore.preferences.protobuf.g) v3_1));
                        } else {
                            if (v2_0 == 3) {
                                v0_2.K0(v4, 3);
                                ((androidx.datastore.preferences.protobuf.b1) v3_1).d(p7);
                                v0_2.K0(v4, 4);
                            } else {
                                if (v2_0 != 5) {
                                    throw new RuntimeException(androidx.datastore.preferences.protobuf.z.b());
                                } else {
                                    v0_2.B0(v4, ((Integer) v3_1).intValue());
                                }
                            }
                        }
                    }
                }
                v1++;
            }
        }
        return;
    }

    public final boolean equals(Object p9)
    {
        if (this != p9) {
            if (p9 != null) {
                if ((p9 instanceof androidx.datastore.preferences.protobuf.b1)) {
                    Object[] v2_2 = this.a;
                    if (v2_2 == ((androidx.datastore.preferences.protobuf.b1) p9).a) {
                        boolean v5_0 = 0;
                        while (v5_0 < v2_2) {
                            if (this.b[v5_0] == ((androidx.datastore.preferences.protobuf.b1) p9).b[v5_0]) {
                                v5_0++;
                            }
                        }
                        int v4_1 = 0;
                        while (v4_1 < this.a) {
                            if (this.c[v4_1].equals(((androidx.datastore.preferences.protobuf.b1) p9).c[v4_1])) {
                                v4_1++;
                            }
                        }
                        return 1;
                    }
                    return 0;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        Object[] v0_0 = this.a;
        int v3_1 = 17;
        int v4 = 0;
        int v6_1 = 17;
        int v5_2 = 0;
        while (v5_2 < v0_0) {
            v6_1 = ((v6_1 * 31) + this.b[v5_2]);
            v5_2++;
        }
        int v1_2 = ((((527 + v0_0) * 31) + v6_1) * 31);
        int v2_0 = this.a;
        while (v4 < v2_0) {
            v3_1 = ((v3_1 * 31) + this.c[v4].hashCode());
            v4++;
        }
        return (v1_2 + v3_1);
    }
}
