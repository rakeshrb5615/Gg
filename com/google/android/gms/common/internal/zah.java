package com.google.android.gms.common.internal;
final class zah implements com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks {
    final synthetic com.google.android.gms.common.api.internal.ConnectionCallbacks zaa;

    public zah(com.google.android.gms.common.api.internal.ConnectionCallbacks p1)
    {
        this.zaa = p1;
        return;
    }

    public final void onConnected(android.os.Bundle p2)
    {
        this.zaa.onConnected(p2);
        return;
    }

    public final void onConnectionSuspended(int p2)
    {
        this.zaa.onConnectionSuspended(p2);
        return;
    }
}
