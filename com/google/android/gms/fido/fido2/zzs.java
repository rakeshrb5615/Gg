package com.google.android.gms.fido.fido2;
final class zzs extends com.google.android.gms.internal.fido.zzl {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzs(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void zzb(com.google.android.gms.common.api.Status p2, android.app.PendingIntent p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2, new com.google.android.gms.internal.fido.zzi(p3), this.zza);
        return;
    }
}
