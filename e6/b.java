package e6;
public final class b {
    public static final synthetic int h;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    static b()
    {
        IllegalStateException v0_8 = ((byte) (((byte) (0 | 2)) | 1));
        if (v0_8 != 3) {
            String v1_3 = new StringBuilder();
            if ((v0_8 & 1) == 0) {
                v1_3.append(" expiresInSecs");
            }
            if ((v0_8 & 2) == 0) {
                v1_3.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", v1_3));
        } else {
            return;
        }
    }

    public b(String p1, int p2, String p3, String p4, long p5, long p7, String p9)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p7;
        this.g = p9;
        return;
    }

    public final e6.a a()
    {
        e6.a v0_1 = new e6.a();
        v0_1.a = this.a;
        v0_1.b = this.b;
        v0_1.c = this.c;
        v0_1.d = this.d;
        v0_1.e = this.e;
        v0_1.f = this.f;
        v0_1.g = this.g;
        v0_1.h = 3;
        return v0_1;
    }

    public final boolean equals(Object p6)
    {
        if (p6 != this) {
            if ((p6 instanceof e6.b)) {
                String v0_1 = ((e6.b) p6).g;
                long v1_4 = ((e6.b) p6).d;
                String v2_2 = ((e6.b) p6).c;
                long v3_6 = ((e6.b) p6).a;
                int v4_1 = this.a;
                if (v4_1 != 0) {
                    if (!v4_1.equals(v3_6)) {
                        return 0;
                    }
                } else {
                    if (v3_6 != 0) {
                        return 0;
                    }
                }
                if (u.e.a(this.b, ((e6.b) p6).b)) {
                    long v3_3 = this.c;
                    if (v3_3 != 0) {
                        if (!v3_3.equals(v2_2)) {
                            return 0;
                        }
                    } else {
                        if (v2_2 != null) {
                            return 0;
                        }
                    }
                    String v2_1 = this.d;
                    if (v2_1 != null) {
                        if (!v2_1.equals(v1_4)) {
                            return 0;
                        }
                    } else {
                        if (v1_4 != 0) {
                            return 0;
                        }
                    }
                    if ((this.e == ((e6.b) p6).e) && (this.f == ((e6.b) p6).f)) {
                        boolean v6_3 = this.g;
                        if (v6_3) {
                            if (v6_3.equals(v0_1)) {
                                return 1;
                            }
                        } else {
                            if (v0_1 == null) {
                                return 1;
                            }
                        }
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final int hashCode()
    {
        int v1_10;
        int v0_0 = 0;
        int v1_0 = this.a;
        if (v1_0 != 0) {
            v1_10 = v1_0.hashCode();
        } else {
            v1_10 = 0;
        }
        int v3_2;
        int v1_2 = ((((v1_10 ^ 1000003) * 1000003) ^ u.e.c(this.b)) * 1000003);
        int v3_1 = this.c;
        if (v3_1 != 0) {
            v3_2 = v3_1.hashCode();
        } else {
            v3_2 = 0;
        }
        int v3_4;
        int v1_4 = ((v1_2 ^ v3_2) * 1000003);
        int v3_3 = this.d;
        if (v3_3 != 0) {
            v3_4 = v3_3.hashCode();
        } else {
            v3_4 = 0;
        }
        int v3_5 = this.e;
        int v3_8 = this.f;
        int v1_11 = ((((((v1_4 ^ v3_4) * 1000003) ^ ((int) (v3_5 ^ (v3_5 >> 32)))) * 1000003) ^ ((int) (v3_8 ^ (v3_8 >> 32)))) * 1000003);
        String v2_0 = this.g;
        if (v2_0 != null) {
            v0_0 = v2_0.hashCode();
        }
        return (v0_0 ^ v1_11);
    }

    public final String toString()
    {
        String v1_1;
        String v0_1 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        v0_1.append(this.a);
        v0_1.append(", registrationStatus=");
        String v2_1 = this.b;
        if (v2_1 == 1) {
            v1_1 = "ATTEMPT_MIGRATION";
        } else {
            if (v2_1 == 2) {
                v1_1 = "NOT_GENERATED";
            } else {
                if (v2_1 == 3) {
                    v1_1 = "UNREGISTERED";
                } else {
                    if (v2_1 == 4) {
                        v1_1 = "REGISTERED";
                    } else {
                        if (v2_1 == 5) {
                            v1_1 = "REGISTER_ERROR";
                        } else {
                            v1_1 = "null";
                        }
                    }
                }
            }
        }
        v0_1.append(v1_1);
        v0_1.append(", authToken=");
        v0_1.append(this.c);
        v0_1.append(", refreshToken=");
        v0_1.append(this.d);
        v0_1.append(", expiresInSecs=");
        v0_1.append(this.e);
        v0_1.append(", tokenCreationEpochInSecs=");
        v0_1.append(this.f);
        v0_1.append(", fisError=");
        return v1.a.n(v0_1, this.g, "}");
    }
}
