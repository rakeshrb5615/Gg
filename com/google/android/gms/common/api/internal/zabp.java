package com.google.android.gms.common.api.internal;
final class zabp implements com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks {
    final synthetic com.google.android.gms.common.api.internal.zabq zaa;

    public zabp(com.google.android.gms.common.api.internal.zabq p1)
    {
        this.zaa = p1;
        return;
    }

    public final void onSignOutComplete()
    {
        com.google.android.gms.common.api.internal.GoogleApiManager.zad(this.zaa.zaa).post(new com.google.android.gms.common.api.internal.zabo(this));
        return;
    }
}
