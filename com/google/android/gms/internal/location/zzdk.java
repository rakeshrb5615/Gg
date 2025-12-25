package com.google.android.gms.internal.location;
final class zzdk extends com.google.android.gms.internal.location.zzy {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzdk(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.zza = p1;
        return;
    }

    public final void zzb(com.google.android.gms.common.api.Status p2, android.location.Location p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2, p3, this.zza);
        return;
    }
}
