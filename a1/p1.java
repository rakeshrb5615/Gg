package a1;
public final class p1 implements l7.f {
    public final a1.p1 a;
    public final a1.g0 b;

    public p1(a1.p1 p1, a1.g0 p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void a(a1.g0 p2)
    {
        if (this.b == p2) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        } else {
            String v0_2 = this.a;
            if (v0_2 != null) {
                v0_2.a(p2);
            }
            return;
        }
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
        return a1.o1.a;
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
