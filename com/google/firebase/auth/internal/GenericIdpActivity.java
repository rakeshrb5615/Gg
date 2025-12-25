package com.google.firebase.auth.internal;
public class GenericIdpActivity extends androidx.fragment.app.j0 implements com.google.android.gms.internal.firebase-auth-api.zzaes {
    public static long b;
    public static final synthetic int c;
    public boolean a;

    static GenericIdpActivity()
    {
        return;
    }

    public GenericIdpActivity()
    {
        this.a = 0;
        return;
    }

    public final android.net.Uri$Builder h(android.net.Uri$Builder p21, android.content.Intent p22, String p23, String p24)
    {
        String v8_5;
        String v4_16 = p22.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String v5_3 = p22.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String v6_1 = p22.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String v7_3 = p22.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        String v8_3 = p22.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        if ((v8_3 == null) || (v8_3.isEmpty())) {
            v8_5 = 0;
        } else {
            v8_5 = android.text.TextUtils.join(",", v8_3);
        }
        String v10_5;
        String v10_3 = p22.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (v10_3 != null) {
            String v11_1 = new org.json.JSONObject();
            try {
                String v12_1 = v10_3.keySet().iterator();
            } catch (org.json.JSONException) {
                android.util.Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
                v10_5 = v11_1.toString();
            }
            while (v12_1.hasNext()) {
                String v13_2 = ((String) v12_1.next());
                String v14_0 = v10_3.getString(v13_2);
                if (!android.text.TextUtils.isEmpty(v14_0)) {
                    v11_1.put(v13_2, v14_0);
                }
            }
        } else {
            v10_5 = 0;
        }
        String v11_3 = java.util.UUID.randomUUID().toString();
        String v12_5 = com.google.android.gms.internal.firebase-auth-api.zzaer.zza(this, java.util.UUID.randomUUID().toString());
        String v13_3 = p22.getAction();
        String v2_17 = p22.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        boolean v15_1 = this.getApplicationContext();
        int v17 = v10_5;
        String v18 = v8_5;
        String v19 = v4_16;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p23);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v11_3);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v12_5);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v7_3);
        boolean v15_2 = z4.z.a(v15_1, p23);
        z4.z.b(v15_2);
        boolean v15_3 = v15_2.edit();
        String v3_14 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
        v3_14.append(v11_3);
        v3_14.append(".SESSION_ID");
        v15_3.putString(v3_14.toString(), v12_5);
        String v3_17 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
        v3_17.append(v11_3);
        v3_17.append(".OPERATION");
        v15_3.putString(v3_17.toString(), v13_3);
        String v3_2 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
        v3_2.append(v11_3);
        v3_2.append(".PROVIDER_ID");
        v15_3.putString(v3_2.toString(), v5_3);
        String v3_5 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
        v3_5.append(v11_3);
        v3_5.append(".FIREBASE_APP_NAME");
        v15_3.putString(v3_5.toString(), v7_3);
        v15_3.putString("com.google.firebase.auth.api.gms.config.tenant.id", v6_1);
        v15_3.apply();
        String v3_11 = z4.a0.c(this.getApplicationContext(), q4.f.e(v7_3).f()).a();
        if (!android.text.TextUtils.isEmpty(v3_11)) {
            if (v12_5 != null) {
                String v4_6 = p21.appendQueryParameter("eid", "p");
                String v8_1 = new StringBuilder("X");
                v8_1.append(v2_17);
                v4_6.appendQueryParameter("v", v8_1.toString()).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", v19).appendQueryParameter("providerId", v5_3).appendQueryParameter("sessionId", v12_5).appendQueryParameter("eventId", v11_3).appendQueryParameter("apn", p23).appendQueryParameter("sha1Cert", p24).appendQueryParameter("publicKey", v3_11);
                if (!android.text.TextUtils.isEmpty(v18)) {
                    p21.appendQueryParameter("scopes", v18);
                }
                if (!android.text.TextUtils.isEmpty(v17)) {
                    p21.appendQueryParameter("customParameters", v17);
                }
                if (!android.text.TextUtils.isEmpty(v6_1)) {
                    p21.appendQueryParameter("tid", v6_1);
                }
                return p21;
            } else {
                return 0;
            }
        } else {
            android.util.Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            this.i(w0.a.k("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return 0;
        }
    }

    public final void i(com.google.android.gms.common.api.Status p3)
    {
        com.google.firebase.auth.internal.GenericIdpActivity.b = 0;
        this.a = 0;
        android.content.Context v0_4 = new android.content.Intent();
        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(p3, v0_4, "com.google.firebase.auth.internal.STATUS");
        v0_4.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        r1.a.a(this).b(v0_4);
        z4.p.a(this.getApplicationContext(), p3);
        this.finish();
        return;
    }

    public final void j()
    {
        com.google.firebase.auth.internal.GenericIdpActivity.b = 0;
        this.a = 0;
        com.google.android.gms.common.api.Status v0_5 = new android.content.Intent();
        v0_5.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", 1);
        v0_5.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        r1.a.a(this).b(v0_5);
        z4.p.a(this, w0.a.k("WEB_CONTEXT_CANCELED"));
        this.finish();
        return;
    }

    public final void onCreate(android.os.Bundle p8)
    {
        super.onCreate(p8);
        String v0_4 = this.getIntent().getAction();
        if (("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(v0_4)) || (("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(v0_4)) || (("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(v0_4)) || ("android.intent.action.VIEW".equals(v0_4))))) {
            String v0_2 = com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis();
            if ((v0_2 - com.google.firebase.auth.internal.GenericIdpActivity.b) >= 30000) {
                com.google.firebase.auth.internal.GenericIdpActivity.b = v0_2;
                if (p8 != null) {
                    this.a = p8.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                }
                return;
            } else {
                android.util.Log.e("GenericIdpActivity", "Could not start operation - already in progress");
                return;
            }
        } else {
            String v8_4 = new StringBuilder("Could not do operation - unknown action: ");
            v8_4.append(v0_4);
            android.util.Log.e("GenericIdpActivity", v8_4.toString());
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
                String v1_0 = this.getPackageName();
                try {
                    String v2_7 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(this, v1_0)).toLowerCase(java.util.Locale.US);
                    String v4_7 = q4.f.e(this.getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                    String v8_3 = com.google.firebase.auth.FirebaseAuth.getInstance(v4_7);
                } catch (String v0_20) {
                    String v0_21 = String.valueOf(v0_20);
                    boolean v3_17 = new StringBuilder("Could not get package signature: ");
                    v3_17.append(v1_0);
                    v3_17.append(" ");
                    v3_17.append(v0_21);
                    android.util.Log.e("GenericIdpActivity", v3_17.toString());
                    com.google.android.gms.internal.firebase-auth-api.zzaer.zzb(this, v1_0);
                    this.a = 1;
                    return;
                }
                if (com.google.android.gms.internal.firebase-auth-api.zzagl.zza(v4_7)) {
                    v4_7.a();
                    this.zza(this.h(android.net.Uri.parse(com.google.android.gms.internal.firebase-auth-api.zzagl.zza(v4_7.c.a)).buildUpon(), com.google.firebase.auth.internal.GenericIdpActivity v5.getIntent(), v1_0, v2_7).build(), v1_0, v8_3.p);
                    this.a = 1;
                    return;
                } else {
                    String v2_10 = new Void[0];
                    new com.google.android.gms.internal.firebase-auth-api.zzaeq(v1_0, v2_7, this.getIntent(), v4_7, this).executeOnExecutor(v8_3.s, v2_10);
                    this.a = 1;
                    return;
                }
            }
        } else {
            String v0_32 = this.getIntent();
            if (!v0_32.hasExtra("firebaseError")) {
                if ((!v0_32.hasExtra("link")) || (!v0_32.hasExtra("eventId"))) {
                    this.j();
                    return;
                } else {
                    String v1_1 = v0_32.getStringExtra("link");
                    String v2_12 = v0_32.getStringExtra("eventId");
                    boolean v3_0 = this.getPackageName();
                    String v0_0 = v0_32.getBooleanExtra("encryptionEnabled", 1);
                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v3_0);
                    com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v2_12);
                    boolean v3_1 = z4.z.a(this, v3_0);
                    z4.b0 v11_1 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
                    v11_1.append(v2_12);
                    v11_1.append(".SESSION_ID");
                    String v10_2 = v11_1.toString();
                    z4.b0 v11_3 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
                    v11_3.append(v2_12);
                    v11_3.append(".OPERATION");
                    String v9_2 = v11_3.toString();
                    z4.b0 v11_5 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
                    v11_5.append(v2_12);
                    v11_5.append(".PROVIDER_ID");
                    String v8_2 = v11_5.toString();
                    z4.b0 v11_7 = new StringBuilder("com.google.firebase.auth.internal.EVENT_ID.");
                    v11_7.append(v2_12);
                    v11_7.append(".FIREBASE_APP_NAME");
                    String v2_1 = v11_7.toString();
                    z4.b0 v6_1 = 0;
                    String v12 = v3_1.getString(v10_2, 0);
                    String v13 = v3_1.getString(v9_2, 0);
                    String v14 = v3_1.getString(v8_2, 0);
                    String v15 = v3_1.getString("com.google.firebase.auth.api.gms.config.tenant.id", 0);
                    String v16 = v3_1.getString(v2_1, 0);
                    boolean v3_2 = v3_1.edit();
                    v3_2.remove(v10_2);
                    v3_2.remove(v9_2);
                    v3_2.remove(v8_2);
                    v3_2.remove(v2_1);
                    v3_2.apply();
                    if ((v12 != null) && ((v13 != null) && (v14 != null))) {
                        v6_1 = new z4.b0(v12, v13, v14, v15, v16);
                    }
                    if (v6_1 == null) {
                        this.j();
                    }
                    if (v0_0 != null) {
                        v1_1 = z4.a0.c(this.getApplicationContext(), q4.f.e(v6_1.e).f()).b(v1_1);
                    }
                    String v0_6 = new com.google.android.gms.internal.firebase-auth-api.zzajb(v6_1, v1_1);
                    String v1_2 = v6_1.d;
                    String v2_5 = v6_1.b;
                    v0_6.zzb(v1_2);
                    if ((!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(v2_5)) && ((!"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(v2_5)) && (!"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(v2_5)))) {
                        android.util.Log.e("GenericIdpActivity", "unsupported operation: ".concat(v2_5));
                        this.j();
                        return;
                    } else {
                        com.google.firebase.auth.internal.GenericIdpActivity.b = 0;
                        this.a = 0;
                        boolean v3_11 = new android.content.Intent();
                        com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(v0_6, v3_11, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                        v3_11.putExtra("com.google.firebase.auth.internal.OPERATION", v2_5);
                        v3_11.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                        r1.a.a(this).b(v3_11);
                        boolean v3_14 = this.getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                        v3_14.putString("verifyAssertionRequest", com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToString(v0_6));
                        v3_14.putString("operation", v2_5);
                        v3_14.putString("tenantId", v1_2);
                        v3_14.putLong("timestamp", com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis());
                        v3_14.commit();
                        this.finish();
                        return;
                    }
                }
            } else {
                this.i(z4.v.a(v0_32.getStringExtra("firebaseError")));
                return;
            }
        }
    }

    public final void onSaveInstanceState(android.os.Bundle p3)
    {
        super.onSaveInstanceState(p3);
        p3.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.a);
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
            android.util.Log.e("GenericIdpActivity", v3_4.toString());
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
            android.util.Log.e("GenericIdpActivity", "Error generating URL connection");
            return 0;
        }
    }

    public final void zza(android.net.Uri p2, String p3, c6.b p4)
    {
        if (p4.get() != null) {
            throw new ClassCastException();
        } else {
            ClassCastException v2_3 = com.google.android.gms.tasks.Tasks.forResult(p2);
            n0.a v4_2 = new n0.a(13);
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
