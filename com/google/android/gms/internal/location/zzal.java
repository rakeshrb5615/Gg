package com.google.android.gms.internal.location;
final synthetic class zzal implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic com.google.android.gms.location.ActivityTransitionRequest zza;
    private final synthetic android.app.PendingIntent zzb;

    public synthetic zzal(com.google.android.gms.location.ActivityTransitionRequest p1, android.app.PendingIntent p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void accept(Object p4, Object p5)
    {
        com.google.android.gms.internal.location.zzai v0_1 = new com.google.android.gms.internal.location.zzai(((com.google.android.gms.tasks.TaskCompletionSource) p5));
        com.google.android.gms.location.ActivityTransitionRequest v5_2 = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v5_2, "activityTransitionRequest must be specified.");
        android.app.PendingIntent v1_1 = this.zzb;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_1, "PendingIntent must be specified.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzv) ((com.google.android.gms.internal.location.zzg) p4).getService()).zzj(v5_2, v1_1, new com.google.android.gms.common.api.internal.StatusCallback(v0_1));
        return;
    }
}
