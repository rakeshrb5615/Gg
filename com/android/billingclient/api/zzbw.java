package com.android.billingclient.api;
public final synthetic class zzbw implements p0.a {
    public final synthetic com.android.billingclient.api.AcknowledgePurchaseResponseListener zza;

    public synthetic zzbw(com.android.billingclient.api.AcknowledgePurchaseResponseListener p1)
    {
        this.zza = p1;
        return;
    }

    public final void accept(Object p2)
    {
        this.zza.onAcknowledgePurchaseResponse(((com.android.billingclient.api.BillingResult) p2));
        return;
    }
}
