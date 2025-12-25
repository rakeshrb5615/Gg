package com.android.billingclient.api;
public final synthetic class zzbb implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.zzbc zza;
    public final synthetic com.android.billingclient.api.BillingResult zzb;

    public synthetic zzbb(com.android.billingclient.api.zzbc p1, com.android.billingclient.api.BillingResult p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        try {
            com.android.billingclient.api.BillingClientImpl.zzh(this.zza.zzb).onBillingSetupFinished(this.zzb);
            return;
        } catch (Throwable v0_3) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception calling onBillingSetupFinished.", v0_3);
            return;
        }
    }
}
