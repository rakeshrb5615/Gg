package com.android.billingclient.api;
public final class QueryProductDetailsParams {
    private final com.google.android.gms.internal.play_billing.zzbt zza;

    public synthetic QueryProductDetailsParams(com.android.billingclient.api.QueryProductDetailsParams$Builder p1, com.android.billingclient.api.zzcy p2)
    {
        this.zza = com.android.billingclient.api.QueryProductDetailsParams$Builder.zza(p1);
        return;
    }

    public static com.android.billingclient.api.QueryProductDetailsParams$Builder newBuilder()
    {
        return new com.android.billingclient.api.QueryProductDetailsParams$Builder(0);
    }

    public final com.google.android.gms.internal.play_billing.zzbt zza()
    {
        return this.zza;
    }

    public final String zzb()
    {
        return ((com.android.billingclient.api.QueryProductDetailsParams$Product) this.zza.get(0)).zzb();
    }
}
