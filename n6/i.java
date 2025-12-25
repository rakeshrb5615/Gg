package n6;
public final class i {
    public static final long j;
    public static final int[] k;
    public final d6.d a;
    public final c6.b b;
    public final java.util.concurrent.Executor c;
    public final com.google.android.gms.common.util.Clock d;
    public final java.util.Random e;
    public final n6.d f;
    public final com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient g;
    public final n6.n h;
    public final java.util.Map i;

    static i()
    {
        n6.i.j = java.util.concurrent.TimeUnit.HOURS.toSeconds(12);
        int[] v0_3 = new int[8];
        v0_3 = {2, 4, 8, 16, 32, 64, 128, 256};
        n6.i.k = v0_3;
        return;
    }

    public i(d6.d p1, c6.b p2, java.util.concurrent.Executor p3, com.google.android.gms.common.util.Clock p4, java.util.Random p5, n6.d p6, com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient p7, n6.n p8, java.util.HashMap p9)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        this.i = p9;
        return;
    }

    public final n6.h a(String p13, String p14, java.util.Date p15, java.util.HashMap p16)
    {
        String v3_2 = this.g.b();
        int v2_1 = this.g;
        java.util.HashMap v6 = this.d();
        long v5_0 = 0;
        long v7_2 = this.h.a.getString("last_fetch_etag", 0);
        int v0_6 = ((u4.b) this.b.get());
        if (v0_6 != 0) {
            v5_0 = ((Long) ((u4.c) v0_6).a.getUserProperties(0, 0, 1).get("_fot"));
        }
        m6.c v13_5 = v2_1.fetch(v3_2, p13, p14, v6, v7_2, p16, v5_0, p15, this.h.b());
        String v14_11 = v13_5.b;
        if (v14_11 != null) {
            this.h.a.edit().putLong("last_template_version", v14_11.f).apply();
        }
        String v14_12 = v13_5.c;
        if (v14_12 != null) {
            this.h.a.edit().putString("last_fetch_etag", v14_12).apply();
        }
        this.h.d(0, n6.n.f);
        return v13_5;
    }

    public final com.google.android.gms.tasks.Task b(com.google.android.gms.tasks.Task p8, long p9, java.util.HashMap p11)
    {
        java.util.Date v4_1 = new java.util.Date(this.d.currentTimeMillis());
        n6.g v0_2 = 0;
        n6.i v1_4 = this.h;
        if (p8.isSuccessful()) {
            com.google.android.gms.tasks.Task v8_6;
            com.google.android.gms.tasks.Task v8_2 = new java.util.Date(v1_4.a.getLong("last_fetch_time_in_millis", -1));
            if (!v8_2.equals(n6.n.e)) {
                v8_6 = v4_1.before(new java.util.Date((java.util.concurrent.TimeUnit.SECONDS.toMillis(p9) + v8_2.getTime())));
            } else {
                v8_6 = 0;
            }
            if (v8_6 != null) {
                return com.google.android.gms.tasks.Tasks.forResult(new n6.h(2, 0, 0));
            }
        }
        com.google.android.gms.tasks.Task v8_8 = v1_4.a().b;
        if (v4_1.before(v8_8)) {
            v0_2 = v8_8;
        }
        int v9_6;
        com.google.android.gms.tasks.Task v8_9 = this.c;
        if (v0_2 == null) {
            int v9_3 = ((d6.c) this.a);
            com.google.android.gms.tasks.Task v2_6 = v9_3.c();
            com.google.android.gms.tasks.Task v3_1 = v9_3.d();
            v9_6 = com.google.android.gms.tasks.Tasks.whenAllComplete(new com.google.android.gms.tasks.Task[] {v2_6, v3_1})).continueWithTask(v8_9, new n6.g(this, v2_6, v3_1, v4_1, p11));
        } else {
            a5.u v10_3 = android.text.format.DateUtils.formatElapsedTime(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds((v0_2.getTime() - v4_1.getTime())));
            int v11_2 = new StringBuilder("Fetch is throttled. Please wait before calling fetch again: ");
            v11_2.append(v10_3);
            a5.u v10_4 = v11_2.toString();
            v0_2.getTime();
            v9_6 = com.google.android.gms.tasks.Tasks.forException(new m6.e(v10_4));
        }
        return v9_6.continueWithTask(v8_9, new a5.u(6, this, v4_1));
    }

    public final com.google.android.gms.tasks.Task c(int p4)
    {
        java.util.concurrent.Executor v0_1 = new java.util.HashMap(this.i);
        a5.u v1_5 = new StringBuilder();
        v1_5.append("REALTIME");
        v1_5.append("/");
        v1_5.append(p4);
        v0_1.put("X-Firebase-RC-Fetch-Type", v1_5.toString());
        return this.f.b().continueWithTask(this.c, new a5.u(7, this, v0_1));
    }

    public final java.util.HashMap d()
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        java.util.Iterator v1_5 = ((u4.b) this.b.get());
        if (v1_5 != null) {
            java.util.Iterator v1_2 = ((u4.c) v1_5).a.getUserProperties(0, 0, 0).entrySet().iterator();
            while (v1_2.hasNext()) {
                String v2_2 = ((java.util.Map$Entry) v1_2.next());
                v0_1.put(((String) v2_2.getKey()), v2_2.getValue().toString());
            }
        }
        return v0_1;
    }
}
