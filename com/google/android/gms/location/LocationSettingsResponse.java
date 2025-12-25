package com.google.android.gms.location;
public class LocationSettingsResponse extends com.google.android.gms.common.api.Response {

    public LocationSettingsResponse(com.google.android.gms.location.LocationSettingsResult p1)
    {
        super(p1);
        return;
    }

    public com.google.android.gms.location.LocationSettingsStates getLocationSettingsStates()
    {
        return ((com.google.android.gms.location.LocationSettingsResult) this.getResult()).getLocationSettingsStates();
    }
}
