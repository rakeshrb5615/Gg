package com.google.android.gms.internal.location;
public final class zzaf implements com.google.android.gms.location.ActivityRecognitionApi {

    public zzaf()
    {
        return;
    }

    public final com.google.android.gms.common.api.PendingResult removeActivityUpdates(com.google.android.gms.common.api.GoogleApiClient p2, android.app.PendingIntent p3)
    {
        return p2.execute(new com.google.android.gms.internal.location.zzad(this, p2, p3));
    }

    public final com.google.android.gms.common.api.PendingResult requestActivityUpdates(com.google.android.gms.common.api.GoogleApiClient p7, long p8, android.app.PendingIntent p10)
    {
        return p7.execute(new com.google.android.gms.internal.location.zzac(this, p7, p8, p10));
    }
}
