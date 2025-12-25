package s8;
public final class j implements o8.a {
    public final o8.a a;
    public final s8.o b;

    public j(o8.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "serializer");
        this.a = p2;
        this.b = new s8.o(p2.d());
        return;
    }

    public final void b(u8.i p2, Object p3)
    {
        if (p3 == null) {
            p2.f();
            return;
        } else {
            p2.i(this.a, p3);
            return;
        }
    }

    public final Object c(n.p p2)
    {
        kotlin.jvm.internal.j.e(p2, "decoder");
        if (!p2.h()) {
            return 0;
        } else {
            return p2.k(this.a);
        }
    }

    public final q8.d d()
    {
        return this.b;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5) && (s8.j == p5.getClass())) {
                if (kotlin.jvm.internal.j.a(this.a, ((s8.j) p5).a)) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }
}
