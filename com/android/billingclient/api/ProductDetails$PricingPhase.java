package com.android.billingclient.api;
public final class ProductDetails$PricingPhase {
    private final String zza;
    private final long zzb;
    private final String zzc;
    private final String zzd;
    private final int zze;
    private final int zzf;

    public ProductDetails$PricingPhase(org.json.JSONObject p3)
    {
        this.zzd = p3.optString("billingPeriod");
        this.zzc = p3.optString("priceCurrencyCode");
        this.zza = p3.optString("formattedPrice");
        this.zzb = p3.optLong("priceAmountMicros");
        this.zzf = p3.optInt("recurrenceMode");
        this.zze = p3.optInt("billingCycleCount");
        return;
    }

    public int getBillingCycleCount()
    {
        return this.zze;
    }

    public String getBillingPeriod()
    {
        return this.zzd;
    }

    public String getFormattedPrice()
    {
        return this.zza;
    }

    public long getPriceAmountMicros()
    {
        return this.zzb;
    }

    public String getPriceCurrencyCode()
    {
        return this.zzc;
    }

    public int getRecurrenceMode()
    {
        return this.zzf;
    }
}
