package d8;
public final class n1 extends n7.h implements u7.p {
    public d8.s1 b;
    public d8.r c;
    public int d;
    public synthetic Object e;
    public final synthetic d8.r1 f;

    public n1(d8.r1 p1, l7.c p2)
    {
        this.f = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        d8.n1 v0_1 = new d8.n1(this.f, p4);
        v0_1.e = p3;
        return v0_1;
    }

    public final Object invoke(Object p1, Object p2)
    {
        return ((d8.n1) this.create(((a8.g) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p6)
    {
        h7.l v4_3;
        i8.j v3_4;
        d8.r v1_4;
        String v0_0 = m7.a.a;
        d8.r v1_0 = this.d;
        if (v1_0 == null) {
            c4.b.e0(p6);
            m7.a v6_8 = ((a8.g) this.e);
            d8.r v1_1 = d8.r1.a.get(this.f);
            if (!(v1_1 instanceof d8.r)) {
                if ((v1_1 instanceof d8.b1)) {
                    d8.r v1_3 = ((d8.b1) v1_1).c();
                    if (v1_3 != null) {
                        i8.j v3_2 = i8.j.a.get(v1_3);
                        kotlin.jvm.internal.j.c(v3_2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        v3_4 = v1_3;
                        v1_4 = ((i8.j) v3_2);
                        v4_3 = v6_8;
                        if (!v1_4.equals(v3_4)) {
                            if (!(v1_4 instanceof d8.r)) {
                                v1_4 = v1_4.g();
                            } else {
                                d8.r v1_7 = ((d8.r) v1_4);
                                m7.a v6_6 = v1_7.e;
                                this.e = v4_3;
                                this.b = v3_4;
                                this.c = v1_7;
                                this.d = 2;
                                v4_3.d(v6_6, this);
                                return v0_0;
                            }
                        }
                    }
                }
            } else {
                d8.r v1_6 = ((d8.r) v1_1).e;
                this.d = 1;
                v6_8.d(v1_6, this);
                return v0_0;
            }
        } else {
            if (v1_0 == 1) {
                c4.b.e0(p6);
            } else {
                if (v1_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v1_4 = this.c;
                    v3_4 = this.b;
                    v4_3 = ((a8.g) this.e);
                    c4.b.e0(p6);
                }
            }
        }
        return h7.l.a;
    }
}
