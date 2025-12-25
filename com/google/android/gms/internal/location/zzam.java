package com.google.android.gms.internal.location;
final synthetic class zzam implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic android.app.PendingIntent zza;

    public synthetic zzam(android.app.PendingIntent p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void accept(Object p2, Object p3)
    {
        android.app.PendingIntent v0_2 = new com.google.android.gms.internal.location.zzai(((com.google.android.gms.tasks.TaskCompletionSource) p3));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_2, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzv) ((com.google.android.gms.internal.location.zzg) p2).getService()).zzk(this.zza, new com.google.android.gms.common.api.internal.StatusCallback(v0_2));
        return;
    }
}
