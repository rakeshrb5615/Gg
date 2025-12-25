package f8;
public final class b implements d8.f2 {
    public Object a;
    public d8.n b;
    public final synthetic f8.c c;

    public b(f8.c p1)
    {
        this.c = p1;
        this.a = f8.e.p;
        return;
    }

    public final void a(i8.r p2, int p3)
    {
        d8.n v0 = this.b;
        if (v0 != null) {
            v0.a(p2, p3);
        }
        return;
    }

    public final Object b(g8.e p14)
    {
        IllegalStateException v0_0 = this.a;
        d4.l v2_1 = 1;
        if ((v0_0 == f8.e.p) || (v0_0 == f8.e.l)) {
            f8.c v3 = this.c;
            IllegalStateException v0_1 = ((f8.k) f8.c.m.get(v3));
            while (!v3.r(f8.c.b.get(v3), 1)) {
                d8.n v4_3;
                long v6_0 = f8.c.c.getAndIncrement(v3);
                d8.n v4_1 = ((long) f8.e.b);
                f8.b v8_0 = (v6_0 / v4_1);
                d4.l v5_1 = ((int) (v6_0 % v4_1));
                if (v0_1.c == v8_0) {
                    v4_3 = v0_1;
                } else {
                    String v1_11 = v3.l(v8_0, v0_1);
                    if (v1_11 != null) {
                        v4_3 = v1_11;
                    }
                }
                IllegalStateException v0_11 = v3.z(v4_3, v5_1, v6_0, 0);
                String v1_12 = f8.e.m;
                if (v0_11 == v1_12) {
                    throw new IllegalStateException("unreachable");
                } else {
                    long v9_1 = f8.e.o;
                    if (v0_11 != v9_1) {
                        if (v0_11 != f8.e.n) {
                            v4_3.b();
                            this.a = v0_11;
                        } else {
                            Object v14_8 = d8.f0.k(q4.b.C(p14));
                            try {
                                this.b = v14_8;
                            } catch (IllegalStateException v0_8) {
                                v14_8.y();
                                throw v0_8;
                            }
                            IllegalStateException v0_13 = v3.z(v4_3, v5_1, v6_0, this);
                            if (v0_13 != v1_12) {
                                if (v0_13 != v9_1) {
                                    v4_3.b();
                                    this.a = v0_13;
                                    this.b = 0;
                                } else {
                                    if (v6_0 < v3.p()) {
                                        v4_3.b();
                                    }
                                    IllegalStateException v0_6 = ((f8.k) f8.c.m.get(v3));
                                    while (!v3.r(f8.c.b.get(v3), 1)) {
                                        d8.n v4_12;
                                        long v6_1 = f8.c.c.getAndIncrement(v3);
                                        d8.n v4_9 = ((long) f8.e.b);
                                        long v9_3 = (v6_1 / v4_9);
                                        d4.l v5_2 = ((int) (v6_1 % v4_9));
                                        if (v0_6.c == v9_3) {
                                            v4_12 = v0_6;
                                        } else {
                                            v4_12 = v3.l(v9_3, v0_6);
                                            if (v4_12 == null) {
                                            }
                                        }
                                        IllegalStateException v0_19 = v3.z(v4_12, v5_2, v6_1, this);
                                        if (v0_19 != f8.e.m) {
                                            if (v0_19 != f8.e.o) {
                                                if (v0_19 == f8.e.n) {
                                                    throw new IllegalStateException("unexpected");
                                                } else {
                                                    v4_12.b();
                                                    this.a = v0_19;
                                                    this.b = 0;
                                                }
                                            } else {
                                                if (v6_1 < v3.p()) {
                                                    v4_12.b();
                                                }
                                                v0_6 = v4_12;
                                            }
                                        } else {
                                            this.a(v4_12, v5_2);
                                            return v14_8.q();
                                        }
                                    }
                                    IllegalStateException v0_7 = this.b;
                                    kotlin.jvm.internal.j.b(v0_7);
                                    this.b = 0;
                                    this.a = f8.e.l;
                                    String v1_4 = v3.m();
                                    if (v1_4 != null) {
                                        v0_7.resumeWith(c4.b.p(v1_4));
                                    } else {
                                        v0_7.resumeWith(Boolean.FALSE);
                                    }
                                    return v14_8.q();
                                }
                                v14_8.z(Boolean.TRUE, 0);
                            } else {
                                this.a(v4_3, v5_1);
                            }
                            return v14_8.q();
                        }
                    } else {
                        if (v6_0 < v3.p()) {
                            v4_3.b();
                        }
                        v0_1 = v4_3;
                    }
                }
            }
            this.a = f8.e.l;
            Object v14_3 = v3.m();
            if (v14_3 != null) {
                throw v14_3;
            } else {
                v2_1 = 0;
            }
        }
        return Boolean.valueOf(v2_1);
    }
}
