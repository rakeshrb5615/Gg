package com.android.billingclient.api;
public class BillingFlowParams$ProductDetailsParams$Builder {
    private com.android.billingclient.api.ProductDetails zza;
    private String zzb;

    private BillingFlowParams$ProductDetailsParams$Builder()
    {
        throw 0;
    }

    public synthetic BillingFlowParams$ProductDetailsParams$Builder(com.android.billingclient.api.zzcf p1)
    {
        return;
    }

    public static bridge synthetic com.android.billingclient.api.ProductDetails zza(com.android.billingclient.api.BillingFlowParams$ProductDetailsParams$Builder p0)
    {
        return p0.zza;
    }

    public static bridge synthetic String zzb(com.android.billingclient.api.BillingFlowParams$ProductDetailsParams$Builder p0)
    {
        return p0.zzb;
    }

    public com.android.billingclient.api.BillingFlowParams$ProductDetailsParams build()
    {
        com.google.android.gms.internal.play_billing.zzbg.zzc(this.zza, "ProductDetails is required for constructing ProductDetailsParams.");
        return new com.android.billingclient.api.BillingFlowParams$ProductDetailsParams(this, 0);
    }

    public com.android.billingclient.api.BillingFlowParams$ProductDetailsParams$Builder setOfferToken(String p2)
    {
        if (android.text.TextUtils.isEmpty(p2)) {
            throw new IllegalArgumentException("offerToken can not be empty");
        } else {
            this.zzb = p2;
            return this;
        }
    }

    public com.android.billingclient.api.BillingFlowParams$ProductDetailsParams$Builder setProductDetails(com.android.billingclient.api.ProductDetails p2)
    {
        this.zza = p2;
        if (p2.getOneTimePurchaseOfferDetails() != null) {
            p2.getOneTimePurchaseOfferDetails().getClass();
            String v2_2 = p2.getOneTimePurchaseOfferDetails();
            if (v2_2.getOfferToken() != null) {
                this.zzb = v2_2.getOfferToken();
            }
        }
        return this;
    }
}
