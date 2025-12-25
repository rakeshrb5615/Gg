package com.google.android.gms.internal.firebase-auth-api;
public final class zzahf implements com.google.android.gms.internal.firebase-auth-api.zzagz {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzahf(String p1, String p2, String p3, String p4, String p5)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzc = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        this.zzd = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        this.zze = p5;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzahf zza(String p6, String p7, String p8, String p9, String p10)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzahf(p6, p7, p8, p9, p10);
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzagz zza(String p1)
    {
        this.zza = p1;
        return this;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("idToken", this.zza);
        if (!android.text.TextUtils.isEmpty(this.zzb)) {
            v0_1.put("displayName", this.zzb);
        }
        String v1_1 = new org.json.JSONObject();
        if (!android.text.TextUtils.isEmpty(this.zzc)) {
            v1_1.put("sessionInfo", this.zzc);
        }
        if (!android.text.TextUtils.isEmpty(this.zzd)) {
            v1_1.put("verificationCode", this.zzd);
        }
        v0_1.put("totpVerificationInfo", v1_1);
        if (!android.text.TextUtils.isEmpty(this.zze)) {
            v0_1.put("tenantId", this.zze);
        }
        return v0_1.toString();
    }
}
