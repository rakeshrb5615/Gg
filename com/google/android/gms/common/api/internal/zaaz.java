package com.google.android.gms.common.api.internal;
final class zaaz implements com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks {
    final synthetic java.util.concurrent.atomic.AtomicReference zaa;
    final synthetic com.google.android.gms.common.api.internal.StatusPendingResult zab;
    final synthetic com.google.android.gms.common.api.internal.zabe zac;

    public zaaz(com.google.android.gms.common.api.internal.zabe p1, java.util.concurrent.atomic.AtomicReference p2, com.google.android.gms.common.api.internal.StatusPendingResult p3)
    {
        this.zac = p1;
        this.zaa = p2;
        this.zab = p3;
        return;
    }

    public final void onConnected(android.os.Bundle p4)
    {
        com.google.android.gms.common.api.internal.zabe.zah(this.zac, ((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.common.api.GoogleApiClient) this.zaa.get()))), this.zab, 1);
        return;
    }

    public final void onConnectionSuspended(int p1)
    {
        return;
    }
}
