package com.google.android.gms.internal.firebase-auth-api;
public final class zzav {

    public static int zza(java.util.Set p3)
    {
        java.util.Iterator v3_1 = p3.iterator();
        int v1_2 = 0;
        while (v3_1.hasNext()) {
            int v2_0;
            int v2_2 = v3_1.next();
            if (v2_2 == 0) {
                v2_0 = 0;
            } else {
                v2_0 = v2_2.hashCode();
            }
            v1_2 = (~ (~ (v1_2 + v2_0)));
        }
        return v1_2;
    }

    public static boolean zza(java.util.Set p4, Object p5)
    {
        if (p4 != p5) {
            try {
                if ((!(p5 instanceof java.util.Set)) || ((p4.size() != ((java.util.Set) p5).size()) || (!p4.containsAll(((java.util.Set) p5))))) {
                    return 0;
                } else {
                    return 1;
                }
            } catch (ClassCastException) {
                return 0;
            }
        } else {
            return 1;
        }
    }
}
