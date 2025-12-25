package n6;
public final class c {
    public final java.util.LinkedHashSet a;
    public final java.net.HttpURLConnection b;
    public final n6.i c;
    public final n6.d d;
    public final n6.k e;
    public final java.util.concurrent.ScheduledExecutorService f;
    public final java.util.Random g;
    public final com.google.android.gms.common.util.Clock h;
    public final n6.n i;
    public boolean j;

    public c(java.net.HttpURLConnection p1, n6.i p2, n6.d p3, java.util.LinkedHashSet p4, n6.k p5, java.util.concurrent.ScheduledExecutorService p6, n6.n p7)
    {
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.a = p4;
        this.e = p5;
        this.f = p6;
        this.g = new java.util.Random();
        this.j = 0;
        this.i = p7;
        this.h = com.google.android.gms.common.util.DefaultClock.getInstance();
        return;
    }

    public final void a(int p3, long p4)
    {
        if (p3 != 0) {
            this.f.schedule(new n6.b(this, p3, p4), ((long) this.g.nextInt(4)), java.util.concurrent.TimeUnit.SECONDS);
            return;
        } else {
            new m6.f("Unable to fetch the latest version of the template.");
            this.d();
            return;
        }
    }

    public final void b(java.io.InputStream p7)
    {
        java.io.BufferedReader v0_1 = new java.io.BufferedReader(new java.io.InputStreamReader(p7, "utf-8"));
        int v7_1 = "";
        while(true) {
            m6.f v1_7 = v0_1.readLine();
            if (v1_7 == null) {
                break;
            }
            v7_1 = g2.g.d(v7_1, v1_7);
            if (v1_7.contains("}")) {
                long v2_2 = v7_1.indexOf(123);
                long v3_1 = v7_1.lastIndexOf(125);
                if ((v2_2 >= 0) && ((v3_1 >= 0) && (v2_2 < v3_1))) {
                    v7_1 = v7_1.substring(v2_2, (v3_1 + 1));
                } else {
                    v7_1 = "";
                }
                if (!v7_1.isEmpty()) {
                    m6.f v1_6 = new org.json.JSONObject(v7_1);
                    if ((!v1_6.has("featureDisabled")) || (!v1_6.getBoolean("featureDisabled"))) {
                        if (!this.a.isEmpty()) {
                            if (v1_6.has("latestTemplateVersionNumber")) {
                                long v2_5 = this.c.h.a.getLong("last_template_version", 0);
                                long v4 = v1_6.getLong("latestTemplateVersionNumber");
                                if (v4 > v2_5) {
                                    this.a(3, v4);
                                }
                            }
                            if (!v1_6.has("retryIntervalSeconds")) {
                                v7_1 = "";
                            } else {
                                this.e(v1_6.getInt("retryIntervalSeconds"));
                            }
                        } else {
                            break;
                        }
                    } else {
                        int v7_21 = this.e;
                        new m6.f("The server is temporarily unavailable. Try again in a few minutes.");
                        v7_21.a();
                        break;
                    }
                }
            }
        }
        v0_1.close();
        return;
    }

    public final void c()
    {
        java.io.IOException v2_1 = this.b;
        if (v2_1 != null) {
            try {
                java.io.IOException v3_1 = v2_1.getInputStream();
                this.b(v3_1);
            } catch (java.io.IOException v2_3) {
                if (!this.j) {
                    android.util.Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", v2_3);
                }
                if (v3_1 != null) {
                    v3_1.close();
                }
            } catch (java.io.IOException v2_0) {
                if (v3_1 != null) {
                    try {
                        v3_1.close();
                    } catch (java.io.IOException v3_0) {
                        android.util.Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", v3_0);
                    }
                }
                throw v2_0;
            } catch (java.io.IOException v2_2) {
                android.util.Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", v2_2);
            }
            if (v3_1 != null) {
                v3_1.close();
                return;
            }
        }
        return;
    }

    public final declared_synchronized void d()
    {
        Throwable v0_1 = this.a.iterator();
        while (v0_1.hasNext()) {
            ((n6.k) v0_1.next()).a();
        }
        return;
    }

    public final declared_synchronized void e(int p6)
    {
        try {
        } catch (Throwable v6_4) {
            throw v6_4;
        }
        this.i.a.edit().putLong("realtime_backoff_end_time_in_millis", new java.util.Date((new java.util.Date(this.h.currentTimeMillis()).getTime() + (((long) p6) * 1000))).getTime()).apply();
        return;
    }
}
