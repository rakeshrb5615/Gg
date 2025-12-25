package com.google.android.gms.internal.location;
public final class zzbb implements com.google.android.gms.location.FusedLocationProviderApi {

    public zzbb()
    {
        return;
    }

    public static synthetic com.google.android.gms.tasks.TaskCompletionSource zza(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder p3)
    {
        com.google.android.gms.tasks.TaskCompletionSource v0_1 = new com.google.android.gms.tasks.TaskCompletionSource();
        v0_1.getTask().addOnCompleteListener(new com.google.android.gms.internal.location.zzbd(p3));
        return v0_1;
    }

    public final com.google.android.gms.common.api.PendingResult flushLocations(com.google.android.gms.common.api.GoogleApiClient p2)
    {
        return p2.execute(new com.google.android.gms.internal.location.zzaq(this, p2));
    }

    public final android.location.Location getLastLocation(com.google.android.gms.common.api.GoogleApiClient p6)
    {
        java.util.concurrent.atomic.AtomicReference v1_2;
        if (p6 == null) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1_2, "GoogleApiClient parameter is required.");
        android.location.Location v6_8 = ((com.google.android.gms.internal.location.zzdz) p6.getClient(com.google.android.gms.internal.location.zzbi.zza));
        java.util.concurrent.atomic.AtomicReference v1_1 = new java.util.concurrent.atomic.AtomicReference();
        java.util.concurrent.CountDownLatch v2_1 = new java.util.concurrent.CountDownLatch(1);
        com.google.android.gms.internal.location.zzbe v0_2 = new com.google.android.gms.tasks.TaskCompletionSource();
        try {
            v6_8.zzq(new com.google.android.gms.location.LastLocationRequest$Builder().build(), v0_2);
            v0_2.getTask().addOnCompleteListener(new com.google.android.gms.internal.location.zzbe(v1_1, v2_1));
        } catch (Exception) {
            return 0;
        }
        if (!com.google.android.gms.internal.location.zzfd.zza(v2_1, 30, java.util.concurrent.TimeUnit.SECONDS)) {
            return 0;
        } else {
            return ((android.location.Location) v1_1.get());
        }
    }

    public final com.google.android.gms.location.LocationAvailability getLocationAvailability(com.google.android.gms.common.api.GoogleApiClient p6)
    {
        java.util.concurrent.atomic.AtomicReference v1_2;
        if (p6 == null) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1_2, "GoogleApiClient parameter is required.");
        com.google.android.gms.location.LocationAvailability v6_8 = ((com.google.android.gms.internal.location.zzdz) p6.getClient(com.google.android.gms.internal.location.zzbi.zza));
        java.util.concurrent.atomic.AtomicReference v1_1 = new java.util.concurrent.atomic.AtomicReference();
        java.util.concurrent.CountDownLatch v2_1 = new java.util.concurrent.CountDownLatch(1);
        com.google.android.gms.internal.location.zzbc v0_2 = new com.google.android.gms.tasks.TaskCompletionSource();
        try {
            v6_8.zzp(com.google.android.gms.location.zzac.zza(), v0_2);
            v0_2.getTask().addOnCompleteListener(new com.google.android.gms.internal.location.zzbc(v1_1, v2_1));
        } catch (android.os.RemoteException) {
            return 0;
        }
        if (!com.google.android.gms.internal.location.zzfd.zza(v2_1, 30, java.util.concurrent.TimeUnit.SECONDS)) {
            return 0;
        } else {
            return ((com.google.android.gms.location.LocationAvailability) v1_1.get());
        }
    }

    public final com.google.android.gms.common.api.PendingResult removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient p2, android.app.PendingIntent p3)
    {
        return p2.execute(new com.google.android.gms.internal.location.zzav(this, p2, p3));
    }

    public final com.google.android.gms.common.api.PendingResult removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.location.LocationCallback p3)
    {
        return p2.execute(new com.google.android.gms.internal.location.zzaw(this, p2, p3));
    }

    public final com.google.android.gms.common.api.PendingResult removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.location.LocationListener p3)
    {
        return p2.execute(new com.google.android.gms.internal.location.zzau(this, p2, p3));
    }

    public final com.google.android.gms.common.api.PendingResult requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.location.LocationRequest p3, android.app.PendingIntent p4)
    {
        return p2.execute(new com.google.android.gms.internal.location.zzat(this, p2, p4, p3));
    }

    public final com.google.android.gms.common.api.PendingResult requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.location.LocationRequest p3, com.google.android.gms.location.LocationCallback p4, android.os.Looper p5)
    {
        if (p5 == null) {
            p5 = android.os.Looper.myLooper();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p5, "invalid null looper");
        }
        return p2.execute(new com.google.android.gms.internal.location.zzas(this, p2, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p4, p5, "LocationCallback"), p3));
    }

    public final com.google.android.gms.common.api.PendingResult requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient p3, com.google.android.gms.location.LocationRequest p4, com.google.android.gms.location.LocationListener p5)
    {
        com.google.android.gms.internal.location.zzar v0_0 = android.os.Looper.myLooper();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_0, "invalid null looper");
        return p3.execute(new com.google.android.gms.internal.location.zzar(this, p3, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p5, v0_0, "LocationListener"), p4));
    }

    public final com.google.android.gms.common.api.PendingResult requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.location.LocationRequest p3, com.google.android.gms.location.LocationListener p4, android.os.Looper p5)
    {
        if (p5 == null) {
            p5 = android.os.Looper.myLooper();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(p5, "invalid null looper");
        }
        return p2.execute(new com.google.android.gms.internal.location.zzar(this, p2, com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p4, p5, "LocationListener"), p3));
    }

    public final com.google.android.gms.common.api.PendingResult setMockLocation(com.google.android.gms.common.api.GoogleApiClient p2, android.location.Location p3)
    {
        return p2.execute(new com.google.android.gms.internal.location.zzay(this, p2, p3));
    }

    public final com.google.android.gms.common.api.PendingResult setMockMode(com.google.android.gms.common.api.GoogleApiClient p2, boolean p3)
    {
        return p2.execute(new com.google.android.gms.internal.location.zzax(this, p2, p3));
    }
}
