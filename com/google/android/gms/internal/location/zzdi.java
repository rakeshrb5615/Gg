package com.google.android.gms.internal.location;
final class zzdi implements com.google.android.gms.internal.location.zzdr {
    final synthetic com.google.android.gms.common.api.internal.ListenerHolder zza;
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zzb;

    public zzdi(com.google.android.gms.internal.location.zzdz p1, com.google.android.gms.common.api.internal.ListenerHolder p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public final com.google.android.gms.common.api.internal.ListenerHolder zza()
    {
        return this.zza;
    }

    public final void zzb(com.google.android.gms.common.api.internal.ListenerHolder p1)
    {
        throw new IllegalStateException();
    }

    public final void zzc()
    {
        this.zzb.trySetResult(0);
        return;
    }
}
