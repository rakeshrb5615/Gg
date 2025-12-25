package com.google.android.gms.internal.firebase-auth-api;
public final class zzahc implements com.google.android.gms.internal.firebase-auth-api.zzahb {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    private zzahc(String p1, String p2, String p3, String p4, String p5)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzahc zza(String p6, String p7, String p8, String p9)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p8);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p7);
        return new com.google.android.gms.internal.firebase-auth-api.zzahc("phone", p6, p7, p8, p9);
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("mfaProvider", 1);
        String v1_4 = new org.json.JSONObject();
        String v2_5 = this.zzb;
        if (v2_5 != null) {
            v1_4.put("sessionInfo", v2_5);
        }
        String v2_0 = this.zzc;
        if (v2_0 != null) {
            v1_4.put("code", v2_0);
        }
        v0_1.put("phoneVerificationInfo", v1_4);
        v0_1.put("mfaPendingCredential", this.zza);
        String v1_2 = this.zzd;
        if (v1_2 != null) {
            v0_1.put("tenantId", v1_2);
        }
        return v0_1.toString();
    }
}
