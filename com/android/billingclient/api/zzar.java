package com.android.billingclient.api;
public final synthetic class zzar implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.ExternalOfferReportingDetailsListener zzb;

    public synthetic zzar(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.ExternalOfferReportingDetailsListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.BillingClientImpl.zzR(this.zza, this.zzb);
        return;
    }
}
