package com.google.android.gms.internal.ads_identifier;
public final class zzc {
    private static final ClassLoader zza;

    static zzc()
    {
        com.google.android.gms.internal.ads_identifier.zzc.zza = com.google.android.gms.internal.ads_identifier.zzc.getClassLoader();
        return;
    }

    private zzc()
    {
        return;
    }

    public static void zza(android.os.Parcel p0, boolean p1)
    {
        p0.writeInt(1);
        return;
    }

    public static boolean zzb(android.os.Parcel p0)
    {
        if (p0.readInt() == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
