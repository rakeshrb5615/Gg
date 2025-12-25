package com.android.billingclient.api;
public class ProductDetails$PricingPhases {
    private final java.util.List zza;

    public ProductDetails$PricingPhases(org.json.JSONArray p5)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        if (p5 != null) {
            int v1 = 0;
            while (v1 < p5.length()) {
                org.json.JSONObject v2_0 = p5.optJSONObject(v1);
                if (v2_0 != null) {
                    v0_1.add(new com.android.billingclient.api.ProductDetails$PricingPhase(v2_0));
                }
                v1++;
            }
        }
        this.zza = v0_1;
        return;
    }

    public java.util.List getPricingPhaseList()
    {
        return this.zza;
    }
}
