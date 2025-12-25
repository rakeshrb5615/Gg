package com.android.billingclient.api;
 class BillingClientImpl extends com.android.billingclient.api.BillingClient {
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private com.android.billingclient.api.PendingPurchasesParams zzD;
    private boolean zzE;
    private boolean zzF;
    private volatile com.android.billingclient.api.BillingClientStateListener zzG;
    private java.util.concurrent.ExecutorService zzH;
    private final Long zzI;
    private com.google.android.gms.internal.play_billing.zzbl zzJ;
    private final Object zza;
    private volatile int zzb;
    private final String zzc;
    private final String zzd;
    private final android.os.Handler zze;
    private volatile com.android.billingclient.api.zzs zzf;
    private android.content.Context zzg;
    private com.android.billingclient.api.zzch zzh;
    private volatile com.google.android.gms.internal.play_billing.zzam zzi;
    private volatile com.android.billingclient.api.zzbf zzj;
    private boolean zzk;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    private BillingClientImpl(android.app.Activity p11, com.android.billingclient.api.PendingPurchasesParams p12, String p13, com.android.billingclient.api.BillingClient$Builder p14)
    {
        this(p11.getApplicationContext(), p12, new com.android.billingclient.api.zzbq(), p13, 0, 0, 0, 0, p14);
        return;
    }

    private BillingClientImpl(android.content.Context p9, com.android.billingclient.api.PendingPurchasesParams p10, com.android.billingclient.api.PurchasesUpdatedListener p11, String p12, String p13, com.android.billingclient.api.UserChoiceBillingListener p14, com.android.billingclient.api.zzch p15, java.util.concurrent.ExecutorService p16, com.android.billingclient.api.BillingClient$Builder p17)
    {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzm = 0;
        this.zzI = Long.valueOf(new java.util.Random().nextLong());
        this.zzJ = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.zzc = p12;
        this.zzd = com.android.billingclient.api.BillingClientImpl.zzaw();
        this.initialize(p9, p11, p10, p14, p12, 0, p17);
        return;
    }

    private BillingClientImpl(String p4)
    {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzm = 0;
        this.zzI = Long.valueOf(new java.util.Random().nextLong());
        this.zzJ = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.zzc = p4;
        this.zzd = com.android.billingclient.api.BillingClientImpl.zzaw();
        return;
    }

    public BillingClientImpl(String p2, android.content.Context p3, com.android.billingclient.api.zzch p4, java.util.concurrent.ExecutorService p5, com.android.billingclient.api.BillingClient$Builder p6)
    {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzm = 0;
        com.android.billingclient.api.zzcl v4_3 = Long.valueOf(new java.util.Random().nextLong());
        this.zzI = v4_3;
        this.zzJ = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.zzc = "8.0.0";
        String v0 = com.android.billingclient.api.BillingClientImpl.zzaw();
        this.zzd = v0;
        this.zzg = p3.getApplicationContext();
        com.google.android.gms.internal.play_billing.zzis v3_2 = com.google.android.gms.internal.play_billing.zzis.zzc();
        v3_2.zzs("8.0.0");
        if (v0 != null) {
            v3_2.zzt(v0);
        }
        v3_2.zzq(this.zzg.getPackageName());
        v3_2.zzn(v4_3.longValue());
        v3_2.zzr(p6.zza);
        v3_2.zza(android.os.Build$VERSION.SDK_INT);
        v3_2.zzp(772604006);
        try {
            v3_2.zzl(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (boolean v2_5) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", v2_5);
        }
        this.zzh = new com.android.billingclient.api.zzcl(this.zzg, ((com.google.android.gms.internal.play_billing.zzis) v3_2.zze()));
        this.zzg.getPackageName();
        this.zzE = p6.zza;
        return;
    }

    public BillingClientImpl(String p11, com.android.billingclient.api.PendingPurchasesParams p12, android.content.Context p13, com.android.billingclient.api.PurchasesUpdatedListener p14, com.android.billingclient.api.UserChoiceBillingListener p15, com.android.billingclient.api.zzch p16, java.util.concurrent.ExecutorService p17, com.android.billingclient.api.BillingClient$Builder p18)
    {
        this(p13, p12, p14, "8.0.0", 0, p15, 0, 0, p18);
        return;
    }

    public BillingClientImpl(String p9, com.android.billingclient.api.PendingPurchasesParams p10, android.content.Context p11, com.android.billingclient.api.PurchasesUpdatedListener p12, com.android.billingclient.api.zzb p13, com.android.billingclient.api.zzch p14, java.util.concurrent.ExecutorService p15, com.android.billingclient.api.BillingClient$Builder p16)
    {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzm = 0;
        this.zzI = Long.valueOf(new java.util.Random().nextLong());
        this.zzJ = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.zzc = "8.0.0";
        this.zzd = com.android.billingclient.api.BillingClientImpl.zzaw();
        this.initialize(p11, p12, p10, 0, "8.0.0", 0, p16);
        return;
    }

    public BillingClientImpl(String p8, com.android.billingclient.api.PendingPurchasesParams p9, android.content.Context p10, com.android.billingclient.api.zzco p11, com.android.billingclient.api.zzch p12, java.util.concurrent.ExecutorService p13, com.android.billingclient.api.BillingClient$Builder p14)
    {
        this.zza = new Object();
        this.zzb = 0;
        this.zze = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzm = 0;
        com.android.billingclient.api.zzcl v12_4 = Long.valueOf(new java.util.Random().nextLong());
        this.zzI = v12_4;
        this.zzJ = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.zzc = "8.0.0";
        com.android.billingclient.api.zzs v0_0 = com.android.billingclient.api.BillingClientImpl.zzaw();
        this.zzd = v0_0;
        this.zzg = p10.getApplicationContext();
        String v10_2 = com.google.android.gms.internal.play_billing.zzis.zzc();
        v10_2.zzs("8.0.0");
        if (v0_0 != null) {
            v10_2.zzt(v0_0);
        }
        v10_2.zzq(this.zzg.getPackageName());
        v10_2.zzn(v12_4.longValue());
        v10_2.zzr(p14.zza);
        v10_2.zza(android.os.Build$VERSION.SDK_INT);
        v10_2.zzp(772604006);
        try {
            v10_2.zzl(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (com.android.billingclient.api.zzs v0_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", v0_1);
        }
        this.zzh = new com.android.billingclient.api.zzcl(this.zzg, ((com.google.android.gms.internal.play_billing.zzis) v10_2.zze()));
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzf = new com.android.billingclient.api.zzs(this.zzg, 0, 0, 0, 0, this.zzh);
        this.zzD = p9;
        this.zzg.getPackageName();
        this.zzE = p14.zza;
        return;
    }

    private void initialize(android.content.Context p13, com.android.billingclient.api.PurchasesUpdatedListener p14, com.android.billingclient.api.PendingPurchasesParams p15, com.android.billingclient.api.UserChoiceBillingListener p16, String p17, com.android.billingclient.api.zzch p18, com.android.billingclient.api.BillingClient$Builder p19)
    {
        this.zzg = p13.getApplicationContext();
        boolean v13_6 = com.google.android.gms.internal.play_billing.zzis.zzc();
        v13_6.zzs(p17);
        android.content.Context v0_0 = this.zzd;
        if (v0_0 != null) {
            v13_6.zzt(v0_0);
        }
        v13_6.zzq(this.zzg.getPackageName());
        v13_6.zzn(this.zzI.longValue());
        v13_6.zzr(p19.zza);
        v13_6.zza(android.os.Build$VERSION.SDK_INT);
        v13_6.zzp(772604006);
        int v4_2 = 0;
        try {
            v13_6.zzl(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (android.content.Context v0_10) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", v0_10);
        }
        if (p18 == null) {
            this.zzh = new com.android.billingclient.api.zzcl(this.zzg, ((com.google.android.gms.internal.play_billing.zzis) v13_6.zze()));
        } else {
            this.zzh = p18;
        }
        if (p14 == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new com.android.billingclient.api.zzs(this.zzg, p14, 0, 0, p16, this.zzh);
        this.zzD = p15;
        if (p16 != null) {
            v4_2 = 1;
        }
        this.zzF = v4_2;
        this.zzE = p19.zza;
        return;
    }

    private void initialize(android.content.Context p13, com.android.billingclient.api.PurchasesUpdatedListener p14, com.android.billingclient.api.PendingPurchasesParams p15, com.android.billingclient.api.zzb p16, String p17, com.android.billingclient.api.zzch p18, com.android.billingclient.api.BillingClient$Builder p19)
    {
        this.zzg = p13.getApplicationContext();
        boolean v13_7 = com.google.android.gms.internal.play_billing.zzis.zzc();
        v13_7.zzs(p17);
        android.content.Context v0_0 = this.zzd;
        if (v0_0 != null) {
            v13_7.zzt(v0_0);
        }
        v13_7.zzq(this.zzg.getPackageName());
        v13_7.zzn(this.zzI.longValue());
        v13_7.zzr(p19.zza);
        v13_7.zza(android.os.Build$VERSION.SDK_INT);
        v13_7.zzp(772604006);
        int v4_2 = 0;
        try {
            v13_7.zzl(this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).versionCode);
        } catch (android.content.Context v0_10) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error getting app version code.", v0_10);
        }
        if (p18 == null) {
            this.zzh = new com.android.billingclient.api.zzcl(this.zzg, ((com.google.android.gms.internal.play_billing.zzis) v13_7.zze()));
        } else {
            this.zzh = p18;
        }
        if (p14 == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzf = new com.android.billingclient.api.zzs(this.zzg, p14, 0, p16, 0, this.zzh);
        this.zzD = p15;
        if (p16 != null) {
            v4_2 = 1;
        }
        this.zzF = v4_2;
        this.zzg.getPackageName();
        this.zzE = p19.zza;
        return;
    }

    private int launchBillingFlowCpp(android.app.Activity p1, com.android.billingclient.api.BillingFlowParams p2)
    {
        return this.launchBillingFlow(p1, p2).getResponseCode();
    }

    private void startConnection(long p2)
    {
        this.startConnection(new com.android.billingclient.api.zzbq(p2));
        return;
    }

    public static synthetic Void zzA(com.android.billingclient.api.BillingClientImpl p0, com.android.billingclient.api.ExternalOfferAvailabilityListener p1)
    {
        p0.zzaA(p1);
        return 0;
    }

    public static synthetic Void zzB(com.android.billingclient.api.BillingClientImpl p0, com.android.billingclient.api.ExternalOfferInformationDialogListener p1, android.app.Activity p2, android.os.ResultReceiver p3)
    {
        p0.zzaC(p1, p2, p3);
        return 0;
    }

    public static synthetic Void zzC(com.android.billingclient.api.BillingClientImpl p0, com.android.billingclient.api.ExternalOfferReportingDetailsListener p1, String p2)
    {
        p0.zzay(p1, 0);
        return 0;
    }

    public static synthetic Void zzD(com.android.billingclient.api.BillingClientImpl p0, com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener p1)
    {
        p0.zzax(p1);
        return 0;
    }

    public static synthetic Void zzE(com.android.billingclient.api.BillingClientImpl p0, com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener p1)
    {
        p0.zzaz(p1);
        return 0;
    }

    public static java.util.concurrent.Future zzG(java.util.concurrent.Callable p2, long p3, Runnable p5, android.os.Handler p6, java.util.concurrent.ExecutorService p7)
    {
        try {
            int v2_1 = p7.submit(p2);
            p6.postDelayed(new com.android.billingclient.api.zzaj(v2_1, p5), ((long) (((double) p3) * 4606732058837280358)));
            return v2_1;
        } catch (int v2_2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Async task throws exception!", v2_2);
            return 0;
        }
    }

    public static synthetic void zzH(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.ConsumeResponseListener p4, com.android.billingclient.api.ConsumeParams p5)
    {
        com.android.billingclient.api.BillingResult v1 = com.android.billingclient.api.zzcj.zzk;
        p3.zzbd(com.google.android.gms.internal.play_billing.zzie.zzx, 4, v1);
        p4.onConsumeResponse(v1, p5.getPurchaseToken());
        return;
    }

    public static synthetic void zzI(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.PurchasesResponseListener p4)
    {
        com.android.billingclient.api.BillingResult v1 = com.android.billingclient.api.zzcj.zzk;
        p3.zzbd(com.google.android.gms.internal.play_billing.zzie.zzx, 9, v1);
        p4.onQueryPurchasesResponse(v1, com.google.android.gms.internal.play_billing.zzbt.zzk());
        return;
    }

    public static synthetic void zzJ(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.BillingConfigResponseListener p4)
    {
        com.android.billingclient.api.BillingResult v1 = com.android.billingclient.api.zzcj.zzk;
        p3.zzbd(com.google.android.gms.internal.play_billing.zzie.zzx, 13, v1);
        p4.onBillingConfigResponse(v1, 0);
        return;
    }

    public static synthetic void zzK(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener p4)
    {
        p3.zzaF(p4, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.zzx, 0);
        return;
    }

    public static synthetic void zzL(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.AcknowledgePurchaseResponseListener p4)
    {
        com.android.billingclient.api.BillingResult v1 = com.android.billingclient.api.zzcj.zzk;
        p3.zzbd(com.google.android.gms.internal.play_billing.zzie.zzx, 3, v1);
        p4.onAcknowledgePurchaseResponse(v1);
        return;
    }

    public static synthetic void zzM(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.ExternalOfferAvailabilityListener p4)
    {
        p3.zzaJ(p4, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.zzx, 0);
        return;
    }

    public static synthetic void zzN(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.ProductDetailsResponseListener p4)
    {
        com.android.billingclient.api.BillingResult v1 = com.android.billingclient.api.zzcj.zzk;
        p3.zzbd(com.google.android.gms.internal.play_billing.zzie.zzx, 7, v1);
        p4.onProductDetailsResponse(v1, new com.android.billingclient.api.QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
        return;
    }

    public static synthetic void zzO(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener p4)
    {
        p3.zzaM(p4, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.zzx, 0);
        return;
    }

    public static synthetic void zzP(com.android.billingclient.api.BillingClientImpl p1, com.android.billingclient.api.BillingResult p2)
    {
        if (p1.zzf.zzd() == null) {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "No valid listener is set in BroadcastManager");
            return;
        } else {
            p1.zzf.zzd().onPurchasesUpdated(p2, 0);
            return;
        }
    }

    public static synthetic void zzQ(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.ExternalOfferInformationDialogListener p4)
    {
        p3.zzaK(p4, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.zzx, 0);
        return;
    }

    public static synthetic void zzR(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.ExternalOfferReportingDetailsListener p4)
    {
        p3.zzaI(p4, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.zzx, 0);
        return;
    }

    public static synthetic void zzS(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener p4)
    {
        p3.zzaH(p4, com.android.billingclient.api.zzcj.zzk, com.google.android.gms.internal.play_billing.zzie.zzx, 0);
        return;
    }

    public static bridge synthetic void zzT(com.android.billingclient.api.BillingClientImpl p0, int p1)
    {
        p0.zzm = p1;
        return;
    }

    public static bridge synthetic void zzU(com.android.billingclient.api.BillingClientImpl p0, com.google.android.gms.internal.play_billing.zzam p1)
    {
        p0.zzi = p1;
        return;
    }

    public static bridge synthetic void zzV(com.android.billingclient.api.BillingClientImpl p0, boolean p1)
    {
        p0.zzl = p1;
        return;
    }

    public static bridge synthetic void zzW(com.android.billingclient.api.BillingClientImpl p0, boolean p1)
    {
        p0.zzk = p1;
        return;
    }

    public static bridge synthetic void zzX(com.android.billingclient.api.BillingClientImpl p0, com.android.billingclient.api.ExternalOfferInformationDialogListener p1, com.android.billingclient.api.BillingResult p2, com.google.android.gms.internal.play_billing.zzie p3, Exception p4)
    {
        p0.zzaK(p1, p2, p3, 0);
        return;
    }

    public static bridge synthetic void zzY(com.android.billingclient.api.BillingClientImpl p0, com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener p1, com.android.billingclient.api.BillingResult p2, com.google.android.gms.internal.play_billing.zzie p3, Exception p4)
    {
        p0.zzaM(p1, p2, p3, 0);
        return;
    }

    public static bridge synthetic void zzZ(com.android.billingclient.api.BillingClientImpl p0, com.google.android.gms.internal.play_billing.zzhx p1)
    {
        p0.zzaO(p1);
        return;
    }

    public static bridge synthetic int zza(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzb;
    }

    private final synthetic Void zzaA(com.android.billingclient.api.ExternalOfferAvailabilityListener p8)
    {
        if (this.zzaX(30000)) {
            if (this.zzB) {
                com.google.android.gms.internal.play_billing.zzie v1_7 = this.zzi;
                if (v1_7 != null) {
                    v1_7.zzq(24, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.zzc, this.zzd, this.zzI.longValue()), new com.android.billingclient.api.zzbm(p8, this.zzh, this.zzm, 0));
                } else {
                    this.zzaJ(p8, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc, 0);
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn\'t support launching external offer flow.");
                this.zzaJ(p8, com.android.billingclient.api.zzcj.zzA, com.google.android.gms.internal.play_billing.zzie.zzbq, 0);
            }
        } else {
            this.zzaJ(p8, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzb, 0);
        }
        return 0;
    }

    private final synthetic Void zzaB(com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener p8, android.app.Activity p9, android.os.ResultReceiver p10)
    {
        com.google.android.gms.internal.play_billing.zzam v2 = this.zzi;
        if (v2 != null) {
            v2.zzm(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.zzc, this.zzd, this.zzI.longValue()), new com.android.billingclient.api.zzbi(new ref.WeakReference(p9), p10, 0));
            return 0;
        } else {
            this.zzaM(p8, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc, 0);
            return 0;
        }
    }

    private final synthetic Void zzaC(com.android.billingclient.api.ExternalOfferInformationDialogListener p8, android.app.Activity p9, android.os.ResultReceiver p10)
    {
        com.google.android.gms.internal.play_billing.zzam v2 = this.zzi;
        if (v2 != null) {
            v2.zzo(22, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.zzc, this.zzd, this.zzI.longValue()), new com.android.billingclient.api.zzbk(new ref.WeakReference(p9), p10, 0));
            return 0;
        } else {
            this.zzaK(p8, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc, 0);
            return 0;
        }
    }

    private final void zzaD(com.android.billingclient.api.ConsumeParams p11, com.android.billingclient.api.ConsumeResponseListener p12)
    {
        String v4 = p11.getPurchaseToken();
        try {
            void v2_3 = new StringBuilder("Consuming purchase with token: ");
            v2_3.append(v4);
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", v2_3.toString());
            try {
                com.android.billingclient.api.ConsumeResponseListener v3;
                String v1_1 = this.zzi;
            } catch (Throwable v0_3) {
                v3 = p12;
            }
            if (v1_1 != null) {
                String v12_3;
                StringBuilder v11_4;
                v3 = p12;
                if (!this.zzp) {
                    v12_3 = v1_1.zza(3, this.zzg.getPackageName(), v4);
                    v11_4 = "";
                } else {
                    StringBuilder v11_6 = this.zzg.getPackageName();
                    String v12_4 = this.zzp;
                    com.android.billingclient.api.BillingResult v5_0 = this.zzc;
                    com.google.android.gms.internal.play_billing.zzie v6_0 = this.zzd;
                    String v7_1 = this.zzI.longValue();
                    android.os.Bundle v9_1 = new android.os.Bundle();
                    if (v12_4 != null) {
                        com.google.android.gms.internal.play_billing.zzc.zzc(v9_1, v5_0, v6_0, v7_1);
                    }
                    StringBuilder v11_8 = v1_1.zze(9, v11_6, v4, v9_1);
                    v12_3 = v11_8.getInt("RESPONSE_CODE");
                    v11_4 = com.google.android.gms.internal.play_billing.zzc.zzj(v11_8, "BillingClient");
                }
                com.android.billingclient.api.BillingResult v5_1 = com.android.billingclient.api.zzcj.zza(v12_3, v11_4);
                if (v12_3 != null) {
                    StringBuilder v11_10 = new StringBuilder("Error consuming purchase with token. Response code: ");
                    v11_10.append(v12_3);
                    this.zzaG(p12, v4, v5_1, com.google.android.gms.internal.play_billing.zzie.zzw, v11_10.toString(), 0);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Successfully consumed purchase.");
                    p12.onConsumeResponse(v5_1, v4);
                    return;
                }
            } else {
                v3 = p12;
                this.zzaG(p12, v4, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc, "Service has been reset to null.", 0);
                return;
            }
        } catch (Throwable v0_2) {
            v3 = p12;
            this.zzaG(v3, v4, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzC, "Error consuming purchase!", v0_2);
            return;
        } catch (Throwable v0_1) {
            v3 = p12;
            this.zzaG(v3, v4, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.zzC, "Error consuming purchase!", v0_1);
            return;
        }
    }

    private final void zzaE(com.android.billingclient.api.AcknowledgePurchaseResponseListener p3, com.android.billingclient.api.BillingResult p4, com.google.android.gms.internal.play_billing.zzie p5, Exception p6)
    {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error in acknowledge purchase!", p6);
        this.zzbf(p5, 3, p4, com.android.billingclient.api.zzcg.zza(p6));
        p3.onAcknowledgePurchaseResponse(p4);
        return;
    }

    private final void zzaF(com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener p2, com.android.billingclient.api.BillingResult p3, com.google.android.gms.internal.play_billing.zzie p4, Exception p5)
    {
        this.zzbf(p4, 14, p3, com.android.billingclient.api.zzcg.zza(p5));
        p2.onAlternativeBillingOnlyAvailabilityResponse(p3);
        return;
    }

    private final void zzaG(com.android.billingclient.api.ConsumeResponseListener p2, String p3, com.android.billingclient.api.BillingResult p4, com.google.android.gms.internal.play_billing.zzie p5, String p6, Exception p7)
    {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", p6, p7);
        this.zzbf(p5, 4, p4, com.android.billingclient.api.zzcg.zza(p7));
        p2.onConsumeResponse(p4, p3);
        return;
    }

    private final void zzaH(com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener p2, com.android.billingclient.api.BillingResult p3, com.google.android.gms.internal.play_billing.zzie p4, Exception p5)
    {
        this.zzbf(p4, 15, p3, com.android.billingclient.api.zzcg.zza(p5));
        p2.onAlternativeBillingOnlyTokenResponse(p3, 0);
        return;
    }

    private final void zzaI(com.android.billingclient.api.ExternalOfferReportingDetailsListener p2, com.android.billingclient.api.BillingResult p3, com.google.android.gms.internal.play_billing.zzie p4, Exception p5)
    {
        this.zzbf(p4, 24, p3, com.android.billingclient.api.zzcg.zza(p5));
        p2.onExternalOfferReportingDetailsResponse(p3, 0);
        return;
    }

    private final void zzaJ(com.android.billingclient.api.ExternalOfferAvailabilityListener p2, com.android.billingclient.api.BillingResult p3, com.google.android.gms.internal.play_billing.zzie p4, Exception p5)
    {
        this.zzbf(p4, 23, p3, com.android.billingclient.api.zzcg.zza(p5));
        p2.onExternalOfferAvailabilityResponse(p3);
        return;
    }

    private final void zzaK(com.android.billingclient.api.ExternalOfferInformationDialogListener p2, com.android.billingclient.api.BillingResult p3, com.google.android.gms.internal.play_billing.zzie p4, Exception p5)
    {
        this.zzbf(p4, 25, p3, com.android.billingclient.api.zzcg.zza(p5));
        p2.onExternalOfferInformationDialogResponse(p3);
        return;
    }

    private final void zzaL(com.android.billingclient.api.BillingConfigResponseListener p3, com.android.billingclient.api.BillingResult p4, com.google.android.gms.internal.play_billing.zzie p5, Exception p6)
    {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "getBillingConfig got an exception.", p6);
        this.zzbf(p5, 13, p4, com.android.billingclient.api.zzcg.zza(p6));
        p3.onBillingConfigResponse(p4, 0);
        return;
    }

    private final void zzaM(com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener p2, com.android.billingclient.api.BillingResult p3, com.google.android.gms.internal.play_billing.zzie p4, Exception p5)
    {
        this.zzbf(p4, 16, p3, com.android.billingclient.api.zzcg.zza(p5));
        p2.onAlternativeBillingOnlyInformationDialogResponse(p3);
        return;
    }

    private final void zzaN(int p3, com.google.android.gms.internal.play_billing.zzie p4, Exception p5)
    {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "showInAppMessages error.", p5);
        com.android.billingclient.api.zzch v0_1 = this.zzh;
        String v5_2 = com.android.billingclient.api.zzcg.zza(p5);
        com.google.android.gms.internal.play_billing.zzic v1_1 = com.google.android.gms.internal.play_billing.zzig.zzc();
        v1_1.zzo(p3);
        if (p4 != 0) {
            v1_1.zzn(p4);
        }
        if (v5_2 != null) {
            v1_1.zza(v5_2);
        }
        com.google.android.gms.internal.play_billing.zzhx v3_3 = com.google.android.gms.internal.play_billing.zzhx.zzc();
        v3_3.zzl(v1_1);
        v3_3.zzp(30);
        com.google.android.gms.internal.play_billing.zzhx v3_2 = ((com.google.android.gms.internal.play_billing.zzhx) v3_3.zze());
        v0_1.zza(v3_2);
        return;
    }

    private final void zzaO(com.google.android.gms.internal.play_billing.zzhx p3)
    {
        try {
            this.zzh.zzb(p3, this.zzm);
            return;
        } catch (Throwable v3_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", v3_1);
            return;
        }
    }

    private final void zzaP(com.google.android.gms.internal.play_billing.zzhx p7, long p8, boolean p10)
    {
        try {
            this.zzh.zze(p7, this.zzm, p8, p10);
            return;
        } catch (Throwable v0_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", v0_1);
            return;
        }
    }

    private final void zzaQ(com.google.android.gms.internal.play_billing.zzib p3)
    {
        try {
            this.zzh.zzg(p3, this.zzm);
            return;
        } catch (Throwable v3_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", v3_1);
            return;
        }
    }

    private final void zzaR(com.google.android.gms.internal.play_billing.zzie p4, com.android.billingclient.api.BillingResult p5, int p6)
    {
        try {
            int v0_1;
            com.google.android.gms.internal.play_billing.zzhx v4_6 = ((com.google.android.gms.internal.play_billing.zzhv) com.android.billingclient.api.zzcg.zzb(p4, 6, p5, 0, com.google.android.gms.internal.play_billing.zzil.zza).zzm());
            String v5_1 = com.google.android.gms.internal.play_billing.zzjv.zzc();
        } catch (com.google.android.gms.internal.play_billing.zzhx v4_1) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", v4_1);
            return;
        }
        if (p6 <= null) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        v5_1.zza(v0_1);
        v5_1.zzl(p6);
        v4_6.zzo(v5_1);
        this.zzaO(((com.google.android.gms.internal.play_billing.zzhx) v4_6.zze()));
        return;
    }

    private final void zzaS(int p7)
    {
        if (this.zzb != 3) {
            String v3_2 = com.android.billingclient.api.BillingClientImpl.zzaZ(this.zzb);
            String v4 = com.android.billingclient.api.BillingClientImpl.zzaZ(p7);
            StringBuilder v5_1 = new StringBuilder("Setting clientState from ");
            v5_1.append(v3_2);
            v5_1.append(" to ");
            v5_1.append(v4);
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", v5_1.toString());
            this.zzb = p7;
            return;
        } else {
            return;
        }
    }

    private final declared_synchronized void zzaT()
    {
        int v0_0 = this.zzH;
        if (v0_0 == 0) {
            return;
        } else {
            v0_0.shutdownNow();
            this.zzH = 0;
            return;
        }
    }

    private final void zzaU(com.android.billingclient.api.BillingClientStateListener p8, int p9)
    {
        int v9_1;
        if (!this.zzaY()) {
            String v2_1;
            if (this.zzb != 1) {
                if (this.zzb != 3) {
                    this.zzaS(1);
                    if (p9 == 0) {
                        this.zzG = p8;
                        p9 = 0;
                    }
                    com.google.android.gms.internal.play_billing.zzie v3_9;
                    this.zzaV();
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Starting in-app billing setup.");
                    this.zzj = new com.android.billingclient.api.zzbf(this, p8, p9, 0);
                    this.zzj.zzc();
                    String v0_2 = new android.content.Intent("com.android.vending.billing.InAppBillingService.BIND");
                    v0_2.setPackage("com.android.vending");
                    com.google.android.gms.internal.play_billing.zzie v3_8 = this.zzg.getPackageManager().queryIntentServices(v0_2, 0);
                    if ((v3_8 == null) || (v3_8.isEmpty())) {
                        v3_9 = com.google.android.gms.internal.play_billing.zzie.zzO;
                    } else {
                        com.google.android.gms.internal.play_billing.zzie v3_12 = ((android.content.pm.ResolveInfo) v3_8.get(0)).serviceInfo;
                        if (v3_12 == null) {
                            v3_9 = com.google.android.gms.internal.play_billing.zzie.zzN;
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "The device doesn\'t have valid Play Store.");
                        } else {
                            com.android.billingclient.api.zzbf v5_1 = v3_12.packageName;
                            com.google.android.gms.internal.play_billing.zzie v3_13 = v3_12.name;
                            if ((!java.util.Objects.equals(v5_1, "com.android.vending")) || (v3_13 == null)) {
                                v3_9 = com.google.android.gms.internal.play_billing.zzie.zzN;
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "The device doesn\'t have valid Play Store.");
                            } else {
                                java.util.concurrent.ExecutorService v6_3 = new android.content.ComponentName(v5_1, v3_13);
                                com.google.android.gms.internal.play_billing.zzie v3_15 = new android.content.Intent(v0_2);
                                v3_15.setComponent(v6_3);
                                v3_15.putExtra("playBillingLibraryVersion", this.zzc);
                                if (this.zzb != 2) {
                                    if (this.zzb == 1) {
                                        String v0_8;
                                        com.android.billingclient.api.zzbf v5_5 = this.zzj;
                                        if ((p9 <= 0) || (android.os.Build$VERSION.SDK_INT < 29)) {
                                            v0_8 = this.zzg.bindService(v3_15, v5_5, 1);
                                        } else {
                                            v0_8 = this.zzg.bindService(v3_15, 1, this.zzF(), v5_5);
                                        }
                                        if (v0_8 == null) {
                                            v3_9 = com.google.android.gms.internal.play_billing.zzie.zzM;
                                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Connection to Billing service is blocked.");
                                        } else {
                                            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Service was bonded successfully.");
                                            v9_1 = 0;
                                            if (v9_1 != 0) {
                                                p8.onBillingSetupFinished(v9_1);
                                            }
                                            return;
                                        }
                                    } else {
                                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                        v2_1 = com.android.billingclient.api.zzcj.zzj;
                                        this.zzaR(com.google.android.gms.internal.play_billing.zzie.zzba, v2_1, p9);
                                        v9_1 = v2_1;
                                    }
                                } else {
                                    v9_1 = this.zzap(p9);
                                }
                            }
                        }
                    }
                    this.zzaS(0);
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Billing service unavailable on device.");
                    String v0_12 = com.android.billingclient.api.zzcj.zzb;
                    this.zzaR(v3_9, v0_12, p9);
                    v9_1 = v0_12;
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Client was already closed and can\'t be reused. Please create another instance.");
                    v2_1 = com.android.billingclient.api.zzcj.zzj;
                    this.zzaR(com.google.android.gms.internal.play_billing.zzie.zzL, v2_1, p9);
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
                v2_1 = com.android.billingclient.api.zzcj.zzd;
                this.zzaR(com.google.android.gms.internal.play_billing.zzie.zzK, v2_1, p9);
            }
        } else {
            v9_1 = this.zzap(p9);
        }
    }

    private final void zzaV()
    {
        try {
            if (this.zzj != null) {
                try {
                    this.zzg.unbindService(this.zzj);
                } catch (Throwable v2_2) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "There was an exception while unbinding service!", v2_2);
                    this.zzi = 0;
                    this.zzj = 0;
                }
                this.zzi = 0;
                this.zzj = 0;
            }
        } catch (int v1_1) {
            throw v1_1;
        }
        return;
    }

    private final boolean zzaW(long p6)
    {
        StringBuilder v1_7;
        if (android.os.Build$VERSION.SDK_INT >= 29) {
            v1_7 = 3000;
            StringBuilder v1_1 = ((com.android.billingclient.api.BillingResult) this.zzar(1).get(v1_7, java.util.concurrent.TimeUnit.MILLISECONDS));
            if (v1_1.getResponseCode() != 0) {
                int v0_0 = v1_1.getResponseCode();
                StringBuilder v1_3 = new StringBuilder("Reconnection failed with result: ");
                v1_3.append(v0_0);
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", v1_3.toString());
            } else {
                String v7_2 = v1_1.getResponseCode();
                StringBuilder v1_5 = new StringBuilder("Reconnection succeeded with result: ");
                v1_5.append(v7_2);
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", v1_5.toString());
            }
        } else {
            v1_7 = 0;
        }
        return this.zzaY();
    }

    private final boolean zzaX(long p17)
    {
        String v2_0 = com.google.android.gms.internal.play_billing.zzbi.zzb(this.zzJ);
        int v5 = 1;
        long v6_10 = 30000;
        while (v5 <= 3) {
            long v6_0 = Math.max(0, v6_10);
            if (v6_0 > 0) {
                InterruptedException v0_4 = ((com.android.billingclient.api.BillingResult) this.zzar(v5).get(v6_0, java.util.concurrent.TimeUnit.MILLISECONDS));
                if (v0_4.getResponseCode() != 0) {
                    InterruptedException v0_5 = v0_4.getResponseCode();
                    long v6_3 = new StringBuilder();
                    v6_3.append("Reconnection failed with result: ");
                    v6_3.append(v0_5);
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", v6_3.toString());
                    InterruptedException v0_14 = java.util.concurrent.TimeUnit.MILLISECONDS;
                    v6_10 = (30000 - v2_0.zza(v0_14));
                    long v12_5 = (((long) Math.pow(4611686018427387904, ((double) (v5 - 1)))) * 1000);
                    if (v6_10 >= v12_5) {
                        if ((v5 < 3) && (v12_5 > 0)) {
                            try {
                                Thread.sleep(v12_5);
                                v6_10 = (30000 - v2_0.zza(v0_14));
                            } catch (InterruptedException v0_15) {
                                Thread.currentThread().interrupt();
                                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Error sleeping during reconnection attempt: ", v0_15);
                                break;
                            }
                        }
                        v5++;
                    } else {
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Reconnection failed due to timeout limit reached.");
                        return this.zzaY();
                    }
                } else {
                    InterruptedException v0_7 = v0_4.getResponseCode();
                    long v6_5 = new StringBuilder();
                    v6_5.append("Reconnection succeeded with result: ");
                    v6_5.append(v0_7);
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", v6_5.toString());
                    return this.zzaY();
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "No time remaining for reconnection attempt.");
                return this.zzaY();
            }
        }
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Max retries reached.");
        return this.zzaY();
    }

    private final boolean zzaY()
    {
        int v3 = 0;
        if ((this.zzb == 2) && ((this.zzi != null) && (this.zzj != null))) {
            v3 = 1;
        }
        return v3;
    }

    private static final String zzaZ(int p1)
    {
        if (p1 == null) {
            return "DISCONNECTED";
        } else {
            if (p1 == 1) {
                return "CONNECTING";
            } else {
                if (p1 == 2) {
                    return "CONNECTED";
                } else {
                    return "CLOSED";
                }
            }
        }
    }

    public static bridge synthetic void zzaa(com.android.billingclient.api.BillingClientImpl p0, com.google.android.gms.internal.play_billing.zzib p1)
    {
        p0.zzaQ(p1);
        return;
    }

    public static bridge synthetic void zzab(com.android.billingclient.api.BillingClientImpl p0, com.google.android.gms.internal.play_billing.zzie p1, com.android.billingclient.api.BillingResult p2, int p3)
    {
        p0.zzaR(p1, p2, p3);
        return;
    }

    public static bridge synthetic void zzac(com.android.billingclient.api.BillingClientImpl p3, int p4)
    {
        int v0_17;
        p3.zzm = p4;
        int v1 = 0;
        if (p4 < 26) {
            v0_17 = 0;
        } else {
            v0_17 = 1;
        }
        int v0_1;
        p3.zzC = v0_17;
        if (p4 < 24) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        int v0_3;
        p3.zzB = v0_1;
        if (p4 < 23) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        int v0_5;
        p3.zzA = v0_3;
        if (p4 < 22) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        int v0_7;
        p3.zzz = v0_5;
        if (p4 < 21) {
            v0_7 = 0;
        } else {
            v0_7 = 1;
        }
        int v0_9;
        p3.zzy = v0_7;
        if (p4 < 20) {
            v0_9 = 0;
        } else {
            v0_9 = 1;
        }
        int v0_11;
        p3.zzx = v0_9;
        if (p4 < 19) {
            v0_11 = 0;
        } else {
            v0_11 = 1;
        }
        int v0_13;
        p3.zzw = v0_11;
        if (p4 < 18) {
            v0_13 = 0;
        } else {
            v0_13 = 1;
        }
        int v0_15;
        p3.zzv = v0_13;
        if (p4 < 17) {
            v0_15 = 0;
        } else {
            v0_15 = 1;
        }
        int v0_18;
        p3.zzu = v0_15;
        if (p4 < 16) {
            v0_18 = 0;
        } else {
            v0_18 = 1;
        }
        int v0_20;
        p3.zzt = v0_18;
        if (p4 < 15) {
            v0_20 = 0;
        } else {
            v0_20 = 1;
        }
        int v0_22;
        p3.zzs = v0_20;
        if (p4 < 14) {
            v0_22 = 0;
        } else {
            v0_22 = 1;
        }
        int v0_24;
        p3.zzr = v0_22;
        if (p4 < 12) {
            v0_24 = 0;
        } else {
            v0_24 = 1;
        }
        int v0_26;
        p3.zzq = v0_24;
        if (p4 < 9) {
            v0_26 = 0;
        } else {
            v0_26 = 1;
        }
        int v0_28;
        p3.zzp = v0_26;
        if (p4 < 8) {
            v0_28 = 0;
        } else {
            v0_28 = 1;
        }
        p3.zzo = v0_28;
        if (p4 >= 6) {
            v1 = 1;
        }
        p3.zzn = v1;
        return;
    }

    public static bridge synthetic void zzad(com.android.billingclient.api.BillingClientImpl p0, int p1)
    {
        p0.zzaS(0);
        return;
    }

    public static bridge synthetic void zzae(com.android.billingclient.api.BillingClientImpl p2, int p3)
    {
        if (p3 != 0) {
            p2.zzaS(0);
            return;
        } else {
            if (p2.zzb != 3) {
                int v0_1;
                boolean v2_3 = p2.zzaS(2);
                if (v2_3.zzf == null) {
                    v0_1 = 0;
                } else {
                    v0_1 = v2_3.zzf;
                }
                if (v0_1 != 0) {
                    v0_1.zzg(v2_3.zzy);
                }
                return;
            } else {
                return;
            }
        }
    }

    public static bridge synthetic void zzaf(com.android.billingclient.api.BillingClientImpl p0)
    {
        p0.zzaV();
        return;
    }

    public static bridge synthetic boolean zzah(com.android.billingclient.api.BillingClientImpl p0, long p1)
    {
        return p0.zzaX(30000);
    }

    public static bridge synthetic boolean zzai(com.android.billingclient.api.BillingClientImpl p2)
    {
        try {
            int v1 = 1;
        } catch (Throwable v2_2) {
            throw v2_2;
        }
        if (p2.zzb != 1) {
            v1 = 0;
        } else {
        }
        return v1;
    }

    public static bridge synthetic com.android.billingclient.api.zzcw zzaj(com.android.billingclient.api.BillingClientImpl p0, String p1, boolean p2, int p3)
    {
        return p0.zzbb(p1, 0, 9);
    }

    public static bridge synthetic void zzak(com.android.billingclient.api.BillingClientImpl p0, com.google.android.gms.internal.play_billing.zzie p1, int p2, com.android.billingclient.api.BillingResult p3)
    {
        p0.zzbd(p1, 9, p3);
        return;
    }

    private final synthetic android.os.Bundle zzal(int p8, String p9, String p10, com.android.billingclient.api.BillingFlowParams p11, android.os.Bundle p12)
    {
        Throwable v0_0 = this.zzi;
        if (v0_0 != null) {
            return v0_0.zzg(p8, this.zzg.getPackageName(), p9, p10, 0, p12);
        } else {
            return com.google.android.gms.internal.play_billing.zzc.zzd(com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc);
        }
    }

    private final synthetic android.os.Bundle zzam(String p9, String p10)
    {
        com.google.android.gms.internal.play_billing.zzam v2 = this.zzi;
        if (v2 != null) {
            return v2.zzf(3, this.zzg.getPackageName(), p9, p10, 0);
        } else {
            return com.google.android.gms.internal.play_billing.zzc.zzd(com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc);
        }
    }

    private final android.os.Handler zzan()
    {
        if (android.os.Looper.myLooper() != null) {
            return new android.os.Handler(android.os.Looper.myLooper());
        } else {
            return this.zze;
        }
    }

    private final com.android.billingclient.api.zzbo zzao(com.android.billingclient.api.BillingResult p2, com.google.android.gms.internal.play_billing.zzie p3, String p4, Exception p5)
    {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", p4, p5);
        this.zzbf(p3, 7, p2, com.android.billingclient.api.zzcg.zza(p5));
        return new com.android.billingclient.api.zzbo(p2.getResponseCode(), p2.getDebugMessage(), new java.util.ArrayList(), new java.util.ArrayList());
    }

    private final com.android.billingclient.api.BillingResult zzap(int p4)
    {
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
        com.google.android.gms.internal.play_billing.zzhz v0_1 = com.google.android.gms.internal.play_billing.zzib.zzc();
        v0_1.zzo(6);
        com.google.android.gms.internal.play_billing.zzjt v1_2 = com.google.android.gms.internal.play_billing.zzjv.zzc();
        int v2 = 1;
        v1_2.zzn(1);
        if (p4 <= null) {
            v2 = 0;
        }
        v1_2.zza(v2);
        v1_2.zzl(p4);
        v0_1.zzn(v1_2);
        this.zzaQ(((com.google.android.gms.internal.play_billing.zzib) v0_1.zze()));
        return com.android.billingclient.api.zzcj.zzi;
    }

    private final com.android.billingclient.api.BillingResult zzaq()
    {
        int v1 = 0;
        while (v1 < 2) {
            if (this.zzb != new int[] {0, 3})[v1]) {
                v1++;
            } else {
                return com.android.billingclient.api.zzcj.zzj;
            }
        }
        return com.android.billingclient.api.zzcj.zzh;
    }

    private final com.google.android.gms.internal.play_billing.zzcz zzar(int p2)
    {
        if ((this.zzE) && (!this.zzaY())) {
            return com.google.android.gms.internal.play_billing.zzu.zza(new com.android.billingclient.api.zzu(this, p2));
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Already connected or not opted into auto reconnection.");
            return com.google.android.gms.internal.play_billing.zzcu.zza(com.android.billingclient.api.zzcj.zzi);
        }
    }

    private final synthetic Object zzas(com.android.billingclient.api.AcknowledgePurchaseResponseListener p9, com.android.billingclient.api.AcknowledgePurchaseParams p10)
    {
        if (this.zzaX(30000)) {
            if (!android.text.TextUtils.isEmpty(p10.getPurchaseToken())) {
                if (this.zzp) {
                    String v1_0 = this.zzi;
                    if (v1_0 != null) {
                        int v0_3 = this.zzg.getPackageName();
                        com.android.billingclient.api.BillingResult v10_2 = p10.getPurchaseToken();
                        int v3_0 = this.zzc;
                        String v4 = this.zzd;
                        long v5_1 = this.zzI.longValue();
                        android.os.Bundle v7_1 = new android.os.Bundle();
                        com.google.android.gms.internal.play_billing.zzc.zzc(v7_1, v3_0, v4, v5_1);
                        com.android.billingclient.api.BillingResult v10_3 = v1_0.zzd(9, v0_3, v10_2, v7_1);
                        p9.onAcknowledgePurchaseResponse(com.android.billingclient.api.zzcj.zza(com.google.android.gms.internal.play_billing.zzc.zzb(v10_3, "BillingClient"), com.google.android.gms.internal.play_billing.zzc.zzj(v10_3, "BillingClient")));
                        return 0;
                    } else {
                        this.zzaE(p9, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc, 0);
                    }
                } else {
                    int v0_8 = com.android.billingclient.api.zzcj.zza;
                    this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzA, 3, v0_8);
                    p9.onAcknowledgePurchaseResponse(v0_8);
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Please provide a valid purchase token.");
                int v0_10 = com.android.billingclient.api.zzcj.zzg;
                this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzz, 3, v0_10);
                p9.onAcknowledgePurchaseResponse(v0_10);
            }
        } else {
            int v0_11 = com.android.billingclient.api.zzcj.zzj;
            this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzb, 3, v0_11);
            p9.onAcknowledgePurchaseResponse(v0_11);
        }
        return 0;
    }

    private final synthetic Object zzat(com.android.billingclient.api.BillingConfigResponseListener p9)
    {
        if (this.zzaX(30000)) {
            if (this.zzv) {
                com.google.android.gms.internal.play_billing.zzie v1_5 = this.zzi;
                if (v1_5 != null) {
                    String v0_2 = this.zzg.getPackageName();
                    com.android.billingclient.api.zzbj v3_0 = this.zzc;
                    int v4_0 = this.zzd;
                    int v5_1 = this.zzI.longValue();
                    android.os.Bundle v7_1 = new android.os.Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(v7_1, v3_0, v4_0, v5_1);
                    v1_5.zzn(18, v0_2, v7_1, new com.android.billingclient.api.zzbj(p9, this.zzh, this.zzm, 0));
                } else {
                    this.zzaL(p9, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc, 0);
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn\'t support get billing config.");
                com.android.billingclient.api.zzbj v3_4 = com.android.billingclient.api.zzcj.zzy;
                this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzF, 13, v3_4);
                p9.onBillingConfigResponse(v3_4, 0);
            }
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service disconnected.");
            com.android.billingclient.api.zzbj v3_6 = com.android.billingclient.api.zzcj.zzj;
            this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzb, 13, v3_6);
            p9.onBillingConfigResponse(v3_6, 0);
        }
        return 0;
    }

    private final synthetic Object zzau(android.os.Bundle p7, android.app.Activity p8, android.os.ResultReceiver p9)
    {
        com.google.android.gms.internal.play_billing.zzam v3 = this.zzi;
        if (v3 != null) {
            v3.zzr(12, this.zzg.getPackageName(), p7, new com.android.billingclient.api.zzbn(new ref.WeakReference(p8), p9, 0));
            return 0;
        } else {
            this.zzaN(-1, com.google.android.gms.internal.play_billing.zzie.zzbc, 0);
            return 0;
        }
    }

    private final String zzav(com.android.billingclient.api.QueryProductDetailsParams p2)
    {
        if (android.text.TextUtils.isEmpty(0)) {
            return this.zzg.getPackageName();
        } else {
            return 0;
        }
    }

    private static String zzaw()
    {
        try {
            return ((String) com.android.billingclient.ktx.BuildConfig.getField("VERSION_NAME").get(0));
        } catch (Exception) {
            return 0;
        }
    }

    private final synthetic Void zzax(com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener p8)
    {
        if (this.zzaX(30000)) {
            if (this.zzy) {
                com.google.android.gms.internal.play_billing.zzie v1_7 = this.zzi;
                if (v1_7 != null) {
                    v1_7.zzk(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.zzc, this.zzd, this.zzI.longValue()), new com.android.billingclient.api.zzbg(p8, this.zzh, this.zzm, 0));
                } else {
                    this.zzaH(p8, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc, 0);
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn\'t support alternative billing only.");
                this.zzaH(p8, com.android.billingclient.api.zzcj.zzD, com.google.android.gms.internal.play_billing.zzie.zzan, 0);
            }
        } else {
            this.zzaH(p8, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzb, 0);
        }
        return 0;
    }

    private final synthetic Void zzay(com.android.billingclient.api.ExternalOfferReportingDetailsListener p10, String p11)
    {
        if (this.zzaX(30000)) {
            if (this.zzz) {
                com.google.android.gms.internal.play_billing.zzie v1_7 = this.zzi;
                if (v1_7 != null) {
                    String v0_2 = this.zzg.getPackageName();
                    com.android.billingclient.api.zzbh v2_3 = this.zzg.getPackageManager().getPackageInfo(this.zzg.getPackageName(), 0).firstInstallTime;
                    int v4_1 = this.zzc;
                    String v5 = this.zzd;
                    long v6_1 = this.zzI.longValue();
                    android.os.Bundle v8_1 = new android.os.Bundle();
                    com.google.android.gms.internal.play_billing.zzc.zzc(v8_1, v4_1, v5, v6_1);
                    v8_1.putLong("appInstallTimeMillis", v2_3);
                    v1_7.zzl(22, v0_2, v8_1, new com.android.billingclient.api.zzbh(p10, this.zzh, this.zzm, 0));
                } else {
                    this.zzaI(p10, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc, 0);
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn\'t support external offer.");
                this.zzaI(p10, com.android.billingclient.api.zzcj.zzt, com.google.android.gms.internal.play_billing.zzie.zzaE, 0);
            }
        } else {
            this.zzaI(p10, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzb, 0);
        }
        return 0;
    }

    private final synthetic Void zzaz(com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener p8)
    {
        if (this.zzaX(30000)) {
            if (this.zzy) {
                com.google.android.gms.internal.play_billing.zzie v1_7 = this.zzi;
                if (v1_7 != null) {
                    v1_7.zzp(21, this.zzg.getPackageName(), com.google.android.gms.internal.play_billing.zzc.zzg(this.zzc, this.zzd, this.zzI.longValue()), new com.android.billingclient.api.zzbl(p8, this.zzh, this.zzm, 0));
                } else {
                    this.zzaF(p8, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc, 0);
                }
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn\'t support alternative billing only.");
                this.zzaF(p8, com.android.billingclient.api.zzcj.zzD, com.google.android.gms.internal.play_billing.zzie.zzan, 0);
            }
        } else {
            this.zzaF(p8, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzb, 0);
        }
        return 0;
    }

    public static bridge synthetic int zzb(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzm;
    }

    private final com.android.billingclient.api.zzcw zzba(int p2, com.android.billingclient.api.BillingResult p3, com.google.android.gms.internal.play_billing.zzie p4, String p5, Exception p6)
    {
        this.zzbf(p4, 9, p3, com.android.billingclient.api.zzcg.zza(p6));
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", p5, p6);
        return new com.android.billingclient.api.zzcw(p3, 0);
    }

    private final com.android.billingclient.api.zzcw zzbb(String p17, boolean p18, int p19)
    {
        com.android.billingclient.api.BillingClientImpl v1_0 = this;
        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(p17)));
        com.android.billingclient.api.zzcw v0_12 = new java.util.ArrayList();
        com.android.billingclient.api.zzcw v2_0 = this.zzp;
        com.android.billingclient.api.BillingResult v3_0 = this.zzw;
        com.google.android.gms.internal.play_billing.zzie v4_3 = this.zzD.isEnabledForOneTimeProducts();
        com.google.android.gms.internal.play_billing.zzie v5_3 = this.zzD.isEnabledForPrepaidPlans();
        org.json.JSONException v6_2 = this.zzI.longValue();
        android.os.Bundle v13_1 = new android.os.Bundle();
        com.google.android.gms.internal.play_billing.zzc.zzc(v13_1, this.zzc, this.zzd, v6_2);
        if ((v2_0 != null) && (v4_3 != null)) {
            v13_1.putBoolean("enablePendingPurchases", 1);
        }
        if ((v3_0 != null) && (v5_3 != null)) {
            v13_1.putBoolean("enablePendingPurchaseForSubscriptions", 1);
        }
        String v12_0 = 0;
        do {
            com.android.billingclient.api.BillingResult v8_3 = v1_0.zzi;
            if (v8_3 != null) {
                com.android.billingclient.api.zzcw v2_20;
                if (v1_0.zzp) {
                    org.json.JSONException v9_5;
                    com.android.billingclient.api.zzcw v2_18;
                    if (!v1_0.zzC) {
                        if (!v1_0.zzB) {
                            if (!v1_0.zzw) {
                                v9_5 = 9;
                            } else {
                                v2_18 = 19;
                                v9_5 = v2_18;
                            }
                        } else {
                            v2_18 = 24;
                        }
                    } else {
                        v2_18 = 26;
                    }
                    v2_20 = v8_3.zzi(v9_5, v1_0.zzg.getPackageName(), p17, v12_0, v13_1);
                } else {
                    v2_20 = v8_3.zzh(3, v1_0.zzg.getPackageName(), p17, v12_0);
                }
                com.google.android.gms.internal.play_billing.zzie v5_0;
                com.android.billingclient.api.BillingResult v8_0;
                com.google.android.gms.internal.play_billing.zzie v4_12 = com.android.billingclient.api.zzcj.zzh;
                if (v2_20 != null) {
                    String v7_9 = com.google.android.gms.internal.play_billing.zzc.zzb(v2_20, "BillingClient");
                    v8_0 = v1.a.d(v7_9, com.google.android.gms.internal.play_billing.zzc.zzj(v2_20, "BillingClient"));
                    if (v7_9 == null) {
                        if ((v2_20.containsKey("INAPP_PURCHASE_ITEM_LIST")) && ((v2_20.containsKey("INAPP_PURCHASE_DATA_LIST")) && (v2_20.containsKey("INAPP_DATA_SIGNATURE_LIST")))) {
                            String v7_17 = v2_20.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            com.android.billingclient.api.BillingResult v8_6 = v2_20.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            java.util.ArrayList vtmp29 = v2_20.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            if (v7_17 != null) {
                                if (v8_6 != null) {
                                    if (vtmp29 != null) {
                                        v8_0 = com.android.billingclient.api.zzcj.zzi;
                                        v5_0 = com.google.android.gms.internal.play_billing.zzie.zza;
                                    } else {
                                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                                        v5_0 = com.google.android.gms.internal.play_billing.zzie.zzaf;
                                        v8_0 = v4_12;
                                    }
                                } else {
                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                                    v5_0 = com.google.android.gms.internal.play_billing.zzie.zzae;
                                }
                            } else {
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                                v5_0 = com.google.android.gms.internal.play_billing.zzie.zzad;
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Bundle returned from getPurchase() doesn\'t contain required fields.");
                            v5_0 = com.google.android.gms.internal.play_billing.zzie.zzac;
                        }
                    } else {
                        org.json.JSONException v9_1 = new StringBuilder("getPurchase() failed. Response code: ");
                        v9_1.append(v7_9);
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", v9_1.toString());
                        v5_0 = com.google.android.gms.internal.play_billing.zzie.zzw;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "getPurchase() got null owned items list");
                    v5_0 = com.google.android.gms.internal.play_billing.zzie.zzab;
                }
                if (v8_0 == com.android.billingclient.api.zzcj.zzi) {
                    com.google.android.gms.internal.play_billing.zzie v5_1 = v4_12;
                    com.android.billingclient.api.BillingClientImpl v1_2 = v2_20.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    com.google.android.gms.internal.play_billing.zzie v4_2 = v2_20.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    String v7_8 = v2_20.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    com.android.billingclient.api.BillingResult v8_1 = 0;
                    org.json.JSONException v9_2 = 0;
                    while (v8_1 < v4_2.size()) {
                        String v10_3 = ((String) v4_2.get(v8_1));
                        String v11_1 = ((String) v7_8.get(v8_1));
                        com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Sku is owned: ".concat(String.valueOf(((String) v1_2.get(v8_1)))));
                        try {
                            String v12_6 = new com.android.billingclient.api.Purchase(v10_3, v11_1);
                        } catch (com.android.billingclient.api.zzcw v0_1) {
                            return this.zzba(9, com.android.billingclient.api.zzcj.zzh, com.google.android.gms.internal.play_billing.zzie.zzY, "Got an exception trying to decode the purchase!", v0_1);
                        }
                        if (android.text.TextUtils.isEmpty(v12_6.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "BUG: empty/null token!");
                            v9_2 = 1;
                        }
                        v0_12.add(v12_6);
                        v8_1++;
                    }
                    v1_0 = this;
                    if (v9_2 != null) {
                        v1_0 = this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzz, 9, v5_1);
                    }
                    v12_0 = v2_20.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Continuation token: ".concat(String.valueOf(v12_0)));
                } else {
                    return v1_0.zzba(9, v8_0, v5_0, "Purchase bundle invalid", 0);
                }
            } else {
                return v1_0.zzba(9, com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc, "Service has been reset to null", 0);
            }
        } while(!android.text.TextUtils.isEmpty(v12_0));
        return new com.android.billingclient.api.zzcw(com.android.billingclient.api.zzcj.zzi, v0_12);
    }

    private final void zzbc(com.android.billingclient.api.BillingResult p8, com.google.android.gms.internal.play_billing.zzie p9, int p10)
    {
        if (p8.getResponseCode() == 0) {
            try {
                Exception v8_11 = com.google.android.gms.internal.play_billing.zzib.zzc();
                v8_11.zzo(5);
                com.google.android.gms.internal.play_billing.zziz v9_1 = com.google.android.gms.internal.play_billing.zziz.zzc();
                v9_1.zza(p10);
                v8_11.zzl(((com.google.android.gms.internal.play_billing.zziz) v9_1.zze()));
                com.google.android.gms.internal.play_billing.zzib v1_0 = ((com.google.android.gms.internal.play_billing.zzib) v8_11.zze());
            } catch (Exception v8_3) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", v8_3);
            }
            this.zzaQ(v1_0);
            return;
        } else {
            try {
                com.google.android.gms.internal.play_billing.zzhv v0_1 = com.google.android.gms.internal.play_billing.zzhx.zzc();
                com.google.android.gms.internal.play_billing.zzic v5 = com.google.android.gms.internal.play_billing.zzig.zzc();
                v5.zzo(p8.getResponseCode());
                v5.zzl(p8.getDebugMessage());
                v5.zzn(p9);
                v0_1.zzl(v5);
                v0_1.zzp(5);
                Exception v8_5 = com.google.android.gms.internal.play_billing.zziz.zzc();
                v8_5.zza(p10);
                v0_1.zzm(((com.google.android.gms.internal.play_billing.zziz) v8_5.zze()));
                com.google.android.gms.internal.play_billing.zzib v1_1 = ((com.google.android.gms.internal.play_billing.zzhx) v0_1.zze());
            } catch (Exception v8_10) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", v8_10);
            }
            this.zzaO(v1_1);
            return;
        }
    }

    private void zzbd(com.google.android.gms.internal.play_billing.zzie p3, int p4, com.android.billingclient.api.BillingResult p5)
    {
        try {
            this.zzaO(com.android.billingclient.api.zzcg.zzb(p3, p4, p5, 0, com.google.android.gms.internal.play_billing.zzil.zza));
            return;
        } catch (Throwable v3_2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", v3_2);
            return;
        }
    }

    private final void zzbe(com.google.android.gms.internal.play_billing.zzie p5, int p6, com.android.billingclient.api.BillingResult p7, long p8)
    {
        try {
            try {
                this.zzh.zzc(com.android.billingclient.api.zzcg.zzb(p5, 2, p7, 0, com.google.android.gms.internal.play_billing.zzil.zza), this.zzm, p8);
                return;
            } catch (Throwable v5_1) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", v5_1);
                return;
            }
        } catch (Throwable v5_2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", v5_2);
            return;
        }
        this.zzh.zzc(com.android.billingclient.api.zzcg.zzb(p5, 2, p7, 0, com.google.android.gms.internal.play_billing.zzil.zza), this.zzm, p8);
        return;
    }

    private final void zzbf(com.google.android.gms.internal.play_billing.zzie p2, int p3, com.android.billingclient.api.BillingResult p4, String p5)
    {
        try {
            this.zzaO(com.android.billingclient.api.zzcg.zzb(p2, p3, p4, p5, com.google.android.gms.internal.play_billing.zzil.zza));
            return;
        } catch (Throwable v2_2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", v2_2);
            return;
        }
    }

    private final void zzbg(com.google.android.gms.internal.play_billing.zzie p3, int p4, com.android.billingclient.api.BillingResult p5, long p6, boolean p8)
    {
        try {
            this.zzaP(com.android.billingclient.api.zzcg.zzb(p3, 2, p5, 0, com.google.android.gms.internal.play_billing.zzil.zza), p6, p8);
            return;
        } catch (Throwable v3_2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", v3_2);
            return;
        }
    }

    private final void zzbh(com.google.android.gms.internal.play_billing.zzie p2, int p3, com.android.billingclient.api.BillingResult p4, String p5, long p6, boolean p8)
    {
        try {
            this.zzaP(com.android.billingclient.api.zzcg.zzb(p2, 2, p4, p5, com.google.android.gms.internal.play_billing.zzil.zza), p6, p8);
            return;
        } catch (Throwable v2_2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", v2_2);
            return;
        }
    }

    private void zzbi(int p3)
    {
        try {
            this.zzaQ(com.android.billingclient.api.zzcg.zzc(p3, com.google.android.gms.internal.play_billing.zzil.zza));
            return;
        } catch (Throwable v3_2) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to log.", v3_2);
            return;
        }
    }

    public static bridge synthetic android.content.Context zzc(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzg;
    }

    public static synthetic android.os.Bundle zzd(com.android.billingclient.api.BillingClientImpl p0, String p1, String p2)
    {
        return p0.zzam(p1, p2);
    }

    public static synthetic android.os.Bundle zze(com.android.billingclient.api.BillingClientImpl p0, int p1, String p2, String p3, com.android.billingclient.api.BillingFlowParams p4, android.os.Bundle p5)
    {
        return p0.zzal(p1, p2, p3, p4, p5);
    }

    public static bridge synthetic android.os.Handler zzf(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzan();
    }

    public static bridge synthetic com.android.billingclient.api.BillingClientStateListener zzh(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzG;
    }

    public static bridge synthetic com.android.billingclient.api.zzch zzi(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzh;
    }

    public static bridge synthetic com.android.billingclient.api.BillingResult zzk(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzaq();
    }

    public static bridge synthetic com.android.billingclient.api.BillingResult zzl(Exception p0)
    {
        if (!(p0 instanceof android.os.DeadObjectException)) {
            return com.android.billingclient.api.zzcj.zzh;
        } else {
            return com.android.billingclient.api.zzcj.zzj;
        }
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzam zzn(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzi;
    }

    public static bridge synthetic com.google.android.gms.internal.play_billing.zzbl zzo(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzJ;
    }

    public static bridge synthetic Long zzp(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzI;
    }

    public static synthetic Object zzq(com.android.billingclient.api.BillingClientImpl p1, int p2, com.google.android.gms.internal.play_billing.zzp p3)
    {
        p1.zzaU(new com.android.billingclient.api.zzbc(p1, p3), p2);
        return "reconnectIfNeeded";
    }

    public static synthetic Object zzr(com.android.billingclient.api.BillingClientImpl p3, com.android.billingclient.api.ConsumeResponseListener p4, com.android.billingclient.api.ConsumeParams p5)
    {
        if (p3.zzaX(30000)) {
            p3.zzaD(p5, p4);
        } else {
            com.android.billingclient.api.BillingResult v1 = com.android.billingclient.api.zzcj.zzj;
            p3.zzbd(com.google.android.gms.internal.play_billing.zzie.zzb, 4, v1);
            p4.onConsumeResponse(v1, p5.getPurchaseToken());
        }
        return 0;
    }

    public static synthetic Object zzs(com.android.billingclient.api.BillingClientImpl p2, com.android.billingclient.api.ProductDetailsResponseListener p3, com.android.billingclient.api.QueryProductDetailsParams p4)
    {
        if (p2.zzaX(30000)) {
            if (p2.zzu) {
                java.util.List v2_7 = p2.zzg(p4);
                p3.onProductDetailsResponse(com.android.billingclient.api.zzcj.zza(v2_7.zza(), v2_7.zzb()), new com.android.billingclient.api.QueryProductDetailsResult(v2_7.zzc(), v2_7.zzd()));
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Querying product details is not supported.");
                com.android.billingclient.api.QueryProductDetailsResult v0_6 = com.android.billingclient.api.zzcj.zzr;
                p2.zzbd(com.google.android.gms.internal.play_billing.zzie.zzt, 7, v0_6);
                p3.onProductDetailsResponse(v0_6, new com.android.billingclient.api.QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
            }
        } else {
            com.android.billingclient.api.QueryProductDetailsResult v0_7 = com.android.billingclient.api.zzcj.zzj;
            p2.zzbd(com.google.android.gms.internal.play_billing.zzie.zzb, 7, v0_7);
            p3.onProductDetailsResponse(v0_7, new com.android.billingclient.api.QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
        }
        return 0;
    }

    public static synthetic Object zzt(com.android.billingclient.api.BillingClientImpl p0, com.android.billingclient.api.AcknowledgePurchaseResponseListener p1, com.android.billingclient.api.AcknowledgePurchaseParams p2)
    {
        p0.zzas(p1, p2);
        return 0;
    }

    public static synthetic Object zzu(com.android.billingclient.api.BillingClientImpl p0, android.os.Bundle p1, android.app.Activity p2, android.os.ResultReceiver p3)
    {
        p0.zzau(p1, p2, p3);
        return 0;
    }

    public static synthetic Object zzv(com.android.billingclient.api.BillingClientImpl p0, com.android.billingclient.api.BillingConfigResponseListener p1)
    {
        p0.zzat(p1);
        return 0;
    }

    public static bridge synthetic Object zzw(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zza;
    }

    public static bridge synthetic String zzx(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic String zzy(com.android.billingclient.api.BillingClientImpl p0)
    {
        return p0.zzd;
    }

    public static synthetic Void zzz(com.android.billingclient.api.BillingClientImpl p0, com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener p1, android.app.Activity p2, android.os.ResultReceiver p3)
    {
        p0.zzaB(p1, p2, p3);
        return 0;
    }

    public void acknowledgePurchase(com.android.billingclient.api.AcknowledgePurchaseParams p7, com.android.billingclient.api.AcknowledgePurchaseResponseListener p8)
    {
        if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzaa(this, p8, p7), 30000, new com.android.billingclient.api.zzab(this, p8), this.zzan(), this.zzF()) == null) {
            com.android.billingclient.api.BillingResult v7_2 = this.zzaq();
            this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzy, 3, v7_2);
            p8.onAcknowledgePurchaseResponse(v7_2);
        }
        return;
    }

    public void consumeAsync(com.android.billingclient.api.ConsumeParams p7, com.android.billingclient.api.ConsumeResponseListener p8)
    {
        if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzak(this, p8, p7), 30000, new com.android.billingclient.api.zzam(this, p8, p7), this.zzan(), this.zzF()) == null) {
            com.android.billingclient.api.BillingResult v0_3 = this.zzaq();
            this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzy, 4, v0_3);
            p8.onConsumeResponse(v0_3, p7.getPurchaseToken());
        }
        return;
    }

    public void createAlternativeBillingOnlyReportingDetailsAsync(com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener p7)
    {
        if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzaf(this, p7), 30000, new com.android.billingclient.api.zzag(this, p7), this.zzan(), this.zzF()) == null) {
            this.zzaH(p7, this.zzaq(), com.google.android.gms.internal.play_billing.zzie.zzy, 0);
        }
        return;
    }

    public void createExternalOfferReportingDetailsAsync(com.android.billingclient.api.ExternalOfferReportingDetailsListener p8)
    {
        if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzaq(this, p8, 0), 30000, new com.android.billingclient.api.zzar(this, p8), this.zzan(), this.zzF()) == null) {
            this.zzaI(p8, this.zzaq(), com.google.android.gms.internal.play_billing.zzie.zzy, 0);
        }
        return;
    }

    public void endConnection()
    {
        this.zzbi(12);
        try {
            if (this.zzf != null) {
                this.zzf.zzf();
            }
            try {
                com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Unbinding from service.");
                this.zzaV();
                try {
                    this.zzaT();
                } catch (Throwable v3_1) {
                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "There was an exception while shutting down the executor service while ending connection!", v3_1);
                }
                this.zzaS(3);
                this.zzG = 0;
                return;
            } catch (Throwable v1_1) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "There was an exception while unbinding from the service while ending connection!", v1_1);
            }
        } catch (Throwable v1_5) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", v1_5);
        } catch (Throwable v1_4) {
            throw v1_4;
        }
    }

    public void getBillingConfigAsync(com.android.billingclient.api.GetBillingConfigParams p7, com.android.billingclient.api.BillingConfigResponseListener p8)
    {
        if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzad(this, p8), 30000, new com.android.billingclient.api.zzae(this, p8), this.zzan(), this.zzF()) == null) {
            com.android.billingclient.api.BillingResult v7_1 = this.zzaq();
            this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzy, 13, v7_1);
            p8.onBillingConfigResponse(v7_1, 0);
        }
        return;
    }

    public final int getConnectionState()
    {
        try {
            return this.zzb;
        } catch (Throwable v1_1) {
            throw v1_1;
        }
    }

    public void isAlternativeBillingOnlyAvailableAsync(com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener p7)
    {
        if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzah(this, p7), 30000, new com.android.billingclient.api.zzai(this, p7), this.zzan(), this.zzF()) == null) {
            this.zzaF(p7, this.zzaq(), com.google.android.gms.internal.play_billing.zzie.zzy, 0);
        }
        return;
    }

    public void isExternalOfferAvailableAsync(com.android.billingclient.api.ExternalOfferAvailabilityListener p7)
    {
        if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzau(this, p7), 30000, new com.android.billingclient.api.zzv(this, p7), this.zzan(), this.zzF()) == null) {
            this.zzaJ(p7, this.zzaq(), com.google.android.gms.internal.play_billing.zzie.zzy, 0);
        }
        return;
    }

    public final com.android.billingclient.api.BillingResult isFeatureSupported(String p4)
    {
        if (this.zzaW(3000)) {
            switch (p4.hashCode()) {
                case -422092961:
                    if (!p4.equals("subscriptionsUpdate")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_21;
                        if (!this.zzl) {
                            v4_21 = com.android.billingclient.api.zzcj.zzm;
                        } else {
                            v4_21 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_21, com.google.android.gms.internal.play_billing.zzie.zzj, 3);
                        return v4_21;
                    }
                case 96321:
                    if (!p4.equals("aaa")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_19;
                        if (!this.zzs) {
                            v4_19 = com.android.billingclient.api.zzcj.zzo;
                        } else {
                            v4_19 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_19, com.google.android.gms.internal.play_billing.zzie.zzE, 6);
                        return v4_19;
                    }
                case 97314:
                    if (!p4.equals("bbb")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_17;
                        if (!this.zzq) {
                            v4_17 = com.android.billingclient.api.zzcj.zzs;
                        } else {
                            v4_17 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_17, com.google.android.gms.internal.play_billing.zzie.zzD, 5);
                        return v4_17;
                    }
                case 98307:
                    if (!p4.equals("ccc")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_15;
                        if (!this.zzt) {
                            v4_15 = com.android.billingclient.api.zzcj.zzp;
                        } else {
                            v4_15 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_15, com.google.android.gms.internal.play_billing.zzie.zzs, 8);
                        return v4_15;
                    }
                case 99300:
                    if (!p4.equals("ddd")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_13;
                        if (!this.zzr) {
                            v4_13 = com.android.billingclient.api.zzcj.zzq;
                        } else {
                            v4_13 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_13, com.google.android.gms.internal.play_billing.zzie.zzu, 7);
                        return v4_13;
                    }
                case 100293:
                    if (!p4.equals("eee")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_10;
                        if (!this.zzt) {
                            v4_10 = com.android.billingclient.api.zzcj.zzp;
                        } else {
                            v4_10 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_10, com.google.android.gms.internal.play_billing.zzie.zzai, 9);
                        return v4_10;
                    }
                case 101286:
                    if (!p4.equals("fff")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_8;
                        if (!this.zzu) {
                            v4_8 = com.android.billingclient.api.zzcj.zzr;
                        } else {
                            v4_8 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_8, com.google.android.gms.internal.play_billing.zzie.zzt, 10);
                        return v4_8;
                    }
                case 102279:
                    if (!p4.equals("ggg")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_5;
                        if (!this.zzv) {
                            v4_5 = com.android.billingclient.api.zzcj.zzy;
                        } else {
                            v4_5 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_5, com.google.android.gms.internal.play_billing.zzie.zzF, 11);
                        return v4_5;
                    }
                case 103272:
                    if (!p4.equals("hhh")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_3;
                        if (!this.zzv) {
                            v4_3 = com.android.billingclient.api.zzcj.zzz;
                        } else {
                            v4_3 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_3, com.google.android.gms.internal.play_billing.zzie.zzG, 12);
                        return v4_3;
                    }
                case 104265:
                    if (!p4.equals("iii")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_1;
                        if (!this.zzx) {
                            v4_1 = com.android.billingclient.api.zzcj.zzC;
                        } else {
                            v4_1 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_1, com.google.android.gms.internal.play_billing.zzie.zzah, 13);
                        return v4_1;
                    }
                case 105258:
                    if (!p4.equals("jjj")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_36;
                        if (!this.zzy) {
                            v4_36 = com.android.billingclient.api.zzcj.zzD;
                        } else {
                            v4_36 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_36, com.google.android.gms.internal.play_billing.zzie.zzan, 14);
                        return v4_36;
                    }
                case 106251:
                    if (!p4.equals("kkk")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_34;
                        if (!this.zzB) {
                            v4_34 = com.android.billingclient.api.zzcj.zzA;
                        } else {
                            v4_34 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_34, com.google.android.gms.internal.play_billing.zzie.zzbq, 18);
                        return v4_34;
                    }
                case 107244:
                    if (!p4.equals("lll")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_32;
                        if (!this.zzA) {
                            v4_32 = com.android.billingclient.api.zzcj.zzu;
                        } else {
                            v4_32 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_32, com.google.android.gms.internal.play_billing.zzie.zzaZ, 19);
                        return v4_32;
                    }
                case 108237:
                    if (!p4.equals("mmm")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_30;
                        if (!this.zzB) {
                            v4_30 = com.android.billingclient.api.zzcj.zzv;
                        } else {
                            v4_30 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_30, com.google.android.gms.internal.play_billing.zzie.zzbo, 20);
                        return v4_30;
                    }
                case 109230:
                    if (!p4.equals("nnn")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_28;
                        if (!this.zzC) {
                            v4_28 = com.android.billingclient.api.zzcj.zzw;
                        } else {
                            v4_28 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_28, com.google.android.gms.internal.play_billing.zzie.zzbH, 21);
                        return v4_28;
                    }
                case 207616302:
                    if (!p4.equals("priceChangeConfirmation")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_26;
                        if (!this.zzo) {
                            v4_26 = com.android.billingclient.api.zzcj.zzn;
                        } else {
                            v4_26 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_26, com.google.android.gms.internal.play_billing.zzie.zzI, 4);
                        return v4_26;
                    }
                case 1987365622:
                    if (!p4.equals("subscriptions")) {
                    } else {
                        com.android.billingclient.api.BillingResult v4_11;
                        if (!this.zzk) {
                            v4_11 = com.android.billingclient.api.zzcj.zzl;
                        } else {
                            v4_11 = com.android.billingclient.api.zzcj.zzi;
                        }
                        this.zzbc(v4_11, com.google.android.gms.internal.play_billing.zzie.zzi, 2);
                        return v4_11;
                    }
                default:
            }
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Unsupported feature: ".concat(p4));
            com.android.billingclient.api.BillingResult v4_23 = com.android.billingclient.api.zzcj.zzx;
            this.zzbc(v4_23, com.google.android.gms.internal.play_billing.zzie.zzH, 1);
            return v4_23;
        } else {
            com.android.billingclient.api.BillingResult v4_24 = com.android.billingclient.api.zzcj.zzj;
            if (v4_24.getResponseCode() == 0) {
                this.zzbi(5);
                return v4_24;
            } else {
                this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzb, 5, v4_24);
                return v4_24;
            }
        }
    }

    public final boolean isReady()
    {
        if (!this.zzE) {
            return this.zzaY();
        } else {
            return 1;
        }
    }

    public com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity p32, com.android.billingclient.api.BillingFlowParams p33)
    {
        void v1_0 = this;
        com.android.billingclient.api.BillingFlowParams v5_12 = new java.util.Random().nextLong();
        if ((this.zzf == null) || (this.zzf.zzd() == null)) {
            String v4_4 = com.android.billingclient.api.zzcj.zzE;
            this.zzbe(com.google.android.gms.internal.play_billing.zzie.zzl, 2, v4_4, v5_12);
            return v4_4;
        } else {
            if (this.zzaW(3000)) {
                String v8_3;
                if (this.zzj == null) {
                    v8_3 = 0;
                } else {
                    v8_3 = this.zzj.zzd();
                }
                int v11_3;
                String v12_1;
                java.util.concurrent.Future v0_12 = p33.zzj();
                String v2_4 = p33.zzk();
                int v9_4 = 0;
                String v4_38 = ((com.android.billingclient.api.SkuDetails) com.google.android.gms.internal.play_billing.zzby.zza(v0_12, 0));
                String v10_6 = ((com.android.billingclient.api.BillingFlowParams$ProductDetailsParams) com.google.android.gms.internal.play_billing.zzby.zza(v2_4, 0));
                if (v4_38 == null) {
                    v11_3 = v10_6.zza().getProductId();
                    v12_1 = v10_6.zza().getProductType();
                } else {
                    v11_3 = v4_38.getSku();
                    v12_1 = v4_38.getType();
                }
                if ((v12_1.equals("subs")) && (!this.zzk)) {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn\'t support subscriptions.");
                    String v4_52 = com.android.billingclient.api.zzcj.zzl;
                    this.zzbg(com.google.android.gms.internal.play_billing.zzie.zzi, 2, v4_52, v5_12, v8_3).zzm(v4_52);
                    return v4_52;
                } else {
                    if ((p33.zzt()) && (!this.zzn)) {
                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn\'t support extra params for buy intent.");
                        String v4_57 = com.android.billingclient.api.zzcj.zzf;
                        this.zzbg(com.google.android.gms.internal.play_billing.zzie.zzr, 2, v4_57, v5_12, v8_3).zzm(v4_57);
                        return v4_57;
                    } else {
                        if ((v0_12.size() > 1) && (!this.zzt)) {
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn\'t support multi-item purchases.");
                            String v4_58 = com.android.billingclient.api.zzcj.zzp;
                            this.zzbg(com.google.android.gms.internal.play_billing.zzie.zzs, 2, v4_58, v5_12, v8_3).zzm(v4_58);
                            return v4_58;
                        } else {
                            if ((!v2_4.isEmpty()) && (!this.zzu)) {
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn\'t support purchases with ProductDetails.");
                                String v4_0 = com.android.billingclient.api.zzcj.zzr;
                                this.zzbg(com.google.android.gms.internal.play_billing.zzie.zzt, 2, v4_0, v5_12, v8_3).zzm(v4_0);
                                return v4_0;
                            } else {
                                com.android.billingclient.api.zzw v13_2 = v4_38;
                                String v4_1 = p33.zzd();
                                if (v4_1 == com.android.billingclient.api.zzcj.zzi) {
                                    java.util.concurrent.Future v0_2;
                                    int v25;
                                    if (!this.zzn) {
                                        v25 = v5_12;
                                        v0_2 = com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzx(this, v11_3, v12_1), 5000, 0, this.zze, this.zzF());
                                    } else {
                                        com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails v15_2 = this.zzw;
                                        long v14_1 = this.zzF;
                                        boolean v19_0 = this.zzD.isEnabledForOneTimeProducts();
                                        int v3_5 = this.zzc;
                                        int v20_0 = this.zzp;
                                        String v4_6 = this.zzd;
                                        int v21 = v8_3;
                                        int v22_0 = this.zzD.isEnabledForPrepaidPlans();
                                        String v8_1 = this.zzI.longValue();
                                        com.android.billingclient.api.BillingFlowParams$ProductDetailsParams v23 = v10_6;
                                        this.zzg.getPackageName();
                                        String v10_4 = new android.os.Bundle();
                                        com.google.android.gms.internal.play_billing.zzc.zzc(v10_4, v3_5, v4_6, v8_1);
                                        v10_4.putLong("billingClientTransactionId", v5_12);
                                        if (p33.zzb() != 0) {
                                            v10_4.putInt("prorationMode", p33.zzb());
                                        }
                                        if (!android.text.TextUtils.isEmpty(p33.zze())) {
                                            v10_4.putString("accountId", p33.zze());
                                        }
                                        if (!android.text.TextUtils.isEmpty(p33.zzf())) {
                                            v10_4.putString("obfuscatedProfileId", p33.zzf());
                                        }
                                        if (p33.zzs()) {
                                            v10_4.putBoolean("isOfferPersonalizedByDeveloper", 1);
                                        }
                                        if (!android.text.TextUtils.isEmpty(0)) {
                                            v10_4.putStringArrayList("skusToReplace", new java.util.ArrayList(java.util.Arrays.asList(new String[] {0, 0}))));
                                        }
                                        if (!android.text.TextUtils.isEmpty(p33.zzh())) {
                                            v10_4.putString("oldSkuPurchaseToken", p33.zzh());
                                        }
                                        String v4_15;
                                        p33.zzg();
                                        if (android.text.TextUtils.isEmpty(0)) {
                                            v4_15 = 0;
                                        } else {
                                            p33.zzg();
                                            v4_15 = 0;
                                            v10_4.putString("oldSkuPurchaseId", 0);
                                        }
                                        if (!android.text.TextUtils.isEmpty(p33.zzi())) {
                                            v10_4.putString("originalExternalTransactionId", p33.zzi());
                                        }
                                        if (!android.text.TextUtils.isEmpty(v4_15)) {
                                            v10_4.putString("paymentsPurchaseParams", v4_15);
                                        }
                                        if ((v20_0 == 0) || (!v19_0)) {
                                            String v4_16 = 1;
                                        } else {
                                            v4_16 = 1;
                                            v10_4.putBoolean("enablePendingPurchases", 1);
                                        }
                                        if ((v15_2 != null) && (v22_0 != 0)) {
                                            v10_4.putBoolean("enablePendingPurchaseForSubscriptions", v4_16);
                                        }
                                        if (v14_1 != 0) {
                                            v10_4.putBoolean("enableAlternativeBilling", v4_16);
                                        }
                                        p33.zzc();
                                        p33.zza();
                                        int v3_34 = new java.util.ArrayList();
                                        String v4_18 = p33.zzk().iterator();
                                        while (v4_18.hasNext()) {
                                            v4_18.next();
                                        }
                                        if (!v3_34.isEmpty()) {
                                            String v4_20 = com.google.android.gms.internal.play_billing.zzdk.zza();
                                            v4_20.zza(v3_34);
                                            v10_4.putByteArray("subscriptionProductReplacementParamsList", ((com.google.android.gms.internal.play_billing.zzdk) v4_20.zze()).zzM());
                                        }
                                        int v30_0;
                                        if (v0_12.isEmpty()) {
                                            v25 = v5_12;
                                            v30_0 = v11_3;
                                            java.util.concurrent.Future v0_9 = new java.util.ArrayList((v2_4.size() - 1));
                                            int v3_42 = new java.util.ArrayList((v2_4.size() - 1));
                                            com.android.billingclient.api.BillingFlowParams v5_3 = new java.util.ArrayList();
                                            String v6_1 = new java.util.ArrayList();
                                            String v8_6 = new java.util.ArrayList();
                                            int v9_3 = new java.util.ArrayList();
                                            int v11_1 = 0;
                                            while (v11_1 < v2_4.size()) {
                                                long v14_4 = ((com.android.billingclient.api.BillingFlowParams$ProductDetailsParams) v2_4.get(v11_1));
                                                com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails v15_3 = v14_4.zza();
                                                if (!v15_3.zzb().isEmpty()) {
                                                    v5_3.add(v15_3.zzb());
                                                }
                                                v6_1.add(v14_4.zzb());
                                                String v4_33 = v15_3.zzc();
                                                if ((v15_3.zzd() != null) && (!v15_3.zzd().isEmpty())) {
                                                    long v14_9 = v15_3.zzd().iterator();
                                                    while (v14_9.hasNext()) {
                                                        com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails v15_6 = ((com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails) v14_9.next());
                                                        if (!android.text.TextUtils.isEmpty(v15_6.zzb())) {
                                                            v4_33 = v15_6.zzb();
                                                            break;
                                                        }
                                                    }
                                                }
                                                if (!android.text.TextUtils.isEmpty(v4_33)) {
                                                    v8_6.add(v4_33);
                                                }
                                                if (v11_1 > 0) {
                                                    v0_9.add(((com.android.billingclient.api.BillingFlowParams$ProductDetailsParams) v2_4.get(v11_1)).zza().getProductId());
                                                    v3_42.add(((com.android.billingclient.api.BillingFlowParams$ProductDetailsParams) v2_4.get(v11_1)).zza().getProductType());
                                                }
                                                v11_1++;
                                            }
                                            v10_4.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", v6_1);
                                            if (!v9_3.isEmpty()) {
                                                v10_4.putIntegerArrayList("autoPayBalanceThresholdList", v9_3);
                                            }
                                            if (!v5_3.isEmpty()) {
                                                v10_4.putStringArrayList("skuDetailsTokens", v5_3);
                                            }
                                            if (!v8_6.isEmpty()) {
                                                v10_4.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", v8_6);
                                            }
                                            if (!v0_9.isEmpty()) {
                                                v10_4.putStringArrayList("additionalSkus", v0_9);
                                                v10_4.putStringArrayList("additionalSkuTypes", v3_42);
                                            }
                                        } else {
                                            int v3_44 = new java.util.ArrayList();
                                            String v4_45 = new java.util.ArrayList();
                                            String v8_8 = new java.util.ArrayList();
                                            int v9_6 = new java.util.ArrayList();
                                            long v14_12 = new java.util.ArrayList();
                                            com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails v15_7 = v0_12.size();
                                            v25 = v5_12;
                                            com.android.billingclient.api.BillingFlowParams v5_4 = 0;
                                            boolean v19_3 = 0;
                                            int v20_1 = 0;
                                            int v22_1 = 0;
                                            int v24 = 0;
                                            while (v5_4 < v15_7) {
                                                String v27_2;
                                                com.android.billingclient.api.BillingFlowParams v5_18 = (v5_4 + 1);
                                                String v6_10 = ((com.android.billingclient.api.SkuDetails) v0_12.get(v5_4));
                                                if (v6_10.zzf().isEmpty()) {
                                                    v27_2 = v5_18;
                                                } else {
                                                    v27_2 = v5_18;
                                                    v3_44.add(v6_10.zzf());
                                                }
                                                com.android.billingclient.api.BillingFlowParams v5_26;
                                                com.android.billingclient.api.BillingFlowParams v5_20 = v6_10.zzc();
                                                com.android.billingclient.api.SkuDetails v28 = v6_10;
                                                String v6_11 = v28.zzb();
                                                int v29 = v28.zza();
                                                int v30_1 = v11_3;
                                                int v11_4 = v28.zze();
                                                v4_45.add(v5_20);
                                                v19_3 |= (android.text.TextUtils.isEmpty(v5_20) ^ 1);
                                                v8_8.add(v6_11);
                                                v20_1 |= (android.text.TextUtils.isEmpty(v6_11) ^ 1);
                                                v9_6.add(Integer.valueOf(v29));
                                                if (v29 == 0) {
                                                    v5_26 = 0;
                                                } else {
                                                    v5_26 = 1;
                                                }
                                                v22_1 |= v5_26;
                                                v24 |= (android.text.TextUtils.isEmpty(v11_4) ^ 1);
                                                v14_12.add(v11_4);
                                                v5_4 = v27_2;
                                                v11_3 = v30_1;
                                            }
                                            v30_0 = v11_3;
                                            if (!v3_44.isEmpty()) {
                                                v10_4.putStringArrayList("skuDetailsTokens", v3_44);
                                            }
                                            if (v19_3) {
                                                v10_4.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", v4_45);
                                            }
                                            if (v20_1 != 0) {
                                                v10_4.putStringArrayList("SKU_OFFER_ID_LIST", v8_8);
                                            }
                                            if (v22_1 != 0) {
                                                v10_4.putIntegerArrayList("SKU_OFFER_TYPE_LIST", v9_6);
                                            }
                                            if (v24 != 0) {
                                                v10_4.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", v14_12);
                                            }
                                            if (v0_12.size() > 1) {
                                                int v3_51 = new java.util.ArrayList((v0_12.size() - 1));
                                                com.android.billingclient.api.BillingFlowParams v5_10 = new java.util.ArrayList((v0_12.size() - 1));
                                                String v6_4 = 1;
                                                while (v6_4 < v0_12.size()) {
                                                    v3_51.add(((com.android.billingclient.api.SkuDetails) v0_12.get(v6_4)).getSku());
                                                    v5_10.add(((com.android.billingclient.api.SkuDetails) v0_12.get(v6_4)).getType());
                                                    v6_4++;
                                                }
                                                v10_4.putStringArrayList("additionalSkus", v3_51);
                                                v10_4.putStringArrayList("additionalSkuTypes", v5_10);
                                            }
                                        }
                                        if ((v10_4.containsKey("SKU_OFFER_ID_TOKEN_LIST")) && (!this.zzr)) {
                                            String v4_47 = com.android.billingclient.api.zzcj.zzq;
                                            this.zzbg(com.google.android.gms.internal.play_billing.zzie.zzu, 2, v4_47, v25, v21).zzm(v4_47);
                                            return v4_47;
                                        } else {
                                            v8_3 = v21;
                                            if ((v13_2 == null) || (android.text.TextUtils.isEmpty(v13_2.zzd()))) {
                                                if ((v23 == null) || (android.text.TextUtils.isEmpty(v23.zza().zza()))) {
                                                    v9_4 = 0;
                                                    long v14_13 = 0;
                                                } else {
                                                    v10_4.putString("skuPackageName", v23.zza().zza());
                                                    v9_4 = 0;
                                                    v14_13 = 1;
                                                }
                                            } else {
                                                v10_4.putString("skuPackageName", v13_2.zzd());
                                            }
                                            if (!android.text.TextUtils.isEmpty(v9_4)) {
                                                v10_4.putString("accountName", v9_4);
                                            }
                                            java.util.concurrent.Future v0_29 = p32.getIntent();
                                            if (v0_29 != null) {
                                                if (!android.text.TextUtils.isEmpty(v0_29.getStringExtra("PROXY_PACKAGE"))) {
                                                    java.util.concurrent.Future v0_30 = v0_29.getStringExtra("PROXY_PACKAGE");
                                                    v10_4.putString("proxyPackage", v0_30);
                                                    try {
                                                        v10_4.putString("proxyPackageVersion", this.zzg.getPackageManager().getPackageInfo(v0_30, 0).versionName);
                                                    } catch (android.content.pm.PackageManager$NameNotFoundException) {
                                                        v10_4.putString("proxyPackageVersion", "package not found");
                                                    }
                                                }
                                            } else {
                                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Activity\'s intent is null.");
                                            }
                                            if ((!this.zzu) || (v2_4.isEmpty())) {
                                                if ((!this.zzs) || (v14_13 == 0)) {
                                                    if (!this.zzp) {
                                                        java.util.concurrent.Future v0_39 = 6;
                                                    } else {
                                                        v0_39 = 9;
                                                    }
                                                } else {
                                                    v0_39 = 15;
                                                }
                                            } else {
                                                v0_39 = 17;
                                            }
                                            com.android.billingclient.api.zzw v13_4 = new com.android.billingclient.api.zzw;
                                            v13_4(this, v0_39, v30_0, v12_1, p33, v10_4);
                                            v0_2 = com.android.billingclient.api.BillingClientImpl.zzG(v13_4, 5000, 0, this.zze, this.zzF());
                                        }
                                    }
                                    com.android.billingclient.api.BillingFlowParams v5_14;
                                    if (v0_2 != null) {
                                        v5_14 = v25;
                                        String v2_9 = ((android.os.Bundle) v0_2.get(5000, java.util.concurrent.TimeUnit.MILLISECONDS));
                                        java.util.concurrent.Future v0_44 = com.google.android.gms.internal.play_billing.zzc.zzb(v2_9, "BillingClient");
                                        int v3_68 = com.google.android.gms.internal.play_billing.zzc.zzj(v2_9, "BillingClient");
                                        if (v0_44 == null) {
                                            java.util.concurrent.Future v0_46 = new android.content.Intent(p32, com.android.billingclient.api.ProxyBillingActivity);
                                            v0_46.putExtra("BUY_INTENT", ((android.app.PendingIntent) v2_9.getParcelable("BUY_INTENT")));
                                            v0_46.putExtra("billingClientTransactionId", v5_14);
                                            v0_46.putExtra("wasServiceAutoReconnected", v8_3);
                                            p32.startActivity(v0_46);
                                            return com.android.billingclient.api.zzcj.zzi;
                                        } else {
                                            java.util.concurrent.Future v0_55;
                                            int v7_4 = new StringBuilder();
                                            v7_4.append("Unable to buy item, Error response code: ");
                                            v7_4.append(v0_44);
                                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", v7_4.toString());
                                            String v4_51 = com.android.billingclient.api.zzcj.zza(v0_44, v3_68);
                                            if (v2_9 != null) {
                                                java.util.concurrent.Future v0_50 = v2_9.get("LOG_REASON");
                                                if (v0_50 != null) {
                                                    if (!(v0_50 instanceof Integer)) {
                                                        java.util.concurrent.Future v0_53 = v0_50.getClass().getName();
                                                        int v7_8 = new StringBuilder();
                                                        v7_8.append("Unexpected type for bundle log reason: ");
                                                        v7_8.append(v0_53);
                                                        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", v7_8.toString());
                                                        v0_55 = com.google.android.gms.internal.play_billing.zzie.zza;
                                                    } else {
                                                        v0_55 = com.google.android.gms.internal.play_billing.zzie.zzb(((Integer) v0_50).intValue());
                                                    }
                                                } else {
                                                    v0_55 = com.google.android.gms.internal.play_billing.zzie.zza;
                                                }
                                            } else {
                                                v0_55 = com.google.android.gms.internal.play_billing.zzie.zza;
                                            }
                                            if (v0_55 == com.google.android.gms.internal.play_billing.zzie.zza) {
                                                v0_55 = com.google.android.gms.internal.play_billing.zzie.zzw;
                                            }
                                            int v3_74 = v0_55;
                                            if (v2_9 != null) {
                                                try {
                                                    v9_4 = v2_9.getString("ADDITIONAL_LOG_DETAILS");
                                                } catch (java.util.concurrent.Future v0_63) {
                                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(v0_63.getMessage())));
                                                }
                                            }
                                            String v6_6 = v5_14;
                                            v1_0 = this.zzbh(v3_74, 2, v4_51, v9_4, v6_6, v8_3);
                                            v5_14 = v6_6;
                                            v1_0.zzm(v4_51);
                                            return v4_51;
                                        }
                                    } else {
                                        String v4_53 = com.android.billingclient.api.zzcj.zzc;
                                        int v7_12 = v8_3;
                                        v5_14 = v25;
                                        v1_0 = this.zzbg(com.google.android.gms.internal.play_billing.zzie.zzy, 2, v4_53, v5_14, v7_12);
                                        v1_0.zzm(v4_53);
                                        return v4_53;
                                    }
                                    com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", java.util.concurrent.Future v0_68);
                                    String v4_55 = com.android.billingclient.api.zzcj.zzk;
                                    v1_0.zzbh(com.google.android.gms.internal.play_billing.zzie.zzd, 2, v4_55, com.android.billingclient.api.zzcg.zza(v0_68), v5_14, v8_3).zzm(v4_55);
                                    return v4_55;
                                } else {
                                    this.zzbg(com.google.android.gms.internal.play_billing.zzie.zzbd, 2, v4_1, v5_12, v8_3).zzm(v4_1);
                                    return v4_1;
                                }
                            }
                        }
                    }
                }
            } else {
                String v4_56 = com.android.billingclient.api.zzcj.zzj;
                this.zzbe(com.google.android.gms.internal.play_billing.zzie.zzb, 2, v4_56, v5_12).zzm(v4_56);
                return v4_56;
            }
        }
    }

    public void queryProductDetailsAsync(com.android.billingclient.api.QueryProductDetailsParams p7, com.android.billingclient.api.ProductDetailsResponseListener p8)
    {
        if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzal(this, p8, p7), 30000, new com.android.billingclient.api.zzap(this, p8), this.zzan(), this.zzF()) == null) {
            com.android.billingclient.api.BillingResult v7_2 = this.zzaq();
            this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzy, 7, v7_2);
            p8.onProductDetailsResponse(v7_2, new com.android.billingclient.api.QueryProductDetailsResult(com.google.android.gms.internal.play_billing.zzbt.zzk(), com.google.android.gms.internal.play_billing.zzbt.zzk()));
        }
        return;
    }

    public final void queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams p7, com.android.billingclient.api.PurchasesResponseListener p8)
    {
        if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzaw(this, p8, p7.zza(), 0), 30000, new com.android.billingclient.api.zzat(this, p8), this.zzan(), this.zzF()) == null) {
            com.android.billingclient.api.BillingResult v7_3 = this.zzaq();
            this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzy, 9, v7_3);
            p8.onQueryPurchasesResponse(v7_3, com.google.android.gms.internal.play_billing.zzbt.zzk());
        }
        return;
    }

    public com.android.billingclient.api.BillingResult showAlternativeBillingOnlyInformationDialog(android.app.Activity p9, com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener p10)
    {
        if (p9 == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        } else {
            if (this.zzaW(3000)) {
                if (this.zzy) {
                    android.os.Handler v6 = this.zze;
                    if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzy(this, p10, p9, new com.android.billingclient.api.zzay(this, v6, p10)), 30000, new com.android.billingclient.api.zzz(this, p10), v6, this.zzF()) != null) {
                        return com.android.billingclient.api.zzcj.zzi;
                    } else {
                        com.android.billingclient.api.BillingResult v9_4 = this.zzaq();
                        this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzy, 16, v9_4);
                        return v9_4;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current Play Store version doesn\'t support alternative billing only.");
                    com.google.android.gms.internal.play_billing.zzie v10_4 = com.android.billingclient.api.zzcj.zzD;
                    this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzan, 16, v10_4);
                    return v10_4;
                }
            } else {
                com.google.android.gms.internal.play_billing.zzie v10_5 = com.android.billingclient.api.zzcj.zzj;
                this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzb, 16, v10_5);
                return v10_5;
            }
        }
    }

    public com.android.billingclient.api.BillingResult showExternalOfferInformationDialog(android.app.Activity p9, com.android.billingclient.api.ExternalOfferInformationDialogListener p10)
    {
        if (p9 == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        } else {
            if (this.zzaW(3000)) {
                if (this.zzz) {
                    android.os.Handler v6 = this.zze;
                    if (com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzan(this, p10, p9, new com.android.billingclient.api.zzaz(this, v6, p10)), 30000, new com.android.billingclient.api.zzao(this, p10), v6, this.zzF()) != null) {
                        return com.android.billingclient.api.zzcj.zzi;
                    } else {
                        com.android.billingclient.api.BillingResult v9_4 = this.zzaq();
                        this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzy, 25, v9_4);
                        return v9_4;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current Play Store version doesn\'t support external offer.");
                    com.google.android.gms.internal.play_billing.zzie v10_4 = com.android.billingclient.api.zzcj.zzt;
                    this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzaE, 25, v10_4);
                    return v10_4;
                }
            } else {
                com.google.android.gms.internal.play_billing.zzie v10_5 = com.android.billingclient.api.zzcj.zzj;
                this.zzbd(com.google.android.gms.internal.play_billing.zzie.zzb, 25, v10_5);
                return v10_5;
            }
        }
    }

    public final com.android.billingclient.api.BillingResult showInAppMessages(android.app.Activity p9, com.android.billingclient.api.InAppMessageParams p10, com.android.billingclient.api.InAppMessageResponseListener p11)
    {
        if (this.zzaW(3000)) {
            if (this.zzq) {
                android.os.Bundle v0_6 = p9.findViewById(16908290);
                String v1_0 = v0_6.getWindowToken();
                com.android.billingclient.api.zzas v2_1 = new android.graphics.Rect();
                v0_6.getGlobalVisibleRect(v2_1);
                android.os.Bundle v0_2 = new android.os.Bundle();
                v0_2.putBinder("KEY_WINDOW_TOKEN", v1_0);
                v0_2.putInt("KEY_DIMEN_LEFT", v2_1.left);
                v0_2.putInt("KEY_DIMEN_TOP", v2_1.top);
                v0_2.putInt("KEY_DIMEN_RIGHT", v2_1.right);
                v0_2.putInt("KEY_DIMEN_BOTTOM", v2_1.bottom);
                v0_2.putString("playBillingLibraryVersion", this.zzc);
                String v1_7 = this.zzd;
                if (v1_7 != null) {
                    v0_2.putString("playBillingLibraryWrapperVersion", v1_7);
                }
                v0_2.putIntegerArrayList("KEY_CATEGORY_IDS", p10.zza());
                android.os.Handler v6 = this.zze;
                com.android.billingclient.api.BillingClientImpl.zzG(new com.android.billingclient.api.zzas(this, v0_2, p9, new com.android.billingclient.api.zzax(this, v6, p11)), 5000, 0, v6, this.zzF());
                return com.android.billingclient.api.zzcj.zzi;
            } else {
                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Current client doesn\'t support showing in-app messages.");
                return com.android.billingclient.api.zzcj.zzs;
            }
        } else {
            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Service disconnected.");
            return com.android.billingclient.api.zzcj.zzj;
        }
    }

    public void startConnection(com.android.billingclient.api.BillingClientStateListener p2)
    {
        this.zzaU(p2, 0);
        return;
    }

    public final declared_synchronized java.util.concurrent.ExecutorService zzF()
    {
        if (this.zzH == null) {
            this.zzH = java.util.concurrent.Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzc.zza, new com.android.billingclient.api.zzav(this));
        }
        return this.zzH;
    }

    public final void zzag(Runnable p3)
    {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            this.zze.post(p3);
            return;
        } else {
            p3.run();
            return;
        }
    }

    public final com.android.billingclient.api.zzbo zzg(com.android.billingclient.api.QueryProductDetailsParams p23)
    {
        com.android.billingclient.api.zzbo v0_2 = new java.util.ArrayList();
        com.android.billingclient.api.BillingResult v2_14 = new java.util.ArrayList();
        String v6 = p23.zzb();
        com.google.android.gms.internal.play_billing.zzbt v9 = p23.zza();
        int v10 = v9.size();
        boolean v3_1 = 0;
        while (v3_1 < v10) {
            String v4_7;
            int v12 = (v3_1 + 20);
            if (v12 <= v10) {
                v4_7 = v12;
            } else {
                v4_7 = v10;
            }
            String v15_2 = new java.util.ArrayList(v9.subList(v3_1, v4_7));
            boolean v3_25 = new java.util.ArrayList();
            String v4_12 = v15_2.size();
            String v5_12 = 0;
            while (v5_12 < v4_12) {
                v3_25.add(((com.android.billingclient.api.QueryProductDetailsParams$Product) v15_2.get(v5_12)).zza());
                v5_12++;
            }
            java.util.ArrayList v7_4 = new android.os.Bundle();
            v7_4.putStringArrayList("ITEM_ID_LIST", v3_25);
            int v13_4 = this.zzc;
            v7_4.putString("playBillingLibraryVersion", v13_4);
            boolean v3_30 = this.zzi;
            if (v3_30) {
                if ((!this.zzw) || (!this.zzD.isEnabledForPrepaidPlans())) {
                    int v16_0 = 0;
                } else {
                    v16_0 = 1;
                }
                String v5_17;
                this.zzav(p23);
                this.zzav(p23);
                this.zzav(p23);
                this.zzav(p23);
                boolean v18_2 = com.google.android.gms.internal.play_billing.zza.zza(v16_0, 1, 0, 1, 0, 1);
                if (1 == this.zzx) {
                    v5_17 = 20;
                } else {
                    v5_17 = 17;
                }
                boolean v3_31 = v3_30.zzj(v5_17, this.zzg.getPackageName(), v6, v7_4, com.google.android.gms.internal.play_billing.zzc.zzf(v13_4, this.zzd, v15_2, 0, 0, v18_2, this.zzI.longValue()));
                if (v3_31) {
                    if (v3_31.containsKey("DETAILS_LIST")) {
                        String v4_21 = v3_31.getStringArrayList("DETAILS_LIST");
                        if (v4_21 != null) {
                            java.util.ArrayList v7_6 = new java.util.ArrayList();
                            int v8_0 = v4_21.size();
                            int v13_0 = 0;
                            while (v13_0 < v8_0) {
                                try {
                                    String v11_6 = new com.android.billingclient.api.ProductDetails(((String) v4_21.get(v13_0)));
                                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Got product details: ".concat(v11_6.toString()));
                                    v7_6.add(v11_6);
                                    v13_0++;
                                } catch (com.android.billingclient.api.zzbo v0_4) {
                                    return this.zzao(com.android.billingclient.api.zzcj.zza(6, "Error trying to decode SkuDetails."), com.google.android.gms.internal.play_billing.zzie.zzU, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", v0_4);
                                }
                            }
                            boolean v3_0 = v3_31.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                            new java.util.ArrayList();
                            String v4_3 = new java.util.ArrayList();
                            if (!v3_0) {
                                boolean v3_2 = v15_2.size();
                                String v5_0 = 0;
                                while (v5_0 < v3_2) {
                                    String v5_1 = (v5_0 + 1);
                                    int v8_2 = ((com.android.billingclient.api.QueryProductDetailsParams$Product) v15_2.get(v5_0));
                                    String v11_0 = v7_6.size();
                                    int v13_1 = 0;
                                    while (v13_1 < v11_0) {
                                        com.android.billingclient.api.ProductDetails v14_0 = v7_6.get(v13_1);
                                        v13_1++;
                                        com.android.billingclient.api.ProductDetails v14_1 = ((com.android.billingclient.api.ProductDetails) v14_0);
                                        boolean v18_0 = v3_2;
                                        String v19_0 = v5_1;
                                        if ((!v8_2.zza().equals(v14_1.getProductId())) || (!v8_2.zzb().equals(v14_1.getProductType()))) {
                                            v3_2 = v18_0;
                                            v5_1 = v19_0;
                                        }
                                        v3_2 = v18_0;
                                        v5_0 = v19_0;
                                    }
                                    v18_0 = v3_2;
                                    v19_0 = v5_1;
                                    v4_3.add(new com.android.billingclient.api.UnfetchedProduct(new org.json.JSONObject().put("productId", v8_2.zza()).put("type", v8_2.zzb()).put("statusCode", 0).toString()));
                                }
                            } else {
                                String v5_9 = v3_0.size();
                                int v8_6 = 0;
                                while (v8_6 < v5_9) {
                                    String v11_2 = v3_0.get(v8_6);
                                    v8_6++;
                                    int v13_3 = new com.android.billingclient.api.UnfetchedProduct(((String) v11_2));
                                    com.google.android.gms.internal.play_billing.zzc.zzm("BillingClient", "Got unfetchedProduct: ".concat(v13_3.toString()));
                                    v4_3.add(v13_3);
                                }
                            }
                            v0_2.addAll(v7_6);
                            v2_14.addAll(v4_3);
                            v3_1 = v12;
                        } else {
                            return this.zzao(com.android.billingclient.api.zzcj.zzB, com.google.android.gms.internal.play_billing.zzie.zzT, "queryProductDetailsAsync got null response list", 0);
                        }
                    } else {
                        com.android.billingclient.api.zzbo v0_9 = com.google.android.gms.internal.play_billing.zzc.zzb(v3_31, "BillingClient");
                        com.android.billingclient.api.BillingResult v2_6 = com.google.android.gms.internal.play_billing.zzc.zzj(v3_31, "BillingClient");
                        if (v0_9 == null) {
                            return this.zzao(com.android.billingclient.api.zzcj.zza(6, v2_6), com.google.android.gms.internal.play_billing.zzie.zzS, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", 0);
                        } else {
                            return this.zzao(com.android.billingclient.api.zzcj.zza(v0_9, v2_6), com.google.android.gms.internal.play_billing.zzie.zzw, g2.g.c(v0_9, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), 0);
                        }
                    }
                } else {
                    return this.zzao(com.android.billingclient.api.zzcj.zzB, com.google.android.gms.internal.play_billing.zzie.zzR, "queryProductDetailsAsync got empty product details response.", 0);
                }
            } else {
                return this.zzao(com.android.billingclient.api.zzcj.zzj, com.google.android.gms.internal.play_billing.zzie.zzbc, "Service has been reset to null.", 0);
            }
        }
        return new com.android.billingclient.api.zzbo(0, "", v0_2, v2_14);
    }

    public final com.android.billingclient.api.zzch zzj()
    {
        return this.zzh;
    }

    public final com.android.billingclient.api.BillingResult zzm(com.android.billingclient.api.BillingResult p3)
    {
        if (!Thread.interrupted()) {
            this.zze.post(new com.android.billingclient.api.zzac(this, p3));
            return p3;
        } else {
            return p3;
        }
    }
}
