package com.google.android.gms.location;
public final class GeofenceStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION = 1004;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_REQUEST_TOO_FREQUENT = 1005;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;

    private GeofenceStatusCodes()
    {
        return;
    }

    public static String getStatusCodeString(int p0)
    {
        switch (p0) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            case 1003:
            default:
                return com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(p0);
            case 1004:
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
        }
    }

    public static int zza(int p1)
    {
        if ((p1 != 0) && ((p1 < 1000) || (p1 >= 1006))) {
            p1 = 13;
        }
        return p1;
    }
}
