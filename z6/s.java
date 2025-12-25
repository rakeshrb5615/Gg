package z6;
public final class s extends z6.r {
    public final y6.p b;

    public s(y6.p p1, z6.t p2)
    {
        super(p2);
        super.b = p1;
        return;
    }

    public final Object d()
    {
        return this.b.c();
    }

    public final Object e(Object p1)
    {
        return p1;
    }

    public final void f(Object p3, e7.a p4, z6.q p5)
    {
        reflect.Field v0 = p5.b;
        w6.p v4_3 = p5.f.b(p4);
        if ((v4_3 == null) && (p5.g)) {
            return;
        } else {
            if (p5.h) {
                throw new w6.p(g2.g.l("Cannot set value of \'static final\' ", b7.c.d(v0, 0)));
            } else {
                v0.set(p3, v4_3);
                return;
            }
        }
    }
}
