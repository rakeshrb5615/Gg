package com.android.billingclient.api;
final class zzbc implements com.android.billingclient.api.BillingClientStateListener {
    final synthetic com.google.android.gms.internal.play_billing.zzp zza;
    final synthetic com.android.billingclient.api.BillingClientImpl zzb;

    public zzbc(com.android.billingclient.api.BillingClientImpl p1, com.google.android.gms.internal.play_billing.zzp p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void onBillingServiceDisconnected()
    {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Reconnection attempt failed.");
        try {
            this.zza.zzb(com.android.billingclient.api.zzcj.zzj);
        } catch (com.android.billingclient.api.BillingClientImpl v0_2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception setting completer.", v0_2);
        }
        com.android.billingclient.api.BillingClientImpl v0_3 = this.zzb;
        if (com.android.billingclient.api.BillingClientImpl.zzh(v0_3) != null) {
            v0_3.zzag(new com.android.billingclient.api.zzba(this));
        }
        return;
    }

    public final void onBillingSetupFinished(com.android.billingclient.api.BillingResult p4)
    {
        com.android.billingclient.api.BillingClientImpl v0_0 = p4.getResponseCode();
        com.android.billingclient.api.zzbb v1_4 = new StringBuilder("Reconnection finished with result: ");
        v1_4.append(v0_0);
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", v1_4.toString());
        try {
            this.zza.zzb(p4);
        } catch (com.android.billingclient.api.BillingClientImpl v0_2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Exception setting completer.", v0_2);
        }
        com.android.billingclient.api.BillingClientImpl v0_3 = this.zzb;
        if (com.android.billingclient.api.BillingClientImpl.zzh(v0_3) != null) {
            v0_3.zzag(new com.android.billingclient.api.zzbb(this, p4));
        }
        return;
    }
}
