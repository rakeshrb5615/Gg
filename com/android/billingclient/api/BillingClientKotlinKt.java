package com.android.billingclient.api;
public final class BillingClientKotlinKt {

    public static void $r8$lambda$BC2cAL2vk_I3dV-pkSAsSywRIek(d8.t p1, com.android.billingclient.api.BillingResult p2, String p3)
    {
        kotlin.jvm.internal.j.b(p2);
        ((d8.u) p1).A(new com.android.billingclient.api.ConsumeResult(p2, p3));
        return;
    }

    public static void $r8$lambda$NjHhuq09jAs8F8dpZjv_HsFBRq0(d8.t p0, com.android.billingclient.api.BillingResult p1)
    {
        kotlin.jvm.internal.j.b(p1);
        ((d8.u) p0).A(p1);
        return;
    }

    public static void $r8$lambda$UIFqmbqzelSukPAr7gb0UVftOsk(d8.t p1, com.android.billingclient.api.BillingResult p2, com.android.billingclient.api.QueryProductDetailsResult p3)
    {
        kotlin.jvm.internal.j.b(p2);
        ((d8.u) p1).A(new com.android.billingclient.api.ProductDetailsResult(p2, p3.getProductDetailsList()));
        return;
    }

    public static void $r8$lambda$jxN-QYHicJYIZOoHSpSjQpTOUq0(d8.t p0, com.android.billingclient.api.BillingResult p1)
    {
        kotlin.jvm.internal.j.b(p1);
        ((d8.u) p0).A(p1);
        return;
    }

    public static void $r8$lambda$mNiIov37EcRv6CLKJbxie9rmtK8(d8.t p0, com.android.billingclient.api.BillingResult p1)
    {
        kotlin.jvm.internal.j.b(p1);
        ((d8.u) p0).A(p1);
        return;
    }

    public static void $r8$lambda$uERt1i0NYhXEQkbmrKSYJisMHH8(d8.t p1, com.android.billingclient.api.BillingResult p2, java.util.List p3)
    {
        kotlin.jvm.internal.j.b(p2);
        kotlin.jvm.internal.j.b(p3);
        ((d8.u) p1).A(new com.android.billingclient.api.PurchasesResult(p2, p3));
        return;
    }

    public static void $r8$lambda$vlcEyDRKESu-E49PJWQAtcRlfoM(d8.t p1, com.android.billingclient.api.BillingResult p2, com.android.billingclient.api.AlternativeBillingOnlyReportingDetails p3)
    {
        kotlin.jvm.internal.j.b(p2);
        ((d8.u) p1).A(new com.android.billingclient.api.CreateAlternativeBillingOnlyReportingDetailsResult(p2, p3));
        return;
    }

    public static void $r8$lambda$z4VlE67Tlsqm1a7xTsH92uzKGwo(d8.t p1, com.android.billingclient.api.BillingResult p2, com.android.billingclient.api.ExternalOfferReportingDetails p3)
    {
        kotlin.jvm.internal.j.b(p2);
        ((d8.u) p1).A(new com.android.billingclient.api.CreateExternalOfferReportingDetailsResult(p2, p3));
        return;
    }

    public static final Object acknowledgePurchase(com.android.billingclient.api.BillingClient p2, com.android.billingclient.api.AcknowledgePurchaseParams p3, l7.c p4)
    {
        d8.u v0 = d8.f0.a();
        p2.acknowledgePurchase(p3, new com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda3(v0));
        return v0.h(p4);
    }

    public static final Object consumePurchase(com.android.billingclient.api.BillingClient p2, com.android.billingclient.api.ConsumeParams p3, l7.c p4)
    {
        d8.u v0 = d8.f0.a();
        p2.consumeAsync(p3, new com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda0(v0));
        return v0.h(p4);
    }

    public static final Object createAlternativeBillingOnlyReportingDetails(com.android.billingclient.api.BillingClient p2, l7.c p3)
    {
        d8.u v0 = d8.f0.a();
        p2.createAlternativeBillingOnlyReportingDetailsAsync(new com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda6(v0));
        return v0.h(p3);
    }

    public static final Object createExternalOfferReportingDetails(com.android.billingclient.api.BillingClient p2, l7.c p3)
    {
        d8.u v0 = d8.f0.a();
        p2.createExternalOfferReportingDetailsAsync(new com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda4(v0));
        return v0.h(p3);
    }

    public static final Object isAlternativeBillingOnlyAvailable(com.android.billingclient.api.BillingClient p2, l7.c p3)
    {
        d8.u v0 = d8.f0.a();
        p2.isAlternativeBillingOnlyAvailableAsync(new com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda5(v0));
        return v0.h(p3);
    }

    public static final Object isExternalOfferAvailable(com.android.billingclient.api.BillingClient p2, l7.c p3)
    {
        d8.u v0 = d8.f0.a();
        p2.isExternalOfferAvailableAsync(new com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda1(v0));
        return v0.h(p3);
    }

    public static final Object queryProductDetails(com.android.billingclient.api.BillingClient p2, com.android.billingclient.api.QueryProductDetailsParams p3, l7.c p4)
    {
        d8.u v0 = d8.f0.a();
        p2.queryProductDetailsAsync(p3, new com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda2(v0));
        return v0.h(p4);
    }

    public static final Object queryPurchasesAsync(com.android.billingclient.api.BillingClient p2, com.android.billingclient.api.QueryPurchasesParams p3, l7.c p4)
    {
        d8.u v0 = d8.f0.a();
        p2.queryPurchasesAsync(p3, new com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda7(v0));
        return v0.h(p4);
    }
}
