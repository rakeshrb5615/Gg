package com.google.android.gms.internal.location;
final class zzat extends com.google.android.gms.internal.location.zzba {
    final synthetic android.app.PendingIntent zza;
    final synthetic com.google.android.gms.location.LocationRequest zzb;

    public zzat(com.google.android.gms.internal.location.zzbb p1, com.google.android.gms.common.api.GoogleApiClient p2, android.app.PendingIntent p3, com.google.android.gms.location.LocationRequest p4)
    {
        this.zza = p3;
        this.zzb = p4;
        super(p2);
        return;
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p4)
    {
        ((com.google.android.gms.internal.location.zzdz) p4).zzu(this.zza, this.zzb, com.google.android.gms.internal.location.zzbb.zza(this));
        return;
    }
}
