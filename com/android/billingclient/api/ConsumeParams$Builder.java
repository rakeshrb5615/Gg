package com.android.billingclient.api;
public final class ConsumeParams$Builder {
    private String zza;

    private ConsumeParams$Builder()
    {
        throw 0;
    }

    public synthetic ConsumeParams$Builder(com.android.billingclient.api.zzck p1)
    {
        return;
    }

    public com.android.billingclient.api.ConsumeParams build()
    {
        IllegalArgumentException v0_0 = this.zza;
        if (v0_0 == null) {
            throw new IllegalArgumentException("Purchase token must be set");
        } else {
            String v1_2 = new com.android.billingclient.api.ConsumeParams(0);
            com.android.billingclient.api.ConsumeParams.zza(v1_2, v0_0);
            return v1_2;
        }
    }

    public com.android.billingclient.api.ConsumeParams$Builder setPurchaseToken(String p1)
    {
        this.zza = p1;
        return this;
    }
}
