package com.android.billingclient.api;
public final class ProductDetails$OneTimePurchaseOfferDetails {
    private final String zza;
    private final long zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final java.util.List zzg;
    private final Long zzh;
    private final com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$DiscountDisplayInfo zzi;
    private final com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$ValidTimeWindow zzj;
    private final com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$LimitedQuantityInfo zzk;
    private final String zzl;
    private final com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$RentalDetails zzm;
    private final com.android.billingclient.api.zzcs zzn;

    public ProductDetails$OneTimePurchaseOfferDetails(org.json.JSONObject p6)
    {
        this.zza = p6.optString("formattedPrice");
        this.zzb = p6.optLong("priceAmountMicros");
        this.zzc = p6.optString("priceCurrencyCode");
        com.android.billingclient.api.ProductDetails$PricingPhases v0_8 = p6.optString("offerIdToken");
        com.android.billingclient.api.zzcs v2_1 = 0;
        if (1 == v0_8.isEmpty()) {
            v0_8 = 0;
        }
        this.zzd = v0_8;
        com.android.billingclient.api.ProductDetails$PricingPhases v0_10 = p6.optString("offerId");
        if (1 == v0_10.isEmpty()) {
            v0_10 = 0;
        }
        this.zze = v0_10;
        com.android.billingclient.api.ProductDetails$PricingPhases v0_13 = p6.optString("purchaseOptionId");
        if (1 == v0_13.isEmpty()) {
            v0_13 = 0;
        }
        this.zzf = v0_13;
        p6.optInt("offerType");
        com.android.billingclient.api.ProductDetails$PricingPhases v0_16 = p6.optJSONArray("offerTags");
        this.zzg = new java.util.ArrayList();
        if (v0_16 != null) {
            com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$RentalDetails v1_2 = 0;
            while (v1_2 < v0_16.length()) {
                this.zzg.add(v0_16.getString(v1_2));
                v1_2++;
            }
        }
        com.android.billingclient.api.ProductDetails$PricingPhases v0_19;
        if (!p6.has("fullPriceMicros")) {
            v0_19 = 0;
        } else {
            v0_19 = Long.valueOf(p6.optLong("fullPriceMicros"));
        }
        com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$RentalDetails v1_10;
        this.zzh = v0_19;
        com.android.billingclient.api.ProductDetails$PricingPhases v0_22 = p6.optJSONObject("discountDisplayInfo");
        if (v0_22 != null) {
            v1_10 = new com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$DiscountDisplayInfo(v0_22);
        } else {
            v1_10 = 0;
        }
        com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$RentalDetails v1_12;
        this.zzi = v1_10;
        com.android.billingclient.api.ProductDetails$PricingPhases v0_25 = p6.optJSONObject("validTimeWindow");
        if (v0_25 != null) {
            v1_12 = new com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$ValidTimeWindow(v0_25);
        } else {
            v1_12 = 0;
        }
        com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$RentalDetails v1_14;
        this.zzj = v1_12;
        com.android.billingclient.api.ProductDetails$PricingPhases v0_27 = p6.optJSONObject("limitedQuantityInfo");
        if (v0_27 != null) {
            v1_14 = new com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$LimitedQuantityInfo(v0_27);
        } else {
            v1_14 = 0;
        }
        this.zzk = v1_14;
        this.zzl = p6.optString("serializedDocid");
        com.android.billingclient.api.ProductDetails$PricingPhases v0_32 = p6.optJSONObject("preorderDetails");
        if (v0_32 != null) {
            v0_32.getLong("preorderReleaseTimeMillis");
            v0_32.getLong("preorderPresaleEndTimeMillis");
        }
        com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$RentalDetails v1_1;
        com.android.billingclient.api.ProductDetails$PricingPhases v0_1 = p6.optJSONObject("rentalDetails");
        if (v0_1 != null) {
            v1_1 = new com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$RentalDetails(v0_1);
        } else {
            v1_1 = 0;
        }
        this.zzm = v1_1;
        com.android.billingclient.api.ProductDetails$PricingPhases v0_3 = p6.optJSONObject("autoPayDetails");
        if (v0_3 != null) {
            v2_1 = new com.android.billingclient.api.zzcs(v0_3);
        }
        this.zzn = v2_1;
        org.json.JSONArray v6_1 = p6.optJSONArray("pricingPhases");
        if (v6_1 != null) {
            new com.android.billingclient.api.ProductDetails$PricingPhases(v6_1);
            return;
        } else {
            return;
        }
    }

    public com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$DiscountDisplayInfo getDiscountDisplayInfo()
    {
        return this.zzi;
    }

    public String getFormattedPrice()
    {
        return this.zza;
    }

    public Long getFullPriceMicros()
    {
        return this.zzh;
    }

    public com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$LimitedQuantityInfo getLimitedQuantityInfo()
    {
        return this.zzk;
    }

    public String getOfferId()
    {
        return this.zze;
    }

    public java.util.List getOfferTags()
    {
        return this.zzg;
    }

    public String getOfferToken()
    {
        return this.zzd;
    }

    public long getPriceAmountMicros()
    {
        return this.zzb;
    }

    public String getPriceCurrencyCode()
    {
        return this.zzc;
    }

    public String getPurchaseOptionId()
    {
        return this.zzf;
    }

    public com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$RentalDetails getRentalDetails()
    {
        return this.zzm;
    }

    public com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails$ValidTimeWindow getValidTimeWindow()
    {
        return this.zzj;
    }

    public final com.android.billingclient.api.zzcs zza()
    {
        return this.zzn;
    }

    public final String zzb()
    {
        return this.zzl;
    }
}
