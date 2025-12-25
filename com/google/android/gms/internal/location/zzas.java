package com.google.android.gms.internal.location;
final class zzas extends com.google.android.gms.internal.location.zzba {
    final synthetic com.google.android.gms.common.api.internal.ListenerHolder zza;
    final synthetic com.google.android.gms.location.LocationRequest zzb;

    public zzas(com.google.android.gms.internal.location.zzbb p1, com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.common.api.internal.ListenerHolder p3, com.google.android.gms.location.LocationRequest p4)
    {
        this.zza = p3;
        this.zzb = p4;
        super(p2);
        return;
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p4)
    {
        ((com.google.android.gms.internal.location.zzdz) p4).zzt(new com.google.android.gms.internal.location.zzaz(this.zza), this.zzb, com.google.android.gms.internal.location.zzbb.zza(this));
        return;
    }
}
