package com.google.android.gms.internal.common;
public final class zzai {

    public static Object[] zza(Object[] p2, int p3)
    {
        int v0 = 0;
        while (v0 < p3) {
            if (p2[v0] == null) {
                throw new NullPointerException(v1.a.m(new StringBuilder((String.valueOf(v0).length() + 9)), "at index ", v0));
            } else {
                v0++;
            }
        }
        return p2;
    }
}
