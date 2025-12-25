package com.android.billingclient.api;
public final synthetic class zzah implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener zzb;

    public synthetic zzah(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final Object call()
    {
        com.android.billingclient.api.BillingClientImpl.zzE(this.zza, this.zzb);
        return 0;
    }
}
