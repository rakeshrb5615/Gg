package com.google.android.gms.internal.firebase-auth-api;
public class zzai {

    public zzai()
    {
        return;
    }

    public static int zza(int p1, int p2)
    {
        if (p2 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        } else {
            if (p2 > p1) {
                int v1_3 = ((p1 + (p1 >> 1)) + 1);
                if (v1_3 < p2) {
                    v1_3 = (Integer.highestOneBit((p2 - 1)) << 1);
                }
                if (v1_3 < 0) {
                    v1_3 = 2147483647;
                }
                return v1_3;
            } else {
                return p1;
            }
        }
    }
}
