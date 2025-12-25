package com.google.android.gms.internal.fido;
public final class zzbq {

    public static Object zza(Object p1, int p2)
    {
        if (p1 == null) {
            throw new NullPointerException(g2.g.c(p2, "at index "));
        } else {
            return p1;
        }
    }

    public static Object[] zzb(Object[] p2, int p3)
    {
        int v0 = 0;
        while (v0 < p3) {
            com.google.android.gms.internal.fido.zzbq.zza(p2[v0], v0);
            v0++;
        }
        return p2;
    }
}
