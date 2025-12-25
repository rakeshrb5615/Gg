package r6;
public final class s0 implements r6.p0 {
    public static final double f;
    public static final synthetic int g;
    public final q4.f a;
    public final d6.d b;
    public final u6.k c;
    public final r6.l d;
    public final l7.h e;

    static s0()
    {
        r6.s0.f = Math.random();
        return;
    }

    public s0(q4.f p2, d6.d p3, u6.k p4, r6.l p5, l7.h p6)
    {
        kotlin.jvm.internal.j.e(p2, "firebaseApp");
        kotlin.jvm.internal.j.e(p3, "firebaseInstallations");
        kotlin.jvm.internal.j.e(p4, "sessionSettings");
        kotlin.jvm.internal.j.e(p5, "eventGDTLogger");
        kotlin.jvm.internal.j.e(p6, "backgroundDispatcher");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        return;
    }

    public static final Object a(r6.s0 p6, n7.c p7)
    {
        double v0_2;
        if (!(p7 instanceof r6.r0)) {
            v0_2 = new r6.r0(p6, p7);
        } else {
            v0_2 = ((r6.r0) p7);
            m7.a v1_2 = ((r6.r0) p7).d;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((r6.r0) p7).d = (v1_2 - -2147483648);
            }
        }
        Object v7_1 = v0_2.b;
        m7.a v1_1 = m7.a.a;
        boolean v2_0 = v0_2.d;
        boolean v4 = 1;
        if (!v2_0) {
            c4.b.e0(v7_1);
            v0_2.a = p6;
            v0_2.d = 1;
            v7_1 = s6.c.a.b(v0_2);
            if (v7_1 != v1_1) {
                Object v7_4 = ((java.util.Map) v7_1).values();
                if ((v7_4 == null) || (!v7_4.isEmpty())) {
                    Object v7_5 = v7_4.iterator();
                    while (v7_5.hasNext()) {
                        if (((g5.k) v7_5.next()).a.a()) {
                            Object v7_6 = p6.c;
                            v0_2.a = p6;
                            v0_2.d = 2;
                            if (v7_6.b(v0_2) == v1_1) {
                                return v1_1;
                            }
                        }
                        Object v7_9 = p6.c;
                        double v0_4 = v7_9.a.a();
                        if (v0_4 == 0) {
                            Object v7_11 = v7_9.b.a();
                            if (v7_11 != null) {
                                v4 = v7_11.booleanValue();
                            }
                        } else {
                            v4 = v0_4.booleanValue();
                        }
                        if (v4) {
                            if (r6.s0.f > p6.c.a()) {
                                android.util.Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
                                return Boolean.FALSE;
                            } else {
                                return Boolean.TRUE;
                            }
                        } else {
                            android.util.Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
                            return Boolean.FALSE;
                        }
                    }
                }
                android.util.Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
                return Boolean.FALSE;
            }
        } else {
            if (v2_0 == 1) {
                p6 = v0_2.a;
                c4.b.e0(v7_1);
            } else {
                if (v2_0 != 2) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    p6 = v0_2.a;
                    c4.b.e0(v7_1);
                }
            }
        }
    }
}
