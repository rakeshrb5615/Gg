package com.android.billingclient.api;
public final class AcknowledgePurchaseParams$Builder {
    private String zza;

    private AcknowledgePurchaseParams$Builder()
    {
        throw 0;
    }

    public synthetic AcknowledgePurchaseParams$Builder(com.android.billingclient.api.zza p1)
    {
        return;
    }

    public com.android.billingclient.api.AcknowledgePurchaseParams build()
    {
        IllegalArgumentException v0_0 = this.zza;
        if (v0_0 == null) {
            throw new IllegalArgumentException("Purchase token must be set");
        } else {
            String v1_2 = new com.android.billingclient.api.AcknowledgePurchaseParams(0);
            com.android.billingclient.api.AcknowledgePurchaseParams.zza(v1_2, v0_0);
            return v1_2;
        }
    }

    public com.android.billingclient.api.AcknowledgePurchaseParams$Builder setPurchaseToken(String p1)
    {
        this.zza = p1;
        return this;
    }
}
