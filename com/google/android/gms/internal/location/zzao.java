package com.google.android.gms.internal.location;
final synthetic class zzao implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic com.google.android.gms.internal.location.zzaj zza;
    private final synthetic android.app.PendingIntent zzb;
    private final synthetic com.google.android.gms.location.SleepSegmentRequest zzc;

    public synthetic zzao(com.google.android.gms.internal.location.zzaj p1, android.app.PendingIntent p2, com.google.android.gms.location.SleepSegmentRequest p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final synthetic void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.location.zzv) ((com.google.android.gms.internal.location.zzg) p3).getService()).zzm(this.zzb, this.zzc, new com.google.android.gms.internal.location.zzah(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p4)));
        return;
    }
}
