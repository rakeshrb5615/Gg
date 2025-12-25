package com.google.android.gms.internal.firebase-auth-api;
public final class zzaic implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzaic(String p1, String p2, String p3)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("oobCode", this.zza);
        String v1_1 = this.zzb;
        if (v1_1 != null) {
            v0_1.put("newPassword", v1_1);
        }
        String v1_2 = this.zzc;
        if (v1_2 != null) {
            v0_1.put("tenantId", v1_2);
        }
        return v0_1.toString();
    }

    public final String zzb()
    {
        return this.zzb;
    }
}
