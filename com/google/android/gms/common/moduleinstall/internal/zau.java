package com.google.android.gms.common.moduleinstall.internal;
final class zau extends com.google.android.gms.common.moduleinstall.internal.zaa {
    final synthetic java.util.concurrent.atomic.AtomicReference zaa;
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zab;
    final synthetic com.google.android.gms.common.moduleinstall.InstallStatusListener zac;
    final synthetic com.google.android.gms.common.moduleinstall.internal.zay zad;

    public zau(com.google.android.gms.common.moduleinstall.internal.zay p1, java.util.concurrent.atomic.AtomicReference p2, com.google.android.gms.tasks.TaskCompletionSource p3, com.google.android.gms.common.moduleinstall.InstallStatusListener p4)
    {
        this.zad = p1;
        this.zaa = p2;
        this.zab = p3;
        this.zac = p4;
        return;
    }

    public final void zad(com.google.android.gms.common.api.Status p3, com.google.android.gms.common.moduleinstall.ModuleInstallResponse p4)
    {
        if (p4 != null) {
            this.zaa.set(p4);
        }
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(p3, 0, this.zab);
        if ((p3.isSuccess()) && ((p4 == null) || (!p4.zaa()))) {
            return;
        } else {
            this.zad.doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(this.zac, "InstallStatusListener"), 27306);
            return;
        }
    }
}
