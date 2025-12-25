package com.google.android.gms.common.internal;
final class zai implements com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener {
    final synthetic com.google.android.gms.common.api.internal.OnConnectionFailedListener zaa;

    public zai(com.google.android.gms.common.api.internal.OnConnectionFailedListener p1)
    {
        this.zaa = p1;
        return;
    }

    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult p2)
    {
        this.zaa.onConnectionFailed(p2);
        return;
    }
}
