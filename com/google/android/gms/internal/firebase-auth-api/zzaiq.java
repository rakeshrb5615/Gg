package com.google.android.gms.internal.firebase-auth-api;
public final class zzaiq implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private com.google.android.gms.internal.firebase-auth-api.zzagm zzi;

    private zzaiq(String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzc = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        this.zze = p4;
        this.zzd = p5;
        this.zzf = p6;
        this.zzg = p7;
        this.zzh = p8;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzaiq zza(String p9, String p10, String p11, String p12, String p13, String p14, String p15)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p11);
        return new com.google.android.gms.internal.firebase-auth-api.zzaiq("phone", p9, p10, p11, p12, p13, p14, p15);
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("mfaPendingCredential", this.zzb);
        v0_1.put("mfaEnrollmentId", this.zzc);
        this.zza.getClass();
        v0_1.put("mfaProvider", 1);
        if (this.zze != null) {
            org.json.JSONObject v1_3 = new org.json.JSONObject();
            v1_3.put("phoneNumber", this.zze);
            if (!android.text.TextUtils.isEmpty(this.zzf)) {
                v1_3.put("recaptchaToken", this.zzf);
            }
            if (!android.text.TextUtils.isEmpty(this.zzg)) {
                v1_3.put("playIntegrityToken", this.zzg);
            }
            String v2_9 = this.zzh;
            if (v2_9 == null) {
                com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v1_3);
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v1_3, "captchaResponse", v2_9);
            }
            String v2_10 = this.zzi;
            if (v2_10 != null) {
                v1_3.put("autoRetrievalInfo", v2_10.zza());
            }
            v0_1.put("phoneSignInInfo", v1_3);
        }
        return v0_1.toString();
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzagm p1)
    {
        this.zzi = p1;
        return;
    }

    public final String zzb()
    {
        return this.zzd;
    }
}
