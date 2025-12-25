package com.google.android.gms.common.moduleinstall.internal;
public final synthetic class zan implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.common.moduleinstall.internal.zay zaa;
    public final synthetic com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest zab;

    public synthetic zan(com.google.android.gms.common.moduleinstall.internal.zay p1, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public final void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.common.moduleinstall.internal.zaf) ((com.google.android.gms.common.moduleinstall.internal.zaz) p3).getService()).zaf(new com.google.android.gms.common.moduleinstall.internal.zaw(this.zaa, ((com.google.android.gms.tasks.TaskCompletionSource) p4)), this.zab);
        return;
    }
}
