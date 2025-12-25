package s6;
public final class a {
    public final m8.c a;
    public g5.k b;

    public a(m8.c p1)
    {
        this.a = p1;
        this.b = 0;
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((this == p3) || (((p3 instanceof s6.a)) && ((this.a.equals(((s6.a) p3).a)) && (kotlin.jvm.internal.j.a(this.b, ((s6.a) p3).b))))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        int v1_1;
        int v0_2 = (this.a.hashCode() * 31);
        int v1_0 = this.b;
        if (v1_0 != 0) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        return (v0_2 + v1_1);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("Dependency(mutex=");
        v0_2.append(this.a);
        v0_2.append(", subscriber=");
        v0_2.append(this.b);
        v0_2.append(41);
        return v0_2.toString();
    }
}
