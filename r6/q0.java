package r6;
public final class q0 extends n7.i implements u7.p {
    public r6.w a;
    public r6.s0 b;
    public r6.o0 c;
    public q4.f d;
    public r6.m0 e;
    public u6.k f;
    public int m;
    public final synthetic r6.s0 n;
    public final synthetic r6.m0 o;

    public q0(r6.s0 p1, r6.m0 p2, l7.c p3)
    {
        this.n = p1;
        this.o = p2;
        super(2, p3);
        return;
    }

    public final l7.c create(Object p3, l7.c p4)
    {
        return new r6.q0(this.n, this.o, p4);
    }

    public final Object invoke(Object p1, Object p2)
    {
        return ((r6.q0) this.create(((d8.c0) p1), ((l7.c) p2))).invokeSuspend(h7.l.a);
    }

    public final Object invokeSuspend(Object p18)
    {
        String v2_7;
        r6.o0 v5_3;
        String v2_9;
        String v7_1;
        String v3_3;
        RuntimeException v0_12;
        r6.n0 v6_0;
        g5.k v4_3;
        String v2_1;
        RuntimeException v0_0 = m7.a.a;
        String v2_5 = this.m;
        r6.n0 v6_1 = this.n;
        if (v2_5 == null) {
            c4.b.e0(p18);
            this.m = 1;
            v2_1 = r6.s0.a(v6_1, this);
            if (v2_1 != v0_0) {
                if (((Boolean) v2_1).booleanValue()) {
                    String v2_6 = v6_1.b;
                    this.m = 2;
                    v2_7 = r6.w.c.a(v2_6, this);
                    if (v2_7 != v0_0) {
                        r6.o0 v5_2 = ((r6.w) v2_7);
                        g5.k v4_1 = r6.o0.a;
                        String v2_8 = v6_1.a;
                        String v7_0 = v6_1.c;
                        this.a = v5_2;
                        this.b = v6_1;
                        this.c = v4_1;
                        this.d = v2_8;
                        String v9_0 = this.o;
                        this.e = v9_0;
                        this.f = v7_0;
                        this.m = 3;
                        v3_3 = s6.c.a.b(this);
                        if (v3_3 != v0_0) {
                            v0_12 = v7_0;
                            v7_1 = v6_1;
                            v6_0 = v5_2;
                            v5_3 = v4_1;
                            v4_3 = v2_8;
                            v2_9 = v9_0;
                            String v2_0;
                            String v3_5 = ((java.util.Map) v3_3);
                            String v15 = v6_0.a;
                            r6.n0 v6_3 = v6_0.b;
                            v5_3.getClass();
                            kotlin.jvm.internal.j.e(v4_3, "firebaseApp");
                            kotlin.jvm.internal.j.e(v2_9, "sessionDetails");
                            kotlin.jvm.internal.j.e(v0_12, "sessionsSettings");
                            kotlin.jvm.internal.j.e(v3_5, "subscribers");
                            kotlin.jvm.internal.j.e(v6_3, "firebaseAuthenticationToken");
                            String v2_13 = ((g5.k) v3_5.get(s6.d.b));
                            if (v2_13 != null) {
                                if (!v2_13.a.a()) {
                                    v2_0 = r6.j.d;
                                } else {
                                    v2_0 = r6.j.c;
                                }
                            } else {
                                v2_0 = r6.j.b;
                            }
                            RuntimeException v0_6;
                            RuntimeException v0_3 = ((g5.k) v3_5.get(s6.d.a));
                            if (v0_3 != null) {
                                if (!v0_3.a.a()) {
                                    v0_6 = r6.j.d;
                                } else {
                                    v0_6 = r6.j.c;
                                }
                            } else {
                                v0_6 = r6.j.b;
                            }
                            r6.o0 v5_0 = new r6.n0(new r6.v0(v2_9.a, v2_9.b, v2_9.c, v2_9.d, new r6.k(v2_0, v0_6, v0_12.a()), v15, v6_3), r6.o0.a(v4_3));
                            Class vtmp12 = v7_1.getClass();
                            try {
                                v7_1.d.a(v5_0);
                                android.util.Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                            } catch (RuntimeException v0_10) {
                                android.util.Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", v0_10);
                            }
                        } else {
                            return v0_0;
                        }
                    }
                }
            }
        } else {
            if (v2_5 == 1) {
                c4.b.e0(p18);
                v2_1 = p18;
            } else {
                if (v2_5 == 2) {
                    c4.b.e0(p18);
                    v2_7 = p18;
                } else {
                    if (v2_5 != 3) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v0_12 = this.f;
                        v2_9 = this.e;
                        String v3_4 = this.d;
                        g5.k v4_4 = this.c;
                        r6.n0 v6_2 = this.b;
                        r6.o0 v5_5 = this.a;
                        c4.b.e0(p18);
                        v7_1 = v6_2;
                        v6_0 = v5_5;
                        v5_3 = v4_4;
                        v4_3 = v3_4;
                        v3_3 = p18;
                    }
                }
            }
        }
        return h7.l.a;
    }
}
