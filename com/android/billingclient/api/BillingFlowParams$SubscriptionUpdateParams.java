package com.android.billingclient.api;
public class BillingFlowParams$SubscriptionUpdateParams {
    private String zza;
    private String zzb;
    private int zzc;

    private BillingFlowParams$SubscriptionUpdateParams()
    {
        this.zzc = 0;
        return;
    }

    public synthetic BillingFlowParams$SubscriptionUpdateParams(com.android.billingclient.api.zzcf p1)
    {
        this.zzc = 0;
        return;
    }

    public static com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder newBuilder()
    {
        return new com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder(0);
    }

    public static bridge synthetic com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder zzb(com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams p2)
    {
        com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams$Builder v0 = com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams.newBuilder();
        v0.zzb(p2.zza);
        v0.setSubscriptionReplacementMode(p2.zzc);
        v0.setOriginalExternalTransactionId(p2.zzb);
        return v0;
    }

    public static bridge synthetic void zze(com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams p0, String p1)
    {
        p0.zza = p1;
        return;
    }

    public static bridge synthetic void zzf(com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams p0, String p1)
    {
        p0.zzb = p1;
        return;
    }

    public static bridge synthetic void zzg(com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams p0, int p1)
    {
        p0.zzc = p1;
        return;
    }

    public final int zza()
    {
        return this.zzc;
    }

    public final String zzc()
    {
        return this.zza;
    }

    public final String zzd()
    {
        return this.zzb;
    }
}
