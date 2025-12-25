package com.google.android.gms.internal.location;
final class zzdj extends com.google.android.gms.common.api.internal.IStatusCallback$Stub {
    final synthetic Object zza;
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zzb;

    public zzdj(Object p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void onResult(com.google.android.gms.common.api.Status p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p3, this.zza, this.zzb);
        return;
    }
}
