package com.google.android.gms.internal.fido;
public final class zzc {
    public static final synthetic int zza;
    private static final ClassLoader zzb;

    static zzc()
    {
        com.google.android.gms.internal.fido.zzc.zzb = com.google.android.gms.internal.fido.zzc.getClassLoader();
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

    public static java.util.ArrayList zzb(android.os.Parcel p1)
    {
        return p1.readArrayList(com.google.android.gms.internal.fido.zzc.zzb);
    }

    public static void zzc(android.os.Parcel p2)
    {
        String v2_1 = p2.dataAvail();
        if (v2_1 > null) {
            throw new android.os.BadParcelableException(g2.g.c(v2_1, "Parcel data not fully consumed, unread size: "));
        } else {
            return;
        }
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
}
