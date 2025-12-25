package com.google.android.gms.location;
public interface FusedLocationProviderClient implements com.google.android.gms.common.api.HasApiKey {
    public static final String KEY_MOCK_LOCATION = "mockLocation";
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    public abstract com.google.android.gms.tasks.Task flushLocations();

    public abstract com.google.android.gms.tasks.Task getCurrentLocation();

    public abstract com.google.android.gms.tasks.Task getCurrentLocation();

    public abstract com.google.android.gms.tasks.Task getLastLocation();

    public abstract com.google.android.gms.tasks.Task getLastLocation();

    public abstract com.google.android.gms.tasks.Task getLocationAvailability();

    public abstract com.google.android.gms.tasks.Task removeDeviceOrientationUpdates();

    public abstract com.google.android.gms.tasks.Task removeLocationUpdates();

    public abstract com.google.android.gms.tasks.Task removeLocationUpdates();

    public abstract com.google.android.gms.tasks.Task removeLocationUpdates();

    public abstract com.google.android.gms.tasks.Task requestDeviceOrientationUpdates();

    public abstract com.google.android.gms.tasks.Task requestDeviceOrientationUpdates();

    public abstract com.google.android.gms.tasks.Task requestLocationUpdates();

    public abstract com.google.android.gms.tasks.Task requestLocationUpdates();

    public abstract com.google.android.gms.tasks.Task requestLocationUpdates();

    public abstract com.google.android.gms.tasks.Task requestLocationUpdates();

    public abstract com.google.android.gms.tasks.Task requestLocationUpdates();

    public abstract com.google.android.gms.tasks.Task setMockLocation();

    public abstract com.google.android.gms.tasks.Task setMockMode();
}
