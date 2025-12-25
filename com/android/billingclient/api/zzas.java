package com.android.billingclient.api;
public final synthetic class zzas implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic android.os.Bundle zzb;
    public final synthetic android.app.Activity zzc;
    public final synthetic android.os.ResultReceiver zzd;

    public synthetic zzas(com.android.billingclient.api.BillingClientImpl p1, android.os.Bundle p2, android.app.Activity p3, android.os.ResultReceiver p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public final Object call()
    {
        com.android.billingclient.api.BillingClientImpl.zzu(this.zza, this.zzb, this.zzc, this.zzd);
        return 0;
    }
}
