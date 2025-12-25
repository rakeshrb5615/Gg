package d8;
public final class e2 implements l7.f, l7.g {
    public static final d8.e2 a;

    static e2()
    {
        d8.e2.a = new d8.e2();
        return;
    }

    public final Object fold(Object p1, u7.p p2)
    {
        return p2.invoke(p1, this);
    }

    public final l7.f get(l7.g p1)
    {
        return q4.b.r(this, p1);
    }

    public final l7.g getKey()
    {
        return this;
    }

    public final l7.h minusKey(l7.g p1)
    {
        return q4.b.G(this, p1);
    }

    public final l7.h plus(l7.h p1)
    {
        return q4.b.L(this, p1);
    }
}
