package com.google.android.gms.internal.location;
final synthetic class zzbp implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic com.google.android.gms.location.CurrentLocationRequest zza;
    private final synthetic com.google.android.gms.tasks.CancellationToken zzb;

    public synthetic zzbp(com.google.android.gms.location.CurrentLocationRequest p1, com.google.android.gms.tasks.CancellationToken p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.location.zzdz) p3).zzr(this.zza, this.zzb, ((com.google.android.gms.tasks.TaskCompletionSource) p4));
        return;
    }
}
