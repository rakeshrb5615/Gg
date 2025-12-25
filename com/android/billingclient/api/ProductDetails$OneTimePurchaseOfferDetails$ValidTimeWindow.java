package com.android.billingclient.api;
public final class ProductDetails$OneTimePurchaseOfferDetails$ValidTimeWindow {
    private final Long zza;
    private final Long zzb;

    public ProductDetails$OneTimePurchaseOfferDetails$ValidTimeWindow(org.json.JSONObject p4)
    {
        long v0_1;
        Long v2 = 0;
        if (!p4.has("startTimeMillis")) {
            v0_1 = 0;
        } else {
            v0_1 = Long.valueOf(p4.optLong("startTimeMillis"));
        }
        this.zza = v0_1;
        if (p4.has("endTimeMillis")) {
            v2 = Long.valueOf(p4.optLong("endTimeMillis"));
        }
        this.zzb = v2;
        return;
    }

    public Long getEndTimeMillis()
    {
        return this.zzb;
    }

    public Long getStartTimeMillis()
    {
        return this.zza;
    }
}
