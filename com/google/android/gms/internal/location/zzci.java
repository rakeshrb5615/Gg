package com.google.android.gms.internal.location;
public final class zzci extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.location.FusedOrientationProviderClient {
    public static final synthetic int zza;

    public zzci(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.internal.location.zzbi.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public zzci(android.content.Context p4)
    {
        super(p4, com.google.android.gms.internal.location.zzbi.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public final String getApiFallbackAttributionTag(android.content.Context p1)
    {
        return 0;
    }

    public final com.google.android.gms.tasks.Task removeOrientationUpdates(com.google.android.gms.location.DeviceOrientationListener p3)
    {
        return this.doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(p3, "DeviceOrientationListener"), 2440).continueWith(com.google.android.gms.internal.location.zzcm.zza, com.google.android.gms.internal.location.zzck.zza);
    }

    public final com.google.android.gms.tasks.Task requestOrientationUpdates(com.google.android.gms.location.DeviceOrientationRequest p2, java.util.concurrent.Executor p3, com.google.android.gms.location.DeviceOrientationListener p4)
    {
        int v3_2 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p4, p3, "DeviceOrientationListener");
        return this.doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(new com.google.android.gms.internal.location.zzcl(v3_2, p2)).unregister(new com.google.android.gms.internal.location.zzcj(v3_2)).withHolder(v3_2).setMethodKey(2434).build());
    }
}
