package com.android.billingclient.api;
public final class AcknowledgePurchaseParams {
    private String zza;

    private AcknowledgePurchaseParams()
    {
        throw 0;
    }

    public synthetic AcknowledgePurchaseParams(com.android.billingclient.api.zza p1)
    {
        return;
    }

    public static com.android.billingclient.api.AcknowledgePurchaseParams$Builder newBuilder()
    {
        return new com.android.billingclient.api.AcknowledgePurchaseParams$Builder(0);
    }

    public static bridge synthetic void zza(com.android.billingclient.api.AcknowledgePurchaseParams p0, String p1)
    {
        p0.zza = p1;
        return;
    }

    public String getPurchaseToken()
    {
        return this.zza;
    }
}
