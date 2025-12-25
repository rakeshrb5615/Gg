package com.google.android.gms.common;
public class GooglePlayServicesManifestException extends java.lang.IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int p1, String p2)
    {
        super(p2);
        super.zza = p1;
        return;
    }

    public int getActualVersion()
    {
        return this.zza;
    }

    public int getExpectedVersion()
    {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
