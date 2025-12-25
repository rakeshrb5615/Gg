package com.google.android.gms.fido.fido2;
final class zzv extends com.google.android.gms.internal.fido.zzf {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzv(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void zzb(java.util.List p2)
    {
        this.zza.setResult(p2);
        return;
    }

    public final void zzc(com.google.android.gms.common.api.Status p3)
    {
        this.zza.trySetException(new com.google.android.gms.common.api.ApiException(p3));
        return;
    }
}
