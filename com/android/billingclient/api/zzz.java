package com.android.billingclient.api;
public final synthetic class zzz implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener zzb;

    public synthetic zzz(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.BillingClientImpl.zzO(this.zza, this.zzb);
        return;
    }
}
