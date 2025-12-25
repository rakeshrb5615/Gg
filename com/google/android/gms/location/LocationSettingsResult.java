package com.google.android.gms.location;
public final class LocationSettingsResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.common.api.Status zza;
    private final com.google.android.gms.location.LocationSettingsStates zzb;

    static LocationSettingsResult()
    {
        com.google.android.gms.location.LocationSettingsResult.CREATOR = new com.google.android.gms.location.zzai();
        return;
    }

    public LocationSettingsResult(com.google.android.gms.common.api.Status p1, com.google.android.gms.location.LocationSettingsStates p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public com.google.android.gms.location.LocationSettingsStates getLocationSettingsStates()
    {
        return this.zzb;
    }

    public com.google.android.gms.common.api.Status getStatus()
    {
        return this.zza;
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.getStatus(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.getLocationSettingsStates(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
