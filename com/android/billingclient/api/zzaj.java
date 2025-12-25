package com.android.billingclient.api;
public final synthetic class zzaj implements java.lang.Runnable {
    public final synthetic java.util.concurrent.Future zza;
    public final synthetic Runnable zzb;

    public synthetic zzaj(java.util.concurrent.Future p1, Runnable p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        String v0_0 = this.zza;
        if ((!v0_0.isDone()) && (!v0_0.isCancelled())) {
            Runnable v1_2 = this.zzb;
            v0_0.cancel(1);
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Async task is taking too long, cancel it!");
            if (v1_2 != null) {
                v1_2.run();
            }
        }
        return;
    }
}
