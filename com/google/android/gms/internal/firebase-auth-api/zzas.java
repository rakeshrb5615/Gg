package com.google.android.gms.internal.firebase-auth-api;
final class zzas extends com.google.android.gms.internal.firebase-auth-api.zzal {
    private static final com.google.android.gms.internal.firebase-auth-api.zzal zza;
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    static zzas()
    {
        Object[] v2 = new Object[0];
        com.google.android.gms.internal.firebase-auth-api.zzas.zza = new com.google.android.gms.internal.firebase-auth-api.zzas(0, v2, 0);
        return;
    }

    private zzas(Object p1, Object[] p2, int p3)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzas zza(int p19, Object[] p20, com.google.android.gms.internal.firebase-auth-api.zzao p21)
    {
        IllegalArgumentException v0_0 = p19;
        Object[] v1 = p20;
        if (p19 != 0) {
            com.google.android.gms.internal.firebase-auth-api.zzan v3_0 = 0;
            int[] v4_4 = 0;
            int v5_6 = 1;
            if (p19 != 1) {
                int v8_3;
                com.google.android.gms.internal.firebase-auth-api.zzu.zzb(p19, (p20.length >> 1));
                boolean v6_0 = 2;
                int v7_0 = Math.max(p19, 2);
                if (v7_0 >= 751619276) {
                    int v7_1;
                    v8_3 = 1073741824;
                    if (v7_0 >= 1073741824) {
                        v7_1 = 0;
                    } else {
                        v7_1 = 1;
                    }
                    com.google.android.gms.internal.firebase-auth-api.zzu.zza(v7_1, "collection too large");
                } else {
                    v8_3 = (Integer.highestOneBit((v7_0 - 1)) << 1);
                    while ((((double) v8_3) * 4604480259023595110) < ((double) v7_0)) {
                        v8_3 <<= 1;
                    }
                }
                int v17_0;
                boolean v18_0;
                int[] v16_0;
                if (p19 != 1) {
                    int[] v4_1;
                    int v7_3 = (v8_3 - 1);
                    if (v8_3 > 128) {
                        v16_0 = 0;
                        v17_0 = 1;
                        if (v8_3 > 32768) {
                            int[] v4_10 = new int[v8_3];
                            java.util.Arrays.fill(v4_10, -1);
                            int v5_8 = 0;
                            int v8_7 = 0;
                            while (v5_8 < p19) {
                                int v9_9 = (v5_8 * 2);
                                Object v12_4 = (v8_7 * 2);
                                int v13_5 = p20[v9_9];
                                java.util.Objects.requireNonNull(v13_5);
                                int v9_11 = p20[(v9_9 ^ 1)];
                                java.util.Objects.requireNonNull(v9_11);
                                com.google.android.gms.internal.firebase-auth-api.zzae.zza(v13_5, v9_11);
                                int v14_5 = com.google.android.gms.internal.firebase-auth-api.zzad.zza(v13_5.hashCode());
                                while(true) {
                                    boolean v18_1;
                                    int v14_6 = (v14_5 & v7_3);
                                    boolean v15_6 = v4_10[v14_6];
                                    if (v15_6 != -1) {
                                        v18_1 = v6_0;
                                        if (v13_5.equals(p20[v15_6])) {
                                            break;
                                        }
                                        v14_5 = (v14_6 + 1);
                                        v6_0 = v18_1;
                                    } else {
                                        v4_10[v14_6] = v12_4;
                                        if (v8_7 < v5_8) {
                                            p20[v12_4] = v13_5;
                                            p20[(v12_4 ^ 1)] = v9_11;
                                        }
                                        v8_7++;
                                        v18_1 = v6_0;
                                    }
                                    v5_8++;
                                    v6_0 = v18_1;
                                }
                                boolean v6_4 = (v15_6 ^ 1);
                                Object v12_5 = p20[v6_4];
                                java.util.Objects.requireNonNull(v12_5);
                                v3_0 = new com.google.android.gms.internal.firebase-auth-api.zzan(v13_5, v9_11, v12_5);
                                p20[v6_4] = v9_11;
                            }
                            v18_0 = v6_0;
                            if (v8_7 != p19) {
                                int v5_9 = new Object[3];
                                v5_9[0] = v4_10;
                                v5_9[1] = Integer.valueOf(v8_7);
                                v5_9[v18_0] = v3_0;
                                v3_0 = v5_9;
                                if ((v3_0 instanceof Object[])) {
                                    com.google.android.gms.internal.firebase-auth-api.zzan v3_3 = ((Object[]) v3_0);
                                    IllegalArgumentException v0_2 = ((com.google.android.gms.internal.firebase-auth-api.zzan) v3_3[v18_0]);
                                    if (p21 == null) {
                                        throw v0_2.zza();
                                    } else {
                                        p21.zza = v0_2;
                                        IllegalArgumentException v0_4 = v3_3[v16_0];
                                        int v2_3 = ((Integer) v3_3[v17_0]).intValue();
                                        v1 = java.util.Arrays.copyOf(p20, (v2_3 << 1));
                                        v3_0 = v0_4;
                                        v0_0 = v2_3;
                                    }
                                }
                                return new com.google.android.gms.internal.firebase-auth-api.zzas(v3_0, v1, v0_0);
                            } else {
                                v3_0 = v4_10;
                            }
                        } else {
                            v4_1 = new short[v8_3];
                            java.util.Arrays.fill(v4_1, -1);
                            int v5_1 = 0;
                            int v8_1 = 0;
                            while (v5_1 < p19) {
                                int v9_0 = (v5_1 * 2);
                                int v11_0 = (v8_1 * 2);
                                Object v12_0 = p20[v9_0];
                                java.util.Objects.requireNonNull(v12_0);
                                int v9_2 = p20[(v9_0 ^ 1)];
                                java.util.Objects.requireNonNull(v9_2);
                                com.google.android.gms.internal.firebase-auth-api.zzae.zza(v12_0, v9_2);
                                int v13_1 = com.google.android.gms.internal.firebase-auth-api.zzad.zza(v12_0.hashCode());
                                while(true) {
                                    int v13_2 = (v13_1 & v7_3);
                                    int v14_1 = (v4_1[v13_2] & 65535);
                                    if (v14_1 == 65535) {
                                        break;
                                    }
                                    if (!v12_0.equals(p20[v14_1])) {
                                        v13_1 = (v13_2 + 1);
                                    } else {
                                        int v11_1 = (v14_1 ^ 1);
                                        int v13_3 = p20[v11_1];
                                        java.util.Objects.requireNonNull(v13_3);
                                        v3_0 = new com.google.android.gms.internal.firebase-auth-api.zzan(v12_0, v9_2, v13_3);
                                        p20[v11_1] = v9_2;
                                    }
                                    v5_1++;
                                }
                                v4_1[v13_2] = ((short) v11_0);
                                if (v8_1 < v5_1) {
                                    p20[v11_0] = v12_0;
                                    p20[(v11_0 ^ 1)] = v9_2;
                                }
                                v8_1++;
                            }
                            if (v8_1 != p19) {
                                int v5_0 = new Object[3];
                                v5_0[0] = v4_1;
                                v5_0[1] = Integer.valueOf(v8_1);
                                v5_0[2] = v3_0;
                                v3_0 = v5_0;
                                v18_0 = 2;
                            }
                        }
                    } else {
                        int v8_2 = new byte[v8_3];
                        java.util.Arrays.fill(v8_2, -1);
                        int v9_3 = 0;
                        int v11_3 = 0;
                        while (v9_3 < p19) {
                            Object v12_1 = (v9_3 * 2);
                            int v13_4 = (v11_3 * 2);
                            int v14_3 = p20[v12_1];
                            java.util.Objects.requireNonNull(v14_3);
                            Object v12_3 = p20[(v12_1 ^ v5_6)];
                            java.util.Objects.requireNonNull(v12_3);
                            com.google.android.gms.internal.firebase-auth-api.zzae.zza(v14_3, v12_3);
                            boolean v15_4 = com.google.android.gms.internal.firebase-auth-api.zzad.zza(v14_3.hashCode());
                            while(true) {
                                boolean v15_5 = (v15_4 & v7_3);
                                int[] v16_1 = v4_4;
                                int v17_1 = v5_6;
                                int[] v4_3 = (v8_2[v15_5] & 255);
                                if (v4_3 == 255) {
                                    break;
                                }
                                if (!v14_3.equals(p20[v4_3])) {
                                    v15_4 = (v15_5 + 1);
                                    v4_4 = v16_1;
                                    v5_6 = v17_1;
                                } else {
                                    int[] v4_5 = (v4_3 ^ 1);
                                    int v5_7 = p20[v4_5];
                                    java.util.Objects.requireNonNull(v5_7);
                                    v3_0 = new com.google.android.gms.internal.firebase-auth-api.zzan(v14_3, v12_3, v5_7);
                                    p20[v4_5] = v12_3;
                                }
                                v9_3++;
                                v4_4 = v16_1;
                                v5_6 = v17_1;
                            }
                            v8_2[v15_5] = ((byte) v13_4);
                            if (v11_3 < v9_3) {
                                p20[v13_4] = v14_3;
                                p20[(v13_4 ^ 1)] = v12_3;
                            }
                            v11_3++;
                        }
                        v16_0 = v4_4;
                        v17_0 = v5_6;
                        if (v11_3 != p19) {
                            v4_1 = new Object[3];
                            v4_1[v16_0] = v8_2;
                            v4_1[v17_0] = Integer.valueOf(v11_3);
                            v4_1[2] = v3_0;
                        } else {
                            v18_0 = 2;
                            v3_0 = v8_2;
                        }
                    }
                    v3_0 = v4_1;
                } else {
                    int v7_2 = p20[0];
                    java.util.Objects.requireNonNull(v7_2);
                    int v8_4 = p20[1];
                    java.util.Objects.requireNonNull(v8_4);
                    com.google.android.gms.internal.firebase-auth-api.zzae.zza(v7_2, v8_4);
                    v16_0 = 0;
                    v17_0 = 1;
                }
            } else {
                IllegalArgumentException v0_5 = p20[0];
                java.util.Objects.requireNonNull(v0_5);
                int v2_6 = p20[1];
                java.util.Objects.requireNonNull(v2_6);
                com.google.android.gms.internal.firebase-auth-api.zzae.zza(v0_5, v2_6);
                return new com.google.android.gms.internal.firebase-auth-api.zzas(0, p20, 1);
            }
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzas) com.google.android.gms.internal.firebase-auth-api.zzas.zza);
        }
    }

    public final Object get(Object p9)
    {
        Object v9_2;
        int v0_0 = this.zzb;
        Object[] v1 = this.zzc;
        if (p9 != null) {
            if (this.zzd != 1) {
                if (v0_0 != 0) {
                    if (!(v0_0 instanceof byte[])) {
                        if (!(v0_0 instanceof short[])) {
                            int v0_1 = ((int[]) v0_0);
                            int v2_2 = (v0_1.length - 1);
                            int v5_1 = com.google.android.gms.internal.firebase-auth-api.zzad.zza(p9.hashCode());
                            while(true) {
                                int v5_2 = (v5_1 & v2_2);
                                int v6_0 = v0_1[v5_2];
                                if (v6_0 != -1) {
                                    if (p9.equals(v1[v6_0])) {
                                        break;
                                    }
                                    v5_1 = (v5_2 + 1);
                                } else {
                                    v9_2 = 0;
                                }
                            }
                            v9_2 = v1[(v6_0 ^ 1)];
                        } else {
                            int v2_5 = ((short[]) v0_0);
                            int v5_3 = (v2_5.length - 1);
                            int v0_4 = com.google.android.gms.internal.firebase-auth-api.zzad.zza(p9.hashCode());
                            while(true) {
                                int v0_5 = (v0_4 & v5_3);
                                int v6_2 = (v2_5[v0_5] & 65535);
                                if (v6_2 != 65535) {
                                    if (p9.equals(v1[v6_2])) {
                                        break;
                                    }
                                    v0_4 = (v0_5 + 1);
                                }
                            }
                            v9_2 = v1[(v6_2 ^ 1)];
                        }
                    } else {
                        int v2_7 = ((byte[]) v0_0);
                        int v5_4 = (v2_7.length - 1);
                        int v0_8 = com.google.android.gms.internal.firebase-auth-api.zzad.zza(p9.hashCode());
                        while(true) {
                            int v0_9 = (v0_8 & v5_4);
                            int v6_4 = (v2_7[v0_9] & 255);
                            if (v6_4 != 255) {
                                if (p9.equals(v1[v6_4])) {
                                    break;
                                }
                                v0_8 = (v0_9 + 1);
                            }
                        }
                        v9_2 = v1[(v6_4 ^ 1)];
                    }
                }
            } else {
                int v0_11 = v1[0];
                java.util.Objects.requireNonNull(v0_11);
                if (!v0_11.equals(p9)) {
                } else {
                    v9_2 = v1[1];
                    java.util.Objects.requireNonNull(v9_2);
                }
            }
        }
        if (v9_2 != null) {
            return v9_2;
        } else {
            return 0;
        }
    }

    public final int size()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzag zza()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzaw(this.zzc, 1, this.zzd);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaq zzb()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzar(this, this.zzc, 0, this.zzd);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaq zzc()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzat(this, new com.google.android.gms.internal.firebase-auth-api.zzaw(this.zzc, 0, this.zzd));
    }

    public final boolean zzd()
    {
        return 0;
    }
}
