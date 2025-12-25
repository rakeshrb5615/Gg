package com.google.android.gms.internal.auth-api-phone;
public final class zzc {
    private static final ClassLoader zza;

    static zzc()
    {
        com.google.android.gms.internal.auth-api-phone.zzc.zza = com.google.android.gms.internal.auth-api-phone.zzc.getClassLoader();
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

    public static void zzc(android.os.Parcel p0, android.os.IInterface p1)
    {
        p0.writeStrongBinder(p1.asBinder());
        return;
    }
}
