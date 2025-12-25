package com.google.android.gms.internal.location;
final class zzai implements com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzai(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zza = p1;
        return;
    }

    public final void setFailedResult(com.google.android.gms.common.api.Status p3)
    {
        if (p3 != null) {
            this.zza.setException(new com.google.android.gms.common.api.ApiException(p3));
            return;
        } else {
            return;
        }
    }

    public final synthetic void setResult(Object p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(((com.google.android.gms.common.api.Status) p3), 0, this.zza);
        return;
    }
}
