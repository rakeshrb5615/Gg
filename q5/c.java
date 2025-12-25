package q5;
public final class c extends n7.i implements u7.p {
    public synthetic Object a;
    public final synthetic e1.e b;
    public final synthetic Long c;

    public c(e1.e p1, Long p2, l7.c p3)
    {
        this.b = p1;
        this.c = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p4, l7.c p5)
    {
        q5.c v0_1 = new q5.c(this.b, this.c, p5);
        v0_1.a = p4;
        return v0_1;
    }

    public final Object invoke(Object p1, Object p2)
    {
        h7.l v2_2 = h7.l.a;
        ((q5.c) this.create(((e1.b) p1), ((l7.c) p2))).invokeSuspend(v2_2);
        return v2_2;
    }

    public final Object invokeSuspend(Object p3)
    {
        c4.b.e0(p3);
        ((e1.b) this.a).d(this.b, this.c);
        return h7.l.a;
    }
}
