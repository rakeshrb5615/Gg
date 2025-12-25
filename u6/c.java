package u6;
public final class c implements u6.p {
    public static final int g;
    public static final b8.h h;
    public final r6.g1 a;
    public final d6.d b;
    public final r6.b c;
    public final u6.e d;
    public final u6.o e;
    public final m8.c f;

    static c()
    {
        u6.c.g = ((int) c8.a.d(j5.t1.U(24, c8.c.f), c8.c.d));
        u6.c.h = new b8.h("/");
        return;
    }

    public c(r6.g1 p2, d6.d p3, r6.b p4, u6.e p5, u6.o p6)
    {
        kotlin.jvm.internal.j.e(p2, "timeProvider");
        kotlin.jvm.internal.j.e(p3, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.e(p4, "appInfo");
        kotlin.jvm.internal.j.e(p5, "configsFetcher");
        kotlin.jvm.internal.j.e(p6, "settingsCache");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        this.f = m8.d.a();
        return;
    }

    public final Boolean a()
    {
        return this.e.a().a;
    }

    public final Double b()
    {
        return this.e.a().b;
    }

    public final Object c(l7.c p19)
    {
        u6.b v3_1;
        if (!(p19 instanceof u6.b)) {
            v3_1 = new u6.b(this, ((n7.c) p19));
        } else {
            v3_1 = ((u6.b) p19);
            m7.a v4_2 = ((u6.b) p19).e;
            if ((v4_2 & -2147483648) == 0) {
            } else {
                ((u6.b) p19).e = (v4_2 - -2147483648);
            }
        }
        u6.c v7_1;
        m8.c v5_6;
        m8.c v2_7;
        h7.l v0_14 = v3_1.c;
        m7.a v4_1 = m7.a.a;
        m8.c v5_1 = v3_1.e;
        h7.l v10 = h7.l.a;
        try {
            if (v5_1 == null) {
                c4.b.e0(v0_14);
                h7.l v0_15 = this.f;
                if ((v0_15.c()) || (this.e.b())) {
                    v3_1.a = this;
                    v3_1.b = v0_15;
                    v3_1.e = 1;
                    if (v0_15.d(v3_1) != v4_1) {
                        v5_6 = v0_15;
                        v7_1 = this;
                        if (v7_1.e.b()) {
                            u6.d v12_2 = v7_1.b;
                            v3_1.a = v7_1;
                            v3_1.b = v5_6;
                            v3_1.e = 2;
                            v0_14 = r6.w.c.a(v12_2, v3_1);
                            if (v0_14 != v4_1) {
                                h7.l v0_21 = ((r6.w) v0_14).a;
                                if (!v0_21.equals("")) {
                                    u6.d v12_4 = new h7.f("X-Crashlytics-Installation-ID", v0_21);
                                    m8.c v2_16 = new StringBuilder();
                                    v2_16.append(android.os.Build.MANUFACTURER);
                                    v2_16.append(android.os.Build.MODEL);
                                    m8.c v2_17 = v2_16.toString();
                                    v7_1.getClass();
                                    u6.e v13_5 = u6.c.h;
                                    java.util.Map v14_2 = new h7.f("X-Crashlytics-Device-Model", v13_5.b(v2_17));
                                    m8.c v2_19 = android.os.Build$VERSION.INCREMENTAL;
                                    kotlin.jvm.internal.j.d(v2_19, "INCREMENTAL");
                                    a1.d v15_1 = new h7.f("X-Crashlytics-OS-Build-Version", v13_5.b(v2_19));
                                    m8.c v2_0 = android.os.Build$VERSION.RELEASE;
                                    kotlin.jvm.internal.j.d(v2_0, "RELEASE");
                                    h7.f v6_2 = new h7.f("X-Crashlytics-OS-Display-Version", v13_5.b(v2_0));
                                    v7_1.c.getClass();
                                    java.util.Map v14_0 = i7.r.n0(new h7.f[] {v12_4, v14_2, v15_1, v6_2, new h7.f("X-Crashlytics-API-Client-Version", "3.0.3")}));
                                    android.util.Log.d("FirebaseSessions", "Fetching settings from server.");
                                    u6.e v13_2 = v7_1.d;
                                    a1.d v15_3 = new a1.d(v7_1, 0, 12);
                                    h7.l v0_8 = new a1.o(2, 0, 1);
                                    v3_1.a = v5_6;
                                    v3_1.b = 0;
                                    v3_1.e = 3;
                                    h7.l v0_9 = d8.f0.x(v13_2.b, new u6.d(v13_2, v14_0, v15_3, v0_8, 0), v3_1);
                                    if (v0_9 != v4_1) {
                                        v0_9 = v10;
                                    }
                                    if (v0_9 != v4_1) {
                                        v2_7 = v5_6;
                                    } else {
                                        return v4_1;
                                    }
                                } else {
                                    android.util.Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                                    ((m8.c) v5_6).f(0);
                                    return v10;
                                }
                            } else {
                                return v4_1;
                            }
                        } else {
                            android.util.Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                            ((m8.c) v5_6).f(0);
                            return v10;
                        }
                    }
                } else {
                    return v10;
                }
            } else {
                if (v5_1 == 1) {
                    v5_6 = v3_1.b;
                    v7_1 = ((u6.c) v3_1.a);
                    c4.b.e0(v0_14);
                } else {
                    if (v5_1 == 2) {
                        v5_6 = v3_1.b;
                        v7_1 = ((u6.c) v3_1.a);
                        c4.b.e0(v0_14);
                    } else {
                        if (v5_1 != 3) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            v2_7 = ((m8.a) v3_1.a);
                            try {
                                c4.b.e0(v0_14);
                            } catch (h7.l v0_10) {
                                ((m8.c) v2_7).f(0);
                                throw v0_10;
                            }
                        }
                    }
                }
            }
        } catch (h7.l v0_10) {
            v2_7 = v5_6;
        }
        ((m8.c) v2_7).f(0);
        return v10;
    }

    public final c8.a d()
    {
        int v0_3 = this.e.a().c;
        if (v0_3 == 0) {
            return 0;
        } else {
            return new c8.a(j5.t1.U(v0_3.intValue(), c8.c.d));
        }
    }
}
