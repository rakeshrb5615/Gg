package com.google.android.gms.location;
public interface FusedLocationProviderApi {
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    public abstract com.google.android.gms.common.api.PendingResult flushLocations();

    public abstract android.location.Location getLastLocation();

    public abstract com.google.android.gms.location.LocationAvailability getLocationAvailability();

    public abstract com.google.android.gms.common.api.PendingResult removeLocationUpdates();

    public abstract com.google.android.gms.common.api.PendingResult removeLocationUpdates();

    public abstract com.google.android.gms.common.api.PendingResult removeLocationUpdates();

    public abstract com.google.android.gms.common.api.PendingResult requestLocationUpdates();

    public abstract com.google.android.gms.common.api.PendingResult requestLocationUpdates();

    public abstract com.google.android.gms.common.api.PendingResult requestLocationUpdates();

    public abstract com.google.android.gms.common.api.PendingResult requestLocationUpdates();

    public abstract com.google.android.gms.common.api.PendingResult setMockLocation();

    public abstract com.google.android.gms.common.api.PendingResult setMockMode();
}
