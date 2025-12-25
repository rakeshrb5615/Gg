package j6;
public final class v implements java.lang.Runnable {
    public final long a;
    public final android.os.PowerManager$WakeLock b;
    public final com.google.firebase.messaging.FirebaseMessaging c;

    public v(com.google.firebase.messaging.FirebaseMessaging p9, long p10)
    {
        new java.util.concurrent.ThreadPoolExecutor(0, 1, 30, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("firebase-iid-executor"));
        this.c = p9;
        this.a = p10;
        android.os.PowerManager$WakeLock v9_4 = ((android.os.PowerManager) p9.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = v9_4;
        v9_4.setReferenceCounted(0);
        return;
    }

    public final boolean a()
    {
        int v0_7;
        int v0_6 = ((android.net.ConnectivityManager) this.c.b.getSystemService("connectivity"));
        if (v0_6 == 0) {
            v0_7 = 0;
        } else {
            v0_7 = v0_6.getActiveNetworkInfo();
        }
        if ((v0_7 == 0) || (!v0_7.isConnected())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean b()
    {
        try {
            if (this.c.a() != null) {
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    android.util.Log.d("FirebaseMessaging", "Token successfully retrieved");
                }
                return 1;
            } else {
                android.util.Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return 0;
            }
        } catch (SecurityException) {
            android.util.Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return 0;
        }
    }

    public final void run()
    {
        android.os.PowerManager$WakeLock v0 = this.b;
        boolean v1_0 = "Topic sync or token retrieval failed on hard failure exceptions: ";
        android.content.Context v3_0 = this.c;
        if (j6.s.g().k(v3_0.b)) {
            v0.acquire();
        }
        android.content.Context v2_0 = 0;
        try {
        } catch (Throwable v4_14) {
            StringBuilder v6_1 = new StringBuilder(v1_0);
            v6_1.append(v4_14.getMessage());
            v6_1.append(". Won\'t retry the operation.");
            android.util.Log.e("FirebaseMessaging", v6_1.toString());
            v3_0.i = v2_0;
            if (!j6.s.g().k(v3_0.b)) {
                return;
            } else {
                v0.release();
                return;
            }
        } catch (boolean v1_12) {
            if (j6.s.g().k(v3_0.b)) {
                v0.release();
            }
            throw v1_12;
        }
        v3_0.i = 1;
        if (v3_0.h.d()) {
            if ((!j6.s.g().j(v3_0.b)) || (this.a())) {
                if (!this.b()) {
                    v3_0.f(this.a);
                } else {
                    v3_0.i = 0;
                }
                if (!j6.s.g().k(v3_0.b)) {
                    return;
                } else {
                    v0.release();
                    return;
                }
            } else {
                Throwable v4_11 = new j6.u();
                v4_11.a = this;
                v4_11.a();
                if (!j6.s.g().k(v3_0.b)) {
                    return;
                } else {
                    v0.release();
                    return;
                }
            }
        } else {
            v3_0.i = 0;
            v2_0 = v3_0.b;
            v1_0 = j6.s.g().k(v2_0);
            if (!v1_0) {
                return;
            } else {
                v0.release();
                return;
            }
        }
    }
}
