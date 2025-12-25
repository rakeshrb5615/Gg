package x2;
public final class c {
    public final long a;
    public final long b;
    public final java.util.Set c;

    public c(long p1, long p3, java.util.Set p5)
    {
        this.a = p1;
        this.b = p3;
        this.c = p5;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof x2.c)) || ((this.a != ((x2.c) p8).a) || ((this.b != ((x2.c) p8).b) || (!this.c.equals(((x2.c) p8).c))))) {
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
        int v0_0 = this.a;
        long v3_1 = this.b;
        return (((((((int) (v0_0 ^ (v0_0 >> 32))) ^ 1000003) * 1000003) ^ ((int) ((v3_1 >> 32) ^ v3_1))) * 1000003) ^ this.c.hashCode());
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("ConfigValue{delta=");
        v0_2.append(this.a);
        v0_2.append(", maxAllowedDelay=");
        v0_2.append(this.b);
        v0_2.append(", flags=");
        v0_2.append(this.c);
        v0_2.append("}");
        return v0_2.toString();
    }
}
