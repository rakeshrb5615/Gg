package com.google.android.gms.internal.location;
final class zzah extends com.google.android.gms.common.api.internal.IStatusCallback$Stub {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzah(com.google.android.gms.internal.location.zzaj p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void onResult(com.google.android.gms.common.api.Status p2)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2, this.zza);
        return;
    }
}
