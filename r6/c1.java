package r6;
public final class c1 {
    public final u6.k a;
    public final r6.t0 b;
    public final r6.p0 c;
    public final r6.g1 d;
    public final a1.h e;
    public final r6.c0 f;
    public final l7.h g;
    public r6.h0 h;
    public boolean i;
    public String j;

    public c1(u6.k p2, r6.t0 p3, r6.p0 p4, r6.g1 p5, a1.h p6, r6.c0 p7, l7.h p8)
    {
        kotlin.jvm.internal.j.e(p2, "sessionsSettings");
        kotlin.jvm.internal.j.e(p3, "sessionGenerator");
        kotlin.jvm.internal.j.e(p4, "sessionFirelogPublisher");
        kotlin.jvm.internal.j.e(p5, "timeProvider");
        kotlin.jvm.internal.j.e(p6, "sessionDataStore");
        kotlin.jvm.internal.j.e(p7, "processDataManager");
        kotlin.jvm.internal.j.e(p8, "backgroundDispatcher");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        this.f = p7;
        this.g = p8;
        this.j = "";
        d8.f0.p(d8.f0.b(p8), new r6.y0(this, 0, 0));
        return;
    }

    public static final Object a(r6.c1 p4, String p5, r6.z0 p6, l7.c p7)
    {
        String v0_1;
        p4.getClass();
        if (!(p7 instanceof r6.b1)) {
            v0_1 = new r6.b1(p4, p7);
        } else {
            v0_1 = ((r6.b1) p7);
            String v1_5 = ((r6.b1) p7).e;
            if ((v1_5 & -2147483648) == 0) {
            } else {
                ((r6.b1) p7).e = (v1_5 - -2147483648);
            }
        }
        String v7_1 = v0_1.c;
        String v1_4 = m7.a.a;
        int v2_0 = v0_1.e;
        if (v2_0 == 0) {
            c4.b.e0(v7_1);
            if (!kotlin.jvm.internal.j.a(p4.j, p5)) {
                p4.j = p5;
                v0_1.a = p5;
                v0_1.b = p6;
                v0_1.e = 1;
                v7_1 = s6.c.a.b(v0_1);
                if (v7_1 == v1_4) {
                    return v1_4;
                }
            } else {
                return h7.l.a;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                p6 = v0_1.b;
                p5 = v0_1.a;
                c4.b.e0(v7_1);
            }
        }
        a5.o v4_6 = ((java.util.Map) v7_1).values().iterator();
        while (v4_6.hasNext()) {
            String v7_7 = ((g5.k) v4_6.next());
            String v0_7 = new s6.e(p5);
            v7_7.getClass();
            String v1_7 = new StringBuilder("App Quality Sessions session changed: ");
            v1_7.append(v0_7);
            String v0_8 = v1_7.toString();
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", v0_8, 0);
            }
            String v7_8 = v7_7.b;
            if (!java.util.Objects.equals(v7_8.c, p5)) {
                g5.j.a(v7_8.a, v7_8.b, p5);
                v7_8.c = p5;
            }
            String v0_4;
            String v0_12 = p6.ordinal();
            if (v0_12 == null) {
                String v0_14 = new StringBuilder("Notified ");
                v0_14.append(s6.d.a);
                v0_14.append(" of new session ");
                v0_14.append(p5);
                v0_4 = v0_14.toString();
            } else {
                if (v0_12 != 1) {
                    throw new a5.o();
                } else {
                    String v0_3 = new StringBuilder("Notified ");
                    v0_3.append(s6.d.a);
                    v0_3.append(" of new fallback session ");
                    v0_3.append(p5);
                    v0_4 = v0_3.toString();
                }
            }
            android.util.Log.d("FirebaseSessions", v0_4);
        }
        return h7.l.a;
    }

    public final void b()
    {
        this.i = 0;
        if (this.h != null) {
            i8.c v0_7 = new StringBuilder("App backgrounded on ");
            v0_7.append(this.f.a());
            android.util.Log.d("FirebaseSessions", v0_7.toString());
            d8.f0.p(d8.f0.b(this.g), new r6.y0(this, 0, 1));
            return;
        } else {
            android.util.Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
    }

    public final boolean c(r6.h0 p6)
    {
        String v6_1 = p6.c;
        int v1 = 1;
        String v2_0 = this.f;
        if (v6_1 == null) {
            String v6_11 = new StringBuilder("No process data for ");
            v6_11.append(v2_0.a());
            android.util.Log.d("FirebaseSessions", v6_11.toString());
            return 1;
        } else {
            v2_0.getClass();
            String v6_4 = ((r6.a0) v6_1.get(v2_0.a()));
            if ((v6_4 != null) && ((v6_4.a == v2_0.c) && (kotlin.jvm.internal.j.a(v6_4.b, ((String) v2_0.d.getValue()))))) {
                v1 = 0;
            }
            if (v1 != 0) {
                String v6_8 = new StringBuilder("Process ");
                v6_8.append(v2_0.a());
                v6_8.append(" is stale");
                android.util.Log.d("FirebaseSessions", v6_8.toString());
            }
            return v1;
        }
    }

    public final boolean d(r6.h0 p12)
    {
        StringBuilder v0_0 = p12.b;
        String v12_1 = p12.a;
        int v3 = 0;
        if (v0_0 == null) {
            StringBuilder v0_12 = new StringBuilder("Session ");
            v0_12.append(v12_1.a);
            v0_12.append(" has not backgrounded yet");
            android.util.Log.d("FirebaseSessions", v0_12.toString());
            return 0;
        } else {
            long v9;
            long v4_4 = j5.t1.V((this.d.a().a - v0_0.a), c8.c.c);
            StringBuilder v0_2 = this.a;
            c8.c v6_2 = v0_2.a.d();
            if (v6_2 == null) {
                StringBuilder v0_4 = v0_2.b.d();
                if (v0_4 != null) {
                    v9 = v0_4.a;
                    if ((v9 > 0) && (!c8.a.c(v9))) {
                        if (c8.a.b(v4_4, v9) > 0) {
                            v3 = 1;
                        }
                        if (v3 != 0) {
                            StringBuilder v0_10 = new StringBuilder("Session ");
                            v0_10.append(v12_1.a);
                            v0_10.append(" is expired");
                            android.util.Log.d("FirebaseSessions", v0_10.toString());
                        }
                        return v3;
                    }
                }
                v9 = j5.t1.U(30, c8.c.e);
            } else {
                v9 = v6_2.a;
                if ((v9 <= 0) || (c8.a.c(v9))) {
                }
            }
        }
    }
}
