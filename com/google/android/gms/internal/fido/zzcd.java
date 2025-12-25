package com.google.android.gms.internal.fido;
final class zzcd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    public zzcd(String p10, char[] p11)
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
            com.google.android.gms.internal.fido.zzap.zzd(v7_0, "Non-ASCII character: %s", v5_0);
            if (v1[v5_0] != -1) {
                v6_0 = 0;
            }
            com.google.android.gms.internal.fido.zzap.zzd(v6_0, "Duplicate character: %s", v5_0);
            v1[v5_0] = ((byte) v4);
            v4++;
        }
        this(p10, p11, v1, 0);
        return;
    }

    private zzcd(String p4, char[] p5, byte[] p6, boolean p7)
    {
        this.zze = p4;
        p5.getClass();
        this.zzf = p5;
        try {
            ArithmeticException v4_4 = p5.length;
            int v0_2 = com.google.android.gms.internal.fido.zzcj.zzb(v4_4, java.math.RoundingMode.UNNECESSARY);
            this.zzb = v0_2;
            int v5_1 = Integer.numberOfTrailingZeros(v0_2);
            java.math.RoundingMode v1_1 = (1 << (3 - v5_1));
            this.zzc = v1_1;
            this.zzd = (v0_2 >> v5_1);
            this.zza = (v4_4 - 1);
            this.zzg = p6;
            ArithmeticException v4_2 = new boolean[v1_1];
            int v5_3 = 0;
        } catch (ArithmeticException v4_3) {
            throw new IllegalArgumentException(g2.g.c(0.length, "Illegal alphabet length "), v4_3);
        }
        while (v5_3 < this.zzd) {
            v4_2[com.google.android.gms.internal.fido.zzcj.zza((v5_3 * 8), this.zzb, java.math.RoundingMode.CEILING)] = 1;
            v5_3++;
        }
        this.zzh = p7;
        return;
    }

    public static bridge synthetic char[] zzd(com.google.android.gms.internal.fido.zzcd p0)
    {
        return p0.zzf;
    }

    public final boolean equals(Object p4)
    {
        if ((!(p4 instanceof com.google.android.gms.internal.fido.zzcd)) || ((this.zzh != ((com.google.android.gms.internal.fido.zzcd) p4).zzh) || (!java.util.Arrays.equals(this.zzf, ((com.google.android.gms.internal.fido.zzcd) p4).zzf)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1_1;
        int vtmp1 = java.util.Arrays.hashCode(this.zzf);
        if (1 == this.zzh) {
            v1_1 = 1231;
        } else {
            v1_1 = 1237;
        }
        return (vtmp1 + v1_1);
    }

    public final String toString()
    {
        return this.zze;
    }

    public final char zza(int p2)
    {
        return this.zzf[p2];
    }

    public final com.google.android.gms.internal.fido.zzcd zzb()
    {
        IllegalStateException v0_0 = this.zzf;
        String v2_0 = 0;
        String v3_0 = 0;
        while (v3_0 < v0_0.length) {
            if (!com.google.android.gms.internal.fido.zzad.zza(v0_0[v3_0])) {
                v3_0++;
            } else {
                IllegalStateException v0_1 = this.zzf;
                String v3_1 = 0;
                while(true) {
                    IllegalStateException v0_2;
                    int v5 = 65;
                    if (v3_1 >= v0_1.length) {
                        v0_2 = 0;
                    } else {
                        byte v7_0 = v0_1[v3_1];
                        if ((v7_0 >= 65) && (v7_0 <= 90)) {
                            break;
                        }
                        v3_1++;
                    }
                    if (v0_2 != null) {
                        throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                    } else {
                        IllegalStateException v0_7 = new char[this.zzf.length];
                        while(true) {
                            String v1_3 = this.zzf;
                            if (v2_0 >= v1_3.length) {
                                break;
                            }
                            String v1_10 = v1_3[v2_0];
                            if (com.google.android.gms.internal.fido.zzad.zza(v1_10)) {
                                v1_10 ^= 32;
                            }
                            v0_7[v2_0] = ((char) v1_10);
                            v2_0++;
                        }
                        String v1_5 = new com.google.android.gms.internal.fido.zzcd(this.zze.concat(".upperCase()"), v0_7);
                        if ((this.zzh) && (!v1_5.zzh)) {
                            IllegalStateException v0_10 = v1_5.zzg;
                            IllegalStateException v0_11 = java.util.Arrays.copyOf(v0_10, v0_10.length);
                            while (v5 <= 90) {
                                String v2_6 = (v5 | 32);
                                String v3_6 = v1_5.zzg;
                                byte v7_1 = v3_6[v5];
                                String v3_7 = v3_6[v2_6];
                                if (v7_1 != -1) {
                                    if (v3_7 != -1) {
                                        throw new IllegalStateException(com.google.android.gms.internal.fido.zzaq.zza("Can\'t ignoreCase() since \'%s\' and \'%s\' encode different values", new Object[] {Character.valueOf(((char) v5)), Character.valueOf(((char) v2_6))})));
                                    } else {
                                        v0_11[v2_6] = v7_1;
                                    }
                                } else {
                                    v0_11[v5] = v3_7;
                                }
                                v5++;
                            }
                            return new com.google.android.gms.internal.fido.zzcd(v1_5.zze.concat(".ignoreCase()"), v1_5.zzf, v0_11, 1);
                        } else {
                            return v1_5;
                        }
                    }
                }
                v0_2 = 1;
            }
        }
        return this;
    }

    public final boolean zzc(char p3)
    {
        int v3_0 = this.zzg;
        if ((v3_0.length <= 61) || (v3_0[61] == -1)) {
            return 0;
        } else {
            return 1;
        }
    }
}
