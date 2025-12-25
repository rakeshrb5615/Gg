package com.android.billingclient.api;
public abstract class BillingClient {

    public BillingClient()
    {
        return;
    }

    public static com.android.billingclient.api.BillingClient$Builder newBuilder(android.content.Context p2)
    {
        return new com.android.billingclient.api.BillingClient$Builder(p2, 0);
    }

    public abstract void acknowledgePurchase();

    public abstract void consumeAsync();

    public abstract void createAlternativeBillingOnlyReportingDetailsAsync();

    public abstract void createExternalOfferReportingDetailsAsync();

    public abstract void endConnection();

    public abstract void getBillingConfigAsync();

    public abstract int getConnectionState();

    public abstract void isAlternativeBillingOnlyAvailableAsync();

    public abstract void isExternalOfferAvailableAsync();

    public abstract com.android.billingclient.api.BillingResult isFeatureSupported();

    public abstract boolean isReady();

    public abstract com.android.billingclient.api.BillingResult launchBillingFlow();

    public abstract void queryProductDetailsAsync();

    public abstract void queryPurchasesAsync();

    public abstract com.android.billingclient.api.BillingResult showAlternativeBillingOnlyInformationDialog();

    public abstract com.android.billingclient.api.BillingResult showExternalOfferInformationDialog();

    public abstract com.android.billingclient.api.BillingResult showInAppMessages();

    public abstract void startConnection();
}
