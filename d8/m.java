package d8;
public final synthetic class m implements u7.q {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic m(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public synthetic m(m8.c p1, m8.b p2)
    {
        this.a = 1;
        this.b = p1;
        return;
    }

    public final Object b(Object p2, Object p3, Object p4)
    {
        switch (this.a) {
            case 0:
                Object vtmp1 = ((a6.i) this.b).invoke(((Throwable) p2));
                break;
            case 1:
                m8.c v0_4 = ((m8.c) this.b);
                p3 = ((h7.l) p3);
                m8.c.g.set(v0_4, 0);
                v0_4.f(0);
                break;
            default:
                p3 = ((h7.l) p3);
                ((m8.g) this.b).b();
        }
        return h7.l.a;
    }
}
