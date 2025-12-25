package com.android.billingclient.api;
public interface BillingClientStateListener {

    public abstract void onBillingServiceDisconnected();

    public abstract void onBillingSetupFinished();
}
