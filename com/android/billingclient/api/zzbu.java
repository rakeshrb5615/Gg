package com.android.billingclient.api;
public final synthetic class zzbu implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.zzce zza;
    public final synthetic com.android.billingclient.api.ConsumeParams zzb;
    public final synthetic com.android.billingclient.api.ConsumeResponseListener zzc;

    public synthetic zzbu(com.android.billingclient.api.zzce p1, com.android.billingclient.api.ConsumeParams p2, com.android.billingclient.api.ConsumeResponseListener p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.zzce.zzan(this.zza, this.zzb, this.zzc);
        return;
    }
}
