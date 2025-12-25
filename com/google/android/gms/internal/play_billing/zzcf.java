package com.google.android.gms.internal.play_billing;
final class zzcf extends com.google.android.gms.internal.play_billing.zzbw {
    static final com.google.android.gms.internal.play_billing.zzbw zza;
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    static zzcf()
    {
        Object[] v2 = new Object[0];
        com.google.android.gms.internal.play_billing.zzcf.zza = new com.google.android.gms.internal.play_billing.zzcf(0, v2, 0);
        return;
    }

    private zzcf(Object p1, Object[] p2, int p3)
    {
        this.zzc = p1;
        this.zzb = p2;
        this.zzd = p3;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzcf zzg(int p19, Object[] p20, com.google.android.gms.internal.play_billing.zzbv p21)
    {
        IllegalArgumentException v0_0 = p19;
        Object[] v1_0 = p20;
        if (p19 != 0) {
            com.google.android.gms.internal.play_billing.zzbu v3_0 = 0;
            int[] v4_4 = 0;
            int v5_6 = 1;
            if (p19 != 1) {
                int v8_3;
                com.google.android.gms.internal.play_billing.zzbg.zzb(p19, (p20.length >> 1), "index");
                boolean v6_0 = 2;
                int v7_1 = Math.max(p19, 2);
                if (v7_1 >= 751619276) {
                    v8_3 = 1073741824;
                    if (v7_1 >= 1073741824) {
                        throw new IllegalArgumentException("collection too large");
                    }
                } else {
                    v8_3 = Integer.highestOneBit((v7_1 - 1));
                    do {
                        v8_3 += v8_3;
                    } while((((double) v8_3) * 4604480259023595110) >= ((double) v7_1));
                }
                int[] v16_0;
                int v17_0;
                boolean v18_0;
                if (p19 != 1) {
                    int[] v4_1;
                    int v7_3 = (v8_3 - 1);
                    if (v8_3 > 128) {
                        v16_0 = 0;
                        v17_0 = 1;
                        if (v8_3 > 32768) {
                            int[] v4_11 = new int[v8_3];
                            java.util.Arrays.fill(v4_11, -1);
                            int v5_8 = 0;
                            int v8_5 = 0;
                            while (v5_8 < p19) {
                                Object v9_9 = (v8_5 + v8_5);
                                Object v12_2 = (v5_8 + v5_8);
                                int v13_7 = p20[v12_2];
                                java.util.Objects.requireNonNull(v13_7);
                                Object v12_4 = p20[(v12_2 ^ 1)];
                                java.util.Objects.requireNonNull(v12_4);
                                com.google.android.gms.internal.play_billing.zzbo.zza(v13_7, v12_4);
                                int v14_5 = com.google.android.gms.internal.play_billing.zzbp.zza(v13_7.hashCode());
                                while(true) {
                                    boolean v18_1;
                                    int v14_6 = (v14_5 & v7_3);
                                    boolean v15_6 = v4_11[v14_6];
                                    if (v15_6 != -1) {
                                        v18_1 = v6_0;
                                        if (v13_7.equals(p20[v15_6])) {
                                            break;
                                        }
                                        v14_5 = (v14_6 + 1);
                                        v6_0 = v18_1;
                                    } else {
                                        v4_11[v14_6] = v9_9;
                                        if (v8_5 < v5_8) {
                                            p20[v9_9] = v13_7;
                                            p20[(v9_9 ^ 1)] = v12_4;
                                        }
                                        v8_5++;
                                        v18_1 = v6_0;
                                    }
                                    v5_8++;
                                    v6_0 = v18_1;
                                }
                                com.google.android.gms.internal.play_billing.zzbu v3_5 = (v15_6 ^ 1);
                                Object v9_10 = p20[v3_5];
                                java.util.Objects.requireNonNull(v9_10);
                                boolean v6_5 = new com.google.android.gms.internal.play_billing.zzbu(v13_7, v12_4, v9_10);
                                p20[v3_5] = v12_4;
                                v3_0 = v6_5;
                            }
                            v18_0 = v6_0;
                            if (v8_5 != p19) {
                                int v5_9 = new Object[3];
                                v5_9[0] = v4_11;
                                v5_9[1] = Integer.valueOf(v8_5);
                                v5_9[v18_0] = v3_0;
                                v3_0 = v5_9;
                                if ((v3_0 instanceof Object[])) {
                                    com.google.android.gms.internal.play_billing.zzbu v3_3 = ((Object[]) v3_0);
                                    IllegalArgumentException v0_5 = ((com.google.android.gms.internal.play_billing.zzbu) v3_3[v18_0]);
                                    if (p21 == null) {
                                        throw v0_5.zza();
                                    } else {
                                        p21.zzc = v0_5;
                                        IllegalArgumentException v0_7 = v3_3[v16_0];
                                        int v2_3 = ((Integer) v3_3[v17_0]).intValue();
                                        v1_0 = java.util.Arrays.copyOf(p20, (v2_3 + v2_3));
                                        v3_0 = v0_7;
                                        v0_0 = v2_3;
                                    }
                                }
                                return new com.google.android.gms.internal.play_billing.zzcf(v3_0, v1_0, v0_0);
                            } else {
                                v3_0 = v4_11;
                            }
                        } else {
                            v4_1 = new short[v8_3];
                            java.util.Arrays.fill(v4_1, -1);
                            int v5_1 = 0;
                            int v8_0 = 0;
                            while (v5_1 < p19) {
                                Object v9_0 = (v8_0 + v8_0);
                                int v11_0 = (v5_1 + v5_1);
                                Object v12_0 = p20[v11_0];
                                java.util.Objects.requireNonNull(v12_0);
                                int v11_2 = p20[(v11_0 ^ 1)];
                                java.util.Objects.requireNonNull(v11_2);
                                com.google.android.gms.internal.play_billing.zzbo.zza(v12_0, v11_2);
                                int v13_1 = com.google.android.gms.internal.play_billing.zzbp.zza(v12_0.hashCode());
                                while(true) {
                                    int v13_2 = (v13_1 & v7_3);
                                    int v14_1 = ((char) v4_1[v13_2]);
                                    if (v14_1 == 65535) {
                                        break;
                                    }
                                    if (!v12_0.equals(p20[v14_1])) {
                                        v13_1 = (v13_2 + 1);
                                    } else {
                                        com.google.android.gms.internal.play_billing.zzbu v3_1 = (v14_1 ^ 1);
                                        int v13_3 = p20[v3_1];
                                        java.util.Objects.requireNonNull(v13_3);
                                        Object v9_2 = new com.google.android.gms.internal.play_billing.zzbu(v12_0, v11_2, v13_3);
                                        p20[v3_1] = v11_2;
                                        v3_0 = v9_2;
                                    }
                                    v5_1++;
                                }
                                v4_1[v13_2] = ((short) v9_0);
                                if (v8_0 < v5_1) {
                                    p20[v9_0] = v12_0;
                                    p20[(v9_0 ^ 1)] = v11_2;
                                }
                                v8_0++;
                            }
                            if (v8_0 != p19) {
                                int v5_0 = new Object[3];
                                v5_0[0] = v4_1;
                                v5_0[1] = Integer.valueOf(v8_0);
                                v5_0[2] = v3_0;
                                v3_0 = v5_0;
                                v18_0 = 2;
                            }
                        }
                    } else {
                        int v8_1 = new byte[v8_3];
                        java.util.Arrays.fill(v8_1, -1);
                        Object v9_4 = 0;
                        int v11_3 = 0;
                        while (v9_4 < p19) {
                            Object v12_1 = (v11_3 + v11_3);
                            int v13_4 = (v9_4 + v9_4);
                            int v14_3 = p20[v13_4];
                            java.util.Objects.requireNonNull(v14_3);
                            int v13_6 = p20[(v13_4 ^ v5_6)];
                            java.util.Objects.requireNonNull(v13_6);
                            com.google.android.gms.internal.play_billing.zzbo.zza(v14_3, v13_6);
                            boolean v15_4 = com.google.android.gms.internal.play_billing.zzbp.zza(v14_3.hashCode());
                            while(true) {
                                boolean v15_5 = (v15_4 & v7_3);
                                int[] v16_1 = v4_4;
                                int v17_1 = v5_6;
                                int[] v4_3 = (v8_1[v15_5] & 255);
                                if (v4_3 == 255) {
                                    break;
                                }
                                if (!v14_3.equals(p20[v4_3])) {
                                    v15_4 = (v15_5 + 1);
                                    v4_4 = v16_1;
                                    v5_6 = v17_1;
                                } else {
                                    com.google.android.gms.internal.play_billing.zzbu v3_2 = (v4_3 ^ 1);
                                    int v5_7 = p20[v3_2];
                                    java.util.Objects.requireNonNull(v5_7);
                                    int[] v4_6 = new com.google.android.gms.internal.play_billing.zzbu(v14_3, v13_6, v5_7);
                                    p20[v3_2] = v13_6;
                                    v3_0 = v4_6;
                                }
                                v9_4++;
                                v4_4 = v16_1;
                                v5_6 = v17_1;
                            }
                            v8_1[v15_5] = ((byte) v12_1);
                            if (v11_3 < v9_4) {
                                p20[v12_1] = v14_3;
                                p20[(v12_1 ^ 1)] = v13_6;
                            }
                            v11_3++;
                        }
                        v16_0 = v4_4;
                        v17_0 = v5_6;
                        if (v11_3 != p19) {
                            v4_1 = new Object[3];
                            v4_1[v16_0] = v8_1;
                            v4_1[v17_0] = Integer.valueOf(v11_3);
                            v4_1[2] = v3_0;
                        } else {
                            v18_0 = 2;
                            v3_0 = v8_1;
                        }
                    }
                    v3_0 = v4_1;
                } else {
                    IllegalArgumentException v0_2 = p20[0];
                    java.util.Objects.requireNonNull(v0_2);
                    int v7_2 = p20[1];
                    java.util.Objects.requireNonNull(v7_2);
                    com.google.android.gms.internal.play_billing.zzbo.zza(v0_2, v7_2);
                    v16_0 = 0;
                    v0_0 = 1;
                    v17_0 = 1;
                }
            } else {
                IllegalArgumentException v0_8 = p20[0];
                java.util.Objects.requireNonNull(v0_8);
                int v2_6 = p20[1];
                java.util.Objects.requireNonNull(v2_6);
                com.google.android.gms.internal.play_billing.zzbo.zza(v0_8, v2_6);
                return new com.google.android.gms.internal.play_billing.zzcf(0, p20, 1);
            }
        } else {
            return ((com.google.android.gms.internal.play_billing.zzcf) com.google.android.gms.internal.play_billing.zzcf.zza);
        }
    }

    public final Object get(Object p10)
    {
        Object v10_2;
        if (p10 != null) {
            Object[] v2 = this.zzb;
            if (this.zzd != 1) {
                int v1_10 = this.zzc;
                if (v1_10 != 0) {
                    if (!(v1_10 instanceof byte[])) {
                        if (!(v1_10 instanceof short[])) {
                            int v1_0 = ((int[]) v1_10);
                            int v4_2 = (v1_0.length + -1);
                            int v6_1 = com.google.android.gms.internal.play_billing.zzbp.zza(p10.hashCode());
                            while(true) {
                                int v6_2 = (v6_1 & v4_2);
                                boolean v7_0 = v1_0[v6_2];
                                if (v7_0 != -1) {
                                    if (p10.equals(v2[v7_0])) {
                                        break;
                                    }
                                    v6_1 = (v6_2 + 1);
                                } else {
                                    v10_2 = 0;
                                }
                            }
                            v10_2 = v2[(v7_0 ^ 1)];
                        } else {
                            int v4_4 = ((short[]) v1_10);
                            int v6_3 = (v4_4.length - 1);
                            int v1_4 = com.google.android.gms.internal.play_billing.zzbp.zza(p10.hashCode());
                            while(true) {
                                int v1_5 = (v1_4 & v6_3);
                                char v5_1 = ((char) v4_4[v1_5]);
                                if (v5_1 != 65535) {
                                    if (p10.equals(v2[v5_1])) {
                                        break;
                                    }
                                    v1_4 = (v1_5 + 1);
                                }
                            }
                            v10_2 = v2[(v5_1 ^ 1)];
                        }
                    } else {
                        int v4_6 = ((byte[]) v1_10);
                        int v6_4 = (v4_6.length - 1);
                        int v1_8 = com.google.android.gms.internal.play_billing.zzbp.zza(p10.hashCode());
                        while(true) {
                            int v1_9 = (v1_8 & v6_4);
                            char v5_3 = (v4_6[v1_9] & 255);
                            if (v5_3 != 255) {
                                if (p10.equals(v2[v5_3])) {
                                    break;
                                }
                                v1_8 = (v1_9 + 1);
                            }
                        }
                        v10_2 = v2[(v5_3 ^ 1)];
                    }
                }
            } else {
                int v1_12 = v2[0];
                java.util.Objects.requireNonNull(v1_12);
                if (!v1_12.equals(p10)) {
                } else {
                    v10_2 = v2[1];
                    java.util.Objects.requireNonNull(v10_2);
                }
            }
        }
        if (v10_2 != null) {
            return v10_2;
        } else {
            return 0;
        }
    }

    public final int size()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.play_billing.zzbq zza()
    {
        return new com.google.android.gms.internal.play_billing.zzce(this.zzb, 1, this.zzd);
    }

    public final com.google.android.gms.internal.play_billing.zzbx zzd()
    {
        return new com.google.android.gms.internal.play_billing.zzcc(this, this.zzb, 0, this.zzd);
    }

    public final com.google.android.gms.internal.play_billing.zzbx zze()
    {
        return new com.google.android.gms.internal.play_billing.zzcd(this, new com.google.android.gms.internal.play_billing.zzce(this.zzb, 0, this.zzd));
    }
}
