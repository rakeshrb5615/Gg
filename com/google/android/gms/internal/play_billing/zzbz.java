package com.google.android.gms.internal.play_billing;
public final class zzbz {

    public static Object[] zza(Object[] p2, int p3)
    {
        int v0 = 0;
        while (v0 < p3) {
            if (p2[v0] == null) {
                throw new NullPointerException(g2.g.c(v0, "at index "));
            } else {
                v0++;
            }
        }
        return p2;
    }
}
