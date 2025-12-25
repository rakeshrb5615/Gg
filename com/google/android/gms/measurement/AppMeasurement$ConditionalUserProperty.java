package com.google.android.gms.measurement;
public class AppMeasurement$ConditionalUserProperty {
    public boolean mActive;
    public String mAppId;
    public long mCreationTimestamp;
    public String mExpiredEventName;
    public android.os.Bundle mExpiredEventParams;
    public String mName;
    public String mOrigin;
    public long mTimeToLive;
    public String mTimedOutEventName;
    public android.os.Bundle mTimedOutEventParams;
    public String mTriggerEventName;
    public long mTriggerTimeout;
    public String mTriggeredEventName;
    public android.os.Bundle mTriggeredEventParams;
    public long mTriggeredTimestamp;
    public Object mValue;

    public AppMeasurement$ConditionalUserProperty()
    {
        return;
    }

    public AppMeasurement$ConditionalUserProperty(android.os.Bundle p9)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p9);
        this.mAppId = ((String) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "app_id", String, 0));
        this.mOrigin = ((String) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "origin", String, 0));
        this.mName = ((String) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "name", String, 0));
        this.mValue = com.google.android.gms.measurement.internal.zzjh.zzb(p9, "value", Object, 0);
        this.mTriggerEventName = ((String) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "trigger_event_name", String, 0));
        long v0_11 = Long.valueOf(0);
        this.mTriggerTimeout = ((Long) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "trigger_timeout", Long, v0_11)).longValue();
        this.mTimedOutEventName = ((String) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "timed_out_event_name", String, 0));
        this.mTimedOutEventParams = ((android.os.Bundle) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "timed_out_event_params", android.os.Bundle, 0));
        this.mTriggeredEventName = ((String) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "triggered_event_name", String, 0));
        this.mTriggeredEventParams = ((android.os.Bundle) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "triggered_event_params", android.os.Bundle, 0));
        this.mTimeToLive = ((Long) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "time_to_live", Long, v0_11)).longValue();
        this.mExpiredEventName = ((String) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "expired_event_name", String, 0));
        this.mExpiredEventParams = ((android.os.Bundle) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "expired_event_params", android.os.Bundle, 0));
        this.mActive = ((Boolean) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "active", Boolean, Boolean.FALSE)).booleanValue();
        this.mCreationTimestamp = ((Long) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "creation_timestamp", Long, v0_11)).longValue();
        this.mTriggeredTimestamp = ((Long) com.google.android.gms.measurement.internal.zzjh.zzb(p9, "triggered_timestamp", Long, v0_11)).longValue();
        return;
    }

    public AppMeasurement$ConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        this.mAppId = p3.mAppId;
        this.mOrigin = p3.mOrigin;
        this.mCreationTimestamp = p3.mCreationTimestamp;
        this.mName = p3.mName;
        android.os.Bundle v0_0 = p3.mValue;
        if (v0_0 != null) {
            android.os.Bundle v0_1 = com.google.android.gms.measurement.internal.zzlt.zzb(v0_0);
            this.mValue = v0_1;
            if (v0_1 == null) {
                this.mValue = p3.mValue;
            }
        }
        this.mActive = p3.mActive;
        this.mTriggerEventName = p3.mTriggerEventName;
        this.mTriggerTimeout = p3.mTriggerTimeout;
        this.mTimedOutEventName = p3.mTimedOutEventName;
        android.os.Bundle v0_8 = p3.mTimedOutEventParams;
        if (v0_8 != null) {
            this.mTimedOutEventParams = new android.os.Bundle(v0_8);
        }
        this.mTriggeredEventName = p3.mTriggeredEventName;
        android.os.Bundle v0_10 = p3.mTriggeredEventParams;
        if (v0_10 != null) {
            this.mTriggeredEventParams = new android.os.Bundle(v0_10);
        }
        this.mTriggeredTimestamp = p3.mTriggeredTimestamp;
        this.mTimeToLive = p3.mTimeToLive;
        this.mExpiredEventName = p3.mExpiredEventName;
        android.os.Bundle v3_1 = p3.mExpiredEventParams;
        if (v3_1 != null) {
            this.mExpiredEventParams = new android.os.Bundle(v3_1);
        }
        return;
    }
}
