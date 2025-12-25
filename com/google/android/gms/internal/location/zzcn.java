package com.google.android.gms.internal.location;
final class zzcn extends com.google.android.gms.internal.location.zzcq {
    final synthetic com.google.android.gms.location.GeofencingRequest zza;
    final synthetic android.app.PendingIntent zzb;

    public zzcn(com.google.android.gms.internal.location.zzcr p1, com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.location.GeofencingRequest p3, android.app.PendingIntent p4)
    {
        this.zza = p3;
        this.zzb = p4;
        super(p2);
        return;
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p4)
    {
        ((com.google.android.gms.internal.location.zzdz) p4).zzE(this.zza, this.zzb, com.google.android.gms.internal.location.zzcr.zza(this));
        return;
    }
}
