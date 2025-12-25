package g5;
public final class y {
    public static final java.util.regex.Pattern g;
    public static final String h;
    public final d4.l a;
    public final android.content.Context b;
    public final String c;
    public final d6.d d;
    public final g5.v e;
    public g5.c f;

    static y()
    {
        g5.y.g = java.util.regex.Pattern.compile("[^\\p{Alnum}]");
        g5.y.h = java.util.regex.Pattern.quote("/");
        return;
    }

    public y(android.content.Context p1, String p2, d6.d p3, g5.v p4)
    {
        if (p1 == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else {
            if (p2 == null) {
                throw new IllegalArgumentException("appIdentifier must not be null");
            } else {
                this.b = p1;
                this.c = p2;
                this.d = p3;
                this.e = p4;
                this.a = new d4.l();
                return;
            }
        }
    }

    public final declared_synchronized String a(android.content.SharedPreferences p5, String p6)
    {
        String v1_1 = g5.y.g.matcher(java.util.UUID.randomUUID().toString()).replaceAll("").toLowerCase(java.util.Locale.US);
        String v2_2 = new StringBuilder("Created new Crashlytics installation ID: ");
        v2_2.append(v1_1);
        v2_2.append(" for FID: ");
        v2_2.append(p6);
        String v0_2 = v2_2.toString();
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
            android.util.Log.v("FirebaseCrashlytics", v0_2, 0);
        }
        p5.edit().putString("crashlytics.installation.id", v1_1).putString("firebase.installation.id", p6).apply();
        return v1_1;
    }

    public final g5.x b(boolean p9)
    {
        if (!((Boolean) new h5.d(0, h5.f.d, h5.e, "isNotMainThread", "isNotMainThread()Z", 0, 2).invoke()).booleanValue()) {
            g5.x v0_5 = new StringBuilder("Must not be called on a main thread, was called on ");
            v0_5.append(Thread.currentThread().getName());
            v0_5.append(46);
            g5.x v0_6 = v0_5.toString();
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
                android.util.Log.d("FirebaseCrashlytics", v0_6, 0);
            }
        }
        Exception v9_6;
        java.util.concurrent.TimeUnit v5_0 = this.d;
        if (p9 == null) {
            v9_6 = 0;
        } else {
            try {
                v9_6 = ((d6.a) com.google.android.gms.tasks.Tasks.await(((d6.c) v5_0).d(), 10000, java.util.concurrent.TimeUnit.MILLISECONDS)).a;
            } catch (g5.x v0_8) {
                android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", v0_8);
            }
            String v1_2 = ((String) com.google.android.gms.tasks.Tasks.await(((d6.c) v5_0).c(), 10000, java.util.concurrent.TimeUnit.MILLISECONDS));
            return new g5.x(v1_2, v9_6);
        }
        try {
        } catch (g5.x v0_13) {
            android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", v0_13);
        }
        return new g5.x(v1_2, v9_6);
    }

    public final declared_synchronized g5.c c()
    {
        boolean v3_1 = this.f;
        if (v3_1) {
            if ((v3_1.b != null) || (!this.e.a())) {
                return this.f;
            } else {
            }
        }
        boolean v3_0 = d5.d.a;
        v3_0.c("Determining Crashlytics installation ID...");
        g5.c v4_4 = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String v5_3 = v4_4.getString("firebase.installation.id", 0);
        StringBuilder v8_1 = new StringBuilder("Cached Firebase Installation ID: ");
        v8_1.append(v5_3);
        v3_0.c(v8_1.toString());
        if (!this.e.a()) {
            if ((v5_3 == null) || (!v5_3.startsWith("SYN_"))) {
                StringBuilder v1_7 = new StringBuilder("SYN_");
                v1_7.append(java.util.UUID.randomUUID().toString());
                this.f = new g5.c(this.a(v4_4, v1_7.toString()), 0, 0);
            } else {
                this.f = new g5.c(v4_4.getString("crashlytics.installation.id", 0), 0, 0);
            }
        } else {
            g5.c v2_12 = this.b(0);
            String v6_2 = new StringBuilder("Fetched Firebase Installation ID: ");
            v6_2.append(v2_12.a);
            v3_0.c(v6_2.toString());
            if (v2_12.a == null) {
                StringBuilder v1_15;
                if (v5_3 != null) {
                    v1_15 = v5_3;
                } else {
                    StringBuilder v1_17 = new StringBuilder("SYN_");
                    v1_17.append(java.util.UUID.randomUUID().toString());
                    v1_15 = v1_17.toString();
                }
                v2_12 = new g5.x(v1_15, 0);
            }
            if (!java.util.Objects.equals(v2_12.a, v5_3)) {
                this.f = new g5.c(this.a(v4_4, v2_12.a), v2_12.a, v2_12.b);
            } else {
                this.f = new g5.c(v4_4.getString("crashlytics.installation.id", 0), v2_12.a, v2_12.b);
            }
        }
        StringBuilder v1_3 = new StringBuilder("Install IDs: ");
        v1_3.append(this.f);
        v3_0.c(v1_3.toString());
        return this.f;
    }

    public final String d()
    {
        d4.l v0 = this.a;
        String v1_0 = this.b;
        if (v0.b == null) {
            String v1_1 = v1_0.getPackageManager().getInstallerPackageName(v1_0.getPackageName());
            if (v1_1 == null) {
                v1_1 = "";
            }
            v0.b = v1_1;
        }
        String v1_4;
        if (!"".equals(v0.b)) {
            v1_4 = v0.b;
        } else {
            v1_4 = 0;
        }
        return v1_4;
    }
}
