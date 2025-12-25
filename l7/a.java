package l7;
public abstract class a implements l7.f {
    public final l7.g a;

    public a(l7.g p1)
    {
        this.a = p1;
        return;
    }

    public final Object fold(Object p1, u7.p p2)
    {
        return p2.invoke(p1, this);
    }

    public bridge l7.f get(l7.g p1)
    {
        return q4.b.r(this, p1);
    }

    public final l7.g getKey()
    {
        return this.a;
    }

    public bridge l7.h minusKey(l7.g p1)
    {
        return q4.b.G(this, p1);
    }

    public final bridge l7.h plus(l7.h p1)
    {
        return q4.b.L(this, p1);
    }
}
