package com.google.android.gms.internal.play_billing;
public final class zzbv {
    Object[] zza;
    int zzb;
    com.google.android.gms.internal.play_billing.zzbu zzc;

    public zzbv()
    {
        int v0_1 = new Object[8];
        this.zza = v0_1;
        this.zzb = 0;
        return;
    }

    public final com.google.android.gms.internal.play_billing.zzbv zza(Object p5, Object p6)
    {
        int v1_0 = this.zza;
        int v2_0 = v1_0.length;
        int v0_7 = ((this.zzb + 1) + (this.zzb + 1));
        if (v0_7 > v2_0) {
            if (v0_7 > v2_0) {
                v2_0 = ((v2_0 + (v2_0 >> 1)) + 1);
                if (v2_0 < v0_7) {
                    v2_0 = (Integer.highestOneBit((v0_7 - 1)) + Integer.highestOneBit((v0_7 - 1)));
                }
                if (v2_0 < 0) {
                    v2_0 = 2147483647;
                }
            }
            this.zza = java.util.Arrays.copyOf(v1_0, v2_0);
        }
        com.google.android.gms.internal.play_billing.zzbo.zza(p5, p6);
        int v0_6 = this.zza;
        int v1_1 = this.zzb;
        int v2_1 = (v1_1 + v1_1);
        v0_6[v2_1] = p5;
        v0_6[(v2_1 + 1)] = p6;
        this.zzb = (v1_1 + 1);
        return this;
    }

    public final com.google.android.gms.internal.play_billing.zzbw zzb()
    {
        IllegalArgumentException v0_0 = this.zzc;
        if (v0_0 != null) {
            throw v0_0.zza();
        } else {
            com.google.android.gms.internal.play_billing.zzcf vtmp1 = com.google.android.gms.internal.play_billing.zzcf.zzg(this.zzb, this.zza, this);
            com.google.android.gms.internal.play_billing.zzbu v1_1 = this.zzc;
            if (v1_1 != null) {
                throw v1_1.zza();
            } else {
                return vtmp1;
            }
        }
    }
}
