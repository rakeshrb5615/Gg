package r6;
public final class m0 {
    public static final r6.l0 Companion;
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    static m0()
    {
        r6.m0.Companion = new r6.l0();
        return;
    }

    public m0(int p1, String p2, String p3, long p4)
    {
        this.a = p2;
        this.b = p3;
        this.c = p1;
        this.d = p4;
        return;
    }

    public synthetic m0(long p3, String p5, int p6, int p7, String p8)
    {
        if (15 != (p6 & 15)) {
            s8.k.a(p6, 15, r6.k0.a.d());
            throw 0;
        } else {
            this.a = p5;
            this.b = p8;
            this.c = p7;
            this.d = p3;
            return;
        }
    }

    public final boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof r6.m0)) {
                if (kotlin.jvm.internal.j.a(this.a, ((r6.m0) p8).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((r6.m0) p8).b)) {
                        if (this.c == ((r6.m0) p8).c) {
                            if (this.d == ((r6.m0) p8).d) {
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
        return (Long.hashCode(this.d) + ((Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("SessionDetails(sessionId=");
        v0_1.append(this.a);
        v0_1.append(", firstSessionId=");
        v0_1.append(this.b);
        v0_1.append(", sessionIndex=");
        v0_1.append(this.c);
        v0_1.append(", sessionStartTimestampUs=");
        v0_1.append(this.d);
        v0_1.append(41);
        return v0_1.toString();
    }
}
