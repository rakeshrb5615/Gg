package com.android.billingclient.api;
public final class BillingConfig {
    private final String countryCode;

    public BillingConfig(String p2)
    {
        this.countryCode = new org.json.JSONObject(p2).optString("countryCode");
        return;
    }

    private BillingConfig(String p1, String p2)
    {
        this.countryCode = p2;
        return;
    }

    public static com.android.billingclient.api.BillingConfig forCountryCode(String p2)
    {
        return new com.android.billingclient.api.BillingConfig(0, p2);
    }

    public String getCountryCode()
    {
        return this.countryCode;
    }
}
