package d6;
public final class a {
    public final String a;
    public final long b;
    public final long c;

    public a(String p1, long p2, long p4)
    {
        this.a = p1;
        this.b = p2;
        this.c = p4;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof d6.a)) || ((!this.a.equals(((d6.a) p8).a)) || ((this.b != ((d6.a) p8).b) || (this.c != ((d6.a) p8).c)))) {
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
        int v2_1 = this.b;
        int v1_0 = this.c;
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (v2_1 ^ (v2_1 >> 32)))) * 1000003) ^ ((int) (v1_0 ^ (v1_0 >> 32))));
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("InstallationTokenResult{token=");
        v0_2.append(this.a);
        v0_2.append(", tokenExpirationTimestamp=");
        v0_2.append(this.b);
        v0_2.append(", tokenCreationTimestamp=");
        v0_2.append(this.c);
        v0_2.append("}");
        return v0_2.toString();
    }
}
