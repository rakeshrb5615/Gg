package com.google.android.gms.common;
public class GooglePlayServicesRepairableException extends com.google.android.gms.common.UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int p1, String p2, android.content.Intent p3)
    {
        super(p2, p3);
        super.zza = p1;
        return;
    }

    public int getConnectionStatusCode()
    {
        return this.zza;
    }
}
