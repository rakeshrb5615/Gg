package a1;
public final class s implements g8.d {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic s(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object a(Object p5, l7.c p6)
    {
        switch (this.a) {
            case 0:
                int v0_4;
                if (!(p6 instanceof a1.r)) {
                    v0_4 = new a1.r(this, p6);
                } else {
                    v0_4 = ((a1.r) p6);
                    h7.l v1_0 = ((a1.r) p6).b;
                    if ((v1_0 & -2147483648) == 0) {
                    } else {
                        ((a1.r) p6).b = (v1_0 - -2147483648);
                    }
                }
                String v6_2 = v0_4.a;
                h7.l v1_2 = m7.a.a;
                boolean v2_1 = v0_4.b;
                boolean v3_1 = 1;
                if (!v2_1) {
                    c4.b.e0(v6_2);
                    String v6_4 = ((g8.d) this.b);
                    if ((((a1.l1) p5) instanceof a1.d1)) {
                        throw ((a1.d1) ((a1.l1) p5)).b;
                    } else {
                        if (!(((a1.l1) p5) instanceof a1.c)) {
                            if (!(((a1.l1) p5) instanceof a1.r0)) {
                                v3_1 = (((a1.l1) p5) instanceof a1.m1);
                            }
                            if (!v3_1) {
                                throw new a5.o();
                            } else {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                        } else {
                            a5.o v5_12 = ((a1.c) ((a1.l1) p5)).b;
                            v0_4.b = 1;
                            if (v6_4.a(v5_12, v0_4) != v1_2) {
                                v1_2 = h7.l.a;
                            }
                        }
                    }
                } else {
                    if (v2_1 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(v6_2);
                    }
                }
                return v1_2;
            case 1:
                a5.o v5_1;
                a5.o v5_4 = ((a1.g0) this.b);
                if ((v5_4.h.h() instanceof a1.r0)) {
                    v5_1 = h7.l.a;
                } else {
                    v5_1 = a1.g0.f(v5_4, 1, p6);
                    if (v5_1 != m7.a.a) {
                    }
                }
                return v5_1;
            default:
                int v0_9 = ((r6.c1) this.b);
                kotlin.jvm.internal.j.e(((r6.h0) p5), "<set-?>");
                v0_9.h = ((r6.h0) p5);
                a5.o v5_19 = r6.c1.a(v0_9, ((r6.h0) p5).a.a, r6.z0.a, p6);
                if (v5_19 != m7.a.a) {
                    v5_19 = h7.l.a;
                }
                return v5_19;
        }
    }
}
