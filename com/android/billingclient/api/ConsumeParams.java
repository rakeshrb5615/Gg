package com.android.billingclient.api;
public final class ConsumeParams {
    private String zza;

    private ConsumeParams()
    {
        throw 0;
    }

    public synthetic ConsumeParams(com.android.billingclient.api.zzck p1)
    {
        return;
    }

    public static com.android.billingclient.api.ConsumeParams$Builder newBuilder()
    {
        return new com.android.billingclient.api.ConsumeParams$Builder(0);
    }

    public static bridge synthetic void zza(com.android.billingclient.api.ConsumeParams p0, String p1)
    {
        p0.zza = p1;
        return;
    }

    public String getPurchaseToken()
    {
        return this.zza;
    }
}
