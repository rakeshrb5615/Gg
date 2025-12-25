package com.google.android.gms.internal.firebase-auth-api;
public final class zzahe implements com.google.android.gms.internal.firebase-auth-api.zzahb {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    private zzahe(String p1, String p2, String p3, String p4, String p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzahe zza(String p6, String p7, String p8, String p9)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p7);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p9);
        return new com.google.android.gms.internal.firebase-auth-api.zzahe("totp", p6, p7, p8, p9);
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        String v1_4 = new org.json.JSONObject();
        String v2_3 = this.zzb;
        if (v2_3 != null) {
            v1_4.put("verificationCode", v2_3);
        }
        v0_1.put("totpVerificationInfo", v1_4);
        v0_1.put("mfaPendingCredential", this.zza);
        String v1_1 = this.zzc;
        if (v1_1 != null) {
            v0_1.put("tenantId", v1_1);
        }
        String v1_2 = this.zzd;
        if (v1_2 != null) {
            v0_1.put("mfaEnrollmentId", v1_2);
        }
        return v0_1.toString();
    }
}
