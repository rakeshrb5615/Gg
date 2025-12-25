package com.android.billingclient.api;
public final synthetic class zzy implements java.util.concurrent.Callable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener zzb;
    public final synthetic android.app.Activity zzc;
    public final synthetic android.os.ResultReceiver zzd;

    public synthetic zzy(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener p2, android.app.Activity p3, android.os.ResultReceiver p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public final Object call()
    {
        com.android.billingclient.api.BillingClientImpl.zzz(this.zza, this.zzb, this.zzc, this.zzd);
        return 0;
    }
}
