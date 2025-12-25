package com.android.billingclient.api;
public final synthetic class zzw implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic int zzb;
    public final synthetic String zzc;
    public final synthetic String zzd;
    public final synthetic com.android.billingclient.api.BillingFlowParams zze;
    public final synthetic android.os.Bundle zzf;

    public synthetic zzw(com.android.billingclient.api.BillingClientImpl p1, int p2, String p3, String p4, com.android.billingclient.api.BillingFlowParams p5, android.os.Bundle p6)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p6;
        return;
    }

    public final Object call()
    {
        return com.android.billingclient.api.BillingClientImpl.zze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
