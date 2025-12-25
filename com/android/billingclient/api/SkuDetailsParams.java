package com.android.billingclient.api;
public class SkuDetailsParams {
    private String zza;
    private java.util.List zzb;

    public SkuDetailsParams()
    {
        return;
    }

    public static com.android.billingclient.api.SkuDetailsParams$Builder newBuilder()
    {
        return new com.android.billingclient.api.SkuDetailsParams$Builder(0);
    }

    public static bridge synthetic void zza(com.android.billingclient.api.SkuDetailsParams p0, String p1)
    {
        p0.zza = p1;
        return;
    }

    public static bridge synthetic void zzb(com.android.billingclient.api.SkuDetailsParams p0, java.util.List p1)
    {
        p0.zzb = p1;
        return;
    }

    public String getSkuType()
    {
        return this.zza;
    }

    public java.util.List getSkusList()
    {
        return this.zzb;
    }
}
