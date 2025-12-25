package com.android.billingclient.api;
public final class QueryProductDetailsResult {
    private final java.util.List productDetailsList;
    private final java.util.List unfetchedProductList;

    public QueryProductDetailsResult(java.util.List p1, java.util.List p2)
    {
        this.productDetailsList = p1;
        this.unfetchedProductList = p2;
        return;
    }

    public static com.android.billingclient.api.QueryProductDetailsResult create(java.util.List p1, java.util.List p2)
    {
        return new com.android.billingclient.api.QueryProductDetailsResult(p1, p2);
    }

    public java.util.List getProductDetailsList()
    {
        return this.productDetailsList;
    }

    public java.util.List getUnfetchedProductList()
    {
        return this.unfetchedProductList;
    }
}
