package com.google.android.gms.common.internal;
final class zap implements com.google.android.gms.common.api.PendingResult$StatusListener {
    final synthetic com.google.android.gms.common.api.PendingResult zaa;
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zab;
    final synthetic com.google.android.gms.common.internal.PendingResultUtil$ResultConverter zac;
    final synthetic com.google.android.gms.common.internal.zas zad;

    public zap(com.google.android.gms.common.api.PendingResult p1, com.google.android.gms.tasks.TaskCompletionSource p2, com.google.android.gms.common.internal.PendingResultUtil$ResultConverter p3, com.google.android.gms.common.internal.zas p4)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        this.zad = p4;
        return;
    }

    public final void onComplete(com.google.android.gms.common.api.Status p4)
    {
        if (!p4.isSuccess()) {
            this.zab.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(p4));
            return;
        } else {
            this.zab.setResult(this.zac.convert(this.zaa.await(0, java.util.concurrent.TimeUnit.MILLISECONDS)));
            return;
        }
    }
}
