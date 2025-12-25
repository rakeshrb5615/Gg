package com.google.android.gms.internal.location;
public final class zzcr implements com.google.android.gms.location.GeofencingApi {

    public zzcr()
    {
        return;
    }

    public static synthetic com.google.android.gms.tasks.TaskCompletionSource zza(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder p3)
    {
        com.google.android.gms.tasks.TaskCompletionSource v0_1 = new com.google.android.gms.tasks.TaskCompletionSource();
        v0_1.getTask().addOnCompleteListener(new com.google.android.gms.internal.location.zzcs(p3));
        return v0_1;
    }

    public final com.google.android.gms.common.api.PendingResult addGeofences(com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.location.GeofencingRequest p3, android.app.PendingIntent p4)
    {
        return p2.execute(new com.google.android.gms.internal.location.zzcn(this, p2, p3, p4));
    }

    public final com.google.android.gms.common.api.PendingResult addGeofences(com.google.android.gms.common.api.GoogleApiClient p2, java.util.List p3, android.app.PendingIntent p4)
    {
        com.google.android.gms.internal.location.zzcn v0_1 = new com.google.android.gms.location.GeofencingRequest$Builder();
        v0_1.addGeofences(p3);
        v0_1.setInitialTrigger(5);
        return p2.execute(new com.google.android.gms.internal.location.zzcn(this, p2, v0_1.build(), p4));
    }

    public final com.google.android.gms.common.api.PendingResult removeGeofences(com.google.android.gms.common.api.GoogleApiClient p2, android.app.PendingIntent p3)
    {
        return p2.execute(new com.google.android.gms.internal.location.zzco(this, p2, p3));
    }

    public final com.google.android.gms.common.api.PendingResult removeGeofences(com.google.android.gms.common.api.GoogleApiClient p2, java.util.List p3)
    {
        return p2.execute(new com.google.android.gms.internal.location.zzcp(this, p2, p3));
    }
}
