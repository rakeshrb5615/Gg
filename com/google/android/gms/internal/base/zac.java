package com.google.android.gms.internal.base;
public final class zac {
    private static final ClassLoader zaa;

    static zac()
    {
        com.google.android.gms.internal.base.zac.zaa = com.google.android.gms.internal.base.zac.getClassLoader();
        return;
    }

    private zac()
    {
        return;
    }

    public static android.os.Parcelable zaa(android.os.Parcel p1, android.os.Parcelable$Creator p2)
    {
        if (p1.readInt() != 0) {
            return ((android.os.Parcelable) p2.createFromParcel(p1));
        } else {
            return 0;
        }
    }

    public static void zab(android.os.Parcel p2)
    {
        String v2_1 = p2.dataAvail();
        if (v2_1 > null) {
            throw new android.os.BadParcelableException(g2.g.c(v2_1, "Parcel data not fully consumed, unread size: "));
        } else {
            return;
        }
    }

    public static void zac(android.os.Parcel p2, android.os.Parcelable p3)
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

    public static void zad(android.os.Parcel p0, android.os.IInterface p1)
    {
        if (p1 != null) {
            p0.writeStrongBinder(p1.asBinder());
            return;
        } else {
            p0.writeStrongBinder(0);
            return;
        }
    }
}
