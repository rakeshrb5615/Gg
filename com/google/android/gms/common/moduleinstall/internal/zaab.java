package com.google.android.gms.common.moduleinstall.internal;
final class zaab extends com.google.android.gms.common.moduleinstall.internal.zag {
    private final com.google.android.gms.common.api.internal.ListenerHolder zaa;

    public zaab(com.google.android.gms.common.api.internal.ListenerHolder p1)
    {
        this.zaa = p1;
        return;
    }

    public final void zab(com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate p2)
    {
        this.zaa.notifyListener(new com.google.android.gms.common.moduleinstall.internal.zaaa(this, p2));
        return;
    }
}
