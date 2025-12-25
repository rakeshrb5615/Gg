package com.android.billingclient.api;
final class zzbj extends com.google.android.gms.internal.play_billing.zzac {
    final com.android.billingclient.api.BillingConfigResponseListener zza;
    final com.android.billingclient.api.zzch zzb;
    final int zzc;

    public synthetic zzbj(com.android.billingclient.api.BillingConfigResponseListener p1, com.android.billingclient.api.zzch p2, int p3, com.android.billingclient.api.zzbp p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final void zza(android.os.Bundle p7)
    {
        if (p7 != null) {
            com.android.billingclient.api.BillingResult v3_6 = com.google.android.gms.internal.play_billing.zzc.zzb(p7, "BillingClient");
            com.google.android.gms.internal.play_billing.zzil v4_5 = com.google.android.gms.internal.play_billing.zzc.zzj(p7, "BillingClient");
            com.android.billingclient.api.BillingResult$Builder v5 = com.android.billingclient.api.BillingResult.newBuilder();
            v5.setResponseCode(v3_6);
            v5.setDebugMessage(v4_5);
            if (v3_6 == null) {
                if (p7.containsKey("BILLING_CONFIG")) {
                    try {
                        this.zza.onBillingConfigResponse(v5.build(), new com.android.billingclient.api.BillingConfig(p7.getString("BILLING_CONFIG")));
                        return;
                    } catch (com.android.billingclient.api.BillingConfigResponseListener v7_3) {
                        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", v7_3);
                        com.android.billingclient.api.BillingResult v3_4 = com.android.billingclient.api.zzcj.zzh;
                        this.zzb.zzb(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzam, 13, v3_4, 0, com.google.android.gms.internal.play_billing.zzil.zza), this.zzc);
                        this.zza.onBillingConfigResponse(v3_4, 0);
                        return;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                    v5.setResponseCode(6);
                    com.android.billingclient.api.BillingConfigResponseListener v7_8 = v5.build();
                    this.zzb.zzb(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzal, 13, v7_8, 0, com.google.android.gms.internal.play_billing.zzil.zza), this.zzc);
                    this.zza.onBillingConfigResponse(v7_8, 0);
                    return;
                }
            } else {
                com.android.billingclient.api.BillingConfigResponseListener v7_10 = new StringBuilder("getBillingConfig() failed. Response code: ");
                v7_10.append(v3_6);
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", v7_10.toString());
                com.android.billingclient.api.BillingConfigResponseListener v7_12 = v5.build();
                this.zzb.zzb(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzw, 13, v7_12, 0, com.google.android.gms.internal.play_billing.zzil.zza), this.zzc);
                this.zza.onBillingConfigResponse(v7_12, 0);
                return;
            }
        } else {
            com.android.billingclient.api.BillingResult v3_10 = com.android.billingclient.api.zzcj.zzh;
            this.zzb.zzb(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzak, 13, v3_10, 0, com.google.android.gms.internal.play_billing.zzil.zza), this.zzc);
            this.zza.onBillingConfigResponse(v3_10, 0);
            return;
        }
    }
}
