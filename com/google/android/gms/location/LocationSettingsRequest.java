package com.google.android.gms.location;
public final class LocationSettingsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final java.util.List zza;
    private final boolean zzb;
    private final boolean zzc;

    static LocationSettingsRequest()
    {
        com.google.android.gms.location.LocationSettingsRequest.CREATOR = new com.google.android.gms.location.zzah();
        return;
    }

    public LocationSettingsRequest(java.util.List p1, boolean p2, boolean p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v5_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 1, java.util.Collections.unmodifiableList(v5_0), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
