package com.android.billingclient.api;
public final class UserChoiceDetails {
    private final String mOriginalJson;
    private final org.json.JSONObject mParsedJson;
    private final java.util.List mProducts;

    public UserChoiceDetails(String p2)
    {
        this.mOriginalJson = p2;
        org.json.JSONObject v0_1 = new org.json.JSONObject(p2);
        this.mParsedJson = v0_1;
        this.mProducts = com.android.billingclient.api.UserChoiceDetails.toProductList(v0_1.optJSONArray("products"));
        return;
    }

    private static java.util.List toProductList(org.json.JSONArray p5)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        if (p5 != null) {
            int v1 = 0;
            while (v1 < p5.length()) {
                org.json.JSONObject v2_1 = p5.optJSONObject(v1);
                if (v2_1 != null) {
                    v0_1.add(new com.android.billingclient.api.UserChoiceDetails$Product(v2_1, 0));
                }
                v1++;
            }
        }
        return v0_1;
    }

    public String getExternalTransactionToken()
    {
        return this.mParsedJson.optString("externalTransactionToken");
    }

    public String getOriginalExternalTransactionId()
    {
        int v0_1 = this.mParsedJson.optString("originalExternalTransactionId");
        if (v0_1.isEmpty()) {
            v0_1 = 0;
        }
        return v0_1;
    }

    public java.util.List getProducts()
    {
        return this.mProducts;
    }
}
