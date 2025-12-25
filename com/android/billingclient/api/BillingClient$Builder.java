package com.android.billingclient.api;
public final class BillingClient$Builder {
    volatile boolean zza;
    volatile com.google.android.gms.internal.play_billing.zzbl zzb;
    private volatile String zzc;
    private volatile com.android.billingclient.api.PendingPurchasesParams zzd;
    private final android.content.Context zze;
    private volatile com.android.billingclient.api.PurchasesUpdatedListener zzf;
    private volatile com.android.billingclient.api.zzco zzg;
    private volatile com.android.billingclient.api.zzch zzh;
    private volatile com.android.billingclient.api.zzb zzi;
    private volatile com.android.billingclient.api.UserChoiceBillingListener zzj;
    private volatile java.util.concurrent.ExecutorService zzk;
    private volatile boolean zzl;
    private volatile boolean zzm;
    private volatile boolean zzn;

    public synthetic BillingClient$Builder(android.content.Context p1, com.android.billingclient.api.zzt p2)
    {
        this.zze = p1;
        return;
    }

    private final boolean zza()
    {
        try {
            Exception v1_0 = this.zze;
            boolean v0_1 = v1_0.getPackageManager().getApplicationInfo(v1_0.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", 0);
            return v0_1;
        } catch (Exception v1_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", v1_1);
            return v0_1;
        }
    }

    public com.android.billingclient.api.BillingClient build()
    {
        int v3_0 = this.zze;
        if (v3_0 == 0) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        } else {
            if (this.zzf != null) {
                if ((this.zzd == null) || (!this.zzd.isEnabledForOneTimeProducts())) {
                    throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
                } else {
                    if (this.zzf == null) {
                        com.android.billingclient.api.PendingPurchasesParams v2_2 = this.zzd;
                        if (!this.zza()) {
                            return new com.android.billingclient.api.BillingClientImpl(0, v2_2, v3_0, 0, 0, 0, this);
                        } else {
                            return new com.android.billingclient.api.zzce(0, v2_2, v3_0, 0, 0, 0, this);
                        }
                    } else {
                        if (this.zzj != null) {
                            com.android.billingclient.api.PendingPurchasesParams v2_3 = this.zzd;
                            int v4_4 = this.zzf;
                            int v5_4 = this.zzj;
                            if (!this.zza()) {
                                return new com.android.billingclient.api.BillingClientImpl(0, v2_3, v3_0, v4_4, v5_4, 0, 0, this);
                            } else {
                                return new com.android.billingclient.api.zzce(0, v2_3, v3_0, v4_4, v5_4, 0, 0, this);
                            }
                        } else {
                            com.android.billingclient.api.PendingPurchasesParams v2_4 = this.zzd;
                            int v4_5 = this.zzf;
                            if (!this.zza()) {
                                return new com.android.billingclient.api.BillingClientImpl(0, v2_4, v3_0, v4_5, 0, 0, 0, this);
                            } else {
                                return new com.android.billingclient.api.zzce(0, v2_4, v3_0, v4_5, 0, 0, 0, this);
                            }
                        }
                    }
                }
            } else {
                if (this.zzj != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                } else {
                    if ((!this.zzl) && (!this.zzm)) {
                        throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                    } else {
                        if (!this.zza()) {
                            return new com.android.billingclient.api.BillingClientImpl(0, v3_0, 0, 0, this);
                        } else {
                            return new com.android.billingclient.api.zzce(0, v3_0, 0, 0, this);
                        }
                    }
                }
            }
        }
    }

    public com.android.billingclient.api.BillingClient$Builder enableAlternativeBillingOnly()
    {
        this.zzl = 1;
        return this;
    }

    public com.android.billingclient.api.BillingClient$Builder enableAutoServiceReconnection()
    {
        this.zza = 1;
        return this;
    }

    public com.android.billingclient.api.BillingClient$Builder enableExternalOffer()
    {
        this.zzm = 1;
        return this;
    }

    public com.android.billingclient.api.BillingClient$Builder enablePendingPurchases(com.android.billingclient.api.PendingPurchasesParams p1)
    {
        this.zzd = p1;
        return this;
    }

    public com.android.billingclient.api.BillingClient$Builder enableUserChoiceBilling(com.android.billingclient.api.UserChoiceBillingListener p1)
    {
        this.zzj = p1;
        return this;
    }

    public com.android.billingclient.api.BillingClient$Builder setListener(com.android.billingclient.api.PurchasesUpdatedListener p1)
    {
        this.zzf = p1;
        return this;
    }
}
