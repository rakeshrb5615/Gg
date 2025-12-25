package com.android.billingclient.api;
public class BillingResult$Builder {
    private int zza;
    private int zzb;
    private String zzc;

    private BillingResult$Builder()
    {
        this.zzb = 0;
        this.zzc = "";
        return;
    }

    public synthetic BillingResult$Builder(com.android.billingclient.api.zzci p1)
    {
        this.zzb = 0;
        this.zzc = "";
        return;
    }

    public com.android.billingclient.api.BillingResult build()
    {
        com.android.billingclient.api.BillingResult v0_1 = new com.android.billingclient.api.BillingResult();
        com.android.billingclient.api.BillingResult.zzc(v0_1, this.zza);
        com.android.billingclient.api.BillingResult.zzb(v0_1, this.zzb);
        com.android.billingclient.api.BillingResult.zza(v0_1, this.zzc);
        return v0_1;
    }

    public com.android.billingclient.api.BillingResult$Builder setDebugMessage(String p1)
    {
        this.zzc = p1;
        return this;
    }

    public com.android.billingclient.api.BillingResult$Builder setOnPurchasesUpdatedSubResponseCode(int p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.android.billingclient.api.BillingResult$Builder setResponseCode(int p1)
    {
        this.zza = p1;
        return this;
    }
}
