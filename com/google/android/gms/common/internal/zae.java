package com.google.android.gms.common.internal;
final class zae extends com.google.android.gms.common.internal.zag {
    final synthetic android.content.Intent zaa;
    final synthetic androidx.fragment.app.e0 zab;
    final synthetic int zac;

    public zae(android.content.Intent p1, androidx.fragment.app.e0 p2, int p3)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public final void zaa()
    {
        android.content.Intent v0 = this.zaa;
        if (v0 != null) {
            this.zab.startActivityForResult(v0, this.zac);
        }
        return;
    }
}
