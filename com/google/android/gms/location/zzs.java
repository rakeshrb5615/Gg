package com.google.android.gms.location;
public abstract class zzs extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.location.zzt {

    public zzs()
    {
        super("com.google.android.gms.location.IDeviceOrientationListener");
        return;
    }

    public static com.google.android.gms.location.zzt zzb(android.os.IBinder p2)
    {
        com.google.android.gms.location.zzr v0_1 = p2.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (!(v0_1 instanceof com.google.android.gms.location.zzt)) {
            return new com.google.android.gms.location.zzr(p2);
        } else {
            return ((com.google.android.gms.location.zzt) v0_1);
        }
    }

    public final boolean zza(int p1, android.os.Parcel p2, android.os.Parcel p3, int p4)
    {
        if (p1 != 1) {
            return 0;
        } else {
            int v1_4 = ((com.google.android.gms.location.DeviceOrientation) com.google.android.gms.internal.location.zzc.zza(p2, com.google.android.gms.location.DeviceOrientation.CREATOR));
            com.google.android.gms.internal.location.zzc.zzd(p2);
            this.zzd(v1_4);
            return 1;
        }
    }
}
