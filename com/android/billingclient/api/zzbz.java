package com.android.billingclient.api;
public final synthetic class zzbz implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.zzce zza;
    public final synthetic android.app.Activity zzb;
    public final synthetic com.android.billingclient.api.BillingFlowParams zzc;

    public synthetic zzbz(com.android.billingclient.api.zzce p1, android.app.Activity p2, com.android.billingclient.api.BillingFlowParams p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final Object call()
    {
        return com.android.billingclient.api.zzce.zzal(this.zza, this.zzb, this.zzc);
    }
}
