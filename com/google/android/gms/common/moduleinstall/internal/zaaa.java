package com.google.android.gms.common.moduleinstall.internal;
final class zaaa implements com.google.android.gms.common.api.internal.ListenerHolder$Notifier {
    final synthetic com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate zaa;

    public zaaa(com.google.android.gms.common.moduleinstall.internal.zaab p1, com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate p2)
    {
        this.zaa = p2;
        return;
    }

    public final bridge synthetic void notifyListener(Object p2)
    {
        ((com.google.android.gms.common.moduleinstall.InstallStatusListener) p2).onInstallStatusUpdated(this.zaa);
        return;
    }

    public final void onNotifyListenerFailed()
    {
        return;
    }
}
