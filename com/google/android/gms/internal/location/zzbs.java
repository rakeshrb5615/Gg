package com.google.android.gms.internal.location;
final synthetic class zzbs implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic android.app.PendingIntent zza;
    private final synthetic com.google.android.gms.location.LocationRequest zzb;

    public synthetic zzbs(android.app.PendingIntent p1, com.google.android.gms.location.LocationRequest p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.location.zzdz) p3).zzu(this.zza, this.zzb, ((com.google.android.gms.tasks.TaskCompletionSource) p4));
        return;
    }
}
