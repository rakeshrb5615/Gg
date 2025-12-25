package com.android.billingclient.api;
public final class InAppMessageResult {
    private final int zza;
    private final String zzb;

    public InAppMessageResult(int p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public String getPurchaseToken()
    {
        return this.zzb;
    }

    public int getResponseCode()
    {
        return this.zza;
    }
}
