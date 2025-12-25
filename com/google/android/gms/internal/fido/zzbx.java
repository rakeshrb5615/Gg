package com.google.android.gms.internal.fido;
public final class zzbx {

    public static int zza(java.util.Set p3)
    {
        java.util.Iterator v3_1 = p3.iterator();
        int v1 = 0;
        while (v3_1.hasNext()) {
            int v2_0;
            int v2_2 = v3_1.next();
            if (v2_2 == 0) {
                v2_0 = 0;
            } else {
                v2_0 = v2_2.hashCode();
            }
            v1 += v2_0;
        }
        return v1;
    }
}
