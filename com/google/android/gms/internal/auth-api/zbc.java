package com.google.android.gms.internal.auth-api;
public final class zbc {
    private static final ClassLoader zba;

    static zbc()
    {
        com.google.android.gms.internal.auth-api.zbc.zba = com.google.android.gms.internal.auth-api.zbc.getClassLoader();
        return;
    }

    private zbc()
    {
        return;
    }

    public static android.os.Parcelable zba(android.os.Parcel p1, android.os.Parcelable$Creator p2)
    {
        if (p1.readInt() != 0) {
            return ((android.os.Parcelable) p2.createFromParcel(p1));
        } else {
            return 0;
        }
    }

    public static void zbb(android.os.Parcel p2)
    {
        String v2_1 = p2.dataAvail();
        if (v2_1 > null) {
            throw new android.os.BadParcelableException(g2.g.c(v2_1, "Parcel data not fully consumed, unread size: "));
        } else {
            return;
        }
    }

    public static void zbc(android.os.Parcel p2, android.os.Parcelable p3)
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

    public static void zbd(android.os.Parcel p0, android.os.IInterface p1)
    {
        p0.writeStrongBinder(p1.asBinder());
        return;
    }
}
