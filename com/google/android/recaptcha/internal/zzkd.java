package com.google.android.recaptcha.internal;
final class zzkd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    public zzkd(String p10, char[] p11)
    {
        byte[] v1 = new byte[128];
        java.util.Arrays.fill(v1, -1);
        int v4 = 0;
        while (v4 < p11.length) {
            String v7_0;
            char v5_0 = p11[v4];
            byte v6_0 = 1;
            if (v5_0 >= 128) {
                v7_0 = 0;
            } else {
                v7_0 = 1;
            }
            com.google.android.recaptcha.internal.zzjf.zzc(v7_0, "Non-ASCII character: %s", v5_0);
            if (v1[v5_0] != -1) {
                v6_0 = 0;
            }
            com.google.android.recaptcha.internal.zzjf.zzc(v6_0, "Duplicate character: %s", v5_0);
            v1[v5_0] = ((byte) v4);
            v4++;
        }
        this(p10, p11, v1, 0);
        return;
    }

    private zzkd(String p4, char[] p5, byte[] p6, boolean p7)
    {
        this.zze = p4;
        p5.getClass();
        this.zzf = p5;
        try {
            ArithmeticException v4_4 = p5.length;
            int v7_5 = com.google.android.recaptcha.internal.zzkj.zzb(v4_4, java.math.RoundingMode.UNNECESSARY);
            this.zzb = v7_5;
            String v5_1 = Integer.numberOfTrailingZeros(v7_5);
            int v0_1 = (1 << (3 - v5_1));
            this.zzc = v0_1;
            this.zzd = (v7_5 >> v5_1);
            this.zza = (v4_4 - 1);
            this.zzg = p6;
            ArithmeticException v4_2 = new boolean[v0_1];
            int v6_1 = 0;
        } catch (ArithmeticException v4_3) {
            throw new IllegalArgumentException(g2.g.c(0.length, "Illegal alphabet length "), v4_3);
        }
        while (v6_1 < this.zzd) {
            v4_2[com.google.android.recaptcha.internal.zzkj.zza((v6_1 * 8), this.zzb, java.math.RoundingMode.CEILING)] = 1;
            v6_1++;
        }
        this.zzh = v4_2;
        this.zzi = 0;
        return;
    }

    public static bridge synthetic char[] zze(com.google.android.recaptcha.internal.zzkd p0)
    {
        return p0.zzf;
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof com.google.android.recaptcha.internal.zzkd)) || (!java.util.Arrays.equals(this.zzf, ((com.google.android.recaptcha.internal.zzkd) p3).zzf))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return (java.util.Arrays.hashCode(this.zzf) + 1237);
    }

    public final String toString()
    {
        return this.zze;
    }

    public final char zza(int p2)
    {
        return this.zzf[p2];
    }

    public final int zzb(char p5)
    {
        if (p5 > 127) {
            throw new com.google.android.recaptcha.internal.zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(p5))));
        } else {
            String v2_1 = this.zzg[p5];
            if (v2_1 != -1) {
                return v2_1;
            } else {
                if ((p5 > 32) && (p5 != 127)) {
                    StringBuilder v1_3 = new StringBuilder("Unrecognized character: ");
                    v1_3.append(p5);
                    throw new com.google.android.recaptcha.internal.zzkf(v1_3.toString());
                } else {
                    throw new com.google.android.recaptcha.internal.zzkf("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(p5))));
                }
            }
        }
    }

    public final boolean zzc(int p3)
    {
        return this.zzh[(p3 % this.zzc)];
    }

    public final boolean zzd(char p2)
    {
        if (this.zzg[61] == -1) {
            return 0;
        } else {
            return 1;
        }
    }
}
