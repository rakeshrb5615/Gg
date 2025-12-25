package b8;
public final class d {
    public final String a;
    public final y7.e b;

    public d(String p1, y7.e p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof b8.d)) {
                if (kotlin.jvm.internal.j.a(this.a, ((b8.d) p5).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((b8.d) p5).b)) {
                        return 1;
                    } else {
                        return 0;
                    }
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
        return (this.b.hashCode() + (this.a.hashCode() * 31));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("MatchGroup(value=");
        v0_2.append(this.a);
        v0_2.append(", range=");
        v0_2.append(this.b);
        v0_2.append(41);
        return v0_2.toString();
    }
}
