package com.google.android.gms.measurement.internal;
public final class zzgi extends com.google.android.gms.measurement.internal.zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private java.util.List zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    public zzgi(com.google.android.gms.measurement.internal.zzic p3, long p4, long p6)
    {
        super(p3);
        super.zzn = 0;
        super.zzo = 0;
        super.zzg = p4;
        super.zzh = p6;
        return;
    }

    public final boolean zze()
    {
        return 1;
    }

    public final void zzf()
    {
        String v8_5;
        boolean v0_0 = this.zzu;
        v0_0.zzaV().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        com.google.android.gms.measurement.internal.zzgs v1_1 = v0_0.zzaY().getPackageName();
        android.content.pm.PackageManager v2_1 = v0_0.zzaY().getPackageManager();
        java.util.Iterator v4_1 = "";
        boolean v5_5 = -2147483648;
        com.google.android.gms.measurement.internal.zzpp v6_32 = "Unknown";
        String v7_13 = "unknown";
        if (v2_1 != null) {
            try {
                v7_13 = v2_1.getInstallerPackageName(v1_1);
            } catch (IllegalArgumentException) {
                this.zzu.zzaV().zzb().zzb("Error retrieving app installer package name. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v1_1));
            }
            if (v7_13 != null) {
                if ("com.android.vending".equals(v7_13)) {
                    v7_13 = "";
                }
            } else {
                v7_13 = "manual_install";
            }
            try {
                boolean v0_19 = v2_1.getPackageInfo(this.zzu.zzaY().getPackageName(), 0);
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                boolean v0_20 = "Unknown";
                this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", com.google.android.gms.measurement.internal.zzgu.zzl(v1_1), v6_32);
                v8_5 = v6_32;
                v6_32 = v0_20;
            }
            if (!v0_19) {
                v8_5 = "Unknown";
            } else {
                String v8_4 = v2_1.getApplicationLabel(v0_19.applicationInfo);
                if (android.text.TextUtils.isEmpty(v8_4)) {
                    v8_5 = "Unknown";
                } else {
                    v8_5 = v8_4.toString();
                }
                try {
                    v6_32 = v0_19.versionName;
                    v5_5 = v0_19.versionCode;
                } catch (android.content.pm.PackageManager$NameNotFoundException) {
                    v0_20 = v6_32;
                    v6_32 = v8_5;
                }
            }
        } else {
            v0_0.zzaV().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v1_1));
        }
        this.zza = v1_1;
        this.zzd = v7_13;
        this.zzb = v6_32;
        this.zzc = v5_5;
        this.zze = v8_5;
        this.zzf = 0;
        boolean v0_23 = this.zzu;
        boolean v5_8 = v0_23.zzC();
        if (!v5_8) {
            this.zzu.zzaV().zzk().zza("App measurement collection enabled");
        } else {
            if (v5_8 == 1) {
                this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
            } else {
                if (v5_8 == 3) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else {
                    if (v5_8 == 4) {
                        this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
                    } else {
                        if (v5_8 == 6) {
                            this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else {
                            if (v5_8 == 7) {
                                this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
                            } else {
                                if (v5_8 == 8) {
                                    this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
                                } else {
                                    com.google.android.gms.measurement.internal.zzpp v6_26 = this.zzu;
                                    v6_26.zzaV().zzi().zza("App measurement disabled");
                                    v6_26.zzaV().zzc().zza("Invalid scion state in identity");
                                }
                            }
                        }
                    }
                }
            }
        }
        this.zzl = "";
        com.google.android.gms.measurement.internal.zzpp v6_29 = this.zzu;
        v6_29.zzaU();
        try {
            boolean v0_2 = com.google.android.gms.measurement.internal.zzlt.zza(v6_29.zzaY(), "google_app_id", v0_23.zzq());
        } catch (boolean v0_3) {
            this.zzu.zzaV().zzb().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzgu.zzl(v1_1), v0_3);
            this.zzi = 0;
            boolean v0_7 = this.zzu;
            v0_7.zzaU();
            com.google.android.gms.measurement.internal.zzgs v1_5 = v0_7.zzc().zzs("analytics.safelisted_events");
            if (v1_5 != null) {
                if (!v1_5.isEmpty()) {
                    java.util.Iterator v4_8 = v1_5.iterator();
                    while (v4_8.hasNext()) {
                        if (!v0_7.zzk().zzk("safelisted event", ((String) v4_8.next()))) {
                        }
                    }
                    this.zzi = v1_5;
                } else {
                    v0_7.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
                }
            }
            if (v2_1 == null) {
                this.zzk = 0;
                return;
            } else {
                this.zzk = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(v0_7.zzaY());
                return;
            }
        }
        if (!android.text.TextUtils.isEmpty(v0_2)) {
            v4_1 = v0_2;
        } else {
        }
        this.zzl = v4_1;
        if (v5_8) {
        } else {
            v6_29.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
        }
    }

    public final com.google.android.gms.measurement.internal.zzr zzh(String p45)
    {
        long v18;
        this.zzg();
        com.google.android.gms.measurement.internal.zzr v2_3 = new com.google.android.gms.measurement.internal.zzr;
        String v3_7 = this.zzj();
        String v4_12 = this.zzk();
        this.zzb();
        String v5_3 = this.zzb;
        this.zzb();
        long v6 = ((long) this.zzc);
        this.zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd);
        String v8 = this.zzd;
        com.google.android.gms.internal.measurement.zzin v0_14 = this.zzu;
        v0_14.zzc().zzi();
        this.zzb();
        this.zzg();
        long v9_2 = this.zzf;
        if (v9_2 != 0) {
            v18 = 0;
        } else {
            long v9_4 = this.zzu.zzk();
            String v10_15 = v0_14.zzaY();
            com.google.android.gms.internal.measurement.zzin v0_53 = v0_14.zzaY().getPackageName();
            v9_4.zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v10_15);
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v0_53);
            String v13_5 = v10_15.getPackageManager();
            int v15_1 = com.google.android.gms.measurement.internal.zzpp.zzO();
            byte[] v16_1 = -1;
            if (v15_1 != 0) {
                if (v13_5 == null) {
                    v18 = 0;
                } else {
                    try {
                        if (v9_4.zzad(v10_15, v0_53)) {
                            v18 = 0;
                            v16_1 = 0;
                            v9_2 = v16_1;
                            this.zzf = v9_2;
                            com.google.android.gms.internal.measurement.zzin v0_10;
                            int v11_3 = v9_2;
                            com.google.android.gms.internal.measurement.zzin v0_69 = this.zzu;
                            long v9_0 = v0_69.zzB();
                            int v15_0 = (v0_69.zzd().zzm ^ 1);
                            this.zzg();
                            try {
                                if (v0_69.zzB()) {
                                    com.google.android.gms.internal.measurement.zzrn.zza();
                                    if (!v0_69.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaH)) {
                                        com.google.android.gms.internal.measurement.zzin v0_3 = v0_69.zzaY().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                        if (v0_3 != null) {
                                            try {
                                                String v10_8 = v0_3.getDeclaredMethod("getInstance", new Class[] {android.content.Context})).invoke(0, new Object[] {this.zzu.zzaY()}));
                                            } catch (Exception) {
                                                this.zzu.zzaV().zzf().zza("Failed to obtain Firebase Analytics instance");
                                                v0_10 = 0;
                                            }
                                            if (v10_8 != null) {
                                                try {
                                                    v0_10 = ((String) v0_3.getDeclaredMethod("getFirebaseInstanceId", 0).invoke(v10_8, 0));
                                                } catch (Exception) {
                                                    this.zzu.zzaV().zzh().zza("Failed to retrieve Firebase Instance Id");
                                                }
                                            }
                                        }
                                    } else {
                                        this.zzu.zzaV().zzk().zza("Disabled IID for tests.");
                                    }
                                }
                            } catch (ClassNotFoundException) {
                            }
                            String v13_2;
                            boolean v21_1;
                            Boolean v22_0;
                            String v10_12 = this.zzu;
                            String v13_1 = v10_12.zzd().zzc.zza();
                            if (v13_1 != v18) {
                                v21_1 = v2_3;
                                v22_0 = v3_7;
                                v13_2 = Math.min(v10_12.zza, v13_1);
                            } else {
                                v13_2 = v10_12.zza;
                                v21_1 = v2_3;
                                v22_0 = v3_7;
                            }
                            com.google.android.gms.internal.measurement.zzin v0_22;
                            this.zzb();
                            com.google.android.gms.measurement.internal.zzr v2_1 = this.zzk;
                            String v3_0 = this.zzu;
                            String v10_14 = v3_0.zzc().zzu();
                            long v23_0 = v3_0.zzd();
                            v23_0.zzg();
                            byte[] v24 = v0_10;
                            long v23_1 = v2_1;
                            java.util.List v25_0 = v3_0;
                            String v26_0 = v23_0.zzd().getBoolean("deferred_analytics_collection", 0);
                            if (v25_0.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", 1) == com.google.android.gms.measurement.internal.zzji.zzd) {
                                v0_22 = 0;
                            } else {
                                v0_22 = 1;
                            }
                            com.google.android.gms.measurement.internal.zzr v2_6 = v4_12;
                            String v27_0 = v5_3;
                            String v4_0 = this.zzg;
                            long v28_0 = Boolean.valueOf(v0_22);
                            com.google.android.gms.internal.measurement.zzin v0_24 = this.zzi;
                            boolean v29_2 = v25_0.zzd().zzl().zzl();
                            int v30_0 = v0_24;
                            if (this.zzj == null) {
                                this.zzj = v25_0.zzk().zzaw();
                            }
                            String v33_0;
                            com.google.android.gms.internal.measurement.zzin v0_37;
                            int v32_0 = this.zzj;
                            String v31_1 = v2_6;
                            if (v25_0.zzd().zzl().zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
                                this.zzg();
                                v33_0 = v4_0;
                                if (this.zzn != v18) {
                                    String v4_2 = v25_0.zzaZ().currentTimeMillis();
                                    if ((this.zzm != null) && (((v4_2 - this.zzn) > 86400000) && (this.zzo == null))) {
                                        this.zzi();
                                    }
                                }
                                if (this.zzm == null) {
                                    this.zzi();
                                }
                                v0_37 = this.zzm;
                            } else {
                                v33_0 = v4_0;
                                v0_37 = 0;
                            }
                            String v4_7;
                            long v35_4;
                            com.google.android.gms.measurement.internal.zzr v2_9 = v25_0.zzc().zzx();
                            String v4_5 = v25_0.zzk();
                            String v5_0 = this.zzj();
                            java.util.List v25_1 = v0_37;
                            com.google.android.gms.internal.measurement.zzin v0_38 = v4_5.zzu;
                            if (v0_38.zzaY().getPackageManager() != null) {
                                try {
                                    com.google.android.gms.internal.measurement.zzin v0_45;
                                    v35_4 = v2_9;
                                    com.google.android.gms.measurement.internal.zzr v2_10 = 0;
                                } catch (android.content.pm.PackageManager$NameNotFoundException) {
                                    v35_4 = 0;
                                    v2_10 = 0;
                                    com.google.android.gms.internal.measurement.zzin v0_42 = v4_5.zzu;
                                    v0_42.zzaU();
                                    v0_42.zzaV().zzi().zzb("PackageManager failed to find running app: app_id", v5_0);
                                    v0_45 = v2_10;
                                    v4_7 = ((long) v0_45);
                                } catch (android.content.pm.PackageManager$NameNotFoundException) {
                                }
                                com.google.android.gms.internal.measurement.zzin v0_41 = com.google.android.gms.common.wrappers.Wrappers.packageManager(v0_38.zzaY()).getApplicationInfo(v5_0, 0);
                                if (v0_41 == null) {
                                } else {
                                    v0_45 = v0_41.targetSdkVersion;
                                }
                            } else {
                                v35_4 = v2_9;
                                v4_7 = v18;
                            }
                            com.google.android.gms.measurement.internal.zzr v2_13;
                            com.google.android.gms.internal.measurement.zzin v0_46 = this.zzu;
                            long v17_2 = v0_46.zzd().zzl().zzb();
                            String v36_2 = v0_46.zzd().zzj().zze();
                            com.google.android.gms.internal.measurement.zzqp.zza();
                            String v38_0 = v0_46;
                            com.google.android.gms.internal.measurement.zzin v0_47 = com.google.android.gms.measurement.internal.zzfy.zzaQ;
                            long v39_0 = v4_7;
                            if (!v0_46.zzc().zzp(0, v0_47)) {
                                v2_13 = 0;
                            } else {
                                v2_13 = v38_0.zzk().zzU();
                            }
                            com.google.android.gms.internal.measurement.zzqp.zza();
                            if (v38_0.zzc().zzp(0, v0_47)) {
                                v18 = v38_0.zzk().zzV();
                            }
                            com.google.android.gms.internal.measurement.zzin v0_55 = this.zzu;
                            return v21_1(v22_0, v31_1, v27_0, v6, v8, 133005, v11_3, p45, v9_0, v15_0, v24, v13_2, v23_1, v10_14, v26_0, v28_0, v33_0, v30_0, v29_2, v32_0, v25_1, v35_4, v39_0, v17_2, v36_2, v2_13, v18, v38_0.zzc().zzz(), new com.google.android.gms.measurement.internal.zze(v38_0.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", 1)).zzb(), v0_55.zza, v0_55.zzx().zzj().zza());
                        } else {
                            String v10_16 = v9_4.zzu;
                            v18 = 0;
                            com.google.android.gms.internal.measurement.zzin v0_62 = com.google.android.gms.common.wrappers.Wrappers.packageManager(v10_15).getPackageInfo(v10_16.zzaY().getPackageName(), 64).signatures;
                            if ((v0_62 == null) || (v0_62.length <= 0)) {
                                v10_16.zzaV().zze().zza("Could not get signatures");
                            } else {
                                v16_1 = com.google.android.gms.measurement.internal.zzpp.zzP(v15_1.digest(v0_62[0].toByteArray()));
                            }
                        }
                    } catch (com.google.android.gms.internal.measurement.zzin v0_59) {
                        v18 = 0;
                    }
                    v9_4.zzu.zzaV().zzb().zzb("Package name not found", v0_59);
                }
                v9_2 = v18;
            } else {
                v1.a.s(v9_4.zzu, "Could not get MD5 instance");
                v18 = 0;
            }
        }
    }

    public final void zzi()
    {
        String v1_3;
        this.zzg();
        long v0_0 = this.zzu;
        if (v0_0.zzd().zzl().zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
            String v1_1 = new byte[16];
            v0_0.zzk().zzf().nextBytes(v1_1);
            v1_3 = String.format(java.util.Locale.US, "%032x", new Object[] {new java.math.BigInteger(1, v1_1)}));
        } else {
            v0_0.zzaV().zzj().zza("Analytics Storage consent is not granted");
            v1_3 = 0;
        }
        String v3_3;
        com.google.android.gms.measurement.internal.zzgs v2_5 = v0_0.zzaV().zzj();
        if (v1_3 != null) {
            v3_3 = "not null";
        } else {
            v3_3 = "null";
        }
        v2_5.zza("Resetting session stitching token to ".concat(v3_3));
        this.zzm = v1_3;
        this.zzn = v0_0.zzaZ().currentTimeMillis();
        return;
    }

    public final String zzj()
    {
        this.zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    public final String zzk()
    {
        this.zzg();
        this.zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    public final String zzl()
    {
        this.zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    public final int zzm()
    {
        this.zzb();
        return this.zzc;
    }

    public final long zzn()
    {
        return this.zzh;
    }

    public final int zzo()
    {
        this.zzb();
        return this.zzk;
    }

    public final java.util.List zzp()
    {
        return this.zzi;
    }

    public final boolean zzq(String p3)
    {
        boolean v0_0 = this.zzo;
        int v1 = 0;
        if ((v0_0) && (!v0_0.equals(p3))) {
            v1 = 1;
        }
        this.zzo = p3;
        return v1;
    }
}
