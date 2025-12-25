package com.google.android.gms.common.api.internal;
final class zaj implements com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener {
    public final int zaa;
    public final com.google.android.gms.common.api.GoogleApiClient zab;
    public final com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zac;
    final synthetic com.google.android.gms.common.api.internal.zak zad;

    public zaj(com.google.android.gms.common.api.internal.zak p1, int p2, com.google.android.gms.common.api.GoogleApiClient p3, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p4)
    {
        this.zad = p1;
        this.zaa = p2;
        this.zab = p3;
        this.zac = p4;
        return;
    }

    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult p4)
    {
        android.util.Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(p4)));
        this.zad.zah(p4, this.zaa);
        return;
    }
}
