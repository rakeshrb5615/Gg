package com.google.android.gms.common.moduleinstall.internal;
public final synthetic class zaj implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.common.moduleinstall.internal.zay zaa;
    public final synthetic com.google.android.gms.common.moduleinstall.internal.zaab zab;

    public synthetic zaj(com.google.android.gms.common.moduleinstall.internal.zay p1, com.google.android.gms.common.moduleinstall.internal.zaab p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public final void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.common.moduleinstall.internal.zaf) ((com.google.android.gms.common.moduleinstall.internal.zaz) p3).getService()).zai(new com.google.android.gms.common.moduleinstall.internal.zav(this.zaa, ((com.google.android.gms.tasks.TaskCompletionSource) p4)), this.zab);
        return;
    }
}
