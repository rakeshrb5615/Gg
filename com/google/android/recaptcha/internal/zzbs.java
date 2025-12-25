package com.google.android.recaptcha.internal;
public final class zzbs {
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zza;

    public zzbs()
    {
        com.google.android.gms.common.GoogleApiAvailabilityLight v0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
        this.zza = v0;
        return;
    }

    public zzbs(com.google.android.gms.common.GoogleApiAvailabilityLight p1)
    {
        this.zza = p1;
        return;
    }

    public final int zza(android.content.Context p3)
    {
        int v3_1 = this.zza.isGooglePlayServicesAvailable(p3);
        if ((v3_1 == 1) || ((v3_1 == 3) || (v3_1 == 9))) {
            return 4;
        } else {
            return 3;
        }
    }
}
