package com.android.billingclient.api;
public final class PendingPurchasesParams {
    private final boolean enableOneTimeProducts;
    private final boolean enablePrepaidPlans;

    private PendingPurchasesParams(boolean p1, boolean p2)
    {
        this.enableOneTimeProducts = p1;
        this.enablePrepaidPlans = p2;
        return;
    }

    public synthetic PendingPurchasesParams(boolean p1, boolean p2, com.android.billingclient.api.zzcr p3)
    {
        this(p1, p2);
        return;
    }

    public static com.android.billingclient.api.PendingPurchasesParams$Builder newBuilder()
    {
        return new com.android.billingclient.api.PendingPurchasesParams$Builder(0);
    }

    public boolean isEnabledForOneTimeProducts()
    {
        return this.enableOneTimeProducts;
    }

    public boolean isEnabledForPrepaidPlans()
    {
        return this.enablePrepaidPlans;
    }
}
