package m8;
public final class b implements d8.l, d8.f2 {
    public final d8.n a;
    public final synthetic m8.c b;

    public b(m8.c p1, d8.n p2)
    {
        this.b = p1;
        this.a = p2;
        return;
    }

    public final void a(i8.r p2, int p3)
    {
        this.a.a(p2, p3);
        return;
    }

    public final d4.l c(Object p3, u7.q p4)
    {
        m8.c v0 = this.b;
        d4.l v3_2 = this.a.D(((h7.l) p3), new d8.m(v0, this));
        if (v3_2 != null) {
            m8.c.g.set(v0, 0);
        }
        return v3_2;
    }

    public final void e(Object p2)
    {
        this.a.e(p2);
        return;
    }

    public final l7.h getContext()
    {
        return this.a.e;
    }

    public final void resumeWith(Object p2)
    {
        this.a.resumeWith(p2);
        return;
    }
}
