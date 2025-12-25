package com.android.billingclient.api;
public final synthetic class zzat implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.PurchasesResponseListener zzb;

    public synthetic zzat(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.PurchasesResponseListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.BillingClientImpl.zzI(this.zza, this.zzb);
        return;
    }
}
