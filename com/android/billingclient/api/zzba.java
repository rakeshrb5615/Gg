package com.android.billingclient.api;
public final synthetic class zzba implements java.lang.Runnable {
    public final synthetic com.android.billingclient.api.zzbc zza;

    public synthetic zzba(com.android.billingclient.api.zzbc p1)
    {
        this.zza = p1;
        return;
    }

    public final void run()
    {
        try {
            com.android.billingclient.api.BillingClientImpl.zzh(this.zza.zzb).onBillingServiceDisconnected();
            return;
        } catch (Throwable v0_3) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception calling onBillingServiceDisconnected.", v0_3);
            return;
        }
    }
}
