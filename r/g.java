package r;
public final class g implements java.lang.Cloneable {
    public synthetic boolean a;
    public synthetic long[] b;
    public synthetic Object[] c;
    public synthetic int d;

    public g()
    {
        int v0_0 = 4;
        while(true) {
            int v2_0 = 80;
            if (v0_0 < 32) {
                int v1_3 = ((1 << v0_0) - 12);
                if (80 <= v1_3) {
                    break;
                }
                v0_0++;
            }
            int v2_1 = (v2_0 / 8);
            int v0_1 = new long[v2_1];
            this.b = v0_1;
            int v0_2 = new Object[v2_1];
            this.c = v0_2;
            return;
        }
        v2_0 = v1_3;
        v2_1 = (v2_0 / 8);
        v0_1 = new long[v2_1];
        this.b = v0_1;
        v0_2 = new Object[v2_1];
        this.c = v0_2;
        return;
    }

    public final void a()
    {
        int v0 = this.d;
        int v3 = 0;
        while (v3 < v0) {
            this.c[v3] = 0;
            v3++;
        }
        this.d = 0;
        this.a = 0;
        return;
    }

    public final Object b(long p3)
    {
        int v3_2 = s.a.b(this.b, this.d, p3);
        if (v3_2 >= 0) {
            int v3_3 = this.c[v3_2];
            if (v3_3 != r.h.a) {
                return v3_3;
            }
        }
        return 0;
    }

    public final Object clone()
    {
        r.g v0_0 = super.clone();
        kotlin.jvm.internal.j.c(v0_0, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        r.g v0_1 = ((r.g) v0_0);
        v0_1.b = ((long[]) this.b.clone());
        v0_1.c = ((Object[]) this.c.clone());
        return v0_1;
    }

    public final long d(int p11)
    {
        if (p11 >= null) {
            long v1_0 = this.d;
            if (p11 < v1_0) {
                if (this.a) {
                    long[] v2_1 = this.b;
                    Object[] v3 = this.c;
                    int v5 = 0;
                    int v6 = 0;
                    while (v5 < v1_0) {
                        Object v7 = v3[v5];
                        if (v7 != r.h.a) {
                            if (v5 != v6) {
                                v2_1[v6] = v2_1[v5];
                                v3[v6] = v7;
                                v3[v5] = 0;
                            }
                            v6++;
                        }
                        v5++;
                    }
                    this.a = 0;
                    this.d = v6;
                }
                return this.b[p11];
            }
        }
        long v1_3 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        v1_3.append(p11);
        s.a.c(v1_3.toString());
        throw 0;
    }

    public final void e(long p11, Object p13)
    {
        String v0_0 = r.h.a;
        int v1_3 = s.a.b(this.b, this.d, p11);
        if (v1_3 < 0) {
            int v1_2 = (~ v1_3);
            int v2_9 = this.d;
            if (v1_2 < v2_9) {
                int v3_3 = this.c;
                if (v3_3[v1_2] == v0_0) {
                    this.b[v1_2] = p11;
                    v3_3[v1_2] = p13;
                    return;
                }
            }
            if (this.a) {
                int v3_1 = this.b;
                if (v2_9 >= v3_1.length) {
                    int v1_1 = this.c;
                    int v5_0 = 0;
                    int v6 = 0;
                    while (v5_0 < v2_9) {
                        int v7_0 = v1_1[v5_0];
                        if (v7_0 != v0_0) {
                            if (v5_0 != v6) {
                                v3_1[v6] = v3_1[v5_0];
                                v1_1[v6] = v7_0;
                                v1_1[v5_0] = 0;
                            }
                            v6++;
                        }
                        v5_0++;
                    }
                    this.a = 0;
                    this.d = v6;
                    v1_2 = (~ s.a.b(this.b, v6, p11));
                }
            }
            String v0_3 = this.d;
            if (v0_3 >= this.b.length) {
                String v0_5 = ((v0_3 + 1) * 8);
                int v2_3 = 4;
                while (v2_3 < 32) {
                    String v4_5 = ((1 << v2_3) - 12);
                    if (v0_5 > v4_5) {
                        v2_3++;
                    } else {
                        v0_5 = v4_5;
                        break;
                    }
                }
                String v0_6 = (v0_5 / 8);
                int v2_5 = java.util.Arrays.copyOf(this.b, v0_6);
                kotlin.jvm.internal.j.d(v2_5, "copyOf(...)");
                this.b = v2_5;
                String v0_7 = java.util.Arrays.copyOf(this.c, v0_6);
                kotlin.jvm.internal.j.d(v0_7, "copyOf(...)");
                this.c = v0_7;
            }
            String v0_9 = (this.d - v1_2);
            if (v0_9 != null) {
                int v2_7 = this.b;
                String v4_7 = (v1_2 + 1);
                kotlin.jvm.internal.j.e(v2_7, "<this>");
                System.arraycopy(v2_7, v1_2, v2_7, v4_7, v0_9);
                i7.h.Z(this.c, v4_7, this.c, v1_2, this.d);
            }
            this.b[v1_2] = p11;
            this.c[v1_2] = p13;
            this.d = (this.d + 1);
            return;
        } else {
            this.c[v1_3] = p13;
            return;
        }
    }

    public final int g()
    {
        if (this.a) {
            int v0_2 = this.d;
            long[] v1 = this.b;
            Object[] v2 = this.c;
            int v4 = 0;
            int v5 = 0;
            while (v4 < v0_2) {
                int v6_0 = v2[v4];
                if (v6_0 != r.h.a) {
                    if (v4 != v5) {
                        v1[v5] = v1[v4];
                        v2[v5] = v6_0;
                        v2[v4] = 0;
                    }
                    v5++;
                }
                v4++;
            }
            this.a = 0;
            this.d = v5;
        }
        return this.d;
    }

    public final Object h(int p11)
    {
        if (p11 >= null) {
            StringBuilder v1_0 = this.d;
            if (p11 < v1_0) {
                if (this.a) {
                    long[] v2_1 = this.b;
                    Object[] v3 = this.c;
                    int v5 = 0;
                    int v6 = 0;
                    while (v5 < v1_0) {
                        Object v7 = v3[v5];
                        if (v7 != r.h.a) {
                            if (v5 != v6) {
                                v2_1[v6] = v2_1[v5];
                                v3[v6] = v7;
                                v3[v5] = 0;
                            }
                            v6++;
                        }
                        v5++;
                    }
                    this.a = 0;
                    this.d = v6;
                }
                return this.c[p11];
            }
        }
        StringBuilder v1_2 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        v1_2.append(p11);
        s.a.c(v1_2.toString());
        throw 0;
    }

    public final String toString()
    {
        if (this.g() > 0) {
            String v1_2 = new StringBuilder((this.d * 28));
            v1_2.append(123);
            String v0_7 = this.d;
            int v2 = 0;
            while (v2 < v0_7) {
                if (v2 > 0) {
                    v1_2.append(", ");
                }
                v1_2.append(this.d(v2));
                v1_2.append(61);
                String v3_3 = this.h(v2);
                if (v3_3 == v1_2) {
                    v1_2.append("(this Map)");
                } else {
                    v1_2.append(v3_3);
                }
                v2++;
            }
            v1_2.append(125);
            String v0_2 = v1_2.toString();
            kotlin.jvm.internal.j.d(v0_2, "toString(...)");
            return v0_2;
        } else {
            return "{}";
        }
    }
}
