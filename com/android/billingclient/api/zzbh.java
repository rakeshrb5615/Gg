package com.android.billingclient.api;
final class zzbh extends com.google.android.gms.internal.play_billing.zzy {
    final com.android.billingclient.api.ExternalOfferReportingDetailsListener zza;
    final com.android.billingclient.api.zzch zzb;
    final int zzc;

    public synthetic zzbh(com.android.billingclient.api.ExternalOfferReportingDetailsListener p1, com.android.billingclient.api.zzch p2, int p3, com.android.billingclient.api.zzbp p4)
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
            com.google.android.gms.internal.play_billing.zzil v4_3 = com.android.billingclient.api.zzcj.zza(v3_6, com.google.android.gms.internal.play_billing.zzc.zzj(p7, "BillingClient"));
            if (v3_6 == null) {
                try {
                    this.zza.onExternalOfferReportingDetailsResponse(v4_3, new com.android.billingclient.api.ExternalOfferReportingDetails(p7.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
                    return;
                } catch (com.android.billingclient.api.ExternalOfferReportingDetailsListener v7_3) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", v7_3);
                    com.android.billingclient.api.BillingResult v3_4 = com.android.billingclient.api.zzcj.zzh;
                    this.zzb.zzb(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzaH, 24, v3_4, 0, com.google.android.gms.internal.play_billing.zzil.zza), this.zzc);
                    this.zza.onExternalOfferReportingDetailsResponse(v3_4, 0);
                    return;
                }
            } else {
                com.android.billingclient.api.ExternalOfferReportingDetailsListener v7_7 = new StringBuilder("createExternalOfferReportingDetailsAsync() failed. Response code: ");
                v7_7.append(v3_6);
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", v7_7.toString());
                this.zzb.zzb(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzw, 24, v4_3, 0, com.google.android.gms.internal.play_billing.zzil.zza), this.zzc);
                this.zza.onExternalOfferReportingDetailsResponse(v4_3, 0);
                return;
            }
        } else {
            com.android.billingclient.api.BillingResult v3_7 = com.android.billingclient.api.zzcj.zzh;
            this.zzb.zzb(com.android.billingclient.api.zzcg.zzb(com.google.android.gms.internal.play_billing.zzie.zzaG, 24, v3_7, 0, com.google.android.gms.internal.play_billing.zzil.zza), this.zzc);
            this.zza.onExternalOfferReportingDetailsResponse(v3_7, 0);
            return;
        }
    }
}
