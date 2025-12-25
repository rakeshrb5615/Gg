package z6;
public final class m extends w6.z {
    public final synthetic int a;
    public final Object b;
    public final w6.z c;
    public final Object d;

    public m(w6.m p2, w6.z p3, reflect.Type p4)
    {
        this.a = 1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public m(z6.d p1, z6.m p2, z6.m p3, y6.p p4)
    {
        this.a = 0;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final Object b(e7.a p6)
    {
        switch (this.a) {
            case 0:
                IllegalStateException v6_4;
                String v0_4 = p6.O();
                if (v0_4 != 9) {
                    java.util.Map v2_0 = ((java.util.Map) ((y6.p) this.d).c());
                    if (v0_4 != 1) {
                        p6.f();
                        while (p6.B()) {
                            v3.f.a.getClass();
                            String v0_3 = p6.m;
                            if (v0_3 == null) {
                                v0_3 = p6.s();
                            }
                            if (v0_3 != 13) {
                                if (v0_3 != 12) {
                                    if (v0_3 != 14) {
                                        throw p6.W("a name");
                                    } else {
                                        p6.m = 10;
                                    }
                                } else {
                                    p6.m = 8;
                                }
                            } else {
                                p6.m = 9;
                            }
                            String v0_11 = ((z6.m) this.b).c.b(p6);
                            if (v2_0.put(v0_11, ((z6.m) this.c).c.b(p6)) != null) {
                                StringBuilder v1_2 = new StringBuilder("duplicate key: ");
                                v1_2.append(v0_11);
                                throw new w6.p(v1_2.toString());
                            }
                        }
                        p6.y();
                    } else {
                        p6.c();
                        while (p6.B()) {
                            p6.c();
                            String v0_17 = ((z6.m) this.b).c.b(p6);
                            if (v2_0.put(v0_17, ((z6.m) this.c).c.b(p6)) != null) {
                                StringBuilder v1_9 = new StringBuilder("duplicate key: ");
                                v1_9.append(v0_17);
                                throw new w6.p(v1_9.toString());
                            } else {
                                p6.x();
                            }
                        }
                        p6.x();
                    }
                    v6_4 = v2_0;
                } else {
                    p6.K();
                    v6_4 = 0;
                }
                return v6_4;
            default:
                return this.c.b(p6);
        }
    }

    public final void c(e7.b p5, Object p6)
    {
        switch (this.a) {
            case 0:
                w6.z v0_4 = ((z6.m) this.c);
                if (((java.util.Map) p6) != null) {
                    p5.i();
                    java.util.Iterator v6_1 = ((java.util.Map) p6).entrySet().iterator();
                    while (v6_1.hasNext()) {
                        w6.z v1_2 = ((java.util.Map$Entry) v6_1.next());
                        p5.z(String.valueOf(v1_2.getKey()));
                        v0_4.c(p5, v1_2.getValue());
                    }
                    p5.y();
                } else {
                    p5.B();
                }
                return;
            default:
                w6.z v1_6;
                w6.z v0_2 = ((reflect.Type) this.d);
                if ((p6 == null) || ((!(v0_2 instanceof Class)) && (!(v0_2 instanceof reflect.TypeVariable)))) {
                    v1_6 = v0_2;
                } else {
                    v1_6 = p6.getClass();
                }
                w6.z v2_2 = this.c;
                if (v1_6 != v0_2) {
                    w6.z v0_7 = ((w6.m) this.b).b(new d7.a(v1_6));
                    if ((v0_7 instanceof z6.r)) {
                        w6.z v1_8 = v2_2;
                        while ((v1_8 instanceof z6.w)) {
                            w6.z v3_5 = ((z6.w) v1_8).d();
                            if (v3_5 == v1_8) {
                                break;
                            }
                            v1_8 = v3_5;
                        }
                        if (!(v1_8 instanceof z6.r)) {
                            v2_2.c(p5, p6);
                            return;
                        }
                    }
                    v2_2 = v0_7;
                }
                v2_2.c(p5, p6);
                return;
        }
    }
}
