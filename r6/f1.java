package r6;
public final class f1 {
    public static final r6.e1 Companion;
    public final long a;
    public final long b;
    public final long c;

    static f1()
    {
        r6.f1.Companion = new r6.e1();
        return;
    }

    public synthetic f1(int p3, long p4, long p6, long p8)
    {
        if (1 != (p3 & 1)) {
            s8.k.a(p3, 1, r6.d1.a.d());
            throw 0;
        } else {
            this.a = p4;
            if ((p3 & 2) == 0) {
                p6 = (((long) 1000) * p4);
            }
            this.b = p6;
            if ((p3 & 4) != 0) {
                this.c = p8;
                return;
            } else {
                this.c = (p4 / ((long) 1000));
                return;
            }
        }
    }

    public f1(long p5)
    {
        this.a = p5;
        this.b = (p5 * ((long) 1000));
        this.c = (p5 / ((long) 1000));
        return;
    }

    public final boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof r6.f1)) {
                if (this.a == ((r6.f1) p8).a) {
                    return 1;
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
        return Long.hashCode(this.a);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Time(ms=");
        v0_1.append(this.a);
        v0_1.append(41);
        return v0_1.toString();
    }
}
