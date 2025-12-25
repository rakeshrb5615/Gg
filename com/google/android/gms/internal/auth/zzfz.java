package com.google.android.gms.internal.auth;
final class zzfz implements com.google.android.gms.internal.auth.zzgh {
    private static final int[] zza;
    private static final sun.misc.Unsafe zzb;
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.auth.zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final com.google.android.gms.internal.auth.zzfk zzl;
    private final com.google.android.gms.internal.auth.zzgy zzm;
    private final com.google.android.gms.internal.auth.zzel zzn;
    private final com.google.android.gms.internal.auth.zzgb zzo;
    private final com.google.android.gms.internal.auth.zzfr zzp;

    static zzfz()
    {
        sun.misc.Unsafe v0_1 = new int[0];
        com.google.android.gms.internal.auth.zzfz.zza = v0_1;
        com.google.android.gms.internal.auth.zzfz.zzb = com.google.android.gms.internal.auth.zzhi.zzg();
        return;
    }

    private zzfz(int[] p1, Object[] p2, int p3, int p4, com.google.android.gms.internal.auth.zzfw p5, boolean p6, boolean p7, int[] p8, int p9, int p10, com.google.android.gms.internal.auth.zzgb p11, com.google.android.gms.internal.auth.zzfk p12, com.google.android.gms.internal.auth.zzgy p13, com.google.android.gms.internal.auth.zzel p14, com.google.android.gms.internal.auth.zzfr p15, byte[] p16)
    {
        this.zzc = p1;
        this.zzd = p2;
        this.zze = p3;
        this.zzf = p4;
        this.zzh = p6;
        this.zzi = p8;
        this.zzj = p9;
        this.zzk = p10;
        this.zzo = p11;
        this.zzl = p12;
        this.zzm = p13;
        this.zzn = p14;
        this.zzg = p5;
        this.zzp = p15;
        return;
    }

    private static reflect.Field zzA(Class p5, String p6)
    {
        try {
            String v5_1 = p5.getDeclaredField(p6);
            return v5_1;
        } catch (NoSuchFieldException) {
            String v0_1 = v5_1.getDeclaredFields();
            int v2_1 = 0;
        }
    }

    private final void zzB(Object p4, Object p5, int p6)
    {
        long v0_2 = ((long) (this.zzv(p6) & 1048575));
        if (this.zzG(p5, p6)) {
            Object v2_1 = com.google.android.gms.internal.auth.zzhi.zzf(p4, v0_2);
            Object v5_1 = com.google.android.gms.internal.auth.zzhi.zzf(p5, v0_2);
            if ((v2_1 != null) && (v5_1 != null)) {
                com.google.android.gms.internal.auth.zzhi.zzp(p4, v0_2, com.google.android.gms.internal.auth.zzez.zzg(v2_1, v5_1));
                this.zzD(p4, p6);
                return;
            } else {
                if (v5_1 != null) {
                    com.google.android.gms.internal.auth.zzhi.zzp(p4, v0_2, v5_1);
                    this.zzD(p4, p6);
                }
            }
        }
        return;
    }

    private final void zzC(Object p5, Object p6, int p7)
    {
        int v1_1 = this.zzc[p7];
        long v2_1 = ((long) (this.zzv(p7) & 1048575));
        if (this.zzJ(p6, v1_1, p7)) {
            int v0_2;
            if (!this.zzJ(p5, v1_1, p7)) {
                v0_2 = 0;
            } else {
                v0_2 = com.google.android.gms.internal.auth.zzhi.zzf(p5, v2_1);
            }
            Object v6_1 = com.google.android.gms.internal.auth.zzhi.zzf(p6, v2_1);
            if ((v0_2 != 0) && (v6_1 != null)) {
                com.google.android.gms.internal.auth.zzhi.zzp(p5, v2_1, com.google.android.gms.internal.auth.zzez.zzg(v0_2, v6_1));
                this.zzE(p5, v1_1, p7);
                return;
            } else {
                if (v6_1 != null) {
                    com.google.android.gms.internal.auth.zzhi.zzp(p5, v2_1, v6_1);
                    this.zzE(p5, v1_1, p7);
                }
            }
        }
        return;
    }

    private final void zzD(Object p5, int p6)
    {
        int v6_1 = this.zzs(p6);
        long v0_2 = ((long) (1048575 & v6_1));
        if (v0_2 != 1048575) {
            com.google.android.gms.internal.auth.zzhi.zzn(p5, v0_2, ((1 << (v6_1 >> 20)) | com.google.android.gms.internal.auth.zzhi.zzc(p5, v0_2)));
            return;
        } else {
            return;
        }
    }

    private final void zzE(Object p3, int p4, int p5)
    {
        com.google.android.gms.internal.auth.zzhi.zzn(p3, ((long) (this.zzs(p5) & 1048575)), p4);
        return;
    }

    private final boolean zzF(Object p1, Object p2, int p3)
    {
        if (this.zzG(p1, p3) != this.zzG(p2, p3)) {
            return 0;
        } else {
            return 1;
        }
    }

    private final boolean zzG(Object p8, int p9)
    {
        long v0_0 = this.zzs(p9);
        long v2_2 = ((long) (v0_0 & 1048575));
        if (v2_2 != 1048575) {
            if ((com.google.android.gms.internal.auth.zzhi.zzc(p8, v2_2) & (1 << (v0_0 >> 20))) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            com.google.android.gms.internal.auth.zzee v9_3 = this.zzv(p9);
            long v0_2 = ((long) (v9_3 & 1048575));
            switch (com.google.android.gms.internal.auth.zzfz.zzu(v9_3)) {
                case 0:
                    if (Double.doubleToRawLongBits(com.google.android.gms.internal.auth.zzhi.zza(p8, v0_2)) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 1:
                    if (Float.floatToRawIntBits(com.google.android.gms.internal.auth.zzhi.zzb(p8, v0_2)) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 2:
                    if (com.google.android.gms.internal.auth.zzhi.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 3:
                    if (com.google.android.gms.internal.auth.zzhi.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 4:
                    if (com.google.android.gms.internal.auth.zzhi.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 5:
                    if (com.google.android.gms.internal.auth.zzhi.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 6:
                    if (com.google.android.gms.internal.auth.zzhi.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 7:
                    return com.google.android.gms.internal.auth.zzhi.zzt(p8, v0_2);
                case 8:
                    IllegalArgumentException v8_30 = com.google.android.gms.internal.auth.zzhi.zzf(p8, v0_2);
                    if (!(v8_30 instanceof String)) {
                        if (!(v8_30 instanceof com.google.android.gms.internal.auth.zzee)) {
                            throw new IllegalArgumentException();
                        } else {
                            if (com.google.android.gms.internal.auth.zzee.zzb.equals(v8_30)) {
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
                    if (com.google.android.gms.internal.auth.zzhi.zzf(p8, v0_2) == null) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 10:
                    if (com.google.android.gms.internal.auth.zzee.zzb.equals(com.google.android.gms.internal.auth.zzhi.zzf(p8, v0_2))) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 11:
                    if (com.google.android.gms.internal.auth.zzhi.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 12:
                    if (com.google.android.gms.internal.auth.zzhi.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 13:
                    if (com.google.android.gms.internal.auth.zzhi.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 14:
                    if (com.google.android.gms.internal.auth.zzhi.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 15:
                    if (com.google.android.gms.internal.auth.zzhi.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 16:
                    if (com.google.android.gms.internal.auth.zzhi.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 17:
                    if (com.google.android.gms.internal.auth.zzhi.zzf(p8, v0_2) == null) {
                        return 0;
                    } else {
                        return 1;
                    }
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    private final boolean zzH(Object p2, int p3, int p4, int p5, int p6)
    {
        if (p4 != 1048575) {
            if ((p5 & p6) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return this.zzG(p2, p3);
        }
    }

    private static boolean zzI(Object p2, int p3, com.google.android.gms.internal.auth.zzgh p4)
    {
        return p4.zzi(com.google.android.gms.internal.auth.zzhi.zzf(p2, ((long) (p3 & 1048575))));
    }

    private final boolean zzJ(Object p3, int p4, int p5)
    {
        if (com.google.android.gms.internal.auth.zzhi.zzc(p3, ((long) (this.zzs(p5) & 1048575))) != p4) {
            return 0;
        } else {
            return 1;
        }
    }

    public static com.google.android.gms.internal.auth.zzgz zzc(Object p2)
    {
        com.google.android.gms.internal.auth.zzgz v0 = ((com.google.android.gms.internal.auth.zzeu) p2).zzc;
        if (v0 == com.google.android.gms.internal.auth.zzgz.zza()) {
            v0 = com.google.android.gms.internal.auth.zzgz.zzc();
            ((com.google.android.gms.internal.auth.zzeu) p2).zzc = v0;
        }
        return v0;
    }

    public static com.google.android.gms.internal.auth.zzfz zzj(Class p0, com.google.android.gms.internal.auth.zzft p1, com.google.android.gms.internal.auth.zzgb p2, com.google.android.gms.internal.auth.zzfk p3, com.google.android.gms.internal.auth.zzgy p4, com.google.android.gms.internal.auth.zzel p5, com.google.android.gms.internal.auth.zzfr p6)
    {
        if (!(p1 instanceof com.google.android.gms.internal.auth.zzgg)) {
            throw 0;
        } else {
            return com.google.android.gms.internal.auth.zzfz.zzk(((com.google.android.gms.internal.auth.zzgg) p1), p2, p3, p4, p5, p6);
        }
    }

    public static com.google.android.gms.internal.auth.zzfz zzk(com.google.android.gms.internal.auth.zzgg p34, com.google.android.gms.internal.auth.zzgb p35, com.google.android.gms.internal.auth.zzfk p36, com.google.android.gms.internal.auth.zzgy p37, com.google.android.gms.internal.auth.zzel p38, com.google.android.gms.internal.auth.zzfr p39)
    {
        int v10;
        if (p34.zzc() != 2) {
            v10 = 0;
        } else {
            v10 = 1;
        }
        int v6_2;
        com.google.android.gms.internal.auth.zzfw v0_9 = p34.zzd();
        int v1_0 = v0_9.length();
        int v5_0 = 55296;
        if (v0_9.charAt(0) < 55296) {
            v6_2 = 1;
        } else {
            char v4_2 = 1;
            while(true) {
                v6_2 = (v4_2 + 1);
                if (v0_9.charAt(v4_2) < 55296) {
                    break;
                }
                v4_2 = v6_2;
            }
        }
        char v4_1 = (v6_2 + 1);
        int v6_9 = v0_9.charAt(v6_2);
        if (v6_9 >= 55296) {
            int v6_10 = (v6_9 & 8191);
            int v8_7 = 13;
            while(true) {
                int v9_7 = (v4_1 + 1);
                char v4_12 = v0_9.charAt(v4_1);
                if (v4_12 < 55296) {
                    break;
                }
                v6_10 |= ((v4_12 & 8191) << v8_7);
                v8_7 += 13;
                v4_1 = v9_7;
            }
            v6_9 = (v6_10 | (v4_12 << v8_7));
            v4_1 = v9_7;
        }
        int v11_5;
        int v13_7;
        int v14_4;
        int v6_1;
        int[] v12_2;
        int v9_5;
        int v16_4;
        int v8_5;
        if (v6_9 != 0) {
            int v6_6 = (v4_1 + 1);
            char v4_17 = v0_9.charAt(v4_1);
            if (v4_17 >= 55296) {
                char v4_3 = (v4_17 & 8191);
                int v8_4 = 13;
                while(true) {
                    int v9_8 = (v6_6 + 1);
                    int v6_11 = v0_9.charAt(v6_6);
                    if (v6_11 < 55296) {
                        break;
                    }
                    v4_3 |= ((v6_11 & 8191) << v8_4);
                    v8_4 += 13;
                    v6_6 = v9_8;
                }
                v4_17 = (v4_3 | (v6_11 << v8_4));
                v6_6 = v9_8;
            }
            int v8_3 = (v6_6 + 1);
            int v6_13 = v0_9.charAt(v6_6);
            if (v6_13 >= 55296) {
                int v6_3 = (v6_13 & 8191);
                int v9_4 = 13;
                while(true) {
                    int v11_9 = (v8_3 + 1);
                    int v8_8 = v0_9.charAt(v8_3);
                    if (v8_8 < 55296) {
                        break;
                    }
                    v6_3 |= ((v8_8 & 8191) << v9_4);
                    v9_4 += 13;
                    v8_3 = v11_9;
                }
                v6_13 = (v6_3 | (v8_8 << v9_4));
                v8_3 = v11_9;
            }
            int v9_3 = (v8_3 + 1);
            v8_5 = v0_9.charAt(v8_3);
            if (v8_5 >= 55296) {
                int v8_0 = (v8_5 & 8191);
                int v11_4 = 13;
                while(true) {
                    int[] v12_7 = (v9_3 + 1);
                    int v9_9 = v0_9.charAt(v9_3);
                    if (v9_9 < 55296) {
                        break;
                    }
                    v8_0 |= ((v9_9 & 8191) << v11_4);
                    v11_4 += 13;
                    v9_3 = v12_7;
                }
                v8_5 = (v8_0 | (v9_9 << v11_4));
                v9_3 = v12_7;
            }
            int v11_3 = (v9_3 + 1);
            v9_5 = v0_9.charAt(v9_3);
            if (v9_5 >= 55296) {
                int v9_0 = (v9_5 & 8191);
                int[] v12_6 = 13;
                while(true) {
                    int v13_13 = (v11_3 + 1);
                    int v11_10 = v0_9.charAt(v11_3);
                    if (v11_10 < 55296) {
                        break;
                    }
                    v9_0 |= ((v11_10 & 8191) << v12_6);
                    v12_6 += 13;
                    v11_3 = v13_13;
                }
                v9_5 = (v9_0 | (v11_10 << v12_6));
                v11_3 = v13_13;
            }
            int[] v12_5 = (v11_3 + 1);
            v11_5 = v0_9.charAt(v11_3);
            if (v11_5 >= 55296) {
                int v11_0 = (v11_5 & 8191);
                int v13_10 = 13;
                while(true) {
                    int v14_9 = (v12_5 + 1);
                    int[] v12_8 = v0_9.charAt(v12_5);
                    if (v12_8 < 55296) {
                        break;
                    }
                    v11_0 |= ((v12_8 & 8191) << v13_10);
                    v13_10 += 13;
                    v12_5 = v14_9;
                }
                v11_5 = (v11_0 | (v12_8 << v13_10));
                v12_5 = v14_9;
            }
            int v13_0 = (v12_5 + 1);
            int[] v12_0 = v0_9.charAt(v12_5);
            if (v12_0 >= 55296) {
                int[] v12_1 = (v12_0 & 8191);
                int v14_0 = 13;
                while(true) {
                    int v15_0 = (v13_0 + 1);
                    int v13_1 = v0_9.charAt(v13_0);
                    if (v13_1 < 55296) {
                        break;
                    }
                    v12_1 |= ((v13_1 & 8191) << v14_0);
                    v14_0 += 13;
                    v13_0 = v15_0;
                }
                v12_0 = (v12_1 | (v13_1 << v14_0));
                v13_0 = v15_0;
            }
            int v14_1 = (v13_0 + 1);
            int v13_3 = v0_9.charAt(v13_0);
            if (v13_3 >= 55296) {
                int v13_4 = (v13_3 & 8191);
                int v15_1 = 13;
                while(true) {
                    int v16_0 = (v14_1 + 1);
                    int v14_2 = v0_9.charAt(v14_1);
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
            v14_4 = v0_9.charAt(v14_1);
            if (v14_4 >= 55296) {
                int v14_5 = (v14_4 & 8191);
                int v16_1 = 13;
                while(true) {
                    int v17_0 = (v15_2 + 1);
                    int v15_3 = v0_9.charAt(v15_2);
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
            int v13_6 = new int[((v14_4 + v12_0) + v13_3)];
            v16_4 = ((v4_17 + v4_17) + v6_13);
            v13_7 = v12_0;
            v12_2 = v13_6;
            v6_1 = v4_17;
            v4_1 = v15_2;
        } else {
            v8_5 = 0;
            v9_5 = 0;
            v11_5 = 0;
            v13_7 = 0;
            v14_4 = 0;
            v16_4 = 0;
            v12_2 = com.google.android.gms.internal.auth.zzfz.zza;
            v6_1 = 0;
        }
        int v15_7 = com.google.android.gms.internal.auth.zzfz.zzb;
        int v17_1 = p34.zze();
        Class v2_0 = p34.zza().getClass();
        int v3_1 = new int[(v11_5 * 3)];
        int v11_7 = new Object[(v11_5 + v11_5)];
        int v13_11 = (v13_7 + v14_4);
        int v23 = v13_11;
        int v22_0 = v14_4;
        int v20_0 = 0;
        int v21 = 0;
        while (v4_1 < v1_0) {
            int v7_1;
            int v24_1 = (v4_1 + 1);
            char v4_7 = v0_9.charAt(v4_1);
            if (v4_7 < v5_0) {
                v7_1 = v24_1;
            } else {
                char v4_8 = (v4_7 & 8191);
                int v7_2 = v24_1;
                int v24_2 = 13;
                while(true) {
                    int v25_0 = (v7_2 + 1);
                    int v7_3 = v0_9.charAt(v7_2);
                    if (v7_3 < v5_0) {
                        break;
                    }
                    v4_8 |= ((v7_3 & 8191) << v24_2);
                    v24_2 += 13;
                    v7_2 = v25_0;
                }
                v4_7 = (v4_8 | (v7_3 << v24_2));
                v7_1 = v25_0;
            }
            int v1_2;
            int v27;
            int v24_3 = (v7_1 + 1);
            int v7_5 = v0_9.charAt(v7_1);
            if (v7_5 < v5_0) {
                v27 = v1_0;
                v1_2 = v24_3;
            } else {
                int v7_6 = (v7_5 & 8191);
                int v5_3 = v24_3;
                int v24_4 = 13;
                while(true) {
                    int v26_0 = (v5_3 + 1);
                    int v5_4 = v0_9.charAt(v5_3);
                    v27 = v1_0;
                    if (v5_4 < 55296) {
                        break;
                    }
                    v7_6 |= ((v5_4 & 8191) << v24_4);
                    v24_4 += 13;
                    v5_3 = v26_0;
                    v1_0 = v27;
                }
                v7_5 = (v7_6 | (v5_4 << v24_4));
                v1_2 = v26_0;
            }
            int v5_5 = (v7_5 & 255);
            int v24_5 = v3_1;
            if ((v7_5 & 1024) != 0) {
                int v3_3 = (v21 + 1);
                v12_2[v21] = v20_0;
                v21 = v3_3;
            }
            int v3_40;
            int v32_0;
            int v1_8;
            int v26_5;
            if (v5_5 < 51) {
                v32_0 = v4_7;
                int v3_5 = (v16_4 + 1);
                char v4_11 = com.google.android.gms.internal.auth.zzfz.zzA(v2_0, ((String) v17_1[v16_4]));
                int v26_1 = v3_5;
                if ((v5_5 != 9) && (v5_5 != 17)) {
                    if ((v5_5 != 27) && (v5_5 != 49)) {
                        if ((v5_5 != 12) && ((v5_5 != 30) && (v5_5 != 44))) {
                            if (v5_5 != 50) {
                                v16_4 = v26_1;
                            } else {
                                int v3_14 = (v22_0 + 1);
                                v12_2[v22_0] = v20_0;
                                int v22_2 = ((v20_0 / 3) + (v20_0 / 3));
                                int v28_0 = (v16_4 + 2);
                                v11_7[v22_2] = v17_1[v26_1];
                                int v29 = v3_14;
                                if ((v7_5 & 2048) == 0) {
                                    v16_4 = v28_0;
                                } else {
                                    int v3_16 = (v16_4 + 3);
                                    v11_7[(v22_2 + 1)] = v17_1[v28_0];
                                    v16_4 = v3_16;
                                }
                                v22_0 = v29;
                            }
                        } else {
                            if (v10 != 0) {
                            } else {
                                v16_4 += 2;
                                v11_7[(((v20_0 / 3) + (v20_0 / 3)) + 1)] = v17_1[v26_1];
                            }
                        }
                    } else {
                        v16_4 += 2;
                        v11_7[(((v20_0 / 3) + (v20_0 / 3)) + 1)] = v17_1[v26_1];
                    }
                } else {
                    v11_7[(((v20_0 / 3) + (v20_0 / 3)) + 1)] = v4_11.getType();
                }
                int v3_30;
                int v1_5;
                v26_5 = 1048575;
                int v28_1 = ((int) v15_7.objectFieldOffset(v4_11));
                if (((v7_5 & 4096) != 4096) || (v5_5 > 17)) {
                    v3_30 = v1_2;
                    v1_5 = 0;
                } else {
                    int v26_6;
                    int v3_31 = (v1_2 + 1);
                    int v1_6 = v0_9.charAt(v1_2);
                    if (v1_6 < 55296) {
                        v26_6 = v3_31;
                    } else {
                        int v1_7 = (v1_6 & 8191);
                        int v25_1 = 13;
                        while(true) {
                            v26_6 = (v3_31 + 1);
                            int v3_32 = v0_9.charAt(v3_31);
                            if (v3_32 < 55296) {
                                break;
                            }
                            v1_7 |= ((v3_32 & 8191) << v25_1);
                            v25_1 += 13;
                            v3_31 = v26_6;
                        }
                        v1_6 = (v1_7 | (v3_32 << v25_1));
                    }
                    int v3_37;
                    int v25_3 = ((v1_6 / 32) + (v6_1 + v6_1));
                    int v3_35 = v17_1[v25_3];
                    if (!(v3_35 instanceof reflect.Field)) {
                        v3_37 = com.google.android.gms.internal.auth.zzfz.zzA(v2_0, ((String) v3_35));
                        v17_1[v25_3] = v3_37;
                    } else {
                        v3_37 = ((reflect.Field) v3_35);
                    }
                    v1_5 = (v1_6 % 32);
                    v26_5 = ((int) v15_7.objectFieldOffset(v3_37));
                    v3_30 = v26_6;
                }
                if ((v5_5 >= 18) && (v5_5 <= 49)) {
                    char v4_20 = (v23 + 1);
                    v12_2[v23] = v28_1;
                    v23 = v4_20;
                }
                v4_1 = v3_30;
                v3_40 = v1_5;
                v1_8 = v28_1;
            } else {
                int v3_45;
                int v3_43 = (v1_2 + 1);
                int v1_9 = v0_9.charAt(v1_2);
                int v26_7 = v3_43;
                if (v1_9 < 55296) {
                    v3_45 = v26_7;
                } else {
                    int v1_10 = (v1_9 & 8191);
                    int v3_46 = v26_7;
                    int v26_8 = 13;
                    while(true) {
                        char v31_0 = (v3_46 + 1);
                        int v3_47 = v0_9.charAt(v3_46);
                        int v32_1 = v1_10;
                        if (v3_47 < 55296) {
                            break;
                        }
                        v1_10 = (v32_1 | ((v3_47 & 8191) << v26_8));
                        v26_8 += 13;
                        v3_46 = v31_0;
                    }
                    v1_9 = (v32_1 | (v3_47 << v26_8));
                    v3_45 = v31_0;
                }
                int v3_51;
                int v26_9 = v1_9;
                int v1_13 = (v5_5 - 51);
                char v31_1 = v3_45;
                if ((v1_13 != 9) && (v1_13 != 17)) {
                    if ((v1_13 == 12) && (v10 == 0)) {
                        v3_51 = (v16_4 + 1);
                        v11_7[(((v20_0 / 3) + (v20_0 / 3)) + 1)] = v17_1[v16_4];
                        v16_4 = v3_51;
                    }
                } else {
                    v3_51 = (v16_4 + 1);
                    v11_7[(((v20_0 / 3) + (v20_0 / 3)) + 1)] = v17_1[v16_4];
                }
                int v3_54;
                int v1_20 = (v26_9 + v26_9);
                int v3_52 = v17_1[v1_20];
                int v26_10 = v1_20;
                if (!(v3_52 instanceof reflect.Field)) {
                    v3_54 = com.google.android.gms.internal.auth.zzfz.zzA(v2_0, ((String) v3_52));
                    v17_1[v26_10] = v3_54;
                } else {
                    v3_54 = ((reflect.Field) v3_52);
                }
                char v4_23;
                v32_0 = v4_7;
                int v3_56 = (v26_10 + 1);
                char v4_21 = v17_1[v3_56];
                int v26_11 = ((int) v15_7.objectFieldOffset(v3_54));
                if (!(v4_21 instanceof reflect.Field)) {
                    v4_23 = com.google.android.gms.internal.auth.zzfz.zzA(v2_0, ((String) v4_21));
                    v17_1[v3_56] = v4_23;
                } else {
                    v4_23 = ((reflect.Field) v4_21);
                }
                v26_5 = ((int) v15_7.objectFieldOffset(v4_23));
                v1_8 = v26_11;
                v4_1 = v31_1;
                v3_40 = 0;
            }
            com.google.android.gms.internal.auth.zzfw v0_3;
            int v25_4 = (v20_0 + 1);
            v24_5[v20_0] = v32_0;
            int v28_2 = (v20_0 + 2);
            com.google.android.gms.internal.auth.zzfw v30 = v0_9;
            if ((v7_5 & 512) == 0) {
                v0_3 = 0;
            } else {
                v0_3 = 536870912;
            }
            int v7_8;
            if ((v7_5 & 256) == 0) {
                v7_8 = 0;
            } else {
                v7_8 = 268435456;
            }
            v24_5[v25_4] = (((v0_3 | v7_8) | (v5_5 << 20)) | v1_8);
            v20_0 += 3;
            v24_5[v28_2] = ((v3_40 << 20) | v26_5);
            v3_1 = v24_5;
            v1_0 = v27;
            v0_9 = v30;
            v5_0 = 55296;
        }
        return new com.google.android.gms.internal.auth.zzfz(v3_1, v11_7, v8_5, v9_5, p34.zza(), v10, 0, v12_2, v14_4, v13_11, p35, p36, p37, p38, p39, 0);
    }

    private static int zzl(Object p0, long p1)
    {
        return ((Integer) com.google.android.gms.internal.auth.zzhi.zzf(p0, p1)).intValue();
    }

    private final int zzm(Object p1, byte[] p2, int p3, int p4, int p5, long p6, com.google.android.gms.internal.auth.zzds p8)
    {
        p2 = com.google.android.gms.internal.auth.zzfz.zzb;
        this.zzz(p5);
        p4 = p2.getObject(p1, p6);
        if (!((com.google.android.gms.internal.auth.zzfq) p4).zze()) {
            com.google.android.gms.internal.auth.zzfq v5_2 = com.google.android.gms.internal.auth.zzfq.zza().zzb();
            com.google.android.gms.internal.auth.zzfr.zza(v5_2, p4);
            p2.putObject(p1, p6, v5_2);
        }
        throw 0;
    }

    private final int zzn(Object p17, byte[] p18, int p19, int p20, int p21, int p22, int p23, int p24, int p25, long p26, int p28, com.google.android.gms.internal.auth.zzds p29)
    {
        int v2_0;
        sun.misc.Unsafe v11 = com.google.android.gms.internal.auth.zzfz.zzb;
        long v12 = ((long) (this.zzc[(p28 + 2)] & 1048575));
        Object v14_0 = 0;
        int v6_4 = 1;
        switch (p25) {
            case 51:
                v2_0 = p19;
                if (p23 == 1) {
                    v11.putObject(p17, p26, Double.valueOf(Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdt.zzn(p18, p19))));
                    v11.putInt(p17, v12, p22);
                    return (p19 + 8);
                } else {
                }
            case 52:
                v2_0 = p19;
                if (p23 == 5) {
                    v11.putObject(p17, p26, Float.valueOf(Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdt.zzb(p18, p19))));
                    v11.putInt(p17, v12, p22);
                    return (p19 + 4);
                } else {
                }
            case 53:
            case 54:
                v2_0 = p19;
                if (p23 == 0) {
                    int v2_6 = com.google.android.gms.internal.auth.zzdt.zzm(p18, p19, p29);
                    v11.putObject(p17, p26, Long.valueOf(p29.zzb));
                    v11.putInt(p17, v12, p22);
                    return v2_6;
                } else {
                }
            case 55:
            case 62:
                v2_0 = p19;
                if (p23 == 0) {
                    int v2_5 = com.google.android.gms.internal.auth.zzdt.zzj(p18, p19, p29);
                    v11.putObject(p17, p26, Integer.valueOf(p29.zza));
                    v11.putInt(p17, v12, p22);
                    return v2_5;
                } else {
                }
            case 56:
            case 65:
                v2_0 = p19;
                if (p23 == 1) {
                    v11.putObject(p17, p26, Long.valueOf(com.google.android.gms.internal.auth.zzdt.zzn(p18, p19)));
                    v11.putInt(p17, v12, p22);
                    return (p19 + 8);
                } else {
                }
            case 57:
            case 64:
                v2_0 = p19;
                if (p23 == 5) {
                    v11.putObject(p17, p26, Integer.valueOf(com.google.android.gms.internal.auth.zzdt.zzb(p18, p19)));
                    v11.putInt(p17, v12, p22);
                    return (p19 + 4);
                } else {
                }
            case 58:
                v2_0 = p19;
                if (p23 != 0) {
                } else {
                    int v2_4 = com.google.android.gms.internal.auth.zzdt.zzm(p18, p19, p29);
                    if (p29.zzb == 0) {
                        v6_4 = 0;
                    }
                    v11.putObject(p17, p26, Boolean.valueOf(v6_4));
                    v11.putInt(p17, v12, p22);
                    return v2_4;
                }
            case 59:
                v2_0 = p19;
                if (p23 != 2) {
                } else {
                    int v2_3 = com.google.android.gms.internal.auth.zzdt.zzj(p18, p19, p29);
                    Object v3_6 = p29.zza;
                    if (v3_6 != null) {
                        if (((p24 & 536870912) != 0) && (!com.google.android.gms.internal.auth.zzhm.zzd(p18, v2_3, (v2_3 + v3_6)))) {
                            throw com.google.android.gms.internal.auth.zzfa.zzb();
                        } else {
                            v11.putObject(p17, p26, new String(p18, v2_3, v3_6, com.google.android.gms.internal.auth.zzez.zzb));
                            v2_3 += v3_6;
                        }
                    } else {
                        v11.putObject(p17, p26, "");
                    }
                    v11.putInt(p17, v12, p22);
                    return v2_3;
                }
            case 60:
                v2_0 = p19;
                if (p23 != 2) {
                } else {
                    int v2_2 = com.google.android.gms.internal.auth.zzdt.zzd(this.zzy(p28), p18, p19, p20, p29);
                    if (v11.getInt(p17, v12) == p22) {
                        v14_0 = v11.getObject(p17, p26);
                    }
                    if (v14_0 != null) {
                        v11.putObject(p17, p26, com.google.android.gms.internal.auth.zzez.zzg(v14_0, p29.zzc));
                    } else {
                        v11.putObject(p17, p26, p29.zzc);
                    }
                    v11.putInt(p17, v12, p22);
                    return v2_2;
                }
            case 61:
                v2_0 = p19;
                if (p23 == 2) {
                    int v2_1 = com.google.android.gms.internal.auth.zzdt.zza(p18, p19, p29);
                    v11.putObject(p17, p26, p29.zzc);
                    v11.putInt(p17, v12, p22);
                    return v2_1;
                } else {
                }
            case 63:
                v2_0 = p19;
                if (p23 != 0) {
                } else {
                    int v2_11 = com.google.android.gms.internal.auth.zzdt.zzj(p18, p19, p29);
                    Object v3_38 = p29.zza;
                    String v4_11 = this.zzx(p28);
                    if ((v4_11 != null) && (!v4_11.zza())) {
                        com.google.android.gms.internal.auth.zzfz.zzc(p17).zzf(p21, Long.valueOf(((long) v3_38)));
                        return v2_11;
                    } else {
                        v11.putObject(p17, p26, Integer.valueOf(v3_38));
                        v11.putInt(p17, v12, p22);
                        return v2_11;
                    }
                }
            case 66:
                v2_0 = p19;
                if (p23 == 0) {
                    int v2_10 = com.google.android.gms.internal.auth.zzdt.zzj(p18, p19, p29);
                    v11.putObject(p17, p26, Integer.valueOf(com.google.android.gms.internal.auth.zzei.zzb(p29.zza)));
                    v11.putInt(p17, v12, p22);
                    return v2_10;
                } else {
                }
            case 67:
                v2_0 = p19;
                if (p23 == 0) {
                    int v2_9 = com.google.android.gms.internal.auth.zzdt.zzm(p18, p19, p29);
                    v11.putObject(p17, p26, Long.valueOf(com.google.android.gms.internal.auth.zzei.zzc(p29.zzb)));
                    v11.putInt(p17, v12, p22);
                    return v2_9;
                } else {
                }
            case 68:
                if (p23 != 3) {
                    v2_0 = p19;
                } else {
                    int v2_8 = com.google.android.gms.internal.auth.zzdt.zzc(this.zzy(p28), p18, p19, p20, ((p21 & -8) | 4), p29);
                    if (v11.getInt(p17, v12) == p22) {
                        v14_0 = v11.getObject(p17, p26);
                    }
                    if (v14_0 != null) {
                        v11.putObject(p17, p26, com.google.android.gms.internal.auth.zzez.zzg(v14_0, p29.zzc));
                    } else {
                        v11.putObject(p17, p26, p29.zzc);
                    }
                    v11.putInt(p17, v12, p22);
                    return v2_8;
                }
            default:
        }
        return v2_0;
    }

    private final int zzo(Object p28, byte[] p29, int p30, int p31, com.google.android.gms.internal.auth.zzds p32)
    {
        com.google.android.gms.internal.auth.zzfz v0_0 = this;
        Object v1_0 = p28;
        byte[] v7_0 = p29;
        int v8_2 = p31;
        com.google.android.gms.internal.auth.zzds v13_0 = p32;
        byte[] v2_1 = com.google.android.gms.internal.auth.zzfz.zzb;
        Object v9_1 = -1;
        Object v3_0 = p30;
        long v4_1 = -1;
        int v5_0 = 0;
        int v11_0 = 0;
        long v10_0 = 1048575;
        while (v3_0 < v8_2) {
            Object v6_16 = (v3_0 + 1);
            Object v3_19 = v7_0[v3_0];
            if (v3_19 < null) {
                v6_16 = com.google.android.gms.internal.auth.zzdt.zzk(v3_19, v7_0, v6_16, v13_0);
                v3_19 = v13_0.zza;
            }
            long v4_19;
            Object v12_0 = v6_16;
            com.google.android.gms.internal.auth.zzds v14_1 = (v3_19 >> 3);
            Object v6_20 = (v3_19 & 7);
            if (v14_1 <= v4_1) {
                v4_19 = v0_0.zzq(v14_1);
            } else {
                v4_19 = v0_0.zzr(v14_1, (v5_0 / 3));
            }
            byte[] v24_0;
            byte[] v2_3;
            Object v6_3;
            int v18;
            Object v9_0;
            int v8_0;
            if (v4_19 != v9_1) {
                int v5_13 = v0_0.zzc;
                Object v9_6 = v5_13[(v4_19 + 1)];
                long v15_3 = com.google.android.gms.internal.auth.zzfz.zzu(v9_6);
                int v30_1 = v3_19;
                long v19_1 = v4_19;
                long v20 = ((long) (v9_6 & 1048575));
                if (v15_3 > 17) {
                    int v23_0;
                    long v10_1;
                    int v11_2;
                    long v15_0;
                    Object v3_2;
                    v8_0 = v19_1;
                    long v4_20 = v20;
                    if (v15_3 != 27) {
                        v3_2 = v12_0;
                        Object v12_4 = v2_1;
                        byte[] v2_10 = v30_1;
                        if (v15_3 > 49) {
                            byte[] v7_4 = v6_20;
                            v23_0 = v11_0;
                            v24_0 = v12_4;
                            v18 = -1;
                            v11_2 = v2_10;
                            Object v12_5 = v8_0;
                            Object v9_7 = v15_3;
                            v15_0 = v10_0;
                            v10_1 = v14_1;
                            if (v9_7 != 50) {
                                v6_3 = v10_1;
                                int v5_14 = v11_2;
                                byte[] v7_5 = this.zzn(p28, p29, v3_2, p31, v5_14, v6_3, v7_4, v9_6, v9_7, v4_20, v12_5, p32);
                                v9_0 = p28;
                                v2_3 = v5_14;
                                v8_0 = v12_5;
                                if (v7_5 == v3_2) {
                                    v12_0 = v7_5;
                                    v10_0 = v15_0;
                                    v11_0 = v23_0;
                                    v7_0 = p29;
                                    v13_0 = p32;
                                    v4_1 = v6_3;
                                    v5_0 = v8_0;
                                    v1_0 = v9_0;
                                    v9_1 = v18;
                                    v2_1 = v24_0;
                                    v8_2 = p31;
                                    v3_0 = com.google.android.gms.internal.auth.zzdt.zzi(v2_3, p29, v12_0, p31, com.google.android.gms.internal.auth.zzfz.zzc(v9_0), p32);
                                    v0_0 = this;
                                } else {
                                    v0_0 = this;
                                    v13_0 = p32;
                                    v4_1 = v6_3;
                                    v3_0 = v7_5;
                                    v5_0 = v8_0;
                                    v1_0 = p28;
                                }
                            } else {
                                if (v7_4 != 2) {
                                    v8_0 = v12_5;
                                    v9_0 = p28;
                                    v12_0 = v3_2;
                                    v6_3 = v10_1;
                                    v2_3 = v11_2;
                                } else {
                                    int v5_1 = v12_5;
                                    Object v6_1 = this.zzm(p28, p29, v3_2, p31, v5_1, v4_20, p32);
                                    v8_0 = v5_1;
                                    if (v6_1 == v3_2) {
                                        v9_0 = p28;
                                        v12_0 = v6_1;
                                    } else {
                                        v0_0 = this;
                                        v1_0 = p28;
                                        v7_0 = p29;
                                        v13_0 = p32;
                                        v3_0 = v6_1;
                                        v5_0 = v8_0;
                                        v4_1 = v10_1;
                                        v10_0 = v15_0;
                                        v9_1 = -1;
                                        v11_0 = v23_0;
                                        v2_1 = v24_0;
                                        v8_2 = p31;
                                    }
                                }
                            }
                        } else {
                            v23_0 = v11_0;
                            v24_0 = v12_4;
                            Object v6_2 = v14_1;
                            v18 = -1;
                            v15_0 = v10_0;
                            int v5_2 = v2_10;
                            byte[] v7_2 = v0_0.zzp(p28, p29, v3_2, p31, v5_2, v6_2, v6_20, v8_0, ((long) v9_6), v15_3, v4_20, p32);
                            v11_2 = v5_2;
                            v10_1 = v6_2;
                            if (v7_2 == v3_2) {
                                v9_0 = p28;
                                v12_0 = v7_2;
                            } else {
                                v0_0 = this;
                                v1_0 = p28;
                                v13_0 = p32;
                                v3_0 = v7_2;
                                v5_0 = v8_0;
                                v4_1 = v10_1;
                            }
                        }
                        v10_0 = v15_0;
                        v9_1 = v18;
                        v11_0 = v23_0;
                        v2_1 = v24_0;
                        v7_0 = p29;
                    } else {
                        if (v6_20 != 2) {
                            v3_2 = v12_0;
                            v15_0 = v10_0;
                            v23_0 = v11_0;
                            v24_0 = v2_1;
                            v10_1 = v14_1;
                            v18 = -1;
                            v11_2 = v30_1;
                        } else {
                            Object v3_4 = ((com.google.android.gms.internal.auth.zzey) v2_1.getObject(v1_0, v4_20));
                            if (!v3_4.zzc()) {
                                Object v6_6;
                                Object v6_5 = v3_4.size();
                                if (v6_5 != null) {
                                    v6_6 = (v6_5 + v6_5);
                                } else {
                                    v6_6 = 10;
                                }
                                v3_4 = v3_4.zzd(v6_6);
                                v2_1.putObject(v1_0, v4_20, v3_4);
                            }
                            Object v12_3 = v2_1;
                            Object v1_5 = com.google.android.gms.internal.auth.zzdt.zze(v0_0.zzy(v8_0), v30_1, v7_0, v12_0, p31, v3_4, v13_0);
                            v7_0 = p29;
                            v13_0 = p32;
                            v3_0 = v1_5;
                            v5_0 = v8_0;
                            v2_1 = v12_3;
                            v4_1 = v14_1;
                            v9_1 = -1;
                            v1_0 = p28;
                        }
                    }
                } else {
                    Object v3_7 = v5_13[(v19_1 + 2)];
                    int v22 = (1 << (v3_7 >> 20));
                    Object v3_8 = (v3_7 & 1048575);
                    if (v3_8 != v10_0) {
                        int v5_6 = 1048575;
                        if (v10_0 != 1048575) {
                            v2_1.putInt(v1_0, ((long) v10_0), v11_0);
                            v5_6 = 1048575;
                        }
                        if (v3_8 != v5_6) {
                            v11_0 = v2_1.getInt(v1_0, ((long) v3_8));
                        }
                        v10_0 = v3_8;
                    }
                    long v15_2;
                    switch (v15_3) {
                        case 0:
                            v15_2 = v19_1;
                            if (v6_20 != 1) {
                            } else {
                                com.google.android.gms.internal.auth.zzhi.zzl(v1_0, v20, Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdt.zzn(v7_0, v12_0)));
                                v3_0 = (v12_0 + 8);
                                v11_0 |= v22;
                                v8_2 = p31;
                                v4_1 = v14_1;
                                v5_0 = v15_2;
                                v9_1 = -1;
                            }
                            break;
                        case 1:
                            v15_2 = v19_1;
                            if (v6_20 != 5) {
                            } else {
                                com.google.android.gms.internal.auth.zzhi.zzm(v1_0, v20, Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdt.zzb(v7_0, v12_0)));
                                v3_0 = (v12_0 + 4);
                            }
                            break;
                        case 2:
                        case 3:
                            v15_2 = v19_1;
                            Object v3_24 = v20;
                            if (v6_20 != null) {
                            } else {
                                int v8_4 = com.google.android.gms.internal.auth.zzdt.zzm(v7_0, v12_0, v13_0);
                                byte[] v2_8 = v1_0;
                                Object v1_8 = v2_1;
                                v1_8.putLong(v2_8, v3_24, v13_0.zzb);
                                v2_1 = v1_8;
                                v1_0 = v2_8;
                                v11_0 |= v22;
                                v3_0 = v8_4;
                                v4_1 = v14_1;
                                v5_0 = v15_2;
                                v9_1 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            v15_2 = v19_1;
                            Object v3_23 = v20;
                            if (v6_20 != null) {
                            } else {
                                int v5_9 = com.google.android.gms.internal.auth.zzdt.zzj(v7_0, v12_0, v13_0);
                                v2_1.putInt(v1_0, v3_23, v13_0.zza);
                                v11_0 |= v22;
                                v8_2 = p31;
                                v3_0 = v5_9;
                            }
                            break;
                        case 5:
                        case 14:
                            v15_2 = v19_1;
                            if (v6_20 != 1) {
                            } else {
                                byte[] v2_7 = v1_0;
                                Object v1_7 = v2_1;
                                v1_7.putLong(v2_7, v20, com.google.android.gms.internal.auth.zzdt.zzn(v7_0, v12_0));
                                v2_1 = v1_7;
                                v1_0 = v2_7;
                            }
                            break;
                        case 6:
                        case 13:
                            v15_2 = v19_1;
                            if (v6_20 != 5) {
                            } else {
                                v2_1.putInt(v1_0, v20, com.google.android.gms.internal.auth.zzdt.zzb(v7_0, v12_0));
                            }
                            break;
                        case 7:
                            v15_2 = v19_1;
                            long v4_13 = v20;
                            if (v6_20 != null) {
                            } else {
                                Object v6_18;
                                v3_0 = com.google.android.gms.internal.auth.zzdt.zzm(v7_0, v12_0, v13_0);
                                if (v13_0.zzb == 0) {
                                    v6_18 = 0;
                                } else {
                                    v6_18 = 1;
                                }
                                com.google.android.gms.internal.auth.zzhi.zzk(v1_0, v4_13, v6_18);
                            }
                            break;
                        case 8:
                            v15_2 = v19_1;
                            long v4_12 = v20;
                            if (v6_20 != 2) {
                            } else {
                                if ((536870912 & v9_6) != 0) {
                                    v3_0 = com.google.android.gms.internal.auth.zzdt.zzh(v7_0, v12_0, v13_0);
                                } else {
                                    v3_0 = com.google.android.gms.internal.auth.zzdt.zzg(v7_0, v12_0, v13_0);
                                }
                                v2_1.putObject(v1_0, v4_12, v13_0.zzc);
                                v11_0 |= v22;
                            }
                            break;
                        case 9:
                            v15_2 = v19_1;
                            long v4_11 = v20;
                            if (v6_20 != 2) {
                            } else {
                                v3_0 = com.google.android.gms.internal.auth.zzdt.zzd(v0_0.zzy(v15_2), v7_0, v12_0, v8_2, v13_0);
                                Object v6_12 = v2_1.getObject(v1_0, v4_11);
                                if (v6_12 != null) {
                                    v2_1.putObject(v1_0, v4_11, com.google.android.gms.internal.auth.zzez.zzg(v6_12, v13_0.zzc));
                                } else {
                                    v2_1.putObject(v1_0, v4_11, v13_0.zzc);
                                }
                            }
                            break;
                        case 10:
                            v15_2 = v19_1;
                            long v4_10 = v20;
                            if (v6_20 != 2) {
                            } else {
                                v3_0 = com.google.android.gms.internal.auth.zzdt.zza(v7_0, v12_0, v13_0);
                                v2_1.putObject(v1_0, v4_10, v13_0.zzc);
                            }
                            break;
                        case 12:
                            v15_2 = v19_1;
                            long v4_9 = v20;
                            if (v6_20 != null) {
                            } else {
                                v3_0 = com.google.android.gms.internal.auth.zzdt.zzj(v7_0, v12_0, v13_0);
                                v2_1.putInt(v1_0, v4_9, v13_0.zza);
                            }
                            break;
                        case 15:
                            v15_2 = v19_1;
                            long v4_8 = v20;
                            if (v6_20 != null) {
                            } else {
                                v3_0 = com.google.android.gms.internal.auth.zzdt.zzj(v7_0, v12_0, v13_0);
                                v2_1.putInt(v1_0, v4_8, com.google.android.gms.internal.auth.zzei.zzb(v13_0.zza));
                            }
                            break;
                        case 16:
                            if (v6_20 != null) {
                                v15_2 = v19_1;
                            } else {
                                Object v9_4 = com.google.android.gms.internal.auth.zzdt.zzm(v7_0, v12_0, v13_0);
                                byte[] v2_6 = v1_0;
                                Object v1_6 = v2_1;
                                v15_2 = v19_1;
                                v1_6.putLong(v2_6, v20, com.google.android.gms.internal.auth.zzei.zzc(v13_0.zzb));
                                v2_1 = v1_6;
                                v1_0 = v2_6;
                                v11_0 |= v22;
                                v3_0 = v9_4;
                            }
                            break;
                        default:
                    }
                    v9_0 = v1_0;
                    v24_0 = v2_1;
                    v6_3 = v14_1;
                    v8_0 = v15_2;
                    v18 = -1;
                    v2_3 = v30_1;
                }
            } else {
                v24_0 = v2_1;
                v2_3 = v3_19;
                v18 = v9_1;
                v6_3 = v14_1;
                v8_0 = 0;
                v9_0 = v1_0;
            }
        }
        long v4_3 = v8_2;
        long v15_1 = v10_0;
        if (v15_1 != 1048575) {
            v2_1.putInt(v1_0, ((long) v15_1), v11_0);
        }
        if (v3_0 != v4_3) {
            throw com.google.android.gms.internal.auth.zzfa.zzd();
        } else {
            return v3_0;
        }
    }

    private final int zzp(Object p13, byte[] p14, int p15, int p16, int p17, int p18, int p19, int p20, long p21, int p23, long p24, com.google.android.gms.internal.auth.zzds p26)
    {
        com.google.android.gms.internal.auth.zzfl v4_12 = com.google.android.gms.internal.auth.zzfz.zzb;
        com.google.android.gms.internal.auth.zzee v5_7 = ((com.google.android.gms.internal.auth.zzey) v4_12.getObject(p13, p24));
        if (!v5_7.zzc()) {
            java.nio.charset.Charset v7_3;
            java.nio.charset.Charset v7_1 = v5_7.size();
            if (v7_1 != null) {
                v7_3 = (v7_1 + v7_1);
            } else {
                v7_3 = 10;
            }
            v5_7 = v5_7.zzd(v7_3);
            v4_12.putObject(p13, p24, v5_7);
        }
        com.google.android.gms.internal.auth.zzfl v4_0 = v5_7;
        switch (p23) {
            case 18:
            case 35:
                long v10_10 = v4_0;
                if (p19 != 2) {
                    if (p19 != 1) {
                    } else {
                        int v1_38 = ((com.google.android.gms.internal.auth.zzej) v10_10);
                        v1_38.zze(Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdt.zzn(p14, p15)));
                        com.google.android.gms.internal.auth.zzee v2_27 = (p15 + 8);
                        while (v2_27 < p16) {
                            int v3_17 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v2_27, p26);
                            if (p17 != p26.zza) {
                                break;
                            }
                            v1_38.zze(Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdt.zzn(p14, v3_17)));
                            v2_27 = (v3_17 + 8);
                        }
                        return v2_27;
                    }
                } else {
                    com.google.android.gms.internal.auth.zzfl v4_23 = ((com.google.android.gms.internal.auth.zzej) v10_10);
                    int v0_17 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                    int v1_40 = (p26.zza + v0_17);
                    while (v0_17 < v1_40) {
                        v4_23.zze(Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdt.zzn(p14, v0_17)));
                        v0_17 += 8;
                    }
                    if (v0_17 != v1_40) {
                        throw com.google.android.gms.internal.auth.zzfa.zzf();
                    } else {
                        return v0_17;
                    }
                }
            case 19:
            case 36:
                long v10_9 = v4_0;
                if (p19 != 2) {
                    if (p19 != 5) {
                    } else {
                        int v1_34 = ((com.google.android.gms.internal.auth.zzeq) v10_9);
                        v1_34.zze(Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdt.zzb(p14, p15)));
                        com.google.android.gms.internal.auth.zzee v2_20 = (p15 + 4);
                        while (v2_20 < p16) {
                            int v3_16 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v2_20, p26);
                            if (p17 != p26.zza) {
                                break;
                            }
                            v1_34.zze(Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdt.zzb(p14, v3_16)));
                            v2_20 = (v3_16 + 4);
                        }
                        return v2_20;
                    }
                } else {
                    com.google.android.gms.internal.auth.zzfl v4_20 = ((com.google.android.gms.internal.auth.zzeq) v10_9);
                    int v0_14 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                    int v1_36 = (p26.zza + v0_14);
                    while (v0_14 < v1_36) {
                        v4_20.zze(Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdt.zzb(p14, v0_14)));
                        v0_14 += 4;
                    }
                    if (v0_14 != v1_36) {
                        throw com.google.android.gms.internal.auth.zzfa.zzf();
                    } else {
                        return v0_14;
                    }
                }
            case 20:
            case 21:
            case 37:
            case 38:
                long v10_8 = v4_0;
                if (p19 != 2) {
                    if (p19 != 0) {
                    } else {
                        int v1_30 = ((com.google.android.gms.internal.auth.zzfl) v10_8);
                        com.google.android.gms.internal.auth.zzee v2_16 = com.google.android.gms.internal.auth.zzdt.zzm(p14, p15, p26);
                        v1_30.zze(p26.zzb);
                        while (v2_16 < p16) {
                            int v3_15 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v2_16, p26);
                            if (p17 != p26.zza) {
                                break;
                            }
                            v2_16 = com.google.android.gms.internal.auth.zzdt.zzm(p14, v3_15, p26);
                            v1_30.zze(p26.zzb);
                        }
                        return v2_16;
                    }
                } else {
                    com.google.android.gms.internal.auth.zzfl v4_16 = ((com.google.android.gms.internal.auth.zzfl) v10_8);
                    int v0_13 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                    int v1_32 = (p26.zza + v0_13);
                    while (v0_13 < v1_32) {
                        v0_13 = com.google.android.gms.internal.auth.zzdt.zzm(p14, v0_13, p26);
                        v4_16.zze(p26.zzb);
                    }
                    if (v0_13 != v1_32) {
                        throw com.google.android.gms.internal.auth.zzfa.zzf();
                    } else {
                        return v0_13;
                    }
                }
            case 22:
            case 29:
            case 39:
            case 43:
                long v10_7 = v4_0;
                if (p19 != 2) {
                    if (p19 == 0) {
                        return com.google.android.gms.internal.auth.zzdt.zzl(p17, p14, p15, p16, v10_7, p26);
                    } else {
                    }
                } else {
                    return com.google.android.gms.internal.auth.zzdt.zzf(p14, p15, v10_7, p26);
                }
            case 23:
            case 32:
            case 40:
            case 46:
                long v10_6 = v4_0;
                if (p19 != 2) {
                    if (p19 != 1) {
                    } else {
                        int v1_26 = ((com.google.android.gms.internal.auth.zzfl) v10_6);
                        v1_26.zze(com.google.android.gms.internal.auth.zzdt.zzn(p14, p15));
                        int v0_11 = (p15 + 8);
                        while (v0_11 < p16) {
                            com.google.android.gms.internal.auth.zzee v2_14 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v0_11, p26);
                            if (p17 != p26.zza) {
                                break;
                            }
                            v1_26.zze(com.google.android.gms.internal.auth.zzdt.zzn(p14, v2_14));
                            v0_11 = (v2_14 + 8);
                        }
                        return v0_11;
                    }
                } else {
                    com.google.android.gms.internal.auth.zzfl v4_11 = ((com.google.android.gms.internal.auth.zzfl) v10_6);
                    int v0_12 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                    int v1_28 = (p26.zza + v0_12);
                    while (v0_12 < v1_28) {
                        v4_11.zze(com.google.android.gms.internal.auth.zzdt.zzn(p14, v0_12));
                        v0_12 += 8;
                    }
                    if (v0_12 != v1_28) {
                        throw com.google.android.gms.internal.auth.zzfa.zzf();
                    } else {
                        return v0_12;
                    }
                }
            case 24:
            case 31:
            case 41:
            case 45:
                long v10_5 = v4_0;
                if (p19 != 2) {
                    if (p19 != 5) {
                    } else {
                        int v1_21 = ((com.google.android.gms.internal.auth.zzev) v10_5);
                        v1_21.zze(com.google.android.gms.internal.auth.zzdt.zzb(p14, p15));
                        int v0_8 = (p15 + 4);
                        while (v0_8 < p16) {
                            com.google.android.gms.internal.auth.zzee v2_11 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v0_8, p26);
                            if (p17 != p26.zza) {
                                break;
                            }
                            v1_21.zze(com.google.android.gms.internal.auth.zzdt.zzb(p14, v2_11));
                            v0_8 = (v2_11 + 4);
                        }
                        return v0_8;
                    }
                } else {
                    com.google.android.gms.internal.auth.zzfl v4_8 = ((com.google.android.gms.internal.auth.zzev) v10_5);
                    int v0_10 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                    int v1_23 = (p26.zza + v0_10);
                    while (v0_10 < v1_23) {
                        v4_8.zze(com.google.android.gms.internal.auth.zzdt.zzb(p14, v0_10));
                        v0_10 += 4;
                    }
                    if (v0_10 != v1_23) {
                        throw com.google.android.gms.internal.auth.zzfa.zzf();
                    } else {
                        return v0_10;
                    }
                }
            case 25:
            case 42:
                long v10_1 = v4_0;
                if (p19 != 2) {
                    if (p19 != 0) {
                    } else {
                        com.google.android.gms.internal.auth.zzee v5_19;
                        int v1_17 = ((com.google.android.gms.internal.auth.zzdu) v10_1);
                        int v0_6 = com.google.android.gms.internal.auth.zzdt.zzm(p14, p15, p26);
                        if (p26.zzb == 0) {
                            v5_19 = 0;
                        } else {
                            v5_19 = 1;
                        }
                        v1_17.zze(v5_19);
                        while (v0_6 < p16) {
                            com.google.android.gms.internal.auth.zzee v5_20 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v0_6, p26);
                            if (p17 != p26.zza) {
                                break;
                            }
                            com.google.android.gms.internal.auth.zzee v5_22;
                            v0_6 = com.google.android.gms.internal.auth.zzdt.zzm(p14, v5_20, p26);
                            if (p26.zzb == 0) {
                                v5_22 = 0;
                            } else {
                                v5_22 = 1;
                            }
                            v1_17.zze(v5_22);
                        }
                        return v0_6;
                    }
                } else {
                    com.google.android.gms.internal.auth.zzfl v4_5 = ((com.google.android.gms.internal.auth.zzdu) v10_1);
                    int v0_7 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                    int v1_19 = (p26.zza + v0_7);
                    while (v0_7 < v1_19) {
                        com.google.android.gms.internal.auth.zzee v5_26;
                        v0_7 = com.google.android.gms.internal.auth.zzdt.zzm(p14, v0_7, p26);
                        if (p26.zzb == 0) {
                            v5_26 = 0;
                        } else {
                            v5_26 = 1;
                        }
                        v4_5.zze(v5_26);
                    }
                    if (v0_7 != v1_19) {
                        throw com.google.android.gms.internal.auth.zzfa.zzf();
                    } else {
                        return v0_7;
                    }
                }
            case 26:
                long v10_0 = v4_0;
                if (p19 != 2) {
                } else {
                    if ((p21 & 536870912) != 0) {
                        int v0_4 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                        int v1_11 = p26.zza;
                        if (v1_11 < 0) {
                            throw com.google.android.gms.internal.auth.zzfa.zzc();
                        } else {
                            int v3_4;
                            if (v1_11 != 0) {
                                v3_4 = (v0_4 + v1_11);
                                if (!com.google.android.gms.internal.auth.zzhm.zzd(p14, v0_4, v3_4)) {
                                    throw com.google.android.gms.internal.auth.zzfa.zzb();
                                } else {
                                    v10_0.add(new String(p14, v0_4, v1_11, com.google.android.gms.internal.auth.zzez.zzb));
                                }
                            } else {
                                v10_0.add("");
                                while (v0_4 < p16) {
                                    int v1_12 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v0_4, p26);
                                    if (p17 != p26.zza) {
                                        break;
                                    }
                                    v0_4 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v1_12, p26);
                                    int v1_13 = p26.zza;
                                    if (v1_13 < 0) {
                                        throw com.google.android.gms.internal.auth.zzfa.zzc();
                                    } else {
                                        if (v1_13 != 0) {
                                            v3_4 = (v0_4 + v1_13);
                                            if (!com.google.android.gms.internal.auth.zzhm.zzd(p14, v0_4, v3_4)) {
                                                throw com.google.android.gms.internal.auth.zzfa.zzb();
                                            } else {
                                                v10_0.add(new String(p14, v0_4, v1_13, com.google.android.gms.internal.auth.zzez.zzb));
                                                v0_4 = v3_4;
                                            }
                                        } else {
                                            v10_0.add("");
                                        }
                                    }
                                }
                                return v0_4;
                            }
                        }
                    } else {
                        int v0_5 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                        int v1_14 = p26.zza;
                        if (v1_14 < 0) {
                            throw com.google.android.gms.internal.auth.zzfa.zzc();
                        } else {
                            if (v1_14 != 0) {
                                v10_0.add(new String(p14, v0_5, v1_14, com.google.android.gms.internal.auth.zzez.zzb));
                            } else {
                                v10_0.add("");
                                while (v0_5 < p16) {
                                    int v1_15 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v0_5, p26);
                                    if (p17 != p26.zza) {
                                        break;
                                    }
                                    v0_5 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v1_15, p26);
                                    v1_14 = p26.zza;
                                    if (v1_14 < 0) {
                                        throw com.google.android.gms.internal.auth.zzfa.zzc();
                                    } else {
                                        if (v1_14 != 0) {
                                            v10_0.add(new String(p14, v0_5, v1_14, com.google.android.gms.internal.auth.zzez.zzb));
                                            v0_5 += v1_14;
                                        } else {
                                            v10_0.add("");
                                        }
                                    }
                                }
                                return v0_5;
                            }
                        }
                    }
                }
            case 27:
                if (p19 == 2) {
                    return com.google.android.gms.internal.auth.zzdt.zze(this.zzy(p20), p17, p14, p15, p16, v4_0, p26);
                } else {
                }
            case 28:
                if (p19 != 2) {
                } else {
                    int v1_6 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                    com.google.android.gms.internal.auth.zzee v2_2 = p26.zza;
                    if (v2_2 < null) {
                        throw com.google.android.gms.internal.auth.zzfa.zzc();
                    } else {
                        if (v2_2 > (p14.length - v1_6)) {
                            throw com.google.android.gms.internal.auth.zzfa.zzf();
                        } else {
                            if (v2_2 != null) {
                                v4_0.add(com.google.android.gms.internal.auth.zzee.zzk(p14, v1_6, v2_2));
                            } else {
                                v4_0.add(com.google.android.gms.internal.auth.zzee.zzb);
                                while (v1_6 < p16) {
                                    com.google.android.gms.internal.auth.zzee v2_4 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v1_6, p26);
                                    if (p17 != p26.zza) {
                                        break;
                                    }
                                    v1_6 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v2_4, p26);
                                    v2_2 = p26.zza;
                                    if (v2_2 < null) {
                                        throw com.google.android.gms.internal.auth.zzfa.zzc();
                                    } else {
                                        if (v2_2 > (p14.length - v1_6)) {
                                            throw com.google.android.gms.internal.auth.zzfa.zzf();
                                        } else {
                                            if (v2_2 != null) {
                                                v4_0.add(com.google.android.gms.internal.auth.zzee.zzk(p14, v1_6, v2_2));
                                                v1_6 += v2_2;
                                            } else {
                                                v4_0.add(com.google.android.gms.internal.auth.zzee.zzb);
                                            }
                                        }
                                    }
                                }
                                return v1_6;
                            }
                        }
                    }
                }
            case 30:
            case 44:
                int v14_1;
                if (p19 != 2) {
                    if (p19 != 0) {
                    } else {
                        v14_1 = com.google.android.gms.internal.auth.zzdt.zzl(p17, p14, p15, p16, v4_0, p26);
                    }
                } else {
                    v14_1 = com.google.android.gms.internal.auth.zzdt.zzf(p14, p15, v4_0, p26);
                }
                int v0_1 = ((com.google.android.gms.internal.auth.zzeu) p13).zzc;
                if (v0_1 == com.google.android.gms.internal.auth.zzgz.zza()) {
                    v0_1 = 0;
                }
                int v0_2 = com.google.android.gms.internal.auth.zzgj.zzd(p18, v4_0, this.zzx(p20), v0_1, this.zzm);
                if (v0_2 != 0) {
                    ((com.google.android.gms.internal.auth.zzeu) p13).zzc = ((com.google.android.gms.internal.auth.zzgz) v0_2);
                    return v14_1;
                } else {
                    return v14_1;
                }
            case 33:
            case 47:
                if (p19 != 2) {
                    if (p19 != 0) {
                    } else {
                        com.google.android.gms.internal.auth.zzfl v4_24 = ((com.google.android.gms.internal.auth.zzev) v4_0);
                        com.google.android.gms.internal.auth.zzfa v13_28 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                        v4_24.zze(com.google.android.gms.internal.auth.zzei.zzb(p26.zza));
                        while (v13_28 < p16) {
                            int v1_46 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v13_28, p26);
                            if (p17 != p26.zza) {
                                break;
                            }
                            v13_28 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v1_46, p26);
                            v4_24.zze(com.google.android.gms.internal.auth.zzei.zzb(p26.zza));
                        }
                        return v13_28;
                    }
                } else {
                    com.google.android.gms.internal.auth.zzfl v4_25 = ((com.google.android.gms.internal.auth.zzev) v4_0);
                    com.google.android.gms.internal.auth.zzfa v13_1 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                    int v0_19 = (p26.zza + v13_1);
                    while (v13_1 < v0_19) {
                        v13_1 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v13_1, p26);
                        v4_25.zze(com.google.android.gms.internal.auth.zzei.zzb(p26.zza));
                    }
                    if (v13_1 != v0_19) {
                        throw com.google.android.gms.internal.auth.zzfa.zzf();
                    } else {
                        return v13_1;
                    }
                }
            case 34:
            case 48:
                if (p19 != 2) {
                    if (p19 != 0) {
                    } else {
                        com.google.android.gms.internal.auth.zzfl v4_3 = ((com.google.android.gms.internal.auth.zzfl) v4_0);
                        com.google.android.gms.internal.auth.zzfa v13_14 = com.google.android.gms.internal.auth.zzdt.zzm(p14, p15, p26);
                        v4_3.zze(com.google.android.gms.internal.auth.zzei.zzc(p26.zzb));
                        while (v13_14 < p16) {
                            int v1_24 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v13_14, p26);
                            if (p17 != p26.zza) {
                                break;
                            }
                            v13_14 = com.google.android.gms.internal.auth.zzdt.zzm(p14, v1_24, p26);
                            v4_3.zze(com.google.android.gms.internal.auth.zzei.zzc(p26.zzb));
                        }
                        return v13_14;
                    }
                } else {
                    com.google.android.gms.internal.auth.zzfl v4_18 = ((com.google.android.gms.internal.auth.zzfl) v4_0);
                    com.google.android.gms.internal.auth.zzfa v13_21 = com.google.android.gms.internal.auth.zzdt.zzj(p14, p15, p26);
                    int v0_16 = (p26.zza + v13_21);
                    while (v13_21 < v0_16) {
                        v13_21 = com.google.android.gms.internal.auth.zzdt.zzm(p14, v13_21, p26);
                        v4_18.zze(com.google.android.gms.internal.auth.zzei.zzc(p26.zzb));
                    }
                    if (v13_21 != v0_16) {
                        throw com.google.android.gms.internal.auth.zzfa.zzf();
                    } else {
                        return v13_21;
                    }
                }
            default:
                if (p19 != 3) {
                } else {
                    com.google.android.gms.internal.auth.zzgy v18_3 = this.zzy(p20);
                    int v22_2 = ((p17 & -8) | 4);
                    com.google.android.gms.internal.auth.zzfa v13_27 = com.google.android.gms.internal.auth.zzdt.zzc(v18_3, p14, p15, p16, v22_2, p26);
                    com.google.android.gms.internal.auth.zzee v2_30 = v18_3;
                    int v6_6 = v22_2;
                    com.google.android.gms.internal.auth.zzee v5_38 = p26;
                    v4_0.add(p26.zzc);
                    while (v13_27 < p16) {
                        java.nio.charset.Charset v7_14 = com.google.android.gms.internal.auth.zzdt.zzj(p14, v13_27, v5_38);
                        if (p17 != v5_38.zza) {
                            break;
                        }
                        com.google.android.gms.internal.auth.zzgy v18_4 = v2_30;
                        long v23_4 = v5_38;
                        v13_27 = com.google.android.gms.internal.auth.zzdt.zzc(v18_4, p14, v7_14, p16, v6_6, v23_4);
                        int v1_43 = v18_4;
                        java.nio.charset.Charset v7_15 = v23_4;
                        v4_0.add(v7_15.zzc);
                        v2_30 = v1_43;
                        v5_38 = v7_15;
                    }
                    return v13_27;
                }
        }
        return p15;
    }

    private final int zzq(int p2)
    {
        if ((p2 < this.zze) || (p2 > this.zzf)) {
            return -1;
        } else {
            return this.zzt(p2, 0);
        }
    }

    private final int zzr(int p2, int p3)
    {
        if ((p2 < this.zze) || (p2 > this.zzf)) {
            return -1;
        } else {
            return this.zzt(p2, p3);
        }
    }

    private final int zzs(int p2)
    {
        return this.zzc[(p2 + 2)];
    }

    private final int zzt(int p6, int p7)
    {
        int v0_2 = ((this.zzc.length / 3) + -1);
        while (p7 <= v0_2) {
            int v2_3 = ((v0_2 + p7) >> 1);
            int v3 = (v2_3 * 3);
            int v4_1 = this.zzc[v3];
            if (p6 != v4_1) {
                if (p6 >= v4_1) {
                    p7 = (v2_3 + 1);
                } else {
                    v0_2 = (v2_3 - 1);
                }
            } else {
                return v3;
            }
        }
        return -1;
    }

    private static int zzu(int p0)
    {
        return ((p0 >> 20) & 255);
    }

    private final int zzv(int p2)
    {
        return this.zzc[(p2 + 1)];
    }

    private static long zzw(Object p0, long p1)
    {
        return ((Long) com.google.android.gms.internal.auth.zzhi.zzf(p0, p1)).longValue();
    }

    private final com.google.android.gms.internal.auth.zzex zzx(int p2)
    {
        return ((com.google.android.gms.internal.auth.zzex) this.zzd[(((p2 / 3) + (p2 / 3)) + 1)]);
    }

    private final com.google.android.gms.internal.auth.zzgh zzy(int p4)
    {
        int v4_2 = ((p4 / 3) + (p4 / 3));
        com.google.android.gms.internal.auth.zzgh v0_3 = ((com.google.android.gms.internal.auth.zzgh) this.zzd[v4_2]);
        if (v0_3 == null) {
            com.google.android.gms.internal.auth.zzgh v0_0 = com.google.android.gms.internal.auth.zzge.zza().zzb(((Class) this.zzd[(v4_2 + 1)]));
            this.zzd[v4_2] = v0_0;
            return v0_0;
        } else {
            return v0_3;
        }
    }

    private final Object zzz(int p2)
    {
        return this.zzd[((p2 / 3) + (p2 / 3))];
    }

    public final int zza(Object p9)
    {
        com.google.android.gms.internal.auth.zzgy v0_1 = this.zzc.length;
        int v1 = 0;
        int v2_3 = 0;
        while (v1 < v0_1) {
            int v3_5;
            int v3_3;
            int v2_1;
            int v2_0;
            int v3_12 = this.zzv(v1);
            int v4_1 = this.zzc[v1];
            long v5_2 = ((long) (1048575 & v3_12));
            int v7 = 37;
            switch (com.google.android.gms.internal.auth.zzfz.zzu(v3_12)) {
                case 0:
                    v2_0 = (v2_3 * 53);
                    v3_3 = com.google.android.gms.internal.auth.zzez.zzc(Double.doubleToLongBits(com.google.android.gms.internal.auth.zzhi.zza(p9, v5_2)));
                    v2_3 = (v3_3 + v2_0);
                    break;
                case 1:
                    v2_0 = (v2_3 * 53);
                    v3_3 = Float.floatToIntBits(com.google.android.gms.internal.auth.zzhi.zzb(p9, v5_2));
                    break;
                case 2:
                    v2_0 = (v2_3 * 53);
                    v3_3 = com.google.android.gms.internal.auth.zzez.zzc(com.google.android.gms.internal.auth.zzhi.zzd(p9, v5_2));
                    break;
                case 3:
                    v2_0 = (v2_3 * 53);
                    v3_3 = com.google.android.gms.internal.auth.zzez.zzc(com.google.android.gms.internal.auth.zzhi.zzd(p9, v5_2));
                    break;
                case 4:
                    v2_1 = (v2_3 * 53);
                    v3_5 = com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_2);
                    v2_3 = (v2_1 + v3_5);
                    break;
                case 5:
                    v2_0 = (v2_3 * 53);
                    v3_3 = com.google.android.gms.internal.auth.zzez.zzc(com.google.android.gms.internal.auth.zzhi.zzd(p9, v5_2));
                    break;
                case 6:
                    v2_1 = (v2_3 * 53);
                    v3_5 = com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_2);
                    break;
                case 7:
                    v2_0 = (v2_3 * 53);
                    v3_3 = com.google.android.gms.internal.auth.zzez.zza(com.google.android.gms.internal.auth.zzhi.zzt(p9, v5_2));
                    break;
                case 8:
                    v2_0 = (v2_3 * 53);
                    v3_3 = ((String) com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2)).hashCode();
                    break;
                case 9:
                    int v3_30 = com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2);
                    if (v3_30 == 0) {
                        v2_3 = ((v2_3 * 53) + v7);
                    } else {
                        v7 = v3_30.hashCode();
                    }
                    break;
                case 10:
                    v2_0 = (v2_3 * 53);
                    v3_3 = com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2).hashCode();
                    break;
                case 11:
                    v2_1 = (v2_3 * 53);
                    v3_5 = com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_2);
                    break;
                case 12:
                    v2_1 = (v2_3 * 53);
                    v3_5 = com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_2);
                    break;
                case 13:
                    v2_1 = (v2_3 * 53);
                    v3_5 = com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_2);
                    break;
                case 14:
                    v2_0 = (v2_3 * 53);
                    v3_3 = com.google.android.gms.internal.auth.zzez.zzc(com.google.android.gms.internal.auth.zzhi.zzd(p9, v5_2));
                    break;
                case 15:
                    v2_1 = (v2_3 * 53);
                    v3_5 = com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_2);
                    break;
                case 16:
                    v2_0 = (v2_3 * 53);
                    v3_3 = com.google.android.gms.internal.auth.zzez.zzc(com.google.android.gms.internal.auth.zzhi.zzd(p9, v5_2));
                    break;
                case 17:
                    int v3_25 = com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2);
                    if (v3_25 == 0) {
                    } else {
                        v7 = v3_25.hashCode();
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
                    v3_3 = com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2).hashCode();
                    break;
                case 50:
                    v2_0 = (v2_3 * 53);
                    v3_3 = com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2).hashCode();
                    break;
                case 51:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = com.google.android.gms.internal.auth.zzez.zzc(Double.doubleToLongBits(((Double) com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2)).doubleValue()));
                    }
                    break;
                case 52:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = Float.floatToIntBits(((Float) com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2)).floatValue());
                    }
                    break;
                case 53:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = com.google.android.gms.internal.auth.zzez.zzc(com.google.android.gms.internal.auth.zzfz.zzw(p9, v5_2));
                    }
                    break;
                case 54:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = com.google.android.gms.internal.auth.zzez.zzc(com.google.android.gms.internal.auth.zzfz.zzw(p9, v5_2));
                    }
                    break;
                case 55:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_5 = com.google.android.gms.internal.auth.zzfz.zzl(p9, v5_2);
                    }
                    break;
                case 56:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = com.google.android.gms.internal.auth.zzez.zzc(com.google.android.gms.internal.auth.zzfz.zzw(p9, v5_2));
                    }
                    break;
                case 57:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_5 = com.google.android.gms.internal.auth.zzfz.zzl(p9, v5_2);
                    }
                    break;
                case 58:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = com.google.android.gms.internal.auth.zzez.zza(((Boolean) com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2)).booleanValue());
                    }
                    break;
                case 59:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = ((String) com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2)).hashCode();
                    }
                    break;
                case 60:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2).hashCode();
                    }
                    break;
                case 61:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2).hashCode();
                    }
                    break;
                case 62:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_5 = com.google.android.gms.internal.auth.zzfz.zzl(p9, v5_2);
                    }
                    break;
                case 63:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_5 = com.google.android.gms.internal.auth.zzfz.zzl(p9, v5_2);
                    }
                    break;
                case 64:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_5 = com.google.android.gms.internal.auth.zzfz.zzl(p9, v5_2);
                    }
                    break;
                case 65:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = com.google.android.gms.internal.auth.zzez.zzc(com.google.android.gms.internal.auth.zzfz.zzw(p9, v5_2));
                    }
                    break;
                case 66:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_1 = (v2_3 * 53);
                        v3_5 = com.google.android.gms.internal.auth.zzfz.zzl(p9, v5_2);
                    }
                    break;
                case 67:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = com.google.android.gms.internal.auth.zzez.zzc(com.google.android.gms.internal.auth.zzfz.zzw(p9, v5_2));
                    }
                    break;
                case 68:
                    if (!this.zzJ(p9, v4_1, v1)) {
                    } else {
                        v2_0 = (v2_3 * 53);
                        v3_3 = com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_2).hashCode();
                    }
                    break;
                default:
            }
            v1 += 3;
        }
        return (this.zzm.zza(p9).hashCode() + (v2_3 * 53));
    }

    public final int zzb(Object p28, byte[] p29, int p30, int p31, int p32, com.google.android.gms.internal.auth.zzds p33)
    {
        com.google.android.gms.internal.auth.zzfz v0_0 = this;
        Object v1_0 = p28;
        byte[] v2_3 = p29;
        Long v4_1 = p31;
        int v7_1 = p33;
        int v8_2 = com.google.android.gms.internal.auth.zzfz.zzb;
        int v10_0 = -1;
        int v3_0 = p30;
        int v6_3 = -1;
        int v5_0 = 0;
        int v12_0 = 0;
        int v13_0 = 0;
        int v11_0 = 1048575;
        while (v3_0 < v4_1) {
            int v5_7 = (v3_0 + 1);
            int v3_5 = v2_3[v3_0];
            if (v3_5 < 0) {
                v5_7 = com.google.android.gms.internal.auth.zzdt.zzk(v3_5, v2_3, v5_7, v7_1);
                v3_5 = v7_1.zza;
            }
            int v6_9;
            int v14_2 = v3_5;
            int v3_14 = v5_7;
            int v5_11 = (v14_2 >> 3);
            int v7_7 = (v14_2 & 7);
            if (v5_11 <= v6_3) {
                v6_9 = v0_0.zzq(v5_11);
            } else {
                v6_9 = v0_0.zzr(v5_11, (v13_0 / 3));
            }
            v13_0 = v6_9;
            int v7_0;
            int v8_1;
            int v6_2;
            int v20_0;
            byte[] v2_2;
            int v18_0;
            int v19;
            if (v13_0 != v10_0) {
                com.google.android.gms.internal.auth.zzds v15_1;
                int v6_10 = v0_0.zzc;
                int v10_4 = v6_10[(v13_0 + 1)];
                byte[] v9_6 = com.google.android.gms.internal.auth.zzfz.zzu(v10_4);
                int v18_1 = v14_2;
                int v14_6 = ((long) (v10_4 & 1048575));
                int v20_1 = v3_14;
                if (v9_6 > 17) {
                    int v30_2;
                    int v3_2;
                    int v17_0;
                    byte[] v9_2;
                    int v12_2;
                    int v3_20 = v14_6;
                    v15_1 = v1_0;
                    Object v1_10 = v8_2;
                    int v8_8 = v20_1;
                    v20_0 = v5_11;
                    if (v9_6 != 27) {
                        int v5_28 = v8_8;
                        int v8_9 = v1_10;
                        if (v9_6 > 49) {
                            v3_2 = v5_28;
                            int v5_29 = v3_20;
                            v30_2 = v11_0;
                            v17_0 = v12_0;
                            v12_2 = v13_0;
                            com.google.android.gms.internal.auth.zzds v15_0 = 1048575;
                            v19 = -1;
                            int v11_2 = v9_6;
                            v9_2 = v18_1;
                            v18_0 = v8_9;
                            if (v11_2 != 50) {
                                v5_0 = v9_2;
                                int v7_13 = this.zzn(p28, p29, v3_2, p31, v5_0, v20_0, v7_7, v10_4, v11_2, v5_29, v12_2, p33);
                                v8_1 = p28;
                                v6_2 = this;
                                if (v7_13 == v3_2) {
                                    v11_0 = v30_2;
                                    v2_2 = v7_13;
                                    v13_0 = v12_2;
                                    v12_0 = v17_0;
                                    v7_0 = p32;
                                    if ((v5_0 != v7_0) || (v7_0 == 0)) {
                                        com.google.android.gms.internal.auth.zzfz v0_2 = v5_0;
                                        v5_0 = v0_2;
                                        v7_1 = p33;
                                        v4_1 = p31;
                                        v0_0 = v6_2;
                                        v1_0 = v8_1;
                                        v8_2 = v18_0;
                                        v10_0 = v19;
                                        v6_3 = v20_0;
                                        v3_0 = com.google.android.gms.internal.auth.zzdt.zzi(v0_2, p29, v2_2, p31, com.google.android.gms.internal.auth.zzfz.zzc(v8_1), p33);
                                        v2_3 = p29;
                                    } else {
                                        v4_1 = p31;
                                        v3_0 = v2_2;
                                    }
                                    if (v11_0 != v15_0) {
                                        v18_0.putInt(v8_1, ((long) v11_0), v12_0);
                                    }
                                    com.google.android.gms.internal.auth.zzfz v0_4 = v6_2.zzj;
                                    while (v0_4 < v6_2.zzk) {
                                        Object v1_14 = v6_2.zzi[v0_4];
                                        if ((com.google.android.gms.internal.auth.zzhi.zzf(v8_1, ((long) (v6_2.zzv(v1_14) & v15_0))) != null) && (v6_2.zzx(v1_14) != null)) {
                                            v6_2.zzz(v1_14);
                                            throw 0;
                                        } else {
                                            v0_4++;
                                        }
                                    }
                                    if (v7_0 != 0) {
                                        if ((v3_0 > v4_1) || (v5_0 != v7_0)) {
                                            throw com.google.android.gms.internal.auth.zzfa.zzd();
                                        }
                                    } else {
                                        if (v3_0 != v4_1) {
                                            throw com.google.android.gms.internal.auth.zzfa.zzd();
                                        }
                                    }
                                    return v3_0;
                                } else {
                                    v2_3 = p29;
                                    v11_0 = v30_2;
                                    v4_1 = p31;
                                    v0_0 = this;
                                    v3_0 = v7_13;
                                    v1_0 = p28;
                                }
                            } else {
                                if (v7_7 != 2) {
                                    v6_2 = this;
                                    v8_1 = p28;
                                    v11_0 = v30_2;
                                    v7_0 = p32;
                                    v2_2 = v3_2;
                                    v5_0 = v9_2;
                                    v13_0 = v12_2;
                                    v12_0 = v17_0;
                                } else {
                                    int v6_1 = this.zzm(p28, p29, v3_2, p31, v12_2, v5_29, p33);
                                    if (v6_1 == v3_2) {
                                        v8_1 = p28;
                                        v11_0 = v30_2;
                                        v7_0 = p32;
                                        v2_2 = v6_1;
                                        v5_0 = v9_2;
                                        v13_0 = v12_2;
                                        v12_0 = v17_0;
                                        v6_2 = this;
                                    } else {
                                        v0_0 = this;
                                        v1_0 = p28;
                                        v2_3 = p29;
                                        v11_0 = v30_2;
                                        v4_1 = p31;
                                        v7_1 = p33;
                                        v3_0 = v6_1;
                                        v5_0 = v9_2;
                                        v13_0 = v12_2;
                                        v12_0 = v17_0;
                                        v8_2 = v18_0;
                                        v10_0 = -1;
                                        v6_3 = v20_0;
                                    }
                                }
                            }
                        } else {
                            int v30_1 = v11_0;
                            v17_0 = v12_0;
                            v15_0 = 1048575;
                            v19 = -1;
                            int v3_1 = v5_28;
                            int v5_2 = v18_1;
                            v18_0 = v8_9;
                            int v8_3 = v13_0;
                            int v7_2 = v0_0.zzp(v15_1, p29, v3_1, p31, v5_2, v20_0, v7_7, v8_3, ((long) v10_4), v9_6, v3_20, p33);
                            byte[] v9_1 = v5_2;
                            v12_2 = v8_3;
                            if (v7_2 == v3_1) {
                                v6_2 = this;
                                v8_1 = p28;
                                v11_0 = v30_1;
                                v2_2 = v7_2;
                                v5_0 = v9_1;
                            } else {
                                v0_0 = this;
                                v1_0 = p28;
                                v2_3 = p29;
                                v11_0 = v30_1;
                                v4_1 = p31;
                                v3_0 = v7_2;
                                v5_0 = v9_1;
                            }
                        }
                        v13_0 = v12_2;
                        v12_0 = v17_0;
                        v8_2 = v18_0;
                        v10_0 = v19;
                        v6_3 = v20_0;
                        v7_1 = p33;
                    } else {
                        if (v7_7 != 2) {
                            v3_2 = v8_8;
                            v30_2 = v11_0;
                            v17_0 = v12_0;
                            v12_2 = v13_0;
                            v9_2 = v18_1;
                            v15_0 = 1048575;
                            v19 = -1;
                            v18_0 = v1_10;
                        } else {
                            byte[] v2_7 = ((com.google.android.gms.internal.auth.zzey) v1_10.getObject(v15_1, v3_20));
                            if (!v2_7.zzc()) {
                                int v5_5;
                                int v5_4 = v2_7.size();
                                if (v5_4 != 0) {
                                    v5_5 = (v5_4 + v5_4);
                                } else {
                                    v5_5 = 10;
                                }
                                v2_7 = v2_7.zzd(v5_5);
                                v1_10.putObject(v15_1, v3_20, v2_7);
                            }
                            v8_2 = v1_10;
                            v2_3 = p29;
                            v4_1 = p31;
                            v7_1 = p33;
                            v3_0 = com.google.android.gms.internal.auth.zzdt.zze(v0_0.zzy(v13_0), v18_1, p29, v8_8, p31, v2_7, p33);
                            v1_0 = v15_1;
                            v5_0 = v18_1;
                            v6_3 = v20_0;
                            v10_0 = -1;
                        }
                    }
                } else {
                    int v6_7;
                    byte[] v2_10 = v6_10[(v13_0 + 2)];
                    int v21 = (1 << (v2_10 >> 20));
                    byte[] v2_11 = (v2_10 & 1048575);
                    if (v2_11 == v11_0) {
                        v6_7 = 1048575;
                    } else {
                        v6_7 = 1048575;
                        if (v11_0 != 1048575) {
                            v8_2.putInt(v1_0, ((long) v11_0), v12_0);
                        }
                        v11_0 = v2_11;
                        v12_0 = v8_2.getInt(v1_0, ((long) v2_11));
                    }
                    byte[] v2_14;
                    byte[] v9_7;
                    int v8_4;
                    byte[] v9_4;
                    int v14_3;
                    Long v4_4;
                    int v10_3;
                    int v14_4;
                    int v22_0;
                    int v8_6;
                    int v3_13;
                    int v14_5;
                    Object v1_7;
                    switch (v9_6) {
                        case 0:
                            v9_7 = p29;
                            v22_0 = v6_7;
                            v14_5 = p33;
                            v15_1 = v1_0;
                            v1_7 = v8_2;
                            v8_6 = v20_1;
                            v20_0 = v5_11;
                            if (v7_7 != 1) {
                            } else {
                                com.google.android.gms.internal.auth.zzhi.zzl(v15_1, v14_6, Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdt.zzn(p29, v8_6)));
                                v3_0 = (v8_6 + 8);
                                v12_0 |= v21;
                                v4_1 = p31;
                                v8_2 = v1_7;
                                v2_3 = v9_7;
                                v7_1 = v14_5;
                            }
                        case 1:
                            v9_7 = p29;
                            v22_0 = v6_7;
                            v14_5 = p33;
                            v15_1 = v1_0;
                            v1_7 = v8_2;
                            v8_6 = v20_1;
                            v20_0 = v5_11;
                            if (v7_7 != 5) {
                            } else {
                                com.google.android.gms.internal.auth.zzhi.zzm(v15_1, v14_6, Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdt.zzb(p29, v8_6)));
                                v3_0 = (v8_6 + 4);
                            }
                            break;
                        case 2:
                        case 3:
                            v9_7 = p29;
                            v22_0 = v6_7;
                            v3_13 = v8_2;
                            v8_6 = v20_1;
                            v20_0 = v5_11;
                            int v5_21 = v14_6;
                            v14_5 = p33;
                            if (v7_7 != 0) {
                                v15_1 = v1_0;
                                v1_7 = v3_13;
                            } else {
                                int v7_11 = com.google.android.gms.internal.auth.zzdt.zzm(p29, v8_6, p33);
                                Object v1_9 = v3_13;
                                v1_9.putLong(p28, v5_21, p33.zzb);
                                v15_1 = p28;
                                v12_0 |= v21;
                                v4_1 = p31;
                                v8_2 = v1_9;
                                v3_0 = v7_11;
                            }
                            break;
                        case 4:
                        case 11:
                            v9_4 = p29;
                            v22_0 = v6_7;
                            v3_13 = v8_2;
                            v8_6 = v20_1;
                            v20_0 = v5_11;
                            int v5_20 = v14_6;
                            v14_3 = p33;
                            if (v7_7 != 0) {
                            } else {
                                v2_14 = com.google.android.gms.internal.auth.zzdt.zzj(p29, v8_6, p33);
                                v3_13.putInt(v1_0, v5_20, p33.zza);
                                v12_0 |= v21;
                                v4_1 = p31;
                                v8_2 = v3_13;
                                v7_1 = v14_3;
                                v5_0 = v18_1;
                                v6_3 = v20_0;
                                v10_0 = -1;
                                v3_0 = v2_14;
                                v2_3 = v9_4;
                            }
                            break;
                        case 5:
                        case 14:
                            v9_4 = p29;
                            v22_0 = v6_7;
                            v3_13 = v8_2;
                            Long v4_18 = v20_1;
                            v20_0 = v5_11;
                            v14_3 = p33;
                            if (v7_7 != 1) {
                                v8_6 = v4_18;
                            } else {
                                byte[] v2_23 = v1_0;
                                Object v1_8 = v3_13;
                                int v8_7 = v4_18;
                                v1_8.putLong(v2_23, v14_6, com.google.android.gms.internal.auth.zzdt.zzn(p29, v4_18));
                                v3_13 = v1_8;
                                v1_0 = v2_23;
                                v2_14 = (v8_7 + 8);
                            }
                            break;
                        case 6:
                        case 13:
                            v9_4 = p29;
                            v22_0 = v6_7;
                            v3_13 = v8_2;
                            v4_4 = v20_1;
                            v20_0 = v5_11;
                            v14_3 = p33;
                            if (v7_7 != 5) {
                                v15_1 = v1_0;
                                v1_7 = v3_13;
                                v8_6 = v4_4;
                            } else {
                                v3_13.putInt(v1_0, v14_6, com.google.android.gms.internal.auth.zzdt.zzb(p29, v4_4));
                                v2_14 = (v4_4 + 4);
                            }
                            break;
                        case 7:
                            v9_4 = p29;
                            v22_0 = v6_7;
                            v3_13 = v8_2;
                            int v8_5 = v18_1;
                            v4_4 = v20_1;
                            v20_0 = v5_11;
                            int v5_16 = v14_6;
                            v14_3 = p33;
                            if (v7_7 != 0) {
                                v18_1 = v8_5;
                            } else {
                                Long v4_17;
                                v2_14 = com.google.android.gms.internal.auth.zzdt.zzm(p29, v4_4, p33);
                                v18_1 = v8_5;
                                if (p33.zzb == 0) {
                                    v4_17 = 0;
                                } else {
                                    v4_17 = 1;
                                }
                                com.google.android.gms.internal.auth.zzhi.zzk(v1_0, v5_16, v4_17);
                            }
                            break;
                        case 8:
                            v9_4 = p29;
                            v22_0 = v6_7;
                            v3_13 = v8_2;
                            v8_4 = v18_1;
                            v4_4 = v20_1;
                            v20_0 = v5_11;
                            int v5_15 = v14_6;
                            v14_4 = p33;
                            if (v7_7 != 2) {
                                v15_1 = v1_0;
                                v1_7 = v3_13;
                                v18_1 = v8_4;
                            } else {
                                if ((536870912 & v10_4) != 0) {
                                    v2_14 = com.google.android.gms.internal.auth.zzdt.zzh(p29, v4_4, p33);
                                } else {
                                    v2_14 = com.google.android.gms.internal.auth.zzdt.zzg(p29, v4_4, p33);
                                }
                                v3_13.putObject(v1_0, v5_15, p33.zzc);
                                v12_0 |= v21;
                                v4_1 = p31;
                                v5_0 = v8_4;
                                v7_1 = v14_4;
                                v6_3 = v20_0;
                                v10_0 = -1;
                                v8_2 = v3_13;
                            }
                            break;
                        case 9:
                            v9_4 = p29;
                            v10_3 = p31;
                            v22_0 = v6_7;
                            v3_13 = v8_2;
                            v8_4 = v18_1;
                            v4_4 = v20_1;
                            v20_0 = v5_11;
                            int v5_14 = v14_6;
                            v14_4 = p33;
                            if (v7_7 != 2) {
                            } else {
                                v2_14 = com.google.android.gms.internal.auth.zzdt.zzd(v0_0.zzy(v13_0), p29, v4_4, p31, p33);
                                if ((v12_0 & v21) != 0) {
                                    v3_13.putObject(v1_0, v5_14, com.google.android.gms.internal.auth.zzez.zzg(v3_13.getObject(v1_0, v5_14), p33.zzc));
                                    v12_0 |= v21;
                                    v5_0 = v8_4;
                                    v4_1 = v10_3;
                                } else {
                                    v3_13.putObject(v1_0, v5_14, p33.zzc);
                                }
                            }
                            break;
                        case 10:
                            v9_4 = p29;
                            v10_3 = p31;
                            v22_0 = v6_7;
                            v3_13 = v8_2;
                            v8_4 = v18_1;
                            v4_4 = v20_1;
                            v20_0 = v5_11;
                            int v5_13 = v14_6;
                            v14_4 = p33;
                            if (v7_7 != 2) {
                            } else {
                                v2_14 = com.google.android.gms.internal.auth.zzdt.zza(p29, v4_4, p33);
                                v3_13.putObject(v1_0, v5_13, p33.zzc);
                            }
                            break;
                        case 12:
                            v9_4 = p29;
                            v10_3 = p31;
                            v22_0 = v6_7;
                            v3_13 = v8_2;
                            v4_4 = v20_1;
                            v20_0 = v5_11;
                            int v5_10 = v14_6;
                            v14_4 = p33;
                            if (v7_7 != 0) {
                            } else {
                                v2_14 = com.google.android.gms.internal.auth.zzdt.zzj(p29, v4_4, p33);
                                Long v4_8 = p33.zza;
                                int v7_5 = v0_0.zzx(v13_0);
                                if ((v7_5 != 0) && (!v7_5.zza())) {
                                    v8_4 = v18_1;
                                    com.google.android.gms.internal.auth.zzfz.zzc(v1_0).zzf(v8_4, Long.valueOf(((long) v4_8)));
                                } else {
                                    v8_4 = v18_1;
                                    v3_13.putInt(v1_0, v5_10, v4_8);
                                }
                            }
                            break;
                        case 15:
                            v9_4 = p29;
                            v22_0 = v6_7;
                            v3_13 = v8_2;
                            v4_4 = v20_1;
                            v20_0 = v5_11;
                            int v5_9 = v14_6;
                            v14_3 = p33;
                            if (v7_7 != 0) {
                            } else {
                                v2_14 = com.google.android.gms.internal.auth.zzdt.zzj(p29, v4_4, p33);
                                v3_13.putInt(v1_0, v5_9, com.google.android.gms.internal.auth.zzei.zzb(p33.zza));
                                v12_0 |= v21;
                                v8_2 = v3_13;
                                v4_1 = p31;
                            }
                            break;
                        case 16:
                            v22_0 = v6_7;
                            v4_4 = v20_1;
                            v20_0 = v5_11;
                            if (v7_7 != 0) {
                                v15_1 = v1_0;
                                v1_7 = v8_2;
                            } else {
                                int v7_4 = com.google.android.gms.internal.auth.zzdt.zzm(p29, v4_4, p33);
                                byte[] v2_13 = v1_0;
                                Object v1_6 = v8_2;
                                v1_6.putLong(v2_13, v14_6, com.google.android.gms.internal.auth.zzei.zzc(p33.zzb));
                                v1_0 = v2_13;
                                v12_0 |= v21;
                                v8_2 = v1_6;
                                v3_0 = v7_4;
                                v2_3 = p29;
                                v4_1 = p31;
                                v7_1 = p33;
                            }
                            break;
                        default:
                            if (v7_7 != 3) {
                                int v10 = p31;
                                v22_0 = v6_7;
                                v4_4 = v20_1;
                                v20_0 = v5_11;
                            } else {
                                v20_0 = v5_11;
                                v2_14 = com.google.android.gms.internal.auth.zzdt.zzc(v0_0.zzy(v13_0), p29, v20_1, p31, ((v5_11 << 3) | 4), p33);
                                v9_4 = p29;
                                if ((v12_0 & v21) != 0) {
                                    v8_2.putObject(v1_0, v14_6, com.google.android.gms.internal.auth.zzez.zzg(v8_2.getObject(v1_0, v14_6), p33.zzc));
                                } else {
                                    v8_2.putObject(v1_0, v14_6, p33.zzc);
                                }
                                v12_0 |= v21;
                                v7_1 = p33;
                                v4_1 = p31;
                            }
                    }
                    v7_0 = p32;
                    v6_2 = v0_0;
                    v2_2 = v8_6;
                    v8_1 = v15_1;
                    v5_0 = v18_1;
                    v15_0 = v22_0;
                    v19 = -1;
                    v18_0 = v1_7;
                }
            } else {
                v7_0 = p32;
                v6_2 = v0_0;
                v2_2 = v3_14;
                v20_0 = v5_11;
                v18_0 = v8_2;
                v19 = v10_0;
                v5_0 = v14_2;
                v13_0 = 0;
                v15_0 = 1048575;
                v8_1 = v1_0;
            }
        }
        v7_0 = p32;
        v6_2 = v0_0;
        v18_0 = v8_2;
        int v17 = v12_0;
        v15_0 = 1048575;
        v8_1 = v1_0;
    }

    public final Object zzd()
    {
        return ((com.google.android.gms.internal.auth.zzeu) this.zzg).zzi(4, 0, 0);
    }

    public final void zze(Object p6)
    {
        com.google.android.gms.internal.auth.zzgy v0_0 = this.zzj;
        while(true) {
            int v1_0 = this.zzk;
            if (v0_0 >= v1_0) {
                break;
            }
            int v1_5 = ((long) (this.zzv(this.zzi[v0_0]) & 1048575));
            long v3_3 = com.google.android.gms.internal.auth.zzhi.zzf(p6, v1_5);
            if (v3_3 != 0) {
                ((com.google.android.gms.internal.auth.zzfq) v3_3).zzc();
                com.google.android.gms.internal.auth.zzhi.zzp(p6, v1_5, v3_3);
            }
            v0_0++;
        }
        com.google.android.gms.internal.auth.zzgy v0_2 = this.zzi.length;
        while (v1_0 < v0_2) {
            this.zzl.zza(p6, ((long) this.zzi[v1_0]));
            v1_0++;
        }
        this.zzm.zze(p6);
        return;
    }

    public final void zzf(Object p7, Object p8)
    {
        p8.getClass();
        int v0_0 = 0;
        while (v0_0 < this.zzc.length) {
            Object v1_32 = this.zzv(v0_0);
            long v2_2 = ((long) (1048575 & v1_32));
            long v4_4 = this.zzc[v0_0];
            switch (com.google.android.gms.internal.auth.zzfz.zzu(v1_32)) {
                case 0:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzl(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zza(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 1:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzm(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzb(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 2:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzo(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzd(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 3:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzo(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzd(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 4:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzn(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzc(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 5:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzo(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzd(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 6:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzn(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzc(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 7:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzk(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzt(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 8:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzp(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzf(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 9:
                    this.zzB(p7, p8, v0_0);
                    break;
                case 10:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzp(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzf(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 11:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzn(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzc(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 12:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzn(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzc(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 13:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzn(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzc(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 14:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzo(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzd(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 15:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzn(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzc(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 16:
                    if (!this.zzG(p8, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzo(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzd(p8, v2_2));
                        this.zzD(p7, v0_0);
                    }
                    break;
                case 17:
                    this.zzB(p7, p8, v0_0);
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
                    this.zzl.zzb(p7, p8, v2_2);
                    break;
                case 50:
                    com.google.android.gms.internal.auth.zzgj.zzi(this.zzp, p7, p8, v2_2);
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
                    if (!this.zzJ(p8, v4_4, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzp(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzf(p8, v2_2));
                        this.zzE(p7, v4_4, v0_0);
                    }
                    break;
                case 60:
                    this.zzC(p7, p8, v0_0);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!this.zzJ(p8, v4_4, v0_0)) {
                    } else {
                        com.google.android.gms.internal.auth.zzhi.zzp(p7, v2_2, com.google.android.gms.internal.auth.zzhi.zzf(p8, v2_2));
                        this.zzE(p7, v4_4, v0_0);
                    }
                    break;
                case 68:
                    this.zzC(p7, p8, v0_0);
                    break;
                default:
            }
            v0_0 += 3;
        }
        com.google.android.gms.internal.auth.zzgj.zzf(this.zzm, p7, p8);
        return;
    }

    public final void zzg(Object p9, byte[] p10, int p11, int p12, com.google.android.gms.internal.auth.zzds p13)
    {
        if (!this.zzh) {
            this.zzb(p9, p10, p11, p12, 0, p13);
            return;
        } else {
            this.zzo(p9, p10, p11, p12, p13);
            return;
        }
    }

    public final boolean zzh(Object p9, Object p10)
    {
        com.google.android.gms.internal.auth.zzgy v0_1 = this.zzc.length;
        int v2 = 0;
        while (v2 < v0_1) {
            boolean v3_43;
            boolean v3_22 = this.zzv(v2);
            long v5_4 = ((long) (v3_22 & 1048575));
            switch (com.google.android.gms.internal.auth.zzfz.zzu(v3_22)) {
                case 0:
                    if ((!this.zzF(p9, p10, v2)) || (Double.doubleToLongBits(com.google.android.gms.internal.auth.zzhi.zza(p9, v5_4)) != Double.doubleToLongBits(com.google.android.gms.internal.auth.zzhi.zza(p10, v5_4)))) {
                        return 0;
                    } else {
                    }
                case 1:
                    if ((!this.zzF(p9, p10, v2)) || (Float.floatToIntBits(com.google.android.gms.internal.auth.zzhi.zzb(p9, v5_4)) != Float.floatToIntBits(com.google.android.gms.internal.auth.zzhi.zzb(p10, v5_4)))) {
                        return 0;
                    } else {
                    }
                case 2:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzd(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzd(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 3:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzd(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzd(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 4:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzc(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 5:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzd(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzd(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 6:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzc(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 7:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzt(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzt(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 8:
                    if ((!this.zzF(p9, p10, v2)) || (!com.google.android.gms.internal.auth.zzgj.zzh(com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_4), com.google.android.gms.internal.auth.zzhi.zzf(p10, v5_4)))) {
                        return 0;
                    } else {
                    }
                case 9:
                    if ((!this.zzF(p9, p10, v2)) || (!com.google.android.gms.internal.auth.zzgj.zzh(com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_4), com.google.android.gms.internal.auth.zzhi.zzf(p10, v5_4)))) {
                        return 0;
                    } else {
                    }
                case 10:
                    if ((!this.zzF(p9, p10, v2)) || (!com.google.android.gms.internal.auth.zzgj.zzh(com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_4), com.google.android.gms.internal.auth.zzhi.zzf(p10, v5_4)))) {
                        return 0;
                    } else {
                    }
                case 11:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzc(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 12:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzc(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 13:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzc(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 14:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzd(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzd(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 15:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzc(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzc(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 16:
                    if ((!this.zzF(p9, p10, v2)) || (com.google.android.gms.internal.auth.zzhi.zzd(p9, v5_4) != com.google.android.gms.internal.auth.zzhi.zzd(p10, v5_4))) {
                        return 0;
                    } else {
                    }
                case 17:
                    if ((!this.zzF(p9, p10, v2)) || (!com.google.android.gms.internal.auth.zzgj.zzh(com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_4), com.google.android.gms.internal.auth.zzhi.zzf(p10, v5_4)))) {
                        return 0;
                    } else {
                    }
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
                    v3_43 = com.google.android.gms.internal.auth.zzgj.zzh(com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_4), com.google.android.gms.internal.auth.zzhi.zzf(p10, v5_4));
                    if (v3_43) {
                    }
                    break;
                case 50:
                    v3_43 = com.google.android.gms.internal.auth.zzgj.zzh(com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_4), com.google.android.gms.internal.auth.zzhi.zzf(p10, v5_4));
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
                    boolean v3_38 = ((long) (this.zzs(v2) & 1048575));
                    if ((com.google.android.gms.internal.auth.zzhi.zzc(p9, v3_38) == com.google.android.gms.internal.auth.zzhi.zzc(p10, v3_38)) && (com.google.android.gms.internal.auth.zzgj.zzh(com.google.android.gms.internal.auth.zzhi.zzf(p9, v5_4), com.google.android.gms.internal.auth.zzhi.zzf(p10, v5_4)))) {
                    }
                    break;
                default:
            }
            v2 += 3;
        }
        if (this.zzm.zza(p9).equals(this.zzm.zza(p10))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final boolean zzi(Object p15)
    {
        long v3_0 = 1048575;
        int v2 = 0;
        int v4_0 = 0;
        while (v2 < this.zzj) {
            int v11;
            int v10;
            int v9 = this.zzi[v2];
            boolean v5_2 = this.zzc[v9];
            int v13 = this.zzv(v9);
            com.google.android.gms.internal.auth.zzfz v7_1 = this.zzc[(v9 + 2)];
            Object v8_1 = (v7_1 & 1048575);
            int v12 = (1 << (v7_1 >> 20));
            if (v8_1 == v3_0) {
                v10 = v3_0;
                v11 = v4_0;
            } else {
                if (v8_1 != 1048575) {
                    v4_0 = com.google.android.gms.internal.auth.zzfz.zzb.getInt(p15, ((long) v8_1));
                }
                v11 = v4_0;
                v10 = v8_1;
            }
            if (((268435456 & v13) != 0) && (!this.zzH(p15, v9, v10, v11, v12))) {
                return 0;
            } else {
                int v15_6 = com.google.android.gms.internal.auth.zzfz.zzu(v13);
                if ((v15_6 == 9) || (v15_6 == 17)) {
                    if ((this.zzH(p15, v9, v10, v11, v12)) && (!com.google.android.gms.internal.auth.zzfz.zzI(p15, v13, this.zzy(v9)))) {
                        return 0;
                    }
                } else {
                    if (v15_6 != 27) {
                        if ((v15_6 == 60) || (v15_6 == 68)) {
                            if ((!this.zzJ(p15, v5_2, v9)) || (com.google.android.gms.internal.auth.zzfz.zzI(p15, v13, this.zzy(v9)))) {
                                v2++;
                                v3_0 = v10;
                                v4_0 = v11;
                            } else {
                                return 0;
                            }
                        } else {
                            if (v15_6 != 49) {
                                if ((v15_6 == 50) && (!((com.google.android.gms.internal.auth.zzfq) com.google.android.gms.internal.auth.zzhi.zzf(p15, ((long) (v13 & 1048575)))).isEmpty())) {
                                    this.zzz(v9);
                                    throw 0;
                                }
                            }
                        }
                    }
                    int v15_15 = ((java.util.List) com.google.android.gms.internal.auth.zzhi.zzf(p15, ((long) (v13 & 1048575))));
                    if (!v15_15.isEmpty()) {
                        long v3_12 = this.zzy(v9);
                        int v4_1 = 0;
                        while (v4_1 < v15_15.size()) {
                            if (v3_12.zzi(v15_15.get(v4_1))) {
                                v4_1++;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }
}
