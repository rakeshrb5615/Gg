package com.google.android.gms.location;
public final class GeofencingRequest$Builder {
    private final java.util.List zza;
    private int zzb;

    public GeofencingRequest$Builder()
    {
        this.zza = new java.util.ArrayList();
        this.zzb = 5;
        return;
    }

    public com.google.android.gms.location.GeofencingRequest$Builder addGeofence(com.google.android.gms.location.Geofence p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkArgument((p3 instanceof com.google.android.gms.internal.location.zzek), "Geofence must be created using Geofence.Builder.");
        this.zza.add(((com.google.android.gms.internal.location.zzek) p3));
        return this;
    }

    public com.google.android.gms.location.GeofencingRequest$Builder addGeofences(java.util.List p2)
    {
        java.util.Iterator v2_1 = p2.iterator();
        while (v2_1.hasNext()) {
            this.addGeofence(((com.google.android.gms.location.Geofence) v2_1.next()));
        }
        return this;
    }

    public com.google.android.gms.location.GeofencingRequest build()
    {
        com.google.android.gms.common.internal.Preconditions.checkArgument((this.zza.isEmpty() ^ 1), "No geofence has been added to this request.");
        return new com.google.android.gms.location.GeofencingRequest(new java.util.ArrayList(this.zza), this.zzb, 0);
    }

    public com.google.android.gms.location.GeofencingRequest$Builder setInitialTrigger(int p1)
    {
        this.zzb = (p1 & 7);
        return this;
    }
}
