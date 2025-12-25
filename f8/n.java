package f8;
public final class n extends f8.c {
    public final f8.a q;

    public n(int p2, f8.a p3)
    {
        super(p2);
        super.q = p3;
        if (p3 == f8.a.a) {
            String v2_6 = new StringBuilder("This implementation does not support suspension for senders, use ");
            v2_6.append(kotlin.jvm.internal.s.a(f8.c).b());
            v2_6.append(" instead");
            throw new IllegalArgumentException(v2_6.toString().toString());
        } else {
            if (p2 < 1) {
                throw new IllegalArgumentException(v1.a.j("Buffered channel capacity must be at least 1, but ", p2, " was specified").toString());
            } else {
                return;
            }
        }
    }

    public final Object C(Object p16, boolean p17)
    {
        h7.l v8 = h7.l.a;
        if (this.q != f8.a.c) {
            int v6_0 = f8.e.d;
            long v1_1 = ((f8.k) f8.c.f.get(this));
            do {
                f8.h v2_1 = f8.c.b.getAndIncrement(this);
                long v4_1 = (1152921504606846975 & v2_1);
                boolean v7_1 = this.r(v2_1, 0);
                int v9 = f8.e.b;
                long v10 = ((long) v9);
                f8.h v2_2 = (v4_1 / v10);
                int v12_1 = ((int) (v4_1 % v10));
                if (v1_1.c != v2_2) {
                    f8.h v2_3 = f8.c.a(this, v2_2, v1_1);
                    if (v2_3 != null) {
                        v1_1 = v2_3;
                    } else {
                        if (!v7_1) {
                            break;
                        }
                        return new f8.h(this.o());
                    }
                }
                f8.h v2_4 = v12_1;
                int v12_2 = f8.c.e(this, v1_1, v2_4, p16, v4_1, v6_0, v7_1);
                if (v12_2 == 0) {
                    v1_1.b();
                    return v8;
                } else {
                    if (v12_2 != 1) {
                        if (v12_2 == 2) {
                            if (!v7_1) {
                                int v6_1;
                                if (!(v6_0 instanceof d8.f2)) {
                                    v6_1 = 0;
                                } else {
                                    v6_1 = ((d8.f2) v6_0);
                                }
                                if (v6_1 != 0) {
                                    v6_1.a(v1_1, (v2_4 + v9));
                                }
                                this.j(((v1_1.c * v10) + ((long) v2_4)));
                            } else {
                                v1_1.i();
                                return new f8.h(this.o());
                            }
                        } else {
                            if (v12_2 == 3) {
                                throw new IllegalStateException("unexpected");
                            } else {
                                if (v12_2 == 4) {
                                    if (v4_1 < f8.c.c.get(this)) {
                                        v1_1.b();
                                    }
                                    return new f8.h(this.o());
                                } else {
                                }
                            }
                        }
                    }
                    return v8;
                }
            } while(v12_2 == 5);
        } else {
            long v1_10 = super.d(p16);
            if (((v1_10 instanceof f8.i)) && (!(v1_10 instanceof f8.h))) {
                return v8;
            } else {
                return v1_10;
            }
        }
    }

    public final Object b(Object p1, l7.c p2)
    {
        if ((this.C(p1, 1) instanceof f8.h)) {
            throw this.o();
        } else {
            return h7.l.a;
        }
    }

    public final Object d(Object p2)
    {
        return this.C(p2, 0);
    }

    public final boolean s()
    {
        if (this.q != f8.a.b) {
            return 0;
        } else {
            return 1;
        }
    }
}
