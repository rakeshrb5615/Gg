package com.android.billingclient.api;
public final synthetic class zzaa implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.AcknowledgePurchaseResponseListener zzb;
    public final synthetic com.android.billingclient.api.AcknowledgePurchaseParams zzc;

    public synthetic zzaa(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.AcknowledgePurchaseResponseListener p2, com.android.billingclient.api.AcknowledgePurchaseParams p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final Object call()
    {
        com.android.billingclient.api.BillingClientImpl.zzt(this.zza, this.zzb, this.zzc);
        return 0;
    }
}
