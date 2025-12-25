package com.google.android.gms.location;
public abstract class zzv extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzw {

    public zzv()
    {
        super("com.google.android.gms.location.ILocationCallback");
        return;
    }

    public static com.google.android.gms.location.zzw zzb(android.os.IBinder p2)
    {
        com.google.android.gms.location.zzu v0_1 = p2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (!(v0_1 instanceof com.google.android.gms.location.zzw)) {
            return new com.google.android.gms.location.zzu(p2);
        } else {
            return ((com.google.android.gms.location.zzw) v0_1);
        }
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 == 1) {
            int v1_7 = ((com.google.android.gms.location.LocationResult) com.google.android.gms.internal.location.zzc.zza(p2, com.google.android.gms.location.LocationResult.CREATOR));
            com.google.android.gms.internal.location.zzc.zzd(p2);
            this.zzd(v1_7);
        } else {
            if (p1 == 2) {
                int v1_3 = ((com.google.android.gms.location.LocationAvailability) com.google.android.gms.internal.location.zzc.zza(p2, com.google.android.gms.location.LocationAvailability.CREATOR));
                com.google.android.gms.internal.location.zzc.zzd(p2);
                this.zze(v1_3);
            } else {
                if (p1 == 3) {
                    this.zzf();
                } else {
                    return 0;
                }
            }
        }
        return 1;
    }
}
