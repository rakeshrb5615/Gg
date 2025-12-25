package r6;
public final class v0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final r6.k e;
    public final String f;
    public final String g;

    public v0(String p2, String p3, int p4, long p5, r6.k p7, String p8, String p9)
    {
        kotlin.jvm.internal.j.e(p2, "sessionId");
        kotlin.jvm.internal.j.e(p3, "firstSessionId");
        kotlin.jvm.internal.j.e(p9, "firebaseAuthenticationToken");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p7;
        this.f = p8;
        this.g = p9;
        return;
    }

    public final boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof r6.v0)) {
                if (kotlin.jvm.internal.j.a(this.a, ((r6.v0) p8).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((r6.v0) p8).b)) {
                        if (this.c == ((r6.v0) p8).c) {
                            if (this.d == ((r6.v0) p8).d) {
                                if (kotlin.jvm.internal.j.a(this.e, ((r6.v0) p8).e)) {
                                    if (kotlin.jvm.internal.j.a(this.f, ((r6.v0) p8).f)) {
                                        if (kotlin.jvm.internal.j.a(this.g, ((r6.v0) p8).g)) {
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
        return (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((Long.hashCode(this.d) + ((Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("SessionInfo(sessionId=");
        v0_1.append(this.a);
        v0_1.append(", firstSessionId=");
        v0_1.append(this.b);
        v0_1.append(", sessionIndex=");
        v0_1.append(this.c);
        v0_1.append(", eventTimestampUs=");
        v0_1.append(this.d);
        v0_1.append(", dataCollectionStatus=");
        v0_1.append(this.e);
        v0_1.append(", firebaseInstallationId=");
        v0_1.append(this.f);
        v0_1.append(", firebaseAuthenticationToken=");
        v0_1.append(this.g);
        v0_1.append(41);
        return v0_1.toString();
    }
}
