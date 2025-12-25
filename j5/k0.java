package j5;
public final class k0 extends j5.u1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public k0(String p1, String p2, String p3, String p4, String p5, String p6)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        return;
    }

    public final boolean equals(Object p9)
    {
        if (p9 != this) {
            if ((p9 instanceof j5.u1)) {
                String v1_1 = ((j5.k0) ((j5.u1) p9)).f;
                String v3 = ((j5.k0) ((j5.u1) p9)).e;
                String v4 = ((j5.k0) ((j5.u1) p9)).d;
                String v5 = ((j5.k0) ((j5.u1) p9)).c;
                if ((this.a.equals(((j5.k0) ((j5.u1) p9)).a)) && (this.b.equals(((j5.k0) ((j5.u1) p9)).b))) {
                    boolean v9_3 = this.c;
                    if (v9_3) {
                        if (!v9_3.equals(v5)) {
                            return 0;
                        }
                    } else {
                        if (v5 != null) {
                            return 0;
                        }
                    }
                    boolean v9_5 = this.d;
                    if (v9_5) {
                        if (!v9_5.equals(v4)) {
                            return 0;
                        }
                    } else {
                        if (v4 != null) {
                            return 0;
                        }
                    }
                    boolean v9_7 = this.e;
                    if (v9_7) {
                        if (!v9_7.equals(v3)) {
                            return 0;
                        }
                    } else {
                        if (v3 != null) {
                            return 0;
                        }
                    }
                    boolean v9_9 = this.f;
                    if (v9_9) {
                        if (!v9_9.equals(v1_1)) {
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
        int v0_1 = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
        int v2_0 = 0;
        int v3_0 = this.c;
        if (v3_0 != 0) {
            v3_1 = v3_0.hashCode();
        } else {
            v3_1 = 0;
        }
        int v3_4;
        int v0_3 = ((v0_1 ^ v3_1) * -721379959);
        int v3_3 = this.d;
        if (v3_3 != 0) {
            v3_4 = v3_3.hashCode();
        } else {
            v3_4 = 0;
        }
        int v3_6;
        int v0_6 = ((v0_3 ^ v3_4) * 1000003);
        int v3_5 = this.e;
        if (v3_5 != 0) {
            v3_6 = v3_5.hashCode();
        } else {
            v3_6 = 0;
        }
        int v0_8 = ((v0_6 ^ v3_6) * 1000003);
        String v1_1 = this.f;
        if (v1_1 != null) {
            v2_0 = v1_1.hashCode();
        }
        return (v0_8 ^ v2_0);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Application{identifier=");
        v0_1.append(this.a);
        v0_1.append(", version=");
        v0_1.append(this.b);
        v0_1.append(", displayVersion=");
        v0_1.append(this.c);
        v0_1.append(", organization=null, installationUuid=");
        v0_1.append(this.d);
        v0_1.append(", developmentPlatform=");
        v0_1.append(this.e);
        v0_1.append(", developmentPlatformVersion=");
        return v1.a.n(v0_1, this.f, "}");
    }
}
