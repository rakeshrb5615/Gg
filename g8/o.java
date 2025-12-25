package g8;
public final class o implements g8.d {
    public final synthetic int a;
    public final Object b;
    public final Object c;
    public final n7.i d;

    public o(g8.d p3, l7.h p4)
    {
        this.a = 1;
        this.b = p4;
        this.c = i8.a.k(p4);
        this.d = new a1.d(p3, 0, 7);
        return;
    }

    public o(kotlin.jvm.internal.o p2, g8.d p3, a1.p p4)
    {
        this.a = 0;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public final Object a(Object p8, l7.c p9)
    {
        switch (this.a) {
            case 0:
                g8.n v0_2;
                if (!(p9 instanceof g8.n)) {
                    v0_2 = new g8.n(this, p9);
                } else {
                    v0_2 = ((g8.n) p9);
                    h7.l v1_2 = ((g8.n) p9).e;
                    if ((v1_2 & -2147483648) == 0) {
                    } else {
                        ((g8.n) p9).e = (v1_2 - -2147483648);
                    }
                }
                int v2_1;
                g8.d v9_1 = v0_2.c;
                h7.l v1_1 = m7.a.a;
                int v2_0 = v0_2.e;
                if (v2_0 == 0) {
                    c4.b.e0(v9_1);
                    if (!((kotlin.jvm.internal.o) this.b).a) {
                        g8.d v9_6 = ((a1.p) this.d);
                        v0_2.a = this;
                        v0_2.b = p8;
                        v0_2.e = 2;
                        v9_1 = v9_6.invoke(p8, v0_2);
                        if (v9_1 != v1_1) {
                            v2_1 = this;
                            if (((Boolean) v9_1).booleanValue()) {
                                v1_1 = h7.l.a;
                                return v1_1;
                            } else {
                                ((kotlin.jvm.internal.o) v2_1.b).a = 1;
                                g8.d v9_14 = ((g8.d) v2_1.c);
                                v0_2.a = 0;
                                v0_2.b = 0;
                                v0_2.e = 3;
                                if (v9_14.a(p8, v0_2) != v1_1) {
                                }
                            }
                            c4.b.e0(v9_1);
                        }
                    } else {
                        g8.d v9_8 = ((g8.d) this.c);
                        v0_2.e = 1;
                        if (v9_8.a(p8, v0_2) != v1_1) {
                        }
                    }
                } else {
                    if (v2_0 != 1) {
                        if (v2_0 == 2) {
                            p8 = v0_2.b;
                            v2_1 = v0_2.a;
                            c4.b.e0(v9_1);
                        } else {
                            if (v2_0 != 3) {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                }
                return v1_1;
            default:
                Object v8_5 = h8.f.a(((l7.h) this.b), p8, this.c, ((a1.d) this.d), p9);
                if (v8_5 != m7.a.a) {
                    v8_5 = h7.l.a;
                }
                return v8_5;
        }
    }
}
