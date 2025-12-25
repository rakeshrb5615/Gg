package com.google.android.gms.common.api.internal;
final class zam {
    private final int zaa;
    private final com.google.android.gms.common.ConnectionResult zab;

    public zam(com.google.android.gms.common.ConnectionResult p1, int p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zab = p1;
        this.zaa = p2;
        return;
    }

    public final int zaa()
    {
        return this.zaa;
    }

    public final com.google.android.gms.common.ConnectionResult zab()
    {
        return this.zab;
    }
}
