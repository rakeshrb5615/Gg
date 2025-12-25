package com.google.android.gms.internal.location;
public final class zzda extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.location.SettingsClient {
    public static final synthetic int zza;

    public zzda(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.internal.location.zzbi.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public zzda(android.content.Context p4)
    {
        super(p4, com.google.android.gms.internal.location.zzbi.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public final com.google.android.gms.tasks.Task checkLocationSettings(com.google.android.gms.location.LocationSettingsRequest p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzdb(p3)).setMethodKey(2426).build());
    }

    public final com.google.android.gms.tasks.Task isGoogleLocationAccuracyEnabled()
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(com.google.android.gms.internal.location.zzdc.zza).setMethodKey(2444).setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.location.zzo.zzm})).build());
    }
}
