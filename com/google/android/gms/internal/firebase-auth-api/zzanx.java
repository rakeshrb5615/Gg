package com.google.android.gms.internal.firebase-auth-api;
public final class zzanx {
    private static final com.google.android.gms.internal.firebase-auth-api.zzanx zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    static zzanx()
    {
        int[] v2 = new int[0];
        Object[] v3 = new Object[0];
        com.google.android.gms.internal.firebase-auth-api.zzanx.zza = new com.google.android.gms.internal.firebase-auth-api.zzanx(0, v2, v3, 0);
        return;
    }

    private zzanx()
    {
        int[] v1 = new int[8];
        Object[] v0_1 = new Object[8];
        this(0, v1, v0_1, 1);
        return;
    }

    private zzanx(int p2, int[] p3, Object[] p4, boolean p5)
    {
        this.zze = -1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zzf = p5;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzanx zza(com.google.android.gms.internal.firebase-auth-api.zzanx p6, com.google.android.gms.internal.firebase-auth-api.zzanx p7)
    {
        int v0_1 = (p6.zzb + p7.zzb);
        int[] v1_2 = java.util.Arrays.copyOf(p6.zzc, v0_1);
        System.arraycopy(p7.zzc, 0, v1_2, p6.zzb, p7.zzb);
        Object[] v2_1 = java.util.Arrays.copyOf(p6.zzd, v0_1);
        System.arraycopy(p7.zzd, 0, v2_1, p6.zzb, p7.zzb);
        return new com.google.android.gms.internal.firebase-auth-api.zzanx(v0_1, v1_2, v2_1, 1);
    }

    private final void zza(int p4)
    {
        Object[] v0_0 = this.zzc;
        if (p4 > v0_0.length) {
            int v1_1 = this.zzb;
            int v2_1 = ((v1_1 / 2) + v1_1);
            if (v2_1 >= p4) {
                p4 = v2_1;
            }
            if (p4 < 8) {
                p4 = 8;
            }
            this.zzc = java.util.Arrays.copyOf(v0_0, p4);
            this.zzd = java.util.Arrays.copyOf(this.zzd, p4);
        }
        return;
    }

    private static void zza(int p3, Object p4, com.google.android.gms.internal.firebase-auth-api.zzaol p5)
    {
        int v0 = (p3 >> 3);
        RuntimeException v3_1 = (p3 & 7);
        if (v3_1 == null) {
            p5.zzb(v0, ((Long) p4).longValue());
            return;
        } else {
            if (v3_1 == 1) {
                p5.zza(v0, ((Long) p4).longValue());
                return;
            } else {
                if (v3_1 == 2) {
                    p5.zza(v0, ((com.google.android.gms.internal.firebase-auth-api.zzajv) p4));
                    return;
                } else {
                    if (v3_1 == 3) {
                        if (p5.zza() != 1) {
                            p5.zza(v0);
                            ((com.google.android.gms.internal.firebase-auth-api.zzanx) p4).zzb(p5);
                            p5.zzb(v0);
                            return;
                        } else {
                            p5.zzb(v0);
                            ((com.google.android.gms.internal.firebase-auth-api.zzanx) p4).zzb(p5);
                            p5.zza(v0);
                            return;
                        }
                    } else {
                        if (v3_1 != 5) {
                            throw new RuntimeException(com.google.android.gms.internal.firebase-auth-api.zzall.zza());
                        } else {
                            p5.zzb(v0, ((Integer) p4).intValue());
                            return;
                        }
                    }
                }
            }
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzanx zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzanx.zza;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzanx zzd()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzanx();
    }

    private final void zzf()
    {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final boolean equals(Object p9)
    {
        if (this != p9) {
            if (p9 != null) {
                if ((p9 instanceof com.google.android.gms.internal.firebase-auth-api.zzanx)) {
                    Object[] v2_2 = this.zzb;
                    if (v2_2 == ((com.google.android.gms.internal.firebase-auth-api.zzanx) p9).zzb) {
                        boolean v5_0 = 0;
                        while (v5_0 < v2_2) {
                            if (this.zzc[v5_0] == ((com.google.android.gms.internal.firebase-auth-api.zzanx) p9).zzc[v5_0]) {
                                v5_0++;
                            }
                        }
                        int v4_1 = 0;
                        while (v4_1 < this.zzb) {
                            if (this.zzd[v4_1].equals(((com.google.android.gms.internal.firebase-auth-api.zzanx) p9).zzd[v4_1])) {
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

    public final int zza()
    {
        IllegalStateException v0_0 = this.zze;
        if (v0_0 == -1) {
            IllegalStateException v0_1 = 0;
            com.google.android.gms.internal.firebase-auth-api.zzalo v1_1 = 0;
            while (v0_1 < this.zzb) {
                int v2_5;
                int v2_0 = this.zzc[v0_1];
                int v3_0 = (v2_0 >> 3);
                int v2_1 = (v2_0 & 7);
                if (v2_1 == 0) {
                    v2_5 = com.google.android.gms.internal.firebase-auth-api.zzakn.zze(v3_0, ((Long) this.zzd[v0_1]).longValue());
                    v1_1 = (v2_5 + v1_1);
                } else {
                    if (v2_1 == 1) {
                        v2_5 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v3_0, ((Long) this.zzd[v0_1]).longValue());
                    } else {
                        if (v2_1 == 2) {
                            v2_5 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v3_0, ((com.google.android.gms.internal.firebase-auth-api.zzajv) this.zzd[v0_1]));
                        } else {
                            if (v2_1 == 3) {
                                v1_1 = ((((com.google.android.gms.internal.firebase-auth-api.zzanx) this.zzd[v0_1]).zza() + (com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v3_0) << 1)) + v1_1);
                            } else {
                                if (v2_1 != 5) {
                                    throw new IllegalStateException(com.google.android.gms.internal.firebase-auth-api.zzall.zza());
                                } else {
                                    v2_5 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(v3_0, ((Integer) this.zzd[v0_1]).intValue());
                                }
                            }
                        }
                    }
                }
                v0_1++;
            }
            this.zze = v1_1;
            return v1_1;
        } else {
            return v0_0;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzanx zza(com.google.android.gms.internal.firebase-auth-api.zzanx p7)
    {
        if (!p7.equals(com.google.android.gms.internal.firebase-auth-api.zzanx.zza)) {
            this.zzf();
            int v0_3 = (this.zzb + p7.zzb);
            this.zza(v0_3);
            System.arraycopy(p7.zzc, 0, this.zzc, this.zzb, p7.zzb);
            System.arraycopy(p7.zzd, 0, this.zzd, this.zzb, p7.zzb);
            this.zzb = v0_3;
            return this;
        } else {
            return this;
        }
    }

    public final void zza(int p3, Object p4)
    {
        this.zzf();
        this.zza((this.zzb + 1));
        int v1_0 = this.zzb;
        this.zzc[v1_0] = p3;
        this.zzd[v1_0] = p4;
        this.zzb = (v1_0 + 1);
        return;
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaol p4)
    {
        if (p4.zza() != 2) {
            int v0_1 = 0;
            while (v0_1 < this.zzb) {
                p4.zza((this.zzc[v0_1] >> 3), this.zzd[v0_1]);
                v0_1++;
            }
        } else {
            int v0_3 = (this.zzb - 1);
            while (v0_3 >= 0) {
                p4.zza((this.zzc[v0_3] >> 3), this.zzd[v0_3]);
                v0_3--;
            }
        }
        return;
    }

    public final void zza(StringBuilder p4, int p5)
    {
        int v0 = 0;
        while (v0 < this.zzb) {
            com.google.android.gms.internal.firebase-auth-api.zzamn.zza(p4, p5, String.valueOf((this.zzc[v0] >> 3)), this.zzd[v0]);
            v0++;
        }
        return;
    }

    public final int zzb()
    {
        int v0_0 = this.zze;
        if (v0_0 == -1) {
            int v0_1 = 0;
            int v1_1 = 0;
            while (v0_1 < this.zzb) {
                v1_1 += com.google.android.gms.internal.firebase-auth-api.zzakn.zzb((this.zzc[v0_1] >> 3), ((com.google.android.gms.internal.firebase-auth-api.zzajv) this.zzd[v0_1]));
                v0_1++;
            }
            this.zze = v1_1;
            return v1_1;
        } else {
            return v0_0;
        }
    }

    public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzaol p4)
    {
        if (this.zzb != 0) {
            if (p4.zza() != 1) {
                int v0_1 = (this.zzb - 1);
                while (v0_1 >= 0) {
                    com.google.android.gms.internal.firebase-auth-api.zzanx.zza(this.zzc[v0_1], this.zzd[v0_1], p4);
                    v0_1--;
                }
            } else {
                int v0_2 = 0;
                while (v0_2 < this.zzb) {
                    com.google.android.gms.internal.firebase-auth-api.zzanx.zza(this.zzc[v0_2], this.zzd[v0_2], p4);
                    v0_2++;
                }
            }
        }
        return;
    }

    public final void zze()
    {
        if (this.zzf) {
            this.zzf = 0;
        }
        return;
    }
}
