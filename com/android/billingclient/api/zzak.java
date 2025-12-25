package com.android.billingclient.api;
public final synthetic class zzak implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.ConsumeResponseListener zzb;
    public final synthetic com.android.billingclient.api.ConsumeParams zzc;

    public synthetic zzak(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.ConsumeResponseListener p2, com.android.billingclient.api.ConsumeParams p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final Object call()
    {
        com.android.billingclient.api.BillingClientImpl.zzr(this.zza, this.zzb, this.zzc);
        return 0;
    }
}
