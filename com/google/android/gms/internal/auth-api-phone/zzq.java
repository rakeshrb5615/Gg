package com.google.android.gms.internal.auth-api-phone;
final class zzq extends com.google.android.gms.internal.auth-api-phone.zzf {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzq(com.google.android.gms.internal.auth-api-phone.zzr p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void zzb(com.google.android.gms.common.api.Status p2, boolean p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2, Boolean.valueOf(p3), this.zza);
        return;
    }
}
