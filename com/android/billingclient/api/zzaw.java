package com.android.billingclient.api;
final class zzaw implements java.util.concurrent.Callable {
    final synthetic com.android.billingclient.api.PurchasesResponseListener zza;
    final synthetic String zzb;
    final synthetic com.android.billingclient.api.BillingClientImpl zzc;

    public zzaw(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.PurchasesResponseListener p2, String p3, boolean p4)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final bridge synthetic Object call()
    {
        com.android.billingclient.api.BillingResult v0_0 = this.zzc;
        if (com.android.billingclient.api.BillingClientImpl.zzah(v0_0, 30000)) {
            com.android.billingclient.api.PurchasesResponseListener v1_10 = this.zzb;
            if (!android.text.TextUtils.isEmpty(v1_10)) {
                com.android.billingclient.api.BillingResult v0_1 = com.android.billingclient.api.BillingClientImpl.zzaj(v0_0, v1_10, 0, 9);
                if (v0_1.zzb() == null) {
                    this.zza.onQueryPurchasesResponse(v0_1.zza(), com.google.android.gms.internal.play_billing.zzbt.zzk());
                } else {
                    this.zza.onQueryPurchasesResponse(v0_1.zza(), v0_1.zzb());
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Please provide a valid product type.");
                int v3_2 = com.android.billingclient.api.zzcj.zze;
                com.android.billingclient.api.BillingClientImpl.zzak(v0_0, com.google.android.gms.internal.play_billing.zzie.zzX, 9, v3_2);
                this.zza.onQueryPurchasesResponse(v3_2, com.google.android.gms.internal.play_billing.zzbt.zzk());
            }
        } else {
            int v3_3 = com.android.billingclient.api.zzcj.zzj;
            com.android.billingclient.api.BillingClientImpl.zzak(v0_0, com.google.android.gms.internal.play_billing.zzie.zzb, 9, v3_3);
            this.zza.onQueryPurchasesResponse(v3_3, com.google.android.gms.internal.play_billing.zzbt.zzk());
        }
        return 0;
    }
}
