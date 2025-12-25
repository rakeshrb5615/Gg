package com.android.billingclient.api;
public final synthetic class zzv implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.ExternalOfferAvailabilityListener zzb;

    public synthetic zzv(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.ExternalOfferAvailabilityListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.BillingClientImpl.zzM(this.zza, this.zzb);
        return;
    }
}
