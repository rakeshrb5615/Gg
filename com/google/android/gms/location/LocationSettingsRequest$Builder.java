package com.google.android.gms.location;
public final class LocationSettingsRequest$Builder {
    private final java.util.ArrayList zza;
    private boolean zzb;
    private boolean zzc;

    public LocationSettingsRequest$Builder()
    {
        this.zza = new java.util.ArrayList();
        this.zzb = 0;
        this.zzc = 0;
        return;
    }

    public com.google.android.gms.location.LocationSettingsRequest$Builder addAllLocationRequests(java.util.Collection p3)
    {
        java.util.Iterator v3_1 = p3.iterator();
        while (v3_1.hasNext()) {
            com.google.android.gms.location.LocationRequest v0_2 = ((com.google.android.gms.location.LocationRequest) v3_1.next());
            if (v0_2 != null) {
                this.zza.add(v0_2);
            }
        }
        return this;
    }

    public com.google.android.gms.location.LocationSettingsRequest$Builder addLocationRequest(com.google.android.gms.location.LocationRequest p2)
    {
        if (p2 != null) {
            this.zza.add(p2);
        }
        return this;
    }

    public com.google.android.gms.location.LocationSettingsRequest build()
    {
        return new com.google.android.gms.location.LocationSettingsRequest(this.zza, this.zzb, this.zzc);
    }

    public com.google.android.gms.location.LocationSettingsRequest$Builder setAlwaysShow(boolean p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.location.LocationSettingsRequest$Builder setNeedBle(boolean p1)
    {
        this.zzc = p1;
        return this;
    }
}
