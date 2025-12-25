package com.google.firebase.auth.internal;
public class RecaptchaActivity extends androidx.fragment.app.j0 implements com.google.android.gms.internal.firebase-auth-api.zzaes {
    public static long b;
    public static final z4.x c;
    public boolean a;

    static RecaptchaActivity()
    {
        com.google.firebase.auth.internal.RecaptchaActivity.c = z4.x.b;
        return;
    }

    public RecaptchaActivity()
    {
        this.a = 0;
        return;
    }

    public final android.net.Uri$Builder h(android.net.Uri$Builder p12, android.content.Intent p13, String p14, String p15)
    {
        String v0_2 = p13.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String v1_1 = java.util.UUID.randomUUID().toString();
        String v2_1 = p13.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        android.net.Uri$Builder v13_4 = p13.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        String v3_1 = q4.f.e(v13_4);
        com.google.firebase.auth.FirebaseAuth.getInstance(v3_1);
        String v6_0 = this.getApplicationContext();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p14);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v1_1);
        String v6_1 = z4.z.a(v6_0, p14);
        z4.z.b(v6_1);
        String v6_2 = v6_1.edit();
        StringBuilder v10_1 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
        v10_1.append(v1_1);
        v10_1.append(".OPERATION");
        v6_2.putString(v10_1.toString(), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        Object v7_2 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
        v7_2.append(v1_1);
        v7_2.append(".FIREBASE_APP_NAME");
        v6_2.putString(v7_2.toString(), v13_4);
        v6_2.apply();
        String v3_4 = z4.a0.c(this.getApplicationContext(), v3_1.f()).a();
        String v6_3 = 0;
        if (!android.text.TextUtils.isEmpty(v3_4)) {
            if (android.text.TextUtils.isEmpty(0)) {
                v6_3 = com.google.android.gms.internal.firebase-auth-api.zzafd.zza();
            } else {
                try {
                } catch (Throwable v12_6) {
                    throw v12_6;
                }
            }
            String v14_6 = p12.appendQueryParameter("apiKey", v0_2).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", p14).appendQueryParameter("hl", v6_3).appendQueryParameter("eventId", v1_1);
            String v1_3 = new StringBuilder("X");
            v1_3.append(v2_1);
            v14_6.appendQueryParameter("v", v1_3.toString()).appendQueryParameter("eid", "p").appendQueryParameter("appName", v13_4).appendQueryParameter("sha1Cert", p15).appendQueryParameter("publicKey", v3_4);
            return p12;
        } else {
            android.util.Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            this.i(w0.a.k("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return 0;
        }
    }

    public final void i(com.google.android.gms.common.api.Status p4)
    {
        com.google.firebase.auth.internal.RecaptchaActivity.b = 0;
        this.a = 0;
        android.content.Intent v1_1 = new android.content.Intent();
        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(p4, v1_1, "com.google.firebase.auth.internal.STATUS");
        v1_1.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        r1.a.a(this).b(v1_1);
        com.google.firebase.auth.internal.RecaptchaActivity.c.a.getClass();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this);
        z4.p.b(this.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.finish();
        return;
    }

    public final void j()
    {
        com.google.firebase.auth.internal.RecaptchaActivity.b = 0;
        this.a = 0;
        String v1_4 = new android.content.Intent();
        v1_4.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", 1);
        v1_4.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        r1.a.a(this).b(v1_4);
        com.google.firebase.auth.internal.RecaptchaActivity.c.a.getClass();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this);
        z4.p.b(this.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.finish();
        return;
    }

    public final void onCreate(android.os.Bundle p8)
    {
        super.onCreate(p8);
        String v0_4 = this.getIntent().getAction();
        if (("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(v0_4)) || ("android.intent.action.VIEW".equals(v0_4))) {
            String v0_1 = com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis();
            if ((v0_1 - com.google.firebase.auth.internal.RecaptchaActivity.b) >= 30000) {
                com.google.firebase.auth.internal.RecaptchaActivity.b = v0_1;
                if (p8) {
                    this.a = p8.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                }
                return;
            } else {
                android.util.Log.e("RecaptchaActivity", "Could not start operation - already in progress");
                return;
            }
        } else {
            boolean v8_4 = new StringBuilder("Could not do operation - unknown action: ");
            v8_4.append(v0_4);
            android.util.Log.e("RecaptchaActivity", v8_4.toString());
            this.j();
            return;
        }
    }

    public final void onNewIntent(android.content.Intent p1)
    {
        super.onNewIntent(p1);
        this.setIntent(p1);
        return;
    }

    public final void onResume()
    {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(this.getIntent().getAction())) {
            if (this.a) {
                this.j();
                return;
            } else {
                String v6_4 = this.getIntent();
                String v4_7 = this.getPackageName();
                try {
                    String v8_2;
                    String v5_5 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(this, v4_7)).toLowerCase(java.util.Locale.US);
                    String v7_4 = q4.f.e(v6_4.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                    String v0_16 = com.google.firebase.auth.FirebaseAuth.getInstance(v7_4);
                } catch (String v0_17) {
                    v8_2 = this;
                    String v0_18 = String.valueOf(v0_17);
                    String v3_10 = new StringBuilder("Could not get package signature: ");
                    v3_10.append(v4_7);
                    v3_10.append(" ");
                    v3_10.append(v0_18);
                    android.util.Log.e("RecaptchaActivity", v3_10.toString());
                    com.google.android.gms.internal.firebase-auth-api.zzaer.zzb(this, v4_7);
                    v8_2.a = 1;
                    return;
                }
                if (com.google.android.gms.internal.firebase-auth-api.zzagl.zza(v7_4)) {
                    v8_2 = this;
                    v7_4.a();
                    this.zza(this.h(android.net.Uri.parse(com.google.android.gms.internal.firebase-auth-api.zzagl.zza(v7_4.c.a)).buildUpon(), this.getIntent(), v4_7, v5_5).build(), v4_7, v0_16.p);
                    v8_2.a = 1;
                    return;
                } else {
                    v8_2 = this;
                    long v2_11 = new Void[0];
                    new com.google.android.gms.internal.firebase-auth-api.zzaeq(v4_7, v5_5, v6_4, v7_4, this).executeOnExecutor(v0_16.s, v2_11);
                    v8_2.a = 1;
                    return;
                }
            }
        } else {
            String v0_23 = this.getIntent();
            if (!v0_23.hasExtra("firebaseError")) {
                if ((!v0_23.hasExtra("link")) || (!v0_23.hasExtra("eventId"))) {
                    this.j();
                    return;
                } else {
                    String v3_0 = v0_23.getStringExtra("link");
                    String v5_0 = this.getApplicationContext();
                    String v6_0 = this.getPackageName();
                    String v7_1 = v0_23.getStringExtra("eventId");
                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v6_0);
                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v7_1);
                    String v5_1 = z4.z.a(v5_0, v6_0);
                    String v6_2 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
                    v6_2.append(v7_1);
                    v6_2.append(".OPERATION");
                    String v6_3 = v6_2.toString();
                    String v9_2 = 0;
                    String v10 = v5_1.getString(v6_3, 0);
                    StringBuilder v11_1 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
                    v11_1.append(v7_1);
                    v11_1.append(".FIREBASE_APP_NAME");
                    String v7_3 = v11_1.toString();
                    String v8_1 = v5_1.getString(v7_3, 0);
                    String v5_2 = v5_1.edit();
                    v5_2.remove(v6_3);
                    v5_2.remove(v7_3);
                    v5_2.apply();
                    if (!android.text.TextUtils.isEmpty(v10)) {
                        v9_2 = v8_1;
                    }
                    if (android.text.TextUtils.isEmpty(v9_2)) {
                        android.util.Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
                        this.i(w0.a.k("Failed to find registration for this reCAPTCHA event"));
                    }
                    if (v0_23.getBooleanExtra("encryptionEnabled", 1)) {
                        v3_0 = z4.a0.c(this.getApplicationContext(), q4.f.e(v9_2).f()).b(v3_0);
                    }
                    String v0_7 = android.net.Uri.parse(v3_0).getQueryParameter("recaptchaToken");
                    com.google.firebase.auth.internal.RecaptchaActivity.b = 0;
                    this.a = 0;
                    android.content.SharedPreferences$Editor v1_4 = new android.content.Intent();
                    v1_4.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", v0_7);
                    v1_4.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    v1_4.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    r1.a.a(this).b(v1_4);
                    android.content.SharedPreferences$Editor v1_7 = this.getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    v1_7.putString("recaptchaToken", v0_7);
                    v1_7.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    v1_7.putLong("timestamp", com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis());
                    v1_7.commit();
                    this.finish();
                    return;
                }
            } else {
                this.i(z4.v.a(v0_23.getStringExtra("firebaseError")));
                return;
            }
        }
    }

    public final void onSaveInstanceState(android.os.Bundle p3)
    {
        super.onSaveInstanceState(p3);
        p3.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.a);
        return;
    }

    public final android.net.Uri$Builder zza(android.content.Intent p3, String p4, String p5)
    {
        return this.h(new android.net.Uri$Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), p3, p4, p5);
    }

    public final String zza(String p3)
    {
        String v0_1 = com.google.android.gms.internal.firebase-auth-api.zzagi.zza("firebear.identityToolkit");
        if (!android.text.TextUtils.isEmpty(v0_1)) {
            String v3_4 = new StringBuilder("Found hermetic configuration for identityToolkit URL: ");
            v3_4.append(v0_1);
            android.util.Log.e("RecaptchaActivity", v3_4.toString());
            return v0_1;
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzagl.zzb(p3);
        }
    }

    public final java.net.HttpURLConnection zza(java.net.URL p3)
    {
        try {
            return ((java.net.HttpURLConnection) com.google.android.gms.internal.firebase-auth-api.zza.zza().zza(p3, "client-firebase-auth-api"));
        } catch (java.io.IOException) {
            Object[] v0_2 = new Object[0];
            com.google.android.gms.internal.firebase-auth-api.zzaes.zza.e("Error generating connection", v0_2);
            return 0;
        }
    }

    public final void zza(android.net.Uri p2, String p3, c6.b p4)
    {
        if (p4.get() != null) {
            throw new ClassCastException();
        } else {
            ClassCastException v2_3 = com.google.android.gms.tasks.Tasks.forResult(p2);
            n0.a v4_2 = new n0.a(14);
            v4_2.b = this;
            v4_2.c = p3;
            v2_3.addOnCompleteListener(v4_2);
            return;
        }
    }

    public final void zza(String p1, com.google.android.gms.common.api.Status p2)
    {
        if (p2 != null) {
            this.i(p2);
            return;
        } else {
            this.j();
            return;
        }
    }
}
