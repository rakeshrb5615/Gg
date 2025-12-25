package z6;
public class l extends w6.z {
    public static final z6.l a;

    static l()
    {
        z6.l.a = new z6.l();
        return;
    }

    private l()
    {
        return;
    }

    public static w6.o d(e7.a p2, int p3)
    {
        String v0_0 = u.e.c(p3);
        if (v0_0 == 5) {
            return new w6.s(p2.M());
        } else {
            if (v0_0 == 6) {
                return new w6.s(new y6.k(p2.M()));
            } else {
                if (v0_0 == 7) {
                    return new w6.s(Boolean.valueOf(p2.E()));
                } else {
                    if (v0_0 != 8) {
                        throw new IllegalStateException("Unexpected token: ".concat(v1.a.z(p3)));
                    } else {
                        p2.K();
                        return w6.q.a;
                    }
                }
            }
        }
    }

    public static void e(e7.b p3, w6.o p4)
    {
        if ((p4) && (!(p4 instanceof w6.q))) {
            w6.o v0_6 = (p4 instanceof w6.s);
            if (v0_6 == null) {
                w6.o v0_13 = (p4 instanceof w6.n);
                if (v0_13 == null) {
                    w6.o v0_18 = (p4 instanceof w6.r);
                    if (v0_18 == null) {
                        w6.o v0_3 = new StringBuilder("Couldn\'t write ");
                        v0_3.append(p4.getClass());
                        throw new IllegalArgumentException(v0_3.toString());
                    } else {
                        p3.i();
                        if (v0_18 == null) {
                            w6.o v0_5 = new StringBuilder("Not a JSON Object: ");
                            v0_5.append(p4);
                            throw new IllegalStateException(v0_5.toString());
                        } else {
                            boolean v4_11 = ((y6.m) ((w6.r) p4).a.entrySet()).iterator();
                            while (((y6.l) v4_11).hasNext()) {
                                w6.o v0_12 = ((y6.l) v4_11).b();
                                p3.z(((String) v0_12.getKey()));
                                z6.l.e(p3, ((w6.o) v0_12.getValue()));
                            }
                            p3.y();
                            return;
                        }
                    }
                } else {
                    p3.f();
                    if (v0_13 == null) {
                        w6.o v0_17 = new StringBuilder("Not a JSON Array: ");
                        v0_17.append(p4);
                        throw new IllegalStateException(v0_17.toString());
                    } else {
                        boolean v4_14 = ((w6.n) p4).a;
                        w6.o v0_19 = v4_14.size();
                        String v1_6 = 0;
                        while (v1_6 < v0_19) {
                            w6.o v2_0 = v4_14.get(v1_6);
                            v1_6++;
                            z6.l.e(p3, ((w6.o) v2_0));
                        }
                        p3.x();
                        return;
                    }
                }
            } else {
                if (v0_6 == null) {
                    w6.o v0_21 = new StringBuilder("Not a JSON Primitive: ");
                    v0_21.append(p4);
                    throw new IllegalStateException(v0_21.toString());
                } else {
                    w6.o v0_22 = ((w6.s) p4).a;
                    if (!(v0_22 instanceof Number)) {
                        if (!(v0_22 instanceof Boolean)) {
                            p3.I(((w6.s) p4).c());
                            return;
                        } else {
                            boolean v4_2;
                            if (!(v0_22 instanceof Boolean)) {
                                v4_2 = Boolean.parseBoolean(((w6.s) p4).c());
                            } else {
                                v4_2 = ((Boolean) v0_22).booleanValue();
                            }
                            p3.J(v4_2);
                            return;
                        }
                    } else {
                        p3.H(((w6.s) p4).b());
                        return;
                    }
                }
            }
        } else {
            p3.B();
            return;
        }
    }

    public final Object b(e7.a p9)
    {
        w6.o v1_1;
        java.util.ArrayDeque v0_0 = p9.O();
        w6.o v1_3 = u.e.c(v0_0);
        if (v1_3 == null) {
            p9.c();
            v1_1 = new w6.n();
        } else {
            if (v1_3 == 2) {
                p9.f();
                v1_1 = new w6.r();
            } else {
                v1_1 = 0;
            }
        }
        if (v1_1 != null) {
            java.util.ArrayDeque v0_2 = new java.util.ArrayDeque();
            while(true) {
                if (!p9.B()) {
                    if (!(v1_1 instanceof w6.n)) {
                        p9.y();
                    } else {
                        p9.x();
                    }
                    if (v0_2.isEmpty()) {
                        break;
                    }
                    v1_1 = ((w6.o) v0_2.removeLast());
                } else {
                    java.util.ArrayList v4_4;
                    if (!(v1_1 instanceof w6.r)) {
                        v4_4 = 0;
                    } else {
                        v4_4 = p9.I();
                    }
                    w6.o v6_2;
                    y6.o v5_0 = p9.O();
                    w6.o v6_0 = u.e.c(v5_0);
                    if (v6_0 == null) {
                        p9.c();
                        v6_2 = new w6.n();
                    } else {
                        if (v6_0 == 2) {
                            p9.f();
                            v6_2 = new w6.r();
                        } else {
                            v6_2 = 0;
                        }
                    }
                    int v7;
                    if (v6_2 == null) {
                        v7 = 0;
                    } else {
                        v7 = 1;
                    }
                    if (v6_2 == null) {
                        v6_2 = z6.l.d(p9, v5_0);
                    }
                    if (!(v1_1 instanceof w6.n)) {
                        ((w6.r) v1_1).a.put(v4_4, v6_2);
                    } else {
                        ((w6.n) v1_1).a.add(v6_2);
                    }
                    if (v7 != 0) {
                        v0_2.addLast(v1_1);
                        v1_1 = v6_2;
                    }
                }
            }
            return v1_1;
        } else {
            return z6.l.d(p9, v0_0);
        }
    }

    public final bridge synthetic void c(e7.b p1, Object p2)
    {
        z6.l.e(p1, ((w6.o) p2));
        return;
    }
}
