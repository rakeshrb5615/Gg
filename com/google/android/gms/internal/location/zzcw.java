package com.google.android.gms.internal.location;
final synthetic class zzcw implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic com.google.android.gms.location.GeofencingRequest zza;
    private final synthetic android.app.PendingIntent zzb;

    public synthetic zzcw(com.google.android.gms.location.GeofencingRequest p1, android.app.PendingIntent p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.location.zzdz) p3).zzE(this.zza, this.zzb, ((com.google.android.gms.tasks.TaskCompletionSource) p4));
        return;
    }
}
