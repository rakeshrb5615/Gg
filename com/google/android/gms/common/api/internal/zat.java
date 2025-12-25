package com.google.android.gms.common.api.internal;
public final class zat implements com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener {
    public final com.google.android.gms.common.api.Api zaa;
    private final boolean zab;
    private com.google.android.gms.common.api.internal.zau zac;

    public zat(com.google.android.gms.common.api.Api p1, boolean p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    private final com.google.android.gms.common.api.internal.zau zab()
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.zac;
    }

    public final void onConnected(android.os.Bundle p2)
    {
        this.zab().onConnected(p2);
        return;
    }

    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult p4)
    {
        this.zab().zaa(p4, this.zaa, this.zab);
        return;
    }

    public final void onConnectionSuspended(int p2)
    {
        this.zab().onConnectionSuspended(p2);
        return;
    }

    public final void zaa(com.google.android.gms.common.api.internal.zau p1)
    {
        this.zac = p1;
        return;
    }
}
