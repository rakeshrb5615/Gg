package com.google.android.gms.internal.auth;
final class zzx extends com.google.android.gms.common.api.internal.IStatusCallback$Stub {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzx(com.google.android.gms.internal.auth.zzab p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void onResult(com.google.android.gms.common.api.Status p3)
    {
        com.google.android.gms.internal.auth.zzab.zzf(p3, 0, this.zza);
        return;
    }
}
