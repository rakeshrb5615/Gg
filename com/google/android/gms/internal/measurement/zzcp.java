package com.google.android.gms.internal.measurement;
public final class zzcp extends com.google.android.gms.internal.measurement.zzbl implements com.google.android.gms.internal.measurement.zzcr {

    public zzcp(android.os.IBinder p2)
    {
        super(p2, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return;
    }

    public final void beginAdUnitExposure(String p2, long p3)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        v0.writeLong(p3);
        this.zzc(23, v0);
        return;
    }

    public final void clearConditionalUserProperty(String p2, String p3, android.os.Bundle p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        v0.writeString(p3);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p4);
        this.zzc(9, v0);
        return;
    }

    public final void clearMeasurementEnabled(long p1)
    {
        throw 0;
    }

    public final void endAdUnitExposure(String p2, long p3)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        v0.writeLong(p3);
        this.zzc(24, v0);
        return;
    }

    public final void generateEventId(com.google.android.gms.internal.measurement.zzcu p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        this.zzc(22, v0);
        return;
    }

    public final void getAppInstanceId(com.google.android.gms.internal.measurement.zzcu p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        this.zzc(20, v0);
        return;
    }

    public final void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcu p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        this.zzc(19, v0);
        return;
    }

    public final void getConditionalUserProperties(String p2, String p3, com.google.android.gms.internal.measurement.zzcu p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        v0.writeString(p3);
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p4);
        this.zzc(10, v0);
        return;
    }

    public final void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcu p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        this.zzc(17, v0);
        return;
    }

    public final void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcu p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        this.zzc(16, v0);
        return;
    }

    public final void getGmpAppId(com.google.android.gms.internal.measurement.zzcu p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        this.zzc(21, v0);
        return;
    }

    public final void getMaxUserProperties(String p2, com.google.android.gms.internal.measurement.zzcu p3)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p3);
        this.zzc(6, v0);
        return;
    }

    public final void getSessionId(com.google.android.gms.internal.measurement.zzcu p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        this.zzc(46, v0);
        return;
    }

    public final void getTestFlag(com.google.android.gms.internal.measurement.zzcu p2, int p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        v0.writeInt(p3);
        this.zzc(38, v0);
        return;
    }

    public final void getUserProperties(String p2, String p3, boolean p4, com.google.android.gms.internal.measurement.zzcu p5)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        v0.writeString(p3);
        v0.writeInt(p4);
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p5);
        this.zzc(5, v0);
        return;
    }

    public final void initForTests(java.util.Map p1)
    {
        throw 0;
    }

    public final void initialize(com.google.android.gms.dynamic.IObjectWrapper p2, com.google.android.gms.internal.measurement.zzdd p3, long p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p3);
        v0.writeLong(p4);
        this.zzc(1, v0);
        return;
    }

    public final void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcu p1)
    {
        throw 0;
    }

    public final void logEvent(String p2, String p3, android.os.Bundle p4, boolean p5, boolean p6, long p7)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        v0.writeString(p3);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p4);
        v0.writeInt(p5);
        v0.writeInt(p6);
        v0.writeLong(p7);
        this.zzc(2, v0);
        return;
    }

    public final void logEventAndBundle(String p1, String p2, android.os.Bundle p3, com.google.android.gms.internal.measurement.zzcu p4, long p5)
    {
        throw 0;
    }

    public final void logHealthData(int p2, String p3, com.google.android.gms.dynamic.IObjectWrapper p4, com.google.android.gms.dynamic.IObjectWrapper p5, com.google.android.gms.dynamic.IObjectWrapper p6)
    {
        p2 = this.zza();
        p2.writeInt(5);
        p2.writeString(p3);
        com.google.android.gms.internal.measurement.zzbn.zzd(p2, p4);
        com.google.android.gms.internal.measurement.zzbn.zzd(p2, p5);
        com.google.android.gms.internal.measurement.zzbn.zzd(p2, p6);
        this.zzc(33, p2);
        return;
    }

    public final void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper p1, android.os.Bundle p2, long p3)
    {
        throw 0;
    }

    public final void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p2, android.os.Bundle p3, long p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p3);
        v0.writeLong(p4);
        this.zzc(53, v0);
        return;
    }

    public final void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper p1, long p2)
    {
        throw 0;
    }

    public final void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p2, long p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        v0.writeLong(p3);
        this.zzc(54, v0);
        return;
    }

    public final void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper p1, long p2)
    {
        throw 0;
    }

    public final void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p2, long p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        v0.writeLong(p3);
        this.zzc(55, v0);
        return;
    }

    public final void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper p1, long p2)
    {
        throw 0;
    }

    public final void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p2, long p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        v0.writeLong(p3);
        this.zzc(56, v0);
        return;
    }

    public final void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper p1, com.google.android.gms.internal.measurement.zzcu p2, long p3)
    {
        throw 0;
    }

    public final void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p2, com.google.android.gms.internal.measurement.zzcu p3, long p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p3);
        v0.writeLong(p4);
        this.zzc(57, v0);
        return;
    }

    public final void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper p1, long p2)
    {
        throw 0;
    }

    public final void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p2, long p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        v0.writeLong(p3);
        this.zzc(51, v0);
        return;
    }

    public final void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper p1, long p2)
    {
        throw 0;
    }

    public final void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p2, long p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        v0.writeLong(p3);
        this.zzc(52, v0);
        return;
    }

    public final void performAction(android.os.Bundle p2, com.google.android.gms.internal.measurement.zzcu p3, long p4)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p3);
        v0.writeLong(p4);
        this.zzc(32, v0);
        return;
    }

    public final void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        this.zzc(35, v0);
        return;
    }

    public final void resetAnalyticsData(long p2)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeLong(p2);
        this.zzc(12, v0);
        return;
    }

    public final void retrieveAndUploadBatches(com.google.android.gms.internal.measurement.zzcx p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        this.zzc(58, v0);
        return;
    }

    public final void setConditionalUserProperty(android.os.Bundle p2, long p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        v0.writeLong(p3);
        this.zzc(8, v0);
        return;
    }

    public final void setConsent(android.os.Bundle p1, long p2)
    {
        throw 0;
    }

    public final void setConsentThirdParty(android.os.Bundle p2, long p3)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        v0.writeLong(p3);
        this.zzc(45, v0);
        return;
    }

    public final void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper p1, String p2, String p3, long p4)
    {
        throw 0;
    }

    public final void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf p2, String p3, String p4, long p5)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        v0.writeString(p3);
        v0.writeString(p4);
        v0.writeLong(p5);
        this.zzc(50, v0);
        return;
    }

    public final void setDataCollectionEnabled(boolean p3)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeInt(p3);
        this.zzc(39, v0);
        return;
    }

    public final void setDefaultEventParameters(android.os.Bundle p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        this.zzc(42, v0);
        return;
    }

    public final void setEventInterceptor(com.google.android.gms.internal.measurement.zzda p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        this.zzc(34, v0);
        return;
    }

    public final void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdc p1)
    {
        throw 0;
    }

    public final void setMeasurementEnabled(boolean p3, long p4)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeInt(p3);
        v0.writeLong(p4);
        this.zzc(11, v0);
        return;
    }

    public final void setMinimumSessionDuration(long p1)
    {
        throw 0;
    }

    public final void setSessionTimeoutDuration(long p2)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeLong(p2);
        this.zzc(14, v0);
        return;
    }

    public final void setSgtmDebugInfo(android.content.Intent p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(v0, p2);
        this.zzc(48, v0);
        return;
    }

    public final void setUserId(String p2, long p3)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        v0.writeLong(p3);
        this.zzc(7, v0);
        return;
    }

    public final void setUserProperty(String p2, String p3, com.google.android.gms.dynamic.IObjectWrapper p4, boolean p5, long p6)
    {
        android.os.Parcel v0 = this.zza();
        v0.writeString(p2);
        v0.writeString(p3);
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p4);
        v0.writeInt(p5);
        v0.writeLong(p6);
        this.zzc(4, v0);
        return;
    }

    public final void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda p2)
    {
        android.os.Parcel v0 = this.zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(v0, p2);
        this.zzc(36, v0);
        return;
    }
}
