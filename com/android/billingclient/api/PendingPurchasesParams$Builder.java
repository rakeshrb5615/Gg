package com.android.billingclient.api;
public final class PendingPurchasesParams$Builder {
    private boolean enableOneTimeProducts;
    private boolean enablePrepaidPlans;

    private PendingPurchasesParams$Builder()
    {
        return;
    }

    public synthetic PendingPurchasesParams$Builder(com.android.billingclient.api.zzcr p1)
    {
        return;
    }

    public com.android.billingclient.api.PendingPurchasesParams build()
    {
        if (!this.enableOneTimeProducts) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        } else {
            return new com.android.billingclient.api.PendingPurchasesParams(1, this.enablePrepaidPlans, 0);
        }
    }

    public com.android.billingclient.api.PendingPurchasesParams$Builder enableOneTimeProducts()
    {
        this.enableOneTimeProducts = 1;
        return this;
    }

    public com.android.billingclient.api.PendingPurchasesParams$Builder enablePrepaidPlans()
    {
        this.enablePrepaidPlans = 1;
        return this;
    }
}
