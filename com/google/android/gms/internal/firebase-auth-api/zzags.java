package com.google.android.gms.internal.firebase-auth-api;
public final class zzags implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private String zza;
    private String zzb;
    private final String zzc;

    public zzags(String p1, String p2)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zzb = "http://localhost";
        this.zzc = p2;
        return;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("identifier", this.zza);
        v0_1.put("continueUri", this.zzb);
        String v1_2 = this.zzc;
        if (v1_2 != null) {
            v0_1.put("tenantId", v1_2);
        }
        return v0_1.toString();
    }
}
