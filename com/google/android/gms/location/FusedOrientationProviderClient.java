package com.google.android.gms.location;
public interface FusedOrientationProviderClient implements com.google.android.gms.common.api.HasApiKey {

    public abstract com.google.android.gms.tasks.Task removeOrientationUpdates();

    public abstract com.google.android.gms.tasks.Task requestOrientationUpdates();
}
