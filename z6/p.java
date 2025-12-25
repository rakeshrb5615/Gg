package z6;
public final class p extends w6.z {
    public static final z6.n c;
    public final w6.m a;
    public final w6.x b;

    static p()
    {
        z6.p.c = new z6.n(w6.x.a, 1);
        return;
    }

    public p(w6.m p1, w6.x p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final Object b(e7.a p10)
    {
        java.io.Serializable v1_0;
        java.util.ArrayDeque v0_0 = p10.O();
        java.io.Serializable v1_2 = u.e.c(v0_0);
        if (v1_2 == null) {
            p10.c();
            v1_0 = new java.util.ArrayList();
        } else {
            if (v1_2 == 2) {
                p10.f();
                v1_0 = new y6.o(1);
            } else {
                v1_0 = 0;
            }
        }
        if (v1_0 != null) {
            java.util.ArrayDeque v0_2 = new java.util.ArrayDeque();
            while(true) {
                if (!p10.B()) {
                    if (!(v1_0 instanceof java.util.List)) {
                        p10.y();
                    } else {
                        p10.x();
                    }
                    if (v0_2.isEmpty()) {
                        break;
                    }
                    v1_0 = v0_2.removeLast();
                } else {
                    java.util.List v5_4;
                    if (!(v1_0 instanceof java.util.Map)) {
                        v5_4 = 0;
                    } else {
                        v5_4 = p10.I();
                    }
                    java.io.Serializable v7_2;
                    java.util.Map v6_0 = p10.O();
                    java.io.Serializable v7_0 = u.e.c(v6_0);
                    if (v7_0 == null) {
                        p10.c();
                        v7_2 = new java.util.ArrayList();
                    } else {
                        if (v7_0 == 2) {
                            p10.f();
                            v7_2 = new y6.o(1);
                        } else {
                            v7_2 = 0;
                        }
                    }
                    int v8;
                    if (v7_2 == null) {
                        v8 = 0;
                    } else {
                        v8 = 1;
                    }
                    if (v7_2 == null) {
                        v7_2 = this.d(p10, v6_0);
                    }
                    if (!(v1_0 instanceof java.util.List)) {
                        ((java.util.Map) v1_0).put(v5_4, v7_2);
                    } else {
                        ((java.util.List) v1_0).add(v7_2);
                    }
                    if (v8 != 0) {
                        v0_2.addLast(v1_0);
                        v1_0 = v7_2;
                    }
                }
            }
            return v1_0;
        } else {
            return this.d(p10, v0_0);
        }
    }

    public final void c(e7.b p4, Object p5)
    {
        if (p5 != null) {
            w6.z v0_0 = p5.getClass();
            boolean v1_0 = this.a;
            v1_0.getClass();
            w6.z v0_1 = v1_0.b(new d7.a(v0_0));
            if (!(v0_1 instanceof z6.p)) {
                v0_1.c(p4, p5);
                return;
            } else {
                p4.i();
                p4.y();
                return;
            }
        } else {
            p4.B();
            return;
        }
    }

    public final java.io.Serializable d(e7.a p3, int p4)
    {
        String v0_0 = u.e.c(p4);
        if (v0_0 == 5) {
            return p3.M();
        } else {
            if (v0_0 == 6) {
                return this.b.a(p3);
            } else {
                if (v0_0 == 7) {
                    return Boolean.valueOf(p3.E());
                } else {
                    if (v0_0 != 8) {
                        throw new IllegalStateException("Unexpected token: ".concat(v1.a.z(p4)));
                    } else {
                        p3.K();
                        return 0;
                    }
                }
            }
        }
    }
}
