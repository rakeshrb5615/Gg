package com.android.billingclient.api;
public final synthetic class zzab implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.AcknowledgePurchaseResponseListener zzb;

    public synthetic zzab(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.AcknowledgePurchaseResponseListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.BillingClientImpl.zzL(this.zza, this.zzb);
        return;
    }
}
