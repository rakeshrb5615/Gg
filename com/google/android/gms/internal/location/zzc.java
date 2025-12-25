package com.google.android.gms.internal.location;
public final class zzc {
    public static final synthetic int zza;
    private static final ClassLoader zzb;

    static zzc()
    {
        com.google.android.gms.internal.location.zzc.zzb = com.google.android.gms.internal.location.zzc.getClassLoader();
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

    public static void zzb(android.os.Parcel p2, android.os.Parcelable p3)
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

    public static void zzc(android.os.Parcel p0, android.os.IInterface p1)
    {
        p0.writeStrongBinder(p1.asBinder());
        return;
    }

    public static void zzd(android.os.Parcel p3)
    {
        String v3_1 = p3.dataAvail();
        if (v3_1 > null) {
            throw new android.os.BadParcelableException(v1.a.m(new StringBuilder((String.valueOf(v3_1).length() + 45)), "Parcel data not fully consumed, unread size: ", v3_1));
        } else {
            return;
        }
    }
}
