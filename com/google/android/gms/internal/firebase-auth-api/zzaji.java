package com.google.android.gms.internal.firebase-auth-api;
public final class zzaji implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzaji(String p1, String p2, String p3)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzc = p3;
        return;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("idToken", this.zza);
        v0_1.put("mfaEnrollmentId", this.zzb);
        String v1_2 = this.zzc;
        if (v1_2 != null) {
            v0_1.put("tenantId", v1_2);
        }
        return v0_1.toString();
    }
}
