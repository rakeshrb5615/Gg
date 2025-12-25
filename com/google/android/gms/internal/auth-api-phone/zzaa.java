package com.google.android.gms.internal.auth-api-phone;
final class zzaa extends com.google.android.gms.internal.auth-api-phone.zzi {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzaa(com.google.android.gms.internal.auth-api-phone.zzab p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void zzb(com.google.android.gms.common.api.Status p2)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2, this.zza);
        return;
    }
}
