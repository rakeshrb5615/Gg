package com.google.android.gms.internal.location;
final class zzdo extends com.google.android.gms.internal.location.zzq {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;
    final synthetic com.google.android.gms.location.zzz zzb;

    public zzdo(com.google.android.gms.tasks.TaskCompletionSource p1, com.google.android.gms.location.zzz p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void zzd(com.google.android.gms.internal.location.zzl p2)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2.getStatus(), this.zza);
        return;
    }

    public final void zze()
    {
        this.zzb.zze();
        return;
    }
}
