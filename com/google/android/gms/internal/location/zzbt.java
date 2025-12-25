package com.google.android.gms.internal.location;
final synthetic class zzbt implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic com.google.android.gms.internal.location.zzbh zza;
    private final synthetic com.google.android.gms.location.LocationRequest zzb;

    public synthetic zzbt(com.google.android.gms.internal.location.zzbh p1, com.google.android.gms.location.LocationRequest p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.location.zzdz) p3).zzs(this.zza, this.zzb, ((com.google.android.gms.tasks.TaskCompletionSource) p4));
        return;
    }
}
