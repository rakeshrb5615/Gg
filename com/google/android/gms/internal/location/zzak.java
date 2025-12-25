package com.google.android.gms.internal.location;
final synthetic class zzak implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic android.app.PendingIntent zza;

    public synthetic zzak(android.app.PendingIntent p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void accept(Object p2, Object p3)
    {
        ((com.google.android.gms.internal.location.zzg) p2).zzp(this.zza);
        ((com.google.android.gms.tasks.TaskCompletionSource) p3).setResult(0);
        return;
    }
}
