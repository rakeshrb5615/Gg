package com.android.billingclient.api;
final class zzca implements com.google.android.gms.internal.play_billing.zzcs {
    final synthetic p0.a zza;
    final synthetic Runnable zzb;
    final synthetic com.android.billingclient.api.zzce zzc;
    final synthetic int zzd;

    public zzca(com.android.billingclient.api.zzce p1, int p2, p0.a p3, Runnable p4)
    {
        this.zzd = p2;
        this.zza = p3;
        this.zzb = p4;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void zza(Throwable p6)
    {
        if (!(p6 instanceof java.util.concurrent.TimeoutException)) {
            com.android.billingclient.api.zzce.zzaw(this.zzc, com.google.android.gms.internal.play_billing.zzie.zzaQ, 28, com.android.billingclient.api.zzcj.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", p6);
        } else {
            com.android.billingclient.api.zzce.zzaw(this.zzc, com.google.android.gms.internal.play_billing.zzie.zzaX, 28, com.android.billingclient.api.zzcj.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", p6);
        }
        this.zzb.run();
        return;
    }

    public final bridge synthetic void zzb(Object p3)
    {
        com.android.billingclient.api.zzce v1 = this.zzc;
        if (!com.android.billingclient.api.zzce.zzas(v1, ((Integer) p3).intValue())) {
            this.zzb.run();
            return;
        } else {
            this.zza.accept(com.android.billingclient.api.zzce.zzau(v1, this.zzd, ((Integer) p3).intValue()));
            return;
        }
    }
}
