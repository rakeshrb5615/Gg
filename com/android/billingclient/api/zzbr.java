package com.android.billingclient.api;
public final synthetic class zzbr implements p0.a {
    public final synthetic com.android.billingclient.api.ProductDetailsResponseListener zza;

    public synthetic zzbr(com.android.billingclient.api.ProductDetailsResponseListener p1)
    {
        this.zza = p1;
        return;
    }

    public final void accept(Object p4)
    {
        this.zza.onProductDetailsResponse(((com.android.billingclient.api.BillingResult) p4), new com.android.billingclient.api.QueryProductDetailsResult(new java.util.ArrayList(), new java.util.ArrayList()));
        return;
    }
}
