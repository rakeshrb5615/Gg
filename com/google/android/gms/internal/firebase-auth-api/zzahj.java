package com.google.android.gms.internal.firebase-auth-api;
public final class zzahj implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private String zza;
    private String zzb;

    public zzahj(String p2)
    {
        this.zza = com.google.android.gms.internal.firebase-auth-api.zzahh.zza.toString();
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        return;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("grantType", this.zza);
        v0_1.put("refreshToken", this.zzb);
        return v0_1.toString();
    }
}
