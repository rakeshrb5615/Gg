package com.google.android.gms.common.api.internal;
public final class zaax implements com.google.android.gms.common.api.internal.zabf {
    private final com.google.android.gms.common.api.internal.zabi zaa;

    public zaax(com.google.android.gms.common.api.internal.zabi p1)
    {
        this.zaa = p1;
        return;
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zaa(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        this.zaa.zag.zaa.add(p2);
        return p2;
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zab(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void zad()
    {
        com.google.android.gms.common.api.internal.zabe v0_4 = this.zaa.zaa.values().iterator();
        while (v0_4.hasNext()) {
            ((com.google.android.gms.common.api.Api$Client) v0_4.next()).disconnect();
        }
        this.zaa.zag.zad = java.util.Collections.EMPTY_SET;
        return;
    }

    public final void zae()
    {
        this.zaa.zaj();
        return;
    }

    public final void zag(android.os.Bundle p1)
    {
        return;
    }

    public final void zah(com.google.android.gms.common.ConnectionResult p1, com.google.android.gms.common.api.Api p2, boolean p3)
    {
        return;
    }

    public final void zai(int p1)
    {
        return;
    }

    public final boolean zaj()
    {
        return 1;
    }
}
