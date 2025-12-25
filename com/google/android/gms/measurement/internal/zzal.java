package com.google.android.gms.measurement.internal;
public final class zzal extends com.google.android.gms.measurement.internal.zzje {
    private Boolean zza;
    private String zzb;
    private com.google.android.gms.measurement.internal.zzak zzc;
    private Boolean zzd;

    public zzal(com.google.android.gms.measurement.internal.zzic p1)
    {
        super(p1);
        super.zzc = com.google.android.gms.measurement.internal.zzaj.zza;
        return;
    }

    public static final long zzF()
    {
        return ((Long) com.google.android.gms.measurement.internal.zzfy.zzd.zzb(0)).longValue();
    }

    public static final int zzG()
    {
        return Math.max(0, ((Integer) com.google.android.gms.measurement.internal.zzfy.zzi.zzb(0)).intValue());
    }

    public static final long zzH()
    {
        return ((long) ((Integer) com.google.android.gms.measurement.internal.zzfy.zzk.zzb(0)).intValue());
    }

    public static final long zzI()
    {
        return ((Long) com.google.android.gms.measurement.internal.zzfy.zzR.zzb(0)).longValue();
    }

    public static final long zzJ()
    {
        return ((Long) com.google.android.gms.measurement.internal.zzfy.zzM.zzb(0)).longValue();
    }

    private final String zzK(String p4, String p5)
    {
        try {
            reflect.InvocationTargetException v4_3 = ((String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[] {String, String})).invoke(0, new Object[] {p4, ""})));
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_3);
            return v4_3;
        } catch (reflect.InvocationTargetException v4_7) {
            this.zzu.zzaV().zzb().zzb("Could not find SystemProperties class", v4_7);
            return "";
        } catch (reflect.InvocationTargetException v4_6) {
            this.zzu.zzaV().zzb().zzb("Could not find SystemProperties.get() method", v4_6);
            return "";
        } catch (reflect.InvocationTargetException v4_5) {
            this.zzu.zzaV().zzb().zzb("Could not access SystemProperties.get()", v4_5);
            return "";
        } catch (reflect.InvocationTargetException v4_4) {
            this.zzu.zzaV().zzb().zzb("SystemProperties.get() threw an exception", v4_4);
            return "";
        }
    }

    public final String zzA()
    {
        return this.zzK("debug.firebase.analytics.app", "");
    }

    public final String zzB()
    {
        return this.zzK("debug.deferred.deeplink", "");
    }

    public final boolean zzC(String p3)
    {
        return "1".equals(this.zzc.zza(p3, "gaia_collection_enabled"));
    }

    public final boolean zzD(String p3)
    {
        return "1".equals(this.zzc.zza(p3, "measurement.event_sampling_enabled"));
    }

    public final boolean zzE()
    {
        if (this.zza == null) {
            int v0_7 = this.zzr("app_measurement_lite");
            this.zza = v0_7;
            if (v0_7 == 0) {
                this.zza = Boolean.FALSE;
            }
        }
        if ((!this.zza.booleanValue()) && (this.zzu.zzp())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void zza(com.google.android.gms.measurement.internal.zzak p1)
    {
        this.zzc = p1;
        return;
    }

    public final String zzb()
    {
        this.zzu.zzaU();
        return "FA";
    }

    public final int zzc()
    {
        if (!this.zzu.zzk().zzag(201500000, 1)) {
            return 25;
        } else {
            return 100;
        }
    }

    public final int zzd(String p4)
    {
        return this.zzn(p4, com.google.android.gms.measurement.internal.zzfy.zzX, 25, 100);
    }

    public final int zze(String p3, boolean p4)
    {
        if (p4 == null) {
            return 500;
        } else {
            return this.zzn(p3, com.google.android.gms.measurement.internal.zzfy.zzah, 100, 500);
        }
    }

    public final int zzf(String p1, boolean p2)
    {
        return Math.max(this.zze(p1, p2), 256);
    }

    public final int zzh(String p4)
    {
        return this.zzn(p4, com.google.android.gms.measurement.internal.zzfy.zzW, 500, 2000);
    }

    public final long zzi()
    {
        this.zzu.zzaU();
        return 133005;
    }

    public final boolean zzj()
    {
        if (this.zzd == null) {
            if (this.zzd == null) {
                com.google.android.gms.measurement.internal.zzgs v0_7 = this.zzu;
                String v1_7 = v0_7.zzaY().getApplicationInfo();
                String v2 = com.google.android.gms.common.util.ProcessUtils.getMyProcessName();
                if (v1_7 != null) {
                    String v1_0 = v1_7.processName;
                    int v3 = 0;
                    if ((v1_0 != null) && (v1_0.equals(v2))) {
                        v3 = 1;
                    }
                    this.zzd = Boolean.valueOf(v3);
                }
                if (this.zzd == null) {
                    this.zzd = Boolean.TRUE;
                    v0_7.zzaV().zzb().zza("My process not in the list of running processes");
                }
            }
        }
        return this.zzd.booleanValue();
    }

    public final String zzk(String p3, com.google.android.gms.measurement.internal.zzfx p4)
    {
        if (!android.text.TextUtils.isEmpty(p3)) {
            return ((String) p4.zzb(this.zzc.zza(p3, p4.zza())));
        } else {
            return ((String) p4.zzb(0));
        }
    }

    public final long zzl(String p5, com.google.android.gms.measurement.internal.zzfx p6)
    {
        if (!android.text.TextUtils.isEmpty(p5)) {
            long v5_14 = this.zzc.zza(p5, p6.zza());
            if (!android.text.TextUtils.isEmpty(v5_14)) {
                try {
                    return ((Long) p6.zzb(Long.valueOf(Long.parseLong(v5_14)))).longValue();
                } catch (NumberFormatException) {
                    return ((Long) p6.zzb(0)).longValue();
                }
            } else {
                return ((Long) p6.zzb(0)).longValue();
            }
        } else {
            return ((Long) p6.zzb(0)).longValue();
        }
    }

    public final int zzm(String p4, com.google.android.gms.measurement.internal.zzfx p5)
    {
        if (!android.text.TextUtils.isEmpty(p4)) {
            int v4_15 = this.zzc.zza(p4, p5.zza());
            if (!android.text.TextUtils.isEmpty(v4_15)) {
                try {
                    return ((Integer) p5.zzb(Integer.valueOf(Integer.parseInt(v4_15)))).intValue();
                } catch (NumberFormatException) {
                    return ((Integer) p5.zzb(0)).intValue();
                }
            } else {
                return ((Integer) p5.zzb(0)).intValue();
            }
        } else {
            return ((Integer) p5.zzb(0)).intValue();
        }
    }

    public final int zzn(String p1, com.google.android.gms.measurement.internal.zzfx p2, int p3, int p4)
    {
        return Math.max(Math.min(this.zzm(p1, p2), p4), p3);
    }

    public final double zzo(String p5, com.google.android.gms.measurement.internal.zzfx p6)
    {
        if (!android.text.TextUtils.isEmpty(p5)) {
            double v5_14 = this.zzc.zza(p5, p6.zza());
            if (!android.text.TextUtils.isEmpty(v5_14)) {
                try {
                    return ((Double) p6.zzb(Double.valueOf(Double.parseDouble(v5_14)))).doubleValue();
                } catch (NumberFormatException) {
                    return ((Double) p6.zzb(0)).doubleValue();
                }
            } else {
                return ((Double) p6.zzb(0)).doubleValue();
            }
        } else {
            return ((Double) p6.zzb(0)).doubleValue();
        }
    }

    public final boolean zzp(String p4, com.google.android.gms.measurement.internal.zzfx p5)
    {
        if (!android.text.TextUtils.isEmpty(p4)) {
            boolean v4_12 = this.zzc.zza(p4, p5.zza());
            if (!android.text.TextUtils.isEmpty(v4_12)) {
                return ((Boolean) p5.zzb(Boolean.valueOf("1".equals(v4_12)))).booleanValue();
            } else {
                return ((Boolean) p5.zzb(0)).booleanValue();
            }
        } else {
            return ((Boolean) p5.zzb(0)).booleanValue();
        }
    }

    public final android.os.Bundle zzq()
    {
        com.google.android.gms.measurement.internal.zzgs v1_0 = this.zzu;
        if (v1_0.zzaY().getPackageManager() != null) {
            String v2_1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(v1_0.zzaY()).getApplicationInfo(v1_0.zzaY().getPackageName(), 128);
            if (v2_1 != null) {
                return v2_1.metaData;
            } else {
                v1_0.zzaV().zzb().zza("Failed to load metadata: ApplicationInfo is null");
                return 0;
            }
        } else {
            v1_0.zzaV().zzb().zza("Failed to load metadata: PackageManager is null");
            return 0;
        }
    }

    public final Boolean zzr(String p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        String v0_1 = this.zzq();
        if (v0_1 != null) {
            if (v0_1.containsKey(p4)) {
                return Boolean.valueOf(v0_1.getBoolean(p4));
            } else {
                return 0;
            }
        } else {
            v1.a.s(this.zzu, "Failed to load metadata: Metadata bundle is null");
            return 0;
        }
    }

    public final java.util.List zzs(String p4)
    {
        java.util.List v4_2;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("analytics.safelisted_events");
        com.google.android.gms.measurement.internal.zzgs v0_4 = this.zzq();
        if (v0_4 != null) {
            if (v0_4.containsKey("analytics.safelisted_events")) {
                v4_2 = Integer.valueOf(v0_4.getInt("analytics.safelisted_events"));
            } else {
                v4_2 = 0;
            }
        } else {
            v1.a.s(this.zzu, "Failed to load metadata: Metadata bundle is null");
        }
        if (v4_2 != null) {
            try {
                java.util.List v4_5 = this.zzu.zzaY().getResources().getStringArray(v4_2.intValue());
            } catch (java.util.List v4_7) {
                this.zzu.zzaV().zzb().zzb("Failed to load string array from metadata: resource not found", v4_7);
            }
            if (v4_5 != null) {
                return java.util.Arrays.asList(v4_5);
            } else {
                return 0;
            }
        }
        return 0;
    }

    public final boolean zzt()
    {
        this.zzu.zzaU();
        int v0_3 = this.zzr("firebase_analytics_collection_deactivated");
        if ((v0_3 == 0) || (!v0_3.booleanValue())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzu()
    {
        int v0_1 = this.zzr("google_analytics_adid_collection_enabled");
        if ((v0_1 != 0) && (!v0_1.booleanValue())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzv()
    {
        int v0_1 = this.zzr("google_analytics_automatic_screen_reporting_enabled");
        if ((v0_1 != 0) && (!v0_1.booleanValue())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.measurement.internal.zzji zzw(String p4, boolean p5)
    {
        Object v1_1;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4);
        String v0_0 = this.zzu;
        Object v1_0 = this.zzq();
        if (v1_0 != null) {
            v1_1 = v1_0.get(p4);
        } else {
            v1.a.s(v0_0, "Failed to load metadata: Metadata bundle is null");
            v1_1 = 0;
        }
        if (v1_1 != null) {
            if (!Boolean.TRUE.equals(v1_1)) {
                if (!Boolean.FALSE.equals(v1_1)) {
                    if ((p5 == null) || (!"eu_consent_policy".equals(v1_1))) {
                        v0_0.zzaV().zze().zzb("Invalid manifest metadata for", p4);
                        return com.google.android.gms.measurement.internal.zzji.zza;
                    } else {
                        return com.google.android.gms.measurement.internal.zzji.zzb;
                    }
                } else {
                    return com.google.android.gms.measurement.internal.zzji.zzc;
                }
            } else {
                return com.google.android.gms.measurement.internal.zzji.zzd;
            }
        } else {
            return com.google.android.gms.measurement.internal.zzji.zza;
        }
    }

    public final boolean zzx()
    {
        boolean v0_1 = this.zzr("google_analytics_sgtm_upload_enabled");
        if (v0_1) {
            return v0_1.booleanValue();
        } else {
            return 0;
        }
    }

    public final void zzy(String p1)
    {
        this.zzb = p1;
        return;
    }

    public final String zzz()
    {
        return this.zzb;
    }
}
