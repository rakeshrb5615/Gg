package com.android.billingclient.api;
public final synthetic class zzac implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.BillingResult zzb;

    public synthetic zzac(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.BillingResult p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.BillingClientImpl.zzP(this.zza, this.zzb);
        return;
    }
}
