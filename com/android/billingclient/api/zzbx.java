package com.android.billingclient.api;
public final synthetic class zzbx implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.zzce zza;
    public final synthetic com.android.billingclient.api.AcknowledgePurchaseParams zzb;
    public final synthetic com.android.billingclient.api.AcknowledgePurchaseResponseListener zzc;

    public synthetic zzbx(com.android.billingclient.api.zzce p1, com.android.billingclient.api.AcknowledgePurchaseParams p2, com.android.billingclient.api.AcknowledgePurchaseResponseListener p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.zzce.zzam(this.zza, this.zzb, this.zzc);
        return;
    }
}
