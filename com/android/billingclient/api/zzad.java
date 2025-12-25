package com.android.billingclient.api;
public final synthetic class zzad implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.BillingConfigResponseListener zzb;

    public synthetic zzad(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.BillingConfigResponseListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final Object call()
    {
        com.android.billingclient.api.BillingClientImpl.zzv(this.zza, this.zzb);
        return 0;
    }
}
