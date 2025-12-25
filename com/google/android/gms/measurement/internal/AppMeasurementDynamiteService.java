package com.google.android.gms.measurement.internal;
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcq {
    com.google.android.gms.measurement.internal.zzic zza;
    private final java.util.Map zzb;

    public AppMeasurementDynamiteService()
    {
        this.zza = 0;
        this.zzb = new r.e(0);
        return;
    }

    private final void zzb()
    {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        } else {
            return;
        }
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcu p2, String p3)
    {
        this.zzb();
        this.zza.zzk().zzal(p2, p3);
        return;
    }

    public void beginAdUnitExposure(String p2, long p3)
    {
        this.zzb();
        this.zza.zzw().zza(p2, p3);
        return;
    }

    public void clearConditionalUserProperty(String p2, String p3, android.os.Bundle p4)
    {
        this.zzb();
        this.zza.zzj().zzab(p2, p3, p4);
        return;
    }

    public void clearMeasurementEnabled(long p1)
    {
        this.zzb();
        this.zza.zzj().zzn(0);
        return;
    }

    public void endAdUnitExposure(String p2, long p3)
    {
        this.zzb();
        this.zza.zzw().zzb(p2, p3);
        return;
    }

    public void generateEventId(com.google.android.gms.internal.measurement.zzcu p4)
    {
        this.zzb();
        long v0_2 = this.zza.zzk().zzd();
        this.zzb();
        this.zza.zzk().zzam(p4, v0_2);
        return;
    }

    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcu p3)
    {
        this.zzb();
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzi(this, p3));
        return;
    }

    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcu p2)
    {
        this.zzb();
        this.zzc(p2, this.zza.zzj().zzQ());
        return;
    }

    public void getConditionalUserProperties(String p3, String p4, com.google.android.gms.internal.measurement.zzcu p5)
    {
        this.zzb();
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzm(this, p5, p3, p4));
        return;
    }

    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcu p2)
    {
        this.zzb();
        this.zzc(p2, this.zza.zzj().zzae());
        return;
    }

    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcu p2)
    {
        this.zzb();
        this.zzc(p2, this.zza.zzj().zzad());
        return;
    }

    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcu p2)
    {
        this.zzb();
        this.zzc(p2, this.zza.zzj().zzaf());
        return;
    }

    public void getMaxUserProperties(String p2, com.google.android.gms.internal.measurement.zzcu p3)
    {
        this.zzb();
        this.zza.zzj().zzY(p2);
        this.zzb();
        this.zza.zzk().zzan(p3, 25);
        return;
    }

    public void getSessionId(com.google.android.gms.internal.measurement.zzcu p4)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzlj v0_1 = this.zza.zzj();
        v0_1.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkm(v0_1, p4));
        return;
    }

    public void getTestFlag(com.google.android.gms.internal.measurement.zzcu p5, int p6)
    {
        this.zzb();
        if (p6 == null) {
            this.zza.zzk().zzal(p5, this.zza.zzj().zzj());
            return;
        } else {
            if (p6 == 1) {
                this.zza.zzk().zzam(p5, this.zza.zzj().zzk().longValue());
                return;
            } else {
                if (p6 == 2) {
                    com.google.android.gms.measurement.internal.zzgs v6_5 = this.zza.zzk();
                    String v0_9 = this.zza.zzj().zzm().doubleValue();
                    android.os.Bundle v2_1 = new android.os.Bundle();
                    v2_1.putDouble("r", v0_9);
                    try {
                        p5.zzb(v2_1);
                        return;
                    } catch (android.os.RemoteException v5_1) {
                        v6_5.zzu.zzaV().zze().zzb("Error returning double value to wrapper", v5_1);
                        return;
                    }
                } else {
                    if (p6 == 3) {
                        this.zza.zzk().zzan(p5, this.zza.zzj().zzl().intValue());
                        return;
                    } else {
                        if (p6 == 4) {
                            this.zza.zzk().zzap(p5, this.zza.zzj().zzi().booleanValue());
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public void getUserProperties(String p8, String p9, boolean p10, com.google.android.gms.internal.measurement.zzcu p11)
    {
        this.zzb();
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzk(this, p11, p8, p9, p10));
        return;
    }

    public void initForTests(java.util.Map p1)
    {
        this.zzb();
        return;
    }

    public void initialize(com.google.android.gms.dynamic.IObjectWrapper p2, com.google.android.gms.internal.measurement.zzdd p3, long p4)
    {
        com.google.android.gms.measurement.internal.zzic v0 = this.zza;
        if (v0 != null) {
            v1.a.v(v0, "Attempting to initialize multiple times");
            return;
        } else {
            this.zza = com.google.android.gms.measurement.internal.zzic.zzy(((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(p2)))), p3, Long.valueOf(p4));
            return;
        }
    }

    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcu p3)
    {
        this.zzb();
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzn(this, p3));
        return;
    }

    public void logEvent(String p10, String p11, android.os.Bundle p12, boolean p13, boolean p14, long p15)
    {
        this.zzb();
        this.zza.zzj().zzC(p10, p11, p12, p13, p14, p15);
        return;
    }

    public void logEventAndBundle(String p9, String p10, android.os.Bundle p11, com.google.android.gms.internal.measurement.zzcu p12, long p13)
    {
        android.os.Bundle v0_1;
        this.zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p10);
        if (p11 == null) {
            v0_1 = new android.os.Bundle();
        } else {
            v0_1 = new android.os.Bundle(p11);
        }
        v0_1.putString("_o", "app");
        this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzj(this, p12, new com.google.android.gms.measurement.internal.zzbg(p10, new com.google.android.gms.measurement.internal.zzbe(p11), "app", p13), p9));
        return;
    }

    public void logHealthData(int p10, String p11, com.google.android.gms.dynamic.IObjectWrapper p12, com.google.android.gms.dynamic.IObjectWrapper p13, com.google.android.gms.dynamic.IObjectWrapper p14)
    {
        Object v6;
        this.zzb();
        Object v0 = 0;
        if (p12 != null) {
            v6 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(p12);
        } else {
            v6 = 0;
        }
        Object v7;
        if (p13 != null) {
            v7 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(p13);
        } else {
            v7 = 0;
        }
        if (p14 != null) {
            v0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(p14);
        }
        this.zza.zzaV().zzm(p10, 1, 0, p11, v6, v7, v0);
        return;
    }

    public void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper p1, android.os.Bundle p2, long p3)
    {
        this.zzb();
        this.onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(p1))))), p2, p3);
        return;
    }

    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p1, android.os.Bundle p2, long p3)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzky v3_2 = this.zza.zzj().zza;
        if (v3_2 != null) {
            this.zza.zzj().zzh();
            v3_2.zza(p1, p2);
        }
        return;
    }

    public void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper p1, long p2)
    {
        this.zzb();
        this.onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(p1))))), p2);
        return;
    }

    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p1, long p2)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzky v2_2 = this.zza.zzj().zza;
        if (v2_2 != null) {
            this.zza.zzj().zzh();
            v2_2.zzb(p1);
        }
        return;
    }

    public void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper p1, long p2)
    {
        this.zzb();
        this.onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(p1))))), p2);
        return;
    }

    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p1, long p2)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzky v2_2 = this.zza.zzj().zza;
        if (v2_2 != null) {
            this.zza.zzj().zzh();
            v2_2.zzc(p1);
        }
        return;
    }

    public void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper p1, long p2)
    {
        this.zzb();
        this.onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(p1))))), p2);
        return;
    }

    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p1, long p2)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzky v2_2 = this.zza.zzj().zza;
        if (v2_2 != null) {
            this.zza.zzj().zzh();
            v2_2.zzd(p1);
        }
        return;
    }

    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper p1, com.google.android.gms.internal.measurement.zzcu p2, long p3)
    {
        this.zzb();
        this.onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(p1))))), p2, p3);
        return;
    }

    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p2, com.google.android.gms.internal.measurement.zzcu p3, long p4)
    {
        this.zzb();
        String v4_3 = this.zza.zzj().zza;
        android.os.Bundle v5_1 = new android.os.Bundle();
        if (v4_3 != null) {
            this.zza.zzj().zzh();
            v4_3.zze(p2, v5_1);
        }
        try {
            p3.zzb(v5_1);
            return;
        } catch (android.os.RemoteException v2_1) {
            this.zza.zzaV().zze().zzb("Error returning bundle value to wrapper", v2_1);
            return;
        }
    }

    public void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper p1, long p2)
    {
        this.zzb();
        this.onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(p1))))), p2);
        return;
    }

    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p1, long p2)
    {
        this.zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
        }
        return;
    }

    public void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper p1, long p2)
    {
        this.zzb();
        this.onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(p1))))), p2);
        return;
    }

    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p1, long p2)
    {
        this.zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
        }
        return;
    }

    public void performAction(android.os.Bundle p1, com.google.android.gms.internal.measurement.zzcu p2, long p3)
    {
        this.zzb();
        p2.zzb(0);
        return;
    }

    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda p3)
    {
        this.zzb();
        java.util.Map v0 = this.zzb;
        com.google.android.gms.measurement.internal.zzq v1_1 = ((com.google.android.gms.measurement.internal.zzjq) v0.get(Integer.valueOf(p3.zzf())));
        if (v1_1 == null) {
            v1_1 = new com.google.android.gms.measurement.internal.zzq(this, p3);
            v0.put(Integer.valueOf(p3.zzf()), v1_1);
        }
        this.zza.zzj().zzW(v1_1);
        return;
    }

    public void resetAnalyticsData(long p2)
    {
        this.zzb();
        this.zza.zzj().zzT(p2);
        return;
    }

    public void retrieveAndUploadBatches(com.google.android.gms.internal.measurement.zzcx p3)
    {
        this.zzb();
        this.zza.zzj().zzt(new com.google.android.gms.measurement.internal.zzo(this, p3));
        return;
    }

    public void setConditionalUserProperty(android.os.Bundle p2, long p3)
    {
        this.zzb();
        if (p2 != null) {
            this.zza.zzj().zzaa(p2, p3);
            return;
        } else {
            v1.a.s(this.zza, "Conditional user property must not be null");
            return;
        }
    }

    public void setConsent(android.os.Bundle p1, long p2)
    {
        return;
    }

    public void setConsentThirdParty(android.os.Bundle p3, long p4)
    {
        this.zzb();
        this.zza.zzj().zzp(p3, -20, p4);
        return;
    }

    public void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper p7, String p8, String p9, long p10)
    {
        this.zzb();
        this.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(p7))))), p8, p9, p10);
        return;
    }

    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p1, String p2, String p3, long p4)
    {
        this.zzb();
        this.zza.zzs().zzk(p1, p2, p3);
        return;
    }

    public void setDataCollectionEnabled(boolean p4)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzlj v0_1 = this.zza.zzj();
        v0_1.zzb();
        v0_1.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzjy(v0_1, p4));
        return;
    }

    public void setDefaultEventParameters(android.os.Bundle p4)
    {
        android.os.Bundle v4_1;
        this.zzb();
        com.google.android.gms.measurement.internal.zzlj v0_1 = this.zza.zzj();
        if (p4 != null) {
            v4_1 = new android.os.Bundle(p4);
        } else {
            v4_1 = new android.os.Bundle();
        }
        v0_1.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlf(v0_1, v4_1));
        return;
    }

    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzda p3)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzp v0_1 = new com.google.android.gms.measurement.internal.zzp(this, p3);
        if (!this.zza.zzaW().zze()) {
            this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzl(this, v0_1));
            return;
        } else {
            this.zza.zzj().zzV(v0_1);
            return;
        }
    }

    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdc p1)
    {
        this.zzb();
        return;
    }

    public void setMeasurementEnabled(boolean p1, long p2)
    {
        this.zzb();
        this.zza.zzj().zzn(Boolean.valueOf(p1));
        return;
    }

    public void setMinimumSessionDuration(long p1)
    {
        this.zzb();
        return;
    }

    public void setSessionTimeoutDuration(long p4)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzlj v0_1 = this.zza.zzj();
        v0_1.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzka(v0_1, p4));
        return;
    }

    public void setSgtmDebugInfo(android.content.Intent p4)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzal v0_3 = this.zza.zzj();
        String v4_7 = p4.getData();
        if (v4_7 != null) {
            com.google.android.gms.measurement.internal.zzgs v1_7 = v4_7.getQueryParameter("sgtm_debug_enable");
            if ((v1_7 != null) && (v1_7.equals("1"))) {
                String v4_1 = v4_7.getQueryParameter("sgtm_preview_key");
                if (!android.text.TextUtils.isEmpty(v4_1)) {
                    com.google.android.gms.measurement.internal.zzal v0_1 = v0_3.zzu;
                    v0_1.zzaV().zzi().zzb("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", v4_1);
                    v0_1.zzc().zzy(v4_1);
                }
                return;
            } else {
                String v4_2 = v0_3.zzu;
                v4_2.zzaV().zzi().zza("[sgtm] Preview Mode was not enabled.");
                v4_2.zzc().zzy(0);
                return;
            }
        } else {
            v0_3.zzu.zzaV().zzi().zza("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
    }

    public void setUserId(String p9, long p10)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzlj v1 = this.zza.zzj();
        if ((p9 == null) || (!android.text.TextUtils.isEmpty(p9))) {
            v1.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzlg(v1, p9));
            v1.zzL(0, "_id", p9, 1, p10);
            return;
        } else {
            v1.a.v(v1.zzu, "User ID must be non-empty or null");
            return;
        }
    }

    public void setUserProperty(String p8, String p9, com.google.android.gms.dynamic.IObjectWrapper p10, boolean p11, long p12)
    {
        this.zzb();
        this.zza.zzj().zzL(p8, p9, com.google.android.gms.dynamic.ObjectWrapper.unwrap(p10), p11, p12);
        return;
    }

    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda p3)
    {
        this.zzb();
        com.google.android.gms.measurement.internal.zzq v1_1 = ((com.google.android.gms.measurement.internal.zzjq) this.zzb.remove(Integer.valueOf(p3.zzf())));
        if (v1_1 == null) {
            v1_1 = new com.google.android.gms.measurement.internal.zzq(this, p3);
        }
        this.zza.zzj().zzX(v1_1);
        return;
    }
}
