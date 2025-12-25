package com.google.android.gms.internal.auth;
public final class zzc {
    private static final ClassLoader zza;

    static zzc()
    {
        com.google.android.gms.internal.auth.zzc.zza = com.google.android.gms.internal.auth.zzc.getClassLoader();
        return;
    }

    private zzc()
    {
        return;
    }

    public static android.os.Parcelable zza(android.os.Parcel p1, android.os.Parcelable$Creator p2)
    {
        if (p1.readInt() != 0) {
            return ((android.os.Parcelable) p2.createFromParcel(p1));
        } else {
            return 0;
        }
    }

    public static void zzb(android.os.Parcel p2)
    {
        String v2_1 = p2.dataAvail();
        if (v2_1 > null) {
            throw new android.os.BadParcelableException(g2.g.c(v2_1, "Parcel data not fully consumed, unread size: "));
        } else {
            return;
        }
    }

    public static void zzc(android.os.Parcel p0, boolean p1)
    {
        p0.writeInt(p1);
        return;
    }

    public static void zzd(android.os.Parcel p2, android.os.Parcelable p3)
    {
        if (p3 != null) {
            p2.writeInt(1);
            p3.writeToParcel(p2, 0);
            return;
        } else {
            p2.writeInt(0);
            return;
        }
    }

    public static void zze(android.os.Parcel p0, android.os.IInterface p1)
    {
        if (p1 != null) {
            p0.writeStrongBinder(p1.asBinder());
            return;
        } else {
            p0.writeStrongBinder(0);
            return;
        }
    }

    public static boolean zzf(android.os.Parcel p0)
    {
        if (p0.readInt() == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
