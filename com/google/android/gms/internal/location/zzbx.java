package com.google.android.gms.internal.location;
final synthetic class zzbx implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic android.app.PendingIntent zza;

    public synthetic zzbx(android.app.PendingIntent p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.location.zzdz) p3).zzx(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p4), 0);
        return;
    }
}
