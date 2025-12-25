package com.android.billingclient.api;
public class QueryPurchaseHistoryParams$Builder {
    private String zza;

    private QueryPurchaseHistoryParams$Builder()
    {
        throw 0;
    }

    public synthetic QueryPurchaseHistoryParams$Builder(com.android.billingclient.api.zzcz p1)
    {
        return;
    }

    public com.android.billingclient.api.QueryPurchaseHistoryParams build()
    {
        if (this.zza == null) {
            throw new IllegalArgumentException("Product type must be set");
        } else {
            return new com.android.billingclient.api.QueryPurchaseHistoryParams(this, 0);
        }
    }

    public com.android.billingclient.api.QueryPurchaseHistoryParams$Builder setProductType(String p1)
    {
        this.zza = p1;
        return this;
    }
}
