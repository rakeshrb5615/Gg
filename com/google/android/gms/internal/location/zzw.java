package com.google.android.gms.internal.location;
public abstract class zzw extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.internal.location.zzx {

    public zzw()
    {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((com.google.android.gms.common.api.Status) com.google.android.gms.internal.location.zzc.zza(p2, com.google.android.gms.common.api.Status.CREATOR));
            com.google.android.gms.location.LocationAvailability v4_1 = ((com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.location.zzc.zza(p2, com.google.android.gms.location.LocationAvailability.CREATOR));
            com.google.android.gms.internal.location.zzc.zzd(p2);
            this.zzb(v1_4, v4_1);
            return 1;
        }
    }
}
