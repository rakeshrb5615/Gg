package com.android.billingclient.api;
public final synthetic class zzx implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic String zzb;
    public final synthetic String zzc;

    public synthetic zzx(com.android.billingclient.api.BillingClientImpl p1, String p2, String p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final Object call()
    {
        return com.android.billingclient.api.BillingClientImpl.zzd(this.zza, this.zzb, this.zzc);
    }
}
