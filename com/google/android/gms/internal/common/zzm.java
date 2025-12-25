package com.google.android.gms.internal.common;
final class zzm extends com.google.android.gms.internal.common.zzl {
    private final char zza;

    public zzm(char p1)
    {
        this.zza = p1;
        return;
    }

    public final String toString()
    {
        String v0_1 = new char[6];
        StringBuilder v2_2 = 0;
        v0_1[0] = 92;
        v0_1[1] = 117;
        v0_1[2] = 0;
        v0_1[3] = 0;
        v0_1[4] = 0;
        v0_1[5] = 0;
        String v3_1 = this.zza;
        while (v2_2 < 4) {
            v0_1[(5 - v2_2)] = "0123456789ABCDEF".charAt((v3_1 & 15));
            v3_1 >>= 4;
            v2_2++;
        }
        String v0_2 = String.copyValueOf(v0_1);
        return v1.a.o(new StringBuilder((String.valueOf(v0_2).length() + 18)), "CharMatcher.is(\'", v0_2, "\')");
    }

    public final boolean zza(char p2)
    {
        if (p2 != this.zza) {
            return 0;
        } else {
            return 1;
        }
    }
}
