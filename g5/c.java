package g5;
public final class c {
    public final String a;
    public final String b;
    public final String c;

    public c(String p1, String p2, String p3)
    {
        if (p1 == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        } else {
            this.a = p1;
            this.b = p2;
            this.c = p3;
            return;
        }
    }

    public final boolean equals(Object p6)
    {
        if (p6 != this) {
            if ((p6 instanceof g5.c)) {
                String v1_1 = ((g5.c) p6).c;
                String v3 = ((g5.c) p6).b;
                if (this.a.equals(((g5.c) p6).a)) {
                    boolean v6_2 = this.b;
                    if (v6_2) {
                        if (!v6_2.equals(v3)) {
                            return 0;
                        }
                    } else {
                        if (v3 != null) {
                            return 0;
                        }
                    }
                    boolean v6_4 = this.c;
                    if (v6_4) {
                        if (!v6_4.equals(v1_1)) {
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
        int v3_0;
        int v0_6 = ((this.a.hashCode() ^ 1000003) * 1000003);
        int v2 = 0;
        int v3_1 = this.b;
        if (v3_1 != 0) {
            v3_0 = v3_1.hashCode();
        } else {
            v3_0 = 0;
        }
        int v0_2 = ((v0_6 ^ v3_0) * 1000003);
        String v1_0 = this.c;
        if (v1_0 != null) {
            v2 = v1_0.hashCode();
        }
        return (v0_2 ^ v2);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        v0_2.append(this.a);
        v0_2.append(", firebaseInstallationId=");
        v0_2.append(this.b);
        v0_2.append(", firebaseAuthenticationToken=");
        return v1.a.n(v0_2, this.c, "}");
    }
}
