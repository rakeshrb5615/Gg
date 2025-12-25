package com.android.billingclient.api;
final class zzs {
    private final android.content.Context zza;
    private final com.android.billingclient.api.PurchasesUpdatedListener zzb;
    private final com.android.billingclient.api.zzb zzc;
    private final com.android.billingclient.api.UserChoiceBillingListener zzd;
    private final com.android.billingclient.api.zzch zze;
    private final com.android.billingclient.api.zzr zzf;
    private final com.android.billingclient.api.zzr zzg;
    private boolean zzh;

    public zzs(android.content.Context p1, com.android.billingclient.api.PurchasesUpdatedListener p2, com.android.billingclient.api.zzco p3, com.android.billingclient.api.zzb p4, com.android.billingclient.api.UserChoiceBillingListener p5, com.android.billingclient.api.zzch p6)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        this.zzf = new com.android.billingclient.api.zzr(this, 1);
        this.zzg = new com.android.billingclient.api.zzr(this, 0);
        return;
    }

    public static bridge synthetic com.android.billingclient.api.zzb zza(com.android.billingclient.api.zzs p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic com.android.billingclient.api.zzch zzb(com.android.billingclient.api.zzs p0)
    {
        return p0.zze;
    }

    public static bridge synthetic com.android.billingclient.api.PurchasesUpdatedListener zzc(com.android.billingclient.api.zzs p0)
    {
        return p0.zzb;
    }

    public static bridge synthetic com.android.billingclient.api.UserChoiceBillingListener zze(com.android.billingclient.api.zzs p0)
    {
        return p0.zzd;
    }

    public final com.android.billingclient.api.PurchasesUpdatedListener zzd()
    {
        return this.zzb;
    }

    public final void zzf()
    {
        android.content.Context v1 = this.zza;
        this.zzf.zzc(v1);
        this.zzg.zzc(v1);
        return;
    }

    public final void zzg(boolean p4)
    {
        android.content.IntentFilter v0_1 = new android.content.IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        String v1_3 = new android.content.IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        v1_3.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.zzh = p4;
        android.content.Context v2_0 = this.zza;
        this.zzg.zza(v2_0, v1_3);
        if (!this.zzh) {
            this.zzf.zza(v2_0, v0_1);
            return;
        } else {
            this.zzf.zzb(v2_0, v0_1, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
            return;
        }
    }
}
