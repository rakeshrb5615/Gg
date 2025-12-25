package h7;
public final class h implements java.io.Serializable {
    public final Object a;

    public synthetic h(Object p1)
    {
        this.a = p1;
        return;
    }

    public static final Throwable a(Object p1)
    {
        if (!(p1 instanceof h7.g)) {
            return 0;
        } else {
            return ((h7.g) p1).a;
        }
    }

    public final boolean equals(Object p2)
    {
        if (((p2 instanceof h7.h)) && (kotlin.jvm.internal.j.a(this.a, ((h7.h) p2).a))) {
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
        if (!(v0_0 instanceof h7.g)) {
            StringBuilder v1_2 = new StringBuilder("Success(");
            v1_2.append(v0_0);
            v1_2.append(41);
            return v1_2.toString();
        } else {
            return ((h7.g) v0_0).toString();
        }
    }
}
