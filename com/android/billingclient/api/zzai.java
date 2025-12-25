package com.android.billingclient.api;
public final synthetic class zzai implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener zzb;

    public synthetic zzai(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.BillingClientImpl.zzK(this.zza, this.zzb);
        return;
    }
}
