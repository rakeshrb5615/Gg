package com.google.android.gms.common.data;
public final class FreezableUtils {

    public FreezableUtils()
    {
        return;
    }

    public static java.util.ArrayList freeze(java.util.ArrayList p4)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(p4.size());
        int v1_1 = p4.size();
        int v2 = 0;
        while (v2 < v1_1) {
            v0_1.add(((com.google.android.gms.common.data.Freezable) p4.get(v2)).freeze());
            v2++;
        }
        return v0_1;
    }

    public static java.util.ArrayList freeze(com.google.android.gms.common.data.Freezable[] p3)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(p3.length);
        int v1_1 = 0;
        while (v1_1 < p3.length) {
            v0_1.add(p3[v1_1].freeze());
            v1_1++;
        }
        return v0_1;
    }

    public static java.util.ArrayList freezeIterable(Iterable p2)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        java.util.Iterator v2_1 = p2.iterator();
        while (v2_1.hasNext()) {
            v0_1.add(((com.google.android.gms.common.data.Freezable) v2_1.next()).freeze());
        }
        return v0_1;
    }
}
