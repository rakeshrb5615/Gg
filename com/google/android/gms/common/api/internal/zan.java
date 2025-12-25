package com.google.android.gms.common.api.internal;
final class zan extends com.google.android.gms.common.api.internal.zabw {
    final synthetic android.app.Dialog zaa;
    final synthetic com.google.android.gms.common.api.internal.zao zab;

    public zan(com.google.android.gms.common.api.internal.zao p1, android.app.Dialog p2)
    {
        this.zab = p1;
        this.zaa = p2;
        return;
    }

    public final void zaa()
    {
        com.google.android.gms.common.api.internal.zap.zag(this.zab.zaa);
        if (this.zaa.isShowing()) {
            this.zaa.dismiss();
        }
        return;
    }
}
