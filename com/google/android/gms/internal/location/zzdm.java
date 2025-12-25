package com.google.android.gms.internal.location;
final class zzdm extends com.google.android.gms.internal.location.zzn {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzdm(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.zza = p1;
        return;
    }

    public final void zzb(com.google.android.gms.common.api.Status p2, boolean p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2, Boolean.valueOf(p3), this.zza);
        return;
    }
}
