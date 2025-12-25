package com.google.android.gms.fido.fido2;
final class zzg extends com.google.android.gms.internal.fido.zzq {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzg(com.google.android.gms.fido.fido2.Fido2ApiClient p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void zzb(com.google.android.gms.common.api.Status p2, android.app.PendingIntent p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2, p3, this.zza);
        return;
    }
}
