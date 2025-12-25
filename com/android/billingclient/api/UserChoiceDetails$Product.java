package com.android.billingclient.api;
public class UserChoiceDetails$Product {
    private final String id;
    private final String offerToken;
    private final String type;

    public UserChoiceDetails$Product(String p1, String p2, String p3)
    {
        this.id = p1;
        this.type = p2;
        this.offerToken = p3;
        return;
    }

    private UserChoiceDetails$Product(org.json.JSONObject p3)
    {
        this.id = p3.optString("productId");
        this.type = p3.optString("productType");
        int v3_1 = p3.optString("offerToken");
        if (1 == v3_1.isEmpty()) {
            v3_1 = 0;
        }
        this.offerToken = v3_1;
        return;
    }

    public synthetic UserChoiceDetails$Product(org.json.JSONObject p1, com.android.billingclient.api.zzdc p2)
    {
        this(p1);
        return;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.android.billingclient.api.UserChoiceDetails$Product)) {
                if ((!this.id.equals(((com.android.billingclient.api.UserChoiceDetails$Product) p5).getId())) || ((!this.type.equals(((com.android.billingclient.api.UserChoiceDetails$Product) p5).getType())) || (!java.util.Objects.equals(this.offerToken, ((com.android.billingclient.api.UserChoiceDetails$Product) p5).getOfferToken())))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public String getId()
    {
        return this.id;
    }

    public String getOfferToken()
    {
        return this.offerToken;
    }

    public String getType()
    {
        return this.type;
    }

    public int hashCode()
    {
        return java.util.Objects.hash(new Object[] {this.id, this.type, this.offerToken}));
    }

    public String toString()
    {
        return v1.a.n(v1.a.r("{id: ", this.id, ", type: ", this.type, ", offer token: "), this.offerToken, "}");
    }
}
