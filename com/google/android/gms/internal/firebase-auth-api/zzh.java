package com.google.android.gms.internal.firebase-auth-api;
final class zzh extends com.google.android.gms.internal.firebase-auth-api.zzi {
    private final char zza;

    public zzh(char p1)
    {
        this.zza = p1;
        return;
    }

    public final String toString()
    {
        String v0_0 = this.zza;
        String v1_1 = new char[6];
        int v3 = 0;
        v1_1[0] = 92;
        v1_1[1] = 117;
        v1_1[2] = 0;
        v1_1[3] = 0;
        v1_1[4] = 0;
        v1_1[5] = 0;
        while (v3 < 4) {
            v1_1[(5 - v3)] = "0123456789ABCDEF".charAt((v0_0 & 15));
            v0_0 = ((char) (v0_0 >> 4));
            v3++;
        }
        return v1.a.l("CharMatcher.is(\'", String.copyValueOf(v1_1), "\')");
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
