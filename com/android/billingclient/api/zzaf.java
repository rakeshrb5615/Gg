package com.android.billingclient.api;
public final synthetic class zzaf implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener zzb;

    public synthetic zzaf(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final Object call()
    {
        com.android.billingclient.api.BillingClientImpl.zzD(this.zza, this.zzb);
        return 0;
    }
}
