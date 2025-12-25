package com.google.android.gms.internal.auth-api;
final class zbbe extends com.google.android.gms.internal.auth-api.zbag {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zba;

    public zbbe(com.google.android.gms.internal.auth-api.zbbg p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zba = p2;
        return;
    }

    public final void zbb(com.google.android.gms.common.api.Status p2, android.app.PendingIntent p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2, p3, this.zba);
        return;
    }
}
