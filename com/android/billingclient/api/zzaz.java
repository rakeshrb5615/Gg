package com.android.billingclient.api;
final class zzaz extends android.os.ResultReceiver {
    final synthetic com.android.billingclient.api.ExternalOfferInformationDialogListener zza;
    final synthetic com.android.billingclient.api.BillingClientImpl zzb;

    public zzaz(com.android.billingclient.api.BillingClientImpl p1, android.os.Handler p2, com.android.billingclient.api.ExternalOfferInformationDialogListener p3)
    {
        this.zza = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        super(p2);
        return;
    }

    public final void onReceiveResult(int p6, android.os.Bundle p7)
    {
        com.android.billingclient.api.BillingResult v0_0 = com.android.billingclient.api.BillingResult.newBuilder();
        v0_0.setResponseCode(p6);
        if (p6 != null) {
            if (p7 != null) {
                com.google.android.gms.internal.play_billing.zzhx v6_2;
                v0_0.setDebugMessage(com.google.android.gms.internal.play_billing.zzc.zzj(p7, "BillingClient"));
                com.google.android.gms.internal.play_billing.zzhx v6_1 = p7.getInt("INTERNAL_LOG_ERROR_REASON");
                com.android.billingclient.api.BillingClientImpl v1_0 = this.zzb;
                if (v6_1 == null) {
                    v6_2 = com.google.android.gms.internal.play_billing.zzie.zzw;
                } else {
                    v6_2 = com.google.android.gms.internal.play_billing.zzie.zzb(v6_1);
                }
                com.android.billingclient.api.BillingClientImpl.zzZ(v1_0, com.android.billingclient.api.zzcg.zzb(v6_2, 25, v0_0.build(), p7.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS"), com.google.android.gms.internal.play_billing.zzil.zza));
            } else {
                com.android.billingclient.api.BillingClientImpl.zzX(this.zzb, this.zza, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.zzaI, 0);
                return;
            }
        }
        this.zza.onExternalOfferInformationDialogResponse(v0_0.build());
        return;
    }
}
