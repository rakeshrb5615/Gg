package com.android.billingclient.api;
public class BillingFlowParams$SubscriptionUpdateParams$Builder {
    private String zza;
    private String zzb;
    private boolean zzc;
    private int zzd;

    private BillingFlowParams$SubscriptionUpdateParams$Builder()
    {
        this.zzd = 0;
        return;
    }

    public synthetic BillingFlowParams$SubscriptionUpdateParams$Builder(com.android.billingclient.api.zzcf p1)
    {
        this.zzd = 0;
        return;
    }

    public static synthetic com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder zza(com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder p1)
    {
        p1.zzc = 1;
        return p1;
    }

    public com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams build()
    {
        String v1_3 = 1;
        if ((android.text.TextUtils.isEmpty(this.zza)) && (android.text.TextUtils.isEmpty(0))) {
            v1_3 = 0;
        }
        IllegalArgumentException v0_2 = android.text.TextUtils.isEmpty(this.zzb);
        if ((v1_3 != null) && (v0_2 == null)) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        } else {
            if ((!this.zzc) && ((v1_3 == null) && (v0_2 != null))) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            } else {
                IllegalArgumentException v0_9 = new com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams(0);
                com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams.zze(v0_9, this.zza);
                com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams.zzg(v0_9, this.zzd);
                com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams.zzf(v0_9, this.zzb);
                return v0_9;
            }
        }
    }

    public com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder setOldPurchaseToken(String p1)
    {
        this.zza = p1;
        return this;
    }

    public com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder setOriginalExternalTransactionId(String p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder setSubscriptionReplacementMode(int p1)
    {
        this.zzd = p1;
        return this;
    }

    public final com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder zzb(String p1)
    {
        this.zza = p1;
        return this;
    }
}
