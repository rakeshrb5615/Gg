package com.google.android.gms.common.moduleinstall.internal;
final class zav extends com.google.android.gms.common.api.internal.IStatusCallback$Stub {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zaa;

    public zav(com.google.android.gms.common.moduleinstall.internal.zay p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zaa = p2;
        return;
    }

    public final void onResult(com.google.android.gms.common.api.Status p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(p3, Boolean.TRUE, this.zaa);
        return;
    }
}
