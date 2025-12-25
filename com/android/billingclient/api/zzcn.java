package com.android.billingclient.api;
final class zzcn {
    private boolean zza;
    private o2.f zzb;

    public zzcn(android.content.Context p4)
    {
        try {
            r2.r.b(p4);
            this.zzb = r2.r.a().c(p2.a.e).a("PLAY_BILLING_LIBRARY", new o2.c("proto"), new com.android.billingclient.api.zzcm());
            return;
        } catch (Throwable) {
            this.zza = 1;
            return;
        }
    }

    public final void zza(com.google.android.gms.internal.play_billing.zzji p6)
    {
        if (!this.zza) {
            try {
                ((a2.b) this.zzb).l(new o2.a(p6, o2.d.a, 0), new r2.q(0));
                return;
            } catch (Throwable) {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingLogger", "logging failed.");
                return;
            }
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
    }
}
