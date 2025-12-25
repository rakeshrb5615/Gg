package com.google.android.gms.common.internal;
public final class zzaf extends java.lang.Exception {
    public final com.google.android.gms.common.ConnectionResult zza;

    public zzaf(com.google.android.gms.common.ConnectionResult p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkArgument(p3.hasResolution(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.zza = p3;
        return;
    }
}
