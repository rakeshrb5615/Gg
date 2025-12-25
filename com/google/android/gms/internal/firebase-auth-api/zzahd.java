package com.google.android.gms.internal.firebase-auth-api;
public final class zzahd implements com.google.android.gms.internal.firebase-auth-api.zzagz {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzahd(String p1, String p2, String p3, String p4, String p5, String p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzc = p3;
        this.zzd = p4;
        this.zzb = p5;
        this.zze = p6;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzahd zza(String p7, String p8, String p9, String p10, String p11)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p9);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p8);
        return new com.google.android.gms.internal.firebase-auth-api.zzahd("phone", p7, p8, p9, p10, p11);
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
        v0_1.put("mfaProvider", 1);
        String v1_5 = this.zzb;
        if (v1_5 != null) {
            v0_1.put("displayName", v1_5);
        }
        String v1_1 = new org.json.JSONObject();
        String v2_1 = this.zzc;
        if (v2_1 != null) {
            v1_1.put("sessionInfo", v2_1);
        }
        String v2_2 = this.zzd;
        if (v2_2 != null) {
            v1_1.put("code", v2_2);
        }
        v0_1.put("phoneVerificationInfo", v1_1);
        String v1_3 = this.zze;
        if (v1_3 != null) {
            v0_1.put("tenantId", v1_3);
        }
        return v0_1.toString();
    }
}
