package a1;
public final class q extends n7.i implements u7.q {
    public final synthetic int a;
    public int b;
    public synthetic Object c;

    public synthetic q(int p2, l7.c p3)
    {
        this.a = 1;
        super(p2, p3);
        return;
    }

    public q(a1.g0 p2, l7.c p3)
    {
        this.a = 0;
        this.c = p2;
        super(3, p3);
        return;
    }

    public final Object b(Object p2, Object p3, Object p4)
    {
        switch (this.a) {
            case 0:
                p3 = ((Throwable) p3);
                return new a1.q(((a1.g0) this.c), ((l7.c) p4)).invokeSuspend(h7.l.a);
            default:
                ((Boolean) p3).getClass();
                h7.l v3_3 = new a1.q(3, ((l7.c) p4));
                v3_3.c = ((a1.i0) p2);
                return v3_3.invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p4)
    {
        switch (this.a) {
            case 0:
                h7.l v0_2 = m7.a.a;
                int v1_1 = this.b;
                if (v1_1 == 0) {
                    c4.b.e0(p4);
                    IllegalStateException v4_9 = ((a1.g0) this.c);
                    this.b = 1;
                    if (a1.g0.c(v4_9, this) != v0_2) {
                        v0_2 = h7.l.a;
                    }
                } else {
                    if (v1_1 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p4);
                    }
                }
                return v0_2;
            default:
                h7.l v0_3 = m7.a.a;
                int v1_0 = this.b;
                if (v1_0 == 0) {
                    c4.b.e0(p4);
                    IllegalStateException v4_5 = ((a1.i0) this.c);
                    this.b = 1;
                    v4_5.getClass();
                    p4 = a1.i0.a(v4_5, this);
                    if (p4 == v0_3) {
                        p4 = v0_3;
                    }
                } else {
                    if (v1_0 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p4);
                    }
                }
                return p4;
        }
    }
}
