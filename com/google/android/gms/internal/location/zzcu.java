package com.google.android.gms.internal.location;
final synthetic class zzcu implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic android.app.PendingIntent zza;

    public synthetic zzcu(android.app.PendingIntent p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void accept(Object p2, Object p3)
    {
        ((com.google.android.gms.internal.location.zzdz) p2).zzF(com.google.android.gms.internal.location.zzem.zzb(this.zza), ((com.google.android.gms.tasks.TaskCompletionSource) p3));
        return;
    }
}
