package com.google.android.gms.internal.location;
final class zzav extends com.google.android.gms.internal.location.zzba {
    final synthetic android.app.PendingIntent zza;

    public zzav(com.google.android.gms.internal.location.zzbb p1, com.google.android.gms.common.api.GoogleApiClient p2, android.app.PendingIntent p3)
    {
        this.zza = p3;
        super(p2);
        return;
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p4)
    {
        ((com.google.android.gms.internal.location.zzdz) p4).zzx(this.zza, com.google.android.gms.internal.location.zzbb.zza(this), 0);
        return;
    }
}
