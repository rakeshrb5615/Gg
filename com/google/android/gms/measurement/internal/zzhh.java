package com.google.android.gms.measurement.internal;
final class zzhh extends com.google.android.gms.measurement.internal.zzjf {
    static final android.util.Pair zza;
    public com.google.android.gms.measurement.internal.zzhf zzb;
    public final com.google.android.gms.measurement.internal.zzhe zzc;
    public final com.google.android.gms.measurement.internal.zzhe zzd;
    public final com.google.android.gms.measurement.internal.zzhg zze;
    public final com.google.android.gms.measurement.internal.zzhe zzf;
    public final com.google.android.gms.measurement.internal.zzhc zzg;
    public final com.google.android.gms.measurement.internal.zzhg zzh;
    public final com.google.android.gms.measurement.internal.zzhd zzi;
    public final com.google.android.gms.measurement.internal.zzhc zzj;
    public final com.google.android.gms.measurement.internal.zzhe zzk;
    public final com.google.android.gms.measurement.internal.zzhe zzl;
    public boolean zzm;
    public final com.google.android.gms.measurement.internal.zzhc zzn;
    public final com.google.android.gms.measurement.internal.zzhc zzo;
    public final com.google.android.gms.measurement.internal.zzhe zzp;
    public final com.google.android.gms.measurement.internal.zzhg zzq;
    public final com.google.android.gms.measurement.internal.zzhg zzr;
    public final com.google.android.gms.measurement.internal.zzhe zzs;
    public final com.google.android.gms.measurement.internal.zzhd zzt;
    private android.content.SharedPreferences zzv;
    private android.content.SharedPreferences zzw;
    private String zzx;
    private boolean zzy;
    private long zzz;

    static zzhh()
    {
        com.google.android.gms.measurement.internal.zzhh.zza = new android.util.Pair("", Long.valueOf(0));
        return;
    }

    public zzhh(com.google.android.gms.measurement.internal.zzic p6)
    {
        super(p6);
        super.zzf = new com.google.android.gms.measurement.internal.zzhe(super, "session_timeout", 1800000);
        super.zzg = new com.google.android.gms.measurement.internal.zzhc(super, "start_new_session", 1);
        super.zzk = new com.google.android.gms.measurement.internal.zzhe(super, "last_pause_time", 0);
        super.zzl = new com.google.android.gms.measurement.internal.zzhe(super, "session_id", 0);
        super.zzh = new com.google.android.gms.measurement.internal.zzhg(super, "non_personalized_ads", 0);
        super.zzi = new com.google.android.gms.measurement.internal.zzhd(super, "last_received_uri_timestamps_by_source", 0);
        super.zzj = new com.google.android.gms.measurement.internal.zzhc(super, "allow_remote_dynamite", 0);
        super.zzc = new com.google.android.gms.measurement.internal.zzhe(super, "first_open_time", 0);
        super.zzd = new com.google.android.gms.measurement.internal.zzhe(super, "app_install_time", 0);
        super.zze = new com.google.android.gms.measurement.internal.zzhg(super, "app_instance_id", 0);
        super.zzn = new com.google.android.gms.measurement.internal.zzhc(super, "app_backgrounded", 0);
        super.zzo = new com.google.android.gms.measurement.internal.zzhc(super, "deep_link_retrieval_complete", 0);
        super.zzp = new com.google.android.gms.measurement.internal.zzhe(super, "deep_link_retrieval_attempts", 0);
        super.zzq = new com.google.android.gms.measurement.internal.zzhg(super, "firebase_feature_rollouts", 0);
        super.zzr = new com.google.android.gms.measurement.internal.zzhg(super, "deferred_attribution_cache", 0);
        super.zzs = new com.google.android.gms.measurement.internal.zzhe(super, "deferred_attribution_cache_timestamp", 0);
        super.zzt = new com.google.android.gms.measurement.internal.zzhd(super, "default_event_parameters", 0);
        return;
    }

    public final boolean zza()
    {
        return 1;
    }

    public final android.util.Pair zzb(String p8)
    {
        this.zzg();
        if (!this.zzl().zzo(com.google.android.gms.measurement.internal.zzjk.zza)) {
            return new android.util.Pair("", Boolean.FALSE);
        } else {
            String v0_0 = this.zzu;
            String v2_1 = v0_0.zzaZ().elapsedRealtime();
            long v4_0 = this.zzx;
            if ((v4_0 != 0) && (v2_1 < this.zzz)) {
                return new android.util.Pair(v4_0, Boolean.valueOf(this.zzy));
            } else {
                this.zzz = (v0_0.zzc().zzl(p8, com.google.android.gms.measurement.internal.zzfy.zza) + v2_1);
                com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(1);
                android.util.Pair v8_6 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(v0_0.zzaY());
                this.zzx = "";
                String v0_4 = v8_6.getId();
                if (v0_4 != null) {
                    this.zzx = v0_4;
                }
                this.zzy = v8_6.isLimitAdTrackingEnabled();
                com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(0);
                return new android.util.Pair(this.zzx, Boolean.valueOf(this.zzy));
            }
        }
    }

    public final void zzba()
    {
        long v0_0 = this.zzu;
        int v1_5 = v0_0.zzaY().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = v1_5;
        int v1_0 = v1_5.getBoolean("has_been_opened", 0);
        this.zzm = v1_0;
        if (v1_0 == 0) {
            int v1_2 = this.zzv.edit();
            v1_2.putBoolean("has_been_opened", 1);
            v1_2.apply();
        }
        v0_0.zzc();
        this.zzb = new com.google.android.gms.measurement.internal.zzhf(this, "health_monitor", Math.max(0, ((Long) com.google.android.gms.measurement.internal.zzfy.zzc.zzb(0)).longValue()), 0);
        return;
    }

    public final android.content.SharedPreferences zzd()
    {
        this.zzg();
        this.zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    public final android.content.SharedPreferences zze()
    {
        this.zzg();
        this.zzw();
        if (this.zzw == null) {
            android.content.SharedPreferences v0_4 = this.zzu;
            String v1_0 = String.valueOf(v0_4.zzaY().getPackageName());
            int v2_1 = v0_4.zzaV().zzk();
            String v1_1 = v1_0.concat("_preferences");
            v2_1.zzb("Default prefs file", v1_1);
            this.zzw = v0_4.zzaY().getSharedPreferences(v1_1, 0);
        }
        return this.zzw;
    }

    public final android.util.SparseArray zzf()
    {
        android.util.SparseArray v0_1 = this.zzi.zza();
        String v1_2 = v0_1.getIntArray("uriSources");
        android.util.SparseArray v0_9 = v0_1.getLongArray("uriTimestamps");
        if ((v1_2 != null) && (v0_9 != null)) {
            if (v1_2.length == v0_9.length) {
                android.util.SparseArray v2_2 = new android.util.SparseArray();
                int v3_1 = 0;
                while (v3_1 < v1_2.length) {
                    v2_2.put(v1_2[v3_1], Long.valueOf(v0_9[v3_1]));
                    v3_1++;
                }
                return v2_2;
            } else {
                this.zzu.zzaV().zzb().zza("Trigger URI source and timestamp array lengths do not match");
                return new android.util.SparseArray();
            }
        } else {
            return new android.util.SparseArray();
        }
    }

    public final void zzh(Boolean p3)
    {
        this.zzg();
        android.content.SharedPreferences$Editor v0_1 = this.zzd().edit();
        if (!p3) {
            v0_1.remove("measurement_enabled");
        } else {
            v0_1.putBoolean("measurement_enabled", p3.booleanValue());
        }
        v0_1.apply();
        return;
    }

    public final Boolean zzi()
    {
        this.zzg();
        if (!this.zzd().contains("measurement_enabled")) {
            return 0;
        } else {
            return Boolean.valueOf(this.zzd().getBoolean("measurement_enabled", 1));
        }
    }

    public final com.google.android.gms.measurement.internal.zzaz zzj()
    {
        this.zzg();
        return com.google.android.gms.measurement.internal.zzaz.zzg(this.zzd().getString("dma_consent_settings", 0));
    }

    public final boolean zzk(int p4)
    {
        return com.google.android.gms.measurement.internal.zzjl.zzu(p4, this.zzd().getInt("consent_source", 100));
    }

    public final com.google.android.gms.measurement.internal.zzjl zzl()
    {
        this.zzg();
        return com.google.android.gms.measurement.internal.zzjl.zzf(this.zzd().getString("consent_settings", "G1"), this.zzd().getInt("consent_source", 100));
    }

    public final boolean zzm(com.google.android.gms.measurement.internal.zzod p4)
    {
        this.zzg();
        android.content.SharedPreferences$Editor v0_4 = this.zzd().getString("stored_tcf_param", "");
        int v4_3 = p4.zza();
        if (v4_3.equals(v0_4)) {
            return 0;
        } else {
            android.content.SharedPreferences$Editor v0_2 = this.zzd().edit();
            v0_2.putString("stored_tcf_param", v4_3);
            v0_2.apply();
            return 1;
        }
    }

    public final void zzn(boolean p4)
    {
        this.zzg();
        this.zzu.zzaV().zzk().zzb("App measurement setting deferred collection", Boolean.valueOf(p4));
        android.content.SharedPreferences$Editor v0_2 = this.zzd().edit();
        v0_2.putBoolean("deferred_analytics_collection", p4);
        v0_2.apply();
        return;
    }

    public final boolean zzo()
    {
        boolean v0_0 = this.zzv;
        if (v0_0) {
            return v0_0.contains("deferred_analytics_collection");
        } else {
            return 0;
        }
    }

    public final boolean zzp(long p3)
    {
        if ((p3 - this.zzf.zza()) <= this.zzk.zza()) {
            return 0;
        } else {
            return 1;
        }
    }
}
