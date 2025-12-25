package com.google.android.gms.common.moduleinstall.internal;
public final synthetic class zak implements com.google.android.gms.tasks.SuccessContinuation {
    public final synthetic java.util.concurrent.atomic.AtomicReference zaa;

    public synthetic zak(java.util.concurrent.atomic.AtomicReference p1)
    {
        this.zaa = p1;
        return;
    }

    public final com.google.android.gms.tasks.Task then(Object p2)
    {
        p2 = com.google.android.gms.common.moduleinstall.internal.zay.zab;
        com.google.android.gms.tasks.Task v2_5 = this.zaa;
        if (v2_5.get() == null) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR));
        } else {
            return com.google.android.gms.tasks.Tasks.forResult(((com.google.android.gms.common.moduleinstall.ModuleInstallResponse) v2_5.get()));
        }
    }
}
