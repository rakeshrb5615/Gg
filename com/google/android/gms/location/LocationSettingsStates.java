package com.google.android.gms.location;
public final class LocationSettingsStates extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    static LocationSettingsStates()
    {
        com.google.android.gms.location.LocationSettingsStates.CREATOR = new com.google.android.gms.location.zzaj();
        return;
    }

    public LocationSettingsStates(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p6;
        return;
    }

    public static com.google.android.gms.location.LocationSettingsStates fromIntent(android.content.Intent p2)
    {
        return ((com.google.android.gms.location.LocationSettingsStates) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(p2, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", com.google.android.gms.location.LocationSettingsStates.CREATOR));
    }

    public boolean isBlePresent()
    {
        return this.zzf;
    }

    public boolean isBleUsable()
    {
        return this.zzc;
    }

    public boolean isGpsPresent()
    {
        return this.zzd;
    }

    public boolean isGpsUsable()
    {
        return this.zza;
    }

    public boolean isLocationPresent()
    {
        if ((!this.zzd) && (!this.zze)) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean isLocationUsable()
    {
        if ((!this.zza) && (!this.zzb)) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean isNetworkLocationPresent()
    {
        return this.zze;
    }

    public boolean isNetworkLocationUsable()
    {
        return this.zzb;
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 1, this.isGpsUsable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 2, this.isNetworkLocationUsable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 3, this.isBleUsable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 4, this.isGpsPresent());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 5, this.isNetworkLocationPresent());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 6, this.isBlePresent());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
