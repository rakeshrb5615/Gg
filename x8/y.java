package x8;
public final class y implements java.lang.Comparable {
    public static final String b;
    public final x8.j a;

    static y()
    {
        String v0 = java.io.File.separator;
        kotlin.jvm.internal.j.d(v0, "separator");
        x8.y.b = v0;
        return;
    }

    public y(x8.j p2)
    {
        kotlin.jvm.internal.j.e(p2, "bytes");
        this.a = p2;
        return;
    }

    public final java.util.ArrayList a()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1_0 = y8.c.a(this);
        x8.j v4 = this.a;
        if (v1_0 != -1) {
            if ((v1_0 < v4.d()) && (v4.i(v1_0) == 92)) {
                v1_0++;
            }
        } else {
            v1_0 = 0;
        }
        byte v2_1 = v4.d();
        int v5_0 = v1_0;
        while (v1_0 < v2_1) {
            if ((v4.i(v1_0) == 47) || (v4.i(v1_0) == 92)) {
                v0_1.add(v4.o(v5_0, v1_0));
                v5_0 = (v1_0 + 1);
            }
            v1_0++;
        }
        if (v5_0 < v4.d()) {
            v0_1.add(v4.o(v5_0, v4.d()));
        }
        return v0_1;
    }

    public final x8.y b(x8.y p12)
    {
        java.util.ArrayList v6_1;
        kotlin.jvm.internal.j.e(p12, "other");
        x8.g v0_1 = p12.a;
        String v1_5 = y8.c.a(this);
        int v2_2 = this.a;
        x8.j v3_4 = 0;
        if (v1_5 != -1) {
            v6_1 = new x8.y(v2_2.o(0, v1_5));
        } else {
            v6_1 = 0;
        }
        String v1_1 = y8.c.a(p12);
        if (v1_1 != -1) {
            v3_4 = new x8.y(v0_1.o(0, v1_1));
        }
        if (!kotlin.jvm.internal.j.a(v6_1, v3_4)) {
            x8.g v0_3 = new StringBuilder("Paths of different roots cannot be relative to each other: ");
            v0_3.append(this);
            v0_3.append(" and ");
            v0_3.append(p12);
            throw new IllegalArgumentException(v0_3.toString().toString());
        } else {
            String v1_6 = this.a();
            java.util.ArrayList v6_2 = p12.a();
            x8.j v7_1 = Math.min(v1_6.size(), v6_2.size());
            int v8_0 = 0;
            while ((v8_0 < v7_1) && (kotlin.jvm.internal.j.a(v1_6.get(v8_0), v6_2.get(v8_0)))) {
                v8_0++;
            }
            if ((v8_0 != v7_1) || (v2_2.d() != v0_1.d())) {
                if (v6_2.subList(v8_0, v6_2.size()).indexOf(y8.c.e) != -1) {
                    x8.g v0_7 = new StringBuilder("Impossible relative path to resolve: ");
                    v0_7.append(this);
                    v0_7.append(" and ");
                    v0_7.append(p12);
                    throw new IllegalArgumentException(v0_7.toString().toString());
                } else {
                    if (!kotlin.jvm.internal.j.a(v0_1, y8.c.d)) {
                        x8.g v0_12 = new x8.g();
                        x8.y v12_8 = y8.c.c(p12);
                        if (v12_8 == null) {
                            v12_8 = y8.c.c(this);
                            if (v12_8 == null) {
                                v12_8 = y8.c.f(x8.y.b);
                            }
                        }
                        int v2_0 = v6_2.size();
                        x8.j v3_0 = v8_0;
                        while (v3_0 < v2_0) {
                            v0_12.K(y8.c.e);
                            v0_12.K(v12_8);
                            v3_0++;
                        }
                        int v2_1 = v1_6.size();
                        while (v8_0 < v2_1) {
                            v0_12.K(((x8.j) v1_6.get(v8_0)));
                            v0_12.K(v12_8);
                            v8_0++;
                        }
                        return y8.c.d(v0_12, 0);
                    } else {
                        return this;
                    }
                }
            } else {
                return a6.e.d(".");
            }
        }
    }

    public final x8.y c(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "child");
        x8.y v0_2 = new x8.g();
        v0_2.S(p2);
        return y8.c.b(this, y8.c.d(v0_2, 0), 0);
    }

    public final int compareTo(Object p2)
    {
        kotlin.jvm.internal.j.e(((x8.y) p2), "other");
        return this.a.b(((x8.y) p2).a);
    }

    public final Character d()
    {
        int v1_0 = this.a;
        if ((x8.j.g(v1_0, y8.c.a) == -1) && ((v1_0.d() >= 2) && (v1_0.i(1) == 58))) {
            Character v0_5 = ((char) v1_0.i(0));
            if (((97 <= v0_5) && (v0_5 < 123)) || ((65 <= v0_5) && (v0_5 < 91))) {
                return Character.valueOf(v0_5);
            }
        }
        return 0;
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof x8.y)) || (!kotlin.jvm.internal.j.a(((x8.y) p2).a, this.a))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }

    public final java.io.File toFile()
    {
        return new java.io.File(this.a.r());
    }

    public final String toString()
    {
        return this.a.r();
    }
}
