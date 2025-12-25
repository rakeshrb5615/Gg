package com.android.billingclient.api;
final class zzax extends android.os.ResultReceiver {
    final synthetic com.android.billingclient.api.InAppMessageResponseListener zza;

    public zzax(com.android.billingclient.api.BillingClientImpl p1, android.os.Handler p2, com.android.billingclient.api.InAppMessageResponseListener p3)
    {
        this.zza = p3;
        java.util.Objects.requireNonNull(p1);
        super(p2);
        return;
    }

    public final void onReceiveResult(int p2, android.os.Bundle p3)
    {
        this.zza.onInAppMessageResponse(com.google.android.gms.internal.play_billing.zzc.zzi(p3, "BillingClient"));
        return;
    }
}
