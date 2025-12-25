package com.google.android.gms.internal.firebase-auth-api;
public final class zzaeu {
    private static Boolean zza;

    public static boolean zza(android.content.Context p2)
    {
        if (com.google.android.gms.internal.firebase-auth-api.zzaeu.zza == null) {
            Boolean v2_1;
            Boolean v2_5 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(p2, 12451000);
            if ((v2_5 != null) && (v2_5 != 2)) {
                v2_1 = 0;
            } else {
                v2_1 = 1;
            }
            com.google.android.gms.internal.firebase-auth-api.zzaeu.zza = Boolean.valueOf(v2_1);
        }
        return com.google.android.gms.internal.firebase-auth-api.zzaeu.zza.booleanValue();
    }
}
