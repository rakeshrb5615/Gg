package com.google.android.gms.internal.fido;
final class zzca {

    public static boolean zza(java.util.Comparator p1, Iterable p2)
    {
        java.util.Comparator v2_1;
        p1.getClass();
        p2.getClass();
        if (!(p2 instanceof java.util.SortedSet)) {
            if (!(p2 instanceof com.google.android.gms.internal.fido.zzbz)) {
                return 0;
            } else {
                v2_1 = ((com.google.android.gms.internal.fido.zzbz) p2).comparator();
            }
        } else {
            v2_1 = ((java.util.SortedSet) p2).comparator();
            if (v2_1 == null) {
                v2_1 = com.google.android.gms.internal.fido.zzbp.zza;
            }
        }
        return p1.equals(v2_1);
    }
}
