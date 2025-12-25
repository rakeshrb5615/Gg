package com.google.android.gms.internal.auth-api-phone;
final class zzu extends com.google.android.gms.common.api.internal.IStatusCallback$Stub {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzu(com.google.android.gms.internal.auth-api-phone.zzv p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void onResult(com.google.android.gms.common.api.Status p3)
    {
        if (p3.getStatusCode() != 6) {
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p3, this.zza);
            return;
        } else {
            this.zza.trySetException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(p3));
            return;
        }
    }
}
