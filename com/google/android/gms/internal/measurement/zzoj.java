package com.google.android.gms.internal.measurement;
public final class zzoj {
    private static final com.google.android.gms.internal.measurement.zzoj zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    static zzoj()
    {
        int[] v2 = new int[0];
        Object[] v3 = new Object[0];
        com.google.android.gms.internal.measurement.zzoj.zza = new com.google.android.gms.internal.measurement.zzoj(0, v2, v3, 0);
        return;
    }

    private zzoj()
    {
        int[] v1 = new int[8];
        Object[] v0_1 = new Object[8];
        this(0, v1, v0_1, 1);
        return;
    }

    private zzoj(int p2, int[] p3, Object[] p4, boolean p5)
    {
        this.zze = -1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zzf = p5;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzoj zza()
    {
        return com.google.android.gms.internal.measurement.zzoj.zza;
    }

    public static com.google.android.gms.internal.measurement.zzoj zzb()
    {
        int[] v2 = new int[8];
        Object[] v1_1 = new Object[8];
        return new com.google.android.gms.internal.measurement.zzoj(0, v2, v1_1, 1);
    }

    public static com.google.android.gms.internal.measurement.zzoj zzc(com.google.android.gms.internal.measurement.zzoj p6, com.google.android.gms.internal.measurement.zzoj p7)
    {
        int v0_1 = (p6.zzb + p7.zzb);
        int[] v1_2 = java.util.Arrays.copyOf(p6.zzc, v0_1);
        System.arraycopy(p7.zzc, 0, v1_2, p6.zzb, p7.zzb);
        Object[] v2_1 = java.util.Arrays.copyOf(p6.zzd, v0_1);
        System.arraycopy(p7.zzd, 0, v2_1, p6.zzb, p7.zzb);
        return new com.google.android.gms.internal.measurement.zzoj(v0_1, v1_2, v2_1, 1);
    }

    private final void zzm(int p4)
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

    public final boolean equals(Object p9)
    {
        if (this != p9) {
            if (p9 != null) {
                if ((p9 instanceof com.google.android.gms.internal.measurement.zzoj)) {
                    Object[] v2_2 = this.zzb;
                    if (v2_2 == ((com.google.android.gms.internal.measurement.zzoj) p9).zzb) {
                        boolean v5_0 = 0;
                        while (v5_0 < v2_2) {
                            if (this.zzc[v5_0] == ((com.google.android.gms.internal.measurement.zzoj) p9).zzc[v5_0]) {
                                v5_0++;
                            }
                        }
                        int v4_1 = 0;
                        while (v4_1 < this.zzb) {
                            if (this.zzd[v4_1].equals(((com.google.android.gms.internal.measurement.zzoj) p9).zzd[v4_1])) {
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
        int v3 = 0;
        int v4_1 = 17;
        int v5_2 = 0;
        int v6_1 = 17;
        while (v5_2 < v0_0) {
            v6_1 = ((v6_1 * 31) + this.zzc[v5_2]);
            v5_2++;
        }
        int v1_1 = ((((v0_0 + 527) * 31) + v6_1) * 31);
        int v2_0 = this.zzb;
        while (v3 < v2_0) {
            v4_1 = ((v4_1 * 31) + this.zzd[v3].hashCode());
            v3++;
        }
        return (v1_1 + v4_1);
    }

    public final void zzd()
    {
        if (this.zzf) {
            this.zzf = 0;
        }
        return;
    }

    public final void zze()
    {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        } else {
            return;
        }
    }

    public final void zzf(com.google.android.gms.internal.measurement.zzov p4)
    {
        int v0 = 0;
        while (v0 < this.zzb) {
            p4.zzv((this.zzc[v0] >> 3), this.zzd[v0]);
            v0++;
        }
        return;
    }

    public final void zzg(com.google.android.gms.internal.measurement.zzov p7)
    {
        if (this.zzb != 0) {
            com.google.android.gms.internal.measurement.zzmq v0_1 = 0;
            while (v0_1 < this.zzb) {
                String v1_4 = this.zzc[v0_1];
                int v2_9 = this.zzd[v0_1];
                int v3 = (v1_4 & 7);
                String v1_0 = (v1_4 >> 3);
                if (v3 == 0) {
                    p7.zzc(v1_0, ((Long) v2_9).longValue());
                } else {
                    if (v3 == 1) {
                        p7.zzj(v1_0, ((Long) v2_9).longValue());
                    } else {
                        if (v3 == 2) {
                            p7.zzn(v1_0, ((com.google.android.gms.internal.measurement.zzlh) v2_9));
                        } else {
                            if (v3 == 3) {
                                p7.zzt(v1_0);
                                ((com.google.android.gms.internal.measurement.zzoj) v2_9).zzg(p7);
                                p7.zzu(v1_0);
                            } else {
                                if (v3 != 5) {
                                    throw new RuntimeException(new com.google.android.gms.internal.measurement.zzmq("Protocol message tag had invalid wire type."));
                                } else {
                                    p7.zzk(v1_0, ((Integer) v2_9).intValue());
                                }
                            }
                        }
                    }
                }
                v0_1++;
            }
        }
        return;
    }

    public final int zzh()
    {
        int v0_0 = this.zze;
        if (v0_0 != -1) {
            return v0_0;
        } else {
            int v0_1 = 0;
            int v1_1 = 0;
            while (v0_1 < this.zzb) {
                v1_1 += (((com.google.android.gms.internal.measurement.zzlm.zzz(8) + com.google.android.gms.internal.measurement.zzlm.zzz(8)) + (com.google.android.gms.internal.measurement.zzlm.zzz((this.zzc[v0_1] >> 3)) + com.google.android.gms.internal.measurement.zzlm.zzz(16))) + v1.a.b(((com.google.android.gms.internal.measurement.zzlh) this.zzd[v0_1]).zzc(), ((com.google.android.gms.internal.measurement.zzlh) this.zzd[v0_1]).zzc(), com.google.android.gms.internal.measurement.zzlm.zzz(24)));
                v0_1++;
            }
            this.zze = v1_1;
            return v1_1;
        }
    }

    public final int zzi()
    {
        IllegalStateException v0_0 = this.zze;
        if (v0_0 != -1) {
            return v0_0;
        } else {
            IllegalStateException v0_1 = 0;
            com.google.android.gms.internal.measurement.zzmq v1_1 = 0;
            while (v0_1 < this.zzb) {
                String v2_4;
                Integer v3_5;
                String v2_1 = this.zzc[v0_1];
                Integer v3_0 = (v2_1 >> 3);
                String v2_2 = (v2_1 & 7);
                if (v2_2 == null) {
                    String v2_3 = (v3_0 << 3);
                    Integer v3_4 = ((Long) this.zzd[v0_1]).longValue();
                    v2_4 = com.google.android.gms.internal.measurement.zzlm.zzz(v2_3);
                    v3_5 = com.google.android.gms.internal.measurement.zzlm.zzA(v3_4);
                    v1_1 = ((v3_5 + v2_4) + v1_1);
                } else {
                    String v2_7;
                    if (v2_2 == 1) {
                        String v2_5 = (v3_0 << 3);
                        ((Long) this.zzd[v0_1]).getClass();
                        v2_7 = (com.google.android.gms.internal.measurement.zzlm.zzz(v2_5) + 8);
                    } else {
                        if (v2_2 == 2) {
                            Integer v3_11 = ((com.google.android.gms.internal.measurement.zzlh) this.zzd[v0_1]);
                            String v2_9 = com.google.android.gms.internal.measurement.zzlm.zzz((v3_0 << 3));
                            Integer v3_12 = v3_11.zzc();
                            v1_1 = (((com.google.android.gms.internal.measurement.zzlm.zzz(v3_12) + v3_12) + v2_9) + v1_1);
                            v0_1++;
                        } else {
                            if (v2_2 == 3) {
                                v2_4 = (com.google.android.gms.internal.measurement.zzlm.zzz((v3_0 << 3)) + com.google.android.gms.internal.measurement.zzlm.zzz((v3_0 << 3)));
                                v3_5 = ((com.google.android.gms.internal.measurement.zzoj) this.zzd[v0_1]).zzi();
                            } else {
                                if (v2_2 != 5) {
                                    throw new IllegalStateException(new com.google.android.gms.internal.measurement.zzmq("Protocol message tag had invalid wire type."));
                                } else {
                                    String v2_14 = (v3_0 << 3);
                                    ((Integer) this.zzd[v0_1]).getClass();
                                    v2_7 = (com.google.android.gms.internal.measurement.zzlm.zzz(v2_14) + 4);
                                }
                            }
                        }
                    }
                    v1_1 = (v2_7 + v1_1);
                }
            }
            this.zze = v1_1;
            return v1_1;
        }
    }

    public final void zzj(StringBuilder p4, int p5)
    {
        int v0 = 0;
        while (v0 < this.zzb) {
            com.google.android.gms.internal.measurement.zzno.zzb(p4, p5, String.valueOf((this.zzc[v0] >> 3)), this.zzd[v0]);
            v0++;
        }
        return;
    }

    public final void zzk(int p3, Object p4)
    {
        this.zze();
        this.zzm((this.zzb + 1));
        int v1_0 = this.zzb;
        this.zzc[v1_0] = p3;
        this.zzd[v1_0] = p4;
        this.zzb = (v1_0 + 1);
        return;
    }

    public final com.google.android.gms.internal.measurement.zzoj zzl(com.google.android.gms.internal.measurement.zzoj p7)
    {
        if (!p7.equals(com.google.android.gms.internal.measurement.zzoj.zza)) {
            this.zze();
            int v0_3 = (this.zzb + p7.zzb);
            this.zzm(v0_3);
            System.arraycopy(p7.zzc, 0, this.zzc, this.zzb, p7.zzb);
            System.arraycopy(p7.zzd, 0, this.zzd, this.zzb, p7.zzb);
            this.zzb = v0_3;
            return this;
        } else {
            return this;
        }
    }
}
