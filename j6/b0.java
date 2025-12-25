package j6;
public final class b0 implements java.lang.Runnable {
    public static final Object f;
    public static Boolean m;
    public static Boolean n;
    public final android.content.Context a;
    public final h3.k b;
    public final android.os.PowerManager$WakeLock c;
    public final j6.z d;
    public final long e;

    static b0()
    {
        j6.b0.f = new Object();
        return;
    }

    public b0(j6.z p1, android.content.Context p2, h3.k p3, long p4)
    {
        this.d = p1;
        this.a = p2;
        this.e = p4;
        this.b = p3;
        this.c = ((android.os.PowerManager) p2.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
        return;
    }

    public static boolean a(android.content.Context p3)
    {
        boolean v3_3;
        Boolean v1 = j6.b0.n;
        if (v1 != null) {
            v3_3 = v1.booleanValue();
        } else {
            v3_3 = j6.b0.b(p3, "android.permission.ACCESS_NETWORK_STATE", v1);
        }
        boolean v3_4 = Boolean.valueOf(v3_3);
        j6.b0.n = v3_4;
        return v3_4.booleanValue();
    }

    public static boolean b(android.content.Context p2, String p3, Boolean p4)
    {
        if (p4 == null) {
            int v2_3;
            if (p2.checkCallingOrSelfPermission(p3) != 0) {
                v2_3 = 0;
            } else {
                v2_3 = 1;
            }
            if ((v2_3 == 0) && (android.util.Log.isLoggable("FirebaseMessaging", 3))) {
                StringBuilder v4_3 = new StringBuilder("Missing Permission: ");
                v4_3.append(p3);
                v4_3.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
                android.util.Log.d("FirebaseMessaging", v4_3.toString());
            }
            return v2_3;
        } else {
            return p4.booleanValue();
        }
    }

    public static boolean c(android.content.Context p3)
    {
        boolean v3_3;
        Boolean v1 = j6.b0.m;
        if (v1 != null) {
            v3_3 = v1.booleanValue();
        } else {
            v3_3 = j6.b0.b(p3, "android.permission.WAKE_LOCK", v1);
        }
        boolean v3_4 = Boolean.valueOf(v3_3);
        j6.b0.m = v3_4;
        return v3_4.booleanValue();
    }

    public final declared_synchronized boolean d()
    {
        int v0_6;
        int v0_5 = ((android.net.ConnectivityManager) this.a.getSystemService("connectivity"));
        if (v0_5 == 0) {
            v0_6 = 0;
        } else {
            v0_6 = v0_5.getActiveNetworkInfo();
        }
        if ((v0_6 == 0) || (!v0_6.isConnected())) {
            int v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        return v0_3;
    }

    public final void run()
    {
        boolean v2_0 = this.d;
        android.content.Context v4 = this.a;
        android.os.PowerManager$WakeLock v6 = this.c;
        if (j6.b0.c(v4)) {
            v6.acquire(j6.f.a);
        }
        try {
            v2_0.d(1);
        } catch (j6.a0 v5_6) {
            long v8_2 = new StringBuilder("Failed to sync topics. Won\'t retry sync. ");
            v8_2.append(v5_6.getMessage());
            android.util.Log.e("FirebaseMessaging", v8_2.toString());
            v2_0.d(0);
            if (!j6.b0.c(v4)) {
                return;
            } else {
                v6.release();
                return;
            }
            if (!j6.b0.c(v4)) {
                return;
            } else {
                v6.release();
                return;
            }
        } catch (boolean v2_2) {
            if (j6.b0.c(v4)) {
                try {
                    v6.release();
                } catch (RuntimeException) {
                    android.util.Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
                }
            }
            throw v2_2;
        } catch (RuntimeException) {
            android.util.Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
            return;
        }
        if (this.b.d()) {
            if ((!j6.b0.a(v4)) || (this.d())) {
                if (!v2_0.e()) {
                    v2_0.f(this.e);
                } else {
                    v2_0.d(0);
                }
            } else {
                new j6.a0(this, this).a();
                if (!j6.b0.c(v4)) {
                    return;
                } else {
                    try {
                        v6.release();
                        return;
                    } catch (RuntimeException) {
                        android.util.Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
                        return;
                    }
                }
            }
        } else {
            v2_0.d(0);
            if (!j6.b0.c(v4)) {
                return;
            } else {
                try {
                    v6.release();
                    return;
                } catch (RuntimeException) {
                    android.util.Log.i("FirebaseMessaging", "TopicsSyncTask\'s wakelock was already released due to timeout.");
                    return;
                }
            }
        }
    }
}
