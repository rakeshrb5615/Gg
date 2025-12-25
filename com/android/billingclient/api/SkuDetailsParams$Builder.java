package com.android.billingclient.api;
public class SkuDetailsParams$Builder {
    private String zza;
    private java.util.List zzb;

    private SkuDetailsParams$Builder()
    {
        throw 0;
    }

    public synthetic SkuDetailsParams$Builder(com.android.billingclient.api.zzdb p1)
    {
        return;
    }

    public com.android.billingclient.api.SkuDetailsParams build()
    {
        IllegalArgumentException v0_0 = this.zza;
        if (v0_0 == null) {
            throw new IllegalArgumentException("SKU type must be set");
        } else {
            if (this.zzb == null) {
                throw new IllegalArgumentException("SKU list must be set");
            } else {
                String v1_1 = new com.android.billingclient.api.SkuDetailsParams();
                com.android.billingclient.api.SkuDetailsParams.zza(v1_1, v0_0);
                com.android.billingclient.api.SkuDetailsParams.zzb(v1_1, this.zzb);
                return v1_1;
            }
        }
    }

    public com.android.billingclient.api.SkuDetailsParams$Builder setSkusList(java.util.List p2)
    {
        this.zzb = new java.util.ArrayList(p2);
        return this;
    }

    public com.android.billingclient.api.SkuDetailsParams$Builder setType(String p1)
    {
        this.zza = p1;
        return this;
    }
}
