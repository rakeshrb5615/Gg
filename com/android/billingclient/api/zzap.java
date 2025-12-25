package com.android.billingclient.api;
public final synthetic class zzap implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.ProductDetailsResponseListener zzb;

    public synthetic zzap(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.ProductDetailsResponseListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.BillingClientImpl.zzN(this.zza, this.zzb);
        return;
    }
}
