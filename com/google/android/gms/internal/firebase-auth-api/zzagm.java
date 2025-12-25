package com.google.android.gms.internal.firebase-auth-api;
public final class zzagm {
    private final String zza;

    public zzagm(String p1)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return;
    }

    public final org.json.JSONObject zza()
    {
        org.json.JSONObject v0_1 = new org.json.JSONObject();
        v0_1.put("appSignatureHash", this.zza);
        return v0_1;
    }
}
