package com.google.android.gms.internal.location;
final class zzdn extends com.google.android.gms.internal.location.zzq {
    final synthetic Object zza;
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zzb;

    public zzdn(Object p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void zzd(com.google.android.gms.internal.location.zzl p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p3.getStatus(), this.zza, this.zzb);
        return;
    }

    public final void zze()
    {
        return;
    }
}
