package com.google.android.gms.location;
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = 255;

    public abstract long getExpirationTime();

    public abstract double getLatitude();

    public abstract int getLoiteringDelay();

    public abstract double getLongitude();

    public abstract int getNotificationResponsiveness();

    public abstract float getRadius();

    public abstract String getRequestId();

    public abstract int getTransitionTypes();
}
