package com.google.android.gms.internal.firebase-auth-api;
public final class zzais implements com.google.android.gms.internal.firebase-auth-api.zzaio {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private com.google.android.gms.internal.firebase-auth-api.zzagm zzg;
    private final String zzh;

    private zzais(String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        this.zzf = p7;
        this.zzh = 0;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzais zza(String p9, String p10, String p11, String p12, String p13, String p14, String p15)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p10);
        return new com.google.android.gms.internal.firebase-auth-api.zzais(p9, "phone", p10, p11, p12, p13, p14, 0);
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("idToken", this.zza);
        v0_1.put("mfaProvider", 1);
        if (this.zzb != null) {
            int v1_1 = new org.json.JSONObject();
            v1_1.put("phoneNumber", this.zzb);
            if (!android.text.TextUtils.isEmpty(this.zzd)) {
                v1_1.put("recaptchaToken", this.zzd);
            }
            if (!android.text.TextUtils.isEmpty(this.zze)) {
                v1_1.put("playIntegrityToken", this.zze);
            }
            String v2_7 = this.zzg;
            if (v2_7 != null) {
                v1_1.put("autoRetrievalInfo", v2_7.zza());
            }
            String v2_10 = this.zzf;
            if (v2_10 == null) {
                com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v1_1);
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v1_1, "captchaResponse", v2_10);
            }
            v0_1.put("phoneEnrollmentInfo", v1_1);
        }
        if (!android.text.TextUtils.isEmpty(0)) {
            v0_1.put("tenantId", 0);
        }
        return v0_1.toString();
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzagm p1)
    {
        this.zzg = p1;
        return;
    }

    public final String zzb()
    {
        return this.zzc;
    }
}
