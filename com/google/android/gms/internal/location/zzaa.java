package com.google.android.gms.internal.location;
public abstract class zzaa extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.internal.location.zzab {

    public zzaa()
    {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((com.google.android.gms.location.LocationSettingsResult) com.google.android.gms.internal.location.zzc.zza(p2, com.google.android.gms.location.LocationSettingsResult.CREATOR));
            com.google.android.gms.internal.location.zzc.zzd(p2);
            this.zzb(v1_4);
            return 1;
        }
    }
}
