package com.google.android.gms.internal.location;
final synthetic class zzcj implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic com.google.android.gms.common.api.internal.ListenerHolder zza;

    public synthetic zzcj(com.google.android.gms.common.api.internal.ListenerHolder p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void accept(Object p2, Object p3)
    {
        com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey v0_1 = this.zza.getListenerKey();
        if (v0_1 != null) {
            ((com.google.android.gms.internal.location.zzdz) p2).zzD(v0_1, ((com.google.android.gms.tasks.TaskCompletionSource) p3));
        }
        return;
    }
}
