package f8;
public final class j {
    public static final f8.i b;
    public final Object a;

    static j()
    {
        f8.j.b = new f8.i();
        return;
    }

    public synthetic j(Object p1)
    {
        this.a = p1;
        return;
    }

    public final boolean equals(Object p2)
    {
        if (((p2 instanceof f8.j)) && (kotlin.jvm.internal.j.a(this.a, ((f8.j) p2).a))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            return v0_0.hashCode();
        } else {
            return 0;
        }
    }

    public final String toString()
    {
        String v0_0 = this.a;
        if (!(v0_0 instanceof f8.h)) {
            StringBuilder v1_2 = new StringBuilder("Value(");
            v1_2.append(v0_0);
            v1_2.append(41);
            return v1_2.toString();
        } else {
            return ((f8.h) v0_0).toString();
        }
    }
}
