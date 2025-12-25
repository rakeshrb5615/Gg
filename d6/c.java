package d6;
public final class c implements d6.d {
    public static final Object m;
    public final q4.f a;
    public final f6.c b;
    public final k2.c c;
    public final d6.j d;
    public final a5.r e;
    public final d6.h f;
    public final Object g;
    public final java.util.concurrent.ExecutorService h;
    public final b5.m i;
    public String j;
    public final java.util.HashSet k;
    public final java.util.ArrayList l;

    static c()
    {
        d6.c.m = new Object();
        new java.util.concurrent.atomic.AtomicInteger(1);
        return;
    }

    public c(q4.f p6, c6.b p7, java.util.concurrent.ExecutorService p8, b5.m p9)
    {
        p6.a();
        f6.c v0_1 = new f6.c(p6.a, p7);
        k2.c v7_2 = new k2.c(p6);
        if (v3.f.b == null) {
            v3.f.b = new v3.f();
        }
        if (d6.j.d == null) {
            d6.j.d = new d6.j(v3.f.b);
        }
        a5.r v2_4 = new a5.r(new a5.e(p6, 2));
        d6.h v3_3 = new d6.h();
        this.g = new Object();
        this.k = new java.util.HashSet();
        this.l = new java.util.ArrayList();
        this.a = p6;
        this.b = v0_1;
        this.c = v7_2;
        this.d = d6.j.d;
        this.e = v2_4;
        this.f = v3_3;
        this.h = p8;
        this.i = p9;
        return;
    }

    public final void a()
    {
        d6.b v1_0 = this.a;
        v1_0.a();
        d6.b v1_5 = k2.c.g(v1_0.a);
        try {
            int v2_2 = this.c.A();
            int v3_2 = v2_2.b;
            int v5 = 1;
        } catch (int v2_0) {
            if (v1_5 != null) {
                v1_5.B();
            }
            throw v2_0;
        }
        if (v3_2 != 2) {
            if (v3_2 != 1) {
                v5 = 0;
            } else {
            }
        }
        if (v5 != 0) {
            int v3_0 = this.f(v2_2);
            k2.c v4_1 = this.c;
            int v2_1 = v2_2.a();
            v2_1.a = v3_0;
            v2_1.b = 3;
            v2_2 = v2_1.a();
            v4_1.r(v2_2);
        }
        if (v1_5 != null) {
            v1_5.B();
        }
        this.i(v2_2);
        this.i.execute(new d6.b(this, 2));
        return;
    }

    public final e6.b b(e6.b p19)
    {
        f6.b v2_11 = this.b;
        String v3_3 = this.a;
        v3_3.a();
        String v3_5 = v3_3.c.a;
        long v4_4 = p19.a;
        String v5_2 = this.a;
        v5_2.a();
        String v5_1 = v5_2.c.g;
        long v6_0 = p19.d;
        f6.d v8 = v2_11.c;
        if (!v8.a()) {
            throw new d6.e("Firebase Installations Service is unavailable. Please try again later.");
        } else {
            IllegalStateException v9_4 = new StringBuilder("projects/");
            v9_4.append(v5_1);
            v9_4.append("/installations/");
            v9_4.append(v4_4);
            v9_4.append("/authTokens:generate");
            long v4_3 = f6.c.a(v9_4.toString());
            String v10_1 = 0;
            while (v10_1 <= 1) {
                android.net.TrafficStats.setThreadStatsTag(32771);
                java.net.HttpURLConnection v12_1 = v2_11.c(v4_3, v3_5);
                try {
                    int v14_7;
                    v12_1.setRequestMethod("POST");
                    int v14_3 = new StringBuilder();
                    v14_3.append("FIS_v2 ");
                    v14_3.append(v6_0);
                    v12_1.addRequestProperty("Authorization", v14_3.toString());
                    v12_1.setDoOutput(1);
                    f6.c.h(v12_1);
                    f6.b v13_7 = v12_1.getResponseCode();
                    v8.b(v13_7);
                } catch (java.io.IOException) {
                    int v16 = v10_1;
                    v12_1.disconnect();
                    android.net.TrafficStats.clearThreadStatsTag();
                    v10_1 = (v16 + 1);
                } catch (Throwable v0_1) {
                    v12_1.disconnect();
                    android.net.TrafficStats.clearThreadStatsTag();
                    throw v0_1;
                } catch (java.io.IOException) {
                }
                if ((v13_7 < 200) || (v13_7 >= 300)) {
                    v14_7 = 0;
                } else {
                    v14_7 = 1;
                }
                f6.b v2_0;
                if (v14_7 == 0) {
                    f6.b v13_0;
                    f6.c.b(v12_1, 0, v3_5, v5_1);
                    v16 = v10_1;
                    if ((v13_7 != 401) && (v13_7 != 404)) {
                        if (v13_7 == 429) {
                            throw new d6.e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        } else {
                            if ((v13_7 < 500) || (v13_7 >= 600)) {
                                android.util.Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                } else {
                                    v13_0 = new f6.b(0, 0, 2);
                                }
                            }
                        }
                    } else {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        } else {
                            v13_0 = new f6.b(0, 0, 3);
                        }
                    }
                    v12_1.disconnect();
                    android.net.TrafficStats.clearThreadStatsTag();
                    v2_0 = v13_0;
                } else {
                    v2_0 = f6.c.f(v12_1);
                    v12_1.disconnect();
                    android.net.TrafficStats.clearThreadStatsTag();
                }
                String v3_1 = u.e.c(v2_0.c);
                if (v3_1 == null) {
                    String v3_2 = v2_0.a;
                    long v4_0 = v2_0.b;
                    f6.b v2_1 = this.d;
                    v2_1.getClass();
                    v2_1.a.getClass();
                    long v6_2 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    Throwable v0_2 = p19.a();
                    v0_2.c = v3_2;
                    v0_2.e = v4_0;
                    f6.b v2_5 = ((byte) (v0_2.h | 1));
                    v0_2.f = v6_2;
                    v0_2.h = ((byte) (v2_5 | 2));
                    return v0_2.a();
                } else {
                    if (v3_1 == 1) {
                        Throwable v0_4 = p19.a();
                        v0_4.g = "BAD CONFIG";
                        v0_4.b = 5;
                        return v0_4.a();
                    } else {
                        if (v3_1 != 2) {
                            throw new d6.e("Firebase Installations Service is unavailable. Please try again later.");
                        } else {
                            this.j = 0;
                            Throwable v0_8 = p19.a();
                            v0_8.b = 2;
                            return v0_8.a();
                        }
                    }
                }
            }
            throw new d6.e("Firebase Installations Service is unavailable. Please try again later.");
        }
    }

    public final com.google.android.gms.tasks.Task c()
    {
        this.e();
        Throwable v0_0 = this.j;
        if (v0_0 == null) {
            Throwable v0_6 = new com.google.android.gms.tasks.TaskCompletionSource();
            this.l.add(new d6.g(v0_6));
            Throwable v0_1 = v0_6.getTask();
            this.h.execute(new d6.b(this, 0));
            return v0_1;
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(v0_0);
        }
    }

    public final com.google.android.gms.tasks.Task d()
    {
        this.e();
        Throwable v0_3 = new com.google.android.gms.tasks.TaskCompletionSource();
        this.l.add(new d6.f(this.d, v0_3));
        Throwable v0_1 = v0_3.getTask();
        this.h.execute(new d6.b(this, 1));
        return v0_1;
    }

    public final void e()
    {
        boolean v0_0 = this.a;
        v0_0.a();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_0.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        v0_0.a();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_0.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        v0_0.a();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_0.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        v0_0.a();
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_0.c.b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        v0_0.a();
        com.google.android.gms.common.internal.Preconditions.checkArgument(d6.j.c.matcher(v0_0.c.a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        return;
    }

    public final String f(e6.b p6)
    {
        android.content.SharedPreferences v0_0 = this.a;
        v0_0.a();
        if (v0_0.b.equals("CHIME_ANDROID_SDK")) {
            if (p6.b == 1) {
                String v6_6 = ((e6.c) this.e.get());
                String v2_1 = v6_6.a.getString("|S|id", 0);
                if (v2_1 == null) {
                    v2_1 = v6_6.a();
                } else {
                }
                if (!android.text.TextUtils.isEmpty(v2_1)) {
                    return v2_1;
                } else {
                    this.f.getClass();
                    return d6.h.a();
                }
            }
        } else {
            android.content.SharedPreferences v0_6 = this.a;
            v0_6.a();
            if ("[DEFAULT]".equals(v0_6.b)) {
            }
        }
        this.f.getClass();
        return d6.h.a();
    }

    public final e6.b g(e6.b p23)
    {
        d6.e v0_0 = p23;
        String v2_13 = p23.a;
        long v5_3 = 0;
        if ((v2_13 != null) && (v2_13.length() == 11)) {
            String v2_2 = ((e6.c) this.e.get());
            long v8_0 = 0;
            while (v8_0 < 4) {
                String v9_0 = e6.c.c[v8_0];
                boolean v10_0 = v2_2.b;
                StringBuilder v11_1 = new StringBuilder("|T|");
                v11_1.append(v10_0);
                v11_1.append("|");
                v11_1.append(v9_0);
                String v9_2 = v2_2.a.getString(v11_1.toString(), 0);
                if ((v9_2 == null) || (v9_2.isEmpty())) {
                    v8_0++;
                } else {
                    if (!v9_2.startsWith("{")) {
                        v5_3 = v9_2;
                    } else {
                        v5_3 = new org.json.JSONObject(v9_2).getString("token");
                    }
                }
            }
        }
        String v2_3 = this.b;
        java.util.concurrent.TimeUnit v6_1 = this.a;
        v6_1.a();
        java.util.concurrent.TimeUnit v6_3 = v6_1.c.a;
        String v7_4 = p23.a;
        long v8_2 = this.a;
        v8_2.a();
        long v8_4 = v8_2.c.g;
        String v9_3 = this.a;
        v9_3.a();
        String v9_5 = v9_3.c.b;
        StringBuilder v11_2 = v2_3.c;
        if (!v11_2.a()) {
            throw new d6.e("Firebase Installations Service is unavailable. Please try again later.");
        } else {
            String v12_3 = new StringBuilder("projects/");
            v12_3.append(v8_4);
            v12_3.append("/installations");
            String v12_5 = f6.c.a(v12_3.toString());
            int v13_0 = 0;
            while (v13_0 <= 1) {
                android.net.TrafficStats.setThreadStatsTag(32769);
                java.net.HttpURLConnection v15_1 = v2_3.c(v12_5, v6_3);
                try {
                    v15_1.setRequestMethod("POST");
                    v15_1.setDoOutput(1);
                } catch (java.io.IOException) {
                    v15_1.disconnect();
                    android.net.TrafficStats.clearThreadStatsTag();
                    v13_0++;
                }
                if (v5_3 != 0) {
                    v15_1.addRequestProperty("x-goog-fis-android-iid-migration-auth", v5_3);
                }
                int v3_2;
                f6.c.g(v15_1, v7_4, v9_5);
                d6.e v4_6 = v15_1.getResponseCode();
                v11_2.b(v4_6);
                if ((v4_6 < 200) || (v4_6 >= 300)) {
                    v3_2 = 0;
                } else {
                    v3_2 = 1;
                }
                if (v3_2 == 0) {
                    f6.c.b(v15_1, v9_5, v6_3, v8_4);
                    if (v4_6 == 429) {
                        throw new d6.e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    } else {
                        if ((v4_6 < 500) || (v4_6 >= 600)) {
                            android.util.Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            f6.a v16_1 = new f6.a(0, 0, 0, 0, 2);
                            v15_1.disconnect();
                            android.net.TrafficStats.clearThreadStatsTag();
                            v2_3 = v16_1;
                        } else {
                            v15_1.disconnect();
                            android.net.TrafficStats.clearThreadStatsTag();
                        }
                    }
                } else {
                    v2_3 = f6.c.e(v15_1);
                    v15_1.disconnect();
                    android.net.TrafficStats.clearThreadStatsTag();
                }
                int v3_8 = u.e.c(v2_3.e);
                if (v3_8 == 0) {
                    int v3_9 = v2_3.b;
                    d6.e v4_3 = v2_3.c;
                    long v5_0 = this.d;
                    v5_0.getClass();
                    v5_0.a.getClass();
                    long v5_2 = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    String v2_4 = v2_3.d;
                    String v7_2 = v2_4.a;
                    long v8_1 = v2_4.b;
                    d6.e v0_1 = v0_0.a();
                    v0_1.a = v3_9;
                    v0_1.b = 4;
                    v0_1.c = v7_2;
                    v0_1.d = v4_3;
                    v0_1.e = v8_1;
                    String v2_7 = ((byte) (v0_1.h | 1));
                    v0_1.f = v5_2;
                    v0_1.h = ((byte) (v2_7 | 2));
                    return v0_1.a();
                } else {
                    if (v3_8 != 1) {
                        throw new d6.e("Firebase Installations Service is unavailable. Please try again later.");
                    } else {
                        d6.e v0_5 = v0_0.a();
                        v0_5.g = "BAD CONFIG";
                        v0_5.b = 5;
                        return v0_5.a();
                    }
                }
            }
            throw new d6.e("Firebase Installations Service is unavailable. Please try again later.");
        }
    }

    public final void h(Exception p4)
    {
        java.util.Iterator v1_1 = this.l.iterator();
        while (v1_1.hasNext()) {
            if (((d6.i) v1_1.next()).b(p4)) {
                v1_1.remove();
            }
        }
        return;
    }

    public final void i(e6.b p4)
    {
        java.util.Iterator v1_1 = this.l.iterator();
        while (v1_1.hasNext()) {
            if (((d6.i) v1_1.next()).a(p4)) {
                v1_1.remove();
            }
        }
        return;
    }
}
