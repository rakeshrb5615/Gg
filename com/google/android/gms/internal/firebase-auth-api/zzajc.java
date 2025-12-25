package com.google.android.gms.internal.firebase-auth-api;
public final class zzajc implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private String zza;
    private String zzb;

    public zzajc(String p1, String p2)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zzb = p2;
        return;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("token", this.zza);
        v0_1.put("returnSecureToken", 1);
        String v1_2 = this.zzb;
        if (v1_2 != null) {
            v0_1.put("tenantId", v1_2);
        }
        return v0_1.toString();
    }
}
