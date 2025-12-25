package com.android.billingclient.api;
public final synthetic class zzao implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.BillingClientImpl zza;
    public final synthetic com.android.billingclient.api.ExternalOfferInformationDialogListener zzb;

    public synthetic zzao(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.ExternalOfferInformationDialogListener p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        com.android.billingclient.api.BillingClientImpl.zzQ(this.zza, this.zzb);
        return;
    }
}
