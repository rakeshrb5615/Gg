package com.google.android.gms.internal.auth-api;
final class zbap extends com.google.android.gms.internal.auth-api.zby {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zba;

    public zbap(com.google.android.gms.internal.auth-api.zbaq p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zba = p2;
        return;
    }

    public final void zbb(com.google.android.gms.common.api.Status p2, com.google.android.gms.auth.api.identity.AuthorizationResult p3)
    {
        if (!p2.isSuccess()) {
            this.zba.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(p2));
            return;
        } else {
            this.zba.setResult(p3);
            return;
        }
    }
}
