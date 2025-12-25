package a1;
public final class j1 extends n7.i implements u7.p {

    public final l7.c create(Object p2, l7.c p3)
    {
        return new a1.j1(2, p3);
    }

    public final Object invoke(Object p1, Object p2)
    {
        h7.l v2_2 = h7.l.a;
        ((a1.j1) this.create(((g8.d) p1), ((l7.c) p2))).invokeSuspend(v2_2);
        return v2_2;
    }

    public final Object invokeSuspend(Object p2)
    {
        c4.b.e0(p2);
        return h7.l.a;
    }
}
