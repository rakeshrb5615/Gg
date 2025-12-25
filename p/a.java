package p;
public final class a extends p.f {
    public final java.util.HashMap e;

    public a()
    {
        this.e = new java.util.HashMap();
        return;
    }

    public final p.c a(Object p2)
    {
        return ((p.c) this.e.get(p2));
    }

    public final Object b(Object p3)
    {
        Object v0 = super.b(p3);
        this.e.remove(p3);
        return v0;
    }
}
