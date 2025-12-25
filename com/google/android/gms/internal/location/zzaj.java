package com.google.android.gms.internal.location;
public final class zzaj extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.location.ActivityRecognitionClient {
    static final com.google.android.gms.common.api.Api$ClientKey zza;
    public static final com.google.android.gms.common.api.Api zzb;

    static zzaj()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.internal.location.zzaj.zza = v0_1;
        com.google.android.gms.internal.location.zzaj.zzb = new com.google.android.gms.common.api.Api("ActivityRecognition.API", new com.google.android.gms.internal.location.zzag(), v0_1);
        return;
    }

    public zzaj(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.internal.location.zzaj.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public zzaj(android.content.Context p4)
    {
        super(p4, com.google.android.gms.internal.location.zzaj.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public final com.google.android.gms.tasks.Task removeActivityTransitionUpdates(android.app.PendingIntent p3)
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzam(p3)).setMethodKey(2406).build());
    }

    public final com.google.android.gms.tasks.Task removeActivityUpdates(android.app.PendingIntent p3)
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzak(p3)).setMethodKey(2402).build());
    }

    public final com.google.android.gms.tasks.Task removeSleepSegmentUpdates(android.app.PendingIntent p3)
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzan(p3)).setMethodKey(2411).build());
    }

    public final com.google.android.gms.tasks.Task requestActivityTransitionUpdates(com.google.android.gms.location.ActivityTransitionRequest p3, android.app.PendingIntent p4)
    {
        p3.zza(this.getContextAttributionTag());
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzal(p3, p4)).setMethodKey(2405).build());
    }

    public final com.google.android.gms.tasks.Task requestActivityUpdates(long p2, android.app.PendingIntent p4)
    {
        com.google.android.gms.internal.location.zzap v0_1 = new com.google.android.gms.location.zza();
        v0_1.zza(p2);
        com.google.android.gms.tasks.Task v2_5 = v0_1.zzb();
        v2_5.zza(this.getContextAttributionTag());
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzap(v2_5, p4)).setMethodKey(2401).build());
    }

    public final com.google.android.gms.tasks.Task requestSleepSegmentUpdates(android.app.PendingIntent p3, com.google.android.gms.location.SleepSegmentRequest p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "PendingIntent must be specified.");
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzao(this, p3, p4)).setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.location.zzo.zzb})).setMethodKey(2410).build());
    }
}
