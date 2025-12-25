package com.google.android.gms.internal.location;
final synthetic class zzbd implements com.google.android.gms.tasks.OnCompleteListener {
    private final synthetic com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zza;

    public synthetic zzbd(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void onComplete(com.google.android.gms.tasks.Task p3)
    {
        com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder v0 = this.zza;
        if (!p3.isSuccessful()) {
            if (!p3.isCanceled()) {
                com.google.android.gms.common.api.Status v3_6 = p3.getException();
                if (!(v3_6 instanceof com.google.android.gms.common.api.ApiException)) {
                    v0.setFailedResult(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR);
                    return;
                } else {
                    v0.setFailedResult(((com.google.android.gms.common.api.ApiException) v3_6).getStatus());
                    return;
                }
            } else {
                v0.setFailedResult(com.google.android.gms.common.api.Status.RESULT_CANCELED);
                return;
            }
        } else {
            v0.setResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
            return;
        }
    }
}
