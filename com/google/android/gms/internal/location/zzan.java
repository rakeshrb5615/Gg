package com.google.android.gms.internal.location;
final synthetic class zzan implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic android.app.PendingIntent zza;

    public synthetic zzan(android.app.PendingIntent p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void accept(Object p3, Object p4)
    {
        com.google.android.gms.internal.location.zzai v0_1 = new com.google.android.gms.internal.location.zzai(((com.google.android.gms.tasks.TaskCompletionSource) p4));
        android.app.PendingIntent v4_2 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_2, "PendingIntent must be specified.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzv) ((com.google.android.gms.internal.location.zzg) p3).getService()).zzn(v4_2, new com.google.android.gms.common.api.internal.StatusCallback(v0_1));
        return;
    }
}
