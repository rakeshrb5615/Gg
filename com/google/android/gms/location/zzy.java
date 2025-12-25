package com.google.android.gms.location;
public abstract class zzy extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzz {

    public zzy()
    {
        super("com.google.android.gms.location.ILocationListener");
        return;
    }

    public static com.google.android.gms.location.zzz zzb(android.os.IBinder p2)
    {
        com.google.android.gms.location.zzx v0_1 = p2.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (!(v0_1 instanceof com.google.android.gms.location.zzz)) {
            return new com.google.android.gms.location.zzx(p2);
        } else {
            return ((com.google.android.gms.location.zzz) v0_1);
        }
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 == 1) {
            int v1_4 = ((android.location.Location) com.google.android.gms.internal.location.zzc.zza(p2, android.location.Location.CREATOR));
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
