package com.google.android.gms.location;
public class LocationServices {
    public static final com.google.android.gms.common.api.Api API;
    public static final com.google.android.gms.location.FusedLocationProviderApi FusedLocationApi;
    public static final com.google.android.gms.location.GeofencingApi GeofencingApi;
    public static final com.google.android.gms.location.SettingsApi SettingsApi;

    static LocationServices()
    {
        com.google.android.gms.location.LocationServices.API = com.google.android.gms.internal.location.zzbi.zzb;
        com.google.android.gms.location.LocationServices.FusedLocationApi = new com.google.android.gms.internal.location.zzbb();
        com.google.android.gms.location.LocationServices.GeofencingApi = new com.google.android.gms.internal.location.zzcr();
        com.google.android.gms.location.LocationServices.SettingsApi = new com.google.android.gms.internal.location.zzcz();
        return;
    }

    private LocationServices()
    {
        return;
    }

    public static com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient(android.app.Activity p1)
    {
        return new com.google.android.gms.internal.location.zzbi(p1);
    }

    public static com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient(android.content.Context p1)
    {
        return new com.google.android.gms.internal.location.zzbi(p1);
    }

    public static com.google.android.gms.location.FusedOrientationProviderClient getFusedOrientationProviderClient(android.app.Activity p1)
    {
        return new com.google.android.gms.internal.location.zzci(p1);
    }

    public static com.google.android.gms.location.FusedOrientationProviderClient getFusedOrientationProviderClient(android.content.Context p1)
    {
        return new com.google.android.gms.internal.location.zzci(p1);
    }

    public static com.google.android.gms.location.GeofencingClient getGeofencingClient(android.app.Activity p1)
    {
        return new com.google.android.gms.internal.location.zzct(p1);
    }

    public static com.google.android.gms.location.GeofencingClient getGeofencingClient(android.content.Context p1)
    {
        return new com.google.android.gms.internal.location.zzct(p1);
    }

    public static com.google.android.gms.location.SettingsClient getSettingsClient(android.app.Activity p1)
    {
        return new com.google.android.gms.internal.location.zzda(p1);
    }

    public static com.google.android.gms.location.SettingsClient getSettingsClient(android.content.Context p1)
    {
        return new com.google.android.gms.internal.location.zzda(p1);
    }
}
