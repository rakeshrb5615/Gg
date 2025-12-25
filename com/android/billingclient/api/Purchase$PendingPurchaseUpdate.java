package com.android.billingclient.api;
public final class Purchase$PendingPurchaseUpdate {
    private final org.json.JSONObject mParsedJson;

    private Purchase$PendingPurchaseUpdate(org.json.JSONObject p1)
    {
        this.mParsedJson = p1;
        return;
    }

    public synthetic Purchase$PendingPurchaseUpdate(org.json.JSONObject p1, com.android.billingclient.api.zzcx p2)
    {
        this(p1);
        return;
    }

    public java.util.List getProducts()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        if (this.mParsedJson.has("productIds")) {
            org.json.JSONArray v1_3 = this.mParsedJson.optJSONArray("productIds");
            if (v1_3 != null) {
                int v2_0 = 0;
                while (v2_0 < v1_3.length()) {
                    v0_1.add(v1_3.optString(v2_0));
                    v2_0++;
                }
            }
        }
        return v0_1;
    }

    public String getPurchaseToken()
    {
        return this.mParsedJson.optString("purchaseToken");
    }
}
