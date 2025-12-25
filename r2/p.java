package r2;
public final class p implements o2.g {
    public final java.util.Set a;
    public final r2.j b;
    public final r2.r c;

    public p(java.util.Set p1, r2.j p2, r2.r p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final a2.b a(String p10, o2.c p11, o2.e p12)
    {
        java.util.Set v0 = this.a;
        if (!v0.contains(p11)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[] {p11, v0})));
        } else {
            return new a2.b(this.b, p10, p11, p12, this.c, 3);
        }
    }
}
