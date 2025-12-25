package com.google.android.gms.internal.auth;
public final class zzgz {
    private static final com.google.android.gms.internal.auth.zzgz zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    static zzgz()
    {
        int[] v2 = new int[0];
        Object[] v3 = new Object[0];
        com.google.android.gms.internal.auth.zzgz.zza = new com.google.android.gms.internal.auth.zzgz(0, v2, v3, 0);
        return;
    }

    private zzgz()
    {
        int[] v1 = new int[8];
        Object[] v0_1 = new Object[8];
        this(0, v1, v0_1, 1);
        return;
    }

    private zzgz(int p1, int[] p2, Object[] p3, boolean p4)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        this.zze = p4;
        return;
    }

    public static com.google.android.gms.internal.auth.zzgz zza()
    {
        return com.google.android.gms.internal.auth.zzgz.zza;
    }

    public static com.google.android.gms.internal.auth.zzgz zzb(com.google.android.gms.internal.auth.zzgz p6, com.google.android.gms.internal.auth.zzgz p7)
    {
        int v0_1 = (p6.zzb + p7.zzb);
        int[] v1_2 = java.util.Arrays.copyOf(p6.zzc, v0_1);
        System.arraycopy(p7.zzc, 0, v1_2, p6.zzb, p7.zzb);
        Object[] v2_1 = java.util.Arrays.copyOf(p6.zzd, v0_1);
        System.arraycopy(p7.zzd, 0, v2_1, p6.zzb, p7.zzb);
        return new com.google.android.gms.internal.auth.zzgz(v0_1, v1_2, v2_1, 1);
    }

    public static com.google.android.gms.internal.auth.zzgz zzc()
    {
        int[] v2 = new int[8];
        Object[] v1_1 = new Object[8];
        return new com.google.android.gms.internal.auth.zzgz(0, v2, v1_1, 1);
    }

    public final boolean equals(Object p9)
    {
        if (this != p9) {
            if (p9 != null) {
                if ((p9 instanceof com.google.android.gms.internal.auth.zzgz)) {
                    Object[] v2_2 = this.zzb;
                    if (v2_2 == ((com.google.android.gms.internal.auth.zzgz) p9).zzb) {
                        boolean v5_0 = 0;
                        while (v5_0 < v2_2) {
                            if (this.zzc[v5_0] == ((com.google.android.gms.internal.auth.zzgz) p9).zzc[v5_0]) {
                                v5_0++;
                            }
                        }
                        int v4_1 = 0;
                        while (v4_1 < this.zzb) {
                            if (this.zzd[v4_1].equals(((com.google.android.gms.internal.auth.zzgz) p9).zzd[v4_1])) {
                                v4_1++;
                            }
                        }
                        return 1;
                    }
                    return 0;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        Object[] v0_0 = this.zzb;
        int v3_1 = 17;
        int v4 = 0;
        int v6_1 = 17;
        int v5_2 = 0;
        while (v5_2 < v0_0) {
            v6_1 = ((v6_1 * 31) + this.zzc[v5_2]);
            v5_2++;
        }
        int v1_1 = ((((v0_0 + 527) * 31) + v6_1) * 31);
        int v2_0 = this.zzb;
        while (v4 < v2_0) {
            v3_1 = ((v3_1 * 31) + this.zzd[v4].hashCode());
            v4++;
        }
        return (v1_1 + v3_1);
    }

    public final void zzd()
    {
        this.zze = 0;
        return;
    }

    public final void zze(StringBuilder p4, int p5)
    {
        int v0 = 0;
        while (v0 < this.zzb) {
            com.google.android.gms.internal.auth.zzfy.zzb(p4, p5, String.valueOf((this.zzc[v0] >> 3)), this.zzd[v0]);
            v0++;
        }
        return;
    }

    public final void zzf(int p4, Object p5)
    {
        if (!this.zze) {
            throw new UnsupportedOperationException();
        } else {
            Object[] v0_4 = this.zzb;
            Object[] v1_4 = this.zzc;
            if (v0_4 == v1_4.length) {
                int v2_0;
                if (v0_4 >= 4) {
                    v2_0 = (v0_4 >> 1);
                } else {
                    v2_0 = 8;
                }
                Object[] v0_1 = (v0_4 + v2_0);
                this.zzc = java.util.Arrays.copyOf(v1_4, v0_1);
                this.zzd = java.util.Arrays.copyOf(this.zzd, v0_1);
            }
            Object[] v1_2 = this.zzb;
            this.zzc[v1_2] = p4;
            this.zzd[v1_2] = p5;
            this.zzb = (v1_2 + 1);
            return;
        }
    }
}
