package u6;
public final class h {
    public static final u6.g Companion;
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    static h()
    {
        u6.h.Companion = new u6.g();
        return;
    }

    public synthetic h(int p3, Boolean p4, Double p5, Integer p6, Integer p7, Long p8)
    {
        if (31 != (p3 & 31)) {
            s8.k.a(p3, 31, u6.f.a.d());
            throw 0;
        } else {
            this.a = p4;
            this.b = p5;
            this.c = p6;
            this.d = p7;
            this.e = p8;
            return;
        }
    }

    public h(Boolean p1, Double p2, Integer p3, Integer p4, Long p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof u6.h)) {
                if (kotlin.jvm.internal.j.a(this.a, ((u6.h) p5).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((u6.h) p5).b)) {
                        if (kotlin.jvm.internal.j.a(this.c, ((u6.h) p5).c)) {
                            if (kotlin.jvm.internal.j.a(this.d, ((u6.h) p5).d)) {
                                if (kotlin.jvm.internal.j.a(this.e, ((u6.h) p5).e)) {
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
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_8;
        int v0 = 0;
        int v1_0 = this.a;
        if (v1_0 != 0) {
            v1_8 = v1_0.hashCode();
        } else {
            v1_8 = 0;
        }
        Long v2_0;
        int v1_9 = (v1_8 * 31);
        Long v2_6 = this.b;
        if (v2_6 != null) {
            v2_0 = v2_6.hashCode();
        } else {
            v2_0 = 0;
        }
        Long v2_2;
        int v1_2 = ((v1_9 + v2_0) * 31);
        Long v2_1 = this.c;
        if (v2_1 != null) {
            v2_2 = v2_1.hashCode();
        } else {
            v2_2 = 0;
        }
        Long v2_4;
        int v1_4 = ((v1_2 + v2_2) * 31);
        Long v2_3 = this.d;
        if (v2_3 != null) {
            v2_4 = v2_3.hashCode();
        } else {
            v2_4 = 0;
        }
        int v1_6 = ((v1_4 + v2_4) * 31);
        Long v2_5 = this.e;
        if (v2_5 != null) {
            v0 = v2_5.hashCode();
        }
        return (v1_6 + v0);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("SessionConfigs(sessionsEnabled=");
        v0_1.append(this.a);
        v0_1.append(", sessionSamplingRate=");
        v0_1.append(this.b);
        v0_1.append(", sessionTimeoutSeconds=");
        v0_1.append(this.c);
        v0_1.append(", cacheDurationSeconds=");
        v0_1.append(this.d);
        v0_1.append(", cacheUpdatedTimeSeconds=");
        v0_1.append(this.e);
        v0_1.append(41);
        return v0_1.toString();
    }
}
