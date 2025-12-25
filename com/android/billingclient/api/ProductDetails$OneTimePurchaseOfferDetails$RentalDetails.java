package com.android.billingclient.api;
public final class ProductDetails$OneTimePurchaseOfferDetails$RentalDetails {
    private final String rentalExpirationPeriod;
    private final String rentalPeriod;

    public ProductDetails$OneTimePurchaseOfferDetails$RentalDetails(org.json.JSONObject p3)
    {
        this.rentalPeriod = p3.getString("rentalPeriod");
        int v3_1 = p3.optString("rentalExpirationPeriod");
        if (1 == v3_1.isEmpty()) {
            v3_1 = 0;
        }
        this.rentalExpirationPeriod = v3_1;
        return;
    }

    public String getRentalExpirationPeriod()
    {
        return this.rentalExpirationPeriod;
    }

    public String getRentalPeriod()
    {
        return this.rentalPeriod;
    }
}
