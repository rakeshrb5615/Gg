package com.android.billingclient.api;
public final class BillingResult {
    private int zza;
    private int zzb;
    private String zzc;

    public BillingResult()
    {
        return;
    }

    public static com.android.billingclient.api.BillingResult$Builder newBuilder()
    {
        return new com.android.billingclient.api.BillingResult$Builder(0);
    }

    public static bridge synthetic void zza(com.android.billingclient.api.BillingResult p0, String p1)
    {
        p0.zzc = p1;
        return;
    }

    public static bridge synthetic void zzb(com.android.billingclient.api.BillingResult p0, int p1)
    {
        p0.zzb = p1;
        return;
    }

    public static bridge synthetic void zzc(com.android.billingclient.api.BillingResult p0, int p1)
    {
        p0.zza = p1;
        return;
    }

    public String getDebugMessage()
    {
        return this.zzc;
    }

    public int getOnPurchasesUpdatedSubResponseCode()
    {
        return this.zzb;
    }

    public int getResponseCode()
    {
        return this.zza;
    }

    public String toString()
    {
        return g2.g.f("Response Code: ", com.google.android.gms.internal.play_billing.zzc.zzk(this.zza), ", Debug Message: ", this.zzc);
    }
}
