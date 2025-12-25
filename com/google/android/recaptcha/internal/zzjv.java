package com.google.android.recaptcha.internal;
public abstract class zzjv {
    private static final char[] zza;
    public static final synthetic int zzb;

    static zzjv()
    {
        com.google.android.recaptcha.internal.zzjv.zza = "0123456789abcdef".toCharArray();
        return;
    }

    public zzjv()
    {
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((!(p4 instanceof com.google.android.recaptcha.internal.zzjv)) || ((this.zzb() != ((com.google.android.recaptcha.internal.zzjv) p4).zzb()) || (!this.zzc(((com.google.android.recaptcha.internal.zzjv) p4))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        if (this.zzb() < 32) {
            byte[] v0_2 = this.zze();
            int v1_0 = (v0_2[0] & 255);
            int v2 = 1;
            while (v2 < v0_2.length) {
                v1_0 |= ((v0_2[v2] & 255) << (v2 * 8));
                v2++;
            }
            return v1_0;
        } else {
            return this.zza();
        }
    }

    public final String toString()
    {
        String v0_0 = this.zze();
        int v1 = v0_0.length;
        StringBuilder v2_1 = new StringBuilder((v1 + v1));
        int v3_0 = 0;
        while (v3_0 < v1) {
            char v4_0 = v0_0[v3_0];
            char[] v6 = com.google.android.recaptcha.internal.zzjv.zza;
            v2_1.append(v6[((v4_0 >> 4) & 15)]);
            v2_1.append(v6[(v4_0 & 15)]);
            v3_0++;
        }
        return v2_1.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc();

    public abstract byte[] zzd();

    public byte[] zze()
    {
        throw 0;
    }
}
