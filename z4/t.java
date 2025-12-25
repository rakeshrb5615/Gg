package z4;
public final class t {
    public android.content.Context a;
    public String b;
    public android.content.SharedPreferences c;
    public com.google.android.gms.common.logging.Logger d;

    public final String a(String p6)
    {
        Throwable v6_2 = this.c.getString(p6, 0);
        if (v6_2 == null) {
            return 0;
        } else {
            if (!v6_2.startsWith("ENCRYPTED:")) {
                return v6_2;
            } else {
                String v0_2 = z4.r.a(this.a, this.b);
                Throwable v6_1 = v6_2.substring(10);
                v0_2.getClass();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v6_1);
                if (v0_2.b != null) {
                    try {
                    } catch (Throwable v6_6) {
                        Throwable v6_7 = v6_6.getMessage();
                        StringBuilder v2_4 = new StringBuilder("Exception encountered while decrypting bytes:\n");
                        v2_4.append(v6_7);
                        android.util.Log.e("FirebearStorageCryptoHelper", v2_4.toString());
                        return 0;
                    } catch (Throwable v6_6) {
                        v6_7 = v6_6.getMessage();
                        v2_4 = new StringBuilder("Exception encountered while decrypting bytes:\n");
                        v2_4.append(v6_7);
                        android.util.Log.e("FirebearStorageCryptoHelper", v2_4.toString());
                        return 0;
                    }
                    return new String(((com.google.android.gms.internal.firebase-auth-api.zzba) v0_2.b.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzco.zza(), com.google.android.gms.internal.firebase-auth-api.zzba)).zza(android.util.Base64.decode(v6_1, 2), 0), java.nio.charset.StandardCharsets.UTF_8);
                } else {
                    android.util.Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
                    return 0;
                }
            }
        }
    }

    public final z4.e b(org.json.JSONObject p15)
    {
        int v4_7 = p15.getString("cachedTokenState");
        int v5_6 = p15.getString("applicationName");
        org.json.JSONObject v6_1 = p15.getBoolean("anonymous");
        String v7_1 = "2";
        z4.e v8_1 = p15.getString("version");
        if (v8_1 != null) {
            v7_1 = v8_1;
        }
        z4.e v8_3 = p15.getJSONArray("userInfos");
        int v9 = v8_3.length();
        if (v9 != 0) {
            java.util.ArrayList v10_1 = new java.util.ArrayList(v9);
            int v11 = 0;
            int v12 = 0;
            while (v12 < v9) {
                v10_1.add(z4.c.x(v8_3.getString(v12)));
                v12++;
            }
            z4.e v8_5 = new z4.e(q4.f.e(v5_6), v10_1);
            if (!android.text.TextUtils.isEmpty(v4_7)) {
                v8_5.a = ((com.google.android.gms.internal.firebase-auth-api.zzahv) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.internal.firebase-auth-api.zzahv.zzb(v4_7)));
            }
            if (v6_1 == null) {
                v8_5.n = Boolean.FALSE;
            }
            v8_5.m = v7_1;
            if (p15.has("userMetadata")) {
                org.json.JSONObject v2_2 = z4.f.a(p15.getJSONObject("userMetadata"));
                if (v2_2 != null) {
                    v8_5.o = v2_2;
                }
            }
            if (p15.has("userMultiFactorInfo")) {
                y4.e0 v1_1 = p15.getJSONArray("userMultiFactorInfo");
                if (v1_1 != null) {
                    org.json.JSONObject v2_5 = new java.util.ArrayList();
                    int v4_0 = 0;
                    while (v4_0 < v1_1.length()) {
                        int v5_1;
                        org.json.JSONObject v6_3 = new org.json.JSONObject(v1_1.getString(v4_0));
                        int v5_9 = v6_3.optString("factorIdKey");
                        if (!"phone".equals(v5_9)) {
                            if (!java.util.Objects.equals(v5_9, "totp")) {
                                v5_1 = 0;
                            } else {
                                v5_1 = y4.z.y(v6_3);
                            }
                        } else {
                            v5_1 = y4.w.y(v6_3);
                        }
                        v2_5.add(v5_1);
                        v4_0++;
                    }
                    v8_5.A(v2_5);
                }
            }
            if (p15.has("passkeyInfo")) {
                org.json.JSONArray v15_2 = p15.getJSONArray("passkeyInfo");
                if (v15_2 != null) {
                    java.util.ArrayList v0_3 = new java.util.ArrayList();
                    while (v11 < v15_2.length()) {
                        v0_3.add(y4.e0.y(new org.json.JSONObject(v15_2.getString(v11))));
                        v11++;
                    }
                    v8_5.s = v0_3;
                }
            }
            return v8_5;
        } else {
            return 0;
        }
    }

    public final void c(String p6, String p7)
    {
        android.content.SharedPreferences$Editor v0_5 = z4.r.a(this.a, this.b);
        v0_5.getClass();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7);
        String v2 = 0;
        if (v0_5.b != null) {
            try {
            } catch (Throwable v7_5) {
                Throwable v7_6 = v7_5.getMessage();
                StringBuilder v1_2 = new StringBuilder("Exception encountered while encrypting bytes:\n");
                v1_2.append(v7_6);
                android.util.Log.e("FirebearStorageCryptoHelper", v1_2.toString());
            }
            v2 = android.util.Base64.encodeToString(((com.google.android.gms.internal.firebase-auth-api.zzba) v0_5.b.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzco.zza(), com.google.android.gms.internal.firebase-auth-api.zzba)).zzb(p7.getBytes(java.nio.charset.StandardCharsets.UTF_8), 0), 2);
        } else {
            android.util.Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
        }
        if (v2 != null) {
            this.c.edit().putString(p6, "ENCRYPTED:".concat(v2)).apply();
        }
        return;
    }
}
