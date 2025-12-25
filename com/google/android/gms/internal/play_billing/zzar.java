package com.google.android.gms.internal.play_billing;
public final class zzar {
    public static final synthetic int zza;

    static zzar()
    {
        com.google.android.gms.internal.play_billing.zzar.getClassLoader();
        return;
    }

    private zzar()
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

    public static void zzc(android.os.Parcel p1, android.os.Parcelable p2)
    {
        p1.writeInt(1);
        p2.writeToParcel(p1, 0);
        return;
    }
}
