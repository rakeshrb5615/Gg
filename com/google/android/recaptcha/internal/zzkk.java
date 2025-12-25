package com.google.android.recaptcha.internal;
public final class zzkk {

    public static long zza(long p13, long p15)
    {
        int v0_2;
        int v1 = 0;
        if ((p13 ^ p15) >= 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        long v5 = (p13 + p15);
        if ((p13 ^ v5) >= 0) {
            v1 = 1;
        }
        com.google.android.recaptcha.internal.zzkl.zza((v0_2 | v1), "checkedAdd", p13, p15);
        return v5;
    }

    public static long zzb(long p11, long p13)
    {
        int v13_3;
        int v14 = 0;
        if ((1 ^ p11) < 0) {
            v13_3 = 0;
        } else {
            v13_3 = 1;
        }
        long v3_0 = (-1 + p11);
        if ((p11 ^ v3_0) >= 0) {
            v14 = 1;
        }
        com.google.android.recaptcha.internal.zzkl.zza((v13_3 | v14), "checkedSubtract", p11, 1);
        return v3_0;
    }
}
