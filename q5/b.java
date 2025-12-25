package q5;
public final class b extends n7.i implements u7.p {
    public final synthetic int a;
    public int b;
    public final synthetic Object c;

    public synthetic b(Object p1, l7.c p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        super(2, p2);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        switch (this.a) {
            case 0:
                return new q5.b(((q5.d) this.c), p4, 0);
            default:
                return new q5.b(((w1.a) this.c), p4, 1);
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                return ((q5.b) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            default:
                return ((q5.b) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p4)
    {
        switch (this.a) {
            case 0:
                i7.o v0_2 = m7.a.a;
                int v1_0 = this.b;
                if (v1_0 == 0) {
                    c4.b.e0(p4);
                    e1.b v4_2 = ((q5.d) this.c).c.a.b();
                    this.b = 1;
                    p4 = g8.z.e(v4_2, this);
                    if (p4 != v0_2) {
                        if (((e1.b) p4) == null) {
                            v0_2 = i7.o.a;
                        } else {
                            v0_2 = ((e1.b) p4).a();
                        }
                    }
                } else {
                    if (v1_0 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p4);
                    }
                }
                return v0_2;
            default:
                i7.o v0_3 = m7.a.a;
                int v1_1 = this.b;
                if (v1_1 == 0) {
                    c4.b.e0(p4);
                    e1.b v4_8 = ((w1.a) this.c).a;
                    this.b = 1;
                    p4 = v4_8.b(this);
                    if (p4 == v0_3) {
                        p4 = v0_3;
                    }
                } else {
                    if (v1_1 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p4);
                    }
                }
                return p4;
        }
    }
}
