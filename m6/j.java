package m6;
public final class j implements p6.a {
    public static final com.google.android.gms.common.util.Clock j;
    public static final java.util.Random k;
    public static final java.util.HashMap l;
    public final java.util.HashMap a;
    public final android.content.Context b;
    public final java.util.concurrent.ScheduledExecutorService c;
    public final q4.f d;
    public final d6.d e;
    public final r4.c f;
    public final c6.b g;
    public final String h;
    public final java.util.HashMap i;

    static j()
    {
        m6.j.j = com.google.android.gms.common.util.DefaultClock.getInstance();
        m6.j.k = new java.util.Random();
        m6.j.l = new java.util.HashMap();
        return;
    }

    public j(android.content.Context p2, java.util.concurrent.ScheduledExecutorService p3, q4.f p4, d6.d p5, r4.c p6, c6.b p7)
    {
        this.a = new java.util.HashMap();
        this.i = new java.util.HashMap();
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        p4.a();
        this.h = p4.c.b;
        com.google.android.gms.common.api.internal.BackgroundDetector v2_2 = ((android.app.Application) p2.getApplicationContext());
        int v4_3 = m6.i.a;
        if (v4_3.get() == null) {
            m6.i v5_3 = new m6.i();
            while (!v4_3.compareAndSet(0, v5_3)) {
                if (v4_3.get() != null) {
                }
            }
            com.google.android.gms.common.api.internal.BackgroundDetector.initialize(v2_2);
            com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().addListener(v5_3);
        }
        com.google.android.gms.tasks.Tasks.call(p3, new g5.p(this, 1));
        return;
    }

    public final declared_synchronized m6.b a()
    {
        try {
            Throwable v0_7;
            n6.d v7 = this.c("fetch");
            n6.d v8 = this.c("activate");
            n6.d v9 = this.c("defaults");
            java.util.concurrent.ScheduledExecutorService v1_1 = this.b;
            m6.j v2_0 = this.h;
            q4.f v3_1 = new StringBuilder("frc_");
            v3_1.append(v2_0);
            v3_1.append("_firebase_settings");
            n6.n v12_1 = new n6.n(v1_1.getSharedPreferences(v3_1.toString(), 0));
            n6.j v11_1 = new n6.j(this.c, v8, v9);
            Throwable v0_4 = this.d;
            java.util.concurrent.ScheduledExecutorService v1_2 = this.g;
            v0_4.a();
        } catch (Throwable v0_11) {
            throw v0_11;
        }
        if (!v0_4.b.equals("[DEFAULT]")) {
            v0_7 = 0;
        } else {
            v0_7 = new n0.a(v1_2);
        }
        if (v0_7 != null) {
            v11_1.a.add(new m6.h(v0_7));
        }
        Throwable v0_13 = new n0.a(4);
        v0_13.b = v8;
        v0_13.c = v9;
        java.util.concurrent.ScheduledExecutorService v1_7 = this.c;
        j6.s v13_1 = new j6.s(8, 0);
        v13_1.e = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        v13_1.b = v8;
        v13_1.c = v0_13;
        v13_1.d = v1_7;
        return this.b(this.d, this.e, this.f, this.c, v7, v8, v9, this.d(v7, v12_1), v11_1, v12_1, v13_1);
    }

    public final declared_synchronized m6.b b(q4.f p14, d6.d p15, r4.c p16, java.util.concurrent.Executor p17, n6.d p18, n6.d p19, n6.d p20, n6.i p21, n6.j p22, n6.n p23, j6.s p24)
    {
        if (!this.a.containsKey("firebase")) {
            int v3_0;
            p14.a();
            if (!p14.b.equals("[DEFAULT]")) {
                v3_0 = 0;
            } else {
                v3_0 = p16;
            }
            m6.b v2_0 = new m6.b(v3_0, p17, p18, p19, p20, p21, p22, p23, new n0.a(p14, p15, p21, p19, this.b, p23, this.c), p24);
            p19.b();
            p20.b();
            p18.b();
            this.a.put("firebase", v2_0);
            m6.j.l.put("firebase", v2_0);
        }
        return ((m6.b) this.a.get("firebase"));
    }

    public final n6.d c(String p6)
    {
        java.util.concurrent.ScheduledExecutorService v0_0 = this.h;
        Class v1_2 = new StringBuilder("frc_");
        v1_2.append(v0_0);
        v1_2.append("_firebase_");
        v1_2.append(p6);
        v1_2.append(".json");
        n6.d v6_1 = v1_2.toString();
        java.util.concurrent.ScheduledExecutorService v0_1 = this.c;
        String v2 = n6.o;
        java.util.HashMap v3_0 = n6.o.c;
        if (!v3_0.containsKey(v6_1)) {
            v3_0.put(v6_1, new n6.o(this.b, v6_1));
        }
        n6.d v6_4 = ((n6.o) v3_0.get(v6_1));
        Class v1 = n6.d;
        String v2_1 = v6_4.b;
        java.util.HashMap v3_1 = n6.d.d;
        if (!v3_1.containsKey(v2_1)) {
            v3_1.put(v2_1, new n6.d(v0_1, v6_4));
        }
        return ((n6.d) v3_1.get(v2_1));
    }

    public final declared_synchronized n6.i d(n6.d p22, n6.n p23)
    {
        android.content.SharedPreferences v0_1;
        d6.d v3_0 = this.e;
        android.content.SharedPreferences v0_9 = this.d;
        v0_9.a();
        if (!v0_9.b.equals("[DEFAULT]")) {
            v0_1 = new a5.g(7);
        } else {
            v0_1 = this.g;
        }
        a5.g v4_1 = v0_1;
        java.util.concurrent.ScheduledExecutorService v5 = this.c;
        android.content.SharedPreferences v0_3 = this.d;
        v0_3.a();
        String v14 = v0_3.c.a;
        android.content.SharedPreferences v0_5 = this.d;
        v0_5.a();
        return new n6.i(v3_0, v4_1, v5, m6.j.j, m6.j.k, p22, new com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient(this.b, v0_5.c.b, v14, p23.a.getLong("fetch_timeout_in_seconds", 60), n6.n v10.a.getLong("fetch_timeout_in_seconds", 60)), p23, this.i);
    }
}
