package com.google.android.gms.internal.firebase-auth-api;
final class zzamq implements com.google.android.gms.internal.firebase-auth-api.zzanb {
    private static final int[] zza;
    private static final sun.misc.Unsafe zzb;
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.firebase-auth-api.zzamm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final com.google.android.gms.internal.firebase-auth-api.zzamu zzn;
    private final com.google.android.gms.internal.firebase-auth-api.zzalw zzo;
    private final com.google.android.gms.internal.firebase-auth-api.zzanu zzp;
    private final com.google.android.gms.internal.firebase-auth-api.zzakw zzq;
    private final com.google.android.gms.internal.firebase-auth-api.zzamf zzr;

    static zzamq()
    {
        sun.misc.Unsafe v0_1 = new int[0];
        com.google.android.gms.internal.firebase-auth-api.zzamq.zza = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzamq.zzb = com.google.android.gms.internal.firebase-auth-api.zzanz.zzb();
        return;
    }

    private zzamq(int[] p1, Object[] p2, int p3, int p4, com.google.android.gms.internal.firebase-auth-api.zzamm p5, boolean p6, int[] p7, int p8, int p9, com.google.android.gms.internal.firebase-auth-api.zzamu p10, com.google.android.gms.internal.firebase-auth-api.zzalw p11, com.google.android.gms.internal.firebase-auth-api.zzanu p12, com.google.android.gms.internal.firebase-auth-api.zzakw p13, com.google.android.gms.internal.firebase-auth-api.zzamf p14)
    {
        int v2_2;
        this.zzc = p1;
        this.zzd = p2;
        this.zze = p3;
        this.zzf = p4;
        this.zzi = (p5 instanceof com.google.android.gms.internal.firebase-auth-api.zzalf);
        if ((p13 == null) || (!p13.zza(p5))) {
            v2_2 = 0;
        } else {
            v2_2 = 1;
        }
        this.zzh = v2_2;
        this.zzj = 0;
        this.zzk = p7;
        this.zzl = p8;
        this.zzm = p9;
        this.zzn = p10;
        this.zzo = p11;
        this.zzp = p12;
        this.zzq = p13;
        this.zzg = p5;
        this.zzr = p14;
        return;
    }

    private static double zza(Object p0, long p1)
    {
        return ((Double) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p0, p1)).doubleValue();
    }

    private final int zza(int p2)
    {
        if ((p2 < this.zze) || (p2 > this.zzf)) {
            return -1;
        } else {
            return this.zza(p2, 0);
        }
    }

    private final int zza(int p5, int p6)
    {
        int v0_2 = ((this.zzc.length / 3) - 1);
        while (p6 <= v0_2) {
            int v1_1 = ((v0_2 + p6) >> 1);
            int v2 = (v1_1 * 3);
            int v3_1 = this.zzc[v2];
            if (p5 != v3_1) {
                if (p5 >= v3_1) {
                    p6 = (v1_1 + 1);
                } else {
                    v0_2 = (v1_1 - 1);
                }
            } else {
                return v2;
            }
        }
        return -1;
    }

    private static int zza(byte[] p1, int p2, int p3, com.google.android.gms.internal.firebase-auth-api.zzaog p4, Class p5, com.google.android.gms.internal.firebase-auth-api.zzaju p6)
    {
        switch (com.google.android.gms.internal.firebase-auth-api.zzamp.zza[p4.ordinal()]) {
            case 1:
                Boolean v2_17;
                int v1_13 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p1, p2, p6);
                if (p6.zzb == 0) {
                    v2_17 = 0;
                } else {
                    v2_17 = 1;
                }
                p6.zzc = Boolean.valueOf(v2_17);
                return v1_13;
            case 2:
                return com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p1, p2, p6);
            case 3:
                p6.zzc = Double.valueOf(com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p1, p2));
                return (p2 + 8);
            case 4:
            case 5:
                p6.zzc = Integer.valueOf(com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p1, p2));
                return (p2 + 4);
            case 6:
            case 7:
                p6.zzc = Long.valueOf(com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p1, p2));
                return (p2 + 8);
            case 8:
                p6.zzc = Float.valueOf(com.google.android.gms.internal.firebase-auth-api.zzajr.zzb(p1, p2));
                return (p2 + 4);
            case 9:
            case 10:
            case 11:
                int v1_4 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p1, p2, p6);
                p6.zzc = Integer.valueOf(p6.zza);
                return v1_4;
            case 12:
            case 13:
                int v1_3 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p1, p2, p6);
                p6.zzc = Long.valueOf(p6.zzb);
                return v1_3;
            case 14:
                return com.google.android.gms.internal.firebase-auth-api.zzajr.zza(com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(p5), p1, p2, p3, p6);
            case 15:
                int v1_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p1, p2, p6);
                p6.zzc = Integer.valueOf(com.google.android.gms.internal.firebase-auth-api.zzakh.zza(p6.zza));
                return v1_1;
            case 16:
                int v1_14 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p1, p2, p6);
                p6.zzc = Long.valueOf(com.google.android.gms.internal.firebase-auth-api.zzakh.zza(p6.zzb));
                return v1_14;
            case 17:
                return com.google.android.gms.internal.firebase-auth-api.zzajr.zzb(p1, p2, p6);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzamq zza(Class p31, com.google.android.gms.internal.firebase-auth-api.zzamk p32, com.google.android.gms.internal.firebase-auth-api.zzamu p33, com.google.android.gms.internal.firebase-auth-api.zzalw p34, com.google.android.gms.internal.firebase-auth-api.zzanu p35, com.google.android.gms.internal.firebase-auth-api.zzakw p36, com.google.android.gms.internal.firebase-auth-api.zzamf p37)
    {
        if (!(p32 instanceof com.google.android.gms.internal.firebase-auth-api.zzamz)) {
            throw new NoSuchMethodError();
        } else {
            boolean v7_3;
            int v0_37 = ((com.google.android.gms.internal.firebase-auth-api.zzamz) p32);
            int v1_3 = ((com.google.android.gms.internal.firebase-auth-api.zzamz) p32).zzd();
            int v2_0 = v1_3.length();
            int v5_0 = 55296;
            if (v1_3.charAt(0) < 55296) {
                v7_3 = 1;
            } else {
                int v4_2 = 1;
                while(true) {
                    v7_3 = (v4_2 + 1);
                    if (v1_3.charAt(v4_2) < 55296) {
                        break;
                    }
                    v4_2 = v7_3;
                }
            }
            int v4_1 = (v7_3 + 1);
            boolean v7_9 = v1_3.charAt(v7_3);
            if (v7_9 >= 55296) {
                boolean v7_10 = (v7_9 & 8191);
                int v9_9 = 13;
                while(true) {
                    int v10_7 = (v4_1 + 1);
                    int v4_10 = v1_3.charAt(v4_1);
                    if (v4_10 < 55296) {
                        break;
                    }
                    v7_10 |= ((v4_10 & 8191) << v9_9);
                    v9_9 += 13;
                    v4_1 = v10_7;
                }
                v7_9 = (v7_10 | (v4_10 << v9_9));
                v4_1 = v10_7;
            }
            int v12_3;
            int v16_5;
            int v11_0;
            int v9_0;
            boolean v7_2;
            int v17_1;
            int v13_7;
            int v10_0;
            if (v7_9) {
                boolean v7_7 = (v4_1 + 1);
                int v4_13 = v1_3.charAt(v4_1);
                if (v4_13 >= 55296) {
                    int v4_3 = (v4_13 & 8191);
                    int v9_5 = 13;
                    while(true) {
                        int v10_18 = (v7_7 + 1);
                        boolean v7_25 = v1_3.charAt(v7_7);
                        if (v7_25 < 55296) {
                            break;
                        }
                        v4_3 |= ((v7_25 & 8191) << v9_5);
                        v9_5 += 13;
                        v7_7 = v10_18;
                    }
                    v4_13 = (v4_3 | (v7_25 << v9_5));
                    v7_7 = v10_18;
                }
                int v9_4 = (v7_7 + 1);
                boolean v7_28 = v1_3.charAt(v7_7);
                if (v7_28 >= 55296) {
                    boolean v7_4 = (v7_28 & 8191);
                    int v10_5 = 13;
                    while(true) {
                        int v11_8 = (v9_4 + 1);
                        int v9_10 = v1_3.charAt(v9_4);
                        if (v9_10 < 55296) {
                            break;
                        }
                        v7_4 |= ((v9_10 & 8191) << v10_5);
                        v10_5 += 13;
                        v9_4 = v11_8;
                    }
                    v7_28 = (v7_4 | (v9_10 << v10_5));
                    v9_4 = v11_8;
                }
                int v10_4 = (v9_4 + 1);
                int v9_12 = v1_3.charAt(v9_4);
                if (v9_12 >= 55296) {
                    int v9_1 = (v9_12 & 8191);
                    int v11_5 = 13;
                    while(true) {
                        int v12_7 = (v10_4 + 1);
                        int v10_21 = v1_3.charAt(v10_4);
                        if (v10_21 < 55296) {
                            break;
                        }
                        v9_1 |= ((v10_21 & 8191) << v11_5);
                        v11_5 += 13;
                        v10_4 = v12_7;
                    }
                    v9_12 = (v9_1 | (v10_21 << v11_5));
                    v10_4 = v12_7;
                }
                int v11_4 = (v10_4 + 1);
                int v10_23 = v1_3.charAt(v10_4);
                if (v10_23 >= 55296) {
                    int v10_1 = (v10_23 & 8191);
                    int v12_6 = 13;
                    while(true) {
                        int v13_11 = (v11_4 + 1);
                        int v11_9 = v1_3.charAt(v11_4);
                        if (v11_9 < 55296) {
                            break;
                        }
                        v10_1 |= ((v11_9 & 8191) << v12_6);
                        v12_6 += 13;
                        v11_4 = v13_11;
                    }
                    v10_23 = (v10_1 | (v11_9 << v12_6));
                    v11_4 = v13_11;
                }
                int v12_0 = (v11_4 + 1);
                v11_0 = v1_3.charAt(v11_4);
                if (v11_0 >= 55296) {
                    int v11_1 = (v11_0 & 8191);
                    int v13_10 = 13;
                    while(true) {
                        int v14_10 = (v12_0 + 1);
                        int v12_8 = v1_3.charAt(v12_0);
                        if (v12_8 < 55296) {
                            break;
                        }
                        v11_1 |= ((v12_8 & 8191) << v13_10);
                        v13_10 += 13;
                        v12_0 = v14_10;
                    }
                    v11_0 = (v11_1 | (v12_8 << v13_10));
                    v12_0 = v14_10;
                }
                int v13_0 = (v12_0 + 1);
                int v12_1 = v1_3.charAt(v12_0);
                if (v12_1 >= 55296) {
                    int v12_2 = (v12_1 & 8191);
                    int v14_0 = 13;
                    while(true) {
                        int v15_0 = (v13_0 + 1);
                        int v13_1 = v1_3.charAt(v13_0);
                        if (v13_1 < 55296) {
                            break;
                        }
                        v12_2 |= ((v13_1 & 8191) << v14_0);
                        v14_0 += 13;
                        v13_0 = v15_0;
                    }
                    v12_1 = (v12_2 | (v13_1 << v14_0));
                    v13_0 = v15_0;
                }
                int v14_1 = (v13_0 + 1);
                int v13_3 = v1_3.charAt(v13_0);
                if (v13_3 >= 55296) {
                    int v13_4 = (v13_3 & 8191);
                    int v15_1 = 13;
                    while(true) {
                        int v16_0 = (v14_1 + 1);
                        int v14_2 = v1_3.charAt(v14_1);
                        if (v14_2 < 55296) {
                            break;
                        }
                        v13_4 |= ((v14_2 & 8191) << v15_1);
                        v15_1 += 13;
                        v14_1 = v16_0;
                    }
                    v13_3 = (v13_4 | (v14_2 << v15_1));
                    v14_1 = v16_0;
                }
                int v15_2 = (v14_1 + 1);
                int v14_4 = v1_3.charAt(v14_1);
                if (v14_4 >= 55296) {
                    int v14_5 = (v14_4 & 8191);
                    int v16_1 = 13;
                    while(true) {
                        int v17_0 = (v15_2 + 1);
                        int v15_3 = v1_3.charAt(v15_2);
                        if (v15_3 < 55296) {
                            break;
                        }
                        v14_5 |= ((v15_3 & 8191) << v16_1);
                        v16_1 += 13;
                        v15_2 = v17_0;
                    }
                    v14_4 = (v14_5 | (v15_3 << v16_1));
                    v15_2 = v17_0;
                }
                int v13_6 = new int[((v14_4 + v12_1) + v13_3)];
                v12_3 = v9_12;
                v9_0 = v12_1;
                v13_7 = v10_23;
                v10_0 = ((v4_13 << 1) + v7_28);
                v16_5 = v13_6;
                v7_2 = v4_13;
                v17_1 = v14_4;
                v4_1 = v15_2;
            } else {
                v9_0 = 0;
                v10_0 = 0;
                v11_0 = 0;
                v12_3 = 0;
                v13_7 = 0;
                v17_1 = 0;
                v16_5 = com.google.android.gms.internal.firebase-auth-api.zzamq.zza;
                v7_2 = 0;
            }
            int v14_8 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb;
            int v15_7 = ((com.google.android.gms.internal.firebase-auth-api.zzamz) p32).zze();
            Class v3_1 = ((com.google.android.gms.internal.firebase-auth-api.zzamz) p32).zza().getClass();
            com.google.android.gms.internal.firebase-auth-api.zzamy v6_1 = new int[(v11_0 * 3)];
            int v11_7 = new Object[(v11_0 << 1)];
            int v18_1 = (v17_1 + v9_0);
            int v20_0 = v17_1;
            int v21_0 = v18_1;
            int v9_6 = 0;
            int v19_0 = 0;
            while (v4_1 < v2_0) {
                int v8_0;
                int v22_1 = (v4_1 + 1);
                int v4_5 = v1_3.charAt(v4_1);
                if (v4_5 < v5_0) {
                    v8_0 = v22_1;
                } else {
                    int v4_6 = (v4_5 & 8191);
                    int v8_1 = v22_1;
                    int v22_2 = 13;
                    while(true) {
                        int v24_0 = (v8_1 + 1);
                        int v8_2 = v1_3.charAt(v8_1);
                        if (v8_2 < v5_0) {
                            break;
                        }
                        v4_6 |= ((v8_2 & 8191) << v22_2);
                        v22_2 += 13;
                        v8_1 = v24_0;
                    }
                    v4_5 = (v4_6 | (v8_2 << v22_2));
                    v8_0 = v24_0;
                }
                int v26_1;
                int v0_1;
                int v22_3 = (v8_0 + 1);
                int v8_4 = v1_3.charAt(v8_0);
                if (v8_4 < v5_0) {
                    v26_1 = v0_37;
                    v0_1 = v22_3;
                } else {
                    int v8_5 = (v8_4 & 8191);
                    int v5_1 = v22_3;
                    int v22_4 = 13;
                    while(true) {
                        int v25_0 = (v5_1 + 1);
                        int v5_2 = v1_3.charAt(v5_1);
                        v26_1 = v0_37;
                        if (v5_2 < 55296) {
                            break;
                        }
                        v8_5 |= ((v5_2 & 8191) << v22_4);
                        v22_4 += 13;
                        v5_1 = v25_0;
                        v0_37 = v26_1;
                    }
                    v8_4 = (v8_5 | (v5_2 << v22_4));
                    v0_1 = v25_0;
                }
                int v5_3 = (v8_4 & 255);
                int v22_5 = v2_0;
                if ((v8_4 & 1024) != 0) {
                    int v2_2 = (v19_0 + 1);
                    v16_5[v19_0] = v9_6;
                    v19_0 = v2_2;
                }
                int v2_9;
                boolean v7_22;
                com.google.android.gms.internal.firebase-auth-api.zzamy v29_1;
                int v1_2;
                boolean v28_0;
                int v0_8;
                int v4_14;
                reflect.Field v27_0 = v4_5;
                if (v5_3 < 51) {
                    v29_1 = v6_1;
                    v28_0 = v7_2;
                    int v2_4 = (v10_0 + 1);
                    int v4_9 = com.google.android.gms.internal.firebase-auth-api.zzamq.zza(v3_1, ((String) v15_7[v10_0]));
                    if ((v5_3 != 9) && (v5_3 != 17)) {
                        if ((v5_3 != 27) && (v5_3 != 49)) {
                            if ((v5_3 != 12) && ((v5_3 != 30) && (v5_3 != 44))) {
                                if (v5_3 != 50) {
                                    com.google.android.gms.internal.firebase-auth-api.zzamy v6_16;
                                    int v4_12 = ((int) v14_8.objectFieldOffset(v4_9));
                                    if (((v8_4 & 4096) == 0) || (v5_3 > 17)) {
                                        v7_22 = v1_3;
                                        v6_16 = 1048575;
                                        v1_2 = 0;
                                    } else {
                                        com.google.android.gms.internal.firebase-auth-api.zzamy v6_17 = (v0_1 + 1);
                                        int v0_4 = v1_3.charAt(v0_1);
                                        if (v0_4 >= 55296) {
                                            int v0_5 = (v0_4 & 8191);
                                            int v10_10 = 13;
                                            while(true) {
                                                int v24_1 = (v6_17 + 1);
                                                com.google.android.gms.internal.firebase-auth-api.zzamy v6_18 = v1_3.charAt(v6_17);
                                                if (v6_18 < 55296) {
                                                    break;
                                                }
                                                v0_5 |= ((v6_18 & 8191) << v10_10);
                                                v10_10 += 13;
                                                v6_17 = v24_1;
                                            }
                                            v0_4 = (v0_5 | (v6_18 << v10_10));
                                            v6_17 = v24_1;
                                        }
                                        int v10_14;
                                        int v24_3 = ((v0_4 / 32) + (v28_0 << 1));
                                        int v10_12 = v15_7[v24_3];
                                        if (!(v10_12 instanceof reflect.Field)) {
                                            v10_14 = com.google.android.gms.internal.firebase-auth-api.zzamq.zza(v3_1, ((String) v10_12));
                                            v15_7[v24_3] = v10_14;
                                        } else {
                                            v10_14 = ((reflect.Field) v10_12);
                                        }
                                        v7_22 = v1_3;
                                        v1_2 = (v0_4 % 32);
                                        v6_16 = ((int) v14_8.objectFieldOffset(v10_14));
                                        v0_1 = v6_17;
                                    }
                                    if ((v5_3 >= 18) && (v5_3 <= 49)) {
                                        int v10_17 = (v21_0 + 1);
                                        v16_5[v21_0] = v4_12;
                                        v21_0 = v10_17;
                                    }
                                    v10_0 = v2_4;
                                    v2_9 = v0_1;
                                    v0_8 = v4_12;
                                    v4_14 = v6_16;
                                    int v0_27;
                                    com.google.android.gms.internal.firebase-auth-api.zzamy v6_27 = (v9_6 + 1);
                                    v29_1[v9_6] = v27_0;
                                    int v24_5 = (v9_6 + 2);
                                    if ((v8_4 & 512) == 0) {
                                        v0_27 = 0;
                                    } else {
                                        v0_27 = 536870912;
                                    }
                                    int v0_29;
                                    if ((v8_4 & 256) == 0) {
                                        v0_29 = 0;
                                    } else {
                                        v0_29 = 268435456;
                                    }
                                    int v8_7;
                                    if ((v8_4 & 2048) == 0) {
                                        v8_7 = 0;
                                    } else {
                                        v8_7 = -2147483648;
                                    }
                                    v29_1[v6_27] = ((((v0_27 | v0_29) | v8_7) | (v5_3 << 20)) | v0_8);
                                    v9_6 += 3;
                                    v29_1[v24_5] = ((v1_2 << 20) | v4_14);
                                    v4_1 = v2_9;
                                    v1_3 = v7_22;
                                    v2_0 = v22_5;
                                    v0_37 = v26_1;
                                    v7_2 = v28_0;
                                    v6_1 = v29_1;
                                    v5_0 = 55296;
                                } else {
                                    boolean v7_18 = (v20_0 + 1);
                                    v16_5[v20_0] = v9_6;
                                    int v20_3 = ((v9_6 / 3) << 1);
                                    int v25_1 = (v10_0 + 2);
                                    v11_7[v20_3] = v15_7[v2_4];
                                    if ((v8_4 & 2048) == 0) {
                                        v20_0 = v7_18;
                                        v2_4 = v25_1;
                                    } else {
                                        v2_4 = (v10_0 + 3);
                                        v11_7[(v20_3 + 1)] = v15_7[v25_1];
                                        v20_0 = v7_18;
                                    }
                                }
                            } else {
                                if ((v26_1.zzb() != com.google.android.gms.internal.firebase-auth-api.zzamy.zza) && ((v8_4 & 2048) == 0)) {
                                } else {
                                    int v10_9 = (v10_0 + 2);
                                    v11_7[(((v9_6 / 3) << 1) + 1)] = v15_7[v2_4];
                                }
                            }
                        } else {
                            v10_9 = (v10_0 + 2);
                            v11_7[(((v9_6 / 3) << 1) + 1)] = v15_7[v2_4];
                        }
                        v2_4 = v10_9;
                    } else {
                        v11_7[(((v9_6 / 3) << 1) + 1)] = v4_9.getType();
                    }
                } else {
                    v2_9 = (v0_1 + 1);
                    int v0_10 = v1_3.charAt(v0_1);
                    int v4_15 = 55296;
                    if (v0_10 >= 55296) {
                        int v0_11 = (v0_10 & 8191);
                        boolean v28_1 = 13;
                        while(true) {
                            com.google.android.gms.internal.firebase-auth-api.zzamy v29_2 = (v2_9 + 1);
                            int v2_10 = v1_3.charAt(v2_9);
                            if (v2_10 < v4_15) {
                                break;
                            }
                            v0_11 |= ((v2_10 & 8191) << v28_1);
                            v28_1 += 13;
                            v2_9 = v29_2;
                            v4_15 = 55296;
                        }
                        v0_10 = (v0_11 | (v2_10 << v28_1));
                        v2_9 = v29_2;
                    }
                    int v4_18;
                    int v4_16 = (v5_3 - 51);
                    boolean v28_2 = v0_10;
                    if ((v4_16 != 9) && (v4_16 != 17)) {
                        if ((v4_16 == 12) && ((v26_1.zzb().equals(com.google.android.gms.internal.firebase-auth-api.zzamy.zza)) || ((v8_4 & 2048) != 0))) {
                            v4_18 = (v10_0 + 1);
                            v11_7[(((v9_6 / 3) << 1) + 1)] = v15_7[v10_0];
                            v10_0 = v4_18;
                        }
                    } else {
                        v4_18 = (v10_0 + 1);
                        v11_7[(((v9_6 / 3) << 1) + 1)] = v15_7[v10_0];
                    }
                    int v4_21;
                    int v0_24 = (v28_2 << 1);
                    int v4_19 = v15_7[v0_24];
                    int v25_2 = v0_24;
                    if (!(v4_19 instanceof reflect.Field)) {
                        v4_21 = com.google.android.gms.internal.firebase-auth-api.zzamq.zza(v3_1, ((String) v4_19));
                        v15_7[v25_2] = v4_21;
                    } else {
                        v4_21 = ((reflect.Field) v4_19);
                    }
                    com.google.android.gms.internal.firebase-auth-api.zzamy v6_25;
                    v29_1 = v6_1;
                    v28_0 = v7_2;
                    v0_8 = ((int) v14_8.objectFieldOffset(v4_21));
                    int v4_22 = (v25_2 + 1);
                    com.google.android.gms.internal.firebase-auth-api.zzamy v6_23 = v15_7[v4_22];
                    if (!(v6_23 instanceof reflect.Field)) {
                        v6_25 = com.google.android.gms.internal.firebase-auth-api.zzamq.zza(v3_1, ((String) v6_23));
                        v15_7[v4_22] = v6_25;
                    } else {
                        v6_25 = ((reflect.Field) v6_23);
                    }
                    v4_14 = ((int) v14_8.objectFieldOffset(v6_25));
                    v7_22 = v1_3;
                    v1_2 = 0;
                }
            }
            return new com.google.android.gms.internal.firebase-auth-api.zzamq(v6_1, v11_7, v12_3, v13_7, v0_37.zza(), 0, v16_5, v17_1, v18_1, p33, p34, p35, p36, p37);
        }
    }

    private final Object zza(int p5, int p6, java.util.Map p7, com.google.android.gms.internal.firebase-auth-api.zzalj p8, Object p9, com.google.android.gms.internal.firebase-auth-api.zzanu p10, Object p11)
    {
        java.io.IOException v5_2 = this.zzr.zza(this.zzf(p5));
        java.util.Iterator v7_2 = p7.entrySet().iterator();
        while (v7_2.hasNext()) {
            com.google.android.gms.internal.firebase-auth-api.zzajv v0_3 = ((java.util.Map$Entry) v7_2.next());
            if (!p8.zza(((Integer) v0_3.getValue()).intValue())) {
                if (p9 == null) {
                    p9 = p10.zzc(p11);
                }
                com.google.android.gms.internal.firebase-auth-api.zzake v1_6 = com.google.android.gms.internal.firebase-auth-api.zzajv.zzc(com.google.android.gms.internal.firebase-auth-api.zzame.zza(v5_2, v0_3.getKey(), v0_3.getValue()));
                try {
                    com.google.android.gms.internal.firebase-auth-api.zzame.zza(v1_6.zzb(), v5_2, v0_3.getKey(), v0_3.getValue());
                    p10.zza(p9, p6, v1_6.zza());
                    v7_2.remove();
                } catch (java.io.IOException v5_3) {
                    throw new RuntimeException(v5_3);
                }
            }
        }
        return p9;
    }

    private final Object zza(Object p4, int p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanb v0 = this.zze(p5);
        if (this.zzc(p4, p5)) {
            Object v4_1 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb.getObject(p4, ((long) (this.zzc(p5) & 1048575)));
            if (!com.google.android.gms.internal.firebase-auth-api.zzamq.zzg(v4_1)) {
                Object v5_3 = v0.zza();
                if (v4_1 != null) {
                    v0.zza(v5_3, v4_1);
                }
                return v5_3;
            } else {
                return v4_1;
            }
        } else {
            return v0.zza();
        }
    }

    private final Object zza(Object p4, int p5, int p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanb v0 = this.zze(p6);
        if (this.zzc(p4, p5, p6)) {
            Object v4_1 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb.getObject(p4, ((long) (this.zzc(p6) & 1048575)));
            if (!com.google.android.gms.internal.firebase-auth-api.zzamq.zzg(v4_1)) {
                Object v5_2 = v0.zza();
                if (v4_1 != null) {
                    v0.zza(v5_2, v4_1);
                }
                return v5_2;
            } else {
                return v4_1;
            }
        } else {
            return v0.zza();
        }
    }

    private final Object zza(Object p10, int p11, Object p12, com.google.android.gms.internal.firebase-auth-api.zzanu p13, Object p14)
    {
        int v3 = this.zzc[p11];
        Object v10_2 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p10, ((long) (this.zzc(p11) & 1048575)));
        if (v10_2 != null) {
            com.google.android.gms.internal.firebase-auth-api.zzalj v5 = this.zzd(p11);
            if (v5 != null) {
                return this.zza(p11, v3, this.zzr.zze(v10_2), v5, p12, p13, p14);
            }
        }
        return p12;
    }

    private static reflect.Field zza(Class p6, String p7)
    {
        try {
            String v6_1 = p6.getDeclaredField(p7);
            return v6_1;
        } catch (NoSuchFieldException v0) {
            String v1_1 = v6_1.getDeclaredFields();
            int v3_1 = 0;
        }
    }

    private static void zza(int p1, Object p2, com.google.android.gms.internal.firebase-auth-api.zzaol p3)
    {
        if (!(p2 instanceof String)) {
            p3.zza(p1, ((com.google.android.gms.internal.firebase-auth-api.zzajv) p2));
            return;
        } else {
            p3.zza(p1, ((String) p2));
            return;
        }
    }

    private static void zza(com.google.android.gms.internal.firebase-auth-api.zzanu p0, Object p1, com.google.android.gms.internal.firebase-auth-api.zzaol p2)
    {
        p0.zzb(p0.zzd(p1), p2);
        return;
    }

    private final void zza(com.google.android.gms.internal.firebase-auth-api.zzaol p2, int p3, Object p4, int p5)
    {
        if (p4 != null) {
            p2.zza(p3, this.zzr.zza(this.zzf(p5)), this.zzr.zzd(p4));
        }
        return;
    }

    private final void zza(Object p4, int p5, int p6, Object p7)
    {
        com.google.android.gms.internal.firebase-auth-api.zzamq.zzb.putObject(p4, ((long) (this.zzc(p6) & 1048575)), p7);
        this.zzb(p4, p5, p6);
        return;
    }

    private final void zza(Object p3, int p4, com.google.android.gms.internal.firebase-auth-api.zzanc p5)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzamq.zzg(p4)) {
            if (!this.zzi) {
                com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p3, ((long) (p4 & 1048575)), p5.zzp());
                return;
            } else {
                com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p3, ((long) (p4 & 1048575)), p5.zzq());
                return;
            }
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p3, ((long) (p4 & 1048575)), p5.zzr());
            return;
        }
    }

    private final void zza(Object p4, int p5, Object p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzamq.zzb.putObject(p4, ((long) (this.zzc(p5) & 1048575)), p6);
        this.zzb(p4, p5);
        return;
    }

    private final void zza(Object p6, Object p7, int p8)
    {
        if (this.zzc(p7, p8)) {
            StringBuilder v0_6 = ((long) (this.zzc(p8) & 1048575));
            sun.misc.Unsafe v2 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb;
            Object v3 = v2.getObject(p7, v0_6);
            if (v3 == null) {
                Object v8_1 = this.zzc[p8];
                String v7_1 = String.valueOf(p7);
                StringBuilder v0_3 = new StringBuilder("Source subfield ");
                v0_3.append(v8_1);
                v0_3.append(" is present but null: ");
                v0_3.append(v7_1);
                throw new IllegalStateException(v0_3.toString());
            } else {
                String v7_3 = this.zze(p8);
                if (this.zzc(p6, p8)) {
                    Object v8_3 = v2.getObject(p6, v0_6);
                    if (!com.google.android.gms.internal.firebase-auth-api.zzamq.zzg(v8_3)) {
                        Object v4_2 = v7_3.zza();
                        v7_3.zza(v4_2, v8_3);
                        v2.putObject(p6, v0_6, v4_2);
                        v8_3 = v4_2;
                    }
                    v7_3.zza(v8_3, v3);
                    return;
                } else {
                    if (com.google.android.gms.internal.firebase-auth-api.zzamq.zzg(v3)) {
                        Object v4_4 = v7_3.zza();
                        v7_3.zza(v4_4, v3);
                        v2.putObject(p6, v0_6, v4_4);
                    } else {
                        v2.putObject(p6, v0_6, v3);
                    }
                    this.zzb(p6, p8);
                    return;
                }
            }
        } else {
            return;
        }
    }

    private final boolean zza(Object p2, int p3, int p4, int p5, int p6)
    {
        if (p4 != 1048575) {
            if ((p5 & p6) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return this.zzc(p2, p3);
        }
    }

    private static boolean zza(Object p2, int p3, com.google.android.gms.internal.firebase-auth-api.zzanb p4)
    {
        return p4.zze(com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p2, ((long) (p3 & 1048575))));
    }

    private static float zzb(Object p0, long p1)
    {
        return ((Float) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p0, p1)).floatValue();
    }

    private final int zzb(int p2)
    {
        return this.zzc[(p2 + 2)];
    }

    private final void zzb(Object p5, int p6)
    {
        int v6_1 = this.zzb(p6);
        long v0_2 = ((long) (1048575 & v6_1));
        if (v0_2 != 1048575) {
            com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p5, v0_2, ((1 << (v6_1 >> 20)) | com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p5, v0_2)));
            return;
        } else {
            return;
        }
    }

    private final void zzb(Object p3, int p4, int p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p3, ((long) (this.zzb(p5) & 1048575)), p4);
        return;
    }

    private final void zzb(Object p7, Object p8, int p9)
    {
        Object v0_1 = this.zzc[p9];
        if (this.zzc(p8, v0_1, p9)) {
            String v1_4 = ((long) (this.zzc(p9) & 1048575));
            sun.misc.Unsafe v3 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb;
            Object v4 = v3.getObject(p8, v1_4);
            if (v4 == null) {
                Object v9_1 = this.zzc[p9];
                String v8_1 = String.valueOf(p8);
                Object v0_4 = new StringBuilder("Source subfield ");
                v0_4.append(v9_1);
                v0_4.append(" is present but null: ");
                v0_4.append(v8_1);
                throw new IllegalStateException(v0_4.toString());
            } else {
                String v8_3 = this.zze(p9);
                if (this.zzc(p7, v0_1, p9)) {
                    Object v9_3 = v3.getObject(p7, v1_4);
                    if (!com.google.android.gms.internal.firebase-auth-api.zzamq.zzg(v9_3)) {
                        Object v0_6 = v8_3.zza();
                        v8_3.zza(v0_6, v9_3);
                        v3.putObject(p7, v1_4, v0_6);
                        v9_3 = v0_6;
                    }
                    v8_3.zza(v9_3, v4);
                    return;
                } else {
                    if (com.google.android.gms.internal.firebase-auth-api.zzamq.zzg(v4)) {
                        Object v5_2 = v8_3.zza();
                        v8_3.zza(v5_2, v4);
                        v3.putObject(p7, v1_4, v5_2);
                    } else {
                        v3.putObject(p7, v1_4, v4);
                    }
                    this.zzb(p7, v0_1, p9);
                    return;
                }
            }
        } else {
            return;
        }
    }

    private final int zzc(int p2)
    {
        return this.zzc[(p2 + 1)];
    }

    private static int zzc(Object p0, long p1)
    {
        return ((Integer) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p0, p1)).intValue();
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzanx zzc(Object p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanx v0 = ((com.google.android.gms.internal.firebase-auth-api.zzalf) p2).zzb;
        if (v0 == com.google.android.gms.internal.firebase-auth-api.zzanx.zzc()) {
            v0 = com.google.android.gms.internal.firebase-auth-api.zzanx.zzd();
            ((com.google.android.gms.internal.firebase-auth-api.zzalf) p2).zzb = v0;
        }
        return v0;
    }

    private final boolean zzc(Object p8, int p9)
    {
        long v0_0 = this.zzb(p9);
        long v2_3 = ((long) (v0_0 & 1048575));
        if (v2_3 != 1048575) {
            if ((com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v2_3) & (1 << (v0_0 >> 20))) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzajv v9_3 = this.zzc(p9);
            long v0_2 = ((long) (v9_3 & 1048575));
            switch (((v9_3 & 267386880) >> 20)) {
                case 0:
                    if (Double.doubleToRawLongBits(com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p8, v0_2)) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 1:
                    if (Float.floatToRawIntBits(com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(p8, v0_2)) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 2:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 3:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 4:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 5:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 6:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 7:
                    return com.google.android.gms.internal.firebase-auth-api.zzanz.zzh(p8, v0_2);
                case 8:
                    IllegalArgumentException v8_30 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p8, v0_2);
                    if (!(v8_30 instanceof String)) {
                        if (!(v8_30 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                            throw new IllegalArgumentException();
                        } else {
                            if (com.google.android.gms.internal.firebase-auth-api.zzajv.zza.equals(v8_30)) {
                                return 0;
                            } else {
                                return 1;
                            }
                        }
                    } else {
                        if (((String) v8_30).isEmpty()) {
                            return 0;
                        } else {
                            return 1;
                        }
                    }
                case 9:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p8, v0_2) == null) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 10:
                    if (com.google.android.gms.internal.firebase-auth-api.zzajv.zza.equals(com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p8, v0_2))) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 11:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 12:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 13:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 14:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 15:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 16:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 17:
                    if (com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p8, v0_2) == null) {
                        return 0;
                    } else {
                        return 1;
                    }
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    private final boolean zzc(Object p3, int p4, int p5)
    {
        if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p3, ((long) (this.zzb(p5) & 1048575))) != p4) {
            return 0;
        } else {
            return 1;
        }
    }

    private final boolean zzc(Object p1, Object p2, int p3)
    {
        if (this.zzc(p1, p3) != this.zzc(p2, p3)) {
            return 0;
        } else {
            return 1;
        }
    }

    private static long zzd(Object p0, long p1)
    {
        return ((Long) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p0, p1)).longValue();
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzalj zzd(int p2)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzalj) this.zzd[(((p2 / 3) << 1) + 1)]);
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzanb zze(int p4)
    {
        int v4_2 = ((p4 / 3) << 1);
        com.google.android.gms.internal.firebase-auth-api.zzanb v0_3 = ((com.google.android.gms.internal.firebase-auth-api.zzanb) this.zzd[v4_2]);
        if (v0_3 == null) {
            com.google.android.gms.internal.firebase-auth-api.zzanb v0_0 = com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(((Class) this.zzd[(v4_2 + 1)]));
            this.zzd[v4_2] = v0_0;
            return v0_0;
        } else {
            return v0_3;
        }
    }

    private static boolean zze(Object p0, long p1)
    {
        return ((Boolean) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p0, p1)).booleanValue();
    }

    private final Object zzf(int p2)
    {
        return this.zzd[((p2 / 3) << 1)];
    }

    private static void zzf(Object p2)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzamq.zzg(p2)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(p2)));
        } else {
            return;
        }
    }

    private static boolean zzg(int p1)
    {
        if ((p1 & 536870912) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    private static boolean zzg(Object p1)
    {
        if (p1 != 0) {
            if (!(p1 instanceof com.google.android.gms.internal.firebase-auth-api.zzalf)) {
                return 1;
            } else {
                return ((com.google.android.gms.internal.firebase-auth-api.zzalf) p1).zzw();
            }
        } else {
            return 0;
        }
    }

    public final int zza(Object p18)
    {
        int v0_0 = this;
        Object v1_0 = p18;
        sun.misc.Unsafe v6 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb;
        int v7 = 0;
        int v8_11 = 1048575;
        int v2_11 = 0;
        com.google.android.gms.internal.firebase-auth-api.zzakz v4_6 = 0;
        int v9_5 = 0;
        int v3_3 = 1048575;
        while (v2_11 < v0_0.zzc.length) {
            int v11_2;
            int v5_140 = v0_0.zzc(v2_11);
            int v10_2 = ((267386880 & v5_140) >> 20);
            int v11_0 = v0_0.zzc;
            int v12 = v11_0[v2_11];
            int v11_1 = v11_0[(v2_11 + 2)];
            long v13_1 = (v11_1 & v8_11);
            if (v10_2 > 17) {
                v11_2 = 0;
            } else {
                if (v13_1 != v3_3) {
                    if (v13_1 != v8_11) {
                        v4_6 = v6.getInt(v1_0, ((long) v13_1));
                    } else {
                        v4_6 = 0;
                    }
                    v3_3 = v13_1;
                }
                v11_2 = (1 << (v11_1 >> 20));
            }
            long v13_2 = ((long) (v5_140 & v8_11));
            if (v10_2 >= com.google.android.gms.internal.firebase-auth-api.zzalc.zza.zza()) {
                com.google.android.gms.internal.firebase-auth-api.zzalc.zzb.zza();
            }
            int v5_4;
            int v0_3;
            int v9_2;
            int v5_37;
            int v5_6;
            int v0_1;
            int v8_10;
            int v16_1 = v9_5;
            switch (v10_2) {
                case 0:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                        v9_5 = v16_1;
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, 0);
                        v9_5 = (v5_6 + v16_1);
                    }
                    break;
                case 1:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                        v0_0 = this;
                        v1_0 = p18;
                    } else {
                        v0_3 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, 0);
                        v9_5 = (v0_3 + v16_1);
                        v0_0 = this;
                        v1_0 = p18;
                    }
                    break;
                case 2:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                        v0_0 = this;
                    } else {
                        v0_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(v12, v6.getLong(v1_0, v13_2));
                        v9_5 = (v0_1 + v16_1);
                        v0_0 = this;
                    }
                    break;
                case 3:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zze(v12, v6.getLong(v1_0, v13_2));
                    }
                    break;
                case 4:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(v12, v6.getInt(v1_0, v13_2));
                    }
                    break;
                case 5:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_3 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, 0);
                    }
                    break;
                case 6:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_3 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(v12, 0);
                    }
                    break;
                case 7:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_3 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, 1);
                    }
                    break;
                case 8:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        int v0_8 = v6.getObject(v1_0, v13_2);
                        if (!(v0_8 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                            v0_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, ((String) v0_8));
                        } else {
                            v0_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, ((com.google.android.gms.internal.firebase-auth-api.zzajv) v0_8));
                        }
                    }
                    break;
                case 9:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(v12, v6.getObject(v1_0, v13_2), v0_0.zze(v2_11));
                        v9_5 = (v16_1 + v5_4);
                    }
                    break;
                case 10:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, ((com.google.android.gms.internal.firebase-auth-api.zzajv) v6.getObject(v1_0, v13_2)));
                    }
                    break;
                case 11:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzf(v12, v6.getInt(v1_0, v13_2));
                    }
                    break;
                case 12:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, v6.getInt(v1_0, v13_2));
                    }
                    break;
                case 13:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_3 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzd(v12, 0);
                    }
                    break;
                case 14:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_3 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(v12, 0);
                    }
                    break;
                case 15:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zze(v12, v6.getInt(v1_0, v13_2));
                    }
                    break;
                case 16:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v0_1 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzd(v12, v6.getLong(v1_0, v13_2));
                    }
                    break;
                case 17:
                    if (!v0_0.zza(v1_0, v2_11, v3_3, v4_6, v11_2)) {
                    } else {
                        v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(v12, ((com.google.android.gms.internal.firebase-auth-api.zzamm) v6.getObject(v1_0, v13_2)), v0_0.zze(v2_11));
                    }
                    break;
                case 18:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzd(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 19:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzc(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 20:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzf(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 21:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzj(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 22:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zze(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 23:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzd(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 24:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzc(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 25:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 26:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzb(v12, ((java.util.List) v6.getObject(v1_0, v13_2)));
                    break;
                case 27:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzb(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), v0_0.zze(v2_11));
                    break;
                case 28:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(v12, ((java.util.List) v6.getObject(v1_0, v13_2)));
                    break;
                case 29:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzi(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 30:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzb(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 31:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzc(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 32:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzd(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 33:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzg(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 34:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zzh(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), 0);
                    break;
                case 35:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzd(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                        v9_5 = (((v9_2 + v8_10) + v5_37) + v16_1);
                    }
                    break;
                case 36:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzc(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 37:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzf(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 38:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzj(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 39:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zze(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 40:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzd(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 41:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzc(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 42:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 43:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzi(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 44:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzb(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 45:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzc(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 46:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzd(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 47:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzg(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 48:
                    v5_37 = com.google.android.gms.internal.firebase-auth-api.zzand.zzh(((java.util.List) v6.getObject(v1_0, v13_2)));
                    if (v5_37 <= 0) {
                    } else {
                        v8_10 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzh(v12);
                        v9_2 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzi(v5_37);
                    }
                    break;
                case 49:
                    v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(v12, ((java.util.List) v6.getObject(v1_0, v13_2)), v0_0.zze(v2_11));
                    break;
                case 50:
                    v5_4 = v0_0.zzr.zza(v12, v6.getObject(v1_0, v13_2), v0_0.zzf(v2_11));
                    break;
                case 51:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, 0);
                    }
                    break;
                case 52:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, 0);
                    }
                    break;
                case 53:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(v12, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(v1_0, v13_2));
                    }
                    break;
                case 54:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zze(v12, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(v1_0, v13_2));
                    }
                    break;
                case 55:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(v12, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(v1_0, v13_2));
                    }
                    break;
                case 56:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, 0);
                    }
                    break;
                case 57:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzb(v12, 0);
                    }
                    break;
                case 58:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, 1);
                    }
                    break;
                case 59:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        int v5_21 = v6.getObject(v1_0, v13_2);
                        if (!(v5_21 instanceof com.google.android.gms.internal.firebase-auth-api.zzajv)) {
                            v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, ((String) v5_21));
                        } else {
                            v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, ((com.google.android.gms.internal.firebase-auth-api.zzajv) v5_21));
                        }
                    }
                    break;
                case 60:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(v12, v6.getObject(v1_0, v13_2), v0_0.zze(v2_11));
                    }
                    break;
                case 61:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, ((com.google.android.gms.internal.firebase-auth-api.zzajv) v6.getObject(v1_0, v13_2)));
                    }
                    break;
                case 62:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzf(v12, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(v1_0, v13_2));
                    }
                    break;
                case 63:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zza(v12, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(v1_0, v13_2));
                    }
                    break;
                case 64:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzd(v12, 0);
                    }
                    break;
                case 65:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzc(v12, 0);
                    }
                    break;
                case 66:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zze(v12, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(v1_0, v13_2));
                    }
                    break;
                case 67:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_6 = com.google.android.gms.internal.firebase-auth-api.zzakn.zzd(v12, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(v1_0, v13_2));
                    }
                    break;
                case 68:
                    if (!v0_0.zzc(v1_0, v12, v2_11)) {
                    } else {
                        v5_4 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(v12, ((com.google.android.gms.internal.firebase-auth-api.zzamm) v6.getObject(v1_0, v13_2)), v0_0.zze(v2_11));
                    }
                    break;
                default:
            }
            v2_11 += 3;
            v8_11 = 1048575;
        }
        int v2_0 = v0_0.zzp;
        int v9_0 = (v9_5 + v2_0.zza(v2_0.zzd(v1_0)));
        if (v0_0.zzh) {
            Object v1_1 = v0_0.zzq.zza(v1_0);
            int v2_5 = v1_1.zza.zzb();
            int v3_1 = 0;
            while (v7 < v2_5) {
                com.google.android.gms.internal.firebase-auth-api.zzakz v4_3 = v1_1.zza.zza(v7);
                v3_1 += com.google.android.gms.internal.firebase-auth-api.zzakx.zza(((com.google.android.gms.internal.firebase-auth-api.zzakz) v4_3.getKey()), v4_3.getValue());
                v7++;
            }
            Object v1_4 = v1_1.zza.zzc().iterator();
            while (v1_4.hasNext()) {
                int v2_8 = ((java.util.Map$Entry) v1_4.next());
                v3_1 += com.google.android.gms.internal.firebase-auth-api.zzakx.zza(((com.google.android.gms.internal.firebase-auth-api.zzakz) v2_8.getKey()), v2_8.getValue());
            }
            v9_0 += v3_1;
        }
        return v9_0;
    }

    public final int zza(Object p30, byte[] p31, int p32, int p33, int p34, com.google.android.gms.internal.firebase-auth-api.zzaju p35)
    {
        void v0 = this;
        byte[] v2_0 = p30;
        com.google.android.gms.internal.firebase-auth-api.zzajv v3_20 = p31;
        Object v5_21 = p33;
        com.google.android.gms.internal.firebase-auth-api.zzajv v6_14 = p35;
        com.google.android.gms.internal.firebase-auth-api.zzamq.zzf(p30);
        com.google.android.gms.internal.firebase-auth-api.zzall v1_23 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb;
        int v4_2 = p32;
        int v7_7 = -1;
        int v8_4 = 0;
        int v9_0 = 1048575;
        String v14_1 = 0;
        int v15_1 = 0;
        while (v4_2 < v5_21) {
            int v15_6 = (v4_2 + 1);
            int v4_27 = v3_20[v4_2];
            if (v4_27 < 0) {
                v15_6 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v4_27, v3_20, v15_6, v6_14);
                v4_27 = v6_14.zza;
            }
            int v7_18;
            v15_1 = v4_27;
            int v4_28 = v15_6;
            Object v12_1 = (v15_1 >> 3);
            java.nio.charset.Charset v11_12 = (v15_1 & 7);
            if (v12_1 <= v7_7) {
                v7_18 = v0.zza(v12_1);
            } else {
                if ((v12_1 < v0.zze) || (v12_1 > v0.zzf)) {
                    v7_18 = -1;
                } else {
                    v7_18 = v0.zza(v12_1, (v8_4 / 3));
                }
            }
            Object v12_0;
            String v20_0;
            int v9_8;
            int v18_0;
            int v10_12;
            int v23_0;
            int v19_0;
            com.google.android.gms.internal.firebase-auth-api.zzall v1_47;
            String v14_2;
            com.google.android.gms.internal.firebase-auth-api.zzall v1_15;
            com.google.android.gms.internal.firebase-auth-api.zzajv v3_8;
            int v15_0;
            if (v7_18 != -1) {
                int v8_12 = v0.zzc;
                long v13_17 = v8_12[(v7_18 + 1)];
                com.google.android.gms.internal.firebase-auth-api.zzajv v3_77 = ((v13_17 & 267386880) >> 20);
                int v18_7 = v4_28;
                int v19_4 = ((long) (v13_17 & 1048575));
                byte[] v24_3 = v8_12;
                if (v3_77 > 17) {
                    String v14_3;
                    Object v5_22;
                    byte[] v2_39 = v1_23;
                    com.google.android.gms.internal.firebase-auth-api.zzall v1_75 = v2_0;
                    v8_4 = v7_18;
                    int v15_7 = v6_14;
                    com.google.android.gms.internal.firebase-auth-api.zzajv v6_30 = v19_4;
                    int v19_5 = v18_7;
                    int v18_9 = v15_1;
                    if (v3_77 != 27) {
                        int v15_8 = v1_75;
                        int v4_48 = v19_5;
                        if (v3_77 > 49) {
                            v18_0 = v9_0;
                            v9_8 = v18_9;
                            v15_0 = v12_1;
                            v12_0 = v15_8;
                            com.google.android.gms.internal.firebase-auth-api.zzall v1_56 = p35;
                            int v10_33 = v2_39;
                            v20_0 = v14_1;
                            byte[] v2_31 = p31;
                            v14_3 = v4_48;
                            if (v3_77 != 50) {
                                int v8_7;
                                int v10_15;
                                Object v5_55;
                                Object v5_14;
                                v1_15 = p31;
                                v19_0 = v10_33;
                                byte[] v2_44 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb;
                                com.google.android.gms.internal.firebase-auth-api.zzajv v3_0 = ((long) (v24_3[(v8_4 + 2)] & 1048575));
                                switch (v3_77) {
                                    case 51:
                                        v23_0 = v8_4;
                                        v8_7 = v14_3;
                                        v14_2 = p35;
                                        if (v11_12 != 1) {
                                            v4_2 = v8_7;
                                        } else {
                                            v2_44.putObject(v12_0, v6_30, Double.valueOf(com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p31, v8_7)));
                                            v5_55 = (v8_7 + 8);
                                            v2_44.putInt(v12_0, v3_0, v15_0);
                                            v4_2 = v5_55;
                                        }
                                        break;
                                    case 52:
                                        v23_0 = v8_4;
                                        v8_7 = v14_3;
                                        v14_2 = p35;
                                        if (v11_12 != 5) {
                                        } else {
                                            v2_44.putObject(v12_0, v6_30, Float.valueOf(com.google.android.gms.internal.firebase-auth-api.zzajr.zzb(p31, v8_7)));
                                            v5_55 = (v8_7 + 4);
                                            v2_44.putInt(v12_0, v3_0, v15_0);
                                        }
                                        break;
                                    case 53:
                                    case 54:
                                        v23_0 = v8_4;
                                        v8_7 = v14_3;
                                        v14_2 = p35;
                                        if (v11_12 != null) {
                                        } else {
                                            v5_55 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v8_7, p35);
                                            v2_44.putObject(v12_0, v6_30, Long.valueOf(p35.zzb));
                                            v2_44.putInt(v12_0, v3_0, v15_0);
                                        }
                                        break;
                                    case 55:
                                    case 62:
                                        v23_0 = v8_4;
                                        v8_7 = v14_3;
                                        v14_2 = p35;
                                        if (v11_12 != null) {
                                        } else {
                                            v5_55 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v8_7, p35);
                                            v2_44.putObject(v12_0, v6_30, Integer.valueOf(p35.zza));
                                            v2_44.putInt(v12_0, v3_0, v15_0);
                                        }
                                        break;
                                    case 56:
                                    case 65:
                                        v23_0 = v8_4;
                                        v8_7 = v14_3;
                                        v14_2 = p35;
                                        if (v11_12 != 1) {
                                        } else {
                                            v2_44.putObject(v12_0, v6_30, Long.valueOf(com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v8_7)));
                                            v5_55 = (v8_7 + 8);
                                            v2_44.putInt(v12_0, v3_0, v15_0);
                                        }
                                        break;
                                    case 57:
                                    case 64:
                                        v23_0 = v8_4;
                                        v8_7 = v14_3;
                                        v14_2 = p35;
                                        if (v11_12 != 5) {
                                        } else {
                                            v2_44.putObject(v12_0, v6_30, Integer.valueOf(com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v8_7)));
                                            v5_55 = (v8_7 + 4);
                                            v2_44.putInt(v12_0, v3_0, v15_0);
                                        }
                                        break;
                                    case 58:
                                        v23_0 = v8_4;
                                        v8_7 = v14_3;
                                        v14_2 = p35;
                                        if (v11_12 != null) {
                                        } else {
                                            int v25_0;
                                            v5_55 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v8_7, p35);
                                            if (p35.zzb == 0) {
                                                v25_0 = 0;
                                            } else {
                                                v25_0 = 1;
                                            }
                                            v2_44.putObject(v12_0, v6_30, Boolean.valueOf(v25_0));
                                            v2_44.putInt(v12_0, v3_0, v15_0);
                                        }
                                        break;
                                    case 59:
                                        v23_0 = v8_4;
                                        v8_7 = v14_3;
                                        v14_2 = p35;
                                        if (v11_12 != 2) {
                                        } else {
                                            int v10_19 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v8_7, p35);
                                            java.nio.charset.Charset v11_11 = p35.zza;
                                            if (v11_11 != null) {
                                                if (((536870912 & v13_17) != 0) && (!com.google.android.gms.internal.firebase-auth-api.zzaoa.zzc(p31, v10_19, (v10_19 + v11_11)))) {
                                                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzd();
                                                } else {
                                                    v2_44.putObject(v12_0, v6_30, new String(p31, v10_19, v11_11, com.google.android.gms.internal.firebase-auth-api.zzalh.zza));
                                                    v10_19 += v11_11;
                                                }
                                            } else {
                                                v2_44.putObject(v12_0, v6_30, "");
                                            }
                                            v2_44.putInt(v12_0, v3_0, v15_0);
                                            v4_2 = v10_19;
                                        }
                                        break;
                                    case 60:
                                        if (v11_12 != 2) {
                                            v14_2 = p35;
                                            v23_0 = v8_4;
                                            v8_7 = v14_3;
                                        } else {
                                            com.google.android.gms.internal.firebase-auth-api.zzall v1_48 = v0.zza(v12_0, v15_0, v8_4);
                                            int v4_26 = v14_3;
                                            byte[] v2_24 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v1_48, v0.zze(v8_4), p31, v4_26, p33, p35);
                                            v1_15 = p31;
                                            v14_2 = p35;
                                            v0 = v0.zza(v12_0, v15_0, v8_4, v1_48);
                                            v23_0 = v8_4;
                                            v8_7 = v4_26;
                                            v4_2 = v2_24;
                                        }
                                        break;
                                    case 61:
                                        v5_14 = p35;
                                        if (v11_12 != 2) {
                                            v23_0 = v8_4;
                                            v8_7 = v14_3;
                                            v14_2 = v5_14;
                                        } else {
                                            v10_15 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p31, v14_3, p35);
                                            v2_44.putObject(v12_0, v6_30, p35.zzc);
                                            v2_44.putInt(v12_0, v3_0, v15_0);
                                            v23_0 = v8_4;
                                            v4_2 = v10_15;
                                            v8_7 = v14_3;
                                            v14_2 = v5_14;
                                        }
                                        break;
                                    case 63:
                                        v5_14 = p35;
                                        if (v11_12 != null) {
                                        } else {
                                            v10_15 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v14_3, p35);
                                            java.nio.charset.Charset v11_8 = p35.zza;
                                            long v13_10 = v0.zzd(v8_4);
                                            if ((v13_10 != 0) && (!v13_10.zza(v11_8))) {
                                                com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(v12_0).zza(v9_8, Long.valueOf(((long) v11_8)));
                                            } else {
                                                v2_44.putObject(v12_0, v6_30, Integer.valueOf(v11_8));
                                                v2_44.putInt(v12_0, v3_0, v15_0);
                                            }
                                        }
                                        break;
                                    case 66:
                                        v5_14 = p35;
                                        if (v11_12 != null) {
                                        } else {
                                            v10_15 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v14_3, p35);
                                            v2_44.putObject(v12_0, v6_30, Integer.valueOf(com.google.android.gms.internal.firebase-auth-api.zzakh.zza(p35.zza)));
                                            v2_44.putInt(v12_0, v3_0, v15_0);
                                        }
                                        break;
                                    case 67:
                                        v5_14 = p35;
                                        if (v11_12 != null) {
                                        } else {
                                            int v32_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v14_3, p35);
                                            v2_44.putObject(v12_0, v6_30, Long.valueOf(com.google.android.gms.internal.firebase-auth-api.zzakh.zza(p35.zzb)));
                                            v2_44.putInt(v12_0, v3_0, v15_0);
                                            v4_2 = v32_1;
                                            v23_0 = v8_4;
                                        }
                                        break;
                                    case 68:
                                        if (v11_12 != 3) {
                                            v23_0 = v8_4;
                                            v8_7 = v14_3;
                                            v14_2 = p35;
                                        } else {
                                            com.google.android.gms.internal.firebase-auth-api.zzall v1_5 = v0.zza(v12_0, v15_0, v8_4);
                                            byte[] v2_4 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v1_5, v0.zze(v8_4), p31, v14_3, p33, ((v9_8 & -8) | 4), p35);
                                            v1_15 = p31;
                                            v5_14 = p35;
                                            v0 = v0.zza(v12_0, v15_0, v8_4, v1_5);
                                            v4_2 = v2_4;
                                        }
                                        break;
                                    default:
                                }
                                v10_12 = p34;
                                if (v4_2 != v8_7) {
                                    v1_47 = v9_8;
                                    v3_20 = p31;
                                    v5_21 = p33;
                                    v6_14 = p35;
                                    v2_0 = v12_0;
                                    v7_7 = v15_0;
                                    v9_0 = v18_0;
                                    v14_1 = v20_0;
                                    v8_4 = v23_0;
                                    v15_1 = v1_47;
                                    v1_23 = v19_0;
                                } else {
                                    v3_8 = v4_2;
                                    if ((v9_8 == v10_12) && (v10_12 != 0)) {
                                        long v13_12 = p33;
                                        com.google.android.gms.internal.firebase-auth-api.zzajv v6_19 = v3_8;
                                        v15_1 = v9_8;
                                        v9_0 = v18_0;
                                        v14_1 = v20_0;
                                        if (v9_0 != 1048575) {
                                            v19_0.putInt(v12_0, ((long) v9_0), v14_1);
                                        }
                                        int v7_16 = v0.zzl;
                                        com.google.android.gms.internal.firebase-auth-api.zzajv v3_61 = 0;
                                        while (v7_16 < v0.zzm) {
                                            v3_61 = ((com.google.android.gms.internal.firebase-auth-api.zzanx) v0.zza(v12_0, v0.zzk[v7_16], v3_61, v0.zzp, p30));
                                            v7_16++;
                                        }
                                        if (v3_61 != null) {
                                            v0.zzp.zzb(v12_0, v3_61);
                                        }
                                        if (v10_12 != 0) {
                                            if ((v6_19 > v13_12) || (v15_1 != v10_12)) {
                                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzg();
                                            }
                                        } else {
                                            if (v6_19 != v13_12) {
                                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzg();
                                            }
                                        }
                                        return v6_19;
                                    } else {
                                        if ((!v0.zzh) || (v14_2.zzd == com.google.android.gms.internal.firebase-auth-api.zzaku.zza)) {
                                            com.google.android.gms.internal.firebase-auth-api.zzall v1_46 = v9_8;
                                            v6_14 = p35;
                                            v5_21 = p33;
                                            v2_0 = v12_0;
                                            v7_7 = v15_0;
                                            v9_0 = v18_0;
                                            v14_1 = v20_0;
                                            v8_4 = v23_0;
                                            v15_1 = v1_46;
                                            v4_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v1_46, p31, v3_8, p33, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(v12_0), p35);
                                            v1_23 = v19_0;
                                            v3_20 = p31;
                                        } else {
                                            v1_47 = v9_8;
                                            Object v5_47 = v12_0;
                                            v6_14 = p35;
                                            v4_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v1_47, v1_15, v3_8, p33, v5_47, v0.zzg, v0.zzp, v14_2);
                                            v2_0 = v5_47;
                                            v7_7 = v15_0;
                                            v9_0 = v18_0;
                                            v14_1 = v20_0;
                                            v8_4 = v23_0;
                                            v3_20 = p31;
                                            v5_21 = p33;
                                        }
                                    }
                                }
                            } else {
                                if (v11_12 != 2) {
                                    v5_22 = p35;
                                    v1_15 = p31;
                                    v19_0 = v10_33;
                                } else {
                                    com.google.android.gms.internal.firebase-auth-api.zzajv v3_67 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb;
                                    int v4_30 = v0.zzf(v8_4);
                                    Object v5_66 = v3_67.getObject(v12_0, v6_30);
                                    if (v0.zzr.zzf(v5_66)) {
                                        java.nio.charset.Charset v11_16 = v0.zzr.zzb(v4_30);
                                        v0.zzr.zza(v11_16, v5_66);
                                        v3_67.putObject(v12_0, v6_30, v11_16);
                                        v5_66 = v11_16;
                                    }
                                    int v7_19 = v0.zzr.zza(v4_30);
                                    java.nio.charset.Charset v11_17 = v0.zzr.zze(v5_66);
                                    com.google.android.gms.internal.firebase-auth-api.zzajv v3_70 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v14_3, p35);
                                    int v4_31 = p35.zza;
                                    if ((v4_31 < 0) || (v4_31 > (p33 - v3_70))) {
                                        throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                    } else {
                                        long v13_16 = (v3_70 + v4_31);
                                        int v4_32 = v7_19.zzb;
                                        Object v5_68 = v7_19.zzd;
                                        while (v3_70 < v13_16) {
                                            com.google.android.gms.internal.firebase-auth-api.zzajv v6_22 = (v3_70 + 1);
                                            com.google.android.gms.internal.firebase-auth-api.zzajv v3_71 = v2_31[v3_70];
                                            if (v3_71 < null) {
                                                v6_22 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v3_71, v2_31, v6_22, v1_56);
                                                v3_71 = v1_56.zza;
                                            }
                                            int v19_2;
                                            Object v5_70;
                                            byte[] v2_27;
                                            int v4_37;
                                            int v10_30;
                                            com.google.android.gms.internal.firebase-auth-api.zzall v1_54;
                                            com.google.android.gms.internal.firebase-auth-api.zzall v1_52 = (v3_71 >> 3);
                                            byte[] v2_26 = (v3_71 & 7);
                                            int v32_10 = v4_32;
                                            if (v1_52 == 1) {
                                                com.google.android.gms.internal.firebase-auth-api.zzall v1_53 = v6_22;
                                                v19_2 = v10_33;
                                                v10_30 = v32_10;
                                                if (v2_26 != v7_19.zza.zza()) {
                                                    v4_37 = p33;
                                                    v2_27 = v5_68;
                                                    v5_70 = p35;
                                                    v6_22 = v1_53;
                                                    v1_54 = p31;
                                                    v3_70 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v3_71, v1_54, v6_22, v4_37, v5_70);
                                                    v2_31 = v1_54;
                                                    v1_56 = v5_70;
                                                    v5_68 = v2_27;
                                                    v4_32 = v10_30;
                                                } else {
                                                    v4_32 = p35.zzc;
                                                    v3_70 = com.google.android.gms.internal.firebase-auth-api.zzamq.zza(p31, v1_53, p33, v7_19.zza, 0, p35);
                                                    v2_31 = p31;
                                                    v1_56 = p35;
                                                }
                                            } else {
                                                if (v1_52 == 2) {
                                                    if (v2_26 != v7_19.zzc.zza()) {
                                                        v19_2 = v10_33;
                                                        v10_30 = v32_10;
                                                        v1_54 = p31;
                                                        v4_37 = p33;
                                                        v2_27 = v5_68;
                                                    } else {
                                                        v5_68 = p35.zzc;
                                                        v3_70 = com.google.android.gms.internal.firebase-auth-api.zzamq.zza(p31, v6_22, p33, v7_19.zzc, v7_19.zzd.getClass(), p35);
                                                        v1_56 = p35;
                                                        v4_32 = v32_10;
                                                        v2_31 = p31;
                                                    }
                                                } else {
                                                    v1_54 = p31;
                                                    v4_37 = p33;
                                                    v2_27 = v5_68;
                                                    v19_2 = v10_33;
                                                    v10_30 = v32_10;
                                                }
                                                v5_70 = p35;
                                            }
                                            v10_33 = v19_2;
                                        }
                                        Object v5_69 = v1_56;
                                        v1_15 = v2_31;
                                        v19_0 = v10_33;
                                        if (v3_70 != v13_16) {
                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzg();
                                        } else {
                                            v11_17.put(v4_32, v5_68);
                                            if (v13_16 != v14_3) {
                                                v3_20 = v1_15;
                                                v6_14 = v5_69;
                                                v2_0 = v12_0;
                                                v7_7 = v15_0;
                                                v1_23 = v19_0;
                                                v14_1 = v20_0;
                                                v5_21 = p33;
                                                v15_1 = v9_8;
                                                v4_2 = v13_16;
                                                v9_0 = v18_0;
                                            } else {
                                                v10_12 = p34;
                                                v14_2 = v5_69;
                                                v23_0 = v8_4;
                                                v3_8 = v13_16;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            v19_0 = v2_39;
                            long v13_18 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb;
                            byte[] v26_1 = ((long) v13_17);
                            com.google.android.gms.internal.firebase-auth-api.zzall v1_63 = ((com.google.android.gms.internal.firebase-auth-api.zzalm) v13_18.getObject(v15_8, v6_30));
                            if (!v1_63.zzc()) {
                                v1_63 = v1_63.zza((v1_63.size() << 1));
                                v13_18.putObject(v15_8, v6_30, v1_63);
                            }
                            com.google.android.gms.internal.firebase-auth-api.zzajv v6_0;
                            String v14_0;
                            Object v5_0;
                            int v7_24;
                            byte[] v2_1;
                            com.google.android.gms.internal.firebase-auth-api.zzajv v6_26;
                            int v32_11;
                            com.google.android.gms.internal.firebase-auth-api.zzall v1_3;
                            Object v5_75;
                            long v13_20;
                            com.google.android.gms.internal.firebase-auth-api.zzall v1_8;
                            int v4_0;
                            byte[] v2_38;
                            com.google.android.gms.internal.firebase-auth-api.zzajv v3_78;
                            int v7_0;
                            com.google.android.gms.internal.firebase-auth-api.zzajv v6_25 = v1_63;
                            switch (v3_77) {
                                case 18:
                                case 35:
                                    v18_0 = v9_0;
                                    v9_8 = v18_9;
                                    v15_0 = v12_1;
                                    v12_0 = v15_8;
                                    v2_1 = p31;
                                    v1_8 = p35;
                                    Object v5_16 = v6_25;
                                    v20_0 = v14_1;
                                    v14_0 = v4_48;
                                    v4_0 = p33;
                                    if (v11_12 != 2) {
                                        if (v11_12 != 1) {
                                            v3_8 = v14_0;
                                        } else {
                                            com.google.android.gms.internal.firebase-auth-api.zzajv v6_11 = ((com.google.android.gms.internal.firebase-auth-api.zzaks) v5_16);
                                            v6_11.zza(com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p31, v14_0));
                                            v3_8 = (v14_0 + 8);
                                            while (v3_8 < p33) {
                                                Object v5_17 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v3_8, p35);
                                                if (v9_8 != p35.zza) {
                                                    break;
                                                }
                                                v6_11.zza(com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p31, v5_17));
                                                v3_8 = (v5_17 + 8);
                                            }
                                        }
                                    } else {
                                        com.google.android.gms.internal.firebase-auth-api.zzajv v6_13 = ((com.google.android.gms.internal.firebase-auth-api.zzaks) v5_16);
                                        v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v14_0, p35);
                                        Object v5_18 = p35.zza;
                                        int v7_6 = (v3_8 + v5_18);
                                        if (v7_6 > p31.length) {
                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                        } else {
                                            v6_13.zzc(((v5_18 / 8) + v6_13.size()));
                                            while (v3_8 < v7_6) {
                                                v6_13.zza(com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p31, v3_8));
                                                v3_8 += 8;
                                            }
                                            if (v3_8 != v7_6) {
                                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                            } else {
                                            }
                                        }
                                    }
                                case 19:
                                case 36:
                                    v18_0 = v9_0;
                                    v9_8 = v18_9;
                                    v15_0 = v12_1;
                                    v12_0 = v15_8;
                                    v2_1 = p31;
                                    v1_8 = p35;
                                    Object v5_8 = v6_25;
                                    v20_0 = v14_1;
                                    v14_0 = v4_48;
                                    v4_0 = p33;
                                    if (v11_12 != 2) {
                                        if (v11_12 != 5) {
                                        } else {
                                            com.google.android.gms.internal.firebase-auth-api.zzajv v6_7 = ((com.google.android.gms.internal.firebase-auth-api.zzald) v5_8);
                                            v6_7.zza(com.google.android.gms.internal.firebase-auth-api.zzajr.zzb(p31, v14_0));
                                            v3_8 = (v14_0 + 4);
                                            while (v3_8 < p33) {
                                                Object v5_10 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v3_8, p35);
                                                if (v9_8 != p35.zza) {
                                                    break;
                                                }
                                                v6_7.zza(com.google.android.gms.internal.firebase-auth-api.zzajr.zzb(p31, v5_10));
                                                v3_8 = (v5_10 + 4);
                                            }
                                        }
                                    } else {
                                        com.google.android.gms.internal.firebase-auth-api.zzajv v6_9 = ((com.google.android.gms.internal.firebase-auth-api.zzald) v5_8);
                                        v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v14_0, p35);
                                        Object v5_11 = p35.zza;
                                        int v7_4 = (v3_8 + v5_11);
                                        if (v7_4 > p31.length) {
                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                        } else {
                                            v6_9.zzc(((v5_11 / 4) + v6_9.size()));
                                            while (v3_8 < v7_4) {
                                                v6_9.zza(com.google.android.gms.internal.firebase-auth-api.zzajr.zzb(p31, v3_8));
                                                v3_8 += 4;
                                            }
                                            if (v3_8 != v7_4) {
                                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                            } else {
                                            }
                                        }
                                    }
                                    break;
                                case 20:
                                case 21:
                                case 37:
                                case 38:
                                    v18_0 = v9_0;
                                    v9_8 = v18_9;
                                    v15_0 = v12_1;
                                    v12_0 = v15_8;
                                    v2_1 = p31;
                                    v1_8 = p35;
                                    Object v5_3 = v6_25;
                                    v20_0 = v14_1;
                                    v14_0 = v4_48;
                                    v4_0 = p33;
                                    if (v11_12 != 2) {
                                        if (v11_12 != null) {
                                        } else {
                                            com.google.android.gms.internal.firebase-auth-api.zzajv v6_3 = ((com.google.android.gms.internal.firebase-auth-api.zzalx) v5_3);
                                            v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v14_0, p35);
                                            v6_3.zza(p35.zzb);
                                            while (v3_8 < p33) {
                                                Object v5_5 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v3_8, p35);
                                                if (v9_8 != p35.zza) {
                                                    break;
                                                }
                                                v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v5_5, p35);
                                                v6_3.zza(p35.zzb);
                                            }
                                        }
                                    } else {
                                        com.google.android.gms.internal.firebase-auth-api.zzajv v6_5 = ((com.google.android.gms.internal.firebase-auth-api.zzalx) v5_3);
                                        v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v14_0, p35);
                                        Object v5_7 = (p35.zza + v3_8);
                                        while (v3_8 < v5_7) {
                                            v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v3_8, p35);
                                            v6_5.zza(p35.zzb);
                                        }
                                        if (v3_8 != v5_7) {
                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                        } else {
                                        }
                                    }
                                    break;
                                case 22:
                                case 29:
                                case 39:
                                case 43:
                                    v15_0 = v12_1;
                                    v12_0 = v15_8;
                                    v2_1 = p31;
                                    v7_0 = v4_48;
                                    long v13_7 = v6_25;
                                    v20_0 = v14_1;
                                    v1_3 = v18_9;
                                    v4_0 = p33;
                                    v6_0 = p35;
                                    v18_0 = v9_0;
                                    if (v11_12 != 2) {
                                        if (v11_12 != null) {
                                            v9_8 = v1_3;
                                            v1_8 = v6_0;
                                            v14_0 = v7_0;
                                        } else {
                                            com.google.android.gms.internal.firebase-auth-api.zzajv v3_10 = v7_0;
                                            v9_8 = v1_3;
                                            v14_0 = v3_10;
                                            v1_8 = p35;
                                            v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v1_3, p31, v3_10, p33, v13_7, p35);
                                        }
                                    } else {
                                        v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p31, v7_0, v13_7, p35);
                                        v9_8 = v1_3;
                                        v1_8 = v6_0;
                                        v14_0 = v7_0;
                                    }
                                    break;
                                case 23:
                                case 32:
                                case 40:
                                case 46:
                                    v15_0 = v12_1;
                                    v12_0 = v15_8;
                                    v2_1 = p31;
                                    v7_0 = v4_48;
                                    long v13_1 = v6_25;
                                    v20_0 = v14_1;
                                    v1_3 = v18_9;
                                    v4_0 = p33;
                                    v6_0 = p35;
                                    v18_0 = v9_0;
                                    if (v11_12 != 2) {
                                        if (v11_12 != 1) {
                                        } else {
                                            com.google.android.gms.internal.firebase-auth-api.zzajv v3_5 = ((com.google.android.gms.internal.firebase-auth-api.zzalx) v13_1);
                                            v3_5.zza(com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v7_0));
                                            v5_0 = (v7_0 + 8);
                                            while (v5_0 < p33) {
                                                int v9_4 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v5_0, p35);
                                                if (v1_3 != p35.zza) {
                                                    break;
                                                }
                                                v3_5.zza(com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v9_4));
                                                v5_0 = (v9_4 + 8);
                                            }
                                            v9_8 = v1_3;
                                            v3_8 = v5_0;
                                        }
                                    } else {
                                        com.google.android.gms.internal.firebase-auth-api.zzajv v3_7 = ((com.google.android.gms.internal.firebase-auth-api.zzalx) v13_1);
                                        v5_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v7_0, p35);
                                        int v9_5 = p35.zza;
                                        java.nio.charset.Charset v11_1 = (v5_0 + v9_5);
                                        if (v11_1 > p31.length) {
                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                        } else {
                                            v3_7.zzc(((v9_5 / 8) + v3_7.size()));
                                            while (v5_0 < v11_1) {
                                                v3_7.zza(com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v5_0));
                                                v5_0 += 8;
                                            }
                                            if (v5_0 != v11_1) {
                                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                            }
                                        }
                                    }
                                    break;
                                case 24:
                                case 31:
                                case 41:
                                case 45:
                                    v15_0 = v12_1;
                                    v12_0 = v15_8;
                                    v2_1 = p31;
                                    v7_0 = v4_48;
                                    long v13_26 = v6_25;
                                    v20_0 = v14_1;
                                    v1_3 = v18_9;
                                    v4_0 = p33;
                                    v6_0 = p35;
                                    v18_0 = v9_0;
                                    if (v11_12 != 2) {
                                        if (v11_12 != 5) {
                                        } else {
                                            com.google.android.gms.internal.firebase-auth-api.zzajv v3_98 = ((com.google.android.gms.internal.firebase-auth-api.zzali) v13_26);
                                            v3_98.zzc(com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v7_0));
                                            v5_0 = (v7_0 + 4);
                                            while (v5_0 < p33) {
                                                int v9_32 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v5_0, p35);
                                                if (v1_3 != p35.zza) {
                                                    break;
                                                }
                                                v3_98.zzc(com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v9_32));
                                                v5_0 = (v9_32 + 4);
                                            }
                                        }
                                    } else {
                                        com.google.android.gms.internal.firebase-auth-api.zzajv v3_100 = ((com.google.android.gms.internal.firebase-auth-api.zzali) v13_26);
                                        v5_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v7_0, p35);
                                        int v9_33 = p35.zza;
                                        java.nio.charset.Charset v11_46 = (v5_0 + v9_33);
                                        if (v11_46 > p31.length) {
                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                        } else {
                                            v3_100.zzd(((v9_33 / 4) + v3_100.size()));
                                            while (v5_0 < v11_46) {
                                                v3_100.zzc(com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v5_0));
                                                v5_0 += 4;
                                            }
                                            if (v5_0 != v11_46) {
                                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                            }
                                        }
                                    }
                                    break;
                                case 25:
                                case 42:
                                    v15_0 = v12_1;
                                    v12_0 = v15_8;
                                    v2_1 = p31;
                                    v7_0 = v4_48;
                                    long v13_22 = v6_25;
                                    v20_0 = v14_1;
                                    v1_3 = v18_9;
                                    v4_0 = p33;
                                    v6_0 = p35;
                                    v18_0 = v9_0;
                                    if (v11_12 != 2) {
                                        if (v11_12 != null) {
                                        } else {
                                            int v9_26;
                                            com.google.android.gms.internal.firebase-auth-api.zzajv v3_92 = ((com.google.android.gms.internal.firebase-auth-api.zzajt) v13_22);
                                            v5_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v7_0, p35);
                                            if (p35.zzb == 0) {
                                                v9_26 = 0;
                                            } else {
                                                v9_26 = 1;
                                            }
                                            v3_92.zza(v9_26);
                                            while (v5_0 < p33) {
                                                int v9_27 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v5_0, p35);
                                                if (v1_3 != p35.zza) {
                                                    break;
                                                }
                                                int v9_29;
                                                v5_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v9_27, p35);
                                                if (p35.zzb == 0) {
                                                    v9_29 = 0;
                                                } else {
                                                    v9_29 = 1;
                                                }
                                                v3_92.zza(v9_29);
                                            }
                                        }
                                    } else {
                                        com.google.android.gms.internal.firebase-auth-api.zzajv v3_94 = ((com.google.android.gms.internal.firebase-auth-api.zzajt) v13_22);
                                        v5_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v7_0, p35);
                                        int v9_31 = (p35.zza + v5_0);
                                        while (v5_0 < v9_31) {
                                            java.nio.charset.Charset v11_44;
                                            v5_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v5_0, p35);
                                            if (p35.zzb == 0) {
                                                v11_44 = 0;
                                            } else {
                                                v11_44 = 1;
                                            }
                                            v3_94.zza(v11_44);
                                        }
                                        if (v5_0 != v9_31) {
                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                        }
                                    }
                                    break;
                                case 26:
                                    v15_0 = v12_1;
                                    v12_0 = v15_8;
                                    v2_1 = p31;
                                    v7_0 = v4_48;
                                    long v13_21 = v6_25;
                                    v1_3 = v18_9;
                                    v4_0 = p33;
                                    v6_0 = p35;
                                    if (v11_12 != 2) {
                                        v18_0 = v9_0;
                                        v20_0 = v14_1;
                                    } else {
                                        if ((v26_1 & 536870912) != 0) {
                                            v18_0 = v9_0;
                                            v20_0 = v14_1;
                                            v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v7_0, p35);
                                            int v9_18 = p35.zza;
                                            if (v9_18 < 0) {
                                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
                                            } else {
                                                int v32_14;
                                                if (v9_18 != 0) {
                                                    java.nio.charset.Charset v11_33 = (v3_8 + v9_18);
                                                    if (!com.google.android.gms.internal.firebase-auth-api.zzaoa.zzc(p31, v3_8, v11_33)) {
                                                        throw com.google.android.gms.internal.firebase-auth-api.zzall.zzd();
                                                    } else {
                                                        v32_14 = v11_33;
                                                        v13_21.add(new String(p31, v3_8, v9_18, com.google.android.gms.internal.firebase-auth-api.zzalh.zza));
                                                    }
                                                } else {
                                                    v13_21.add("");
                                                    while (v3_8 < p33) {
                                                        int v9_19 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v3_8, p35);
                                                        if (v1_3 != p35.zza) {
                                                            break;
                                                        }
                                                        v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v9_19, p35);
                                                        int v9_20 = p35.zza;
                                                        if (v9_20 < 0) {
                                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
                                                        } else {
                                                            if (v9_20 != 0) {
                                                                java.nio.charset.Charset v11_36 = (v3_8 + v9_20);
                                                                if (!com.google.android.gms.internal.firebase-auth-api.zzaoa.zzc(p31, v3_8, v11_36)) {
                                                                    throw com.google.android.gms.internal.firebase-auth-api.zzall.zzd();
                                                                } else {
                                                                    v32_14 = v11_36;
                                                                    v13_21.add(new String(p31, v3_8, v9_20, com.google.android.gms.internal.firebase-auth-api.zzalh.zza));
                                                                }
                                                            } else {
                                                                v13_21.add("");
                                                            }
                                                        }
                                                    }
                                                }
                                                v3_8 = v32_14;
                                            }
                                        } else {
                                            v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v7_0, p35);
                                            java.nio.charset.Charset v11_38 = p35.zza;
                                            if (v11_38 < null) {
                                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
                                            } else {
                                                if (v11_38 != null) {
                                                    v18_0 = v9_0;
                                                    v20_0 = v14_1;
                                                    v13_21.add(new String(p31, v3_8, v11_38, com.google.android.gms.internal.firebase-auth-api.zzalh.zza));
                                                    v3_8 += v11_38;
                                                } else {
                                                    v13_21.add("");
                                                    v18_0 = v9_0;
                                                    v20_0 = v14_1;
                                                }
                                                while (v3_8 < p33) {
                                                    int v9_23 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v3_8, p35);
                                                    if (v1_3 != p35.zza) {
                                                        break;
                                                    }
                                                    v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v9_23, p35);
                                                    int v9_24 = p35.zza;
                                                    if (v9_24 < 0) {
                                                        throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
                                                    } else {
                                                        if (v9_24 != 0) {
                                                            v13_21.add(new String(p31, v3_8, v9_24, com.google.android.gms.internal.firebase-auth-api.zzalh.zza));
                                                            v3_8 += v9_24;
                                                        } else {
                                                            v13_21.add("");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 27:
                                    v13_20 = p33;
                                    v15_0 = v12_1;
                                    com.google.android.gms.internal.firebase-auth-api.zzall v1_86 = v18_9;
                                    if (v11_12 != 2) {
                                        v2_1 = p31;
                                        v12_0 = p30;
                                        v18_0 = v9_0;
                                        v20_0 = v14_1;
                                        v9_8 = v1_86;
                                        v14_0 = v4_48;
                                        v1_8 = p35;
                                        v4_0 = v13_20;
                                    } else {
                                        byte[] v2_43 = v1_86;
                                        v12_0 = p30;
                                        v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzb(v0.zze(v8_4), v2_43, p31, v4_48, p33, v6_25, p35);
                                        v2_1 = p31;
                                        v18_0 = v9_0;
                                        v20_0 = v14_1;
                                        v9_8 = v2_43;
                                        v14_0 = v4_48;
                                        v4_0 = p33;
                                        v1_8 = p35;
                                    }
                                    break;
                                case 28:
                                    v13_20 = p33;
                                    Object v5_79 = v6_25;
                                    v15_0 = v12_1;
                                    com.google.android.gms.internal.firebase-auth-api.zzall v1_81 = v18_9;
                                    if (v11_12 != 2) {
                                        v18_0 = v9_0;
                                        v2_1 = p31;
                                        v20_0 = v14_1;
                                        v12_0 = p30;
                                        v9_8 = v1_81;
                                        v14_0 = v4_48;
                                        v1_8 = p35;
                                    } else {
                                        byte[] v2_42 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v4_48, p35);
                                        com.google.android.gms.internal.firebase-auth-api.zzajv v3_82 = p35.zza;
                                        if (v3_82 < null) {
                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
                                        } else {
                                            if (v3_82 > (p31.length - v2_42)) {
                                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                            } else {
                                                if (v3_82 != null) {
                                                    v5_79.add(com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p31, v2_42, v3_82));
                                                } else {
                                                    v5_79.add(com.google.android.gms.internal.firebase-auth-api.zzajv.zza);
                                                    while (v2_42 < p33) {
                                                        com.google.android.gms.internal.firebase-auth-api.zzajv v3_84 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v2_42, p35);
                                                        if (v1_81 != p35.zza) {
                                                            break;
                                                        }
                                                        v2_42 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v3_84, p35);
                                                        v3_82 = p35.zza;
                                                        if (v3_82 < null) {
                                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
                                                        } else {
                                                            if (v3_82 > (p31.length - v2_42)) {
                                                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                                            } else {
                                                                if (v3_82 != null) {
                                                                    v5_79.add(com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p31, v2_42, v3_82));
                                                                    v2_42 += v3_82;
                                                                } else {
                                                                    v5_79.add(com.google.android.gms.internal.firebase-auth-api.zzajv.zza);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    v3_8 = v2_42;
                                                    v18_0 = v9_0;
                                                    v2_1 = p31;
                                                    v20_0 = v14_1;
                                                    v12_0 = p30;
                                                    v9_8 = v1_81;
                                                    v14_0 = v4_48;
                                                    v1_8 = p35;
                                                    v4_0 = p33;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 30:
                                case 44:
                                    java.nio.charset.Charset v11_32;
                                    int v18_8;
                                    String v20_2;
                                    Object v12_8;
                                    long v13_19;
                                    Object v5_77;
                                    v3_78 = p31;
                                    v5_75 = p33;
                                    com.google.android.gms.internal.firebase-auth-api.zzall v1_74 = v6_25;
                                    int v32_13 = v12_1;
                                    v2_38 = v18_9;
                                    if (v11_12 != 2) {
                                        if (v11_12 != null) {
                                            v15_0 = v32_13;
                                            v12_0 = p30;
                                            v1_8 = p35;
                                            v18_0 = v9_0;
                                            v20_0 = v14_1;
                                            v9_8 = v2_38;
                                            v2_1 = v3_78;
                                            v14_0 = v4_48;
                                            v4_0 = v5_75;
                                        } else {
                                            v5_77 = v1_74;
                                            com.google.android.gms.internal.firebase-auth-api.zzall v1_76 = v2_38;
                                            com.google.android.gms.internal.firebase-auth-api.zzajv v3_79 = v4_48;
                                            v18_8 = v1_76;
                                            v12_8 = p31;
                                            v11_32 = v3_79;
                                            v13_19 = p33;
                                            v20_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v1_76, p31, v3_79, p33, v5_77, p35);
                                        }
                                    } else {
                                        v18_8 = v2_38;
                                        v12_8 = p31;
                                        v11_32 = v4_48;
                                        v13_19 = p33;
                                        v20_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p31, v4_48, v1_74, p35);
                                        v5_77 = v1_74;
                                    }
                                    byte[] v2_41 = v32_13;
                                    com.google.android.gms.internal.firebase-auth-api.zzand.zza(v15_8, v2_41, v5_77, v0.zzd(v8_4), 0, v0.zzp);
                                    v15_0 = v2_41;
                                    v18_0 = v9_0;
                                    v9_8 = v18_8;
                                    v1_8 = p35;
                                    v2_1 = v12_8;
                                    v4_0 = v13_19;
                                    v3_8 = v20_2;
                                    v12_0 = p30;
                                    v20_0 = v14_1;
                                    v14_0 = v11_32;
                                    break;
                                case 33:
                                case 47:
                                    v3_78 = p31;
                                    v5_75 = p33;
                                    com.google.android.gms.internal.firebase-auth-api.zzall v1_70 = v6_25;
                                    v32_11 = v12_1;
                                    v2_38 = v18_9;
                                    v6_26 = p35;
                                    if (v11_12 != 2) {
                                        if (v11_12 != null) {
                                            v1_8 = v6_26;
                                            v18_0 = v9_0;
                                            v20_0 = v14_1;
                                            v12_0 = v15_8;
                                            v15_0 = v32_11;
                                        } else {
                                            com.google.android.gms.internal.firebase-auth-api.zzall v1_71 = ((com.google.android.gms.internal.firebase-auth-api.zzali) v1_70);
                                            v7_24 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v4_48, p35);
                                            v1_71.zzc(com.google.android.gms.internal.firebase-auth-api.zzakh.zza(p35.zza));
                                            while (v7_24 < p33) {
                                                java.nio.charset.Charset v11_27 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v7_24, p35);
                                                if (v2_38 != p35.zza) {
                                                    break;
                                                }
                                                v7_24 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v11_27, p35);
                                                v1_71.zzc(com.google.android.gms.internal.firebase-auth-api.zzakh.zza(p35.zza));
                                            }
                                            v1_8 = v6_26;
                                            v18_0 = v9_0;
                                            v20_0 = v14_1;
                                            v12_0 = v15_8;
                                            v15_0 = v32_11;
                                            v9_8 = v2_38;
                                            v2_1 = v3_78;
                                            v14_0 = v4_48;
                                            v4_0 = v5_75;
                                            v3_8 = v7_24;
                                        }
                                    } else {
                                        com.google.android.gms.internal.firebase-auth-api.zzall v1_72 = ((com.google.android.gms.internal.firebase-auth-api.zzali) v1_70);
                                        v7_24 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v4_48, p35);
                                        java.nio.charset.Charset v11_31 = (p35.zza + v7_24);
                                        while (v7_24 < v11_31) {
                                            v7_24 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v7_24, p35);
                                            v1_72.zzc(com.google.android.gms.internal.firebase-auth-api.zzakh.zza(p35.zza));
                                        }
                                        if (v7_24 != v11_31) {
                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                        }
                                    }
                                    break;
                                case 34:
                                case 48:
                                    v3_78 = p31;
                                    v5_75 = p33;
                                    com.google.android.gms.internal.firebase-auth-api.zzall v1_66 = v6_25;
                                    v2_38 = v18_9;
                                    v6_26 = p35;
                                    if (v11_12 != 2) {
                                        v32_11 = v12_1;
                                        if (v11_12 != null) {
                                        } else {
                                            com.google.android.gms.internal.firebase-auth-api.zzall v1_67 = ((com.google.android.gms.internal.firebase-auth-api.zzalx) v1_66);
                                            v7_24 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v4_48, p35);
                                            v1_67.zza(com.google.android.gms.internal.firebase-auth-api.zzakh.zza(p35.zzb));
                                            while (v7_24 < p33) {
                                                java.nio.charset.Charset v11_20 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v7_24, p35);
                                                if (v2_38 != p35.zza) {
                                                    break;
                                                }
                                                v7_24 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v11_20, p35);
                                                v1_67.zza(com.google.android.gms.internal.firebase-auth-api.zzakh.zza(p35.zzb));
                                            }
                                        }
                                    } else {
                                        com.google.android.gms.internal.firebase-auth-api.zzall v1_68 = ((com.google.android.gms.internal.firebase-auth-api.zzalx) v1_66);
                                        v7_24 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v4_48, p35);
                                        java.nio.charset.Charset v11_24 = (p35.zza + v7_24);
                                        while (v7_24 < v11_24) {
                                            v7_24 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v7_24, p35);
                                            int v32_12 = v12_1;
                                            v1_68.zza(com.google.android.gms.internal.firebase-auth-api.zzakh.zza(p35.zzb));
                                            v12_1 = v32_12;
                                        }
                                        v32_11 = v12_1;
                                        if (v7_24 != v11_24) {
                                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                                        }
                                    }
                                    break;
                                case 49:
                                    if (v11_12 != 3) {
                                        v18_0 = v9_0;
                                        v9_8 = v18_9;
                                        v15_0 = v12_1;
                                        v12_0 = v15_8;
                                        v2_1 = p31;
                                        v1_8 = p35;
                                        v20_0 = v14_1;
                                        v14_0 = v4_48;
                                        v4_0 = p33;
                                    } else {
                                        byte[] v2_37 = v18_9;
                                        v15_0 = v12_1;
                                        v12_0 = v15_8;
                                        v18_0 = v9_0;
                                        v20_0 = v14_1;
                                        v9_8 = v2_37;
                                        v2_1 = p31;
                                        v14_0 = v4_48;
                                        v4_0 = p33;
                                        v3_8 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v0.zze(v8_4), v2_37, p31, v4_48, p33, v6_25, p35);
                                        v1_8 = p35;
                                    }
                                    break;
                                default:
                            }
                            if (v3_8 != v14_0) {
                                v6_14 = v1_8;
                                v5_21 = v4_0;
                                v7_7 = v15_0;
                                v1_23 = v19_0;
                                v14_1 = v20_0;
                                v4_2 = v3_8;
                                v15_1 = v9_8;
                                v9_0 = v18_0;
                                v3_20 = v2_1;
                                v2_0 = v12_0;
                            } else {
                                v10_12 = p34;
                                v14_2 = v1_8;
                                v1_15 = v2_1;
                                v23_0 = v8_4;
                            }
                        }
                    } else {
                        if (v11_12 != 2) {
                            v18_0 = v9_0;
                            v9_8 = v18_9;
                            v15_0 = v12_1;
                            v12_0 = v1_75;
                            v1_15 = p31;
                            v5_22 = p35;
                            v20_0 = v14_1;
                            v14_3 = v19_5;
                            v19_0 = v2_39;
                        } else {
                            com.google.android.gms.internal.firebase-auth-api.zzajv v3_22 = ((com.google.android.gms.internal.firebase-auth-api.zzalm) v2_39.getObject(v1_75, v6_30));
                            if (!v3_22.zzc()) {
                                int v4_6;
                                int v4_5 = v3_22.size();
                                if (v4_5 != 0) {
                                    v4_6 = (v4_5 << 1);
                                } else {
                                    v4_6 = 10;
                                }
                                v3_22 = v3_22.zza(v4_6);
                                v2_39.putObject(v1_75, v6_30, v3_22);
                            }
                            v3_20 = p31;
                            v5_21 = p33;
                            java.nio.charset.Charset v11_2 = v2_39;
                            byte[] v2_5 = v18_9;
                            v4_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzb(v0.zze(v8_4), v2_5, p31, v19_5, p33, v3_22, v15_7);
                            v6_14 = p35;
                            v7_7 = v12_1;
                            v2_0 = p30;
                            v15_1 = v2_5;
                            v1_23 = v11_2;
                        }
                    }
                    v10_12 = p34;
                    v23_0 = v8_4;
                    v3_8 = v14_3;
                    v14_2 = v5_22;
                } else {
                    byte[] v26_0;
                    String v14_4;
                    int v4_9 = v24_3[(v7_18 + 2)];
                    byte[] v24_2 = (1 << (v4_9 >> 20));
                    int v4_10 = (v4_9 & 1048575);
                    if (v4_10 == v9_0) {
                        v26_0 = v14_1;
                        v14_4 = v9_0;
                    } else {
                        int v8_0 = 1048575;
                        if (v9_0 != 1048575) {
                            v1_23.putInt(v2_0, ((long) v9_0), v14_1);
                            v8_0 = 1048575;
                        }
                        int v8_3;
                        if (v4_10 != v8_0) {
                            v8_3 = v1_23.getInt(v2_0, ((long) v4_10));
                        } else {
                            v8_3 = 0;
                        }
                        v14_4 = v4_10;
                        v26_0 = v8_3;
                    }
                    com.google.android.gms.internal.firebase-auth-api.zzall v1_28;
                    int v18_2;
                    com.google.android.gms.internal.firebase-auth-api.zzall v1_34;
                    byte[] v2_9;
                    int v4_13;
                    int v9_9;
                    int v15_4;
                    int v7_14;
                    int v9_10;
                    long v13_8;
                    byte[] v2_6;
                    int v32_3;
                    int v7_10;
                    com.google.android.gms.internal.firebase-auth-api.zzajv v3_25;
                    int v9_12;
                    switch (v3_77) {
                        case 0:
                            v2_6 = v1_23;
                            v1_28 = v2_0;
                            v8_4 = v7_18;
                            v32_3 = v14_4;
                            v9_9 = v18_7;
                            v7_10 = p31;
                            v18_2 = v15_1;
                            v15_4 = v6_14;
                            if (v11_12 != 1) {
                            } else {
                                com.google.android.gms.internal.firebase-auth-api.zzanz.zza(v1_28, v19_4, com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p31, v9_9));
                                v4_2 = (v9_9 + 8);
                                v14_1 = (v26_0 | v24_2);
                                v2_0 = v1_28;
                                v1_23 = v2_6;
                                v9_0 = v32_3;
                                v5_21 = p33;
                                v3_20 = v7_10;
                                v7_7 = v12_1;
                                v6_14 = v15_4;
                                v15_1 = v18_2;
                            }
                            break;
                        case 1:
                            v2_6 = v1_23;
                            v1_28 = v2_0;
                            v8_4 = v7_18;
                            v32_3 = v14_4;
                            v9_9 = v18_7;
                            v7_10 = p31;
                            v18_2 = v15_1;
                            v15_4 = v6_14;
                            if (v11_12 != 5) {
                            } else {
                                com.google.android.gms.internal.firebase-auth-api.zzanz.zza(v1_28, v19_4, com.google.android.gms.internal.firebase-auth-api.zzajr.zzb(p31, v9_9));
                                v4_2 = (v9_9 + 4);
                            }
                            break;
                        case 2:
                        case 3:
                            v8_4 = v7_18;
                            v32_3 = v14_4;
                            v9_9 = v18_7;
                            com.google.android.gms.internal.firebase-auth-api.zzajv v3_56 = v19_4;
                            v7_10 = p31;
                            v18_2 = v15_1;
                            v15_4 = v6_14;
                            if (v11_12 != null) {
                                v2_6 = v1_23;
                                v1_28 = v2_0;
                            } else {
                                int v9_16 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v9_9, v15_4);
                                v1_23.putLong(v2_0, v3_56, v15_4.zzb);
                                v14_1 = (v26_0 | v24_2);
                                v5_21 = p33;
                                v3_20 = p31;
                                v4_2 = v9_16;
                                v7_7 = v12_1;
                                v6_14 = v15_4;
                                v15_1 = v18_2;
                                v9_0 = v32_3;
                            }
                            break;
                        case 4:
                        case 11:
                            v8_4 = v7_18;
                            v32_3 = v14_4;
                            v9_9 = v18_7;
                            com.google.android.gms.internal.firebase-auth-api.zzajv v3_55 = v19_4;
                            v7_10 = p31;
                            v18_2 = v15_1;
                            v15_4 = v6_14;
                            if (v11_12 != null) {
                            } else {
                                Object v5_38 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v9_9, v15_4);
                                v1_23.putInt(v2_0, v3_55, v15_4.zza);
                                v14_1 = (v26_0 | v24_2);
                                v9_0 = v32_3;
                                v4_2 = v5_38;
                                v3_20 = p31;
                                v7_7 = v12_1;
                                v6_14 = v15_4;
                                v15_1 = v18_2;
                                v5_21 = p33;
                            }
                            break;
                        case 5:
                        case 14:
                            int v9_14 = v1_23;
                            v8_4 = v7_18;
                            v32_3 = v14_4;
                            int v4_20 = v18_7;
                            int v7_15 = v2_0;
                            byte[] v2_13 = v6_14;
                            v18_2 = v15_1;
                            if (v11_12 != 1) {
                                v15_4 = v2_13;
                                v2_0 = v7_15;
                                v7_10 = p31;
                                v1_23 = v9_14;
                                v9_9 = v4_20;
                            } else {
                                v7_10 = p31;
                                v1_23 = v9_14;
                                int v9_15 = v4_20;
                                v15_4 = v2_13;
                                v2_0 = v7_15;
                                v1_23.putLong(v2_0, v19_4, com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v4_20));
                                v4_2 = (v9_15 + 8);
                                v14_1 = (v26_0 | v24_2);
                            }
                            break;
                        case 6:
                        case 13:
                            v9_12 = v1_23;
                            v8_4 = v7_18;
                            v32_3 = v14_4;
                            v4_13 = v18_7;
                            v1_34 = p31;
                            v7_14 = v2_0;
                            v2_9 = v6_14;
                            v18_2 = v15_1;
                            if (v11_12 != 5) {
                                v7_10 = v1_34;
                                v1_28 = v7_14;
                                v15_4 = v2_9;
                                v2_6 = v9_12;
                                v9_9 = v4_13;
                            } else {
                                v9_12.putInt(v7_14, v19_4, com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v4_13));
                                v4_2 = (v4_13 + 4);
                                v14_1 = (v26_0 | v24_2);
                                v5_21 = p33;
                                v3_20 = v1_34;
                                v6_14 = v2_9;
                                v2_0 = v7_14;
                                v1_23 = v9_12;
                                v7_7 = v12_1;
                            }
                            break;
                        case 7:
                            v9_12 = v1_23;
                            v8_4 = v7_18;
                            v32_3 = v14_4;
                            v4_13 = v18_7;
                            v1_34 = p31;
                            v7_14 = v2_0;
                            v2_9 = v6_14;
                            v18_2 = v15_1;
                            String v14_6 = v19_4;
                            if (v11_12 != null) {
                            } else {
                                com.google.android.gms.internal.firebase-auth-api.zzajv v3_48;
                                v4_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v4_13, v2_9);
                                if (v2_9.zzb == 0) {
                                    v3_48 = 0;
                                } else {
                                    v3_48 = 1;
                                }
                                com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(v7_14, v14_6, v3_48);
                            }
                            break;
                        case 8:
                            v9_12 = v1_23;
                            v8_4 = v7_18;
                            v32_3 = v14_4;
                            v4_13 = v18_7;
                            v1_34 = p31;
                            v7_14 = v2_0;
                            v2_9 = v6_14;
                            v18_2 = v15_1;
                            String v14_5 = v19_4;
                            if (v11_12 != 2) {
                            } else {
                                com.google.android.gms.internal.firebase-auth-api.zzajv v3_45;
                                if (!com.google.android.gms.internal.firebase-auth-api.zzamq.zzg(v13_17)) {
                                    v3_45 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v4_13, v2_9);
                                    int v4_19 = v2_9.zza;
                                    if (v4_19 < 0) {
                                        throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
                                    } else {
                                        if (v4_19 != 0) {
                                            v2_9.zzc = new String(p31, v3_45, v4_19, com.google.android.gms.internal.firebase-auth-api.zzalh.zza);
                                            v3_45 += v4_19;
                                        } else {
                                            v2_9.zzc = "";
                                        }
                                    }
                                } else {
                                    v3_45 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzb(p31, v4_13, v2_9);
                                }
                                v4_2 = v3_45;
                                v9_12.putObject(v7_14, v14_5, v2_9.zzc);
                            }
                            break;
                        case 9:
                            byte[] v2_8 = v1_23;
                            com.google.android.gms.internal.firebase-auth-api.zzall v1_30 = v2_0;
                            int v9_11 = v6_14;
                            v8_4 = v7_18;
                            v4_13 = v18_7;
                            if (v11_12 != 2) {
                                v9_12 = v2_8;
                                v2_9 = v9_11;
                                v7_10 = p31;
                                v1_28 = v1_30;
                                v32_3 = v14_4;
                                v18_2 = v15_1;
                            } else {
                                Object v5_31 = v1_30;
                                com.google.android.gms.internal.firebase-auth-api.zzall v1_32 = v0.zza(v5_31, v8_4);
                                v6_14 = v9_11;
                                int v9_13 = v2_8;
                                int v7_13 = v5_31;
                                v4_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v1_32, v0.zze(v8_4), p31, v4_13, p33, v6_14);
                                v0 = v0.zza(v7_13, v8_4, v1_32);
                                v3_20 = p31;
                                v1_23 = v9_13;
                                v9_0 = v14_4;
                                v14_1 = (v26_0 | v24_2);
                                v5_21 = p33;
                                v2_0 = v7_13;
                                v7_7 = v12_1;
                            }
                            break;
                        case 10:
                            v2_6 = v1_23;
                            v1_28 = v2_0;
                            v9_10 = v6_14;
                            v8_4 = v7_18;
                            v4_13 = v18_7;
                            Object v5_29 = v19_4;
                            v7_10 = p31;
                            if (v11_12 != 2) {
                                v32_3 = v14_4;
                                v18_2 = v15_1;
                                v15_4 = v9_10;
                            } else {
                                v4_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p31, v4_13, v9_10);
                                v2_6.putObject(v1_28, v5_29, v9_10.zzc);
                                v3_25 = (v26_0 | v24_2);
                                v2_0 = v1_28;
                                v1_23 = v2_6;
                                v5_21 = p33;
                                v6_14 = v9_10;
                                v9_0 = v14_4;
                                v14_1 = v3_25;
                                v3_20 = v7_10;
                            }
                            break;
                        case 12:
                            v2_6 = v1_23;
                            v1_28 = v2_0;
                            v9_10 = v6_14;
                            v8_4 = v7_18;
                            v4_13 = v18_7;
                            Object v5_27 = v19_4;
                            v7_10 = p31;
                            if (v11_12 != null) {
                            } else {
                                int v4_17 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v4_13, v9_10);
                                com.google.android.gms.internal.firebase-auth-api.zzajv v3_30 = v9_10.zza;
                                java.nio.charset.Charset v11_5 = v0.zzd(v8_4);
                                if (((v13_17 & -2147483648) != 0) && ((v11_5 != null) && (!v11_5.zza(v3_30)))) {
                                    int v32_4 = v4_17;
                                    com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(v1_28).zza(v15_1, Long.valueOf(((long) v3_30)));
                                    v2_0 = v1_28;
                                    v1_23 = v2_6;
                                    v4_2 = v32_4;
                                    v5_21 = p33;
                                    v3_20 = p31;
                                    v6_14 = v9_10;
                                    v7_7 = v12_1;
                                    v9_0 = v14_4;
                                    v14_1 = v26_0;
                                } else {
                                    int v32_5 = v4_17;
                                    v2_6.putInt(v1_28, v5_27, v3_30);
                                    v3_25 = (v26_0 | v24_2);
                                    v2_0 = v1_28;
                                    v1_23 = v2_6;
                                    v4_2 = v32_5;
                                }
                            }
                            break;
                        case 15:
                            v2_6 = v1_23;
                            v1_28 = v2_0;
                            v9_10 = v6_14;
                            v13_8 = v7_18;
                            v4_13 = v18_7;
                            Object v5_25 = v19_4;
                            v7_10 = p31;
                            if (v11_12 != null) {
                                v8_4 = v13_8;
                            } else {
                                v4_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p31, v4_13, v9_10);
                                v2_6.putInt(v1_28, v5_25, com.google.android.gms.internal.firebase-auth-api.zzakh.zza(v9_10.zza));
                                v3_25 = (v26_0 | v24_2);
                                v2_0 = v1_28;
                                v1_23 = v2_6;
                                v5_21 = p33;
                                v6_14 = v9_10;
                                v8_4 = v13_8;
                            }
                            break;
                        case 16:
                            v9_10 = v6_14;
                            v13_8 = v7_18;
                            v4_13 = v18_7;
                            v7_10 = p31;
                            if (v11_12 != null) {
                                v2_6 = v1_23;
                                v1_28 = v2_0;
                            } else {
                                int v8_6 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p31, v4_13, v9_10);
                                v1_23.putLong(v2_0, v19_4, com.google.android.gms.internal.firebase-auth-api.zzakh.zza(v9_10.zzb));
                                v3_25 = (v26_0 | v24_2);
                                v5_21 = p33;
                                v4_2 = v8_6;
                            }
                            break;
                        case 17:
                            if (v11_12 != 3) {
                                v2_6 = v1_23;
                                v1_28 = v2_0;
                                v8_4 = v7_18;
                                v32_3 = v14_4;
                                v9_9 = v18_7;
                                v7_10 = p31;
                                v18_2 = v15_1;
                                v15_4 = v6_14;
                            } else {
                                com.google.android.gms.internal.firebase-auth-api.zzajv v3_24 = v0.zza(v2_0, v7_18);
                                v9_10 = v6_14;
                                v13_8 = v7_18;
                                v4_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v3_24, v0.zze(v7_18), p31, v18_7, p33, ((v12_1 << 3) | 4), v9_10);
                                v7_10 = p31;
                                v0 = v0.zza(v2_0, v13_8, v3_24);
                                v3_25 = (v26_0 | v24_2);
                            }
                            break;
                        default:
                            v2_6 = v1_23;
                            v1_28 = v2_0;
                            v8_4 = v7_18;
                            v32_3 = v14_4;
                            v9_9 = v18_7;
                    }
                    v10_12 = p34;
                    v19_0 = v2_6;
                    v23_0 = v8_4;
                    v3_8 = v9_9;
                    v14_2 = v15_4;
                    v9_8 = v18_2;
                    v20_0 = v26_0;
                    v18_0 = v32_3;
                    v15_0 = v12_1;
                    v12_0 = v1_28;
                    v1_15 = v7_10;
                }
            } else {
                v10_12 = p34;
                v19_0 = v1_23;
                v1_15 = v3_20;
                v3_8 = v4_28;
                v18_0 = v9_0;
                v20_0 = v14_1;
                v9_8 = v15_1;
                v23_0 = 0;
                v14_2 = v6_14;
                v15_0 = v12_1;
                v12_0 = v2_0;
            }
        }
        v10_12 = p34;
        v19_0 = v1_23;
        v12_0 = v2_0;
        v13_12 = v5_21;
        String v20 = v14_1;
        v6_19 = v4_2;
    }

    public final Object zza()
    {
        return this.zzn.zza(this.zzg);
    }

    public final void zza(Object p19, com.google.android.gms.internal.firebase-auth-api.zzanc p20, com.google.android.gms.internal.firebase-auth-api.zzaku p21)
    {
        void v1_0 = this;
        Object v4_0 = p21;
        p21.getClass();
        com.google.android.gms.internal.firebase-auth-api.zzamq.zzf(p19);
        void v5_0 = this.zzp;
        int v0_3 = this.zzq;
        Object v6_0 = 0;
        void v7_0 = 0;
        try {
            while(true) {
                void v10_2;
                void v1_2;
                Object v11_0;
                int v12;
                void v2_82 = p20.zzc();
                int v3_1 = v1_0.zza(v2_82);
                v4_0 = v11_0;
                v0_3 = v12;
            }
            int v0_4 = v10_2.zzl;
            Object v4_76 = v6_0;
        } catch (int v0_1) {
            void v2_2 = p19;
            void v7_2 = v1_0.zzl;
            Object v4_79 = v6_0;
        }
        if (v3_1 >= 0) {
            v12 = v0_3;
            v11_0 = v4_0;
            void v10_11 = v5_0;
            void v5_1 = p19;
            try {
                void v2_15;
                Object v6_2;
                Object v4_26 = v1_0.zzc(v3_1);
                switch (((267386880 & v4_26) >> 20)) {
                    case 0:
                        void v10_39 = v1_0;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zza());
                        v10_2 = v10_39.zzb(p19, v3_1);
                        v1_0 = v10_2;
                        break;
                    case 1:
                        void v10_38 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzb());
                        v10_2 = v10_38.zzb(p19, v3_1);
                        break;
                    case 2:
                        void v10_37 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzl());
                        v10_2 = v10_37.zzb(p19, v3_1);
                        break;
                    case 3:
                        void v10_36 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzo());
                        v10_2 = v10_36.zzb(p19, v3_1);
                        break;
                    case 4:
                        void v10_35 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzg());
                        v10_2 = v10_35.zzb(p19, v3_1);
                        break;
                    case 5:
                        void v10_34 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzk());
                        v10_2 = v10_34.zzb(p19, v3_1);
                        break;
                    case 6:
                        void v10_32 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzf());
                        v10_2 = v10_32.zzb(p19, v3_1);
                        break;
                    case 7:
                        void v10_31 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p19, ((long) (v4_26 & 1048575)), p20.zzs());
                        v10_2 = v10_31.zzb(p19, v3_1);
                        break;
                    case 8:
                        v1_2 = p19;
                        v5_0 = v10_11;
                        v10_2 = v1_0.zza(v1_2, v4_26, p20).zzb(p19, v3_1);
                        break;
                    case 9:
                        void v10_28 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        Object v4_60 = ((com.google.android.gms.internal.firebase-auth-api.zzamm) v10_28.zza(p19, v3_1));
                        p20.zzb(v4_60, v10_28.zze(v3_1), v11_0);
                        v10_2 = v10_28.zza(p19, v3_1, v4_60);
                        break;
                    case 10:
                        void v10_27 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzp());
                        v10_2 = v10_27.zzb(p19, v3_1);
                        break;
                    case 11:
                        void v10_26 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzj());
                        v10_2 = v10_26.zzb(p19, v3_1);
                        break;
                    case 12:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        long v8_5 = v2_82;
                        int v9_1 = p20.zze();
                        Object v13_28 = v10_2.zzd(v3_1);
                        if (v13_28 != null) {
                            if (!v13_28.zza(v9_1)) {
                                v6_0 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(p19, v8_5, v9_1, v6_0, v5_0);
                            } else {
                            }
                        }
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), v9_1);
                        v10_2 = v10_2.zzb(p19, v3_1);
                        break;
                    case 13:
                        void v10_25 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzh());
                        v10_2 = v10_25.zzb(p19, v3_1);
                        break;
                    case 14:
                        void v10_24 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzm());
                        v10_2 = v10_24.zzb(p19, v3_1);
                        break;
                    case 15:
                        void v10_23 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzi());
                        v10_2 = v10_23.zzb(p19, v3_1);
                        break;
                    case 16:
                        void v10_22 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzn());
                        v10_2 = v10_22.zzb(p19, v3_1);
                        break;
                    case 17:
                        void v10_20 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        void v2_69 = ((com.google.android.gms.internal.firebase-auth-api.zzamm) v10_20.zza(p19, v3_1));
                        p20.zza(v2_69, v10_20.zze(v3_1), v11_0);
                        v10_2 = v10_20.zza(p19, v3_1, v2_69);
                        break;
                    case 18:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzc(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 19:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzg(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 20:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzi(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 21:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzq(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 22:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzh(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 23:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzf(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 24:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zze(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 25:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zza(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 26:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        if (!com.google.android.gms.internal.firebase-auth-api.zzamq.zzg(v4_26)) {
                            p20.zzn(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        } else {
                            p20.zzo(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        }
                        break;
                    case 27:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzb(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))), v10_2.zze(v3_1), v11_0);
                        break;
                    case 28:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzb(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 29:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzp(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 30:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        void v5_4 = v10_11;
                        Object v4_41 = v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575)));
                        p20.zzd(v4_41);
                        v6_2 = v5_4;
                        v2_15 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(p19, v2_82, v4_41, v10_2.zzd(v3_1), v6_0, v6_2);
                        v5_0 = v6_2;
                        v6_0 = v2_15;
                        break;
                    case 31:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzj(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 32:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzk(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 33:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzl(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 34:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzm(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 35:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzc(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 36:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzg(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 37:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzi(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 38:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzq(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 39:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzh(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 40:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzf(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 41:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zze(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 42:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zza(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 43:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzp(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 44:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        void v5_2 = v10_11;
                        Object v4_35 = v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575)));
                        p20.zzd(v4_35);
                        v6_2 = v5_2;
                        v2_15 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(p19, v2_82, v4_35, v10_2.zzd(v3_1), v6_0, v6_2);
                        v5_0 = v6_2;
                        break;
                    case 45:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzj(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 46:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzk(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 47:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzl(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 48:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zzm(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))));
                        break;
                    case 49:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        p20.zza(v10_2.zzo.zza(p19, ((long) (v4_26 & 1048575))), v10_2.zze(v3_1), v11_0);
                        break;
                    case 50:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        void v2_3 = v10_2.zzf(v3_1);
                        int v3_4 = ((long) (v10_2.zzc(v3_1) & 1048575));
                        Object v13_14 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p19, v3_4);
                        if (v13_14 != null) {
                            if (v10_2.zzr.zzf(v13_14)) {
                                Object v14_5 = v10_2.zzr.zzb(v2_3);
                                v10_2.zzr.zza(v14_5, v13_14);
                                com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, v3_4, v14_5);
                                v13_14 = v14_5;
                            }
                        } else {
                            v13_14 = v10_2.zzr.zzb(v2_3);
                            com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, v3_4, v13_14);
                        }
                        p20.zza(v10_2.zzr.zze(v13_14), v10_2.zzr.zza(v2_3), v11_0);
                        break;
                    case 51:
                        void v10_16 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Double.valueOf(p20.zza()));
                        v10_2 = v10_16.zzb(p19, v2_82, v3_1);
                        break;
                    case 52:
                        void v10_15 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Float.valueOf(p20.zzb()));
                        v10_2 = v10_15.zzb(p19, v2_82, v3_1);
                        break;
                    case 53:
                        void v10_14 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Long.valueOf(p20.zzl()));
                        v10_2 = v10_14.zzb(p19, v2_82, v3_1);
                        break;
                    case 54:
                        void v10_13 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Long.valueOf(p20.zzo()));
                        v10_2 = v10_13.zzb(p19, v2_82, v3_1);
                        break;
                    case 55:
                        void v10_12 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Integer.valueOf(p20.zzg()));
                        v10_2 = v10_12.zzb(p19, v2_82, v3_1);
                        break;
                    case 56:
                        void v10_10 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Long.valueOf(p20.zzk()));
                        v10_2 = v10_10.zzb(p19, v2_82, v3_1);
                        break;
                    case 57:
                        void v10_9 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Integer.valueOf(p20.zzf()));
                        v10_2 = v10_9.zzb(p19, v2_82, v3_1);
                        break;
                    case 58:
                        void v10_8 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Boolean.valueOf(p20.zzs()));
                        v10_2 = v10_8.zzb(p19, v2_82, v3_1);
                        break;
                    case 59:
                        v1_2 = p19;
                        v5_0 = v10_11;
                        v10_2 = v1_0.zza(v1_2, v4_26, p20).zzb(p19, v2_82, v3_1);
                        break;
                    case 60:
                        void v10_5 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        Object v4_10 = ((com.google.android.gms.internal.firebase-auth-api.zzamm) v10_5.zza(p19, v2_82, v3_1));
                        p20.zzb(v4_10, v10_5.zze(v3_1), v11_0);
                        v10_2 = v10_5.zza(p19, v2_82, v3_1, v4_10);
                        break;
                    case 61:
                        void v10_4 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), p20.zzp());
                        v10_2 = v10_4.zzb(p19, v2_82, v3_1);
                        break;
                    case 62:
                        void v10_3 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Integer.valueOf(p20.zzj()));
                        v10_2 = v10_3.zzb(p19, v2_82, v3_1);
                        break;
                    case 63:
                        v10_2 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        Object v13_36 = p20.zze();
                        com.google.android.gms.internal.firebase-auth-api.zzamf v15_7 = v10_2.zzd(v3_1);
                        if (v15_7 != null) {
                            if (!v15_7.zza(v13_36)) {
                                v6_0 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(p19, v2_82, v13_36, v6_0, v5_0);
                            } else {
                            }
                        }
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Integer.valueOf(v13_36));
                        v10_2 = v10_2.zzb(p19, v2_82, v3_1);
                        break;
                    case 64:
                        void v10_33 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Integer.valueOf(p20.zzh()));
                        v10_2 = v10_33.zzb(p19, v2_82, v3_1);
                        break;
                    case 65:
                        void v10_21 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Long.valueOf(p20.zzm()));
                        v10_2 = v10_21.zzb(p19, v2_82, v3_1);
                        break;
                    case 66:
                        void v10_19 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Integer.valueOf(p20.zzi()));
                        v10_2 = v10_19.zzb(p19, v2_82, v3_1);
                        break;
                    case 67:
                        void v10_18 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p19, ((long) (v4_26 & 1048575)), Long.valueOf(p20.zzn()));
                        v10_2 = v10_18.zzb(p19, v2_82, v3_1);
                        break;
                    case 68:
                        void v10_17 = v1_0;
                        v1_2 = p19;
                        v5_0 = v10_11;
                        Object v4_36 = ((com.google.android.gms.internal.firebase-auth-api.zzamm) v10_17.zza(p19, v2_82, v3_1));
                        p20.zza(v4_36, v10_17.zze(v3_1), v11_0);
                        v10_2 = v10_17.zza(p19, v2_82, v3_1, v4_36);
                        break;
                    default:
                        if (v6_0 == null) {
                            v6_0 = v10_11.zzc(p19);
                        }
                        try {
                            if (v10_11.zza(v6_0, p20, 0)) {
                                v10_2 = v1_0;
                                v5_0 = v10_11;
                            } else {
                                int v0_5 = v1_0.zzl;
                                Object v4_77 = v6_0;
                                while (v0_5 < v1_0.zzm) {
                                    void v2_81 = v5_1;
                                    void v5_7 = v10_11;
                                    v4_77 = v1_0.zza(v2_81, v1_0.zzk[v0_5], v4_77, v5_7, p19);
                                    v0_5++;
                                    v5_1 = v2_81;
                                    v10_11 = v5_7;
                                }
                                if (v4_77 != null) {
                                    v10_11.zzb(v5_1, v4_77);
                                }
                            }
                        } catch (int v0_1) {
                            void v17_35 = v10_11;
                            v10_2 = v1_0;
                            v1_2 = p19;
                            v5_0 = v17_35;
                            v2_2 = v1_2;
                            v1_0 = v10_2;
                        }
                }
            } catch (int v0_1) {
                v2_2 = v5_1;
                v5_0 = v10_11;
            } catch (com.google.android.gms.internal.firebase-auth-api.zzalo) {
                void v17_36 = v6_2;
                v6_0 = v5_0;
                v5_0 = v17_36;
            } catch (int v0_1) {
                v17_35 = v6_2;
                v6_0 = v5_0;
            }
            v5_0.zza(p20);
            if (v6_0 == null) {
                v6_0 = v5_0.zzc(v1_2);
            }
            if (v5_0.zza(v6_0, p20, 0)) {
            }
        } else {
            if (v2_82 != 2147483647) {
                v10_2 = v1_0;
                v1_2 = p19;
                try {
                    int v3_80;
                    if (v10_2.zzh) {
                        v3_80 = v0_3.zza(v4_0, v10_2.zzg, v2_82);
                    } else {
                        v3_80 = 0;
                    }
                    if (v3_80 == 0) {
                        v12 = v0_3;
                        v2_2 = p19;
                        v11_0 = v4_0;
                        try {
                            v5_0.zza(p20);
                        } catch (int v0_1) {
                            v1_0 = v10_2;
                            v10_11 = v5_0;
                        }
                        if (v6_0 == null) {
                            try {
                                v6_0 = v5_0.zzc(p19);
                            } catch (int v0_1) {
                            }
                        }
                        if (v5_0.zza(v6_0, p20, 0)) {
                            v1_0 = v10_2;
                        } else {
                            int v0_7 = v10_2.zzl;
                            Object v4_78 = v6_0;
                            while (v0_7 < v10_2.zzm) {
                                void v1_11 = v10_2;
                                v4_78 = v1_11.zza(p19, v10_2.zzk[v0_7], v4_78, v5_0, p19);
                                v0_7++;
                                v10_2 = v1_11;
                            }
                            if (v4_78 != null) {
                                v5_0.zzb(p19, v4_78);
                            }
                        }
                    } else {
                        if (v7_0 == 0) {
                            v7_0 = v0_3.zzb(p19);
                        }
                        void v7_1 = v5_0;
                        void v5_9 = v7_0;
                        try {
                            v6_0 = v0_3.zza(p19, p20, v3_80, v4_0, v5_9, v6_0, v7_1);
                            v7_0 = v5_9;
                            v5_0 = v7_1;
                            v12 = v0_3;
                            v11_0 = v4_0;
                        } catch (int v0_1) {
                            v2_2 = p19;
                            v5_0 = v7_0;
                        }
                    }
                } catch (int v0_1) {
                    v5_1 = p19;
                    v1_0 = v10_2;
                    v10_11 = v5_0;
                }
            } else {
                int v0_0 = v1_0.zzl;
                Object v4_2 = v6_0;
                while (v0_0 < v1_0.zzm) {
                    v4_2 = v1_0.zza(p19, v1_0.zzk[v0_0], v4_2, v5_0, p19);
                    v0_0++;
                }
                if (v4_2 != null) {
                    v5_0.zzb(p19, v4_2);
                }
            }
        }
        return;
    }

    public final void zza(Object p21, com.google.android.gms.internal.firebase-auth-api.zzaol p22)
    {
        int v0_0 = this;
        int v7_1 = 267386880;
        com.google.android.gms.internal.firebase-auth-api.zzanb v9_8 = 1;
        com.google.android.gms.internal.firebase-auth-api.zzanb v11_8 = 1048575;
        if (p22.zza() != 2) {
            int v3_5;
            int v12_18;
            if (!this.zzh) {
                v3_5 = 0;
                v12_18 = 0;
            } else {
                int v2_2 = this.zzq.zza(p21);
                if (v2_2.zza.isEmpty()) {
                } else {
                    int v2_3 = v2_2.zzd();
                    v3_5 = ((java.util.Map$Entry) v2_3.next());
                    v12_18 = v2_3;
                }
            }
            com.google.android.gms.internal.firebase-auth-api.zzanb v13_55 = this.zzc.length;
            sun.misc.Unsafe v14 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb;
            int v2_5 = 0;
            Object v5_121 = 0;
            int v4_1 = 1048575;
            while (v2_5 < v13_55) {
                Object v5_174;
                int v4_2;
                int v7_2;
                int v3_8;
                int v15 = v0_0.zzc(v2_5);
                int v16 = v7_1;
                int v7_0 = v0_0.zzc;
                java.util.List v8_64 = v7_0[v2_5];
                int v10_15 = ((v15 & v16) >> 20);
                int v17_1 = v9_8;
                if (v10_15 > 17) {
                    v7_2 = v3_5;
                    v3_8 = v4_1;
                    v4_2 = v5_121;
                    v5_174 = 0;
                } else {
                    int v7_5 = v7_0[(v2_5 + 2)];
                    com.google.android.gms.internal.firebase-auth-api.zzanb v9_12 = (v7_5 & v11_8);
                    if (v9_12 != v4_1) {
                        if (v9_12 != v11_8) {
                            v5_121 = v14.getInt(p21, ((long) v9_12));
                        } else {
                            v5_121 = 0;
                        }
                        v4_1 = v9_12;
                    }
                    v7_2 = v3_5;
                    v3_8 = v4_1;
                    v4_2 = v5_121;
                    v5_174 = (v17_1 << (v7_5 >> 20));
                }
                while ((v7_2 != 0) && (v0_0.zzq.zza(v7_2) <= v8_64)) {
                    v0_0.zzq.zza(p22, v7_2);
                    if (!v12_18.hasNext()) {
                        v7_2 = 0;
                    } else {
                        v7_2 = ((java.util.Map$Entry) v12_18.next());
                    }
                }
                int v18_1 = v12_18;
                com.google.android.gms.internal.firebase-auth-api.zzanb v11_9 = ((long) (v15 & v11_8));
                switch (v10_15) {
                    case 0:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zza(v8_64, com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p21, v11_9));
                        }
                        break;
                    case 1:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                            v0_0 = this;
                        } else {
                            p22.zza(v8_64, com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(p21, v11_9));
                        }
                        break;
                    case 2:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zzb(v8_64, v14.getLong(p21, v11_9));
                        }
                        break;
                    case 3:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zze(v8_64, v14.getLong(p21, v11_9));
                        }
                        break;
                    case 4:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zzc(v8_64, v14.getInt(p21, v11_9));
                        }
                        break;
                    case 5:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zza(v8_64, v14.getLong(p21, v11_9));
                        }
                        break;
                    case 6:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zzb(v8_64, v14.getInt(p21, v11_9));
                        }
                        break;
                    case 7:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zza(v8_64, com.google.android.gms.internal.firebase-auth-api.zzanz.zzh(p21, v11_9));
                        }
                        break;
                    case 8:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            com.google.android.gms.internal.firebase-auth-api.zzamq.zza(v8_64, v14.getObject(p21, v11_9), p22);
                        }
                        break;
                    case 9:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zzb(v8_64, v14.getObject(p21, v11_9), v0_0.zze(v2_5));
                        }
                        break;
                    case 10:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zza(v8_64, ((com.google.android.gms.internal.firebase-auth-api.zzajv) v14.getObject(p21, v11_9)));
                        }
                        break;
                    case 11:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zzf(v8_64, v14.getInt(p21, v11_9));
                        }
                        break;
                    case 12:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zza(v8_64, v14.getInt(p21, v11_9));
                        }
                        break;
                    case 13:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zzd(v8_64, v14.getInt(p21, v11_9));
                        }
                        break;
                    case 14:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zzc(v8_64, v14.getLong(p21, v11_9));
                        }
                        break;
                    case 15:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zze(v8_64, v14.getInt(p21, v11_9));
                        }
                        break;
                    case 16:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zzd(v8_64, v14.getLong(p21, v11_9));
                        }
                        break;
                    case 17:
                        v9_8 = v17_1;
                        if (!v0_0.zza(p21, v2_5, v3_8, v4_2, v5_174)) {
                        } else {
                            p22.zza(v8_64, v14.getObject(p21, v11_9), v0_0.zze(v2_5));
                        }
                        break;
                    case 18:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzb(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 19:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzf(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 20:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzh(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 21:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzn(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 22:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzg(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 23:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zze(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 24:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzd(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 25:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zza(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 26:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzb(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22);
                        break;
                    case 27:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzb(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v0_0.zze(v2_5));
                        break;
                    case 28:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zza(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22);
                        break;
                    case 29:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzm(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 30:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzc(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 31:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzi(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 32:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzj(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 33:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzk(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 34:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzl(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, 0);
                        break;
                    case 35:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzb(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 36:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzf(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 37:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzh(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 38:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzn(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 39:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzg(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 40:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zze(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 41:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzd(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 42:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zza(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 43:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzm(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 44:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzc(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 45:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzi(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 46:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzj(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 47:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzk(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 48:
                        v9_8 = v17_1;
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzl(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v9_8);
                        break;
                    case 49:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zza(v0_0.zzc[v2_5], ((java.util.List) v14.getObject(p21, v11_9)), p22, v0_0.zze(v2_5));
                        v9_8 = v17_1;
                        break;
                    case 50:
                        v0_0 = v0_0.zza(p22, v8_64, v14.getObject(p21, v11_9), v2_5);
                        break;
                    case 51:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zza(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zza(p21, v11_9));
                        }
                        break;
                    case 52:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zza(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzb(p21, v11_9));
                        }
                        break;
                    case 53:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zzb(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p21, v11_9));
                        }
                        break;
                    case 54:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zze(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p21, v11_9));
                        }
                        break;
                    case 55:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zzc(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, v11_9));
                        }
                        break;
                    case 56:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zza(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p21, v11_9));
                        }
                        break;
                    case 57:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zzb(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, v11_9));
                        }
                        break;
                    case 58:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zza(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zze(p21, v11_9));
                        }
                        break;
                    case 59:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            com.google.android.gms.internal.firebase-auth-api.zzamq.zza(v8_64, v14.getObject(p21, v11_9), p22);
                        }
                        break;
                    case 60:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zzb(v8_64, v14.getObject(p21, v11_9), v0_0.zze(v2_5));
                        }
                        break;
                    case 61:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zza(v8_64, ((com.google.android.gms.internal.firebase-auth-api.zzajv) v14.getObject(p21, v11_9)));
                        }
                        break;
                    case 62:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zzf(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, v11_9));
                        }
                        break;
                    case 63:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zza(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, v11_9));
                        }
                        break;
                    case 64:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zzd(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, v11_9));
                        }
                        break;
                    case 65:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zzc(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p21, v11_9));
                        }
                        break;
                    case 66:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zze(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, v11_9));
                        }
                        break;
                    case 67:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zzd(v8_64, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p21, v11_9));
                        }
                        break;
                    case 68:
                        if (!v0_0.zzc(p21, v8_64, v2_5)) {
                        } else {
                            p22.zza(v8_64, v14.getObject(p21, v11_9), v0_0.zze(v2_5));
                        }
                        break;
                    default:
                }
                v2_5 += 3;
                v5_121 = v4_2;
                v12_18 = v18_1;
                v11_8 = 1048575;
                v4_1 = v3_8;
                v3_5 = v7_2;
                v7_1 = v16;
            }
            int v18_0 = v12_18;
            while (v3_5 != 0) {
                v0_0.zzq.zza(p22, v3_5);
                if (!v18_0.hasNext()) {
                    v3_5 = 0;
                } else {
                    v3_5 = ((java.util.Map$Entry) v18_0.next());
                }
            }
            com.google.android.gms.internal.firebase-auth-api.zzamq.zza(v0_0.zzp, p21, p22);
            return;
        } else {
            int v2_16;
            int v3_1;
            com.google.android.gms.internal.firebase-auth-api.zzamq.zza(this.zzp, p21, p22);
            if (!this.zzh) {
                v2_16 = 0;
                v3_1 = 0;
            } else {
                int v2_15 = this.zzq.zza(p21);
                if (v2_15.zza.isEmpty()) {
                } else {
                    v2_16 = v2_15.zzc();
                    v3_1 = ((java.util.Map$Entry) v2_16.next());
                }
            }
            int v4_0 = (this.zzc.length - 3);
            while (v4_0 >= 0) {
                Object v5_175 = v0_0.zzc(v4_0);
                int v12_20 = v0_0.zzc[v4_0];
                while ((v3_1 != 0) && (v0_0.zzq.zza(v3_1) > v12_20)) {
                    v0_0.zzq.zza(p22, v3_1);
                    if (!v2_16.hasNext()) {
                        v3_1 = 0;
                    } else {
                        v3_1 = ((java.util.Map$Entry) v2_16.next());
                    }
                }
                switch (((v5_175 & 267386880) >> 20)) {
                    case 0:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p21, ((long) (v5_175 & 1048575))));
                        }
                    case 1:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 2:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zzb(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 3:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zze(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 4:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zzc(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 5:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 6:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zzb(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 7:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzh(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 8:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            com.google.android.gms.internal.firebase-auth-api.zzamq.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575))), p22);
                        }
                        break;
                    case 9:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zzb(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575))), v0_0.zze(v4_0));
                        }
                        break;
                    case 10:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zza(v12_20, ((com.google.android.gms.internal.firebase-auth-api.zzajv) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))));
                        }
                        break;
                    case 11:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zzf(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 12:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 13:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zzd(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 14:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zzc(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 15:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zze(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 16:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zzd(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 17:
                        if (!v0_0.zzc(p21, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575))), v0_0.zze(v4_0));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzb(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 19:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzf(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 20:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzh(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 21:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzn(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 22:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzg(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 23:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zze(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 24:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzd(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 25:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zza(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 26:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzb(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22);
                        break;
                    case 27:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzb(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, v0_0.zze(v4_0));
                        break;
                    case 28:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zza(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22);
                        break;
                    case 29:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzm(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 30:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzc(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 31:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzi(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 32:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzj(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 33:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzk(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 34:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzl(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 0);
                        break;
                    case 35:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzb(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 36:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzf(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 37:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzh(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 38:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzn(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 39:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzg(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 40:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zze(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 41:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzd(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 42:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zza(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 43:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzm(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 44:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzc(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 45:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzi(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 46:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzj(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 47:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzk(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 48:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zzl(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, 1);
                        break;
                    case 49:
                        com.google.android.gms.internal.firebase-auth-api.zzand.zza(v0_0.zzc[v4_0], ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))), p22, v0_0.zze(v4_0));
                        break;
                    case 50:
                        v0_0 = v0_0.zza(p22, v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575))), v4_0);
                        break;
                    case 51:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zza(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 52:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzb(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 53:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zzb(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 54:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zze(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 55:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zzc(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 56:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 57:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zzb(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 58:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zze(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 59:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            com.google.android.gms.internal.firebase-auth-api.zzamq.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575))), p22);
                        }
                        break;
                    case 60:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zzb(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575))), v0_0.zze(v4_0));
                        }
                        break;
                    case 61:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zza(v12_20, ((com.google.android.gms.internal.firebase-auth-api.zzajv) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575)))));
                        }
                        break;
                    case 62:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zzf(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 63:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 64:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zzd(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 65:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zzc(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 66:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zze(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 67:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zzd(v12_20, com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p21, ((long) (v5_175 & 1048575))));
                        }
                        break;
                    case 68:
                        if (!v0_0.zzc(p21, v12_20, v4_0)) {
                        } else {
                            p22.zza(v12_20, com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p21, ((long) (v5_175 & 1048575))), v0_0.zze(v4_0));
                        }
                        break;
                    default:
                }
                v4_0 -= 3;
            }
            while (v3_1 != 0) {
                v0_0.zzq.zza(p22, v3_1);
                if (!v2_16.hasNext()) {
                    v3_1 = 0;
                } else {
                    v3_1 = ((java.util.Map$Entry) v2_16.next());
                }
            }
            return;
        }
    }

    public final void zza(Object p7, Object p8)
    {
        com.google.android.gms.internal.firebase-auth-api.zzamq.zzf(p7);
        p8.getClass();
        int v0_1 = 0;
        while (v0_1 < this.zzc.length) {
            Object v1_9 = this.zzc(v0_1);
            long v2_2 = ((long) (1048575 & v1_9));
            long v4_5 = this.zzc[v0_1];
            switch (((v1_9 & 267386880) >> 20)) {
                case 0:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 1:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 2:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 3:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 4:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 5:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 6:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 7:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzh(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 8:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 9:
                    this.zza(p7, p8, v0_1);
                    break;
                case 10:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 11:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 12:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 13:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 14:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 15:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 16:
                    if (!this.zzc(p8, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p8, v2_2));
                        this.zzb(p7, v0_1);
                    }
                    break;
                case 17:
                    this.zza(p7, p8, v0_1);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzo.zza(p7, p8, v2_2);
                    break;
                case 50:
                    com.google.android.gms.internal.firebase-auth-api.zzand.zza(this.zzr, p7, p8, v2_2);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!this.zzc(p8, v4_5, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p8, v2_2));
                        this.zzb(p7, v4_5, v0_1);
                    }
                    break;
                case 60:
                    this.zzb(p7, p8, v0_1);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!this.zzc(p8, v4_5, v0_1)) {
                    } else {
                        com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p7, v2_2, com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p8, v2_2));
                        this.zzb(p7, v4_5, v0_1);
                    }
                    break;
                case 68:
                    this.zzb(p7, p8, v0_1);
                    break;
                default:
            }
            v0_1 += 3;
        }
        com.google.android.gms.internal.firebase-auth-api.zzand.zza(this.zzp, p7, p8);
        if (this.zzh) {
            com.google.android.gms.internal.firebase-auth-api.zzand.zza(this.zzq, p7, p8);
        }
        return;
    }

    public final void zza(Object p8, byte[] p9, int p10, int p11, com.google.android.gms.internal.firebase-auth-api.zzaju p12)
    {
        this.zza(p8, p9, p10, p11, 0, p12);
        return;
    }

    public final int zzb(Object p9)
    {
        int v0_1 = this.zzc.length;
        int v1_2 = 0;
        int v2_3 = 0;
        while (v1_2 < v0_1) {
            int v2_0;
            int v3_2;
            int v2_1;
            int v3_6;
            int v3_29 = this.zzc(v1_2);
            int v4_1 = this.zzc[v1_2];
            long v5_2 = ((long) (1048575 & v3_29));
            int v7_0 = 37;
            switch (((v3_29 & 267386880) >> 20)) {
                case 0:
                    v2_0 = (v2_3 * 53);
                    v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(Double.doubleToLongBits(com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p9, v5_2)));
                    v2_3 = (v3_2 + v2_0);
                    break;
                case 1:
                    v2_0 = (v2_3 * 53);
                    v3_2 = Float.floatToIntBits(com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(p9, v5_2));
                    break;
                case 2:
                    v2_0 = (v2_3 * 53);
                    v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p9, v5_2));
                    break;
                case 3:
                    v2_0 = (v2_3 * 53);
                    v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p9, v5_2));
                    break;
                case 4:
                    v2_1 = (v2_3 * 53);
                    v3_6 = com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p9, v5_2);
                    v2_3 = (v2_1 + v3_6);
                    break;
                case 5:
                    v2_0 = (v2_3 * 53);
                    v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p9, v5_2));
                    break;
                case 6:
                    v2_1 = (v2_3 * 53);
                    v3_6 = com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p9, v5_2);
                    break;
                case 7:
                    v2_0 = (v2_3 * 53);
                    v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zzh(p9, v5_2));
                    break;
                case 8:
                    v2_0 = (v2_3 * 53);
                    v3_2 = ((String) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p9, v5_2)).hashCode();
                    break;
                case 9:
                    int v3_25 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p9, v5_2);
                    if (v3_25 == 0) {
                        v2_3 = ((v2_3 * 53) + v7_0);
                    } else {
                        v7_0 = v3_25.hashCode();
                    }
                    break;
                case 10:
                    v2_0 = (v2_3 * 53);
                    v3_2 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p9, v5_2).hashCode();
                    break;
                case 11:
                    v2_1 = (v2_3 * 53);
                    v3_6 = com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p9, v5_2);
                    break;
                case 12:
                    v2_1 = (v2_3 * 53);
                    v3_6 = com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p9, v5_2);
                    break;
                case 13:
                    v2_1 = (v2_3 * 53);
                    v3_6 = com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p9, v5_2);
                    break;
                case 14:
                    v2_0 = (v2_3 * 53);
                    v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p9, v5_2));
                    break;
                case 15:
                    v2_1 = (v2_3 * 53);
                    v3_6 = com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p9, v5_2);
                    break;
                case 16:
                    v2_0 = (v2_3 * 53);
                    v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p9, v5_2));
                    break;
                case 17:
                    int v3_21 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p9, v5_2);
                    if (v3_21 == 0) {
                    } else {
                        v7_0 = v3_21.hashCode();
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    v2_0 = (v2_3 * 53);
                    v3_2 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p9, v5_2).hashCode();
                    break;
                case 50:
                    v2_0 = (v2_3 * 53);
                    v3_2 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p9, v5_2).hashCode();
                    break;
                case 51:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(Double.doubleToLongBits(com.google.android.gms.internal.firebase-auth-api.zzamq.zza(p9, v5_2)));
                    }
                    break;
                case 52:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = Float.floatToIntBits(com.google.android.gms.internal.firebase-auth-api.zzamq.zzb(p9, v5_2));
                    }
                    break;
                case 53:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p9, v5_2));
                    }
                    break;
                case 54:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p9, v5_2));
                    }
                    break;
                case 55:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_6 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p9, v5_2);
                    }
                    break;
                case 56:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p9, v5_2));
                    }
                    break;
                case 57:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_6 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p9, v5_2);
                    }
                    break;
                case 58:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzamq.zze(p9, v5_2));
                    }
                    break;
                case 59:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = ((String) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p9, v5_2)).hashCode();
                    }
                    break;
                case 60:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p9, v5_2).hashCode();
                    }
                    break;
                case 61:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p9, v5_2).hashCode();
                    }
                    break;
                case 62:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_6 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p9, v5_2);
                    }
                    break;
                case 63:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_6 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p9, v5_2);
                    }
                    break;
                case 64:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_6 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p9, v5_2);
                    }
                    break;
                case 65:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p9, v5_2));
                    }
                    break;
                case 66:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_6 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p9, v5_2);
                    }
                    break;
                case 67:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = com.google.android.gms.internal.firebase-auth-api.zzalh.zza(com.google.android.gms.internal.firebase-auth-api.zzamq.zzd(p9, v5_2));
                    }
                    break;
                case 68:
                    if (!this.zzc(p9, v4_1, v1_2)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_2 = com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p9, v5_2).hashCode();
                    }
                    break;
                default:
            }
            v1_2 += 3;
        }
        int v0_3 = (this.zzp.zzd(p9).hashCode() + (v2_3 * 53));
        if (this.zzh) {
            v0_3 = ((v0_3 * 53) + this.zzq.zza(p9).hashCode());
        }
        return v0_3;
    }

    public final boolean zzb(Object p10, Object p11)
    {
        com.google.android.gms.internal.firebase-auth-api.zzakw v0_1 = this.zzc.length;
        int v2_1 = 0;
        while(true) {
            int v3_0 = 1;
            if (v2_1 >= v0_1) {
                break;
            }
            boolean v4_37 = this.zzc(v2_1);
            long v6_6 = ((long) (v4_37 & 1048575));
            switch (((v4_37 & 267386880) >> 20)) {
                case 0:
                    if ((this.zzc(p10, p11, v2_1)) && (Double.doubleToLongBits(com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p10, v6_6)) == Double.doubleToLongBits(com.google.android.gms.internal.firebase-auth-api.zzanz.zza(p11, v6_6)))) {
                    } else {
                        v3_0 = 0;
                    }
                    break;
                case 1:
                    if ((this.zzc(p10, p11, v2_1)) && (Float.floatToIntBits(com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(p10, v6_6)) == Float.floatToIntBits(com.google.android.gms.internal.firebase-auth-api.zzanz.zzb(p11, v6_6)))) {
                    }
                    break;
                case 2:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p11, v6_6))) {
                    }
                    break;
                case 3:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p11, v6_6))) {
                    }
                    break;
                case 4:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p11, v6_6))) {
                    }
                    break;
                case 5:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p11, v6_6))) {
                    }
                    break;
                case 6:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p11, v6_6))) {
                    }
                    break;
                case 7:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzh(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzh(p11, v6_6))) {
                    }
                    break;
                case 8:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzand.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p10, v6_6), com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p11, v6_6)))) {
                    }
                    break;
                case 9:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzand.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p10, v6_6), com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p11, v6_6)))) {
                    }
                    break;
                case 10:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzand.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p10, v6_6), com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p11, v6_6)))) {
                    }
                    break;
                case 11:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p11, v6_6))) {
                    }
                    break;
                case 12:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p11, v6_6))) {
                    }
                    break;
                case 13:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p11, v6_6))) {
                    }
                    break;
                case 14:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p11, v6_6))) {
                    }
                    break;
                case 15:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p11, v6_6))) {
                    }
                    break;
                case 16:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p10, v6_6) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzd(p11, v6_6))) {
                    }
                    break;
                case 17:
                    if ((this.zzc(p10, p11, v2_1)) && (com.google.android.gms.internal.firebase-auth-api.zzand.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p10, v6_6), com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p11, v6_6)))) {
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    v3_0 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p10, v6_6), com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p11, v6_6));
                    break;
                case 50:
                    v3_0 = com.google.android.gms.internal.firebase-auth-api.zzand.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p10, v6_6), com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p11, v6_6));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    boolean v4_42 = ((long) (this.zzb(v2_1) & 1048575));
                    if ((com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p10, v4_42) == com.google.android.gms.internal.firebase-auth-api.zzanz.zzc(p11, v4_42)) && (com.google.android.gms.internal.firebase-auth-api.zzand.zza(com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p10, v6_6), com.google.android.gms.internal.firebase-auth-api.zzanz.zze(p11, v6_6)))) {
                    }
                    break;
                default:
            }
            if (v3_0 != 0) {
                v2_1 += 3;
            } else {
                return 0;
            }
        }
        if (this.zzp.zzd(p10).equals(this.zzp.zzd(p11))) {
            if (!this.zzh) {
                return 1;
            } else {
                return this.zzq.zza(p10).equals(this.zzq.zza(p11));
            }
        } else {
            return 0;
        }
    }

    public final void zzd(Object p8)
    {
        if (com.google.android.gms.internal.firebase-auth-api.zzamq.zzg(p8)) {
            int v1 = 0;
            if ((p8 instanceof com.google.android.gms.internal.firebase-auth-api.zzalf)) {
                ((com.google.android.gms.internal.firebase-auth-api.zzalf) p8).zzb(2147483647);
                ((com.google.android.gms.internal.firebase-auth-api.zzalf) p8).zza = 0;
                ((com.google.android.gms.internal.firebase-auth-api.zzalf) p8).zzu();
            }
            com.google.android.gms.internal.firebase-auth-api.zzakw v0_2 = this.zzc.length;
            while (v1 < v0_2) {
                sun.misc.Unsafe v2_0 = this.zzc(v1);
                Object v3_2 = ((long) (1048575 & v2_0));
                sun.misc.Unsafe v2_2 = ((v2_0 & 267386880) >> 20);
                if (v2_2 == 9) {
                    if (this.zzc(p8, v1)) {
                        this.zze(v1).zzd(com.google.android.gms.internal.firebase-auth-api.zzamq.zzb.getObject(p8, v3_2));
                    }
                } else {
                    if ((v2_2 == 60) || (v2_2 == 68)) {
                        if (this.zzc(p8, this.zzc[v1], v1)) {
                            this.zze(v1).zzd(com.google.android.gms.internal.firebase-auth-api.zzamq.zzb.getObject(p8, v3_2));
                        }
                    } else {
                        switch (v2_2) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzo.zzb(p8, v3_2);
                                break;
                            case 50:
                                sun.misc.Unsafe v2_7 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb;
                                Object v5_5 = v2_7.getObject(p8, v3_2);
                                if (v5_5 != null) {
                                    v2_7.putObject(p8, v3_2, this.zzr.zzc(v5_5));
                                }
                                break;
                            default:
                        }
                    }
                }
                v1 += 3;
            }
            this.zzp.zzf(p8);
            if (this.zzh) {
                this.zzq.zzc(p8);
            }
        }
        return;
    }

    public final boolean zze(Object p15)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanb v3_11 = 1048575;
        int v2 = 0;
        boolean v4_6 = 0;
        while (v2 < this.zzl) {
            Object v10;
            int v11;
            int v9 = this.zzk[v2];
            Class v5_5 = this.zzc[v9];
            int v13 = this.zzc(v9);
            com.google.android.gms.internal.firebase-auth-api.zzamq v7_1 = this.zzc[(v9 + 2)];
            boolean v8_1 = (v7_1 & 1048575);
            int v12 = (1 << (v7_1 >> 20));
            if (v8_1 == v3_11) {
                v10 = v3_11;
                v11 = v4_6;
            } else {
                if (v8_1 != 1048575) {
                    v4_6 = com.google.android.gms.internal.firebase-auth-api.zzamq.zzb.getInt(p15, ((long) v8_1));
                }
                v11 = v4_6;
                v10 = v8_1;
            }
            com.google.android.gms.internal.firebase-auth-api.zzamq v7_3;
            boolean v8_2;
            if ((268435456 & v13) == 0) {
                v7_3 = this;
                v8_2 = p15;
            } else {
                v7_3 = this;
                v8_2 = p15;
                if (!this.zza(p15, v9, v10, v11, v12)) {
                    return 0;
                }
            }
            java.util.Iterator v15_12 = ((267386880 & v13) >> 20);
            if ((v15_12 == 9) || (v15_12 == 17)) {
                if ((v7_3.zza(v8_2, v9, v10, v11, v12)) && (!com.google.android.gms.internal.firebase-auth-api.zzamq.zza(v8_2, v13, this.zze(v9)))) {
                    return 0;
                }
            } else {
                if (v15_12 != 27) {
                    if ((v15_12 == 60) || (v15_12 == 68)) {
                        if ((!this.zzc(v8_2, v5_5, v9)) || (com.google.android.gms.internal.firebase-auth-api.zzamq.zza(v8_2, v13, this.zze(v9)))) {
                            v2++;
                            p15 = v8_2;
                            v3_11 = v10;
                            v4_6 = v11;
                        } else {
                            return 0;
                        }
                    } else {
                        if (v15_12 != 49) {
                            if (v15_12 == 50) {
                                java.util.Iterator v15_3 = v7_3.zzr.zzd(com.google.android.gms.internal.firebase-auth-api.zzanz.zze(v8_2, ((long) (v13 & 1048575))));
                                if ((v15_3.isEmpty()) || (v7_3.zzr.zza(this.zzf(v9)).zzc.zzb() != com.google.android.gms.internal.firebase-auth-api.zzaoj.zzi)) {
                                } else {
                                    java.util.Iterator v15_6 = v15_3.values().iterator();
                                    com.google.android.gms.internal.firebase-auth-api.zzanb v3_9 = 0;
                                    while (v15_6.hasNext()) {
                                        boolean v4_4 = v15_6.next();
                                        if (v3_9 == null) {
                                            v3_9 = com.google.android.gms.internal.firebase-auth-api.zzamx.zza().zza(v4_4.getClass());
                                        }
                                        if (!v3_9.zze(v4_4)) {
                                            return 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                java.util.Iterator v15_21 = ((java.util.List) com.google.android.gms.internal.firebase-auth-api.zzanz.zze(v8_2, ((long) (v13 & 1048575))));
                if (!v15_21.isEmpty()) {
                    com.google.android.gms.internal.firebase-auth-api.zzanb v3_23 = this.zze(v9);
                    boolean v4_0 = 0;
                    while (v4_0 < v15_21.size()) {
                        if (v3_23.zze(v15_21.get(v4_0))) {
                            v4_0++;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }
        if ((!this.zzh) || (this.zzq.zza(p15).zzg())) {
            return 1;
        } else {
            return 0;
        }
    }
}
