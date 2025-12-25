package q4;
public final class a {
    public final long a;
    public final long b;
    public final long c;

    public a(long p1, long p3, long p5)
    {
        this.a = p1;
        this.b = p3;
        this.c = p5;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof q4.a)) || ((this.a != ((q4.a) p8).a) || ((this.b != ((q4.a) p8).b) || (this.c != ((q4.a) p8).c)))) {
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
        long v3_4 = this.b;
        long v3_2 = this.c;
        return (((((((int) (v0_0 ^ (v0_0 >> 32))) ^ 1000003) * 1000003) ^ ((int) (v3_4 ^ (v3_4 >> 32)))) * 1000003) ^ ((int) ((v3_2 >> 32) ^ v3_2)));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("StartupTime{epochMillis=");
        v0_2.append(this.a);
        v0_2.append(", elapsedRealtime=");
        v0_2.append(this.b);
        v0_2.append(", uptimeMillis=");
        v0_2.append(this.c);
        v0_2.append("}");
        return v0_2.toString();
    }
}
