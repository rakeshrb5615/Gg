package com.google.android.gms.common.moduleinstall.internal;
public final synthetic class zai implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.common.moduleinstall.internal.zay zaa;
    public final synthetic java.util.concurrent.atomic.AtomicReference zab;
    public final synthetic com.google.android.gms.common.moduleinstall.InstallStatusListener zac;
    public final synthetic com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest zad;
    public final synthetic com.google.android.gms.common.moduleinstall.internal.zaab zae;

    public synthetic zai(com.google.android.gms.common.moduleinstall.internal.zay p1, java.util.concurrent.atomic.AtomicReference p2, com.google.android.gms.common.moduleinstall.InstallStatusListener p3, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest p4, com.google.android.gms.common.moduleinstall.internal.zaab p5)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        this.zad = p4;
        this.zae = p5;
        return;
    }

    public final void accept(Object p5, Object p6)
    {
        ((com.google.android.gms.common.moduleinstall.internal.zaf) ((com.google.android.gms.common.moduleinstall.internal.zaz) p5).getService()).zag(new com.google.android.gms.common.moduleinstall.internal.zau(this.zaa, this.zab, ((com.google.android.gms.tasks.TaskCompletionSource) p6), this.zac), this.zad, this.zae);
        return;
    }
}
