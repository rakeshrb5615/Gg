package com.android.billingclient.api;
final class zzbq implements com.android.billingclient.api.AcknowledgePurchaseResponseListener, com.android.billingclient.api.BillingClientStateListener, com.android.billingclient.api.ConsumeResponseListener, com.android.billingclient.api.PurchaseHistoryResponseListener, com.android.billingclient.api.PurchasesResponseListener, com.android.billingclient.api.PurchasesUpdatedListener, com.android.billingclient.api.SkuDetailsResponseListener {
    private final long zza;

    public zzbq()
    {
        this.zza = 0;
        return;
    }

    public zzbq(long p1)
    {
        this.zza = p1;
        return;
    }

    public static native void nativeOnAcknowledgePurchaseResponse();

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished();

    public static native void nativeOnConsumePurchaseResponse();

    public static native void nativeOnPriceChangeConfirmationResult();

    public static native void nativeOnPurchaseHistoryResponse();

    public static native void nativeOnPurchasesUpdated();

    public static native void nativeOnQueryPurchasesResponse();

    public static native void nativeOnSkuDetailsResponse();

    public final void onAcknowledgePurchaseResponse(com.android.billingclient.api.BillingResult p4)
    {
        com.android.billingclient.api.zzbq.nativeOnAcknowledgePurchaseResponse(p4.getResponseCode(), p4.getDebugMessage(), this.zza);
        return;
    }

    public final void onBillingServiceDisconnected()
    {
        com.android.billingclient.api.zzbq.nativeOnBillingServiceDisconnected();
        return;
    }

    public final void onBillingSetupFinished(com.android.billingclient.api.BillingResult p4)
    {
        com.android.billingclient.api.zzbq.nativeOnBillingSetupFinished(p4.getResponseCode(), p4.getDebugMessage(), this.zza);
        return;
    }

    public final void onConsumeResponse(com.android.billingclient.api.BillingResult p4, String p5)
    {
        com.android.billingclient.api.zzbq.nativeOnConsumePurchaseResponse(p4.getResponseCode(), p4.getDebugMessage(), p5, this.zza);
        return;
    }

    public final void onPurchaseHistoryResponse(com.android.billingclient.api.BillingResult p4, java.util.List p5)
    {
        if (p5 == null) {
            p5 = java.util.Collections.EMPTY_LIST;
        }
        int v0_1 = new com.android.billingclient.api.PurchaseHistoryRecord[p5.size()];
        com.android.billingclient.api.zzbq.nativeOnPurchaseHistoryResponse(p4.getResponseCode(), p4.getDebugMessage(), ((com.android.billingclient.api.PurchaseHistoryRecord[]) p5.toArray(v0_1)), this.zza);
        return;
    }

    public final void onPurchasesUpdated(com.android.billingclient.api.BillingResult p2, java.util.List p3)
    {
        if (p3 == null) {
            p3 = java.util.Collections.EMPTY_LIST;
        }
        int v0_1 = new com.android.billingclient.api.Purchase[p3.size()];
        com.android.billingclient.api.zzbq.nativeOnPurchasesUpdated(p2.getResponseCode(), p2.getDebugMessage(), ((com.android.billingclient.api.Purchase[]) p3.toArray(v0_1)));
        return;
    }

    public final void onQueryPurchasesResponse(com.android.billingclient.api.BillingResult p4, java.util.List p5)
    {
        long v0_1 = new com.android.billingclient.api.Purchase[p5.size()];
        com.android.billingclient.api.zzbq.nativeOnQueryPurchasesResponse(p4.getResponseCode(), p4.getDebugMessage(), ((com.android.billingclient.api.Purchase[]) p5.toArray(v0_1)), this.zza);
        return;
    }

    public final void onSkuDetailsResponse(com.android.billingclient.api.BillingResult p4, java.util.List p5)
    {
        if (p5 == null) {
            p5 = java.util.Collections.EMPTY_LIST;
        }
        int v0_1 = new com.android.billingclient.api.SkuDetails[p5.size()];
        com.android.billingclient.api.zzbq.nativeOnSkuDetailsResponse(p4.getResponseCode(), p4.getDebugMessage(), ((com.android.billingclient.api.SkuDetails[]) p5.toArray(v0_1)), this.zza);
        return;
    }
}
