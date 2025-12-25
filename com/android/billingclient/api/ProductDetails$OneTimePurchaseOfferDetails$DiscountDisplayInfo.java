package com.android.billingclient.api;
public final class ProductDetails$OneTimePurchaseOfferDetails$DiscountDisplayInfo {
    private final Integer zza;
    private final com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$DiscountDisplayInfo$DiscountAmount zzb;

    public ProductDetails$OneTimePurchaseOfferDetails$DiscountDisplayInfo(org.json.JSONObject p4)
    {
        String v0_1;
        com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$DiscountDisplayInfo$DiscountAmount v2_1 = 0;
        if (!p4.has("percentageDiscount")) {
            v0_1 = 0;
        } else {
            v0_1 = Integer.valueOf(p4.optInt("percentageDiscount"));
        }
        this.zza = v0_1;
        org.json.JSONObject v4_1 = p4.optJSONObject("discountAmount");
        if (v4_1 != null) {
            v2_1 = new com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$DiscountDisplayInfo$DiscountAmount(v4_1);
        }
        this.zzb = v2_1;
        return;
    }

    public com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$DiscountDisplayInfo$DiscountAmount getDiscountAmount()
    {
        return this.zzb;
    }

    public Integer getPercentageDiscount()
    {
        return this.zza;
    }
}
