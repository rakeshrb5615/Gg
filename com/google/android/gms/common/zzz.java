package com.google.android.gms.common;
final class zzz {

    public static int zza(int p5)
    {
        int[] v1 = new int[6];
        v1 = {1, 2, 3, 4, 5, 6};
        int v2 = 0;
        while (v2 < 6) {
            int v3 = v1[v2];
            if (v3 == 0) {
                throw 0;
            } else {
                if ((v3 - 1) != p5) {
                    v2++;
                } else {
                    return v3;
                }
            }
        }
        return 1;
    }
}
