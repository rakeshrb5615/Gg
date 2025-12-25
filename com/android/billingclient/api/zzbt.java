package com.android.billingclient.api;
public final synthetic class zzbt implements p0.a {
    public final synthetic com.android.billingclient.api.ConsumeResponseListener zza;
    public final synthetic com.android.billingclient.api.ConsumeParams zzb;

    public synthetic zzbt(com.android.billingclient.api.ConsumeResponseListener p1, com.android.billingclient.api.ConsumeParams p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void accept(Object p3)
    {
        this.zza.onConsumeResponse(((com.android.billingclient.api.BillingResult) p3), this.zzb.getPurchaseToken());
        return;
    }
}
