package com.google.android.gms.measurement;
public class AppMeasurement {
    public static final String CRASH_ORIGIN = "crash";
    public static final String FCM_ORIGIN = "fcm";
    public static final String FIAM_ORIGIN = "fiam";
    private static volatile com.google.android.gms.measurement.AppMeasurement zza;
    private final com.google.android.gms.measurement.zzc zzb;

    public AppMeasurement(com.google.android.gms.measurement.internal.zzic p2)
    {
        this.zzb = new com.google.android.gms.measurement.zza(p2);
        return;
    }

    public AppMeasurement(com.google.android.gms.measurement.internal.zzlk p2)
    {
        this.zzb = new com.google.android.gms.measurement.zzb(p2);
        return;
    }

    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context p10)
    {
        if (com.google.android.gms.measurement.AppMeasurement.zza == null) {
            try {
                if (com.google.android.gms.measurement.AppMeasurement.zza == null) {
                    try {
                    } catch (Exception) {
                        com.google.android.gms.internal.measurement.zzdd v2_2 = 0;
                        if (v2_2 == null) {
                            com.google.android.gms.measurement.AppMeasurement.zza = new com.google.android.gms.measurement.AppMeasurement(com.google.android.gms.measurement.internal.zzic.zzy(p10, new com.google.android.gms.internal.measurement.zzdd(0, 0, 1, 0, 0), 0));
                        } else {
                            com.google.android.gms.measurement.AppMeasurement.zza = new com.google.android.gms.measurement.AppMeasurement(v2_2);
                        }
                    }
                    v2_2 = ((com.google.android.gms.measurement.internal.zzlk) com.google.firebase.analytics.FirebaseAnalytics.getDeclaredMethod("getScionFrontendApiImplementation", new Class[] {android.content.Context, android.os.Bundle})).invoke(0, new Object[] {p10, 0})));
                }
            } catch (com.google.android.gms.measurement.AppMeasurement v0_4) {
                throw v0_4;
            }
        }
        return com.google.android.gms.measurement.AppMeasurement.zza;
    }

    public void beginAdUnitExposure(String p2)
    {
        this.zzb.zzm(p2);
        return;
    }

    public void clearConditionalUserProperty(String p2, String p3, android.os.Bundle p4)
    {
        this.zzb.zzp(p2, p3, p4);
        return;
    }

    public void endAdUnitExposure(String p2)
    {
        this.zzb.zzn(p2);
        return;
    }

    public long generateEventId()
    {
        return this.zzb.zzl();
    }

    public String getAppInstanceId()
    {
        return this.zzb.zzj();
    }

    public Boolean getBoolean()
    {
        return this.zzb.zzs();
    }

    public java.util.List getConditionalUserProperties(String p3, String p4)
    {
        android.os.Bundle v0_4;
        java.util.Iterator v3_2 = this.zzb.zzq(p3, p4);
        if (v3_2 != null) {
            v0_4 = v3_2.size();
        } else {
            v0_4 = 0;
        }
        java.util.ArrayList v4_2 = new java.util.ArrayList(v0_4);
        java.util.Iterator v3_1 = v3_2.iterator();
        while (v3_1.hasNext()) {
            v4_2.add(new com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty(((android.os.Bundle) v3_1.next())));
        }
        return v4_2;
    }

    public String getCurrentScreenClass()
    {
        return this.zzb.zzi();
    }

    public String getCurrentScreenName()
    {
        return this.zzb.zzh();
    }

    public Double getDouble()
    {
        return this.zzb.zzw();
    }

    public String getGmpAppId()
    {
        return this.zzb.zzk();
    }

    public Integer getInteger()
    {
        return this.zzb.zzt();
    }

    public Long getLong()
    {
        return this.zzb.zzv();
    }

    public int getMaxUserProperties(String p2)
    {
        return this.zzb.zzr(p2);
    }

    public String getString()
    {
        return this.zzb.zzu();
    }

    public java.util.Map getUserProperties(String p2, String p3, boolean p4)
    {
        return this.zzb.zzd(p2, p3, p4);
    }

    public java.util.Map getUserProperties(boolean p2)
    {
        return this.zzb.zzc(p2);
    }

    public void logEventInternal(String p2, String p3, android.os.Bundle p4)
    {
        this.zzb.zza(p2, p3, p4);
        return;
    }

    public void logEventInternalNoInterceptor(String p7, String p8, android.os.Bundle p9, long p10)
    {
        this.zzb.zzb(p7, p8, p9, p10);
        return;
    }

    public void registerOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement$OnEventListener p2)
    {
        this.zzb.zzf(p2);
        return;
    }

    public void setConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        android.os.Bundle v0_1 = new android.os.Bundle();
        com.google.android.gms.measurement.zzc v1_6 = p6.mAppId;
        if (v1_6 != null) {
            v0_1.putString("app_id", v1_6);
        }
        com.google.android.gms.measurement.zzc v1_13 = p6.mOrigin;
        if (v1_13 != null) {
            v0_1.putString("origin", v1_13);
        }
        com.google.android.gms.measurement.zzc v1_0 = p6.mName;
        if (v1_0 != null) {
            v0_1.putString("name", v1_0);
        }
        com.google.android.gms.measurement.zzc v1_1 = p6.mValue;
        if (v1_1 != null) {
            com.google.android.gms.measurement.internal.zzjh.zza(v0_1, v1_1);
        }
        com.google.android.gms.measurement.zzc v1_2 = p6.mTriggerEventName;
        if (v1_2 != null) {
            v0_1.putString("trigger_event_name", v1_2);
        }
        v0_1.putLong("trigger_timeout", p6.mTriggerTimeout);
        com.google.android.gms.measurement.zzc v1_4 = p6.mTimedOutEventName;
        if (v1_4 != null) {
            v0_1.putString("timed_out_event_name", v1_4);
        }
        com.google.android.gms.measurement.zzc v1_5 = p6.mTimedOutEventParams;
        if (v1_5 != null) {
            v0_1.putBundle("timed_out_event_params", v1_5);
        }
        com.google.android.gms.measurement.zzc v1_7 = p6.mTriggeredEventName;
        if (v1_7 != null) {
            v0_1.putString("triggered_event_name", v1_7);
        }
        com.google.android.gms.measurement.zzc v1_8 = p6.mTriggeredEventParams;
        if (v1_8 != null) {
            v0_1.putBundle("triggered_event_params", v1_8);
        }
        v0_1.putLong("time_to_live", p6.mTimeToLive);
        com.google.android.gms.measurement.zzc v1_10 = p6.mExpiredEventName;
        if (v1_10 != null) {
            v0_1.putString("expired_event_name", v1_10);
        }
        com.google.android.gms.measurement.zzc v1_11 = p6.mExpiredEventParams;
        if (v1_11 != null) {
            v0_1.putBundle("expired_event_params", v1_11);
        }
        com.google.android.gms.measurement.zzc v1_12 = this.zzb;
        v0_1.putLong("creation_timestamp", p6.mCreationTimestamp);
        v0_1.putBoolean("active", p6.mActive);
        v0_1.putLong("triggered_timestamp", p6.mTriggeredTimestamp);
        v1_12.zzo(v0_1);
        return;
    }

    public void setEventInterceptor(com.google.android.gms.measurement.AppMeasurement$EventInterceptor p2)
    {
        this.zzb.zze(p2);
        return;
    }

    public void unregisterOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement$OnEventListener p2)
    {
        this.zzb.zzg(p2);
        return;
    }
}
