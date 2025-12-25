package com.google.android.gms.location;
public interface SettingsClient implements com.google.android.gms.common.api.HasApiKey {

    public abstract com.google.android.gms.tasks.Task checkLocationSettings();

    public abstract com.google.android.gms.tasks.Task isGoogleLocationAccuracyEnabled();
}
