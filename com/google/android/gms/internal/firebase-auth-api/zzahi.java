package com.google.android.gms.internal.firebase-auth-api;
public final class zzahi implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private String zza;

    public zzahi(String p1)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("idToken", this.zza);
        return v0_1.toString();
    }
}
