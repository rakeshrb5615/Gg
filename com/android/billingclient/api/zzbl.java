package com.android.billingclient.api;
final class zzbl extends com.google.android.gms.internal.play_billing.zzag {
    final com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener zza;
    final com.android.billingclient.api.zzch zzb;
    final int zzc;

    public synthetic zzbl(com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener p1, com.android.billingclient.api.zzch p2, int p3, com.android.billingclient.api.zzbp p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final void zza(android.os.Bundle p7)
    {
        if (p7 != null) {
            com.google.android.gms.internal.play_billing.zzie v3_3 = com.google.android.gms.internal.play_billing.zzc.zzb(p7, "BillingClient");
            com.android.billingclient.api.BillingResult v7_4 = com.android.billingclient.api.zzcj.zza(v3_3, com.google.android.gms.internal.play_billing.zzc.zzj(p7, "BillingClient"));
            if (v3_3 != null) {
                com.google.android.gms.internal.play_billing.zzil v4_1 = new StringBuilder("isAlternativeBillingOnlyAvailableAsync() failed. Response code: ");
                v4_1.append(v3_3);
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", v4_1.toString());
                this.zzb.zzb(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzw, 14, v7_4, 0, com.google.android.gms.internal.play_billing.zzil.zza), this.zzc);
            }
            this.zza.onAlternativeBillingOnlyAvailabilityResponse(v7_4);
            return;
        } else {
            com.google.android.gms.internal.play_billing.zzie v3_2 = com.android.billingclient.api.zzcj.zzh;
            this.zzb.zzb(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzao, 14, v3_2, 0, com.google.android.gms.internal.play_billing.zzil.zza), this.zzc);
            this.zza.onAlternativeBillingOnlyAvailabilityResponse(v3_2);
            return;
        }
    }
}
