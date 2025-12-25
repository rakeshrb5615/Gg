package m4;
public abstract class g extends m4.a implements java.util.Set {
    public static final synthetic int c;
    public transient m4.d b;

    public static int f(int p5)
    {
        IllegalArgumentException v5_3 = Math.max(p5, 2);
        int v1_3 = 1;
        if (v5_3 >= 751619276) {
            if (v5_3 >= 1073741824) {
                v1_3 = 0;
            }
            if (v1_3 == 0) {
                throw new IllegalArgumentException("collection too large");
            } else {
                return 1073741824;
            }
        } else {
            String v0_4 = (Integer.highestOneBit((v5_3 - 1)) << 1);
            while ((((double) v0_4) * 4604480259023595110) < ((double) v5_3)) {
                v0_4 <<= 1;
            }
            return v0_4;
        }
    }

    public static varargs m4.g g(int p13, Object[] p14)
    {
        if (p13 == 0) {
            return m4.o.p;
        } else {
            if (p13 == 1) {
                int v13_9 = p14[0];
                java.util.Objects.requireNonNull(v13_9);
                return new m4.r(v13_9);
            } else {
                int v2_0 = m4.g.f(p13);
                Object[] v6 = new Object[v2_0];
                int v7 = (v2_0 - 1);
                int v3_0 = 0;
                int v5 = 0;
                int v8 = 0;
                while (v3_0 < p13) {
                    Object[] v4_1 = p14[v3_0];
                    if (v4_1 == null) {
                        throw new NullPointerException(g2.g.c(v3_0, "at index "));
                    } else {
                        int v9 = v4_1.hashCode();
                        int v10_0 = a.a.U(v9);
                        while(true) {
                            boolean v11_0 = (v10_0 & v7);
                            Object v12 = v6[v11_0];
                            if (v12 == null) {
                                break;
                            }
                            if (!v12.equals(v4_1)) {
                                v10_0++;
                            }
                            v3_0++;
                        }
                        int v10_1 = (v8 + 1);
                        p14[v8] = v4_1;
                        v6[v11_0] = v4_1;
                        v5 += v9;
                        v8 = v10_1;
                    }
                }
                java.util.Arrays.fill(p14, v8, p13, 0);
                if (v8 != 1) {
                    if (m4.g.f(v8) >= (v2_0 / 2)) {
                        int v13_3 = p14.length;
                        if (v8 < ((v13_3 >> 1) + (v13_3 >> 2))) {
                            p14 = java.util.Arrays.copyOf(p14, v8);
                        }
                        return new m4.o(p14, v5, v6, v7, v8);
                    } else {
                        return m4.g.g(v8, p14);
                    }
                } else {
                    int v13_6 = p14[0];
                    java.util.Objects.requireNonNull(v13_6);
                    return new m4.r(v13_6);
                }
            }
        }
    }

    public m4.d e()
    {
        m4.d v0 = this.b;
        if (v0 == null) {
            v0 = this.h();
            this.b = v0;
        }
        return v0;
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((!(p5 instanceof m4.g)) || ((!(this instanceof m4.o)) || ((!(((m4.g) p5) instanceof m4.o)) || (this.hashCode() == p5.hashCode())))) {
                try {
                    if ((this != p5) && ((!(p5 instanceof java.util.Set)) || ((this.size() != ((java.util.Set) p5).size()) || (!this.containsAll(((java.util.Set) p5)))))) {
                        return 0;
                    } else {
                        return 1;
                    }
                } catch (ClassCastException) {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public m4.d h()
    {
        m4.i v0_1 = this.toArray(m4.a.a);
        return m4.d.e(v0_1.length, v0_1);
    }

    public int hashCode()
    {
        java.util.Iterator v0 = this.iterator();
        int v2_2 = 0;
        while (v0.hasNext()) {
            int v3_0;
            int v3_2 = v0.next();
            if (v3_2 == 0) {
                v3_0 = 0;
            } else {
                v3_0 = v3_2.hashCode();
            }
            v2_2 = (~ (~ (v2_2 + v3_0)));
        }
        return v2_2;
    }
}
