package com.android.billingclient.api;
public final synthetic class zzae implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.BillingConfigResponseListener zzb;

    public synthetic zzae(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.BillingConfigResponseListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.BillingClientImpl.zzJ(this.zza, this.zzb);
        return;
    }
}
