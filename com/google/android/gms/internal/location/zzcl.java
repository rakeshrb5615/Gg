package com.google.android.gms.internal.location;
final synthetic class zzcl implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic com.google.android.gms.common.api.internal.ListenerHolder zza;
    private final synthetic com.google.android.gms.location.DeviceOrientationRequest zzb;

    public synthetic zzcl(com.google.android.gms.common.api.internal.ListenerHolder p1, com.google.android.gms.location.DeviceOrientationRequest p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.location.zzdz) p3).zzC(this.zza, this.zzb, ((com.google.android.gms.tasks.TaskCompletionSource) p4));
        return;
    }
}
