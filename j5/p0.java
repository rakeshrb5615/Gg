package j5;
public final class p0 extends j5.j2 {
    public final long a;
    public final String b;
    public final j5.d2 c;
    public final j5.e2 d;
    public final j5.f2 e;
    public final j5.i2 f;

    public p0(long p1, String p3, j5.d2 p4, j5.e2 p5, j5.f2 p6, j5.i2 p7)
    {
        this.a = p1;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        this.f = p7;
        return;
    }

    public final j5.o0 a()
    {
        j5.o0 v0_1 = new j5.o0();
        v0_1.a = this.a;
        v0_1.b = this.b;
        v0_1.c = this.c;
        v0_1.d = this.d;
        v0_1.e = this.e;
        v0_1.f = this.f;
        v0_1.g = 1;
        return v0_1;
    }

    public final boolean equals(Object p9)
    {
        if (p9 != this) {
            if ((p9 instanceof j5.j2)) {
                j5.i2 v1_1 = ((j5.p0) ((j5.j2) p9)).f;
                j5.f2 v3 = ((j5.p0) ((j5.j2) p9)).e;
                if ((this.a == ((j5.p0) ((j5.j2) p9)).a) && ((this.b.equals(((j5.p0) ((j5.j2) p9)).b)) && ((this.c.equals(((j5.p0) ((j5.j2) p9)).c)) && (this.d.equals(((j5.p0) ((j5.j2) p9)).d))))) {
                    boolean v9_3 = this.e;
                    if (v9_3) {
                        if (!v9_3.equals(v3)) {
                            return 0;
                        }
                    } else {
                        if (v3 != null) {
                            return 0;
                        }
                    }
                    boolean v9_5 = this.f;
                    if (v9_5) {
                        if (!v9_5.equals(v1_1)) {
                            return 0;
                        }
                    } else {
                        if (v1_1 != null) {
                            return 0;
                        }
                    }
                    return 1;
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v3_2;
        j5.i2 v1_0 = this.a;
        int v0_6 = ((((((((((int) ((v1_0 >> 32) ^ v1_0)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
        int v2_5 = 0;
        int v3_1 = this.e;
        if (v3_1 != 0) {
            v3_2 = v3_1.hashCode();
        } else {
            v3_2 = 0;
        }
        int v0_9 = ((v0_6 ^ v3_2) * 1000003);
        j5.i2 v1_1 = this.f;
        if (v1_1 != null) {
            v2_5 = v1_1.hashCode();
        }
        return (v0_9 ^ v2_5);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Event{timestamp=");
        v0_1.append(this.a);
        v0_1.append(", type=");
        v0_1.append(this.b);
        v0_1.append(", app=");
        v0_1.append(this.c);
        v0_1.append(", device=");
        v0_1.append(this.d);
        v0_1.append(", log=");
        v0_1.append(this.e);
        v0_1.append(", rollouts=");
        v0_1.append(this.f);
        v0_1.append("}");
        return v0_1.toString();
    }
}
