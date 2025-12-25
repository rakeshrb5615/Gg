package com.android.billingclient.api;
public final synthetic class zzbs implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.zzce zza;
    public final synthetic com.android.billingclient.api.QueryProductDetailsParams zzb;
    public final synthetic com.android.billingclient.api.ProductDetailsResponseListener zzc;

    public synthetic zzbs(com.android.billingclient.api.zzce p1, com.android.billingclient.api.QueryProductDetailsParams p2, com.android.billingclient.api.ProductDetailsResponseListener p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.zzce.zzao(this.zza, this.zzb, this.zzc);
        return;
    }
}
