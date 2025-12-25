package com.google.android.gms.auth;
public class GooglePlayServicesAvailabilityException extends com.google.android.gms.auth.UserRecoverableAuthException {
    private final int zza;

    public GooglePlayServicesAvailabilityException(int p1, String p2, android.content.Intent p3)
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
