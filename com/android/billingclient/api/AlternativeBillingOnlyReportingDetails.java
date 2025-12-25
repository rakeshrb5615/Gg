package com.android.billingclient.api;
public final class AlternativeBillingOnlyReportingDetails {
    private final String externalTransactionToken;

    public AlternativeBillingOnlyReportingDetails(String p2)
    {
        this.externalTransactionToken = new org.json.JSONObject(p2).optString("externalTransactionToken");
        return;
    }

    public String getExternalTransactionToken()
    {
        return this.externalTransactionToken;
    }
}
