package com.google.android.gms.common.api.internal;
final class zaba implements com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener {
    final synthetic com.google.android.gms.common.api.internal.StatusPendingResult zaa;

    public zaba(com.google.android.gms.common.api.internal.zabe p1, com.google.android.gms.common.api.internal.StatusPendingResult p2)
    {
        this.zaa = p2;
        return;
    }

    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult p2)
    {
        this.zaa.setResult(new com.google.android.gms.common.api.Status(8));
        return;
    }
}
