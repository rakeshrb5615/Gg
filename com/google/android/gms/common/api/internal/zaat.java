package com.google.android.gms.common.api.internal;
final class zaat implements com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener {
    final synthetic com.google.android.gms.common.api.internal.zaaw zaa;

    public synthetic zaat(com.google.android.gms.common.api.internal.zaaw p1, com.google.android.gms.common.api.internal.zaas p2)
    {
        this.zaa = p1;
        return;
    }

    public final void onConnected(android.os.Bundle p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.common.api.internal.zaaw.zal(this.zaa));
        ((com.google.android.gms.signin.zae) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.common.api.internal.zaaw.zan(this.zaa))).zad(new com.google.android.gms.common.api.internal.zaar(this.zaa));
        return;
    }

    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult p2)
    {
        com.google.android.gms.common.api.internal.zaaw.zap(this.zaa).lock();
        if (!com.google.android.gms.common.api.internal.zaaw.zay(this.zaa, p2)) {
            com.google.android.gms.common.api.internal.zaaw.zas(this.zaa, p2);
        } else {
            com.google.android.gms.common.api.internal.zaaw.zaq(this.zaa);
            com.google.android.gms.common.api.internal.zaaw.zau(this.zaa);
        }
        com.google.android.gms.common.api.internal.zaaw.zap(this.zaa).unlock();
        return;
    }

    public final void onConnectionSuspended(int p1)
    {
        return;
    }
}
