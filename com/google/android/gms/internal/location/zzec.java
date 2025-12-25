package com.google.android.gms.internal.location;
final synthetic class zzec implements com.google.android.gms.tasks.OnTokenCanceledListener {
    private final synthetic com.google.android.gms.internal.location.zzdz zza;
    private final synthetic com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey zzb;

    public synthetic zzec(com.google.android.gms.internal.location.zzdz p1, com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void onCanceled()
    {
        try {
            this.zza.zzw(this.zzb, 1, new com.google.android.gms.tasks.TaskCompletionSource());
        } catch (android.os.RemoteException) {
        }
        return;
    }
}
