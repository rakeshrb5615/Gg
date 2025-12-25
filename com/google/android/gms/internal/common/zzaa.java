package com.google.android.gms.internal.common;
 class zzaa extends com.google.android.gms.internal.common.zzab {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzaa(int p1)
    {
        int v1_1 = new Object[4];
        this.zza = v1_1;
        this.zzb = 0;
        return;
    }

    public final com.google.android.gms.internal.common.zzaa zza(Object p5)
    {
        p5.getClass();
        Object[] v0_1 = this.zza.length;
        int v1_1 = this.zzb;
        int v2_1 = (v1_1 + 1);
        if (v2_1 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        } else {
            int v3_2;
            if (v2_1 > v0_1) {
                v3_2 = (((v0_1 >> 1) + v0_1) + 1);
                if (v3_2 < v2_1) {
                    v3_2 = (Integer.highestOneBit(v1_1) + Integer.highestOneBit(v1_1));
                }
                if (v3_2 < 0) {
                    v3_2 = 2147483647;
                }
            } else {
                v3_2 = v0_1;
            }
            if ((v3_2 > v0_1) || (this.zzc)) {
                this.zza = java.util.Arrays.copyOf(this.zza, v3_2);
                this.zzc = 0;
            }
            Object[] v0_6 = this.zza;
            int v1_2 = this.zzb;
            this.zzb = (v1_2 + 1);
            v0_6[v1_2] = p5;
            return this;
        }
    }
}
