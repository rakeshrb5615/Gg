package com.android.billingclient.api;
public final class UnfetchedProduct {
    private final String jsonString;
    private final String productId;
    private final String productType;
    private final String serializedDocid;
    private final int statusCode;

    public UnfetchedProduct(String p4)
    {
        int v1_1;
        this.jsonString = p4;
        String v0_2 = new org.json.JSONObject(p4);
        this.productId = v0_2.optString("productId");
        IllegalArgumentException v4_1 = v0_2.optString("type");
        this.productType = v4_1;
        if (!v0_2.has("statusCode")) {
            v1_1 = 0;
        } else {
            v1_1 = v0_2.optInt("statusCode");
        }
        this.statusCode = v1_1;
        if (android.text.TextUtils.isEmpty(v4_1)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        } else {
            this.serializedDocid = v0_2.optString("serializedDocid");
            return;
        }
    }

    public static com.android.billingclient.api.UnfetchedProduct fromJson(String p1)
    {
        return new com.android.billingclient.api.UnfetchedProduct(p1);
    }

    public boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.android.billingclient.api.UnfetchedProduct)) {
                return android.text.TextUtils.equals(this.jsonString, ((com.android.billingclient.api.UnfetchedProduct) p2).jsonString);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public String getProductId()
    {
        return this.productId;
    }

    public String getProductType()
    {
        return this.productType;
    }

    public String getSerializedDocid()
    {
        return this.serializedDocid;
    }

    public int getStatusCode()
    {
        return this.statusCode;
    }

    public int hashCode()
    {
        return this.jsonString.hashCode();
    }

    public String toString()
    {
        String v0_2 = new StringBuilder("UnfetchedProduct{productId=\'");
        v0_2.append(this.productId);
        v0_2.append("\', productType=\'");
        v0_2.append(this.productType);
        v0_2.append("\', statusCode=");
        v0_2.append(this.statusCode);
        v0_2.append("}");
        return v0_2.toString();
    }
}
