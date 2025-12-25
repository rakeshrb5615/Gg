package m4;
public final class j extends m4.d {
    public final synthetic m4.k c;

    public j(m4.k p1)
    {
        this.c = p1;
        return;
    }

    public final Object get(int p3)
    {
        java.util.AbstractMap$SimpleImmutableEntry v0_0 = this.c;
        a.a.f(p3, v0_0.f);
        java.util.AbstractMap$SimpleImmutableEntry v0_3 = v0_0.e;
        Object v3_1 = (p3 * 2);
        Object v1_1 = v0_3[v3_1];
        java.util.Objects.requireNonNull(v1_1);
        Object v3_3 = v0_3[(v3_1 + 1)];
        java.util.Objects.requireNonNull(v3_3);
        return new java.util.AbstractMap$SimpleImmutableEntry(v1_1, v3_3);
    }

    public final int size()
    {
        return this.c.f;
    }
}
