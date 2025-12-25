package com.google.android.gms.location;
public final class zzar {

    public static int zza(int p3)
    {
        int v0 = 1;
        if ((p3 != 0) && (p3 != 1)) {
            if (p3 != 2) {
                v0 = 0;
            } else {
                p3 = 2;
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", new Object[] {Integer.valueOf(p3)}));
        return p3;
    }

    public static String zzb(int p1)
    {
        if (p1 == null) {
            return "THROTTLE_BACKGROUND";
        } else {
            if (p1 == 1) {
                return "THROTTLE_ALWAYS";
            } else {
                if (p1 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    return "THROTTLE_NEVER";
                }
            }
        }
    }
}
