package y6;
public final class d extends w6.z {
    public volatile w6.z a;
    public final synthetic boolean b;
    public final synthetic boolean c;
    public final synthetic w6.m d;
    public final synthetic d7.a e;
    public final synthetic y6.e f;

    public d(y6.e p1, boolean p2, boolean p3, w6.m p4, d7.a p5)
    {
        this.f = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final Object b(e7.a p11)
    {
        if (!this.b) {
            w6.z v0_1 = this.a;
            if (v0_1 == null) {
                w6.z v0_2 = this.d;
                String v1_0 = this.f;
                d7.a v2 = this.e;
                java.util.Iterator v3_2 = v0_2.d;
                v3_2.getClass();
                int v4_3 = v3_2.b;
                if (v1_0 != z6.k.c) {
                    w6.z v5_1 = v2.a;
                    w6.a0 v7_1 = ((w6.a0) v4_3.get(v5_1));
                    if (v7_1 == null) {
                        w6.a0 v7_4 = ((x6.a) v5_1.getAnnotation(x6.a));
                        if (v7_4 != null) {
                            w6.a0 v7_5 = v7_4.value();
                            if (w6.a0.isAssignableFrom(v7_5)) {
                                w6.a0 v7_8 = ((w6.a0) v3_2.a.b(new d7.a(v7_5), 1).c());
                                int v4_1 = ((w6.a0) v4_3.putIfAbsent(v5_1, v7_8));
                                if (v4_1 != 0) {
                                    v7_8 = v4_1;
                                }
                                if (v7_8 == v1_0) {
                                    v1_0 = v3_2;
                                }
                            }
                        }
                    } else {
                        if (v7_1 == v1_0) {
                        }
                    }
                }
                java.util.Iterator v3_1 = v0_2.e.iterator();
                int v4_2 = 0;
                while (v3_1.hasNext()) {
                    w6.z v5_4 = ((w6.a0) v3_1.next());
                    if (v4_2 != 0) {
                        w6.z v5_5 = v5_4.a(v0_2, v2);
                        if (v5_5 != null) {
                            v0_1 = v5_5;
                        }
                    } else {
                        if (v5_4 == v1_0) {
                            v4_2 = 1;
                        }
                    }
                    this.a = v0_1;
                }
                if (v4_2 != 0) {
                    w6.z v0_4 = new StringBuilder("GSON cannot serialize or deserialize ");
                    v0_4.append(v2);
                    throw new IllegalArgumentException(v0_4.toString());
                } else {
                    v0_1 = v0_2.b(v2);
                }
            }
            return v0_1.b(p11);
        } else {
            p11.U();
            return 0;
        }
    }

    public final void c(e7.b p11, Object p12)
    {
        if (!this.c) {
            w6.z v0_1 = this.a;
            if (v0_1 == null) {
                w6.z v0_2 = this.d;
                z6.k v1 = this.f;
                d7.a v2 = this.e;
                java.util.Iterator v3_2 = v0_2.d;
                v3_2.getClass();
                int v4_3 = v3_2.b;
                if (v1 != z6.k.c) {
                    w6.z v5_1 = v2.a;
                    w6.a0 v7_1 = ((w6.a0) v4_3.get(v5_1));
                    if (v7_1 == null) {
                        w6.a0 v7_4 = ((x6.a) v5_1.getAnnotation(x6.a));
                        if (v7_4 != null) {
                            w6.a0 v7_5 = v7_4.value();
                            if (w6.a0.isAssignableFrom(v7_5)) {
                                w6.a0 v7_8 = ((w6.a0) v3_2.a.b(new d7.a(v7_5), 1).c());
                                int v4_1 = ((w6.a0) v4_3.putIfAbsent(v5_1, v7_8));
                                if (v4_1 != 0) {
                                    v7_8 = v4_1;
                                }
                                if (v7_8 == v1) {
                                    v1 = v3_2;
                                }
                            }
                        }
                    } else {
                        if (v7_1 == v1) {
                        }
                    }
                }
                java.util.Iterator v3_1 = v0_2.e.iterator();
                int v4_2 = 0;
                while (v3_1.hasNext()) {
                    w6.z v5_4 = ((w6.a0) v3_1.next());
                    if (v4_2 != 0) {
                        w6.z v5_5 = v5_4.a(v0_2, v2);
                        if (v5_5 != null) {
                            v0_1 = v5_5;
                        }
                    } else {
                        if (v5_4 == v1) {
                            v4_2 = 1;
                        }
                    }
                    this.a = v0_1;
                }
                if (v4_2 != 0) {
                    String v12_2 = new StringBuilder("GSON cannot serialize or deserialize ");
                    v12_2.append(v2);
                    throw new IllegalArgumentException(v12_2.toString());
                } else {
                    v0_1 = v0_2.b(v2);
                }
            }
            v0_1.c(p11, p12);
            return;
        } else {
            p11.B();
            return;
        }
    }
}
