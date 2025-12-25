package com.google.android.gms.location;
public interface GeofencingClient implements com.google.android.gms.common.api.HasApiKey {

    public abstract com.google.android.gms.tasks.Task addGeofences();

    public abstract com.google.android.gms.tasks.Task removeGeofences();

    public abstract com.google.android.gms.tasks.Task removeGeofences();
}
