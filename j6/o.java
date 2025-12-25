package j6;
public class o implements n.h2, m.x, m.k, n.y0, com.google.android.gms.tasks.OnSuccessListener, com.google.android.gms.tasks.OnFailureListener, com.google.android.gms.tasks.OnCanceledListener, t6.b, t2.b, q0.i, y1.b, com.google.android.gms.tasks.Continuation, z8.m {
    public final synthetic int a;
    public Object b;

    public o(int p2)
    {
        this.a = p2;
        switch (p2) {
            case 11:
                this.b = new r0.d(this);
                return;
            case 17:
                this.b = new java.util.concurrent.ConcurrentHashMap(16);
                return;
            default:
                this.b = new java.util.concurrent.CountDownLatch(1);
                return;
        }
    }

    public synthetic o(int p1, boolean p2)
    {
        this.a = p1;
        return;
    }

    public o(a5.z p2, com.google.android.recaptcha.RecaptchaAction p3)
    {
        this.a = 25;
        this.b = p3;
        java.util.Objects.requireNonNull(p2);
        return;
    }

    public o(android.content.Context p4)
    {
        this.a = 1;
        String v0_5 = p4.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = v0_5;
        String v2_1 = new java.io.File(e0.c.getNoBackupFilesDir(p4), "com.google.android.gms.appid-no-backup");
        try {
            if ((!v2_1.exists()) && (v2_1.createNewFile())) {
                if (!v0_5.getAll().isEmpty()) {
                    android.util.Log.i("FirebaseMessaging", "App restored, clearing state");
                    v0_5.edit().clear().commit();
                }
            }
        } catch (Throwable v4_11) {
            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                String v1_4 = new StringBuilder("Error creating file in no backup dir: ");
                v1_4.append(v4_11.getMessage());
                android.util.Log.d("FirebaseMessaging", v1_4.toString());
            }
        }
        return;
    }

    public o(android.os.Bundle p2)
    {
        this.a = 0;
        if (p2 == null) {
            throw new NullPointerException("data");
        } else {
            this.b = new android.os.Bundle(p2);
            return;
        }
    }

    public synthetic o(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public o(m5.c p3)
    {
        this.a = 8;
        this.b = new java.io.File(((java.io.File) p3.d), "com.crashlytics.settings.json");
        return;
    }

    public static boolean C(android.os.Bundle p4)
    {
        if ((!"1".equals(p4.getString("gcm.n.e"))) && (!"1".equals(p4.getString("gcm.n.e".replace("gcm.n.", "gcm.notification."))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String H(String p1)
    {
        if (p1.startsWith("gcm.n.")) {
            p1 = p1.substring(6);
        }
        return p1;
    }

    public String A(String p4)
    {
        android.os.Bundle v0_1 = ((android.os.Bundle) this.b);
        if ((!v0_1.containsKey(p4)) && (p4.startsWith("gcm.n."))) {
            String v1_0;
            if (p4.startsWith("gcm.n.")) {
                v1_0 = p4.replace("gcm.n.", "gcm.notification.");
            } else {
                v1_0 = p4;
            }
            if (v0_1.containsKey(v1_0)) {
                p4 = v1_0;
            }
        }
        return v0_1.getString(p4);
    }

    public long[] B()
    {
        String v0_1 = this.u("gcm.n.vibrate_timings");
        if (v0_1 != null) {
            try {
                if (v0_1.length() <= 1) {
                    throw new org.json.JSONException("vibrateTimings have invalid length");
                } else {
                    org.json.JSONException v2_1 = v0_1.length();
                    String v3_1 = new long[v2_1];
                    int v4 = 0;
                    while (v4 < v2_1) {
                        v3_1[v4] = v0_1.optLong(v4);
                        v4++;
                    }
                    return v3_1;
                }
            } catch (NumberFormatException) {
                org.json.JSONException v2_3 = new StringBuilder("User defined vibrateTimings is invalid: ");
                v2_3.append(v0_1);
                v2_3.append(". Skipping setting vibrateTimings.");
                android.util.Log.w("NotificationParams", v2_3.toString());
                return 0;
            }
        } else {
            return 0;
        }
    }

    public android.os.Bundle D()
    {
        java.util.Iterator v1_1 = ((android.os.Bundle) this.b);
        android.os.Bundle v0_1 = new android.os.Bundle(v1_1);
        java.util.Iterator v1_3 = v1_1.keySet().iterator();
        while (v1_3.hasNext()) {
            String v2_1 = ((String) v1_3.next());
            if ((!v2_1.startsWith("google.c.a.")) && (!v2_1.equals("from"))) {
                v0_1.remove(v2_1);
            }
        }
        return v0_1;
    }

    public o5.c E(org.json.JSONObject p4)
    {
        v3.f v0_4;
        v3.f v0_5 = p4.getInt("settings_version");
        if (v0_5 == 3) {
            v0_4 = new v3.f();
        } else {
            c5.c v1_5 = new StringBuilder("Could not determine SettingsJsonTransform for settings version ");
            v1_5.append(v0_5);
            v1_5.append(". Using default settings values.");
            android.util.Log.e("FirebaseCrashlytics", v1_5.toString(), 0);
            v0_4 = new c5.c();
        }
        return v0_4.c(((c5.c) this.b), p4);
    }

    public boolean F(int p1, int p2, android.os.Bundle p3)
    {
        return 0;
    }

    public org.json.JSONObject G()
    {
        boolean v3 = 0;
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 3)) {
            android.util.Log.d("FirebaseCrashlytics", "Checking for cached settings...", 0);
        }
        try {
            boolean v5_0;
            Exception v2_0 = ((java.io.File) this.b);
        } catch (Exception v2_3) {
            boolean v4_4 = 0;
            android.util.Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", v2_3);
            g5.g.b(v4_4, "Error while closing settings cache file.");
            return v3;
        } catch (Throwable v1_1) {
            g5.g.b(v3, "Error while closing settings cache file.");
            throw v1_1;
        } catch (Throwable v1_1) {
            v3 = v4_4;
        }
        if (!v2_0.exists()) {
            if (android.util.Log.isLoggable("FirebaseCrashlytics", 2)) {
                android.util.Log.v("FirebaseCrashlytics", "Settings file does not exist.", 0);
            }
            v5_0 = 0;
        } else {
            v4_4 = new java.io.FileInputStream(v2_0);
            try {
                v5_0 = new org.json.JSONObject(g5.g.i(v4_4));
                v3 = v4_4;
            } catch (Exception v2_3) {
                android.util.Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", v2_3);
                g5.g.b(v4_4, "Error while closing settings cache file.");
                return v3;
            }
        }
        g5.g.b(v3, "Error while closing settings cache file.");
        return v5_0;
    }

    public void a(m.m p3, boolean p4)
    {
        if ((p3 instanceof m.e0)) {
            ((m.e0) p3).z.k().c(0);
        }
        m.x v0_2 = ((n.k) this.b).e;
        if (v0_2 != null) {
            v0_2.a(p3, p4);
        }
        return;
    }

    public boolean b(m.m p1, android.view.MenuItem p2)
    {
        int v1_4 = ((androidx.appcompat.widget.ActionMenuView) this.b).F;
        if ((v1_4 == 0) || (!((n.y2) v1_4).a.M.a(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public void c(int p1)
    {
        return;
    }

    public void d(m.m p8, m.o p9)
    {
        m.e v0_1 = ((m.g) this.b);
        android.os.Handler v1 = v0_1.f;
        long v2_1 = 0;
        v1.removeCallbacksAndMessages(0);
        m.e v0_5 = v0_1.n;
        int v3_1 = v0_5.size();
        long v4_0 = 0;
        while (v4_0 < v3_1) {
            if (p8 != ((m.f) v0_5.get(v4_0)).b) {
                v4_0++;
            }
            if (v4_0 != -1) {
                long v4_1 = (v4_0 + 1);
                if (v4_1 < v0_5.size()) {
                    v2_1 = ((m.f) v0_5.get(v4_1));
                }
                v1.postAtTime(new m.e(this, v2_1, p9, p8), p8, (android.os.SystemClock.uptimeMillis() + 200));
                return;
            } else {
                return;
            }
        }
        v4_0 = -1;
    }

    public Object e(Object p2)
    {
        return java.util.Optional.ofNullable(((z8.m) this.b).e(((okhttp3.ResponseBody) p2)));
    }

    public void f(m.m p2)
    {
        n.y2 v0_2 = ((androidx.appcompat.widget.ActionMenuView) this.b).A;
        if (v0_2 != null) {
            v0_2.f(p2);
        }
        return;
    }

    public boolean g(float p2)
    {
        if (p2 != 0) {
            this.o();
            ((androidx.core.widget.NestedScrollView) this.b).j(((int) p2));
            return 1;
        } else {
            return 0;
        }
    }

    public Object get()
    {
        switch (this.a) {
            case 12:
                return new r6.w0(((r6.c1) ((t6.c) this.b).get()));
            default:
                return new b8.g(((android.content.Context) ((k4.i) this.b).b), new c5.c(), new a6.e(), 15);
        }
    }

    public boolean h(m.m p4)
    {
        m.x v0_1 = ((n.k) this.b);
        if (p4 != v0_1.c) {
            ((m.e0) p4).A.getClass();
            v0_1.getClass();
            m.x v0_2 = v0_1.e;
            if (v0_2 == null) {
                return 0;
            } else {
                return v0_2.h(p4);
            }
        } else {
            return 0;
        }
    }

    public void i()
    {
        android.util.Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        return;
    }

    public void j(int p4, Object p5)
    {
        String v0;
        switch (p4) {
            case 1:
                v0 = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                v0 = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                v0 = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                v0 = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                v0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                v0 = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                v0 = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                v0 = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                v0 = "";
                break;
            case 10:
                v0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                v0 = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if ((p4 == 6) || ((p4 == 7) || (p4 == 8))) {
            android.util.Log.e("ProfileInstaller", v0, ((Throwable) p5));
        } else {
            android.util.Log.d("ProfileInstaller", v0);
        }
        ((androidx.profileinstaller.ProfileInstallReceiver) this.b).setResultCode(p4);
        return;
    }

    public void k(int p1)
    {
        return;
    }

    public float l()
    {
        return (- ((androidx.core.widget.NestedScrollView) this.b).getVerticalScrollFactorCompat());
    }

    public void m(int p1, float p2)
    {
        return;
    }

    public void n(m.m p1, android.view.MenuItem p2)
    {
        ((m.g) this.b).f.removeCallbacksAndMessages(p1);
        return;
    }

    public void o()
    {
        ((androidx.core.widget.NestedScrollView) this.b).d.abortAnimation();
        return;
    }

    public void onCanceled()
    {
        ((java.util.concurrent.CountDownLatch) this.b).countDown();
        return;
    }

    public void onFailure(Exception p9)
    {
        switch (this.a) {
            case 7:
                ((java.util.concurrent.CountDownLatch) this.b).countDown();
                return;
            default:
                if ((p9 instanceof q4.i)) {
                    long v2_4;
                    com.google.android.gms.internal.firebase-auth-api.zze v9_5 = z4.i.e;
                    long v2_0 = new Object[0];
                    v9_5.v("Failure to refresh token; scheduling refresh after failure", v2_0);
                    z4.i v0_4 = ((z4.i) ((b5.l) this.b).c);
                    long v2_2 = ((int) v0_4.b);
                    if ((v2_2 == 30) || ((v2_2 == 60) || ((v2_2 == 120) || ((v2_2 == 240) || (v2_2 == 480))))) {
                        v2_4 = (2 * v0_4.b);
                    } else {
                        if (v2_2 == 960) {
                            v2_4 = 960;
                        } else {
                            v2_4 = 30;
                        }
                    }
                    v0_4.b = v2_4;
                    v0_4.a = ((v0_4.b * 1000) + com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis());
                    b5.l v1_1 = new Object[0];
                    v9_5.v(v1.a.g(v0_4.a, "Scheduling refresh for "), v1_1);
                    v0_4.c.postDelayed(v0_4.d, (v0_4.b * 1000));
                }
                return;
        }
    }

    public void onSuccess(Object p1)
    {
        ((java.util.concurrent.CountDownLatch) this.b).countDown();
        return;
    }

    public r0.c p(int p1)
    {
        return 0;
    }

    public String q(Object p7)
    {
        java.io.StringWriter v1_1 = new java.io.StringWriter();
        try {
            java.util.HashMap v3_0 = ((v5.d) this.b);
            v5.a v4_1 = v3_0;
            boolean v5_1 = v4_1;
            v5.e v0_0 = new v5.e(v1_1, v3_0.a, v4_1.b, v5_1.c, v5_1.d);
            v0_0.h(p7);
            v0_0.j();
            v0_0.b.flush();
        } catch (java.io.IOException) {
        }
        return v1_1.toString();
    }

    public r0.c r(int p1)
    {
        return 0;
    }

    public boolean s(String p2)
    {
        int v2_1 = this.A(p2);
        if ((!"1".equals(v2_1)) && (!Boolean.parseBoolean(v2_1))) {
            return 0;
        } else {
            return 1;
        }
    }

    public Integer t(String p4)
    {
        String v0_0 = this.A(p4);
        if (!android.text.TextUtils.isEmpty(v0_0)) {
            try {
                String v4_6 = Integer.valueOf(Integer.parseInt(v0_0));
                return v4_6;
            } catch (NumberFormatException) {
                StringBuilder v1_1 = new StringBuilder("Couldn\'t parse value of ");
                v1_1.append(j6.o.H(v4_6));
                v1_1.append("(");
                v1_1.append(v0_0);
                v1_1.append(") into an int");
                android.util.Log.w("NotificationParams", v1_1.toString());
            }
        }
        return 0;
    }

    public Object then(com.google.android.gms.tasks.Task p4)
    {
        switch (this.a) {
            case 24:
                com.google.android.gms.tasks.Task v4_1;
                StringBuilder v0_2 = ((x1.b) this.b);
                if (p4.isSuccessful()) {
                    v4_1 = v0_2.f(((String) p4.getResult()));
                } else {
                    com.google.android.gms.tasks.Task v4_5 = ((Exception) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4.getException())).getMessage();
                    String v1_1 = new StringBuilder("Failed to get Recaptcha token, error - ");
                    v1_1.append(v4_5);
                    v1_1.append("\n\n Failing open with a fake token.");
                    android.util.Log.e("RecaptchaCallWrapper", v1_1.toString());
                    v4_1 = v0_2.f("NO_RECAPTCHA");
                }
                return v4_1;
            default:
                com.google.android.gms.tasks.Task v4_12;
                if (!p4.isSuccessful()) {
                    com.google.android.gms.tasks.Task v4_11 = ((Exception) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4.getException()));
                    if (!(v4_11 instanceof z4.q)) {
                        v4_12 = com.google.android.gms.tasks.Tasks.forException(v4_11);
                    } else {
                        if (android.util.Log.isLoggable("RecaptchaHandler", 4)) {
                            com.google.android.gms.tasks.Task v4_13 = v4_11.getMessage();
                            StringBuilder v0_8 = new StringBuilder("Ignoring error related to fetching recaptcha config - ");
                            v0_8.append(v4_13);
                            android.util.Log.i("RecaptchaHandler", v0_8.toString());
                        }
                        v4_12 = com.google.android.gms.tasks.Tasks.forResult("");
                    }
                } else {
                    v4_12 = ((com.google.android.recaptcha.RecaptchaTasksClient) p4.getResult()).executeTask(((com.google.android.recaptcha.RecaptchaAction) this.b));
                }
                return v4_12;
        }
    }

    public org.json.JSONArray u(String p4)
    {
        String v0_0 = this.A(p4);
        if (!android.text.TextUtils.isEmpty(v0_0)) {
            try {
                return new org.json.JSONArray(v0_0);
            } catch (org.json.JSONException) {
                StringBuilder v1_0 = new StringBuilder("Malformed JSON for key ");
                v1_0.append(j6.o.H(p4));
                v1_0.append(": ");
                v1_0.append(v0_0);
                v1_0.append(", falling back to default");
                android.util.Log.w("NotificationParams", v1_0.toString());
            }
        }
        return 0;
    }

    public int[] v()
    {
        org.json.JSONArray v3_1 = this.u("gcm.n.light_settings");
        if (v3_1 != null) {
            String v6_4 = new int[3];
            try {
                if (v3_1.length() != 3) {
                    throw new org.json.JSONException("lightSettings don\'t have all three fields");
                } else {
                    int v7_2 = android.graphics.Color.parseColor(v3_1.optString(0));
                    if (v7_2 == -16777216) {
                        throw new IllegalArgumentException("Transparent color is invalid");
                    } else {
                        v6_4[0] = v7_2;
                        v6_4[1] = v3_1.optInt(1);
                        v6_4[2] = v3_1.optInt(2);
                        return v6_4;
                    }
                }
            } catch (org.json.JSONException) {
                IllegalArgumentException v5_9 = new StringBuilder("LightSettings is invalid: ");
                v5_9.append(v3_1);
                v5_9.append(". Skipping setting LightSettings");
                android.util.Log.w("NotificationParams", v5_9.toString());
            }
            return 0;
        } else {
            return 0;
        }
    }

    public Object[] w(String p5)
    {
        int v5_3 = this.u(p5.concat("_loc_args"));
        if (v5_3 != 0) {
            int v0_1 = v5_3.length();
            String[] v1 = new String[v0_1];
            int v2 = 0;
            while (v2 < v0_1) {
                v1[v2] = v5_3.optString(v2);
                v2++;
            }
            return v1;
        } else {
            return 0;
        }
    }

    public String x(String p2)
    {
        return this.A(p2.concat("_loc_key"));
    }

    public Long y()
    {
        String v1_0 = this.A("gcm.n.event_time");
        if (!android.text.TextUtils.isEmpty(v1_0)) {
            try {
                String v0_6 = Long.valueOf(Long.parseLong(v1_0));
                return v0_6;
            } catch (NumberFormatException) {
                StringBuilder v2_1 = new StringBuilder("Couldn\'t parse value of ");
                v2_1.append(j6.o.H(v0_6));
                v2_1.append("(");
                v2_1.append(v1_0);
                v2_1.append(") into a long");
                android.util.Log.w("NotificationParams", v2_1.toString());
            }
        }
        return 0;
    }

    public String z(String p6, android.content.res.Resources p7, String p8)
    {
        String v0_0 = this.A(p8);
        if (android.text.TextUtils.isEmpty(v0_0)) {
            String v0_2 = this.x(p8);
            if (!android.text.TextUtils.isEmpty(v0_2)) {
                java.util.MissingFormatArgumentException v6_1 = p7.getIdentifier(v0_2, "string", p6);
                if (v6_1 != null) {
                    Object[] v3 = this.w(p8);
                    if (v3 != null) {
                        try {
                            return p7.getString(v6_1, v3);
                        } catch (java.util.MissingFormatArgumentException v6_3) {
                            String v7_2 = new StringBuilder("Missing format argument for ");
                            v7_2.append(j6.o.H(p8));
                            v7_2.append(": ");
                            v7_2.append(java.util.Arrays.toString(v3));
                            v7_2.append(" Default value will be used.");
                            android.util.Log.w("NotificationParams", v7_2.toString(), v6_3);
                            return 0;
                        }
                    } else {
                        return p7.getString(v6_1);
                    }
                } else {
                    java.util.MissingFormatArgumentException v6_6 = new StringBuilder();
                    v6_6.append(j6.o.H(p8.concat("_loc_key")));
                    v6_6.append(" resource not found: ");
                    v6_6.append(p8);
                    v6_6.append(" Default value will be used.");
                    android.util.Log.w("NotificationParams", v6_6.toString());
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return v0_0;
        }
    }
}
