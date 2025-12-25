package d8;
public final class v {
    public final Object a;
    public final d8.k b;
    public final u7.q c;
    public final Object d;
    public final Throwable e;

    public v(Object p1, d8.k p2, u7.q p3, Object p4, Throwable p5)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        return;
    }

    public synthetic v(Object p9, d8.k p10, u7.q p11, Throwable p12, int p13)
    {
        d8.k v4;
        if ((p13 & 2) == 0) {
            v4 = p10;
        } else {
            v4 = 0;
        }
        u7.q v5;
        if ((p13 & 4) == 0) {
            v5 = p11;
        } else {
            v5 = 0;
        }
        Throwable v7;
        if ((p13 & 16) == 0) {
            v7 = p12;
        } else {
            v7 = 0;
        }
        this(p9, v4, v5, 0, v7);
        return;
    }

    public static d8.v a(d8.v p6, d8.k p7, Throwable p8, int p9)
    {
        if ((p9 & 2) != 0) {
            p7 = p6.b;
        }
        if ((p9 & 16) != 0) {
            p8 = p6.e;
        }
        return new d8.v(p6.a, p7, p6.c, p6.d, p8);
    }

    public final boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof d8.v)) {
                if (kotlin.jvm.internal.j.a(this.a, ((d8.v) p5).a)) {
                    if (kotlin.jvm.internal.j.a(this.b, ((d8.v) p5).b)) {
                        if (kotlin.jvm.internal.j.a(this.c, ((d8.v) p5).c)) {
                            if (kotlin.jvm.internal.j.a(this.d, ((d8.v) p5).d)) {
                                if (kotlin.jvm.internal.j.a(this.e, ((d8.v) p5).e)) {
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
        Throwable v2_0;
        int v1_9 = (v1_8 * 31);
        Throwable v2_6 = this.b;
        if (v2_6 != null) {
            v2_0 = v2_6.hashCode();
        } else {
            v2_0 = 0;
        }
        Throwable v2_2;
        int v1_2 = ((v1_9 + v2_0) * 31);
        Throwable v2_1 = this.c;
        if (v2_1 != null) {
            v2_2 = v2_1.hashCode();
        } else {
            v2_2 = 0;
        }
        Throwable v2_4;
        int v1_4 = ((v1_2 + v2_2) * 31);
        Throwable v2_3 = this.d;
        if (v2_3 != null) {
            v2_4 = v2_3.hashCode();
        } else {
            v2_4 = 0;
        }
        int v1_6 = ((v1_4 + v2_4) * 31);
        Throwable v2_5 = this.e;
        if (v2_5 != null) {
            v0 = v2_5.hashCode();
        }
        return (v1_6 + v0);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("CompletedContinuation(result=");
        v0_1.append(this.a);
        v0_1.append(", cancelHandler=");
        v0_1.append(this.b);
        v0_1.append(", onCancellation=");
        v0_1.append(this.c);
        v0_1.append(", idempotentResume=");
        v0_1.append(this.d);
        v0_1.append(", cancelCause=");
        v0_1.append(this.e);
        v0_1.append(41);
        return v0_1.toString();
    }
}
