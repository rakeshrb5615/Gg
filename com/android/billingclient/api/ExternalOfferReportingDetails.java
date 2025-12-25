package com.android.billingclient.api;
public final class ExternalOfferReportingDetails {
    private final String externalTransactionToken;

    public ExternalOfferReportingDetails(String p2)
    {
        this.externalTransactionToken = new org.json.JSONObject(p2).optString("externalTransactionToken");
        return;
    }

    public String getExternalTransactionToken()
    {
        return this.externalTransactionToken;
    }
}
