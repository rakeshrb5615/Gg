package com.google.android.gms.common.moduleinstall.internal;
final class zar extends com.google.android.gms.common.moduleinstall.internal.zaa {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zaa;

    public zar(com.google.android.gms.common.moduleinstall.internal.zay p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zaa = p2;
        return;
    }

    public final void zae(com.google.android.gms.common.api.Status p2, com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(p2, p3, this.zaa);
        return;
    }
}
