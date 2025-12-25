package com.google.android.gms.internal.location;
final synthetic class zzap implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic com.google.android.gms.location.zzb zza;
    private final synthetic android.app.PendingIntent zzb;

    public synthetic zzap(com.google.android.gms.location.zzb p1, android.app.PendingIntent p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void accept(Object p4, Object p5)
    {
        com.google.android.gms.internal.location.zzai v0_1 = new com.google.android.gms.internal.location.zzai(((com.google.android.gms.tasks.TaskCompletionSource) p5));
        com.google.android.gms.location.zzb v5_2 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v5_2, "ActivityRecognitionRequest can\'t be null.");
        android.app.PendingIntent v1_1 = this.zzb;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_1, "PendingIntent must be specified.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzv) ((com.google.android.gms.internal.location.zzg) p4).getService()).zzi(v5_2, v1_1, new com.google.android.gms.common.api.internal.StatusCallback(v0_1));
        return;
    }
}
