package com.google.android.gms.common.internal;
final class zaf extends com.google.android.gms.common.internal.zag {
    final synthetic android.content.Intent zaa;
    final synthetic com.google.android.gms.common.api.internal.LifecycleFragment zab;

    public zaf(android.content.Intent p1, com.google.android.gms.common.api.internal.LifecycleFragment p2, int p3)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public final void zaa()
    {
        android.content.Intent v0 = this.zaa;
        if (v0 != null) {
            this.zab.startActivityForResult(v0, 2);
        }
        return;
    }
}
