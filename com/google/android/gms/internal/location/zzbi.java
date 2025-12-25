package com.google.android.gms.internal.location;
public final class zzbi extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.location.FusedLocationProviderClient {
    static final com.google.android.gms.common.api.Api$ClientKey zza;
    public static final com.google.android.gms.common.api.Api zzb;
    private static final Object zzc;
    private static Object zzd;

    static zzbi()
    {
        Object v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.internal.location.zzbi.zza = v0_1;
        com.google.android.gms.internal.location.zzbi.zzb = new com.google.android.gms.common.api.Api("LocationServices.API", new com.google.android.gms.internal.location.zzbf(), v0_1);
        com.google.android.gms.internal.location.zzbi.zzc = new Object();
        return;
    }

    public zzbi(android.app.Activity p4)
    {
        super(p4, com.google.android.gms.internal.location.zzbi.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public zzbi(android.content.Context p4)
    {
        super(p4, com.google.android.gms.internal.location.zzbi.zzb, com.google.android.gms.common.api.Api$ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    private final com.google.android.gms.tasks.Task zza(com.google.android.gms.location.LocationRequest p3, com.google.android.gms.common.api.internal.ListenerHolder p4)
    {
        com.google.android.gms.internal.location.zzbh v0_1 = new com.google.android.gms.internal.location.zzbh(this, p4, com.google.android.gms.internal.location.zzcd.zza);
        return this.doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(new com.google.android.gms.internal.location.zzbt(v0_1, p3)).unregister(v0_1).withHolder(p4).setMethodKey(2435).build());
    }

    private final com.google.android.gms.tasks.Task zzb(com.google.android.gms.location.LocationRequest p3, com.google.android.gms.common.api.internal.ListenerHolder p4)
    {
        com.google.android.gms.internal.location.zzbh v0_1 = new com.google.android.gms.internal.location.zzbh(this, p4, com.google.android.gms.internal.location.zzbz.zza);
        return this.doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(new com.google.android.gms.internal.location.zzbu(v0_1, p3)).unregister(v0_1).withHolder(p4).setMethodKey(2436).build());
    }

    private final com.google.android.gms.tasks.Task zzc(com.google.android.gms.location.DeviceOrientationRequest p3, com.google.android.gms.common.api.internal.ListenerHolder p4)
    {
        return this.doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(new com.google.android.gms.internal.location.zzbm(p4, p3)).unregister(new com.google.android.gms.internal.location.zzbn(p4)).withHolder(p4).setMethodKey(2434).build());
    }

    public final com.google.android.gms.tasks.Task flushLocations()
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(com.google.android.gms.internal.location.zzca.zza).setMethodKey(2422).build());
    }

    public final String getApiFallbackAttributionTag(android.content.Context p1)
    {
        return 0;
    }

    public final com.google.android.gms.tasks.Task getCurrentLocation(int p3, com.google.android.gms.tasks.CancellationToken p4)
    {
        com.google.android.gms.tasks.TaskCompletionSource v0_1 = new com.google.android.gms.location.CurrentLocationRequest$Builder();
        v0_1.setPriority(p3);
        com.google.android.gms.tasks.Task v3_5 = v0_1.build();
        if (p4 != null) {
            com.google.android.gms.common.internal.Preconditions.checkArgument((p4.isCancellationRequested() ^ 1), "cancellationToken may not be already canceled");
        }
        com.google.android.gms.tasks.Task v3_4 = this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzbp(v3_5, p4)).setMethodKey(2415).build());
        if (p4 != null) {
            com.google.android.gms.tasks.TaskCompletionSource v0_5 = new com.google.android.gms.tasks.TaskCompletionSource(p4);
            v3_4.continueWith(new com.google.android.gms.internal.location.zzbq(v0_5));
            v3_4 = v0_5.getTask();
        }
        return v3_4;
    }

    public final com.google.android.gms.tasks.Task getCurrentLocation(com.google.android.gms.location.CurrentLocationRequest p3, com.google.android.gms.tasks.CancellationToken p4)
    {
        if (p4 != null) {
            com.google.android.gms.common.internal.Preconditions.checkArgument((p4.isCancellationRequested() ^ 1), "cancellationToken may not be already canceled");
        }
        com.google.android.gms.tasks.Task v3_4 = this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzbp(p3, p4)).setMethodKey(2415).build());
        if (p4 != null) {
            com.google.android.gms.tasks.TaskCompletionSource v0_3 = new com.google.android.gms.tasks.TaskCompletionSource(p4);
            v3_4.continueWith(new com.google.android.gms.internal.location.zzbq(v0_3));
            v3_4 = v0_3.getTask();
        }
        return v3_4;
    }

    public final com.google.android.gms.tasks.Task getLastLocation()
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(com.google.android.gms.internal.location.zzby.zza).setMethodKey(2414).build());
    }

    public final com.google.android.gms.tasks.Task getLastLocation(com.google.android.gms.location.LastLocationRequest p3)
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzbj(p3)).setMethodKey(2414).setFeatures(new com.google.android.gms.common.Feature[] {com.google.android.gms.location.zzo.zzf})).build());
    }

    public final com.google.android.gms.tasks.Task getLocationAvailability()
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(com.google.android.gms.internal.location.zzbr.zza).setMethodKey(2416).build());
    }

    public final com.google.android.gms.tasks.Task removeDeviceOrientationUpdates(com.google.android.gms.location.DeviceOrientationListener p3)
    {
        return this.doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(p3, "DeviceOrientationListener"), 2440).continueWith(com.google.android.gms.internal.location.zzcg.zza, com.google.android.gms.internal.location.zzbo.zza);
    }

    public final com.google.android.gms.tasks.Task removeLocationUpdates(android.app.PendingIntent p3)
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzbx(p3)).setMethodKey(2418).build());
    }

    public final com.google.android.gms.tasks.Task removeLocationUpdates(com.google.android.gms.location.LocationCallback p3)
    {
        return this.doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(p3, "LocationCallback"), 2418).continueWith(com.google.android.gms.internal.location.zzce.zza, com.google.android.gms.internal.location.zzbw.zza);
    }

    public final com.google.android.gms.tasks.Task removeLocationUpdates(com.google.android.gms.location.LocationListener p3)
    {
        return this.doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(p3, "LocationListener"), 2418).continueWith(com.google.android.gms.internal.location.zzch.zza, com.google.android.gms.internal.location.zzbv.zza);
    }

    public final com.google.android.gms.tasks.Task requestDeviceOrientationUpdates(com.google.android.gms.location.DeviceOrientationRequest p2, com.google.android.gms.location.DeviceOrientationListener p3, android.os.Looper p4)
    {
        if (p4 == null) {
            p4 = android.os.Looper.myLooper();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "invalid null looper");
        }
        return this.zzc(p2, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p3, p4, "DeviceOrientationListener"));
    }

    public final com.google.android.gms.tasks.Task requestDeviceOrientationUpdates(com.google.android.gms.location.DeviceOrientationRequest p2, java.util.concurrent.Executor p3, com.google.android.gms.location.DeviceOrientationListener p4)
    {
        return this.zzc(p2, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p4, p3, "DeviceOrientationListener"));
    }

    public final com.google.android.gms.tasks.Task requestLocationUpdates(com.google.android.gms.location.LocationRequest p3, android.app.PendingIntent p4)
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzbs(p4, p3)).setMethodKey(2417).build());
    }

    public final com.google.android.gms.tasks.Task requestLocationUpdates(com.google.android.gms.location.LocationRequest p2, com.google.android.gms.location.LocationCallback p3, android.os.Looper p4)
    {
        if (p4 == null) {
            p4 = android.os.Looper.myLooper();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "invalid null looper");
        }
        return this.zzb(p2, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p3, p4, "LocationCallback"));
    }

    public final com.google.android.gms.tasks.Task requestLocationUpdates(com.google.android.gms.location.LocationRequest p2, com.google.android.gms.location.LocationListener p3, android.os.Looper p4)
    {
        if (p4 == null) {
            p4 = android.os.Looper.myLooper();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "invalid null looper");
        }
        return this.zza(p2, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p3, p4, "LocationListener"));
    }

    public final com.google.android.gms.tasks.Task requestLocationUpdates(com.google.android.gms.location.LocationRequest p2, java.util.concurrent.Executor p3, com.google.android.gms.location.LocationCallback p4)
    {
        return this.zzb(p2, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p4, p3, "LocationCallback"));
    }

    public final com.google.android.gms.tasks.Task requestLocationUpdates(com.google.android.gms.location.LocationRequest p2, java.util.concurrent.Executor p3, com.google.android.gms.location.LocationListener p4)
    {
        return this.zza(p2, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p4, p3, "LocationListener"));
    }

    public final com.google.android.gms.tasks.Task setMockLocation(android.location.Location p3)
    {
        int v0_0;
        if (p3 == null) {
            v0_0 = 0;
        } else {
            v0_0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_0);
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.location.zzbl(p3)).setMethodKey(2421).build());
    }

    public final com.google.android.gms.tasks.Task setMockMode(boolean p6)
    {
        if (p6 == null) {
            com.google.android.gms.tasks.Task v6_9 = com.google.android.gms.internal.location.zzbi.zzd;
            if (v6_9 != null) {
                com.google.android.gms.internal.location.zzbi.zzd = 0;
                return this.doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(v6_9, "Object"), 2420).continueWith(com.google.android.gms.internal.location.zzcf.zza, com.google.android.gms.internal.location.zzbk.zza);
            }
        } else {
            if (com.google.android.gms.internal.location.zzbi.zzd == null) {
                com.google.android.gms.tasks.Task v6_6 = new Object();
                com.google.android.gms.internal.location.zzbi.zzd = v6_6;
                return this.doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().register(com.google.android.gms.internal.location.zzcb.zza).unregister(com.google.android.gms.internal.location.zzcc.zza).withHolder(com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(v6_6, android.os.Looper.getMainLooper(), "Object")).setMethodKey(2420).build());
            }
        }
        return com.google.android.gms.tasks.Tasks.forResult(0);
    }
}
