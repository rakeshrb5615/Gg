package com.android.billingclient.api;
public final class ProductDetails$OneTimePurchaseOfferDetails$DiscountDisplayInfo$DiscountAmount {
    private final String zza;
    private final long zzb;
    private final String zzc;

    public ProductDetails$OneTimePurchaseOfferDetails$DiscountDisplayInfo$DiscountAmount(org.json.JSONObject p3)
    {
        this.zza = p3.optString("formattedDiscountAmount");
        this.zzb = p3.optLong("discountAmountMicros");
        this.zzc = p3.optString("discountAmountCurrencyCode");
        return;
    }

    public String getDiscountAmountCurrencyCode()
    {
        return this.zzc;
    }

    public long getDiscountAmountMicros()
    {
        return this.zzb;
    }

    public String getFormattedDiscountAmount()
    {
        return this.zza;
    }
}
