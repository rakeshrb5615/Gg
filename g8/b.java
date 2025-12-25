package g8;
public final class b implements h8.d {
    public final l7.h a;
    public final int b;
    public final f8.a c;
    public final synthetic int d;
    public final Object e;

    public b(Object p1, l7.h p2, int p3, f8.a p4, int p5)
    {
        this.d = p5;
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.e = p1;
        return;
    }

    public final Object a(g8.d p3, n7.c p4)
    {
        h7.l v3_1 = d8.f0.e(new a1.t(p3, this, 0), p4);
        if (v3_1 != m7.a.a) {
            return h7.l.a;
        } else {
            return v3_1;
        }
    }

    public final String b()
    {
        String v0_1 = new java.util.ArrayList(4);
        int v2_2 = this.a;
        if (v2_2 != l7.i.a) {
            String v1_16 = new StringBuilder("context=");
            v1_16.append(v2_2);
            v0_1.add(v1_16.toString());
        }
        int v2_0 = this.b;
        if (v2_0 != -3) {
            String v1_4 = new StringBuilder("capacity=");
            v1_4.append(v2_0);
            v0_1.add(v1_4.toString());
        }
        int v2_1 = this.c;
        if (v2_1 != f8.a.a) {
            String v1_8 = new StringBuilder("onBufferOverflow=");
            v1_8.append(v2_1);
            v0_1.add(v1_8.toString());
        }
        StringBuilder v6_1 = new StringBuilder();
        v6_1.append(this.getClass().getSimpleName());
        v6_1.append(91);
        v6_1.append(i7.i.c0(v0_1, ", ", 0, 0, 0, 62));
        v6_1.append(93);
        return v6_1.toString();
    }

    public final g8.c c(l7.h p8, int p9, f8.a p10)
    {
        f8.a v5;
        l7.h v0 = this.a;
        l7.h v3 = p8.plus(v0);
        g8.b v1_3 = this.c;
        a1.t v2_4 = this.b;
        if (p10 == f8.a.a) {
            if (v2_4 != -3) {
                if (p9 != -3) {
                    if (v2_4 != -2) {
                        if (p9 != -2) {
                            p9 += v2_4;
                            if (p9 < 0) {
                                p9 = 2147483647;
                                v5 = v1_3;
                                if ((!kotlin.jvm.internal.j.a(v3, v0)) || ((p9 != v2_4) || (v5 != v1_3))) {
                                    g8.b v1_1;
                                    switch (this.d) {
                                        case 0:
                                            v1_1 = new g8.b(((a1.t) this.e), v3, p9, v5, 0);
                                            break;
                                        default:
                                            v1_1 = new g8.b(((g8.c) this.e), v3, p9, v5, 1);
                                    }
                                    return v1_1;
                                } else {
                                    return this;
                                }
                            }
                        }
                    }
                }
                p9 = v2_4;
            }
        } else {
            v5 = p10;
        }
    }

    public Object f(g8.d p6, n7.c p7)
    {
        switch (this.d) {
            case 1:
                Object v6_1;
                Object v2 = h7.l.a;
                if (this.b != -3) {
                    v6_1 = this.a(p6, p7);
                    if (v6_1 == m7.a.a) {
                        v2 = v6_1;
                    }
                } else {
                    l7.h v1_4;
                    a1.d v0_9 = p7.getContext();
                    int v4_1 = this.a;
                    if (((Boolean) v4_1.fold(Boolean.FALSE, new d8.x(0))).booleanValue()) {
                        v1_4 = d8.f0.h(v0_9, v4_1, 0);
                    } else {
                        v1_4 = v0_9.plus(v4_1);
                    }
                    if (!kotlin.jvm.internal.j.a(v1_4, v0_9)) {
                        Object v3_2 = l7.d.a;
                        if (!kotlin.jvm.internal.j.a(v1_4.get(v3_2), v0_9.get(v3_2))) {
                        } else {
                            a1.d v0_4 = p7.getContext();
                            if (!(p6 instanceof h8.j)) {
                                p6 = new g8.o(p6, v0_4);
                            }
                            v6_1 = h8.f.a(v1_4, p6, i8.a.k(v1_4), new a1.d(this, 0, 6), p7);
                            if (v6_1 == m7.a.a) {
                            }
                        }
                    } else {
                        v6_1 = ((g8.c) this.e).f(p6, p7);
                        m7.a v7_3 = m7.a.a;
                        if (v6_1 != v7_3) {
                            v6_1 = v2;
                        }
                        if (v6_1 == v7_3) {
                        }
                    }
                }
                return v2;
            default:
                return this.a(p6, p7);
        }
    }

    public final String toString()
    {
        switch (this.d) {
            case 0:
                String v0_6 = new StringBuilder("block[");
                v0_6.append(((a1.t) this.e));
                v0_6.append("] -> ");
                v0_6.append(this.b());
                return v0_6.toString();
            default:
                String v0_3 = new StringBuilder();
                v0_3.append(((g8.c) this.e));
                v0_3.append(" -> ");
                v0_3.append(this.b());
                return v0_3.toString();
        }
    }
}
