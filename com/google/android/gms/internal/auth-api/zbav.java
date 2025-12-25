package com.google.android.gms.internal.auth-api;
final class zbav extends com.google.android.gms.internal.auth-api.zbak {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zba;

    public zbav(com.google.android.gms.internal.auth-api.zbaw p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zba = p2;
        return;
    }

    public final void zbb(com.google.android.gms.common.api.Status p2, com.google.android.gms.auth.api.identity.SavePasswordResult p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2, p3, this.zba);
        return;
    }
}
