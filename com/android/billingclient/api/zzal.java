package com.android.billingclient.api;
public final synthetic class zzal implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.ProductDetailsResponseListener zzb;
    public final synthetic com.android.billingclient.api.QueryProductDetailsParams zzc;

    public synthetic zzal(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.ProductDetailsResponseListener p2, com.android.billingclient.api.QueryProductDetailsParams p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final Object call()
    {
        com.android.billingclient.api.BillingClientImpl.zzs(this.zza, this.zzb, this.zzc);
        return 0;
    }
}
