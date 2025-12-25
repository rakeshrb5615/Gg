package s2;
public final class b extends s2.c {
    public final android.content.Context a;
    public final a3.a b;
    public final a3.a c;
    public final String d;

    public b(android.content.Context p1, a3.a p2, a3.a p3, String p4)
    {
        if (p1 == null) {
            throw new NullPointerException("Null applicationContext");
        } else {
            this.a = p1;
            if (p2 == null) {
                throw new NullPointerException("Null wallClock");
            } else {
                this.b = p2;
                if (p3 == null) {
                    throw new NullPointerException("Null monotonicClock");
                } else {
                    this.c = p3;
                    if (p4 == null) {
                        throw new NullPointerException("Null backendName");
                    } else {
                        this.d = p4;
                        return;
                    }
                }
            }
        }
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((!(p5 instanceof s2.c)) || ((!this.a.equals(((s2.b) ((s2.c) p5)).a)) || ((!this.b.equals(((s2.b) ((s2.c) p5)).b)) || ((!this.c.equals(((s2.b) ((s2.c) p5)).c)) || (!this.d.equals(((s2.b) ((s2.c) p5)).d)))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode());
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("CreationContext{applicationContext=");
        v0_2.append(this.a);
        v0_2.append(", wallClock=");
        v0_2.append(this.b);
        v0_2.append(", monotonicClock=");
        v0_2.append(this.c);
        v0_2.append(", backendName=");
        return v1.a.n(v0_2, this.d, "}");
    }
}
