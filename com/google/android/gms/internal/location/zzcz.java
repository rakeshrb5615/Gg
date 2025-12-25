package com.google.android.gms.internal.location;
public final class zzcz implements com.google.android.gms.location.SettingsApi {

    public zzcz()
    {
        return;
    }

    public final com.google.android.gms.common.api.PendingResult checkLocationSettings(com.google.android.gms.common.api.GoogleApiClient p3, com.google.android.gms.location.LocationSettingsRequest p4)
    {
        return p3.enqueue(new com.google.android.gms.internal.location.zzcx(this, p3, p4, 0));
    }
}
