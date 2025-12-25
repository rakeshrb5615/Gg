package u6;
public final class m extends n7.i implements u7.p {
    public final synthetic int a;
    public int b;
    public final synthetic u6.o c;

    public synthetic m(u6.o p1, l7.c p2, int p3)
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
                return new u6.m(this.c, p4, 0);
            default:
                return new u6.m(this.c, p4, 1);
        }
    }

    public final Object invoke(Object p2, Object p3)
    {
        switch (this.a) {
            case 0:
                return ((u6.m) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
            default:
                return ((u6.m) this.create(((d8.c0) p2), ((l7.c) p3))).invokeSuspend(h7.l.a);
        }
    }

    public final Object invokeSuspend(Object p5)
    {
        switch (this.a) {
            case 0:
                h7.l v0_1 = m7.a.a;
                g8.c v1_2 = this.b;
                if (v1_2 == null) {
                    c4.b.e0(p5);
                    IllegalStateException v5_10 = this.c;
                    g8.c v1_0 = v5_10.b.b();
                    u6.l v3_1 = new u6.l(v5_10.c);
                    this.b = 1;
                    if (v1_0.f(v3_1, this) != v0_1) {
                        v0_1 = h7.l.a;
                    }
                } else {
                    if (v1_2 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p5);
                    }
                }
                return v0_1;
            default:
                h7.l v0_3 = m7.a.a;
                g8.c v1_1 = this.b;
                if (v1_1 == null) {
                    c4.b.e0(p5);
                    IllegalStateException v5_7 = this.c.b.b();
                    this.b = 1;
                    p5 = g8.z.d(v5_7, this);
                    if (p5 == v0_3) {
                        p5 = v0_3;
                    }
                } else {
                    if (v1_1 != 1) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        c4.b.e0(p5);
                    }
                }
                return p5;
        }
    }
}
