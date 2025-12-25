package com.google.android.gms.internal.firebase-auth-api;
public class zzagv implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzagv";
    private java.util.List zzb;

    public zzagv()
    {
        com.google.android.gms.internal.firebase-auth-api.zzaiw.zza();
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzagv zzb(String p6)
    {
        String v1_1 = new org.json.JSONObject(p6);
        v1_1.optString("authUri", 0);
        v1_1.optBoolean("registered", 0);
        v1_1.optString("providerId", 0);
        v1_1.optBoolean("forExistingProvider", 0);
        if (v1_1.has("allProviders")) {
            new com.google.android.gms.internal.firebase-auth-api.zzaiw(1, com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v1_1.optJSONArray("allProviders")));
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzaiw.zza();
        }
        this.zzb = com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v1_1.optJSONArray("signinMethods"));
        return this;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return this.zzb(p1);
    }

    public final java.util.List zza()
    {
        return this.zzb;
    }
}
