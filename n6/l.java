package n6;
public final class l {
    public static final int[] s;
    public static final java.util.regex.Pattern t;
    public final java.util.LinkedHashSet a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public java.net.HttpURLConnection f;
    public n6.c g;
    public final java.util.concurrent.ScheduledExecutorService h;
    public final n6.i i;
    public final q4.f j;
    public final d6.d k;
    public final n6.d l;
    public final android.content.Context m;
    public final String n;
    public final java.util.Random o;
    public final com.google.android.gms.common.util.Clock p;
    public final n6.n q;
    public final Object r;

    static l()
    {
        java.util.regex.Pattern v0_1 = new int[8];
        v0_1 = {2, 4, 8, 16, 32, 64, 128, 256};
        n6.l.s = v0_1;
        n6.l.t = java.util.regex.Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
        return;
    }

    public l(q4.f p2, d6.d p3, n6.i p4, n6.d p5, android.content.Context p6, java.util.LinkedHashSet p7, n6.n p8, java.util.concurrent.ScheduledExecutorService p9)
    {
        this.a = p7;
        this.b = 0;
        this.h = p9;
        this.o = new java.util.Random();
        this.c = Math.max((8 - p8.c().a), 1);
        this.p = com.google.android.gms.common.util.DefaultClock.getInstance();
        this.j = p2;
        this.i = p4;
        this.k = p3;
        this.l = p5;
        this.m = p6;
        this.n = "firebase";
        this.q = p8;
        this.d = 0;
        this.e = 0;
        this.r = new Object();
        return;
    }

    public static boolean d(int p1)
    {
        if ((p1 != 408) && ((p1 != 429) && ((p1 != 502) && ((p1 != 503) && (p1 != 504))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String f(java.io.InputStream p3)
    {
        StringBuilder v0_1 = new StringBuilder();
        try {
            java.io.BufferedReader v1_1 = new java.io.BufferedReader(new java.io.InputStreamReader(p3));
        } catch (java.io.IOException) {
            if (v0_1.length() != 0) {
                return v0_1.toString();
            } else {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        while(true) {
            String v3_4 = v1_1.readLine();
            if (v3_4 == null) {
                break;
            }
            v0_1.append(v3_4);
        }
        return v0_1.toString();
    }

    public final declared_synchronized boolean a()
    {
        if ((this.a.isEmpty()) || ((this.b) || ((this.d) || (this.e)))) {
            int v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        return v0_2;
    }

    public final void b(java.io.InputStream p3, java.io.InputStream p4)
    {
        String v0_0 = this.f;
        if ((v0_0 != null) && (!this.e)) {
            v0_0.disconnect();
        }
        if (p3 != null) {
            try {
                p3.close();
            } catch (java.io.IOException v3_2) {
                android.util.Log.d("FirebaseRemoteConfig", "Error closing connection stream.", v3_2);
            }
        }
        if (p4 != null) {
            try {
                p4.close();
            } catch (java.io.IOException v3_1) {
                android.util.Log.d("FirebaseRemoteConfig", "Error closing connection stream.", v3_1);
            }
        }
        return;
    }

    public final String c(String p4)
    {
        String v0_1;
        String v0_0 = this.j;
        v0_0.a();
        String v0_5 = n6.l.t.matcher(v0_0.c.b);
        if (!v0_5.matches()) {
            v0_1 = 0;
        } else {
            v0_1 = v0_5.group(1);
        }
        StringBuilder v1_2 = new StringBuilder("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/");
        v1_2.append(v0_1);
        v1_2.append("/namespaces/");
        v1_2.append(p4);
        v1_2.append(":streamFetchInvalidations");
        return v1_2.toString();
    }

    public final declared_synchronized void e(long p4)
    {
        if (this.a()) {
            java.util.concurrent.ScheduledExecutorService v0_3 = this.c;
            if (v0_3 <= null) {
                if (!this.e) {
                    new m6.c("Unable to connect to the server. Check your connection and try again.");
                    this.g();
                }
            } else {
                this.c = (v0_3 - 1);
                this.h.schedule(new a2.l(this, 7), p4, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            return;
        } else {
            return;
        }
    }

    public final declared_synchronized void g()
    {
        Throwable v0_1 = this.a.iterator();
        while (v0_1.hasNext()) {
            ((n6.k) v0_1.next()).a();
        }
        return;
    }

    public final declared_synchronized void h()
    {
        this.e(Math.max(0, (this.q.c().b.getTime() - new java.util.Date(this.p.currentTimeMillis()).getTime())));
        return;
    }

    public final void i(java.net.HttpURLConnection p7, String p8, String p9)
    {
        p7.setRequestMethod("POST");
        p7.setRequestProperty("X-Goog-Firebase-Installations-Auth", p9);
        java.io.BufferedOutputStream v9_3 = this.j;
        v9_3.a();
        String v0_2 = v9_3.c;
        p7.setRequestProperty("X-Goog-Api-Key", v0_2.a);
        java.util.HashMap v1_0 = this.m;
        p7.setRequestProperty("X-Android-Package", v1_0.getPackageName());
        long v4_0 = 0;
        try {
            StringBuilder v5_1 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(v1_0, v1_0.getPackageName());
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            String v3_6 = new StringBuilder("No such package: ");
            v3_6.append(v1_0.getPackageName());
            android.util.Log.i("FirebaseRemoteConfig", v3_6.toString());
            v1_0 = 0;
            p7.setRequestProperty("X-Android-Cert", v1_0);
            p7.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
            p7.setRequestProperty("X-Accept-Response-Streaming", "true");
            p7.setRequestProperty("Content-Type", "application/json");
            p7.setRequestProperty("Accept", "application/json");
            java.util.HashMap v1_8 = new java.util.HashMap();
            v9_3.a();
            String v2_7 = n6.l.t.matcher(v0_2.b);
            if (v2_7.matches()) {
                v4_0 = v2_7.group(1);
            }
            v1_8.put("project", v4_0);
            v1_8.put("namespace", this.n);
            v1_8.put("lastKnownVersionNumber", Long.toString(this.i.h.a.getLong("last_template_version", 0)));
            v9_3.a();
            v1_8.put("appId", v0_2.b);
            v1_8.put("sdkVersion", "23.0.1");
            v1_8.put("appInstanceId", p8);
            byte[] v8_1 = new org.json.JSONObject(v1_8).toString().getBytes("utf-8");
            java.io.BufferedOutputStream v9_2 = new java.io.BufferedOutputStream(p7.getOutputStream());
            v9_2.write(v8_1);
            v9_2.flush();
            v9_2.close();
            return;
        }
        if (v5_1 != null) {
            v1_0 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(v5_1, 0);
        } else {
            StringBuilder v5_3 = new StringBuilder("Could not get fingerprint hash for package: ");
            v5_3.append(v1_0.getPackageName());
            android.util.Log.e("FirebaseRemoteConfig", v5_3.toString());
        }
    }

    public final declared_synchronized n6.c j(java.net.HttpURLConnection p9)
    {
        return new n6.c(p9, this.i, this.l, this.a, new n6.k(this), this.h, this.q);
    }

    public final void k(java.util.Date p9)
    {
        n6.n v0 = this.q;
        int v1_2 = (v0.c().a + 1);
        java.util.Date v2_7 = 8;
        if (v1_2 < 8) {
            v2_7 = v1_2;
        }
        java.util.Date v2_1 = java.util.concurrent.TimeUnit.MINUTES.toMillis(((long) n6.l.s[(v2_7 - 1)]));
        v0.e(v1_2, new java.util.Date((p9.getTime() + ((v2_1 / 2) + ((long) this.o.nextInt(((int) v2_1)))))));
        return;
    }
}
