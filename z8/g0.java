package z8;
public final class g0 extends z8.z0 {
    public final reflect.Method d;
    public final int e;
    public final String f;
    public final z8.a g;
    public final boolean h;

    public g0(reflect.Method p2, int p3, String p4, boolean p5)
    {
        this.d = p2;
        this.e = p3;
        java.util.Objects.requireNonNull(p4, "name == null");
        this.f = p4;
        this.g = z8.a.b;
        this.h = p5;
        return;
    }

    public final void a(z8.n0 p23, Object p24)
    {
        boolean v3_1 = this.f;
        if (p24 == null) {
            x8.g v2_7 = new Object[0];
            throw z8.z0.n(this.d, this.e, v1.a.l("Path parameter \"", v3_1, "\" value must not be null."), v2_7);
        } else {
            this.g.getClass();
            int v4_2 = p24.toString();
            if (p23.c == null) {
                throw new AssertionError();
            } else {
                String v5_1 = v4_2.length();
                int v6_0 = 0;
                while (v6_0 < v5_1) {
                    int v7_0 = v4_2.codePointAt(v6_0);
                    boolean v8 = this.h;
                    long v10_1 = 47;
                    char v11_4 = -1;
                    int v13_4 = 127;
                    int v14_2 = 32;
                    if ((v7_0 >= 32) && ((v7_0 < 127) && ((" \"<>^`{}|\\?#".indexOf(v7_0) == -1) && ((v8) || ((v7_0 != 47) && (v7_0 != 37)))))) {
                        v6_0 += Character.charCount(v7_0);
                    } else {
                        int v7_3 = new x8.g();
                        v7_3.R(0, v6_0, v4_2);
                        x8.g v2_1 = 0;
                        while (v6_0 < v5_1) {
                            int v15_1 = v4_2.codePointAt(v6_0);
                            if ((!v8) || ((v15_1 != 9) && ((v15_1 != 10) && ((v15_1 != 12) && (v15_1 != 13))))) {
                                if ((v15_1 >= v14_2) && ((v15_1 < v13_4) && ((" \"<>^`{}|\\?#".indexOf(v15_1) == v11_4) && ((v8) || ((v15_1 != v10_1) && (v15_1 != 37)))))) {
                                    v7_3.T(v15_1);
                                } else {
                                    if (v2_1 == null) {
                                        v2_1 = new x8.g();
                                    }
                                    v2_1.T(v15_1);
                                    long v18 = v2_1.b;
                                    int v9_0 = 0;
                                    while (v9_0 < v18) {
                                        char v11_1 = v2_1.A(v9_0);
                                        int v13_0 = (v11_1 & 255);
                                        v7_3.M(37);
                                        long v20_0 = z8.n0.l;
                                        v7_3.M(v20_0[((v13_0 >> 4) & 15)]);
                                        v7_3.M(v20_0[(v11_1 & 15)]);
                                        v9_0++;
                                        int v14 = 32;
                                    }
                                    v2_1.s();
                                }
                            }
                            v6_0 += Character.charCount(v15_1);
                            v10_1 = 47;
                            v11_4 = -1;
                            v13_4 = 127;
                            v14_2 = 32;
                        }
                        x8.g v2_3 = v7_3.G();
                    }
                    String v5_2 = p23.c;
                    int v6_2 = new StringBuilder("{");
                    v6_2.append(v3_1);
                    v6_2.append("}");
                    x8.g v2_4 = v5_2.replace(v6_2.toString(), v2_3);
                    if (z8.n0.m.matcher(v2_4).matches()) {
                        throw new IllegalArgumentException("@Path parameters shouldn\'t perform path traversal (\'.\' or \'..\'): ".concat(v4_2));
                    } else {
                        p23.c = v2_4;
                        return;
                    }
                }
                v2_3 = v4_2;
            }
        }
    }
}
