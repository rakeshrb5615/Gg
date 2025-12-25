package com.android.billingclient.api;
public final synthetic class zzaq implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.ExternalOfferReportingDetailsListener zzb;

    public synthetic zzaq(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.ExternalOfferReportingDetailsListener p2, String p3)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final Object call()
    {
        com.android.billingclient.api.BillingClientImpl.zzC(this.zza, this.zzb, 0);
        return 0;
    }
}
