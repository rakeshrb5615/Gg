package com.android.billingclient.api;
public class QueryPurchasesParams$Builder {
    private String zza;

    private QueryPurchasesParams$Builder()
    {
        throw 0;
    }

    public synthetic QueryPurchasesParams$Builder(com.android.billingclient.api.zzda p1)
    {
        return;
    }

    public static bridge synthetic String zza(com.android.billingclient.api.QueryPurchasesParams$Builder p0)
    {
        return p0.zza;
    }

    public com.android.billingclient.api.QueryPurchasesParams build()
    {
        if (this.zza == null) {
            throw new IllegalArgumentException("Product type must be set");
        } else {
            return new com.android.billingclient.api.QueryPurchasesParams(this, 0);
        }
    }

    public com.android.billingclient.api.QueryPurchasesParams$Builder setProductType(String p1)
    {
        this.zza = p1;
        return this;
    }
}
