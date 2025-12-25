package com.google.android.gms.internal.location;
final synthetic class zzbj implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic com.google.android.gms.location.LastLocationRequest zza;

    public synthetic zzbj(com.google.android.gms.location.LastLocationRequest p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void accept(Object p2, Object p3)
    {
        ((com.google.android.gms.internal.location.zzdz) p2).zzq(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p3));
        return;
    }
}
