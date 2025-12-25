package com.android.billingclient.api;
public final class ProductDetails$OneTimePurchaseOfferDetails$LimitedQuantityInfo {
    private final int zza;
    private final int zzb;

    public ProductDetails$OneTimePurchaseOfferDetails$LimitedQuantityInfo(org.json.JSONObject p2)
    {
        this.zza = p2.getInt("maximumQuantity");
        this.zzb = p2.getInt("remainingQuantity");
        return;
    }

    public int getMaximumQuantity()
    {
        return this.zza;
    }

    public int getRemainingQuantity()
    {
        return this.zzb;
    }
}
