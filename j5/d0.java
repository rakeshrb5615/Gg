package j5;
public final class d0 extends j5.p1 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final java.util.List i;

    public d0(int p1, String p2, int p3, int p4, long p5, long p7, long p9, String p11, java.util.List p12)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p7;
        this.g = p9;
        this.h = p11;
        this.i = p12;
        return;
    }

    public final boolean equals(Object p9)
    {
        if (p9 != this) {
            if ((p9 instanceof j5.p1)) {
                java.util.List v1_1 = ((j5.d0) ((j5.p1) p9)).i;
                String v3 = ((j5.d0) ((j5.p1) p9)).h;
                if ((this.a == ((j5.d0) ((j5.p1) p9)).a) && ((this.b.equals(((j5.d0) ((j5.p1) p9)).b)) && ((this.c == ((j5.d0) ((j5.p1) p9)).c) && ((this.d == ((j5.d0) ((j5.p1) p9)).d) && ((this.e == ((j5.d0) ((j5.p1) p9)).e) && ((this.f == ((j5.d0) ((j5.p1) p9)).f) && (this.g == ((j5.d0) ((j5.p1) p9)).g))))))) {
                    boolean v9_2 = this.h;
                    if (v9_2) {
                        if (!v9_2.equals(v3)) {
                            return 0;
                        }
                    } else {
                        if (v3 != null) {
                            return 0;
                        }
                    }
                    boolean v9_4 = this.i;
                    if (v9_4) {
                        if (!v9_4.equals(v1_1)) {
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
        int v3_1;
        java.util.List v1_0 = 1000003;
        int v2_1 = this.e;
        int v2_4 = this.f;
        int v2_7 = this.g;
        int v0_12 = ((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * v1_0) ^ this.c) * v1_0) ^ this.d) * 1000003) ^ ((int) (v2_1 ^ (v2_1 >> 32)))) * 1000003) ^ ((int) (v2_4 ^ (v2_4 >> 32)))) * v1_0) ^ ((int) (v2_7 ^ (v2_7 >> 32)))) * 1000003);
        int v2_10 = 0;
        int v3_0 = this.h;
        if (v3_0 != 0) {
            v3_1 = v3_0.hashCode();
        } else {
            v3_1 = 0;
        }
        int v0_14 = ((v0_12 ^ v3_1) * 1000003);
        java.util.List v1_1 = this.i;
        if (v1_1 != null) {
            v2_10 = v1_1.hashCode();
        }
        return (v0_14 ^ v2_10);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("ApplicationExitInfo{pid=");
        v0_1.append(this.a);
        v0_1.append(", processName=");
        v0_1.append(this.b);
        v0_1.append(", reasonCode=");
        v0_1.append(this.c);
        v0_1.append(", importance=");
        v0_1.append(this.d);
        v0_1.append(", pss=");
        v0_1.append(this.e);
        v0_1.append(", rss=");
        v0_1.append(this.f);
        v0_1.append(", timestamp=");
        v0_1.append(this.g);
        v0_1.append(", traceFile=");
        v0_1.append(this.h);
        v0_1.append(", buildIdMappingForArch=");
        v0_1.append(this.i);
        v0_1.append("}");
        return v0_1.toString();
    }
}
