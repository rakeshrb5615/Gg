package s8;
public final class n implements q8.d {
    public final String a;
    public final q8.c b;

    public n(String p2, q8.c p3)
    {
        kotlin.jvm.internal.j.e(p3, "kind");
        this.a = p2;
        this.b = p3;
        return;
    }

    public final int a(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String b()
    {
        return this.a;
    }

    public final q4.b c()
    {
        return this.b;
    }

    public final int d()
    {
        return 0;
    }

    public final String e(int p2)
    {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof s8.n)) {
                if ((!kotlin.jvm.internal.j.a(this.a, ((s8.n) p5).a)) || (!kotlin.jvm.internal.j.a(this.b, ((s8.n) p5).b))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final boolean g()
    {
        return 0;
    }

    public final java.util.List getAnnotations()
    {
        return i7.n.a;
    }

    public final java.util.List h(int p2)
    {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode()
    {
        return ((this.b.hashCode() * 31) + this.a.hashCode());
    }

    public final q8.d i(int p2)
    {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean isInline()
    {
        return 0;
    }

    public final boolean j(int p2)
    {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("PrimitiveDescriptor(");
        v0_1.append(this.a);
        v0_1.append(41);
        return v0_1.toString();
    }
}
