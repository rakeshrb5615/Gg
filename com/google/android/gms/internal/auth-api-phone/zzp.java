package com.google.android.gms.internal.auth-api-phone;
final class zzp extends com.google.android.gms.internal.auth-api-phone.zzd {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzp(com.google.android.gms.internal.auth-api-phone.zzr p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void zzb(com.google.android.gms.common.api.Status p2, int p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2, Integer.valueOf(p3), this.zza);
        return;
    }
}
