package b8;
public final class g implements d4.c, e5.b, e5.a, t2.b, t6.b {
    public static b8.g e;
    public final synthetic int a;
    public Object b;
    public Object c;
    public Object d;

    public synthetic g(int p1)
    {
        this.a = p1;
        return;
    }

    public g(android.content.Context p2, android.content.res.TypedArray p3)
    {
        this.a = 8;
        this.b = p2;
        this.c = p3;
        return;
    }

    public g(android.content.Context p2, android.location.LocationManager p3)
    {
        this.a = 4;
        this.d = new h.k0();
        this.b = p2;
        this.c = p3;
        return;
    }

    public g(com.google.firebase.messaging.FirebaseMessagingService p2, j6.o p3, java.util.concurrent.ExecutorService p4)
    {
        this.a = 5;
        this.b = p4;
        this.c = p2;
        this.d = p3;
        return;
    }

    public g(j6.s p8, a6.e p9, g1.d p10, java.util.Set p11)
    {
        this.a = 3;
        this.b = p9;
        this.c = p8;
        this.d = p10;
        if (!p11.isEmpty()) {
            java.util.Iterator v8_1 = p11.iterator();
            while (v8_1.hasNext()) {
                int v9_3 = ((int[]) v8_1.next());
                String v1_1 = new String(v9_3, 0, v9_3.length);
                this.q(v1_1, 0, v1_1.length(), 1, 1, new d4.l(v1_1, 1, 0));
            }
        }
        return;
    }

    public synthetic g(Object p1, Object p2, Object p3, int p4)
    {
        this.a = p4;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        return;
    }

    public g(String p4)
    {
        this.a = 6;
        k2.c v0_2 = new k2.c(29, 0);
        this.c = v0_2;
        this.d = v0_2;
        this.b = p4;
        return;
    }

    public g(String p2, java.util.HashMap p3)
    {
        this.a = 7;
        this.b = p2;
        this.c = p3;
        this.d = new java.util.HashMap();
        return;
    }

    public g(java.util.regex.Matcher p2, CharSequence p3)
    {
        this.a = 0;
        kotlin.jvm.internal.j.e(p3, "input");
        this.b = p2;
        this.c = new b8.f(this);
        return;
    }

    public g(l6.c p2)
    {
        this.a = 2;
        this.c = new Object();
        this.b = p2;
        return;
    }

    public g(r3.b p3, android.view.View p4)
    {
        int v0_1;
        this.a = 13;
        int v0_3 = android.os.Build$VERSION.SDK_INT;
        if (v0_3 < 34) {
            if (v0_3 < 33) {
                v0_1 = 0;
            } else {
                v0_1 = new r3.c();
            }
        } else {
            v0_1 = new r3.e();
        }
        this.b = v0_1;
        this.c = p3;
        this.d = p4;
        return;
    }

    public g(w.e p2)
    {
        this.a = 20;
        this.b = new java.util.ArrayList();
        this.c = new x.b();
        this.d = p2;
        return;
    }

    public static String b(String p6, java.util.HashMap p7)
    {
        boolean v1_0;
        boolean v0_1 = new StringBuilder();
        String v7_3 = p7.entrySet().iterator();
        boolean v1_11 = ((java.util.Map$Entry) v7_3.next());
        v0_1.append(((String) v1_11.getKey()));
        v0_1.append("=");
        if (v1_11.getValue() == null) {
            v1_0 = "";
        } else {
            v1_0 = java.net.URLEncoder.encode(((String) v1_11.getValue()), "UTF-8");
        }
        v0_1.append(v1_0);
        while (v7_3.hasNext()) {
            boolean v1_7;
            boolean v1_6 = ((java.util.Map$Entry) v7_3.next());
            v0_1.append("&");
            v0_1.append(((String) v1_6.getKey()));
            v0_1.append("=");
            if (v1_6.getValue() == null) {
                v1_7 = "";
            } else {
                v1_7 = java.net.URLEncoder.encode(((String) v1_6.getValue()), "UTF-8");
            }
            v0_1.append(v1_7);
        }
        String v7_2 = v0_1.toString();
        if (!v7_2.isEmpty()) {
            if (!p6.contains("?")) {
                return g2.g.e(p6, "?", v7_2);
            } else {
                if (!p6.endsWith("&")) {
                    v7_2 = "&".concat(v7_2);
                }
                return g2.g.d(p6, v7_2);
            }
        } else {
            return p6;
        }
    }

    public static boolean c(android.text.Editable p6, android.view.KeyEvent p7, boolean p8)
    {
        if (android.view.KeyEvent.metaStateHasNoModifiers(p7.getMetaState())) {
            int v7_3 = android.text.Selection.getSelectionStart(p6);
            g1.v[] v1_2 = android.text.Selection.getSelectionEnd(p6);
            if ((v7_3 != -1) && ((v1_2 != -1) && (v7_3 == v1_2))) {
                g1.v[] v1_1 = ((g1.v[]) p6.getSpans(v7_3, v1_2, g1.v));
                if ((v1_1 != null) && (v1_1.length > 0)) {
                    int v2_3 = v1_1.length;
                    int v3 = 0;
                    while (v3 < v2_3) {
                        int v4_0 = v1_1[v3];
                        int v5 = p6.getSpanStart(v4_0);
                        int v4_1 = p6.getSpanEnd(v4_0);
                        if (((!p8) || (v5 != v7_3)) && (((p8) || (v4_1 != v7_3)) && ((v7_3 <= v5) || (v7_3 >= v4_1)))) {
                            v3++;
                        } else {
                            p6.delete(v5, v4_1);
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static b8.g p(android.content.Context p2, android.util.AttributeSet p3, int[] p4, int p5)
    {
        return new b8.g(p2, p2.obtainStyledAttributes(p3, p4, p5, 0));
    }

    public r2.j a()
    {
        String v0_2;
        if (((String) this.b) != null) {
            v0_2 = "";
        } else {
            v0_2 = " backendName";
        }
        if (((o2.d) this.d) == null) {
            v0_2 = v0_2.concat(" priority");
        }
        if (!v0_2.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(v0_2));
        } else {
            return new r2.j(((String) this.b), ((byte[]) this.c), ((o2.d) this.d));
        }
    }

    public void d(android.os.Bundle p2, String p3)
    {
        java.util.concurrent.CountDownLatch v2_1 = ((java.util.concurrent.CountDownLatch) this.d);
        if ((v2_1 != null) && ("_ae".equals(p3))) {
            v2_1.countDown();
        }
        return;
    }

    public void e(Object p5, java.io.ByteArrayOutputStream p6)
    {
        String v1_2 = ((java.util.HashMap) this.b);
        StringBuilder v0_3 = new w5.f(p6, v1_2, ((java.util.HashMap) this.c), ((t5.d) this.d));
        if (p5 != null) {
            t5.b v6_3 = ((t5.d) v1_2.get(p5.getClass()));
            if (v6_3 == null) {
                StringBuilder v0_2 = new StringBuilder("No encoder for ");
                v0_2.append(p5.getClass());
                throw new t5.b(v0_2.toString());
            } else {
                v6_3.a(p5, v0_3);
                return;
            }
        } else {
            return;
        }
    }

    public h.f f()
    {
        h5.f.b();
        String v2_0 = 0;
        try {
            try {
                java.io.InputStream v3_0 = b8.g.b(((String) this.b), ((java.util.HashMap) this.c));
                char[] v4_1 = new StringBuilder("GET Request URL: ");
                v4_1.append(v3_0);
                Throwable v1_1 = v4_1.toString();
                try {
                    if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                        android.util.Log.v("FirebaseCrashlytics", v1_1, 0);
                    }
                } catch (h.f v0_1) {
                    Throwable v1_2 = v0_1;
                    h.f v0_5 = 0;
                    if (v2_0 != null) {
                        v2_0.close();
                    }
                    if (v0_5 != null) {
                        v0_5.disconnect();
                    }
                    throw v1_2;
                }
                v0_5 = ((javax.net.ssl.HttpsURLConnection) new java.net.URL(v3_0).openConnection());
                v0_5.setReadTimeout(10000);
                v0_5.setConnectTimeout(10000);
                v0_5.setRequestMethod("GET");
                Throwable v1_8 = ((java.util.HashMap) this.d).entrySet().iterator();
                while (v1_8.hasNext()) {
                    java.io.InputStream v3_6 = ((java.util.Map$Entry) v1_8.next());
                    v0_5.addRequestProperty(((String) v3_6.getKey()), ((String) v3_6.getValue()));
                }
                v0_5.connect();
                Throwable v1_9 = v0_5.getResponseCode();
                java.io.InputStream v3_3 = v0_5.getInputStream();
                if (v3_3 != null) {
                    try {
                        String v2_2 = new java.io.BufferedReader(new java.io.InputStreamReader(v3_3, "UTF-8"));
                        char[] v4_7 = new char[8192];
                        StringBuilder v5_2 = new StringBuilder();
                    } catch (Throwable v1_2) {
                        v2_0 = v3_3;
                    }
                    while(true) {
                        int v6 = v2_2.read(v4_7);
                        if (v6 == -1) {
                            break;
                        }
                        v5_2.append(v4_7, 0, v6);
                    }
                    v2_0 = v5_2.toString();
                }
                if (v3_3 != null) {
                    v3_3.close();
                }
                v0_5.disconnect();
                return new h.f(v1_9, v2_0);
            } catch (Throwable v1_2) {
            }
        } catch (h.f v0_1) {
        }
    }

    public void g(android.os.Bundle p7)
    {
        String v2_0 = d5.d.a;
        long v3_4 = new StringBuilder("Logging event _ae to Firebase Analytics with params ");
        v3_4.append(p7);
        v2_0.c(v3_4.toString());
        this.d = new java.util.concurrent.CountDownLatch(1);
        ((l6.c) this.b).g(p7);
        v2_0.c("Awaiting app exception callback from Analytics...");
        Throwable v7_2 = 0;
        if (!((java.util.concurrent.CountDownLatch) this.d).await(((long) 500), java.util.concurrent.TimeUnit.MILLISECONDS)) {
            v2_0.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", 0);
            this.d = v7_2;
            return;
        } else {
            v2_0.c("App exception callback received from Analytics listener.");
            this.d = v7_2;
            return;
        }
    }

    public Object get()
    {
        switch (this.a) {
            case 12:
                return new r2.r(new c5.c(), new a6.e(), ((w2.b) ((a2.b) this.b).get()), ((o5.d) ((m5.c) this.c).get()), ((j6.s) ((j6.s) this.d).get()));
            case 14:
                l7.h v0_5 = ((android.content.Context) ((k4.i) this.b).b);
                r6.g1 v1_5 = ((l7.h) ((g7.a) this.c).get());
                a1.h v2_7 = ((r6.i0) ((t6.c) this.d).get());
                kotlin.jvm.internal.j.e(v0_5, "appContext");
                kotlin.jvm.internal.j.e(v1_5, "blockingDispatcher");
                kotlin.jvm.internal.j.e(v2_7, "sessionDataSerializer");
                return r6.q.b(v2_7, new l6.c(new a6.i(v2_7, 5), 7), d8.f0.b(v1_5), new r6.p(v0_5, 1));
            case 17:
                return new u6.o(((l7.h) ((g7.a) this.b).get()), ((r6.g1) ((g7.a) this.c).get()), ((a1.h) ((t6.c) this.d).get()));
            default:
                return new b8.g(((android.content.Context) ((g7.a) this.b).get()), ((y2.d) ((g7.a) this.c).get()), ((x2.b) ((v3.f) this.d).get()), 21);
        }
    }

    public android.content.res.ColorStateList h(int p4)
    {
        android.content.res.TypedArray v0_1 = ((android.content.res.TypedArray) this.c);
        if (v0_1.hasValue(p4)) {
            android.content.res.ColorStateList v1_3 = v0_1.getResourceId(p4, 0);
            if (v1_3 != null) {
                android.content.res.ColorStateList v1_0 = e0.c.getColorStateList(((android.content.Context) this.b), v1_3);
                if (v1_0 != null) {
                    return v1_0;
                }
            }
        }
        return v0_1.getColorStateList(p4);
    }

    public android.graphics.drawable.Drawable i(int p3)
    {
        android.content.res.TypedArray v0_1 = ((android.content.res.TypedArray) this.c);
        if (v0_1.hasValue(p3)) {
            int v1_2 = v0_1.getResourceId(p3, 0);
            if (v1_2 != 0) {
                return j5.t1.A(((android.content.Context) this.b), v1_2);
            }
        }
        return v0_1.getDrawable(p3);
    }

    public android.graphics.drawable.Drawable j(int p5)
    {
        if (((android.content.res.TypedArray) this.c).hasValue(p5)) {
            Throwable v5_4 = ((android.content.res.TypedArray) this.c).getResourceId(p5, 0);
            if (v5_4 != null) {
                return n.u.a().a.d(((android.content.Context) this.b), v5_4, 1);
            }
        }
        return 0;
    }

    public android.graphics.Typeface k(int p10, int p11, n.t0 p12)
    {
        int v3 = ((android.content.res.TypedArray) this.c).getResourceId(p10, 0);
        if (v3 != 0) {
            if (((android.util.TypedValue) this.d) == null) {
                this.d = new android.util.TypedValue();
            }
            android.content.Context v2_1 = ((android.content.Context) this.b);
            if (!v2_1.isRestricted()) {
                return g0.m.a(v2_1, v3, ((android.util.TypedValue) this.d), p11, p12, 1, 0);
            }
        }
        return 0;
    }

    public boolean l()
    {
        if (!((j6.o) this.d).s("gcm.n.noui")) {
            android.app.NotificationManager v0_134 = ((com.google.firebase.messaging.FirebaseMessagingService) this.c);
            if (!((android.app.KeyguardManager) v0_134.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()) {
                    android.os.SystemClock.sleep(10);
                }
                android.app.Notification v3_5 = android.os.Process.myPid();
                android.app.NotificationManager v0_36 = ((android.app.ActivityManager) v0_134.getSystemService("activity")).getRunningAppProcesses();
                if (v0_36 != null) {
                    android.app.NotificationManager v0_46 = v0_36.iterator();
                    while (v0_46.hasNext()) {
                        String v5_9 = ((android.app.ActivityManager$RunningAppProcessInfo) v0_46.next());
                        if (v5_9.pid == v3_5) {
                            if (v5_9.importance != 100) {
                                break;
                            }
                            return 0;
                        }
                    }
                }
            }
            android.app.Notification v3_10;
            android.app.NotificationManager v0_79 = ((j6.o) this.d).A("gcm.n.image");
            if (!android.text.TextUtils.isEmpty(v0_79)) {
                try {
                    v3_10 = new j6.n(new java.net.URL(v0_79));
                } catch (java.net.MalformedURLException) {
                    android.app.Notification v3_12 = new StringBuilder("Not downloading image, bad URL: ");
                    v3_12.append(v0_79);
                    android.util.Log.w("FirebaseMessaging", v3_12.toString());
                    v3_10 = 0;
                }
            }
            if (v3_10 != null) {
                android.app.NotificationManager v0_128 = ((java.util.concurrent.ExecutorService) this.b);
                int v7_17 = new com.google.android.gms.tasks.TaskCompletionSource();
                v3_10.b = v0_128.submit(new a5.i(12, v3_10, v7_17));
                v3_10.c = v7_17.getTask();
            }
            int v7_19 = ((com.google.firebase.messaging.FirebaseMessagingService) this.c);
            int v8_4 = ((j6.o) this.d);
            try {
                android.app.NotificationManager v0_2;
                android.app.NotificationManager v0_136 = v7_19.getPackageManager().getApplicationInfo(v7_19.getPackageName(), 128);
            } catch (android.app.NotificationManager v0_137) {
                android.os.Bundle v10_3 = new StringBuilder("Couldn\'t get own application info: ");
                v10_3.append(v0_137);
                android.util.Log.w("FirebaseMessaging", v10_3.toString());
                v0_2 = android.os.Bundle.EMPTY;
                android.os.Bundle v10_0 = v0_2;
                android.app.NotificationManager v0_4 = v8_4.A("gcm.n.android_channel_id");
                try {
                    if (v7_19.getPackageManager().getApplicationInfo(v7_19.getPackageName(), 0).targetSdkVersion >= 26) {
                        String v12_5 = ((android.app.NotificationManager) v7_19.getSystemService(android.app.NotificationManager));
                        if (!android.text.TextUtils.isEmpty(v0_4)) {
                            if (v12_5.getNotificationChannel(v0_4) == null) {
                                String v13_5 = new StringBuilder("Notification Channel requested (");
                                v13_5.append(v0_4);
                                v13_5.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                                android.util.Log.w("FirebaseMessaging", v13_5.toString());
                            } else {
                            }
                        }
                        v0_4 = v10_0.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (android.text.TextUtils.isEmpty(v0_4)) {
                            android.util.Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else {
                            if (v12_5.getNotificationChannel(v0_4) == null) {
                                android.util.Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                            } else {
                            }
                        }
                        v0_4 = "fcm_fallback_notification_channel";
                        if (v12_5.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            String v5_2;
                            String v5_1 = v7_19.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", v7_19.getPackageName());
                            if (v5_1 != null) {
                                v5_2 = v7_19.getString(v5_1);
                            } else {
                                android.util.Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                v5_2 = "Misc";
                            }
                            v12_5.createNotificationChannel(new android.app.NotificationChannel("fcm_fallback_notification_channel", v5_2, 3));
                        }
                    } else {
                        v0_4 = 0;
                    }
                } catch (android.content.pm.PackageManager$NameNotFoundException) {
                }
                String v5_4 = j6.e.a;
                String v12_6 = v7_19.getPackageName();
                String v13_12 = v7_19.getResources();
                java.util.Iterator v14_2 = v7_19.getPackageManager();
                String v15_2 = new d0.p(v7_19, v0_4);
                android.app.NotificationManager v0_11 = v8_4.z(v12_6, v13_12, "gcm.n.title");
                if (!android.text.TextUtils.isEmpty(v0_11)) {
                    v15_2.e = d0.p.b(v0_11);
                }
                android.app.NotificationManager v0_14 = v8_4.z(v12_6, v13_12, "gcm.n.body");
                if (!android.text.TextUtils.isEmpty(v0_14)) {
                    v15_2.f = d0.p.b(v0_14);
                    android.content.Intent v11_3 = new d0.n();
                    v11_3.b = d0.p.b(v0_14);
                    v15_2.d(v11_3);
                }
                android.content.Intent v11_6;
                android.app.NotificationManager v0_18 = v8_4.A("gcm.n.icon");
                if (android.text.TextUtils.isEmpty(v0_18)) {
                    String v2_1 = v10_0.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if ((v2_1 == null) || (!j6.e.a(v13_12, v2_1))) {
                        try {
                            v2_1 = v14_2.getApplicationInfo(v12_6, 0).icon;
                        } catch (android.app.NotificationManager v0_24) {
                            android.content.Intent v11_11 = new StringBuilder("Couldn\'t get own application info: ");
                            v11_11.append(v0_24);
                            android.util.Log.w("FirebaseMessaging", v11_11.toString());
                        }
                    }
                    if ((v2_1 != null) && (j6.e.a(v13_12, v2_1))) {
                        v11_6 = v2_1;
                    } else {
                        v11_6 = 17301651;
                    }
                } else {
                    v11_6 = v13_12.getIdentifier(v0_18, "drawable", v12_6);
                    if ((v11_6 == null) || (!j6.e.a(v13_12, v11_6))) {
                        v11_6 = v13_12.getIdentifier(v0_18, "mipmap", v12_6);
                        if ((v11_6 == null) || (!j6.e.a(v13_12, v11_6))) {
                            android.content.Intent v11_9 = new StringBuilder("Icon resource ");
                            v11_9.append(v0_18);
                            v11_9.append(" not found. Notification will use default icon.");
                            android.util.Log.w("FirebaseMessaging", v11_9.toString());
                        }
                    }
                }
                v15_2.s.icon = v11_6;
                android.app.NotificationManager v0_30 = v8_4.A("gcm.n.sound2");
                if (android.text.TextUtils.isEmpty(v0_30)) {
                    v0_30 = v8_4.A("gcm.n.sound");
                }
                android.app.NotificationManager v0_34;
                if (!android.text.TextUtils.isEmpty(v0_30)) {
                    if (("default".equals(v0_30)) || (v13_12.getIdentifier(v0_30, "raw", v12_6) == 0)) {
                        v0_34 = android.media.RingtoneManager.getDefaultUri(2);
                    } else {
                        String v2_9 = new StringBuilder("android.resource://");
                        v2_9.append(v12_6);
                        v2_9.append("/raw/");
                        v2_9.append(v0_30);
                        v0_34 = android.net.Uri.parse(v2_9.toString());
                    }
                } else {
                    v0_34 = 0;
                }
                if (v0_34 != null) {
                    String v13_13 = v15_2.s;
                    v13_13.sound = v0_34;
                    v13_13.audioStreamType = -1;
                    v13_13.audioAttributes = d0.o.a(d0.o.d(d0.o.c(d0.o.b(), 4), 5));
                }
                android.content.Intent v11_19;
                android.app.NotificationManager v0_42 = v8_4.A("gcm.n.click_action");
                if (android.text.TextUtils.isEmpty(v0_42)) {
                    android.app.NotificationManager v0_44 = v8_4.A("gcm.n.link_android");
                    if (android.text.TextUtils.isEmpty(v0_44)) {
                        v0_44 = v8_4.A("gcm.n.link");
                    }
                    android.app.NotificationManager v0_47;
                    if (android.text.TextUtils.isEmpty(v0_44)) {
                        v0_47 = 0;
                    } else {
                        v0_47 = android.net.Uri.parse(v0_44);
                    }
                    if (v0_47 == null) {
                        v11_19 = v14_2.getLaunchIntentForPackage(v12_6);
                        if (v11_19 == null) {
                            android.util.Log.w("FirebaseMessaging", "No activity found to launch app");
                        }
                    } else {
                        v11_19 = new android.content.Intent("android.intent.action.VIEW");
                        v11_19.setPackage(v12_6);
                        v11_19.setData(v0_47);
                    }
                } else {
                    v11_19 = new android.content.Intent(v0_42);
                    v11_19.setPackage(v12_6);
                    v11_19.setFlags(268435456);
                }
                String v2_15;
                if (v11_19 != null) {
                    v11_19.addFlags(67108864);
                    java.util.Iterator v14_4 = ((android.os.Bundle) v8_4.b);
                    String v13_17 = new android.os.Bundle(v14_4);
                    java.util.Iterator v14_6 = v14_4.keySet().iterator();
                    while (v14_6.hasNext()) {
                        String v2_17 = ((String) v14_6.next());
                        if ((v2_17.startsWith("google.c.")) || ((v2_17.startsWith("gcm.n.")) || (v2_17.startsWith("gcm.notification.")))) {
                            v13_17.remove(v2_17);
                        }
                        android.app.Notification v9 = 2;
                    }
                    v11_19.putExtras(v13_17);
                    if (v8_4.s("google.c.a.e")) {
                        v11_19.putExtra("gcm.n.analytics_data", v8_4.D());
                    }
                    v2_15 = android.app.PendingIntent.getActivity(v7_19, v5_4.incrementAndGet(), v11_19, 1140850688);
                } else {
                    v2_15 = 0;
                }
                android.app.NotificationManager v0_52;
                v15_2.g = v2_15;
                if (v8_4.s("google.c.a.e")) {
                    v0_52 = android.app.PendingIntent.getBroadcast(v7_19, v5_4.incrementAndGet(), new android.content.Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(v7_19.getPackageName()).putExtra("wrapped_intent", new android.content.Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(v8_4.D())), 1140850688);
                } else {
                    v0_52 = 0;
                }
                if (v0_52 != null) {
                    v15_2.s.deleteIntent = v0_52;
                }
                android.app.NotificationManager v0_55;
                android.app.NotificationManager v0_54 = v8_4.A("gcm.n.color");
                if (android.text.TextUtils.isEmpty(v0_54)) {
                    android.app.NotificationManager v0_59 = v10_0.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (v0_59 != null) {
                        try {
                            v0_55 = Integer.valueOf(e0.c.getColor(v7_19, v0_59));
                        } catch (android.content.res.Resources$NotFoundException) {
                            android.util.Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        }
                        if (v0_55 != null) {
                            v15_2.o = v0_55.intValue();
                        }
                        String v2_28 = v15_2.s;
                        if (v8_4.s("gcm.n.sticky")) {
                            v2_28.flags = (v2_28.flags & -17);
                        } else {
                            v2_28.flags = (v2_28.flags | 16);
                        }
                        v15_2.m = v8_4.s("gcm.n.local_only");
                        android.app.NotificationManager v0_74 = v8_4.A("gcm.n.ticker");
                        if (v0_74 != null) {
                            v15_2.s.tickerText = d0.p.b(v0_74);
                        }
                        android.app.NotificationManager v0_77 = v8_4.t("gcm.n.notification_priority");
                        if (v0_77 != null) {
                            if ((v0_77.intValue() < -2) || (v0_77.intValue() > 2)) {
                                String v5_15 = new StringBuilder("notificationPriority is invalid ");
                                v5_15.append(v0_77);
                                v5_15.append(". Skipping setting notificationPriority.");
                                android.util.Log.w("FirebaseMessaging", v5_15.toString());
                                v0_77 = 0;
                            }
                        }
                        if (v0_77 != null) {
                            v15_2.j = v0_77.intValue();
                        }
                        android.app.NotificationManager v0_84 = v8_4.t("gcm.n.visibility");
                        if (v0_84 != null) {
                            if ((v0_84.intValue() < -1) || (v0_84.intValue() > 1)) {
                                String v5_19 = new StringBuilder("visibility is invalid: ");
                                v5_19.append(v0_84);
                                v5_19.append(". Skipping setting visibility.");
                                android.util.Log.w("NotificationParams", v5_19.toString());
                                v0_84 = 0;
                            }
                        }
                        if (v0_84 != null) {
                            v15_2.p = v0_84.intValue();
                        }
                        android.app.NotificationManager v0_89 = v8_4.t("gcm.n.notification_count");
                        if (v0_89 != null) {
                            if (v0_89.intValue() < 0) {
                                String v5_23 = new StringBuilder("notificationCount is invalid: ");
                                v5_23.append(v0_89);
                                v5_23.append(". Skipping setting notificationCount.");
                                android.util.Log.w("FirebaseMessaging", v5_23.toString());
                                v0_89 = 0;
                            }
                        }
                        if (v0_89 != null) {
                            v15_2.i = v0_89.intValue();
                        }
                        android.app.NotificationManager v0_93 = v8_4.y();
                        if (v0_93 != null) {
                            v15_2.k = 1;
                            v15_2.s.when = v0_93.longValue();
                        }
                        android.app.NotificationManager v0_95 = v8_4.B();
                        if (v0_95 != null) {
                            v15_2.s.vibrate = v0_95;
                        }
                        android.app.NotificationManager v0_96 = v8_4.v();
                        if (v0_96 != null) {
                            android.app.NotificationManager v0_98;
                            int v7_9 = v0_96[1];
                            android.app.NotificationManager v0_97 = v0_96[2];
                            android.app.Notification v9_14 = v15_2.s;
                            v9_14.ledARGB = v0_96[0];
                            v9_14.ledOnMS = v7_9;
                            v9_14.ledOffMS = v0_97;
                            if ((v7_9 == 0) || (v0_97 == null)) {
                                v0_98 = 0;
                            } else {
                                v0_98 = 1;
                            }
                            v9_14.flags = (v0_98 | (-2 & v9_14.flags));
                        }
                        android.app.NotificationManager v0_101 = v8_4.s("gcm.n.default_sound");
                        if (v8_4.s("gcm.n.default_vibrate_timings")) {
                            v0_101 |= 2;
                        }
                        if (v8_4.s("gcm.n.default_light_settings")) {
                            v0_101 |= 4;
                        }
                        String v2_37 = v15_2.s;
                        v2_37.defaults = v0_101;
                        if ((v0_101 & 4) != 0) {
                            v2_37.flags = (v2_37.flags | 1);
                        }
                        android.app.NotificationManager v0_106 = v8_4.A("gcm.n.tag");
                        if (android.text.TextUtils.isEmpty(v0_106)) {
                            android.app.NotificationManager v0_108 = new StringBuilder("FCM-Notification:");
                            v0_108.append(android.os.SystemClock.uptimeMillis());
                            v0_106 = v0_108.toString();
                        }
                        String v2_40 = v0_106;
                        if (v3_10 != null) {
                            try {
                                int v8_0;
                                int v7_14;
                                android.app.NotificationManager v0_114 = ((android.graphics.Bitmap) com.google.android.gms.tasks.Tasks.await(((com.google.android.gms.tasks.Task) com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_10.c)), 5, java.util.concurrent.TimeUnit.SECONDS));
                                v15_2.c(v0_114);
                                String v5_29 = new d0.m();
                            } catch (android.app.NotificationManager v0_118) {
                                android.app.Notification v3_14 = new StringBuilder("Failed to download image: ");
                                v3_14.append(v0_118.getCause());
                                android.util.Log.w("FirebaseMessaging", v3_14.toString());
                            } catch (java.util.concurrent.ExecutionException) {
                                android.util.Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                v3_10.close();
                                Thread.currentThread().interrupt();
                            } catch (java.util.concurrent.ExecutionException) {
                                android.util.Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                v3_10.close();
                            }
                            if (v0_114 != null) {
                                v8_0 = 1;
                                v7_14 = new androidx.core.graphics.drawable.IconCompat(1);
                                v7_14.b = v0_114;
                            } else {
                                v7_14 = 0;
                                v8_0 = 1;
                            }
                            v5_29.b = v7_14;
                            v5_29.c = 0;
                            v5_29.d = v8_0;
                            v15_2.d(v5_29);
                        }
                        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                            android.util.Log.d("FirebaseMessaging", "Showing notification");
                        }
                        ((android.app.NotificationManager) ((com.google.firebase.messaging.FirebaseMessagingService) this.c).getSystemService("notification")).notify(v2_40, 0, v15_2.a());
                        return 1;
                    }
                    v0_55 = 0;
                } else {
                    try {
                        v0_55 = Integer.valueOf(android.graphics.Color.parseColor(v0_54));
                    } catch (IllegalArgumentException) {
                        String v2_27 = new StringBuilder("Color is invalid: ");
                        v2_27.append(v0_55);
                        v2_27.append(". Notification will use default color.");
                        android.util.Log.w("FirebaseMessaging", v2_27.toString());
                    }
                }
            }
            if (v0_136 == null) {
            } else {
                v0_2 = v0_136.metaData;
                if (v0_2 == null) {
                } else {
                }
            }
        } else {
            return 1;
        }
    }

    public boolean m(CharSequence p8, int p9, int p10, g1.u p11)
    {
        if ((p11.c & 3) == 0) {
            g1.d v0_4 = ((g1.f) this.d);
            StringBuilder v4_4 = p11.b();
            char v5_1 = v4_4.b(8);
            if (v5_1 != 0) {
                ((java.nio.ByteBuffer) v4_4.d).getShort((v5_1 + v4_4.a));
            }
            g1.d v0_2 = ((g1.d) v0_4);
            v0_2.getClass();
            StringBuilder v4_1 = g1.d.b;
            if (v4_1.get() == null) {
                v4_1.set(new StringBuilder());
            }
            StringBuilder v4_3 = ((StringBuilder) v4_1.get());
            v4_3.setLength(0);
            while (p9 < p10) {
                v4_3.append(p8.charAt(p9));
                p9++;
            }
            int v8_3;
            int v9_3 = (p11.c & 4);
            if (!v0_2.a.hasGlyph(v4_3.toString())) {
                v8_3 = (v9_3 | 1);
            } else {
                v8_3 = (v9_3 | 2);
            }
            p11.c = v8_3;
        }
        if ((p11.c & 3) != 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public void n(String p2, String p3)
    {
        ((java.util.HashMap) this.d).put(p2, p3);
        return;
    }

    public boolean o(int p7, w.d p8, z.f p9)
    {
        boolean v7_2;
        x.b v0_1 = ((x.b) this.c);
        int v1_3 = p8.p0;
        int[] v2 = p8.t;
        v0_1.a = v1_3[0];
        v0_1.b = v1_3[1];
        v0_1.c = p8.q();
        v0_1.d = p8.k();
        v0_1.i = 0;
        v0_1.j = p7;
        if (v0_1.a != 3) {
            v7_2 = 0;
        } else {
            v7_2 = 1;
        }
        int v1_4;
        if (v0_1.b != 3) {
            v1_4 = 0;
        } else {
            v1_4 = 1;
        }
        if ((!v7_2) || (p8.W <= 0)) {
            boolean v7_5 = 0;
        } else {
            v7_5 = 1;
        }
        if ((v1_4 == 0) || (p8.W <= 0)) {
            int v1_7 = 0;
        } else {
            v1_7 = 1;
        }
        if ((v7_5) && (v2[0] == 4)) {
            v0_1.a = 1;
        }
        if ((v1_7 != 0) && (v2[1] == 4)) {
            v0_1.b = 1;
        }
        p9.b(p8, v0_1);
        p8.O(v0_1.e);
        p8.L(v0_1.f);
        p8.E = v0_1.h;
        p8.I(v0_1.g);
        v0_1.j = 0;
        return v0_1.i;
    }

    public Object q(CharSequence p17, int p18, int p19, int p20, boolean p21, g1.n p22)
    {
        g1.o v5_0 = new g1.o(((g1.r) ((j6.s) this.c).d));
        int v9 = Character.codePointAt(p17, p18);
        int v10 = 0;
        boolean v11_2 = 1;
        int v6_1 = p18;
        do {
            int v7_2 = v6_1;
            if ((v6_1 >= p19) || ((v10 >= p20) || (!v11_2))) {
                if (((v5_0.a == 2) && ((v5_0.c.b != null) && ((v5_0.f > 1) || (v5_0.b())))) && ((v10 < p20) && ((v11_2) && ((p21) || (!this.m(p17, v7_2, v6_1, v5_0.c.b)))))) {
                    p22.e(p17, v7_2, v6_1, v5_0.c.b);
                }
                return p22.getResult();
            } else {
                int v13_3;
                int v13_1 = v5_0.c.a;
                if (v13_1 != 0) {
                    v13_3 = ((g1.r) v13_1.get(v9));
                } else {
                    v13_3 = 0;
                }
                int v13_9;
                if (v5_0.a == 2) {
                    if (v13_3 == 0) {
                        if (v9 != 65038) {
                            if (v9 != 65039) {
                                int v13_6 = v5_0.c;
                                if (v13_6.b == null) {
                                    v5_0.a();
                                    v13_9 = 1;
                                } else {
                                    if (v5_0.f != 1) {
                                        v5_0.d = v13_6;
                                        v5_0.a();
                                    } else {
                                        if (!v5_0.b()) {
                                            v5_0.a();
                                        } else {
                                            v5_0.d = v5_0.c;
                                            v5_0.a();
                                        }
                                    }
                                    v13_9 = 3;
                                }
                            } else {
                                v13_9 = 2;
                            }
                        } else {
                            v5_0.a();
                        }
                    } else {
                        v5_0.c = v13_3;
                        v5_0.f = (v5_0.f + 1);
                    }
                } else {
                    if (v13_3 != 0) {
                        v5_0.a = 2;
                        v5_0.c = v13_3;
                        v5_0.f = 1;
                    } else {
                        v5_0.a();
                    }
                }
                v5_0.e = v9;
                if (v13_9 == 1) {
                    v6_1 = (Character.charCount(Character.codePointAt(p17, v7_2)) + v7_2);
                    if (v6_1 >= p19) {
                    } else {
                        v9 = Character.codePointAt(p17, v6_1);
                    }
                } else {
                    if (v13_9 == 2) {
                        boolean v12_1 = (Character.charCount(v9) + v6_1);
                        if (v12_1 < p19) {
                            v9 = Character.codePointAt(p17, v12_1);
                        }
                        v6_1 = v12_1;
                        while ((v6_1 < p19) && ((v10 < p20) && (v11_2))) {
                        }
                    } else {
                        if (v13_9 == 3) {
                        }
                    }
                }
            }
        } while((!p21) && (this.m(p17, v7_2, v6_1, v5_0.d.b)));
        v11_2 = p22.e(p17, v7_2, v6_1, v5_0.d.b);
        v10++;
    }

    public void r()
    {
        ((android.content.res.TypedArray) this.c).recycle();
        return;
    }

    public void s(r2.j p18, int p19, boolean p20)
    {
        Long v3_2 = ((x2.b) this.d);
        long v5_12 = ((android.content.Context) this.b);
        android.app.job.JobScheduler v4_2 = new android.content.ComponentName(v5_12, com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService);
        String v6_8 = ((android.app.job.JobScheduler) v5_12.getSystemService("jobscheduler"));
        int v7_9 = new java.util.zip.Adler32();
        v7_9.update(v5_12.getPackageName().getBytes(java.nio.charset.Charset.forName("UTF-8")));
        String v9_1 = p18.a;
        v7_9.update(p18.a.getBytes(java.nio.charset.Charset.forName("UTF-8")));
        o2.d v8_2 = p18.c;
        v7_9.update(java.nio.ByteBuffer.allocate(4).putInt(b3.a.a(v8_2)).array());
        long v5_10 = p18.b;
        if (v5_10 != 0) {
            v7_9.update(v5_10);
        }
        int v7_10 = ((int) v7_9.getValue());
        if (!p20) {
            android.app.job.JobInfo$Builder v12_3 = v6_8.getAllPendingJobs().iterator();
            while (v12_3.hasNext()) {
                Long v13_2 = ((android.app.job.JobInfo) v12_3.next());
                long v14_1 = v13_2.getExtras().getInt("attemptNumber");
                if (v13_2.getId() == v7_10) {
                    if (v14_1 < p19) {
                        break;
                    }
                    c4.b.v("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", p18);
                    return;
                }
            }
        }
        android.app.job.JobInfo$Builder v12_8 = ((y2.h) ((y2.d) this.c)).c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[] {v9_1, String.valueOf(b3.a.a(v8_2))}));
        try {
            Long v13_8;
            if (!v12_8.moveToNext()) {
                v13_8 = Long.valueOf(0);
            } else {
                v13_8 = Long.valueOf(v12_8.getLong(0));
            }
        } catch (android.app.job.JobInfo v0_4) {
            v12_8.close();
            throw v0_4;
        }
        v12_8.close();
        long v14_4 = v13_8.longValue();
        android.app.job.JobInfo$Builder v12_1 = new android.app.job.JobInfo$Builder(v7_10, v4_2);
        android.app.job.JobScheduler v4_0 = v6_8;
        int v16 = v7_10;
        v12_1.setMinimumLatency(v3_2.a(v8_2, v14_4, p19));
        String v6_5 = ((x2.c) v3_2.b.get(v8_2)).c;
        if (!v6_5.contains(x2.d.a)) {
            v12_1.setRequiredNetworkType(1);
        } else {
            v12_1.setRequiredNetworkType(2);
        }
        if (v6_5.contains(x2.d.c)) {
            v12_1.setRequiresCharging(1);
        }
        if (v6_5.contains(x2.d.b)) {
            v12_1.setRequiresDeviceIdle(1);
        }
        String v1_3 = new android.os.PersistableBundle();
        v1_3.putInt("attemptNumber", p19);
        v1_3.putString("backendName", v9_1);
        v1_3.putInt("priority", b3.a.a(v8_2));
        if (v5_10 != 0) {
            v1_3.putString("extras", android.util.Base64.encodeToString(v5_10, 0));
        }
        v12_1.setExtras(v1_3);
        android.app.job.JobInfo v0_1 = new Object[] {p18, Integer.valueOf(v16), Long.valueOf(v3_2.a(v8_2, v14_4, p19)), v13_8, Integer.valueOf(p19)});
        String v1_6 = "TRuntime.".concat("JobInfoScheduler");
        if (android.util.Log.isLoggable(v1_6, 3)) {
            android.util.Log.d(v1_6, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", v0_1));
        }
        v4_0.schedule(v12_1.build());
        return;
    }

    public void t(String p2)
    {
        if (p2 == null) {
            throw new NullPointerException("Null backendName");
        } else {
            this.b = p2;
            return;
        }
    }

    public String toString()
    {
        switch (this.a) {
            case 6:
                String v0_3 = new StringBuilder(32);
                v0_3.append(((String) this.b));
                v0_3.append(123);
                k2.c v1_3 = ((k2.c) ((k2.c) this.c).c);
                String v2_0 = "";
                while (v1_3 != null) {
                    int v3_0 = v1_3.b;
                    v0_3.append(v2_0);
                    if ((v3_0 == 0) || (!v3_0.getClass().isArray())) {
                        v0_3.append(v3_0);
                    } else {
                        String v2_4 = java.util.Arrays.deepToString(new Object[] {v3_0}));
                        v0_3.append(v2_4, 1, (v2_4.length() - 1));
                    }
                    v1_3 = ((k2.c) v1_3.c);
                    v2_0 = ", ";
                }
                v0_3.append(125);
                return v0_3.toString();
            default:
                return super.toString();
        }
    }

    public void u(w.e p4, int p5, int p6, int p7)
    {
        p4.getClass();
        int v0 = p4.b0;
        int v1 = p4.c0;
        p4.b0 = 0;
        p4.c0 = 0;
        p4.O(p6);
        p4.L(p7);
        if (v0 >= 0) {
            p4.b0 = v0;
        } else {
            p4.b0 = 0;
        }
        if (v1 >= 0) {
            p4.c0 = v1;
        } else {
            p4.c0 = 0;
        }
        w.e v4_2 = ((w.e) this.d);
        v4_2.t0 = p5;
        v4_2.U();
        return;
    }

    public void v(w.e p10)
    {
        java.util.ArrayList v0_1 = ((java.util.ArrayList) this.b);
        v0_1.clear();
        int v1_1 = p10.q0.size();
        int v3 = 0;
        while (v3 < v1_1) {
            w.d v5_2 = ((w.d) p10.q0.get(v3));
            int[] v6 = v5_2.p0;
            if ((v6[0] == 3) || (v6[1] == 3)) {
                v0_1.add(v5_2);
            }
            v3++;
        }
        p10.s0.b = 1;
        return;
    }

    public Object zza()
    {
        return new c4.e(((c4.l) ((d4.c) this.b).zza()), ((c4.c) ((d4.c) this.c).zza()), ((c4.f) ((l6.c) this.d).b).a);
    }
}
