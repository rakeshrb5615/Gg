package r6;
public final class h0 {
    public static final r6.g0 Companion;
    public static final o8.a[] d;
    public final r6.m0 a;
    public final r6.f1 b;
    public final java.util.Map c;

    static h0()
    {
        r6.h0.Companion = new r6.g0();
        s8.h v0_3 = new s8.h(r6.y.a);
        o8.a[] v1_2 = new o8.a[3];
        v1_2[0] = 0;
        v1_2[1] = 0;
        v1_2[2] = v0_3;
        r6.h0.d = v1_2;
        return;
    }

    public synthetic h0(int p4, r6.m0 p5, r6.f1 p6, java.util.Map p7)
    {
        if (1 != (p4 & 1)) {
            s8.k.a(p4, 1, r6.f0.a.d());
            throw 0;
        } else {
            this.a = p5;
            if ((p4 & 2) != 0) {
                this.b = p6;
            } else {
                this.b = 0;
            }
            if ((p4 & 4) != 0) {
                this.c = p7;
                return;
            } else {
                this.c = 0;
                return;
            }
        }
    }

    public h0(r6.m0 p2, r6.f1 p3, java.util.Map p4)
    {
        kotlin.jvm.internal.j.e(p2, "sessionDetails");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        return;
    }

    public static r6.h0 a(r6.h0 p1, r6.m0 p2, r6.f1 p3, java.util.Map p4, int p5)
    {
        if ((p5 & 1) != 0) {
            p2 = p1.a;
        }
        if ((p5 & 2) != 0) {
            p3 = p1.b;
        }
        if ((p5 & 4) != 0) {
            p4 = p1.c;
        }
        p1.getClass();
        kotlin.jvm.internal.j.e(p2, "sessionDetails");
        return new r6.h0(p2, p3, p4);
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof r6.h0)) {
                if (kotlin.jvm.internal.j.a(this.a, ((r6.h0) p5).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((r6.h0) p5).b)) {
                        if (kotlin.jvm.internal.j.a(this.c, ((r6.h0) p5).c)) {
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
            return 1;
        }
    }

    public final int hashCode()
    {
        java.util.Map v2_0;
        int v0_5 = (this.a.hashCode() * 31);
        int v1 = 0;
        java.util.Map v2_2 = this.b;
        if (v2_2 != null) {
            v2_0 = Long.hashCode(v2_2.a);
        } else {
            v2_0 = 0;
        }
        int v0_2 = ((v0_5 + v2_0) * 31);
        java.util.Map v2_1 = this.c;
        if (v2_1 != null) {
            v1 = v2_1.hashCode();
        }
        return (v0_2 + v1);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("SessionData(sessionDetails=");
        v0_2.append(this.a);
        v0_2.append(", backgroundTime=");
        v0_2.append(this.b);
        v0_2.append(", processDataMap=");
        v0_2.append(this.c);
        v0_2.append(41);
        return v0_2.toString();
    }
}
