package com.google.android.gms.fido.fido2;
final class zzj extends com.google.android.gms.internal.fido.zzd {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzj(com.google.android.gms.fido.fido2.Fido2ApiClient p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void zzb(boolean p2)
    {
        this.zza.setResult(Boolean.valueOf(p2));
        return;
    }

    public final void zzc(com.google.android.gms.common.api.Status p3)
    {
        this.zza.trySetException(new com.google.android.gms.common.api.ApiException(p3));
        return;
    }
}
