package com.google.android.gms.measurement.internal;
public final class zzic implements com.google.android.gms.measurement.internal.zzjg {
    private static volatile com.google.android.gms.measurement.internal.zzic zzb;
    private volatile Boolean zzA;
    private volatile boolean zzB;
    private int zzC;
    private int zzD;
    private final java.util.concurrent.atomic.AtomicInteger zzE;
    final long zza;
    private final android.content.Context zzc;
    private final boolean zzd;
    private final com.google.android.gms.measurement.internal.zzae zze;
    private final com.google.android.gms.measurement.internal.zzal zzf;
    private final com.google.android.gms.measurement.internal.zzhh zzg;
    private final com.google.android.gms.measurement.internal.zzgu zzh;
    private final com.google.android.gms.measurement.internal.zzhz zzi;
    private final com.google.android.gms.measurement.internal.zzoc zzj;
    private final com.google.android.gms.measurement.internal.zzpp zzk;
    private final com.google.android.gms.measurement.internal.zzgn zzl;
    private final com.google.android.gms.common.util.Clock zzm;
    private final com.google.android.gms.measurement.internal.zzmb zzn;
    private final com.google.android.gms.measurement.internal.zzlj zzo;
    private final com.google.android.gms.measurement.internal.zzd zzp;
    private final com.google.android.gms.measurement.internal.zzlo zzq;
    private final String zzr;
    private com.google.android.gms.measurement.internal.zzgl zzs;
    private com.google.android.gms.measurement.internal.zznl zzt;
    private com.google.android.gms.measurement.internal.zzba zzu;
    private com.google.android.gms.measurement.internal.zzgi zzv;
    private com.google.android.gms.measurement.internal.zzlq zzw;
    private boolean zzx;
    private Boolean zzy;
    private long zzz;

    public zzic(com.google.android.gms.measurement.internal.zzjs p11)
    {
        com.google.android.gms.measurement.internal.zzgu v3_1;
        com.google.android.gms.measurement.internal.zzgs v0_0 = 0;
        this.zzx = 0;
        this.zzE = new java.util.concurrent.atomic.AtomicInteger(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p11);
        String v1_5 = p11.zza;
        com.google.android.gms.measurement.internal.zzky v2_8 = new com.google.android.gms.measurement.internal.zzae(v1_5);
        this.zze = v2_8;
        com.google.android.gms.measurement.internal.zzfr.zza = v2_8;
        this.zzc = v1_5;
        this.zzd = p11.zze;
        this.zzA = p11.zzb;
        this.zzr = p11.zzg;
        this.zzB = 1;
        com.google.android.gms.internal.measurement.zzkm.zzb(v1_5);
        com.google.android.gms.measurement.internal.zzgu v3_0 = com.google.android.gms.common.util.DefaultClock.getInstance();
        this.zzm = v3_0;
        com.google.android.gms.measurement.internal.zzlj v4_0 = p11.zzf;
        if (v4_0 == null) {
            v3_1 = v3_0.currentTimeMillis();
        } else {
            v3_1 = v4_0.longValue();
        }
        this.zza = v3_1;
        this.zzf = new com.google.android.gms.measurement.internal.zzal(this);
        com.google.android.gms.measurement.internal.zzgu v3_5 = new com.google.android.gms.measurement.internal.zzhh(this);
        v3_5.zzx();
        this.zzg = v3_5;
        com.google.android.gms.measurement.internal.zzgu v3_7 = new com.google.android.gms.measurement.internal.zzgu(this);
        v3_7.zzx();
        this.zzh = v3_7;
        com.google.android.gms.measurement.internal.zzlj v4_2 = new com.google.android.gms.measurement.internal.zzpp(this);
        v4_2.zzx();
        this.zzk = v4_2;
        this.zzl = new com.google.android.gms.measurement.internal.zzgn(new com.google.android.gms.measurement.internal.zzjr(p11, this));
        this.zzp = new com.google.android.gms.measurement.internal.zzd(this);
        com.google.android.gms.measurement.internal.zzlj v4_8 = new com.google.android.gms.measurement.internal.zzmb(this);
        v4_8.zzc();
        this.zzn = v4_8;
        com.google.android.gms.measurement.internal.zzlj v4_10 = new com.google.android.gms.measurement.internal.zzlj(this);
        v4_10.zzc();
        this.zzo = v4_10;
        com.google.android.gms.measurement.internal.zzhz v5_3 = new com.google.android.gms.measurement.internal.zzoc(this);
        v5_3.zzc();
        this.zzj = v5_3;
        com.google.android.gms.measurement.internal.zzhz v5_5 = new com.google.android.gms.measurement.internal.zzlo(this);
        v5_5.zzx();
        this.zzq = v5_5;
        com.google.android.gms.measurement.internal.zzhz v5_7 = new com.google.android.gms.measurement.internal.zzhz(this);
        v5_7.zzx();
        this.zzi = v5_7;
        long v6_0 = p11.zzd;
        if ((v6_0 == 0) || (v6_0.zzb == 0)) {
            v0_0 = 1;
        }
        if (!(v1_5.getApplicationContext() instanceof android.app.Application)) {
            com.google.android.gms.measurement.internal.zzic.zzP(v3_7);
            v3_7.zze().zza("Application context is not an Application");
        } else {
            com.google.android.gms.measurement.internal.zzic.zzO(v4_10);
            if ((v4_10.zzu.zzc.getApplicationContext() instanceof android.app.Application)) {
                String v1_1 = ((android.app.Application) v4_10.zzu.zzc.getApplicationContext());
                if (v4_10.zza == null) {
                    v4_10.zza = new com.google.android.gms.measurement.internal.zzky(v4_10);
                }
                if (v0_0 != null) {
                    v1_1.unregisterActivityLifecycleCallbacks(v4_10.zza);
                    v1_1.registerActivityLifecycleCallbacks(v4_10.zza);
                    com.google.android.gms.measurement.internal.zzgs v0_4 = v4_10.zzu.zzh;
                    com.google.android.gms.measurement.internal.zzic.zzP(v0_4);
                    v0_4.zzk().zza("Registered activity lifecycle callback");
                }
            }
        }
        v5_7.zzj(new com.google.android.gms.measurement.internal.zzia(this, p11));
        return;
    }

    public static final void zzL()
    {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzM(com.google.android.gms.measurement.internal.zzf p1)
    {
        if (p1 == null) {
            throw new IllegalStateException("Component not created");
        } else {
            return;
        }
    }

    private static final void zzN(com.google.android.gms.measurement.internal.zzje p1)
    {
        if (p1 == null) {
            throw new IllegalStateException("Component not created");
        } else {
            return;
        }
    }

    private static final void zzO(com.google.android.gms.measurement.internal.zzg p2)
    {
        if (p2 == null) {
            throw new IllegalStateException("Component not created");
        } else {
            if (!p2.zza()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(p2.getClass())));
            } else {
                return;
            }
        }
    }

    private static final void zzP(com.google.android.gms.measurement.internal.zzjf p2)
    {
        if (p2 == null) {
            throw new IllegalStateException("Component not created");
        } else {
            if (!p2.zzv()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(p2.getClass())));
            } else {
                return;
            }
        }
    }

    public static com.google.android.gms.measurement.internal.zzic zzy(android.content.Context p8, com.google.android.gms.internal.measurement.zzdd p9, Long p10)
    {
        if (p9 != null) {
            p9 = new com.google.android.gms.internal.measurement.zzdd(p9.zza, p9.zzb, p9.zzc, p9.zzd, 0);
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8.getApplicationContext());
        if (com.google.android.gms.measurement.internal.zzic.zzb != null) {
            if (p9 != null) {
                Boolean v8_1 = p9.zzd;
                if ((v8_1 != null) && (v8_1.containsKey("dataCollectionDefaultEnabled"))) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.measurement.internal.zzic.zzb);
                    com.google.android.gms.measurement.internal.zzic.zzb.zzA = Boolean.valueOf(v8_1.getBoolean("dataCollectionDefaultEnabled"));
                }
            }
        } else {
            if (com.google.android.gms.measurement.internal.zzic.zzb == null) {
                com.google.android.gms.measurement.internal.zzic.zzb = new com.google.android.gms.measurement.internal.zzic(new com.google.android.gms.measurement.internal.zzjs(p8, p9, p10));
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.measurement.internal.zzic.zzb);
        return com.google.android.gms.measurement.internal.zzic.zzb;
    }

    public final boolean zzA()
    {
        if ((this.zzA == null) || (!this.zzA.booleanValue())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzB()
    {
        if (this.zzC() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int zzC()
    {
        int v0_0 = this.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(v0_0);
        v0_0.zzg();
        com.google.android.gms.measurement.internal.zzal v1 = this.zzf;
        if (v1.zzt()) {
            return 1;
        } else {
            com.google.android.gms.measurement.internal.zzic.zzP(v0_0);
            v0_0.zzg();
            if (!this.zzB) {
                return 8;
            } else {
                int v0_3 = this.zzg;
                com.google.android.gms.measurement.internal.zzic.zzN(v0_3);
                int v0_4 = v0_3.zzi();
                if (v0_4 == 0) {
                    int v0_7 = v1.zzr("firebase_analytics_collection_enabled");
                    if (v0_7 == 0) {
                        if (this.zzA == null) {
                            return 0;
                        } else {
                            if (!this.zzA.booleanValue()) {
                                return 7;
                            } else {
                                return 0;
                            }
                        }
                    } else {
                        if (!v0_7.booleanValue()) {
                            return 4;
                        } else {
                            return 0;
                        }
                    }
                } else {
                    if (!v0_4.booleanValue()) {
                        return 3;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }

    public final void zzD(boolean p2)
    {
        com.google.android.gms.measurement.internal.zzhz v0 = this.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(v0);
        v0.zzg();
        this.zzB = p2;
        return;
    }

    public final boolean zzE()
    {
        boolean v0_0 = this.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(v0_0);
        v0_0.zzg();
        return this.zzB;
    }

    public final void zzF()
    {
        this.zzC = (this.zzC + 1);
        return;
    }

    public final void zzG()
    {
        this.zzE.incrementAndGet();
        return;
    }

    public final boolean zzH()
    {
        if (!this.zzx) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        } else {
            Boolean v0_12 = this.zzi;
            com.google.android.gms.measurement.internal.zzic.zzP(v0_12);
            v0_12.zzg();
            Boolean v0_17 = this.zzy;
            if ((v0_17 == null) || ((this.zzz == 0) || ((!v0_17.booleanValue()) && (Math.abs((this.zzm.elapsedRealtime() - this.zzz)) > 1000)))) {
                this.zzz = this.zzm.elapsedRealtime();
                Boolean v0_10 = this.zzk;
                com.google.android.gms.measurement.internal.zzic.zzN(v0_10);
                int v2_2 = 0;
                if (v0_10.zzY("android.permission.INTERNET")) {
                    com.google.android.gms.measurement.internal.zzic.zzN(v0_10);
                    if (v0_10.zzY("android.permission.ACCESS_NETWORK_STATE")) {
                        boolean v1_7 = this.zzc;
                        if ((com.google.android.gms.common.wrappers.Wrappers.packageManager(v1_7).isCallerInstantApp()) || ((this.zzf.zzE()) || ((com.google.android.gms.measurement.internal.zzpp.zzau(v1_7)) && (com.google.android.gms.measurement.internal.zzpp.zzQ(v1_7, 0))))) {
                            v2_2 = 1;
                        }
                    }
                }
                boolean v1_9 = Boolean.valueOf(v2_2);
                this.zzy = v1_9;
                if (v1_9.booleanValue()) {
                    com.google.android.gms.measurement.internal.zzic.zzN(v0_10);
                    this.zzy = Boolean.valueOf(v0_10.zzA(this.zzv().zzk()));
                }
            }
            return this.zzy.booleanValue();
        }
    }

    public final boolean zzI()
    {
        String v0_0 = this.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(v0_0);
        v0_0.zzg();
        String v0_9 = this.zzq;
        com.google.android.gms.measurement.internal.zzic.zzP(v0_9);
        com.google.android.gms.measurement.internal.zzic.zzP(v0_9);
        String v4_2 = this.zzv().zzj();
        com.google.android.gms.measurement.internal.zzlo v10 = 0;
        if (!this.zzf.zzu()) {
            String v0_1 = this.zzh;
            com.google.android.gms.measurement.internal.zzic.zzP(v0_1);
            v0_1.zzk().zza("ADID collection is disabled from Manifest. Skipping");
            return 0;
        } else {
            com.google.android.gms.measurement.internal.zzgs v1_12 = this.zzg;
            com.google.android.gms.measurement.internal.zzic.zzN(v1_12);
            com.google.android.gms.measurement.internal.zzgs v1_13 = v1_12.zzb(v4_2);
            if ((!((Boolean) v1_13.second).booleanValue()) && (!android.text.TextUtils.isEmpty(((CharSequence) v1_13.first)))) {
                String v0_14;
                com.google.android.gms.measurement.internal.zzic.zzP(v0_9);
                v0_9.zzw();
                String v0_13 = ((android.net.ConnectivityManager) v0_9.zzu.zzc.getSystemService("connectivity"));
                Integer v2_21 = 0;
                try {
                    if (v0_13 == null) {
                        v0_14 = 0;
                    } else {
                        v0_14 = v0_13.getActiveNetworkInfo();
                    }
                } catch (SecurityException) {
                }
                if ((v0_14 == null) || (!v0_14.isConnected())) {
                    String v0_16 = this.zzh;
                    com.google.android.gms.measurement.internal.zzic.zzP(v0_16);
                    v0_16.zze().zza("Network is not available for Deferred Deep Link request. Skipping");
                    return 0;
                } else {
                    String v0_19 = new StringBuilder();
                    StringBuilder v3_9 = this.zzt();
                    v3_9.zzg();
                    v3_9.zzb();
                    if (v3_9.zzK()) {
                        StringBuilder v3_11 = v3_9.zzu.zzk;
                        com.google.android.gms.measurement.internal.zzic.zzN(v3_11);
                        if (v3_11.zzah() >= 234200) {
                            StringBuilder v3_13 = this.zzo;
                            com.google.android.gms.measurement.internal.zzic.zzO(v3_13);
                            Boolean v5_6 = v3_13.zzu;
                            v3_13.zzg();
                            StringBuilder v3_15 = v5_6.zzt().zzz();
                            if (v3_15 != null) {
                                v2_21 = v3_15.zza;
                            }
                            if (v2_21 != null) {
                                String v6_9 = com.google.android.gms.measurement.internal.zzjl.zze(v2_21, 100);
                                v0_19.append("&gcs=");
                                v0_19.append(v6_9.zzk());
                                Boolean v5_8 = com.google.android.gms.measurement.internal.zzaz.zzh(v2_21, 100);
                                v0_19.append("&dma=");
                                v0_19.append((java.util.Objects.equals(v5_8.zzj(), Boolean.FALSE) ^ 1));
                                if (!android.text.TextUtils.isEmpty(v5_8.zzk())) {
                                    v0_19.append("&dma_cps=");
                                    v0_19.append(v5_8.zzk());
                                }
                                Integer v2_2 = (java.util.Objects.equals(com.google.android.gms.measurement.internal.zzaz.zzi(v2_21), Boolean.TRUE) ^ 1);
                                v0_19.append("&npa=");
                                v0_19.append(v2_2);
                                Integer v2_3 = this.zzh;
                                com.google.android.gms.measurement.internal.zzic.zzP(v2_3);
                                v2_3.zzk().zzb("Consent query parameters to Bow", v0_19);
                            } else {
                                String v0_3 = this.zzD;
                                this.zzD = (v0_3 + 1);
                                if (v0_3 < 10) {
                                    v10 = 1;
                                }
                                String v0_5;
                                Integer v2_8 = this.zzh;
                                com.google.android.gms.measurement.internal.zzic.zzP(v2_8);
                                if (v0_3 >= 10) {
                                    v0_5 = "Skipping.";
                                } else {
                                    v0_5 = "Retrying.";
                                }
                                v2_8.zzj().zzb(v1.a.o(new StringBuilder((v0_5.length() + 60)), "Failed to retrieve DMA consent from the service, ", v0_5, " retryCount"), Integer.valueOf(this.zzD));
                                return v10;
                            }
                        }
                    }
                    Integer v2_5 = this.zzk;
                    com.google.android.gms.measurement.internal.zzic.zzN(v2_5);
                    this.zzv().zzu.zzf.zzi();
                    String v6_7 = ((String) v1_13.first);
                    com.google.android.gms.measurement.internal.zzgs v1_3 = this.zzg;
                    com.google.android.gms.measurement.internal.zzic.zzN(v1_3);
                    Boolean v5_2 = v4_2;
                    String v0_2 = v2_5.zzat(133005, v5_2, v6_7, (v1_3.zzp.zza() + -1), v0_19.toString());
                    if (v0_2 != null) {
                        StringBuilder v3_6 = this.zzq;
                        com.google.android.gms.measurement.internal.zzic.zzP(v3_6);
                        com.google.android.gms.measurement.internal.zzib v8_1 = new com.google.android.gms.measurement.internal.zzib(this);
                        v3_6.zzw();
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_2);
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(v8_1);
                        com.google.android.gms.measurement.internal.zzgs v1_6 = v3_6.zzu.zzi;
                        com.google.android.gms.measurement.internal.zzic.zzP(v1_6);
                        v1_6.zzm(new com.google.android.gms.measurement.internal.zzln(v3_6, v5_2, v0_2, 0, 0, v8_1));
                    }
                    return 0;
                }
            } else {
                String v0_7 = this.zzh;
                com.google.android.gms.measurement.internal.zzic.zzP(v0_7);
                v0_7.zzk().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                return 0;
            }
        }
    }

    public final synthetic void zzJ(String p18, int p19, Throwable p20, byte[] p21, java.util.Map p22)
    {
        if ((p19 == 200) || (p19 == 204)) {
            String v10_2 = p19;
            if (p20 == null) {
                android.content.Intent v0_12 = this.zzg;
                com.google.android.gms.measurement.internal.zzic.zzN(v0_12);
                v0_12.zzo.zzb(1);
                if ((p21 != null) && (p21.length != 0)) {
                    android.os.Bundle v3_10 = new org.json.JSONObject(new String(p21));
                    android.content.Intent v0_17 = v3_10.optString("deeplink", "");
                    if (!android.text.TextUtils.isEmpty(v0_17)) {
                        String v10_4 = v3_10.optString("gclid", "");
                        String v11 = v3_10.optString("gbraid", "");
                        String v9_0 = v3_10.optString("gad_source", "");
                        android.content.Intent v12_1 = v3_10.optDouble("timestamp", 0);
                        android.os.Bundle v3_12 = new android.os.Bundle();
                        android.net.Uri v14_0 = this.zzk;
                        com.google.android.gms.measurement.internal.zzic.zzN(v14_0);
                        if (!android.text.TextUtils.isEmpty(v0_17)) {
                            android.content.Context v15_1 = v14_0.zzu.zzc;
                            double v19_1 = v12_1;
                            com.google.android.gms.measurement.internal.zzpp v16_1 = v14_0;
                            android.content.Context v2_19 = v15_1.getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(v0_17)), 0);
                            if ((v2_19 != null) && (!v2_19.isEmpty())) {
                                if (!android.text.TextUtils.isEmpty(v11)) {
                                    v3_12.putString("gbraid", v11);
                                }
                                if (!android.text.TextUtils.isEmpty(v9_0)) {
                                    v3_12.putString("gad_source", v9_0);
                                }
                                v3_12.putString("gclid", v10_4);
                                v3_12.putString("_cis", "ddp");
                                this.zzo.zzF("auto", "_cmp", v3_12);
                                com.google.android.gms.measurement.internal.zzic.zzN(v16_1);
                                if (!android.text.TextUtils.isEmpty(v0_17)) {
                                    android.content.Context v2_1 = v15_1.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    v2_1.putString("deeplink", v0_17);
                                    v2_1.putLong("timestamp", Double.doubleToRawLongBits(v19_1));
                                    if (v2_1.commit()) {
                                        android.content.Intent v0_4 = new android.content.Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        android.content.Context v2_9 = v16_1.zzu.zzc;
                                        if (android.os.Build$VERSION.SDK_INT >= 34) {
                                            v2_9.sendBroadcast(v0_4, 0, android.app.BroadcastOptions.makeBasic().setShareIdentityEnabled(1).toBundle());
                                            return;
                                        } else {
                                            v2_9.sendBroadcast(v0_4);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                        } else {
                        }
                        android.content.Context v2_10 = this.zzh;
                        com.google.android.gms.measurement.internal.zzic.zzP(v2_10);
                        v2_10.zze().zzd("Deferred Deep Link validation failed. gclid, gbraid, deep link", v10_4, v11, v0_17);
                        return;
                    } else {
                        android.content.Intent v0_5 = this.zzh;
                        com.google.android.gms.measurement.internal.zzic.zzP(v0_5);
                        v0_5.zzj().zza("Deferred Deep Link is empty.");
                        return;
                    }
                } else {
                    android.content.Intent v0_8 = this.zzh;
                    com.google.android.gms.measurement.internal.zzic.zzP(v0_8);
                    v0_8.zzj().zza("Deferred Deep Link response empty.");
                    return;
                }
            }
        } else {
            v10_2 = 304;
            if (p19 != 304) {
                v10_2 = p19;
            }
        }
        android.content.Intent v0_10 = this.zzh;
        com.google.android.gms.measurement.internal.zzic.zzP(v0_10);
        v0_10.zze().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(v10_2), p20);
        return;
    }

    public final synthetic void zzK(com.google.android.gms.measurement.internal.zzjs p10)
    {
        Integer v1_0;
        Integer v0_0 = this.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(v0_0);
        v0_0.zzg();
        Integer v0_1 = this.zzf;
        v0_1.zzb();
        Integer v1_7 = new com.google.android.gms.measurement.internal.zzba(this);
        v1_7.zzx();
        this.zzu = v1_7;
        Integer v1_9 = p10.zzd;
        if (v1_9 != null) {
            v1_0 = v1_9.zza;
        } else {
            v1_0 = 0;
        }
        com.google.android.gms.measurement.internal.zzgi v3_1 = new com.google.android.gms.measurement.internal.zzgi(this, p10.zzc, v1_0);
        v3_1.zzc();
        this.zzv = v3_1;
        int v10_2 = new com.google.android.gms.measurement.internal.zzgl(this);
        v10_2.zzc();
        this.zzs = v10_2;
        int v10_4 = new com.google.android.gms.measurement.internal.zznl(this);
        v10_4.zzc();
        this.zzt = v10_4;
        int v10_5 = this.zzk;
        v10_5.zzy();
        this.zzg.zzy();
        this.zzv.zzd();
        Integer v1_4 = new com.google.android.gms.measurement.internal.zzlq(this);
        v1_4.zzc();
        this.zzw = v1_4;
        v1_4.zzd();
        Integer v1_5 = this.zzh;
        com.google.android.gms.measurement.internal.zzic.zzP(v1_5);
        String v2_0 = v1_5.zzi();
        v0_1.zzi();
        v2_0.zzb("App measurement initialized, version", Long.valueOf(133005));
        com.google.android.gms.measurement.internal.zzic.zzP(v1_5);
        v1_5.zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String v2_2 = v3_1.zzj();
        com.google.android.gms.measurement.internal.zzic.zzN(v10_5);
        if (!v10_5.zzaa(v2_2, v0_1.zzz())) {
            com.google.android.gms.measurement.internal.zzic.zzP(v1_5);
            v1_5.zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(v2_2)));
        } else {
            com.google.android.gms.measurement.internal.zzic.zzP(v1_5);
            v1_5.zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        }
        com.google.android.gms.measurement.internal.zzic.zzP(v1_5);
        v1_5.zzj().zza("Debug-level message logging enabled");
        Integer v0_7 = this.zzE;
        if (this.zzC != v0_7.get()) {
            com.google.android.gms.measurement.internal.zzic.zzP(v1_5);
            v1_5.zzb().zzc("Not all components initialized", Integer.valueOf(this.zzC), Integer.valueOf(v0_7.get()));
        }
        this.zzx = 1;
        return;
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdd p14)
    {
        android.os.Bundle v0_1;
        android.os.Bundle v0_0 = this.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(v0_0);
        v0_0.zzg();
        android.os.Bundle v0_31 = this.zzx().zzj();
        com.google.android.gms.internal.measurement.zzqp.zza();
        Long v3_0 = this.zzf;
        boolean vtmp4 = v3_0.zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaQ);
        if (v0_31 != com.google.android.gms.internal.measurement.zzin.zzb) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!vtmp4) {
            if (v0_1 != null) {
                v0_1 = 1;
                java.util.concurrent.atomic.AtomicReference v1_25 = this.zzk;
                com.google.android.gms.measurement.internal.zzic.zzN(v1_25);
                v1_25.zzg();
                String v2_4 = new android.content.IntentFilter();
                v2_4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                v2_4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                java.util.concurrent.atomic.AtomicReference v1_40 = v1_25.zzu;
                e0.c.registerReceiver(v1_40.zzc, new com.google.android.gms.measurement.internal.zzw(v1_25.zzu), v2_4, 2);
                java.util.concurrent.atomic.AtomicReference v1_42 = v1_40.zzh;
                com.google.android.gms.measurement.internal.zzic.zzP(v1_42);
                v1_42.zzj().zza("Registered app receiver");
                if (v0_1 != null) {
                    this.zzx().zzh(((Long) com.google.android.gms.measurement.internal.zzfy.zzB.zzb(0)).longValue());
                }
            }
        } else {
            java.util.concurrent.atomic.AtomicReference v1_10 = this.zzk;
            com.google.android.gms.measurement.internal.zzic.zzN(v1_10);
            if (v1_10.zzS()) {
            }
        }
        String v2_0;
        android.os.Bundle v0_30 = this.zzg;
        com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
        java.util.concurrent.atomic.AtomicReference v1_1 = v0_30.zzl();
        String v2_13 = v1_1.zzb();
        String v7_18 = v3_0.zzw("google_analytics_default_allow_ad_storage", 0);
        long v8_7 = v3_0.zzw("google_analytics_default_allow_analytics_storage", 0);
        Long v9_3 = com.google.android.gms.measurement.internal.zzji.zza;
        if ((v7_18 == v9_3) && (v8_7 == v9_3)) {
            if ((!android.text.TextUtils.isEmpty(this.zzv().zzk())) && ((v2_13 == null) || ((v2_13 == 30) || ((v2_13 == 10) || (v2_13 == 40))))) {
                String v2_15 = this.zzo;
                com.google.android.gms.measurement.internal.zzic.zzO(v2_15);
                v2_15.zzs(new com.google.android.gms.measurement.internal.zzjl(0, 0, -10), 0);
            }
            v2_0 = 0;
        } else {
            com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
            if (!v0_30.zzk(-10)) {
            } else {
                v2_0 = com.google.android.gms.measurement.internal.zzjl.zza(v7_18, v8_7, -10);
            }
        }
        if (v2_0 != null) {
            java.util.concurrent.atomic.AtomicReference v1_0 = this.zzo;
            com.google.android.gms.measurement.internal.zzic.zzO(v1_0);
            v1_0.zzs(v2_0, 1);
            v1_1 = v2_0;
        }
        String v2_1 = this.zzo;
        com.google.android.gms.measurement.internal.zzic.zzO(v2_1);
        v2_1.zzA(v1_1);
        com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
        java.util.concurrent.atomic.AtomicReference v1_3 = v0_30.zzj().zzb();
        String v7_1 = v3_0.zzw("google_analytics_default_allow_ad_personalization_signals", 1);
        if (v7_1 != v9_3) {
            long v8_0 = this.zzh;
            com.google.android.gms.measurement.internal.zzic.zzP(v8_0);
            v8_0.zzk().zzb("Default ad personalization consent from Manifest", v7_1);
        }
        String v7_3 = v3_0.zzw("google_analytics_default_allow_ad_user_data", 1);
        if ((v7_3 == v9_3) || (!com.google.android.gms.measurement.internal.zzjl.zzu(-10, v1_3))) {
            if ((android.text.TextUtils.isEmpty(this.zzv().zzk())) || ((v1_3 != null) && (v1_3 != 30))) {
                if ((android.text.TextUtils.isEmpty(this.zzv().zzk())) && (p14 != null)) {
                    com.google.android.gms.measurement.internal.zznl v14_1 = p14.zzd;
                    if ((v14_1 != null) && (com.google.android.gms.measurement.internal.zzjl.zzu(30, v1_3))) {
                        com.google.android.gms.measurement.internal.zznl v14_2 = com.google.android.gms.measurement.internal.zzaz.zzh(v14_1, 30);
                        if (v14_2.zzd()) {
                            com.google.android.gms.measurement.internal.zzic.zzO(v2_1);
                            v2_1.zzq(v14_2, 1);
                        }
                    }
                }
            } else {
                com.google.android.gms.measurement.internal.zzic.zzO(v2_1);
                v2_1.zzq(new com.google.android.gms.measurement.internal.zzaz(0, -10, 0, 0), 1);
            }
        } else {
            com.google.android.gms.measurement.internal.zzic.zzO(v2_1);
            v2_1.zzq(com.google.android.gms.measurement.internal.zzaz.zza(v7_3, -10), 1);
        }
        com.google.android.gms.measurement.internal.zznl v14_7 = v3_0.zzr("google_analytics_tcf_data_enabled");
        if ((v14_7 == null) || (v14_7.booleanValue())) {
            com.google.android.gms.measurement.internal.zznl v14_9 = this.zzh;
            com.google.android.gms.measurement.internal.zzic.zzP(v14_9);
            v14_9.zzj().zza("TCF client enabled.");
            com.google.android.gms.measurement.internal.zzic.zzO(v2_1);
            v2_1.zzE();
            com.google.android.gms.measurement.internal.zzic.zzO(v2_1);
            v2_1.zzD();
        }
        com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
        com.google.android.gms.measurement.internal.zznl v14_11 = v0_30.zzc;
        if (v14_11.zza() == 0) {
            java.util.concurrent.atomic.AtomicReference v1_8 = this.zzh;
            com.google.android.gms.measurement.internal.zzic.zzP(v1_8);
            String v7_11 = this.zza;
            v1_8.zzk().zzb("Persisting first open", Long.valueOf(v7_11));
            com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
            v14_11.zzb(v7_11);
        }
        com.google.android.gms.measurement.internal.zzic.zzO(v2_1);
        v2_1.zzb.zzc();
        if (this.zzH()) {
            if (!android.text.TextUtils.isEmpty(this.zzv().zzk())) {
                java.util.concurrent.atomic.AtomicReference v1_16 = this.zzk;
                com.google.android.gms.measurement.internal.zzic.zzN(v1_16);
                Long v3_3 = this.zzv().zzk();
                com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
                v0_30.zzg();
                if (v1_16.zzB(v3_3, v0_30.zzd().getString("gmp_app_id", 0))) {
                    java.util.concurrent.atomic.AtomicReference v1_19 = this.zzh;
                    com.google.android.gms.measurement.internal.zzic.zzP(v1_19);
                    v1_19.zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
                    v0_30.zzg();
                    java.util.concurrent.atomic.AtomicReference v1_21 = v0_30.zzi();
                    Long v3_6 = v0_30.zzd().edit();
                    v3_6.clear();
                    v3_6.apply();
                    if (v1_21 != null) {
                        v0_30.zzh(v1_21);
                    }
                    this.zzm().zzh();
                    this.zzt.zzM();
                    this.zzt.zzI();
                    com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
                    v14_11.zzb(this.zza);
                    com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
                    v0_30.zze.zzb(0);
                }
                com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
                com.google.android.gms.measurement.internal.zznl v14_14 = this.zzv().zzk();
                v0_30.zzg();
                java.util.concurrent.atomic.AtomicReference v1_27 = v0_30.zzd().edit();
                v1_27.putString("gmp_app_id", v14_14);
                v1_27.apply();
            }
            com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
            if (!v0_30.zzl().zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
                com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
                v0_30.zze.zzb(0);
            }
            com.google.android.gms.measurement.internal.zzic.zzO(v2_1);
            com.google.android.gms.measurement.internal.zzic.zzN(v0_30);
            v2_1.zzR(v0_30.zze.zza());
            com.google.android.gms.measurement.internal.zznl v14_20 = this.zzk;
            com.google.android.gms.measurement.internal.zzic.zzN(v14_20);
            try {
                v14_20.zzu.zzc.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            } catch (ClassNotFoundException) {
                com.google.android.gms.measurement.internal.zznl v14_24 = this.zzg;
                com.google.android.gms.measurement.internal.zzic.zzN(v14_24);
                android.os.Bundle v0_3 = v14_24.zzq;
                if (android.text.TextUtils.isEmpty(v0_3.zza())) {
                } else {
                    java.util.concurrent.atomic.AtomicReference v1_31 = this.zzh;
                    com.google.android.gms.measurement.internal.zzic.zzP(v1_31);
                    v1_31.zze().zza("Remote config removed with active feature rollouts");
                    com.google.android.gms.measurement.internal.zzic.zzN(v14_24);
                    v0_3.zzb(0);
                }
            }
            if (!android.text.TextUtils.isEmpty(this.zzv().zzk())) {
                com.google.android.gms.measurement.internal.zznl v14_28 = this.zzB();
                android.os.Bundle v0_4 = this.zzg;
                com.google.android.gms.measurement.internal.zzic.zzN(v0_4);
                if ((!v0_4.zzo()) && (!this.zzf.zzt())) {
                    com.google.android.gms.measurement.internal.zzic.zzN(v0_4);
                    v0_4.zzn((v14_28 ^ 1));
                }
                if (v14_28 != null) {
                    com.google.android.gms.measurement.internal.zznl v14_29 = this.zzo;
                    com.google.android.gms.measurement.internal.zzic.zzO(v14_29);
                    v14_29.zzU();
                }
                com.google.android.gms.measurement.internal.zznl v14_30 = this.zzj;
                com.google.android.gms.measurement.internal.zzic.zzO(v14_30);
                v14_30.zza.zza();
                this.zzt().zzC(new java.util.concurrent.atomic.AtomicReference());
                com.google.android.gms.measurement.internal.zznl v14_33 = this.zzt();
                com.google.android.gms.measurement.internal.zzic.zzN(v0_4);
                v14_33.zzH(v0_4.zzt.zza());
            }
        } else {
            if (this.zzB()) {
                com.google.android.gms.measurement.internal.zznl v14_35 = this.zzk;
                com.google.android.gms.measurement.internal.zzic.zzN(v14_35);
                if (!v14_35.zzY("android.permission.INTERNET")) {
                    android.os.Bundle v0_9 = this.zzh;
                    com.google.android.gms.measurement.internal.zzic.zzP(v0_9);
                    v0_9.zzb().zza("App is missing INTERNET permission");
                }
                com.google.android.gms.measurement.internal.zzic.zzN(v14_35);
                if (!v14_35.zzY("android.permission.ACCESS_NETWORK_STATE")) {
                    com.google.android.gms.measurement.internal.zznl v14_37 = this.zzh;
                    com.google.android.gms.measurement.internal.zzic.zzP(v14_37);
                    v14_37.zzb().zza("App is missing ACCESS_NETWORK_STATE permission");
                }
                com.google.android.gms.measurement.internal.zznl v14_39 = this.zzc;
                if ((!com.google.android.gms.common.wrappers.Wrappers.packageManager(v14_39).isCallerInstantApp()) && (!this.zzf.zzE())) {
                    if (!com.google.android.gms.measurement.internal.zzpp.zzau(v14_39)) {
                        android.os.Bundle v0_18 = this.zzh;
                        com.google.android.gms.measurement.internal.zzic.zzP(v0_18);
                        v0_18.zzb().zza("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!com.google.android.gms.measurement.internal.zzpp.zzQ(v14_39, 0)) {
                        com.google.android.gms.measurement.internal.zznl v14_41 = this.zzh;
                        com.google.android.gms.measurement.internal.zzic.zzP(v14_41);
                        v14_41.zzb().zza("AppMeasurementService not registered/enabled");
                    }
                }
                com.google.android.gms.measurement.internal.zznl v14_43 = this.zzh;
                com.google.android.gms.measurement.internal.zzic.zzP(v14_43);
                v14_43.zzb().zza("Uploading is not possible. App measurement disabled");
            }
        }
        com.google.android.gms.internal.measurement.zzqp.zza();
        if (this.zzf.zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaQ)) {
            com.google.android.gms.measurement.internal.zznl v14_47 = this.zzk;
            com.google.android.gms.measurement.internal.zzic.zzN(v14_47);
            if (v14_47.zzS()) {
                android.os.Bundle v0_28 = Math.max(500, (((((long) ((Integer) com.google.android.gms.measurement.internal.zzfy.zzax.zzb(0)).intValue()) * 1000) + ((long) new java.util.Random().nextInt(5000))) - this.zzm.elapsedRealtime()));
                if (v0_28 > 500) {
                    com.google.android.gms.measurement.internal.zznl v14_58 = this.zzh;
                    com.google.android.gms.measurement.internal.zzic.zzP(v14_58);
                    v14_58.zzk().zzb("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(v0_28));
                }
                com.google.android.gms.measurement.internal.zznl v14_60 = this.zzo;
                com.google.android.gms.measurement.internal.zzic.zzO(v14_60);
                v14_60.zzu(v0_28);
            }
        }
        com.google.android.gms.measurement.internal.zznl v14_61 = this.zzg;
        com.google.android.gms.measurement.internal.zzic.zzN(v14_61);
        v14_61.zzj.zzb(1);
        return;
    }

    public final com.google.android.gms.measurement.internal.zzae zzaU()
    {
        return this.zze;
    }

    public final com.google.android.gms.measurement.internal.zzgu zzaV()
    {
        com.google.android.gms.measurement.internal.zzgu v0 = this.zzh;
        com.google.android.gms.measurement.internal.zzic.zzP(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzhz zzaW()
    {
        com.google.android.gms.measurement.internal.zzhz v0 = this.zzi;
        com.google.android.gms.measurement.internal.zzic.zzP(v0);
        return v0;
    }

    public final android.content.Context zzaY()
    {
        return this.zzc;
    }

    public final com.google.android.gms.common.util.Clock zzaZ()
    {
        return this.zzm;
    }

    public final com.google.android.gms.measurement.internal.zzal zzc()
    {
        return this.zzf;
    }

    public final com.google.android.gms.measurement.internal.zzhh zzd()
    {
        com.google.android.gms.measurement.internal.zzhh v0 = this.zzg;
        com.google.android.gms.measurement.internal.zzic.zzN(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzgu zzf()
    {
        int v0_0 = this.zzh;
        if ((v0_0 == 0) || (!v0_0.zzv())) {
            return 0;
        } else {
            return v0_0;
        }
    }

    public final com.google.android.gms.measurement.internal.zzoc zzh()
    {
        com.google.android.gms.measurement.internal.zzoc v0 = this.zzj;
        com.google.android.gms.measurement.internal.zzic.zzO(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzhz zzi()
    {
        return this.zzi;
    }

    public final com.google.android.gms.measurement.internal.zzlj zzj()
    {
        com.google.android.gms.measurement.internal.zzlj v0 = this.zzo;
        com.google.android.gms.measurement.internal.zzic.zzO(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzpp zzk()
    {
        com.google.android.gms.measurement.internal.zzpp v0 = this.zzk;
        com.google.android.gms.measurement.internal.zzic.zzN(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzgn zzl()
    {
        return this.zzl;
    }

    public final com.google.android.gms.measurement.internal.zzgl zzm()
    {
        com.google.android.gms.measurement.internal.zzic.zzO(this.zzs);
        return this.zzs;
    }

    public final com.google.android.gms.measurement.internal.zzlo zzn()
    {
        com.google.android.gms.measurement.internal.zzlo v0 = this.zzq;
        com.google.android.gms.measurement.internal.zzic.zzP(v0);
        return v0;
    }

    public final boolean zzp()
    {
        return this.zzd;
    }

    public final String zzq()
    {
        return this.zzr;
    }

    public final com.google.android.gms.measurement.internal.zzmb zzs()
    {
        com.google.android.gms.measurement.internal.zzmb v0 = this.zzn;
        com.google.android.gms.measurement.internal.zzic.zzO(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zznl zzt()
    {
        com.google.android.gms.measurement.internal.zzic.zzO(this.zzt);
        return this.zzt;
    }

    public final com.google.android.gms.measurement.internal.zzba zzu()
    {
        com.google.android.gms.measurement.internal.zzic.zzP(this.zzu);
        return this.zzu;
    }

    public final com.google.android.gms.measurement.internal.zzgi zzv()
    {
        com.google.android.gms.measurement.internal.zzic.zzO(this.zzv);
        return this.zzv;
    }

    public final com.google.android.gms.measurement.internal.zzd zzw()
    {
        com.google.android.gms.measurement.internal.zzd v0 = this.zzp;
        com.google.android.gms.measurement.internal.zzic.zzM(v0);
        return v0;
    }

    public final com.google.android.gms.measurement.internal.zzlq zzx()
    {
        com.google.android.gms.measurement.internal.zzic.zzM(this.zzw);
        return this.zzw;
    }

    public final void zzz(boolean p1)
    {
        this.zzA = Boolean.valueOf(p1);
        return;
    }
}
