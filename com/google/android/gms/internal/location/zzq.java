package com.google.android.gms.internal.location;
public abstract class zzq extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.internal.location.zzr {

    public zzq()
    {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
        return;
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 == 1) {
            int v1_4 = ((com.google.android.gms.internal.location.zzl) com.google.android.gms.internal.location.zzc.zza(p2, com.google.android.gms.internal.location.zzl.CREATOR));
            com.google.android.gms.internal.location.zzc.zzd(p2);
            this.zzd(v1_4);
        } else {
            if (p1 == 2) {
                this.zze();
            } else {
                return 0;
            }
        }
        return 1;
    }
}
