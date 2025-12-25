package com.google.android.gms.internal.location;
public final class zzct extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.location.GeofencingClient {
    public static final synthetic int zza;

    public zzct(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.internal.location.zzbi.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public zzct(android.content.Context p4)
    {
        super(p4, com.google.android.gms.internal.location.zzbi.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public final com.google.android.gms.tasks.Task addGeofences(com.google.android.gms.location.GeofencingRequest p3, android.app.PendingIntent p4)
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzcw(p3, p4)).setMethodKey(2424).build());
    }

    public final com.google.android.gms.tasks.Task removeGeofences(android.app.PendingIntent p3)
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzcu(p3)).setMethodKey(2425).build());
    }

    public final com.google.android.gms.tasks.Task removeGeofences(java.util.List p3)
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzcv(p3)).setMethodKey(2425).build());
    }
}
