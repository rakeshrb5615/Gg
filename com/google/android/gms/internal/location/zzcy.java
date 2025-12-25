package com.google.android.gms.internal.location;
abstract class zzcy extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl {

    public zzcy(com.google.android.gms.common.api.GoogleApiClient p2)
    {
        super(com.google.android.gms.internal.location.zzbi.zzb, p2);
        return;
    }

    public final synthetic com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status p3)
    {
        return new com.google.android.gms.location.LocationSettingsResult(p3, 0);
    }

    public final bridge synthetic void setResult(Object p1)
    {
        this.setResult(((com.google.android.gms.common.api.Result) p1));
        return;
    }
}
