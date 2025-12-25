package com.google.android.gms.common.moduleinstall.internal;
final class zas extends com.google.android.gms.common.moduleinstall.internal.zaa {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zaa;

    public zas(com.google.android.gms.common.moduleinstall.internal.zay p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zaa = p2;
        return;
    }

    public final void zab(com.google.android.gms.common.api.Status p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(p3, 0, this.zaa);
        return;
    }
}
