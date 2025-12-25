package com.google.android.gms.location;
public final class zzan {

    public static int zza(int p3)
    {
        int v1 = 1;
        if ((p3 != 100) && ((p3 != 102) && (p3 != 104))) {
            if (p3 != 105) {
                v1 = 0;
            } else {
                p3 = 105;
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1, "priority %d must be a Priority.PRIORITY_* constant", new Object[] {Integer.valueOf(p3)}));
        return p3;
    }

    public static String zzb(int p1)
    {
        if (p1 == 100) {
            return "HIGH_ACCURACY";
        } else {
            if (p1 == 102) {
                return "BALANCED_POWER_ACCURACY";
            } else {
                if (p1 == 104) {
                    return "LOW_POWER";
                } else {
                    if (p1 != 105) {
                        throw new IllegalArgumentException();
                    } else {
                        return "PASSIVE";
                    }
                }
            }
        }
    }
}
