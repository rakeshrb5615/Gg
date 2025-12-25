package com.android.billingclient.api;
public final class ProductDetails$SubscriptionOfferDetails {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final com.android.billingclient.api.ProductDetails$PricingPhases zzd;
    private final java.util.List zze;
    private final com.android.billingclient.api.ProductDetails$InstallmentPlanDetails zzf;

    public ProductDetails$SubscriptionOfferDetails(org.json.JSONObject p6)
    {
        this.zza = p6.optString("basePlanId");
        int v1_0 = p6.optString("offerId");
        com.android.billingclient.api.ProductDetails$InstallmentPlanDetails v4_0 = 0;
        if (1 == v1_0.isEmpty()) {
            v1_0 = 0;
        }
        this.zzb = v1_0;
        this.zzc = p6.getString("offerIdToken");
        this.zzd = new com.android.billingclient.api.ProductDetails$PricingPhases(p6.getJSONArray("pricingPhases"));
        int v1_6 = p6.optJSONObject("installmentPlanDetails");
        if (v1_6 != 0) {
            v4_0 = new com.android.billingclient.api.ProductDetails$InstallmentPlanDetails(v1_6);
        }
        this.zzf = v4_0;
        int v1_9 = p6.optJSONObject("transitionPlanDetails");
        if (v1_9 != 0) {
            v1_9.getString("productId");
            v1_9.optString("title");
            v1_9.optString("name");
            v1_9.optString("description");
            v1_9.optString("basePlanId");
            java.util.ArrayList v0_2 = v1_9.optJSONObject("pricingPhase");
            if (v0_2 != null) {
                new com.android.billingclient.api.ProductDetails$PricingPhase(v0_2);
            }
        }
        java.util.ArrayList v0_4 = new java.util.ArrayList();
        org.json.JSONArray v6_1 = p6.optJSONArray("offerTags");
        if (v6_1 != null) {
            int v1_13 = 0;
            while (v1_13 < v6_1.length()) {
                v0_4.add(v6_1.getString(v1_13));
                v1_13++;
            }
        }
        this.zze = v0_4;
        return;
    }

    public String getBasePlanId()
    {
        return this.zza;
    }

    public com.android.billingclient.api.ProductDetails$InstallmentPlanDetails getInstallmentPlanDetails()
    {
        return this.zzf;
    }

    public String getOfferId()
    {
        return this.zzb;
    }

    public java.util.List getOfferTags()
    {
        return this.zze;
    }

    public String getOfferToken()
    {
        return this.zzc;
    }

    public com.android.billingclient.api.ProductDetails$PricingPhases getPricingPhases()
    {
        return this.zzd;
    }
}
