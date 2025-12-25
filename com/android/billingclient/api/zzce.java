package com.android.billingclient.api;
final class zzce extends com.android.billingclient.api.BillingClientImpl {
    private final android.content.Context zza;
    private volatile int zzb;
    private volatile com.google.android.gms.internal.play_billing.zzau zzc;
    private volatile com.android.billingclient.api.zzcc zzd;
    private volatile java.util.concurrent.ScheduledExecutorService zze;

    public zzce(String p7, android.content.Context p8, com.android.billingclient.api.zzch p9, java.util.concurrent.ExecutorService p10, com.android.billingclient.api.BillingClient$Builder p11)
    {
        com.android.billingclient.api.zzce v0_1 = super(0, p8, 0, 0, p11);
        v0_1.zzb = 0;
        v0_1.zza = p8;
        return;
    }

    public zzce(String p10, com.android.billingclient.api.PendingPurchasesParams p11, android.content.Context p12, com.android.billingclient.api.PurchasesUpdatedListener p13, com.android.billingclient.api.UserChoiceBillingListener p14, com.android.billingclient.api.zzch p15, java.util.concurrent.ExecutorService p16, com.android.billingclient.api.BillingClient$Builder p17)
    {
        super(0, p11, p12, p13, p14, 0, 0, p17);
        super.zzb = 0;
        super.zza = p12;
        return;
    }

    public zzce(String p10, com.android.billingclient.api.PendingPurchasesParams p11, android.content.Context p12, com.android.billingclient.api.PurchasesUpdatedListener p13, com.android.billingclient.api.zzb p14, com.android.billingclient.api.zzch p15, java.util.concurrent.ExecutorService p16, com.android.billingclient.api.BillingClient$Builder p17)
    {
        super(0, p11, p12, p13, 0, 0, 0, p17);
        super.zzb = 0;
        super.zza = p12;
        return;
    }

    public zzce(String p9, com.android.billingclient.api.PendingPurchasesParams p10, android.content.Context p11, com.android.billingclient.api.zzco p12, com.android.billingclient.api.zzch p13, java.util.concurrent.ExecutorService p14, com.android.billingclient.api.BillingClient$Builder p15)
    {
        com.android.billingclient.api.zzce v0_1 = super(0, p10, p11, 0, 0, 0, p15);
        v0_1.zzb = 0;
        v0_1.zza = p11;
        return;
    }

    private final declared_synchronized void zzaA()
    {
        try {
            this.zzaG(27);
        } catch (Throwable v0_2) {
            throw v0_2;
        }
        if ((this.zzd == null) || (this.zzc == null)) {
            this.zzc = 0;
            if (this.zze != null) {
                this.zze.shutdownNow();
                this.zze = 0;
            }
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Unbinding from Billing Override Service.");
            this.zza.unbindService(this.zzd);
            this.zzd = new com.android.billingclient.api.zzcc(this, 0);
        }
        this.zzb = 3;
        return;
    }

    private final declared_synchronized void zzaB()
    {
        if (!this.zzat()) {
            if (this.zzb != 1) {
                if (this.zzb != 3) {
                    this.zzb = 1;
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.zzd = new com.android.billingclient.api.zzcc(this, 0);
                    String v0_5 = new android.content.Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    v0_5.setPackage("com.google.android.apps.play.billingtestcompanion");
                    android.content.Context v3_4 = this.zza;
                    android.content.Intent v4_1 = v3_4.getPackageManager().queryIntentServices(v0_5, 0);
                    com.google.android.gms.internal.play_billing.zzie v6_0 = com.google.android.gms.internal.play_billing.zzie.zza;
                    if ((v4_1 == null) || (v4_1.isEmpty())) {
                        v6_0 = com.google.android.gms.internal.play_billing.zzie.zzO;
                    } else {
                        android.content.Intent v4_4 = ((android.content.pm.ResolveInfo) v4_1.get(0)).serviceInfo;
                        if (v4_4 != null) {
                            com.google.android.gms.internal.play_billing.zzie v6_1 = v4_4.packageName;
                            android.content.Intent v4_5 = v4_4.name;
                            if ((!java.util.Objects.equals(v6_1, "com.google.android.apps.play.billingtestcompanion")) || (v4_5 == null)) {
                                v6_0 = com.google.android.gms.internal.play_billing.zzie.zzM;
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "The device doesn\'t have valid Play Billing Lab.");
                            } else {
                                android.content.ComponentName v7_4 = new android.content.ComponentName(v6_1, v4_5);
                                android.content.Intent v4_7 = new android.content.Intent(v0_5);
                                v4_7.setComponent(v7_4);
                                if (!v3_4.bindService(v4_7, this.zzd, 1)) {
                                    v6_0 = com.google.android.gms.internal.play_billing.zzie.zzM;
                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                } else {
                                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                    return;
                                }
                            }
                        }
                    }
                    this.zzb = 0;
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service unavailable on device.");
                    this.zzaF(v6_0, 26, com.android.billingclient.api.zzcj.zza(2, "Billing Override Service unavailable on device."));
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service Client was already closed and can\'t be reused. Please create another instance.");
                    this.zzaF(com.google.android.gms.internal.play_billing.zzie.zzL, 26, com.android.billingclient.api.zzcj.zza(-1, "Billing Override Service connection is disconnected."));
                    return;
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                return;
            }
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            this.zzaG(26);
            return;
        }
    }

    private static final boolean zzaC(int p0)
    {
        if (p0 <= 0) {
            return 0;
        } else {
            return 1;
        }
    }

    private final com.android.billingclient.api.BillingResult zzaD(int p2, int p3)
    {
        com.android.billingclient.api.BillingResult v3_1 = com.android.billingclient.api.zzcj.zza(p3, "Billing override value was set by a license tester.");
        this.zzaF(com.google.android.gms.internal.play_billing.zzie.zzaO, p2, v3_1);
        return v3_1;
    }

    private final com.google.android.gms.internal.play_billing.zzcz zzaE(int p3)
    {
        if (this.zzat()) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new com.android.billingclient.api.zzbv(this, p3));
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service is not ready.");
            this.zzaF(com.google.android.gms.internal.play_billing.zzie.zzaP, 28, com.android.billingclient.api.zzcj.zza(-1, "Billing Override Service connection is disconnected."));
            return com.google.android.gms.internal.play_billing.zzcu.zza(Integer.valueOf(0));
        }
    }

    private final void zzaF(com.google.android.gms.internal.play_billing.zzie p3, int p4, com.android.billingclient.api.BillingResult p5)
    {
        com.google.android.gms.internal.play_billing.zzhx v3_1 = com.android.billingclient.api.zzcg.zzb(p3, p4, p5, 0, com.google.android.gms.internal.play_billing.zzil.zza);
        java.util.Objects.requireNonNull(v3_1, "ApiFailure should not be null");
        this.zzj().zza(v3_1);
        return;
    }

    private final void zzaG(int p2)
    {
        com.google.android.gms.internal.play_billing.zzib v2_1 = com.android.billingclient.api.zzcg.zzc(p2, com.google.android.gms.internal.play_billing.zzil.zza);
        java.util.Objects.requireNonNull(v2_1, "ApiSuccess should not be null");
        this.zzj().zzf(v2_1);
        return;
    }

    private final void zzaH(int p6, p0.a p7, Runnable p8)
    {
        com.google.android.gms.internal.play_billing.zzcu.zzc(com.google.android.gms.internal.play_billing.zzcu.zzb(this.zzaE(p6), 28500, java.util.concurrent.TimeUnit.MILLISECONDS, this.zzaz()), new com.android.billingclient.api.zzca(this, p6, p7, p8), this.zzF());
        return;
    }

    public static synthetic com.android.billingclient.api.BillingResult zzal(com.android.billingclient.api.zzce p0, android.app.Activity p1, com.android.billingclient.api.BillingFlowParams p2)
    {
        return super.launchBillingFlow(p1, p2);
    }

    public static synthetic void zzam(com.android.billingclient.api.zzce p0, com.android.billingclient.api.AcknowledgePurchaseParams p1, com.android.billingclient.api.AcknowledgePurchaseResponseListener p2)
    {
        super.acknowledgePurchase(p1, p2);
        return;
    }

    public static synthetic void zzan(com.android.billingclient.api.zzce p0, com.android.billingclient.api.ConsumeParams p1, com.android.billingclient.api.ConsumeResponseListener p2)
    {
        super.consumeAsync(p1, p2);
        return;
    }

    public static synthetic void zzao(com.android.billingclient.api.zzce p0, com.android.billingclient.api.QueryProductDetailsParams p1, com.android.billingclient.api.ProductDetailsResponseListener p2)
    {
        super.queryProductDetailsAsync(p1, p2);
        return;
    }

    public static synthetic void zzap(com.android.billingclient.api.zzce p0, com.android.billingclient.api.BillingResult p1)
    {
        p0.zzm(p1);
        return;
    }

    public static bridge synthetic void zzaq(com.android.billingclient.api.zzce p0, com.google.android.gms.internal.play_billing.zzau p1)
    {
        p0.zzc = p1;
        return;
    }

    public static bridge synthetic void zzar(com.android.billingclient.api.zzce p0, int p1)
    {
        p0.zzb = p1;
        return;
    }

    public static bridge synthetic boolean zzas(com.android.billingclient.api.zzce p0, int p1)
    {
        return com.android.billingclient.api.zzce.zzaC(p1);
    }

    public static bridge synthetic com.android.billingclient.api.BillingResult zzau(com.android.billingclient.api.zzce p0, int p1, int p2)
    {
        return p0.zzaD(p1, p2);
    }

    public static synthetic Object zzav(com.android.billingclient.api.zzce p3, int p4, com.google.android.gms.internal.play_billing.zzp p5)
    {
        if (p3.zzc == null) {
            throw 0;
        } else {
            String v4_1;
            String v0_3 = p3.zzc;
            int v1_2 = p3.zza.getPackageName();
            if (p4 == 2) {
                v4_1 = "LAUNCH_BILLING_FLOW";
            } else {
                if (p4 == 3) {
                    v4_1 = "ACKNOWLEDGE_PURCHASE";
                } else {
                    if (p4 == 4) {
                        v4_1 = "CONSUME_ASYNC";
                    } else {
                        if (p4 == 5) {
                            v4_1 = "IS_FEATURE_SUPPORTED";
                        } else {
                            if (p4 == 6) {
                                v4_1 = "START_CONNECTION";
                            } else {
                                v4_1 = "QUERY_PRODUCT_DETAILS_ASYNC";
                            }
                        }
                    }
                }
            }
            v0_3.zza(v1_2, v4_1, new com.android.billingclient.api.zzcb(p5));
        }
        return "billingOverrideService.getBillingOverride";
    }

    public static bridge synthetic void zzaw(com.android.billingclient.api.zzce p0, com.google.android.gms.internal.play_billing.zzie p1, int p2, com.android.billingclient.api.BillingResult p3)
    {
        p0.zzaF(p1, 28, p3);
        return;
    }

    public static bridge synthetic void zzax(com.android.billingclient.api.zzce p0, int p1)
    {
        p0.zzaG(26);
        return;
    }

    private final int zzay(com.google.android.gms.internal.play_billing.zzcz p7)
    {
        try {
            return ((Integer) p7.get(28500, java.util.concurrent.TimeUnit.MILLISECONDS)).intValue();
        } catch (Exception v7_2) {
            this.zzaF(com.google.android.gms.internal.play_billing.zzie.zzaX, 28, com.android.billingclient.api.zzcj.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", v7_2);
            return 0;
        } catch (Exception v7_1) {
            if ((v7_1 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            this.zzaF(com.google.android.gms.internal.play_billing.zzie.zzaQ, 28, com.android.billingclient.api.zzcj.zzF);
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", v7_1);
            return 0;
        }
    }

    private final declared_synchronized java.util.concurrent.ScheduledExecutorService zzaz()
    {
        if (this.zze == null) {
            this.zze = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        }
        return this.zze;
    }

    public final void acknowledgePurchase(com.android.billingclient.api.AcknowledgePurchaseParams p3, com.android.billingclient.api.AcknowledgePurchaseResponseListener p4)
    {
        java.util.Objects.requireNonNull(p4);
        this.zzaH(3, new com.android.billingclient.api.zzbw(p4), new com.android.billingclient.api.zzbx(this, p3, p4));
        return;
    }

    public final void consumeAsync(com.android.billingclient.api.ConsumeParams p3, com.android.billingclient.api.ConsumeResponseListener p4)
    {
        this.zzaH(4, new com.android.billingclient.api.zzbt(p4, p3), new com.android.billingclient.api.zzbu(this, p3, p4));
        return;
    }

    public final void endConnection()
    {
        this.zzaA();
        super.endConnection();
        return;
    }

    public final com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity p4, com.android.billingclient.api.BillingFlowParams p5)
    {
        String v0_1 = new com.android.billingclient.api.zzby(this);
        com.android.billingclient.api.BillingResult v1_2 = new com.android.billingclient.api.zzbz(this, p4, p5);
        Exception v5_5 = this.zzay(this.zzaE(2));
        if (!com.android.billingclient.api.zzce.zzaC(v5_5)) {
            try {
                return ((com.android.billingclient.api.BillingResult) v1_2.call());
            } catch (Exception v5_3) {
                com.android.billingclient.api.BillingResult v1_0 = com.android.billingclient.api.zzcj.zzh;
                this.zzaF(com.google.android.gms.internal.play_billing.zzie.zzaY, 2, v1_0);
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "An internal error occurred.", v5_3);
                return v1_0;
            }
        } else {
            String v4_2 = this.zzaD(2, v5_5);
            v0_1.accept(v4_2);
            return v4_2;
        }
    }

    public final void queryProductDetailsAsync(com.android.billingclient.api.QueryProductDetailsParams p3, com.android.billingclient.api.ProductDetailsResponseListener p4)
    {
        this.zzaH(7, new com.android.billingclient.api.zzbr(p4), new com.android.billingclient.api.zzbs(this, p3, p4));
        return;
    }

    public final void startConnection(com.android.billingclient.api.BillingClientStateListener p1)
    {
        this.zzaB();
        super.startConnection(p1);
        return;
    }

    public final declared_synchronized boolean zzat()
    {
        if ((this.zzb != 2) || ((this.zzc == null) || (this.zzd == null))) {
            return 0;
        } else {
            return 1;
        }
    }
}
