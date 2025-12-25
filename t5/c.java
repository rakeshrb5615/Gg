package t5;
public final class c {
    public final String a;
    public final java.util.Map b;

    public c(String p1, java.util.Map p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public static t5.c a(String p2)
    {
        return new t5.c(p2, java.util.Collections.EMPTY_MAP);
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof t5.c)) {
                if ((!this.a.equals(((t5.c) p5).a)) || (!this.b.equals(((t5.c) p5).b))) {
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

    public final int hashCode()
    {
        return (this.b.hashCode() + (this.a.hashCode() * 31));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("FieldDescriptor{name=");
        v0_2.append(this.a);
        v0_2.append(", properties=");
        v0_2.append(this.b.values());
        v0_2.append("}");
        return v0_2.toString();
    }
}
