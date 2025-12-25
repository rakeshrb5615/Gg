package com.google.android.gms.internal.firebase-auth-api;
public class zzahl implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzahl";
    private com.google.android.gms.internal.firebase-auth-api.zzahn zzb;

    public zzahl()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzahl zzb(String p25)
    {
        com.google.android.gms.internal.firebase-auth-api.zzahn v0_1;
        java.util.ArrayList v3_7 = new org.json.JSONObject(p25);
        if (v3_7.has("users")) {
            com.google.android.gms.internal.firebase-auth-api.zzahn v0_7 = v3_7.optJSONArray("users");
            if (v0_7 != null) {
                if (v0_7.length() != 0) {
                    java.util.ArrayList v3_5 = new java.util.ArrayList(v0_7.length());
                    int v4_0 = 0;
                    int v5 = 0;
                    while (v5 < v0_7.length()) {
                        com.google.android.gms.internal.firebase-auth-api.zzahk v6_0;
                        int v23;
                        com.google.android.gms.internal.firebase-auth-api.zzahk v6_3 = v0_7.getJSONObject(v5);
                        if (v6_3 != null) {
                            v23 = v5;
                            v6_0 = new com.google.android.gms.internal.firebase-auth-api.zzahk(com.google.android.gms.common.util.Strings.emptyToNull(v6_3.optString("localId", 0)), com.google.android.gms.common.util.Strings.emptyToNull(v6_3.optString("email", 0)), v6_3.optBoolean("emailVerified", v4_0), com.google.android.gms.common.util.Strings.emptyToNull(v6_3.optString("displayName", 0)), com.google.android.gms.common.util.Strings.emptyToNull(v6_3.optString("photoUrl", 0)), com.google.android.gms.internal.firebase-auth-api.zzaia.zza(v6_3.optJSONArray("providerUserInfo")), com.google.android.gms.common.util.Strings.emptyToNull(v6_3.optString("rawPassword", 0)), com.google.android.gms.common.util.Strings.emptyToNull(v6_3.optString("phoneNumber", 0)), v6_3.optLong("createdAt", 0), v6_3.optLong("lastLoginAt", 0), 0, 0, com.google.android.gms.internal.firebase-auth-api.zzahy.zza(v6_3.optJSONArray("mfaInfo")), y4.e0.x(v6_3.optJSONArray("passkeyInfo")));
                        } else {
                            v6_0 = new com.google.android.gms.internal.firebase-auth-api.zzahk();
                            v23 = v5;
                        }
                        v3_5.add(v6_0);
                        v5 = (v23 + 1);
                        v4_0 = 0;
                    }
                    v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzahn(v3_5);
                    this.zzb = v0_1;
                    return this;
                } else {
                }
            }
            v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzahn(new java.util.ArrayList());
        } else {
            v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzahn();
        }
        this.zzb = v0_1;
        return this;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return this.zzb(p1);
    }

    public final java.util.List zza()
    {
        return this.zzb.zza();
    }
}
