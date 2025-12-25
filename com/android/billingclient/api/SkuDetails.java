package com.android.billingclient.api;
public class SkuDetails {
    private final String zza;
    private final org.json.JSONObject zzb;

    public SkuDetails(String p2)
    {
        this.zza = p2;
        String v0_3 = new org.json.JSONObject(p2);
        this.zzb = v0_3;
        if (android.text.TextUtils.isEmpty(v0_3.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        } else {
            if (android.text.TextUtils.isEmpty(v0_3.optString("type"))) {
                throw new IllegalArgumentException("SkuType cannot be empty.");
            } else {
                return;
            }
        }
    }

    public boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.android.billingclient.api.SkuDetails)) {
                return android.text.TextUtils.equals(this.zza, ((com.android.billingclient.api.SkuDetails) p2).zza);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public String getDescription()
    {
        return this.zzb.optString("description");
    }

    public String getFreeTrialPeriod()
    {
        return this.zzb.optString("freeTrialPeriod");
    }

    public String getIconUrl()
    {
        return this.zzb.optString("iconUrl");
    }

    public String getIntroductoryPrice()
    {
        return this.zzb.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros()
    {
        return this.zzb.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles()
    {
        return this.zzb.optInt("introductoryPriceCycles");
    }

    public String getIntroductoryPricePeriod()
    {
        return this.zzb.optString("introductoryPricePeriod");
    }

    public String getOriginalJson()
    {
        return this.zza;
    }

    public String getOriginalPrice()
    {
        String v0_0 = this.zzb;
        if (!v0_0.has("original_price")) {
            return this.getPrice();
        } else {
            return v0_0.optString("original_price");
        }
    }

    public long getOriginalPriceAmountMicros()
    {
        long v0_0 = this.zzb;
        if (!v0_0.has("original_price_micros")) {
            return this.getPriceAmountMicros();
        } else {
            return v0_0.optLong("original_price_micros");
        }
    }

    public String getPrice()
    {
        return this.zzb.optString("price");
    }

    public long getPriceAmountMicros()
    {
        return this.zzb.optLong("price_amount_micros");
    }

    public String getPriceCurrencyCode()
    {
        return this.zzb.optString("price_currency_code");
    }

    public String getSku()
    {
        return this.zzb.optString("productId");
    }

    public String getSubscriptionPeriod()
    {
        return this.zzb.optString("subscriptionPeriod");
    }

    public String getTitle()
    {
        return this.zzb.optString("title");
    }

    public String getType()
    {
        return this.zzb.optString("type");
    }

    public int hashCode()
    {
        return this.zza.hashCode();
    }

    public String toString()
    {
        return "SkuDetails: ".concat(String.valueOf(this.zza));
    }

    public int zza()
    {
        return this.zzb.optInt("offer_type");
    }

    public String zzb()
    {
        return this.zzb.optString("offer_id");
    }

    public String zzc()
    {
        String v0_0 = this.zzb;
        String v1_1 = v0_0.optString("offerIdToken");
        if (!v1_1.isEmpty()) {
            return v1_1;
        } else {
            return v0_0.optString("offer_id_token");
        }
    }

    public final String zzd()
    {
        return this.zzb.optString("packageName");
    }

    public String zze()
    {
        return this.zzb.optString("serializedDocid");
    }

    public final String zzf()
    {
        return this.zzb.optString("skuDetailsToken");
    }
}
