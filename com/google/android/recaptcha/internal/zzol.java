package com.google.android.recaptcha.internal;
final class zzol implements com.google.android.recaptcha.internal.zzow {
    private static final int[] zza;
    private static final sun.misc.Unsafe zzb;
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.recaptcha.internal.zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final com.google.android.recaptcha.internal.zzpl zzm;
    private final com.google.android.recaptcha.internal.zzmp zzn;

    static zzol()
    {
        sun.misc.Unsafe v0_1 = new int[0];
        com.google.android.recaptcha.internal.zzol.zza = v0_1;
        com.google.android.recaptcha.internal.zzol.zzb = com.google.android.recaptcha.internal.zzps.zzg();
        return;
    }

    private zzol(int[] p1, Object[] p2, int p3, int p4, com.google.android.recaptcha.internal.zzoi p5, boolean p6, int[] p7, int p8, int p9, com.google.android.recaptcha.internal.zzoo p10, com.google.android.recaptcha.internal.zznv p11, com.google.android.recaptcha.internal.zzpl p12, com.google.android.recaptcha.internal.zzmp p13, com.google.android.recaptcha.internal.zzod p14)
    {
        this.zzc = p1;
        this.zzd = p2;
        this.zze = p3;
        this.zzf = p4;
        this.zzi = (p5 instanceof com.google.android.recaptcha.internal.zznd);
        int v1_1 = 0;
        if ((p13 != null) && ((p5 instanceof com.google.android.recaptcha.internal.zzna))) {
            v1_1 = 1;
        }
        this.zzh = v1_1;
        this.zzj = p7;
        this.zzk = p8;
        this.zzl = p9;
        this.zzm = p12;
        this.zzn = p13;
        this.zzg = p5;
        return;
    }

    private final Object zzA(Object p4, int p5)
    {
        com.google.android.recaptcha.internal.zzow v0 = this.zzx(p5);
        long v1_1 = (this.zzu(p5) & 1048575);
        if (this.zzN(p4, p5)) {
            Object v4_1 = com.google.android.recaptcha.internal.zzol.zzb.getObject(p4, ((long) v1_1));
            if (!com.google.android.recaptcha.internal.zzol.zzQ(v4_1)) {
                Object v5_3 = v0.zze();
                if (v4_1 != null) {
                    v0.zzg(v5_3, v4_1);
                }
                return v5_3;
            } else {
                return v4_1;
            }
        } else {
            return v0.zze();
        }
    }

    private final Object zzB(Object p4, int p5, int p6)
    {
        com.google.android.recaptcha.internal.zzow v0 = this.zzx(p6);
        if (this.zzR(p4, p5, p6)) {
            Object v4_1 = com.google.android.recaptcha.internal.zzol.zzb.getObject(p4, ((long) (this.zzu(p6) & 1048575)));
            if (!com.google.android.recaptcha.internal.zzol.zzQ(v4_1)) {
                Object v5_2 = v0.zze();
                if (v4_1 != null) {
                    v0.zzg(v5_2, v4_1);
                }
                return v5_2;
            } else {
                return v4_1;
            }
        } else {
            return v0.zze();
        }
    }

    private static reflect.Field zzC(Class p5, String p6)
    {
        try {
            String v5_1 = p5.getDeclaredField(p6);
            return v5_1;
        } catch (NoSuchFieldException) {
            String v0_1 = v5_1.getDeclaredFields();
            int v2_1 = 0;
        }
    }

    private static void zzD(Object p2)
    {
        if (!com.google.android.recaptcha.internal.zzol.zzQ(p2)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(p2)));
        } else {
            return;
        }
    }

    private final void zzE(Object p6, Object p7, int p8)
    {
        if (this.zzN(p7, p8)) {
            String v1_2 = com.google.android.recaptcha.internal.zzol.zzb;
            long v2 = ((long) (this.zzu(p8) & 1048575));
            IllegalStateException v0_1 = v1_2.getObject(p7, v2);
            if (v0_1 == null) {
                String v6_2 = this.zzc[p8];
                String v7_1 = p7.toString();
                Object v8_2 = new StringBuilder("Source subfield ");
                v8_2.append(v6_2);
                v8_2.append(" is present but null: ");
                v8_2.append(v7_1);
                throw new IllegalStateException(v8_2.toString());
            } else {
                String v7_2 = this.zzx(p8);
                if (this.zzN(p6, p8)) {
                    Object v8_3 = v1_2.getObject(p6, v2);
                    if (!com.google.android.recaptcha.internal.zzol.zzQ(v8_3)) {
                        Object v4_2 = v7_2.zze();
                        v7_2.zzg(v4_2, v8_3);
                        v1_2.putObject(p6, v2, v4_2);
                        v8_3 = v4_2;
                    }
                    v7_2.zzg(v8_3, v0_1);
                    return;
                } else {
                    if (com.google.android.recaptcha.internal.zzol.zzQ(v0_1)) {
                        Object v4_4 = v7_2.zze();
                        v7_2.zzg(v4_4, v0_1);
                        v1_2.putObject(p6, v2, v4_4);
                    } else {
                        v1_2.putObject(p6, v2, v0_1);
                    }
                    this.zzH(p6, p8);
                    return;
                }
            }
        } else {
            return;
        }
    }

    private final void zzF(Object p7, Object p8, int p9)
    {
        Object v0_1 = this.zzc[p9];
        if (this.zzR(p8, v0_1, p9)) {
            sun.misc.Unsafe v2_1 = com.google.android.recaptcha.internal.zzol.zzb;
            long v3 = ((long) (this.zzu(p9) & 1048575));
            String v1_0 = v2_1.getObject(p8, v3);
            if (v1_0 == null) {
                String v7_2 = this.zzc[p9];
                String v8_1 = p8.toString();
                Object v9_2 = new StringBuilder("Source subfield ");
                v9_2.append(v7_2);
                v9_2.append(" is present but null: ");
                v9_2.append(v8_1);
                throw new IllegalStateException(v9_2.toString());
            } else {
                String v8_2 = this.zzx(p9);
                if (this.zzR(p7, v0_1, p9)) {
                    Object v9_3 = v2_1.getObject(p7, v3);
                    if (!com.google.android.recaptcha.internal.zzol.zzQ(v9_3)) {
                        Object v0_5 = v8_2.zze();
                        v8_2.zzg(v0_5, v9_3);
                        v2_1.putObject(p7, v3, v0_5);
                        v9_3 = v0_5;
                    }
                    v8_2.zzg(v9_3, v1_0);
                    return;
                } else {
                    if (com.google.android.recaptcha.internal.zzol.zzQ(v1_0)) {
                        Object v5_2 = v8_2.zze();
                        v8_2.zzg(v5_2, v1_0);
                        v2_1.putObject(p7, v3, v5_2);
                    } else {
                        v2_1.putObject(p7, v3, v1_0);
                    }
                    this.zzI(p7, v0_1, p9);
                    return;
                }
            }
        } else {
            return;
        }
    }

    private final void zzG(Object p4, int p5, com.google.android.recaptcha.internal.zzov p6)
    {
        long v1_1 = ((long) (p5 & 1048575));
        if (!com.google.android.recaptcha.internal.zzol.zzM(p5)) {
            if (!this.zzi) {
                com.google.android.recaptcha.internal.zzps.zzs(p4, v1_1, p6.zzp());
                return;
            } else {
                com.google.android.recaptcha.internal.zzps.zzs(p4, v1_1, p6.zzr());
                return;
            }
        } else {
            com.google.android.recaptcha.internal.zzps.zzs(p4, v1_1, p6.zzs());
            return;
        }
    }

    private final void zzH(Object p5, int p6)
    {
        int v6_1 = this.zzr(p6);
        long v0_2 = ((long) (1048575 & v6_1));
        if (v0_2 != 1048575) {
            com.google.android.recaptcha.internal.zzps.zzq(p5, v0_2, ((1 << (v6_1 >> 20)) | com.google.android.recaptcha.internal.zzps.zzc(p5, v0_2)));
            return;
        } else {
            return;
        }
    }

    private final void zzI(Object p3, int p4, int p5)
    {
        com.google.android.recaptcha.internal.zzps.zzq(p3, ((long) (this.zzr(p5) & 1048575)), p4);
        return;
    }

    private final void zzJ(Object p4, int p5, Object p6)
    {
        com.google.android.recaptcha.internal.zzol.zzb.putObject(p4, ((long) (this.zzu(p5) & 1048575)), p6);
        this.zzH(p4, p5);
        return;
    }

    private final void zzK(Object p4, int p5, int p6, Object p7)
    {
        com.google.android.recaptcha.internal.zzol.zzb.putObject(p4, ((long) (this.zzu(p6) & 1048575)), p7);
        this.zzI(p4, p5, p6);
        return;
    }

    private final boolean zzL(Object p1, Object p2, int p3)
    {
        if (this.zzN(p1, p3) != this.zzN(p2, p3)) {
            return 0;
        } else {
            return 1;
        }
    }

    private static boolean zzM(int p1)
    {
        if ((p1 & 536870912) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    private final boolean zzN(Object p8, int p9)
    {
        long v0_0 = this.zzr(p9);
        long v2_2 = ((long) (v0_0 & 1048575));
        if (v2_2 != 1048575) {
            if ((com.google.android.recaptcha.internal.zzps.zzc(p8, v2_2) & (1 << (v0_0 >> 20))) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            com.google.android.recaptcha.internal.zzle v9_3 = this.zzu(p9);
            long v0_2 = ((long) (v9_3 & 1048575));
            switch (com.google.android.recaptcha.internal.zzol.zzt(v9_3)) {
                case 0:
                    if (Double.doubleToRawLongBits(com.google.android.recaptcha.internal.zzps.zza(p8, v0_2)) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 1:
                    if (Float.floatToRawIntBits(com.google.android.recaptcha.internal.zzps.zzb(p8, v0_2)) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 2:
                    if (com.google.android.recaptcha.internal.zzps.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 3:
                    if (com.google.android.recaptcha.internal.zzps.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 4:
                    if (com.google.android.recaptcha.internal.zzps.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 5:
                    if (com.google.android.recaptcha.internal.zzps.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 6:
                    if (com.google.android.recaptcha.internal.zzps.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 7:
                    return com.google.android.recaptcha.internal.zzps.zzw(p8, v0_2);
                case 8:
                    IllegalArgumentException v8_30 = com.google.android.recaptcha.internal.zzps.zzf(p8, v0_2);
                    if (!(v8_30 instanceof String)) {
                        if (!(v8_30 instanceof com.google.android.recaptcha.internal.zzle)) {
                            throw new IllegalArgumentException();
                        } else {
                            if (com.google.android.recaptcha.internal.zzle.zzb.equals(v8_30)) {
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
                    if (com.google.android.recaptcha.internal.zzps.zzf(p8, v0_2) == null) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 10:
                    if (com.google.android.recaptcha.internal.zzle.zzb.equals(com.google.android.recaptcha.internal.zzps.zzf(p8, v0_2))) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 11:
                    if (com.google.android.recaptcha.internal.zzps.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 12:
                    if (com.google.android.recaptcha.internal.zzps.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 13:
                    if (com.google.android.recaptcha.internal.zzps.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 14:
                    if (com.google.android.recaptcha.internal.zzps.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 15:
                    if (com.google.android.recaptcha.internal.zzps.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 16:
                    if (com.google.android.recaptcha.internal.zzps.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 17:
                    if (com.google.android.recaptcha.internal.zzps.zzf(p8, v0_2) == null) {
                        return 0;
                    } else {
                        return 1;
                    }
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    private final boolean zzO(Object p2, int p3, int p4, int p5, int p6)
    {
        if (p4 != 1048575) {
            if ((p5 & p6) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return this.zzN(p2, p3);
        }
    }

    private static boolean zzP(Object p2, int p3, com.google.android.recaptcha.internal.zzow p4)
    {
        return p4.zzl(com.google.android.recaptcha.internal.zzps.zzf(p2, ((long) (p3 & 1048575))));
    }

    private static boolean zzQ(Object p1)
    {
        if (p1 != 0) {
            if (!(p1 instanceof com.google.android.recaptcha.internal.zznd)) {
                return 1;
            } else {
                return ((com.google.android.recaptcha.internal.zznd) p1).zzL();
            }
        } else {
            return 0;
        }
    }

    private final boolean zzR(Object p3, int p4, int p5)
    {
        if (com.google.android.recaptcha.internal.zzps.zzc(p3, ((long) (this.zzr(p5) & 1048575))) != p4) {
            return 0;
        } else {
            return 1;
        }
    }

    private static boolean zzS(Object p0, long p1)
    {
        return ((Boolean) com.google.android.recaptcha.internal.zzps.zzf(p0, p1)).booleanValue();
    }

    private static final void zzT(int p1, Object p2, com.google.android.recaptcha.internal.zzpy p3)
    {
        if (!(p2 instanceof String)) {
            p3.zzd(p1, ((com.google.android.recaptcha.internal.zzle) p2));
            return;
        } else {
            p3.zzG(p1, ((String) p2));
            return;
        }
    }

    public static com.google.android.recaptcha.internal.zzpm zzd(Object p2)
    {
        com.google.android.recaptcha.internal.zzpm v0 = ((com.google.android.recaptcha.internal.zznd) p2).zzc;
        if (v0 == com.google.android.recaptcha.internal.zzpm.zzc()) {
            v0 = com.google.android.recaptcha.internal.zzpm.zzf();
            ((com.google.android.recaptcha.internal.zznd) p2).zzc = v0;
        }
        return v0;
    }

    public static com.google.android.recaptcha.internal.zzol zzm(Class p31, com.google.android.recaptcha.internal.zzof p32, com.google.android.recaptcha.internal.zzoo p33, com.google.android.recaptcha.internal.zznv p34, com.google.android.recaptcha.internal.zzpl p35, com.google.android.recaptcha.internal.zzmp p36, com.google.android.recaptcha.internal.zzod p37)
    {
        if (!(p32 instanceof com.google.android.recaptcha.internal.zzou)) {
            throw 0;
        } else {
            int v7_2;
            com.google.android.recaptcha.internal.zzol v0_49 = ((com.google.android.recaptcha.internal.zzou) p32);
            int v1_5 = ((com.google.android.recaptcha.internal.zzou) p32).zzd();
            int v2_0 = v1_5.length();
            int v5_0 = 55296;
            if (v1_5.charAt(0) < 55296) {
                v7_2 = 1;
            } else {
                int v4_2 = 1;
                while(true) {
                    v7_2 = (v4_2 + 1);
                    if (v1_5.charAt(v4_2) < 55296) {
                        break;
                    }
                    v4_2 = v7_2;
                }
            }
            int v4_1 = (v7_2 + 1);
            int v7_8 = v1_5.charAt(v7_2);
            if (v7_8 >= 55296) {
                int v7_9 = (v7_8 & 8191);
                int v9_10 = 13;
                while(true) {
                    int v10_7 = (v4_1 + 1);
                    int v4_7 = v1_5.charAt(v4_1);
                    if (v4_7 < 55296) {
                        break;
                    }
                    v7_9 |= ((v4_7 & 8191) << v9_10);
                    v9_10 += 13;
                    v4_1 = v10_7;
                }
                v7_8 = (v7_9 | (v4_7 << v9_10));
                v4_1 = v10_7;
            }
            int v10_0;
            int v13_7;
            int v17_1;
            int v12_3;
            int v9_0;
            int v11_5;
            int v16_5;
            int v7_1;
            if (v7_8 != 0) {
                int v7_6 = (v4_1 + 1);
                int v4_9 = v1_5.charAt(v4_1);
                if (v4_9 >= 55296) {
                    int v4_3 = (v4_9 & 8191);
                    int v9_5 = 13;
                    while(true) {
                        int v10_9 = (v7_6 + 1);
                        int v7_31 = v1_5.charAt(v7_6);
                        if (v7_31 < 55296) {
                            break;
                        }
                        v4_3 |= ((v7_31 & 8191) << v9_5);
                        v9_5 += 13;
                        v7_6 = v10_9;
                    }
                    v4_9 = (v4_3 | (v7_31 << v9_5));
                    v7_6 = v10_9;
                }
                int v9_4 = (v7_6 + 1);
                int v7_36 = v1_5.charAt(v7_6);
                if (v7_36 >= 55296) {
                    int v7_3 = (v7_36 & 8191);
                    int v10_5 = 13;
                    while(true) {
                        int v11_9 = (v9_4 + 1);
                        int v9_11 = v1_5.charAt(v9_4);
                        if (v9_11 < 55296) {
                            break;
                        }
                        v7_3 |= ((v9_11 & 8191) << v10_5);
                        v10_5 += 13;
                        v9_4 = v11_9;
                    }
                    v7_36 = (v7_3 | (v9_11 << v10_5));
                    v9_4 = v11_9;
                }
                int v10_4 = (v9_4 + 1);
                int v9_13 = v1_5.charAt(v9_4);
                if (v9_13 >= 55296) {
                    int v9_1 = (v9_13 & 8191);
                    int v11_4 = 13;
                    while(true) {
                        int v12_7 = (v10_4 + 1);
                        int v10_11 = v1_5.charAt(v10_4);
                        if (v10_11 < 55296) {
                            break;
                        }
                        v9_1 |= ((v10_11 & 8191) << v11_4);
                        v11_4 += 13;
                        v10_4 = v12_7;
                    }
                    v9_13 = (v9_1 | (v10_11 << v11_4));
                    v10_4 = v12_7;
                }
                int v11_3 = (v10_4 + 1);
                int v10_13 = v1_5.charAt(v10_4);
                if (v10_13 >= 55296) {
                    int v10_1 = (v10_13 & 8191);
                    int v12_6 = 13;
                    while(true) {
                        int v13_11 = (v11_3 + 1);
                        int v11_10 = v1_5.charAt(v11_3);
                        if (v11_10 < 55296) {
                            break;
                        }
                        v10_1 |= ((v11_10 & 8191) << v12_6);
                        v12_6 += 13;
                        v11_3 = v13_11;
                    }
                    v10_13 = (v10_1 | (v11_10 << v12_6));
                    v11_3 = v13_11;
                }
                int v12_0 = (v11_3 + 1);
                v11_5 = v1_5.charAt(v11_3);
                if (v11_5 >= 55296) {
                    int v11_0 = (v11_5 & 8191);
                    int v13_10 = 13;
                    while(true) {
                        int v14_10 = (v12_0 + 1);
                        int v12_8 = v1_5.charAt(v12_0);
                        if (v12_8 < 55296) {
                            break;
                        }
                        v11_0 |= ((v12_8 & 8191) << v13_10);
                        v13_10 += 13;
                        v12_0 = v14_10;
                    }
                    v11_5 = (v11_0 | (v12_8 << v13_10));
                    v12_0 = v14_10;
                }
                int v13_0 = (v12_0 + 1);
                int v12_1 = v1_5.charAt(v12_0);
                if (v12_1 >= 55296) {
                    int v12_2 = (v12_1 & 8191);
                    int v14_0 = 13;
                    while(true) {
                        int v15_0 = (v13_0 + 1);
                        int v13_1 = v1_5.charAt(v13_0);
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
                int v13_3 = v1_5.charAt(v13_0);
                if (v13_3 >= 55296) {
                    int v13_4 = (v13_3 & 8191);
                    int v15_1 = 13;
                    while(true) {
                        int v16_0 = (v14_1 + 1);
                        int v14_2 = v1_5.charAt(v14_1);
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
                int v14_4 = v1_5.charAt(v14_1);
                if (v14_4 >= 55296) {
                    int v14_5 = (v14_4 & 8191);
                    int v16_1 = 13;
                    while(true) {
                        int v17_0 = (v15_2 + 1);
                        int v15_3 = v1_5.charAt(v15_2);
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
                int v7_0 = new int[((v14_4 + v12_1) + v13_3)];
                v12_3 = v9_13;
                v9_0 = v12_1;
                v13_7 = v10_13;
                v17_1 = v14_4;
                v10_0 = ((v4_9 + v4_9) + v7_36);
                v16_5 = v7_0;
                v7_1 = v4_9;
                v4_1 = v15_2;
            } else {
                v9_0 = 0;
                v10_0 = 0;
                v11_5 = 0;
                v12_3 = 0;
                v13_7 = 0;
                v17_1 = 0;
                v16_5 = com.google.android.recaptcha.internal.zzol.zza;
                v7_1 = 0;
            }
            int v14_8 = com.google.android.recaptcha.internal.zzol.zzb;
            int v15_7 = ((com.google.android.recaptcha.internal.zzou) p32).zze();
            Class v3_1 = ((com.google.android.recaptcha.internal.zzou) p32).zza().getClass();
            int v18_1 = (v17_1 + v9_0);
            int v11_7 = new int[(v11_5 * 3)];
            int v9_7 = new Object[(v11_5 + v11_5)];
            int v21_0 = v17_1;
            int v22_0 = v18_1;
            int v19_0 = 0;
            int v20_0 = 0;
            while (v4_1 < v2_0) {
                int v8_0;
                int v23_1 = (v4_1 + 1);
                int v4_5 = v1_5.charAt(v4_1);
                if (v4_5 < v5_0) {
                    v8_0 = v23_1;
                } else {
                    int v4_6 = (v4_5 & 8191);
                    int v8_1 = v23_1;
                    int v23_2 = 13;
                    while(true) {
                        int v24_0 = (v8_1 + 1);
                        int v8_2 = v1_5.charAt(v8_1);
                        if (v8_2 < v5_0) {
                            break;
                        }
                        v4_6 |= ((v8_2 & 8191) << v23_2);
                        v23_2 += 13;
                        v8_1 = v24_0;
                    }
                    v4_5 = (v4_6 | (v8_2 << v23_2));
                    v8_0 = v24_0;
                }
                int v6_0;
                int v23_3 = (v8_0 + 1);
                int v8_4 = v1_5.charAt(v8_0);
                if (v8_4 < v5_0) {
                    v6_0 = v23_3;
                } else {
                    int v8_5 = (v8_4 & 8191);
                    int v6_1 = v23_3;
                    int v23_4 = 13;
                    while(true) {
                        com.google.android.recaptcha.internal.zzol v25_1 = (v6_1 + 1);
                        int v6_2 = v1_5.charAt(v6_1);
                        if (v6_2 < v5_0) {
                            break;
                        }
                        v8_5 |= ((v6_2 & 8191) << v23_4);
                        v23_4 += 13;
                        v6_1 = v25_1;
                    }
                    v8_4 = (v8_5 | (v6_2 << v23_4));
                    v6_0 = v25_1;
                }
                if ((v8_4 & 1024) != 0) {
                    int v5_2 = (v19_0 + 1);
                    v16_5[v19_0] = v20_0;
                    v19_0 = v5_2;
                }
                int v28_4;
                int v1_2;
                int v23_5;
                int v7_20;
                int v30_0;
                int v29_0;
                int v2_4;
                com.google.android.recaptcha.internal.zzol v0_26;
                int v5_3 = (v8_4 & 255);
                com.google.android.recaptcha.internal.zzol v25_2 = v0_49;
                int v26_0 = (v8_4 & 2048);
                if (v5_3 < 51) {
                    int v28_1;
                    v29_0 = v2_0;
                    v30_0 = v7_1;
                    com.google.android.recaptcha.internal.zzol v0_4 = (v10_0 + 1);
                    int v2_3 = com.google.android.recaptcha.internal.zzol.zzC(v3_1, ((String) v15_7[v10_0]));
                    if ((v5_3 != 9) && (v5_3 != 17)) {
                        int v28_0;
                        com.google.android.recaptcha.internal.zzol v0_5;
                        if (v5_3 == 27) {
                            v28_0 = v0_4;
                            v0_5 = 1;
                            v10_0 += 2;
                            v9_7[(((v20_0 / 3) + (v20_0 / 3)) + v0_5)] = v15_7[v28_0];
                        } else {
                            if (v5_3 != 49) {
                                if ((v5_3 != 12) && ((v5_3 != 30) && (v5_3 != 44))) {
                                    if (v5_3 != 50) {
                                        v28_1 = v0_4;
                                        v7_20 = v1_5;
                                        v10_0 = v28_1;
                                        v2_4 = ((int) v14_8.objectFieldOffset(v2_3));
                                        if (((v8_4 & 4096) == 0) || (v5_3 > 17)) {
                                            v23_5 = 55296;
                                            v28_4 = 1048575;
                                            v1_2 = 0;
                                        } else {
                                            int v28_5;
                                            com.google.android.recaptcha.internal.zzol v0_13 = (v6_0 + 1);
                                            int v1_3 = v7_20.charAt(v6_0);
                                            if (v1_3 < 55296) {
                                                v28_5 = v0_13;
                                            } else {
                                                int v1_4 = (v1_3 & 8191);
                                                int v23_6 = 13;
                                                while(true) {
                                                    v28_5 = (v0_13 + 1);
                                                    com.google.android.recaptcha.internal.zzol v0_14 = v7_20.charAt(v0_13);
                                                    if (v0_14 < 55296) {
                                                        break;
                                                    }
                                                    v1_4 |= ((v0_14 & 8191) << v23_6);
                                                    v23_6 += 13;
                                                    v0_13 = v28_5;
                                                }
                                                v1_3 = (v1_4 | (v0_14 << v23_6));
                                            }
                                            com.google.android.recaptcha.internal.zzol v0_19;
                                            int v23_8 = ((v1_3 / 32) + (v30_0 + v30_0));
                                            com.google.android.recaptcha.internal.zzol v0_17 = v15_7[v23_8];
                                            if (!(v0_17 instanceof reflect.Field)) {
                                                v0_19 = com.google.android.recaptcha.internal.zzol.zzC(v3_1, ((String) v0_17));
                                                v15_7[v23_8] = v0_19;
                                            } else {
                                                v0_19 = ((reflect.Field) v0_17);
                                            }
                                            v1_2 = (v1_3 % 32);
                                            v6_0 = v28_5;
                                            v23_5 = 55296;
                                            v28_4 = ((int) v14_8.objectFieldOffset(v0_19));
                                        }
                                        if ((v5_3 >= 18) && (v5_3 <= 49)) {
                                            com.google.android.recaptcha.internal.zzol v0_25 = (v22_0 + 1);
                                            v16_5[v22_0] = v2_4;
                                            v22_0 = v0_25;
                                        }
                                        v0_26 = v26_0;
                                        com.google.android.recaptcha.internal.zzol v0_42;
                                        int v26_2 = (v20_0 + 1);
                                        v11_7[v20_0] = v4_5;
                                        int v4_10 = (v20_0 + 2);
                                        if ((v8_4 & 512) == 0) {
                                            v0_42 = 0;
                                        } else {
                                            v0_42 = 536870912;
                                        }
                                        int v8_7;
                                        if ((v8_4 & 256) == 0) {
                                            v8_7 = 0;
                                        } else {
                                            v8_7 = 268435456;
                                        }
                                        int v27_4;
                                        if (v0_26 == null) {
                                            v27_4 = 0;
                                        } else {
                                            v27_4 = -2147483648;
                                        }
                                        v11_7[v26_2] = ((((v0_42 | v8_7) | v27_4) | (v5_3 << 20)) | v2_4);
                                        v20_0 += 3;
                                        v11_7[v4_10] = ((v1_2 << 20) | v28_4);
                                        v4_1 = v6_0;
                                        v1_5 = v7_20;
                                        v5_0 = v23_5;
                                        v0_49 = v25_2;
                                        v2_0 = v29_0;
                                        v7_1 = v30_0;
                                    } else {
                                        int v7_18 = (v10_0 + 2);
                                        int v28_2 = (v21_0 + 1);
                                        v16_5[v21_0] = v20_0;
                                        int v21_3 = ((v20_0 / 3) + (v20_0 / 3));
                                        v9_7[v21_3] = v15_7[v0_4];
                                        if (v26_0 == 0) {
                                            v10_0 = v7_18;
                                            v21_0 = v28_2;
                                            v26_0 = 0;
                                        } else {
                                            com.google.android.recaptcha.internal.zzol v0_7 = (v10_0 + 3);
                                            v9_7[(v21_3 + 1)] = v15_7[v7_18];
                                            v10_0 = v0_7;
                                            v7_20 = v1_5;
                                            v21_0 = v28_2;
                                        }
                                    }
                                } else {
                                    int v28_3 = v0_4;
                                    if ((v25_2.zzc() != 1) && (v26_0 == 0)) {
                                        v7_20 = v1_5;
                                        v10_0 = v28_3;
                                        v26_0 = 0;
                                    } else {
                                        v10_0 += 2;
                                        v9_7[(((v20_0 / 3) + (v20_0 / 3)) + 1)] = v15_7[v28_3];
                                    }
                                }
                            } else {
                                v10_0 += 2;
                                v28_0 = v0_4;
                                v0_5 = 1;
                            }
                        }
                        v7_20 = v1_5;
                    } else {
                        v28_1 = v0_4;
                        v9_7[(((v20_0 / 3) + (v20_0 / 3)) + 1)] = v2_3.getType();
                    }
                } else {
                    com.google.android.recaptcha.internal.zzol v0_31;
                    com.google.android.recaptcha.internal.zzol v0_29 = (v6_0 + 1);
                    int v6_7 = v1_5.charAt(v6_0);
                    int v27_0 = v0_29;
                    com.google.android.recaptcha.internal.zzol v0_30 = 55296;
                    if (v6_7 < 55296) {
                        v0_31 = v27_0;
                    } else {
                        int v27_1 = (v6_7 & 8191);
                        int v6_9 = v27_0;
                        int v29_2 = 13;
                        while(true) {
                            int v30_1 = (v6_9 + 1);
                            int v6_10 = v1_5.charAt(v6_9);
                            if (v6_10 < v0_30) {
                                break;
                            }
                            v27_1 |= ((v6_10 & 8191) << v29_2);
                            v29_2 += 13;
                            v6_9 = v30_1;
                            v0_30 = 55296;
                        }
                        v6_7 = (v27_1 | (v6_10 << v29_2));
                        v0_31 = v30_1;
                    }
                    com.google.android.recaptcha.internal.zzol v0_36;
                    com.google.android.recaptcha.internal.zzol v0_35;
                    int v27_2 = v0_31;
                    com.google.android.recaptcha.internal.zzol v0_33 = (v5_3 - 51);
                    v29_0 = v2_0;
                    if ((v0_33 != 9) && (v0_33 != 17)) {
                        if (v0_33 != 12) {
                            v0_35 = v26_0;
                        } else {
                            if ((v25_2.zzc() != 1) && (v26_0 == 0)) {
                                v0_35 = 0;
                            } else {
                                v0_36 = (v10_0 + 1);
                                v9_7[(((v20_0 / 3) + (v20_0 / 3)) + 1)] = v15_7[v10_0];
                                v10_0 = v0_36;
                            }
                        }
                    } else {
                        v0_36 = (v10_0 + 1);
                        v9_7[(((v20_0 / 3) + (v20_0 / 3)) + 1)] = v15_7[v10_0];
                    }
                    int v2_12;
                    int v6_11 = (v6_7 + v6_7);
                    int v2_10 = v15_7[v6_11];
                    int v26_1 = v0_35;
                    if (!(v2_10 instanceof reflect.Field)) {
                        v2_12 = com.google.android.recaptcha.internal.zzol.zzC(v3_1, ((String) v2_10));
                        v15_7[v6_11] = v2_12;
                    } else {
                        v2_12 = ((reflect.Field) v2_10);
                    }
                    int v7_35;
                    v2_4 = ((int) v14_8.objectFieldOffset(v2_12));
                    int v6_13 = (v6_11 + 1);
                    int v7_33 = v15_7[v6_13];
                    v30_0 = v7_1;
                    if (!(v7_33 instanceof reflect.Field)) {
                        v7_35 = com.google.android.recaptcha.internal.zzol.zzC(v3_1, ((String) v7_33));
                        v15_7[v6_13] = v7_35;
                    } else {
                        v7_35 = ((reflect.Field) v7_33);
                    }
                    v28_4 = ((int) v14_8.objectFieldOffset(v7_35));
                    v7_20 = v1_5;
                    v0_26 = v26_1;
                    v6_0 = v27_2;
                    v1_2 = 0;
                    v23_5 = 55296;
                }
            }
            return new com.google.android.recaptcha.internal.zzol(v11_7, v9_7, v12_3, v13_7, v0_49.zza(), 0, v16_5, v17_1, v18_1, p33, p34, p35, p36, p37);
        }
    }

    private static double zzn(Object p0, long p1)
    {
        return ((Double) com.google.android.recaptcha.internal.zzps.zzf(p0, p1)).doubleValue();
    }

    private static float zzo(Object p0, long p1)
    {
        return ((Float) com.google.android.recaptcha.internal.zzps.zzf(p0, p1)).floatValue();
    }

    private static int zzp(Object p0, long p1)
    {
        return ((Integer) com.google.android.recaptcha.internal.zzps.zzf(p0, p1)).intValue();
    }

    private final int zzq(int p2)
    {
        if ((p2 < this.zze) || (p2 > this.zzf)) {
            return -1;
        } else {
            return this.zzs(p2, 0);
        }
    }

    private final int zzr(int p2)
    {
        return this.zzc[(p2 + 2)];
    }

    private final int zzs(int p6, int p7)
    {
        int v0_2 = ((this.zzc.length / 3) + -1);
        while (p7 <= v0_2) {
            int v2_1 = ((v0_2 + p7) >> 1);
            int v3 = (v2_1 * 3);
            int v4_1 = this.zzc[v3];
            if (p6 != v4_1) {
                if (p6 >= v4_1) {
                    p7 = (v2_1 + 1);
                } else {
                    v0_2 = (v2_1 - 1);
                }
            } else {
                return v3;
            }
        }
        return -1;
    }

    private static int zzt(int p0)
    {
        return ((p0 >> 20) & 255);
    }

    private final int zzu(int p2)
    {
        return this.zzc[(p2 + 1)];
    }

    private static long zzv(Object p0, long p1)
    {
        return ((Long) com.google.android.recaptcha.internal.zzps.zzf(p0, p1)).longValue();
    }

    private final com.google.android.recaptcha.internal.zznh zzw(int p2)
    {
        return ((com.google.android.recaptcha.internal.zznh) this.zzd[(((p2 / 3) + (p2 / 3)) + 1)]);
    }

    private final com.google.android.recaptcha.internal.zzow zzx(int p4)
    {
        com.google.android.recaptcha.internal.zzow v0_0 = this.zzd;
        int v4_2 = ((p4 / 3) + (p4 / 3));
        Object[] v1_2 = ((com.google.android.recaptcha.internal.zzow) v0_0[v4_2]);
        if (v1_2 == null) {
            com.google.android.recaptcha.internal.zzow v0_2 = com.google.android.recaptcha.internal.zzos.zza().zzb(((Class) v0_0[(v4_2 + 1)]));
            this.zzd[v4_2] = v0_2;
            return v0_2;
        } else {
            return v1_2;
        }
    }

    private final Object zzy(Object p1, int p2, Object p3, com.google.android.recaptcha.internal.zzpl p4, Object p5)
    {
        if ((com.google.android.recaptcha.internal.zzps.zzf(p1, ((long) (this.zzu(p2) & 1048575))) != null) && (this.zzw(p2) != null)) {
            this.zzz(p2);
            throw 0;
        } else {
            return p3;
        }
    }

    private final Object zzz(int p2)
    {
        return this.zzd[((p2 / 3) + (p2 / 3))];
    }

    public final int zza(Object p19)
    {
        int v0_0 = this;
        int v1_0 = p19;
        sun.misc.Unsafe v6 = com.google.android.recaptcha.internal.zzol.zzb;
        int v8_3 = 1048575;
        int v3_4 = 1048575;
        int v2_7 = 0;
        com.google.android.recaptcha.internal.zzms v4_5 = 0;
        int v9 = 0;
        while (v2_7 < v0_0.zzc.length) {
            int v11_18;
            int v5_96 = v0_0.zzu(v2_7);
            int v10_13 = com.google.android.recaptcha.internal.zzol.zzt(v5_96);
            int v11_16 = v0_0.zzc;
            int v13_8 = v11_16[v2_7];
            int v11_17 = v11_16[(v2_7 + 2)];
            int v12_6 = (v11_17 & v8_3);
            if (v10_13 > 17) {
                v11_18 = 0;
            } else {
                if (v12_6 != v3_4) {
                    if (v12_6 != v8_3) {
                        v4_5 = v6.getInt(v1_0, ((long) v12_6));
                    } else {
                        v4_5 = 0;
                    }
                    v3_4 = v12_6;
                }
                v11_18 = (1 << (v11_17 >> 20));
            }
            int v5_153 = (v5_96 & v8_3);
            if (v10_13 >= com.google.android.recaptcha.internal.zzmu.zzJ.zza()) {
                com.google.android.recaptcha.internal.zzmu.zzW.zza();
            }
            int v7_57;
            int v5_106;
            int v5_21;
            int v7_15;
            int v8_1;
            int v0_11;
            int v8_25;
            int v5_5;
            int v17;
            int v5_114;
            int v5_72;
            int v8_8;
            int v7_4;
            int v7_69;
            int v7_48;
            int v7_49;
            int v8_12;
            int v5_77;
            int v0_2;
            int v5_145;
            int v5_124;
            int v12_1;
            int v5_18;
            int v5_83;
            int v7_78 = ((long) v5_153);
            switch (v10_13) {
                case 0:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 8, v9);
                    }
                    break;
                case 1:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                        v0_0 = this;
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 4, v9);
                    }
                    break;
                case 2:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        int v0_18 = (v13_8 << 3);
                        int v7_77 = v6.getLong(v1_0, v7_78);
                        v0_2 = com.google.android.recaptcha.internal.zzln.zzA(v0_18);
                        v5_124 = com.google.android.recaptcha.internal.zzln.zzB(v7_77);
                        v9 += (v5_124 + v0_2);
                    }
                    break;
                case 3:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        int v0_17 = (v13_8 << 3);
                        int v7_76 = v6.getLong(v1_0, v7_78);
                        v0_2 = com.google.android.recaptcha.internal.zzln.zzA(v0_17);
                        v5_124 = com.google.android.recaptcha.internal.zzln.zzB(v7_76);
                    }
                    break;
                case 4:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        int v7_75 = ((long) v6.getInt(v1_0, v7_78));
                        v0_2 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v5_124 = com.google.android.recaptcha.internal.zzln.zzB(v7_75);
                    }
                    break;
                case 5:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 8, v9);
                    }
                    break;
                case 6:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 4, v9);
                    }
                    break;
                case 7:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 1, v9);
                    }
                    break;
                case 8:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        int v0_12 = (v13_8 << 3);
                        int v5_151 = v6.getObject(v1_0, v7_78);
                        if (!(v5_151 instanceof com.google.android.recaptcha.internal.zzle)) {
                            int v5_152 = ((String) v5_151);
                            v0_2 = com.google.android.recaptcha.internal.zzln.zzA(v0_12);
                            v5_124 = com.google.android.recaptcha.internal.zzln.zzz(v5_152);
                        } else {
                            int v5_154 = ((com.google.android.recaptcha.internal.zzle) v5_151);
                            v0_11 = com.google.android.recaptcha.internal.zzln.zzA(v0_12);
                            v5_145 = v5_154.zzd();
                            v7_69 = com.google.android.recaptcha.internal.zzln.zzA(v5_145);
                            v9 += ((v7_69 + v5_145) + v0_11);
                        }
                    }
                    break;
                case 9:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        v5_114 = com.google.android.recaptcha.internal.zzoy.zzh(v13_8, v6.getObject(v1_0, v7_78), v0_0.zzx(v2_7));
                        v9 += v5_114;
                    }
                    break;
                case 10:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        int v5_144 = ((com.google.android.recaptcha.internal.zzle) v6.getObject(v1_0, v7_78));
                        v0_11 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v5_145 = v5_144.zzd();
                        v7_69 = com.google.android.recaptcha.internal.zzln.zzA(v5_145);
                    }
                    break;
                case 11:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        v9 = v1.a.w(v6.getInt(v1_0, v7_78), com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3)), v9);
                    }
                    break;
                case 12:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        int v7_68 = ((long) v6.getInt(v1_0, v7_78));
                        v0_2 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v5_124 = com.google.android.recaptcha.internal.zzln.zzB(v7_68);
                    }
                    break;
                case 13:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 4, v9);
                    }
                    break;
                case 14:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 8, v9);
                    }
                    break;
                case 15:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        int v0_3 = (v13_8 << 3);
                        int v5_127 = v6.getInt(v1_0, v7_78);
                        v9 = v1.a.w(((v5_127 >> 31) ^ (v5_127 + v5_127)), com.google.android.recaptcha.internal.zzln.zzA(v0_3), v9);
                    }
                    break;
                case 16:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        int v0_1 = (v13_8 << 3);
                        int v7_63 = v6.getLong(v1_0, v7_78);
                        int v11_19 = (v7_63 + v7_63);
                        int v7_64 = (v7_63 >> 63);
                        v0_2 = com.google.android.recaptcha.internal.zzln.zzA(v0_1);
                        v5_124 = com.google.android.recaptcha.internal.zzln.zzB((v7_64 ^ v11_19));
                    }
                    break;
                case 17:
                    if (!v0_0.zzO(v1_0, v2_7, v3_4, v4_5, v11_18)) {
                    } else {
                        v9 += com.google.android.recaptcha.internal.zzln.zzw(v13_8, ((com.google.android.recaptcha.internal.zzoi) v6.getObject(v1_0, v7_78)), v0_0.zzx(v2_7));
                    }
                    break;
                case 18:
                    v5_114 = com.google.android.recaptcha.internal.zzoy.zzd(v13_8, ((java.util.List) v6.getObject(v1_0, v7_78)), 0);
                    break;
                case 19:
                    v5_114 = com.google.android.recaptcha.internal.zzoy.zzb(v13_8, ((java.util.List) v6.getObject(v1_0, v7_78)), 0);
                    break;
                case 20:
                    int v5_110 = ((java.util.List) v6.getObject(v1_0, v7_78));
                    if (v5_110.size() != 0) {
                        v17 = ((com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3)) * v5_110.size()) + com.google.android.recaptcha.internal.zzoy.zzg(v5_110));
                        v9 += v17;
                    } else {
                        v17 = 0;
                    }
                    break;
                case 21:
                    int v5_108 = ((java.util.List) v6.getObject(v1_0, v7_78));
                    v7_57 = v5_108.size();
                    if (v7_57 != 0) {
                        int v8_26 = (v13_8 << 3);
                        v5_106 = com.google.android.recaptcha.internal.zzoy.zzl(v5_108);
                        v8_25 = com.google.android.recaptcha.internal.zzln.zzA(v8_26);
                        v17 = ((v8_25 * v7_57) + v5_106);
                    }
                    break;
                case 22:
                    int v5_105 = ((java.util.List) v6.getObject(v1_0, v7_78));
                    v7_57 = v5_105.size();
                    if (v7_57 != 0) {
                        int v8_24 = (v13_8 << 3);
                        v5_106 = com.google.android.recaptcha.internal.zzoy.zzf(v5_105);
                        v8_25 = com.google.android.recaptcha.internal.zzln.zzA(v8_24);
                    }
                    break;
                case 23:
                    v5_21 = com.google.android.recaptcha.internal.zzoy.zzd(v13_8, ((java.util.List) v6.getObject(v1_0, v7_78)), 0);
                    v9 += v5_21;
                    break;
                case 24:
                    v5_77 = com.google.android.recaptcha.internal.zzoy.zzb(v13_8, ((java.util.List) v6.getObject(v1_0, v7_78)), 0);
                    v9 += v5_77;
                    break;
                case 25:
                    int v5_99 = ((java.util.List) v6.getObject(v1_0, v7_78)).size();
                    if (v5_99 != 0) {
                        v5_21 = (v5_99 * (com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3)) + 1));
                    } else {
                        v5_21 = 0;
                    }
                    break;
                case 26:
                    int v10_12;
                    int v5_94 = ((java.util.List) v6.getObject(v1_0, v7_78));
                    int v7_53 = v5_94.size();
                    if (v7_53 != 0) {
                        int v8_21 = (com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3)) * v7_53);
                        if (!(v5_94 instanceof com.google.android.recaptcha.internal.zznu)) {
                            v10_12 = v8_21;
                            int v8_22 = 0;
                            while (v8_22 < v7_53) {
                                int v11_4 = v5_94.get(v8_22);
                                if (!(v11_4 instanceof com.google.android.recaptcha.internal.zzle)) {
                                    v10_12 = (com.google.android.recaptcha.internal.zzln.zzz(((String) v11_4)) + v10_12);
                                } else {
                                    v10_12 = v1.a.w(((com.google.android.recaptcha.internal.zzle) v11_4).zzd(), ((com.google.android.recaptcha.internal.zzle) v11_4).zzd(), v10_12);
                                }
                                v8_22++;
                            }
                        } else {
                            int v5_95 = ((com.google.android.recaptcha.internal.zznu) v5_94);
                            v10_12 = v8_21;
                            int v8_23 = 0;
                            while (v8_23 < v7_53) {
                                int v11_10 = v5_95.zzc();
                                if (!(v11_10 instanceof com.google.android.recaptcha.internal.zzle)) {
                                    v10_12 = (com.google.android.recaptcha.internal.zzln.zzz(((String) v11_10)) + v10_12);
                                } else {
                                    v10_12 = v1.a.w(((com.google.android.recaptcha.internal.zzle) v11_10).zzd(), ((com.google.android.recaptcha.internal.zzle) v11_10).zzd(), v10_12);
                                }
                                v8_23++;
                            }
                        }
                    } else {
                        v10_12 = 0;
                    }
                    v9 += v10_12;
                    break;
                case 27:
                    int v11_3;
                    int v5_92 = ((java.util.List) v6.getObject(v1_0, v7_78));
                    int v7_52 = v0_0.zzx(v2_7);
                    int v8_18 = v5_92.size();
                    if (v8_18 != 0) {
                        v11_3 = (com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3)) * v8_18);
                        int v10_10 = 0;
                        while (v10_10 < v8_18) {
                            int v13_0 = v5_92.get(v10_10);
                            if (!(v13_0 instanceof com.google.android.recaptcha.internal.zznt)) {
                                v11_3 = (com.google.android.recaptcha.internal.zzln.zzy(((com.google.android.recaptcha.internal.zzoi) v13_0), v7_52) + v11_3);
                            } else {
                                v11_3 = v1.a.w(((com.google.android.recaptcha.internal.zznt) v13_0).zza(), ((com.google.android.recaptcha.internal.zznt) v13_0).zza(), v11_3);
                            }
                            v10_10++;
                        }
                    } else {
                        v11_3 = 0;
                    }
                    v9 += v11_3;
                    break;
                case 28:
                    int v8_17;
                    int v5_88 = ((java.util.List) v6.getObject(v1_0, v7_78));
                    int v7_50 = v5_88.size();
                    if (v7_50 != 0) {
                        v8_17 = (com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3)) * v7_50);
                        int v7_51 = 0;
                        while (v7_51 < v5_88.size()) {
                            v8_17 = v1.a.w(((com.google.android.recaptcha.internal.zzle) v5_88.get(v7_51)).zzd(), ((com.google.android.recaptcha.internal.zzle) v5_88.get(v7_51)).zzd(), v8_17);
                            v7_51++;
                        }
                    } else {
                        v8_17 = 0;
                    }
                    v9 += v8_17;
                    break;
                case 29:
                    int v5_85 = ((java.util.List) v6.getObject(v1_0, v7_78));
                    v7_49 = v5_85.size();
                    if (v7_49 != 0) {
                        int v8_13 = (v13_8 << 3);
                        v5_83 = com.google.android.recaptcha.internal.zzoy.zzk(v5_85);
                        v8_12 = com.google.android.recaptcha.internal.zzln.zzA(v8_13);
                        v5_21 = (v5_83 + (v8_12 * v7_49));
                    }
                    break;
                case 30:
                    int v5_81 = ((java.util.List) v6.getObject(v1_0, v7_78));
                    v7_49 = v5_81.size();
                    if (v7_49 != 0) {
                        int v8_11 = (v13_8 << 3);
                        v5_83 = com.google.android.recaptcha.internal.zzoy.zza(v5_81);
                        v8_12 = com.google.android.recaptcha.internal.zzln.zzA(v8_11);
                    }
                    break;
                case 31:
                    v5_21 = com.google.android.recaptcha.internal.zzoy.zzb(v13_8, ((java.util.List) v6.getObject(v1_0, v7_78)), 0);
                    break;
                case 32:
                    v5_77 = com.google.android.recaptcha.internal.zzoy.zzd(v13_8, ((java.util.List) v6.getObject(v1_0, v7_78)), 0);
                    break;
                case 33:
                    int v5_74 = ((java.util.List) v6.getObject(v1_0, v7_78));
                    v7_48 = v5_74.size();
                    if (v7_48 != 0) {
                        int v8_9 = (v13_8 << 3);
                        v5_72 = com.google.android.recaptcha.internal.zzoy.zzi(v5_74);
                        v8_8 = com.google.android.recaptcha.internal.zzln.zzA(v8_9);
                        v12_1 = ((v8_8 * v7_48) + v5_72);
                        v9 += v12_1;
                    } else {
                        v12_1 = 0;
                    }
                    break;
                case 34:
                    int v5_71 = ((java.util.List) v6.getObject(v1_0, v7_78));
                    v7_48 = v5_71.size();
                    if (v7_48 != 0) {
                        int v8_7 = (v13_8 << 3);
                        v5_72 = com.google.android.recaptcha.internal.zzoy.zzj(v5_71);
                        v8_8 = com.google.android.recaptcha.internal.zzln.zzA(v8_7);
                    }
                    break;
                case 35:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zze(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                        v9 += ((v8_1 + v7_15) + v5_18);
                    }
                    break;
                case 36:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zzc(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 37:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zzg(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 38:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zzl(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 39:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zzf(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 40:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zze(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 41:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zzc(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 42:
                    v5_18 = ((java.util.List) v6.getObject(v1_0, v7_78)).size();
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 43:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zzk(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 44:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zza(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 45:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zzc(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 46:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zze(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 47:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zzi(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 48:
                    v5_18 = com.google.android.recaptcha.internal.zzoy.zzj(((java.util.List) v6.getObject(v1_0, v7_78)));
                    if (v5_18 <= 0) {
                    } else {
                        v7_15 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v5_18);
                    }
                    break;
                case 49:
                    int v5_41 = ((java.util.List) v6.getObject(v1_0, v7_78));
                    int v7_33 = v0_0.zzx(v2_7);
                    int v8_4 = v5_41.size();
                    if (v8_4 != 0) {
                        int v10_2 = 0;
                        int v12_0 = 0;
                        while (v12_0 < v8_4) {
                            v10_2 += com.google.android.recaptcha.internal.zzln.zzw(v13_8, ((com.google.android.recaptcha.internal.zzoi) v5_41.get(v12_0)), v7_33);
                            v12_0++;
                        }
                        v12_1 = v10_2;
                    }
                    break;
                case 50:
                    int v5_36 = v6.getObject(v1_0, v7_78);
                    v0_0.zzz(v2_7);
                    int v5_37 = ((com.google.android.recaptcha.internal.zzoc) v5_36);
                    if (v5_37.isEmpty()) {
                    } else {
                        int v5_39 = v5_37.entrySet().iterator();
                        if (v5_39.hasNext()) {
                            int v1_7 = ((java.util.Map$Entry) v5_39.next());
                            v1_7.getKey();
                            v1_7.getValue();
                            throw 0;
                        } else {
                        }
                    }
                    break;
                case 51:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 8, v9);
                    }
                    break;
                case 52:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 4, v9);
                    }
                    break;
                case 53:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        int v5_33 = (v13_8 << 3);
                        int v7_25 = com.google.android.recaptcha.internal.zzol.zzv(v1_0, v7_78);
                        v5_5 = com.google.android.recaptcha.internal.zzln.zzA(v5_33);
                        v7_4 = com.google.android.recaptcha.internal.zzln.zzB(v7_25);
                        v9 += (v7_4 + v5_5);
                    }
                    break;
                case 54:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        int v5_31 = (v13_8 << 3);
                        int v7_24 = com.google.android.recaptcha.internal.zzol.zzv(v1_0, v7_78);
                        v5_5 = com.google.android.recaptcha.internal.zzln.zzA(v5_31);
                        v7_4 = com.google.android.recaptcha.internal.zzln.zzB(v7_24);
                    }
                    break;
                case 55:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        int v7_23 = ((long) com.google.android.recaptcha.internal.zzol.zzp(v1_0, v7_78));
                        v5_5 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v7_4 = com.google.android.recaptcha.internal.zzln.zzB(v7_23);
                    }
                    break;
                case 56:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 8, v9);
                    }
                    break;
                case 57:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 4, v9);
                    }
                    break;
                case 58:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 1, v9);
                    }
                    break;
                case 59:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        int v5_23 = (v13_8 << 3);
                        int v7_17 = v6.getObject(v1_0, v7_78);
                        if (!(v7_17 instanceof com.google.android.recaptcha.internal.zzle)) {
                            int v7_18 = ((String) v7_17);
                            v5_5 = com.google.android.recaptcha.internal.zzln.zzA(v5_23);
                            v7_4 = com.google.android.recaptcha.internal.zzln.zzz(v7_18);
                        } else {
                            int v7_19 = ((com.google.android.recaptcha.internal.zzle) v7_17);
                            v5_18 = com.google.android.recaptcha.internal.zzln.zzA(v5_23);
                            v7_15 = v7_19.zzd();
                            v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v7_15);
                        }
                    }
                    break;
                case 60:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        v5_21 = com.google.android.recaptcha.internal.zzoy.zzh(v13_8, v6.getObject(v1_0, v7_78), v0_0.zzx(v2_7));
                    }
                    break;
                case 61:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        int v7_14 = ((com.google.android.recaptcha.internal.zzle) v6.getObject(v1_0, v7_78));
                        v5_18 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v7_15 = v7_14.zzd();
                        v8_1 = com.google.android.recaptcha.internal.zzln.zzA(v7_15);
                    }
                    break;
                case 62:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        v9 = v1.a.w(com.google.android.recaptcha.internal.zzol.zzp(v1_0, v7_78), com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3)), v9);
                    }
                    break;
                case 63:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        int v7_11 = ((long) com.google.android.recaptcha.internal.zzol.zzp(v1_0, v7_78));
                        v5_5 = com.google.android.recaptcha.internal.zzln.zzA((v13_8 << 3));
                        v7_4 = com.google.android.recaptcha.internal.zzln.zzB(v7_11);
                    }
                    break;
                case 64:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 4, v9);
                    }
                    break;
                case 65:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        v9 = v1.a.w((v13_8 << 3), 8, v9);
                    }
                    break;
                case 66:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        int v5_7 = (v13_8 << 3);
                        int v7_5 = com.google.android.recaptcha.internal.zzol.zzp(v1_0, v7_78);
                        v9 = v1.a.w(((v7_5 >> 31) ^ (v7_5 + v7_5)), com.google.android.recaptcha.internal.zzln.zzA(v5_7), v9);
                    }
                    break;
                case 67:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        int v5_4 = (v13_8 << 3);
                        int v7_1 = com.google.android.recaptcha.internal.zzol.zzv(v1_0, v7_78);
                        int v10_1 = (v7_1 + v7_1);
                        int v7_2 = (v7_1 >> 63);
                        v5_5 = com.google.android.recaptcha.internal.zzln.zzA(v5_4);
                        v7_4 = com.google.android.recaptcha.internal.zzln.zzB((v7_2 ^ v10_1));
                    }
                    break;
                case 68:
                    if (!v0_0.zzR(v1_0, v13_8, v2_7)) {
                    } else {
                        v9 += com.google.android.recaptcha.internal.zzln.zzw(v13_8, ((com.google.android.recaptcha.internal.zzoi) v6.getObject(v1_0, v7_78)), v0_0.zzx(v2_7));
                    }
                    break;
                default:
            }
            v2_7 += 3;
            v1_0 = p19;
            v8_3 = 1048575;
        }
        int v10_0 = 0;
        int v1_5 = (((com.google.android.recaptcha.internal.zznd) p19).zzc.zza() + v9);
        if (v0_0.zzh) {
            int v2_3 = ((com.google.android.recaptcha.internal.zzna) p19).zzb;
            int v3_1 = v2_3.zza.zzc();
            int v7_27 = 0;
            while (v7_27 < v3_1) {
                com.google.android.recaptcha.internal.zzms v4_3 = v2_3.zza.zzg(v7_27);
                v10_0 += com.google.android.recaptcha.internal.zzmt.zza(((com.google.android.recaptcha.internal.zzms) ((com.google.android.recaptcha.internal.zzpa) v4_3).zza()), v4_3.getValue());
                v7_27++;
            }
            int v2_6 = v2_3.zza.zzd().iterator();
            while (v2_6.hasNext()) {
                int v3_5 = ((java.util.Map$Entry) v2_6.next());
                v10_0 += com.google.android.recaptcha.internal.zzmt.zza(((com.google.android.recaptcha.internal.zzms) v3_5.getKey()), v3_5.getValue());
            }
            v1_5 += v10_0;
        }
        return v1_5;
    }

    public final int zzb(Object p9)
    {
        int v0_0 = 0;
        int v1_0 = 0;
        while (v0_0 < this.zzc.length) {
            int v1_2;
            int v2_2;
            int v2_8;
            int v1_4;
            int v1_1;
            int v2_6;
            int v2_25 = this.zzu(v0_0);
            int v3_1 = this.zzc[v0_0];
            byte[] v4_3 = ((long) (1048575 & v2_25));
            int v6 = 37;
            switch (com.google.android.recaptcha.internal.zzol.zzt(v2_25)) {
                case 0:
                    v1_2 = (v1_0 * 53);
                    v2_8 = Double.doubleToLongBits(com.google.android.recaptcha.internal.zzps.zza(p9, v4_3));
                    v2_6 = ((int) (v2_8 ^ (v2_8 >> 32)));
                    v1_0 = (v1_2 + v2_6);
                    break;
                case 1:
                    v1_1 = (v1_0 * 53);
                    v2_2 = Float.floatToIntBits(com.google.android.recaptcha.internal.zzps.zzb(p9, v4_3));
                    v1_0 = (v2_2 + v1_1);
                    break;
                case 2:
                    v1_2 = (v1_0 * 53);
                    v2_8 = com.google.android.recaptcha.internal.zzps.zzd(p9, v4_3);
                    break;
                case 3:
                    v1_2 = (v1_0 * 53);
                    v2_8 = com.google.android.recaptcha.internal.zzps.zzd(p9, v4_3);
                    break;
                case 4:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.recaptcha.internal.zzps.zzc(p9, v4_3);
                    break;
                case 5:
                    v1_2 = (v1_0 * 53);
                    v2_8 = com.google.android.recaptcha.internal.zzps.zzd(p9, v4_3);
                    break;
                case 6:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.recaptcha.internal.zzps.zzc(p9, v4_3);
                    break;
                case 7:
                    v1_1 = (v1_0 * 53);
                    v2_2 = com.google.android.recaptcha.internal.zznl.zza(com.google.android.recaptcha.internal.zzps.zzw(p9, v4_3));
                    break;
                case 8:
                    v1_1 = (v1_0 * 53);
                    v2_2 = ((String) com.google.android.recaptcha.internal.zzps.zzf(p9, v4_3)).hashCode();
                    break;
                case 9:
                    v1_4 = (v1_0 * 53);
                    int v2_21 = com.google.android.recaptcha.internal.zzps.zzf(p9, v4_3);
                    if (v2_21 == 0) {
                        v1_0 = (v1_4 + v6);
                    } else {
                        v6 = v2_21.hashCode();
                    }
                    break;
                case 10:
                    v1_1 = (v1_0 * 53);
                    v2_2 = com.google.android.recaptcha.internal.zzps.zzf(p9, v4_3).hashCode();
                    break;
                case 11:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.recaptcha.internal.zzps.zzc(p9, v4_3);
                    break;
                case 12:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.recaptcha.internal.zzps.zzc(p9, v4_3);
                    break;
                case 13:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.recaptcha.internal.zzps.zzc(p9, v4_3);
                    break;
                case 14:
                    v1_2 = (v1_0 * 53);
                    v2_8 = com.google.android.recaptcha.internal.zzps.zzd(p9, v4_3);
                    break;
                case 15:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.recaptcha.internal.zzps.zzc(p9, v4_3);
                    break;
                case 16:
                    v1_2 = (v1_0 * 53);
                    v2_8 = com.google.android.recaptcha.internal.zzps.zzd(p9, v4_3);
                    break;
                case 17:
                    v1_4 = (v1_0 * 53);
                    int v2_18 = com.google.android.recaptcha.internal.zzps.zzf(p9, v4_3);
                    if (v2_18 == 0) {
                    } else {
                        v6 = v2_18.hashCode();
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
                    v1_1 = (v1_0 * 53);
                    v2_2 = com.google.android.recaptcha.internal.zzps.zzf(p9, v4_3).hashCode();
                    break;
                case 50:
                    v1_1 = (v1_0 * 53);
                    v2_2 = com.google.android.recaptcha.internal.zzps.zzf(p9, v4_3).hashCode();
                    break;
                case 51:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = Double.doubleToLongBits(com.google.android.recaptcha.internal.zzol.zzn(p9, v4_3));
                    }
                    break;
                case 52:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = Float.floatToIntBits(com.google.android.recaptcha.internal.zzol.zzo(p9, v4_3));
                    }
                    break;
                case 53:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = com.google.android.recaptcha.internal.zzol.zzv(p9, v4_3);
                    }
                    break;
                case 54:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = com.google.android.recaptcha.internal.zzol.zzv(p9, v4_3);
                    }
                    break;
                case 55:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.recaptcha.internal.zzol.zzp(p9, v4_3);
                    }
                    break;
                case 56:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = com.google.android.recaptcha.internal.zzol.zzv(p9, v4_3);
                    }
                    break;
                case 57:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.recaptcha.internal.zzol.zzp(p9, v4_3);
                    }
                    break;
                case 58:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = com.google.android.recaptcha.internal.zznl.zza(com.google.android.recaptcha.internal.zzol.zzS(p9, v4_3));
                    }
                    break;
                case 59:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = ((String) com.google.android.recaptcha.internal.zzps.zzf(p9, v4_3)).hashCode();
                    }
                    break;
                case 60:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = com.google.android.recaptcha.internal.zzps.zzf(p9, v4_3).hashCode();
                    }
                    break;
                case 61:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = com.google.android.recaptcha.internal.zzps.zzf(p9, v4_3).hashCode();
                    }
                    break;
                case 62:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.recaptcha.internal.zzol.zzp(p9, v4_3);
                    }
                    break;
                case 63:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.recaptcha.internal.zzol.zzp(p9, v4_3);
                    }
                    break;
                case 64:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.recaptcha.internal.zzol.zzp(p9, v4_3);
                    }
                    break;
                case 65:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = com.google.android.recaptcha.internal.zzol.zzv(p9, v4_3);
                    }
                    break;
                case 66:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.recaptcha.internal.zzol.zzp(p9, v4_3);
                    }
                    break;
                case 67:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = com.google.android.recaptcha.internal.zzol.zzv(p9, v4_3);
                    }
                    break;
                case 68:
                    if (!this.zzR(p9, v3_1, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = com.google.android.recaptcha.internal.zzps.zzf(p9, v4_3).hashCode();
                    }
                    break;
                default:
            }
            v0_0 += 3;
        }
        int v0_2 = (((com.google.android.recaptcha.internal.zznd) p9).zzc.hashCode() + (v1_0 * 53));
        if (this.zzh) {
            v0_2 = ((v0_2 * 53) + ((com.google.android.recaptcha.internal.zzna) p9).zzb.zza.hashCode());
        }
        return v0_2;
    }

    public final int zzc(Object p31, byte[] p32, int p33, int p34, int p35, com.google.android.recaptcha.internal.zzkt p36)
    {
        void v0_0 = this;
        com.google.android.recaptcha.internal.zznn v2_0 = p31;
        int v3_0 = p32;
        com.google.android.recaptcha.internal.zzle v4_5 = p34;
        com.google.android.recaptcha.internal.zzle v6_1 = p36;
        com.google.android.recaptcha.internal.zzol.zzD(p31);
        com.google.android.recaptcha.internal.zznn v1_27 = com.google.android.recaptcha.internal.zzol.zzb;
        java.nio.charset.Charset v12_3 = -1;
        int v5_2 = p33;
        long v7_12 = -1;
        long v8_0 = 0;
        int v9_1 = 1048575;
        com.google.android.recaptcha.internal.zznx v14_0 = 0;
        sun.misc.Unsafe v15_1 = 0;
        while (v5_2 < v4_5) {
            sun.misc.Unsafe v15_3 = (v5_2 + 1);
            int v5_55 = v3_0[v5_2];
            if (v5_55 < 0) {
                v15_3 = com.google.android.recaptcha.internal.zzku.zzj(v5_55, v3_0, v15_3, v6_1);
                v5_55 = v6_1.zza;
            }
            long v7_24;
            com.google.android.recaptcha.internal.zzle v6_21 = v15_3;
            v15_1 = v5_55;
            int v5_57 = (v15_1 >> 3);
            if (v5_57 <= v7_12) {
                v7_24 = v0_0.zzq(v5_57);
            } else {
                if ((v5_57 < v0_0.zze) || (v5_57 > v0_0.zzf)) {
                    v7_24 = v12_3;
                } else {
                    v7_24 = v0_0.zzs(v5_57, (v8_0 / 3));
                }
            }
            com.google.android.recaptcha.internal.zznn v1_26;
            long v7_11;
            String v10_2;
            sun.misc.Unsafe v15_0;
            int v26_0;
            int v3_7;
            int v9_3;
            String v13_0;
            com.google.android.recaptcha.internal.zznx v11_0;
            int v23_0;
            if (v7_24 != v12_3) {
                int v26_1;
                java.nio.charset.Charset v12_12 = (v15_1 & 7);
                long v8_18 = v0_0.zzc;
                com.google.android.recaptcha.internal.zznx v11_37 = v8_18[(v7_24 + 1)];
                String v13_6 = com.google.android.recaptcha.internal.zzol.zzt(v11_37);
                Object v21_12 = ((long) (v11_37 & 1048575));
                sun.misc.Unsafe v25 = v5_57;
                if (v13_6 > 17) {
                    String v10_3;
                    com.google.android.recaptcha.internal.zznn v2_13;
                    int v9_4;
                    com.google.android.recaptcha.internal.zzle v6_3;
                    int v5_69 = v1_27;
                    com.google.android.recaptcha.internal.zznn v1_86 = v2_0;
                    int v24_5 = v6_21;
                    com.google.android.recaptcha.internal.zzle v6_24 = v7_24;
                    long v7_31 = v21_12;
                    if (v13_6 != 27) {
                        com.google.android.recaptcha.internal.zznn v2_71 = v15_1;
                        sun.misc.Unsafe v15_4 = v1_86;
                        int v5_74 = v6_24;
                        int v22_0 = v5_69;
                        if (v13_6 > 49) {
                            v6_3 = p36;
                            v10_3 = v2_71;
                            v26_0 = v9_1;
                            v2_13 = v15_4;
                            v15_0 = v25;
                            v9_4 = v5_74;
                            v5_69 = v22_0;
                            if (v13_6 != 50) {
                                com.google.android.recaptcha.internal.zzle v4_3;
                                com.google.android.recaptcha.internal.zznn v1_69;
                                int v22_1;
                                com.google.android.recaptcha.internal.zznx v14_2;
                                Object v21_1;
                                com.google.android.recaptcha.internal.zznx v11_14;
                                com.google.android.recaptcha.internal.zznn v2_17;
                                com.google.android.recaptcha.internal.zznn v1_18;
                                com.google.android.recaptcha.internal.zzle v4_38;
                                int v27_0;
                                int v3_63 = com.google.android.recaptcha.internal.zzol.zzb;
                                int v22_4 = v5_69;
                                int v5_76 = ((long) (v8_18[(v9_4 + 2)] & 1048575));
                                switch (v13_6) {
                                    case 51:
                                        v11_0 = p36;
                                        v13_0 = v2_13;
                                        v21_1 = v9_4;
                                        v9_3 = v10_3;
                                        v23_0 = v22_4;
                                        v1_26 = 1;
                                        v10_2 = p32;
                                        v22_1 = v14_0;
                                        v14_2 = v24_5;
                                        if (v12_12 != 1) {
                                            v5_2 = v14_2;
                                        } else {
                                            com.google.android.recaptcha.internal.zznn v2_58 = (v14_2 + 8);
                                            v3_63.putObject(v13_0, v7_31, Double.valueOf(Double.longBitsToDouble(com.google.android.recaptcha.internal.zzku.zzp(p32, v14_2))));
                                            v3_63.putInt(v13_0, v5_76, v15_0);
                                            v5_2 = v2_58;
                                        }
                                        break;
                                    case 52:
                                        v11_0 = p36;
                                        v13_0 = v2_13;
                                        v21_1 = v9_4;
                                        v9_3 = v10_3;
                                        v23_0 = v22_4;
                                        v10_2 = p32;
                                        v22_1 = v14_0;
                                        v14_2 = v24_5;
                                        if (v12_12 != 5) {
                                            v1_26 = 1;
                                        } else {
                                            v1_69 = (v14_2 + 4);
                                            v3_63.putObject(v13_0, v7_31, Float.valueOf(Float.intBitsToFloat(com.google.android.recaptcha.internal.zzku.zzb(p32, v14_2))));
                                            v3_63.putInt(v13_0, v5_76, v15_0);
                                            v5_2 = v1_69;
                                            v1_26 = 1;
                                        }
                                        break;
                                    case 53:
                                    case 54:
                                        v11_0 = p36;
                                        v13_0 = v2_13;
                                        v21_1 = v9_4;
                                        v9_3 = v10_3;
                                        v23_0 = v22_4;
                                        v10_2 = p32;
                                        v22_1 = v14_0;
                                        v14_2 = v24_5;
                                        if (v12_12 != null) {
                                        } else {
                                            v4_38 = com.google.android.recaptcha.internal.zzku.zzl(p32, v14_2, p36);
                                            v3_63.putObject(v13_0, v7_31, Long.valueOf(p36.zzb));
                                            v3_63.putInt(v13_0, v5_76, v15_0);
                                            v5_2 = v4_38;
                                        }
                                        break;
                                    case 55:
                                    case 62:
                                        v11_0 = p36;
                                        v13_0 = v2_13;
                                        v21_1 = v9_4;
                                        v9_3 = v10_3;
                                        v23_0 = v22_4;
                                        v10_2 = p32;
                                        v22_1 = v14_0;
                                        v14_2 = v24_5;
                                        if (v12_12 != null) {
                                        } else {
                                            v1_69 = com.google.android.recaptcha.internal.zzku.zzi(p32, v14_2, p36);
                                            v3_63.putObject(v13_0, v7_31, Integer.valueOf(p36.zza));
                                            v3_63.putInt(v13_0, v5_76, v15_0);
                                        }
                                        break;
                                    case 56:
                                    case 65:
                                        v11_0 = p36;
                                        v13_0 = v2_13;
                                        v21_1 = v9_4;
                                        v9_3 = v10_3;
                                        v23_0 = v22_4;
                                        v1_26 = 1;
                                        v10_2 = p32;
                                        v22_1 = v14_0;
                                        v14_2 = v24_5;
                                        if (v12_12 != 1) {
                                        } else {
                                            v1_69 = (v14_2 + 8);
                                            v3_63.putObject(v13_0, v7_31, Long.valueOf(com.google.android.recaptcha.internal.zzku.zzp(p32, v14_2)));
                                            v3_63.putInt(v13_0, v5_76, v15_0);
                                        }
                                        break;
                                    case 57:
                                    case 64:
                                        v11_0 = p36;
                                        v13_0 = v2_13;
                                        v21_1 = v9_4;
                                        v9_3 = v10_3;
                                        v23_0 = v22_4;
                                        v10_2 = p32;
                                        v22_1 = v14_0;
                                        v14_2 = v24_5;
                                        if (v12_12 != 5) {
                                        } else {
                                            v1_69 = (v14_2 + 4);
                                            v3_63.putObject(v13_0, v7_31, Integer.valueOf(com.google.android.recaptcha.internal.zzku.zzb(p32, v14_2)));
                                            v3_63.putInt(v13_0, v5_76, v15_0);
                                        }
                                        break;
                                    case 58:
                                        v11_0 = p36;
                                        v13_0 = v2_13;
                                        v21_1 = v9_4;
                                        v9_3 = v10_3;
                                        v23_0 = v22_4;
                                        v10_2 = p32;
                                        v22_1 = v14_0;
                                        v14_2 = v24_5;
                                        if (v12_12 != null) {
                                        } else {
                                            com.google.android.recaptcha.internal.zznn v1_66;
                                            v4_38 = com.google.android.recaptcha.internal.zzku.zzl(p32, v14_2, p36);
                                            if (p36.zzb == 0) {
                                                v1_66 = 0;
                                            } else {
                                                v1_66 = 1;
                                            }
                                            v3_63.putObject(v13_0, v7_31, Boolean.valueOf(v1_66));
                                            v3_63.putInt(v13_0, v5_76, v15_0);
                                        }
                                        break;
                                    case 59:
                                        v13_0 = v2_13;
                                        v21_1 = v9_4;
                                        v9_3 = v10_3;
                                        int v20_1 = v11_37;
                                        v23_0 = v22_4;
                                        v10_2 = p32;
                                        v11_0 = p36;
                                        v22_1 = v14_0;
                                        v14_2 = v24_5;
                                        if (v12_12 != 2) {
                                        } else {
                                            com.google.android.recaptcha.internal.zznn v2_47 = com.google.android.recaptcha.internal.zzku.zzi(p32, v14_2, p36);
                                            java.nio.charset.Charset v12_11 = p36.zza;
                                            if (v12_11 != null) {
                                                com.google.android.recaptcha.internal.zzle v4_36 = (v2_47 + v12_11);
                                                if (((v20_1 & 536870912) != 0) && (!com.google.android.recaptcha.internal.zzpv.zze(p32, v2_47, v4_36))) {
                                                    throw new com.google.android.recaptcha.internal.zznn("Protocol message had invalid UTF-8.");
                                                } else {
                                                    int v20_4 = v4_36;
                                                    v3_63.putObject(v13_0, v7_31, new String(p32, v2_47, v12_11, com.google.android.recaptcha.internal.zznl.zza));
                                                    v2_47 = v20_4;
                                                }
                                            } else {
                                                v3_63.putObject(v13_0, v7_31, "");
                                            }
                                            v3_63.putInt(v13_0, v5_76, v15_0);
                                            v5_2 = v2_47;
                                        }
                                        break;
                                    case 60:
                                        String v10_6 = v9_4;
                                        v9_3 = v10_3;
                                        v13_0 = v2_13;
                                        com.google.android.recaptcha.internal.zznx v11_33 = v24_5;
                                        if (v12_12 != 2) {
                                            v21_1 = v10_6;
                                            v23_0 = v22_4;
                                            v1_26 = 1;
                                            v10_2 = p32;
                                            v22_1 = v14_0;
                                            v14_2 = v11_33;
                                            v11_0 = p36;
                                        } else {
                                            com.google.android.recaptcha.internal.zznn v1_60 = v0_0.zzB(v13_0, v15_0, v10_6);
                                            com.google.android.recaptcha.internal.zzle v4_35 = v11_33;
                                            com.google.android.recaptcha.internal.zznn v2_45 = com.google.android.recaptcha.internal.zzku.zzn(v1_60, v0_0.zzx(v10_6), p32, v4_35, p34, p36);
                                            v0_0 = v0_0.zzK(v13_0, v15_0, v10_6, v1_60);
                                            v11_0 = p36;
                                            v5_2 = v2_45;
                                            v21_1 = v10_6;
                                            v23_0 = v22_4;
                                            v1_26 = 1;
                                            v10_2 = p32;
                                            v22_1 = v14_0;
                                            v14_2 = v4_35;
                                        }
                                        break;
                                    case 61:
                                        String v10_5 = v9_4;
                                        v9_3 = v10_3;
                                        v1_18 = p32;
                                        v4_3 = p36;
                                        v13_0 = v2_13;
                                        v11_14 = v24_5;
                                        if (v12_12 != 2) {
                                            v21_1 = v10_5;
                                            v23_0 = v22_4;
                                            v10_2 = v1_18;
                                            v22_1 = v14_0;
                                            v1_26 = 1;
                                            v14_2 = v11_14;
                                            v11_0 = v4_3;
                                        } else {
                                            com.google.android.recaptcha.internal.zznn v2_42 = com.google.android.recaptcha.internal.zzku.zza(p32, v11_14, p36);
                                            v3_63.putObject(v13_0, v7_31, p36.zzc);
                                            v3_63.putInt(v13_0, v5_76, v15_0);
                                            v5_2 = v2_42;
                                            v21_1 = v10_5;
                                            v23_0 = v22_4;
                                            v10_2 = v1_18;
                                            v22_1 = v14_0;
                                            v1_26 = 1;
                                            v14_2 = v11_14;
                                            v11_0 = v4_3;
                                        }
                                        break;
                                    case 63:
                                        v1_18 = p32;
                                        v4_3 = p36;
                                        v13_0 = v2_13;
                                        v21_1 = v9_4;
                                        v27_0 = v10_3;
                                        v11_14 = v24_5;
                                        if (v12_12 != null) {
                                            v10_2 = v1_18;
                                            v23_0 = v22_4;
                                            v9_3 = v27_0;
                                            v1_26 = 1;
                                            v22_1 = v14_0;
                                        } else {
                                            java.nio.charset.Charset v12_9;
                                            com.google.android.recaptcha.internal.zznn v2_31 = com.google.android.recaptcha.internal.zzku.zzi(p32, v11_14, p36);
                                            int v9_19 = p36.zza;
                                            String v10_4 = v21_1;
                                            java.nio.charset.Charset v12_7 = v0_0.zzw(v10_4);
                                            if ((v12_7 != null) && (!v12_7.zza(v9_19))) {
                                                v12_9 = v27_0;
                                                com.google.android.recaptcha.internal.zzol.zzd(v13_0).zzj(v12_9, Long.valueOf(((long) v9_19)));
                                            } else {
                                                v12_9 = v27_0;
                                                v3_63.putObject(v13_0, v7_31, Integer.valueOf(v9_19));
                                                v3_63.putInt(v13_0, v5_76, v15_0);
                                            }
                                            v5_2 = v2_31;
                                            v21_1 = v10_4;
                                            v9_3 = v12_9;
                                        }
                                        break;
                                    case 66:
                                        v1_18 = p32;
                                        v4_3 = p36;
                                        v13_0 = v2_13;
                                        v21_1 = v9_4;
                                        v27_0 = v10_3;
                                        v11_14 = v24_5;
                                        if (v12_12 != null) {
                                        } else {
                                            v2_17 = com.google.android.recaptcha.internal.zzku.zzi(p32, v11_14, p36);
                                            v3_63.putObject(v13_0, v7_31, Integer.valueOf(com.google.android.recaptcha.internal.zzli.zzF(p36.zza)));
                                            v3_63.putInt(v13_0, v5_76, v15_0);
                                            v10_2 = v1_18;
                                            v5_2 = v2_17;
                                            v23_0 = v22_4;
                                            v9_3 = v27_0;
                                            v1_26 = 1;
                                            v22_1 = v14_0;
                                        }
                                        break;
                                    case 67:
                                        v1_18 = p32;
                                        v4_3 = p36;
                                        v13_0 = v2_13;
                                        v11_14 = v24_5;
                                        if (v12_12 != null) {
                                            v21_1 = v9_4;
                                            v9_3 = v10_3;
                                        } else {
                                            v2_17 = com.google.android.recaptcha.internal.zzku.zzl(p32, v11_14, p36);
                                            v21_1 = v9_4;
                                            v27_0 = v10_3;
                                            v3_63.putObject(v13_0, v7_31, Long.valueOf(com.google.android.recaptcha.internal.zzli.zzG(p36.zzb)));
                                            v3_63.putInt(v13_0, v5_76, v15_0);
                                        }
                                        break;
                                    case 68:
                                        if (v12_12 != 3) {
                                            v13_0 = v2_13;
                                            v11_0 = p36;
                                            v21_1 = v9_4;
                                            v9_3 = v10_3;
                                            v23_0 = v22_4;
                                            v1_26 = 1;
                                            v10_2 = p32;
                                            v22_1 = v14_0;
                                            v14_2 = v24_5;
                                        } else {
                                            com.google.android.recaptcha.internal.zzle v6_0 = ((v10_3 & -8) | 4);
                                            com.google.android.recaptcha.internal.zznn v1_5 = v0_0.zzB(v2_13, v15_0, v9_4);
                                            v13_0 = p31;
                                            com.google.android.recaptcha.internal.zzle v4_2 = v24_5;
                                            com.google.android.recaptcha.internal.zznn v2_7 = com.google.android.recaptcha.internal.zzku.zzm(v1_5, v0_0.zzx(v9_4), p32, v4_2, p34, v6_0, p36);
                                            v1_18 = p32;
                                            v11_14 = v4_2;
                                            v4_3 = p36;
                                            v0_0 = v0_0.zzK(p31, v15_0, v9_4, v1_5);
                                            v5_2 = v2_7;
                                            v21_1 = v9_4;
                                            v9_3 = v10_3;
                                        }
                                        break;
                                    default:
                                        v11_0 = p36;
                                        v13_0 = v2_13;
                                }
                                if (v5_2 == v14_2) {
                                    v7_11 = p35;
                                    v3_7 = v5_2;
                                    v8_0 = v21_1;
                                    v14_0 = v22_1;
                                    if ((v9_3 != v7_11) || (v7_11 == 0)) {
                                        com.google.android.recaptcha.internal.zznn v1_40;
                                        int v3_37;
                                        int v9_20;
                                        if (!v0_0.zzh) {
                                            v1_40 = v9_3;
                                            v3_37 = com.google.android.recaptcha.internal.zzku.zzh(v1_40, v10_2, v3_7, p34, com.google.android.recaptcha.internal.zzol.zzd(v13_0), v11_0);
                                            v9_20 = p34;
                                            v5_2 = v3_37;
                                        } else {
                                            com.google.android.recaptcha.internal.zznn v2_33 = v11_0.zzd;
                                            com.google.android.recaptcha.internal.zzle v4 = com.google.android.recaptcha.internal.zzos.zza;
                                            if (v2_33 == com.google.android.recaptcha.internal.zzmo.zza) {
                                            } else {
                                                com.google.android.recaptcha.internal.zznn v2_35 = v2_33.zza(v0_0.zzg, v15_0);
                                                if (v2_35 != null) {
                                                    int v27_2 = v9_3;
                                                    com.google.android.recaptcha.internal.zzle v6_17 = v11_0;
                                                    com.google.android.recaptcha.internal.zzle v4_30 = ((com.google.android.recaptcha.internal.zzna) v13_0);
                                                    v4_30.zzi();
                                                    com.google.android.recaptcha.internal.zzle v4_31 = v4_30.zzb;
                                                    int v5_47 = v2_35.zza.zzb;
                                                    if (v5_47 == com.google.android.recaptcha.internal.zzpw.zzn) {
                                                        com.google.android.recaptcha.internal.zzku.zzi(v10_2, v3_7, v6_17);
                                                        throw 0;
                                                    } else {
                                                        com.google.android.recaptcha.internal.zznn v1_46;
                                                        com.google.android.recaptcha.internal.zznn v1_41;
                                                        int v3_39;
                                                        switch (v5_47.ordinal()) {
                                                            case 0:
                                                                v1_46 = (v3_7 + 8);
                                                                v3_39 = Double.valueOf(Double.longBitsToDouble(com.google.android.recaptcha.internal.zzku.zzp(v10_2, v3_7)));
                                                                v3_7 = v1_46;
                                                                v1_41 = v3_39;
                                                                break;
                                                            case 1:
                                                                v1_46 = (v3_7 + 4);
                                                                v3_39 = Float.valueOf(Float.intBitsToFloat(com.google.android.recaptcha.internal.zzku.zzb(v10_2, v3_7)));
                                                                break;
                                                            case 2:
                                                            case 3:
                                                                v3_7 = com.google.android.recaptcha.internal.zzku.zzl(v10_2, v3_7, v6_17);
                                                                v1_41 = Long.valueOf(v6_17.zzb);
                                                                break;
                                                            case 4:
                                                            case 12:
                                                                v3_7 = com.google.android.recaptcha.internal.zzku.zzi(v10_2, v3_7, v6_17);
                                                                v1_41 = Integer.valueOf(v6_17.zza);
                                                                break;
                                                            case 5:
                                                            case 15:
                                                                v1_46 = (v3_7 + 8);
                                                                v3_39 = Long.valueOf(com.google.android.recaptcha.internal.zzku.zzp(v10_2, v3_7));
                                                                break;
                                                            case 6:
                                                            case 14:
                                                                v1_46 = (v3_7 + 4);
                                                                v3_39 = Integer.valueOf(com.google.android.recaptcha.internal.zzku.zzb(v10_2, v3_7));
                                                                break;
                                                            case 7:
                                                                v3_7 = com.google.android.recaptcha.internal.zzku.zzl(v10_2, v3_7, v6_17);
                                                                if (v6_17.zzb == 0) {
                                                                    v1_26 = 0;
                                                                }
                                                                v1_41 = Boolean.valueOf(v1_26);
                                                                break;
                                                            case 8:
                                                                v3_7 = com.google.android.recaptcha.internal.zzku.zzg(v10_2, v3_7, v6_17);
                                                                v1_41 = v6_17.zzc;
                                                                break;
                                                            case 9:
                                                                throw 0;
                                                                break;
                                                            case 10:
                                                                throw 0;
                                                                break;
                                                            case 11:
                                                                v3_7 = com.google.android.recaptcha.internal.zzku.zza(v10_2, v3_7, v6_17);
                                                                v1_41 = v6_17.zzc;
                                                                break;
                                                            case 13:
                                                                throw new IllegalStateException("Shouldn\'t reach here.");
                                                                break;
                                                            case 16:
                                                                v3_7 = com.google.android.recaptcha.internal.zzku.zzi(v10_2, v3_7, v6_17);
                                                                v1_41 = Integer.valueOf(com.google.android.recaptcha.internal.zzli.zzF(v6_17.zza));
                                                                break;
                                                            case 17:
                                                                v3_7 = com.google.android.recaptcha.internal.zzku.zzl(v10_2, v3_7, v6_17);
                                                                v1_41 = Long.valueOf(com.google.android.recaptcha.internal.zzli.zzG(v6_17.zzb));
                                                                break;
                                                            default:
                                                                v1_41 = 0;
                                                        }
                                                        v4_31.zzi(v2_35.zza, v1_41);
                                                        v9_20 = p34;
                                                        v5_2 = v3_7;
                                                        v1_40 = v27_2;
                                                    }
                                                } else {
                                                    v1_40 = v9_3;
                                                    v3_37 = com.google.android.recaptcha.internal.zzku.zzh(v1_40, v10_2, v3_7, p34, com.google.android.recaptcha.internal.zzol.zzd(v13_0), v11_0);
                                                    v9_20 = p34;
                                                }
                                            }
                                        }
                                        v3_0 = p32;
                                        v6_1 = p36;
                                        v4_5 = v9_20;
                                        v2_0 = v13_0;
                                        v7_12 = v15_0;
                                        v9_1 = v26_0;
                                        v12_3 = -1;
                                        v15_1 = v1_40;
                                        v1_27 = v23_0;
                                    } else {
                                        com.google.android.recaptcha.internal.zzle v6_19 = v3_7;
                                        v15_1 = v9_3;
                                        int v9_22 = p34;
                                    }
                                    com.google.android.recaptcha.internal.zznn v1_48 = v26_0;
                                    if (v1_48 != 1048575) {
                                        v23_0.putInt(v13_0, ((long) v1_48), v14_0);
                                    }
                                    long v8_16 = v0_0.zzk;
                                    while (v8_16 < v0_0.zzl) {
                                        v0_0.zzy(v13_0, v0_0.zzj[v8_16], 0, v0_0.zzm, p31);
                                        v8_16++;
                                        v0_0 = this;
                                        v13_0 = p31;
                                    }
                                    if (v7_11 != 0) {
                                        if ((v6_19 > v9_22) || (v15_1 != v7_11)) {
                                            throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
                                        }
                                    } else {
                                        if (v6_19 != v9_22) {
                                            throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
                                        }
                                    }
                                    return v6_19;
                                } else {
                                    v4_5 = p34;
                                    v3_0 = v10_2;
                                    v6_1 = v11_0;
                                    v2_0 = v13_0;
                                    v7_12 = v15_0;
                                    v8_0 = v21_1;
                                    v14_0 = v22_1;
                                    v1_27 = v23_0;
                                    v12_3 = -1;
                                    v15_1 = v9_3;
                                    v9_1 = v26_0;
                                }
                            } else {
                                if (v12_12 == 2) {
                                    com.google.android.recaptcha.internal.zznn v1_74 = com.google.android.recaptcha.internal.zzol.zzb;
                                    v0_0.zzz(v9_4);
                                    com.google.android.recaptcha.internal.zzle v4_40 = v1_74.getObject(v2_13, v7_31);
                                    if (com.google.android.recaptcha.internal.zzod.zza(v4_40)) {
                                        int v5_60 = com.google.android.recaptcha.internal.zzoc.zza().zzb();
                                        com.google.android.recaptcha.internal.zzod.zzb(v5_60, v4_40);
                                        v1_74.putObject(v2_13, v7_31, v5_60);
                                    }
                                    throw 0;
                                }
                            }
                        } else {
                            int v27_3;
                            v26_0 = v9_1;
                            int v9_24 = ((long) v11_37);
                            com.google.android.recaptcha.internal.zzle v6_22 = com.google.android.recaptcha.internal.zzol.zzb;
                            com.google.android.recaptcha.internal.zznx v11_36 = ((com.google.android.recaptcha.internal.zznk) v6_22.getObject(v15_4, v7_31));
                            if (v11_36.zzc()) {
                                v27_3 = v2_71;
                            } else {
                                v27_3 = v2_71;
                                v11_36 = v11_36.zzd((v11_36.size() + v11_36.size()));
                                v6_22.putObject(v15_4, v7_31, v11_36);
                            }
                            String v10_7;
                            int v3_60;
                            com.google.android.recaptcha.internal.zznn v1_76;
                            String v13_5;
                            long v7_30;
                            String v13_7;
                            long v7_10;
                            long v7_32;
                            long v8_1;
                            int v5_0;
                            Object v21_0;
                            com.google.android.recaptcha.internal.zzle v4_41;
                            com.google.android.recaptcha.internal.zzle v4_0;
                            com.google.android.recaptcha.internal.zznn v2_75;
                            com.google.android.recaptcha.internal.zznx v11_42;
                            com.google.android.recaptcha.internal.zznn v1_3;
                            String v10_0;
                            long v8_29;
                            int v9_0;
                            com.google.android.recaptcha.internal.zznx v11_44;
                            switch (v13_6) {
                                case 18:
                                case 35:
                                    v3_0 = p32;
                                    v9_0 = p34;
                                    v6_1 = p36;
                                    v21_0 = v5_74;
                                    int v5_15 = v11_36;
                                    v4_0 = v24_5;
                                    v15_0 = v25;
                                    v10_0 = v27_3;
                                    if (v12_12 != 2) {
                                        if (v12_12 != 1) {
                                            v5_2 = v4_0;
                                        } else {
                                            v1_3 = (v4_0 + 8);
                                            com.google.android.recaptcha.internal.zznx v11_10 = ((com.google.android.recaptcha.internal.zzmi) v5_15);
                                            v11_10.zzf(Double.longBitsToDouble(com.google.android.recaptcha.internal.zzku.zzp(p32, v4_0)));
                                            while (v1_3 < p34) {
                                                com.google.android.recaptcha.internal.zznn v2_8 = com.google.android.recaptcha.internal.zzku.zzi(p32, v1_3, p36);
                                                if (v10_0 != p36.zza) {
                                                    break;
                                                }
                                                v11_10.zzf(Double.longBitsToDouble(com.google.android.recaptcha.internal.zzku.zzp(p32, v2_8)));
                                                v1_3 = (v2_8 + 8);
                                            }
                                            v5_2 = v1_3;
                                        }
                                    } else {
                                        com.google.android.recaptcha.internal.zznx v11_13 = ((com.google.android.recaptcha.internal.zzmi) v5_15);
                                        v1_3 = com.google.android.recaptcha.internal.zzku.zzi(p32, v4_0, p36);
                                        int v5_17 = p36.zza;
                                        long v7_9 = (v1_3 + v5_17);
                                        if (v7_9 > p32.length) {
                                            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        } else {
                                            v11_13.zzg(((v5_17 / 8) + v11_13.size()));
                                            while (v1_3 < v7_9) {
                                                v11_13.zzf(Double.longBitsToDouble(com.google.android.recaptcha.internal.zzku.zzp(p32, v1_3)));
                                                v1_3 += 8;
                                            }
                                            if (v1_3 != v7_9) {
                                                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                    }
                                case 19:
                                case 36:
                                    v3_0 = p32;
                                    v9_0 = p34;
                                    v6_1 = p36;
                                    v21_0 = v5_74;
                                    int v5_7 = v11_36;
                                    v4_0 = v24_5;
                                    v15_0 = v25;
                                    v10_0 = v27_3;
                                    if (v12_12 != 2) {
                                        if (v12_12 != 5) {
                                        } else {
                                            v1_3 = (v4_0 + 4);
                                            com.google.android.recaptcha.internal.zznx v11_6 = ((com.google.android.recaptcha.internal.zzmv) v5_7);
                                            v11_6.zzf(Float.intBitsToFloat(com.google.android.recaptcha.internal.zzku.zzb(p32, v4_0)));
                                            while (v1_3 < p34) {
                                                com.google.android.recaptcha.internal.zznn v2_6 = com.google.android.recaptcha.internal.zzku.zzi(p32, v1_3, p36);
                                                if (v10_0 != p36.zza) {
                                                    break;
                                                }
                                                v11_6.zzf(Float.intBitsToFloat(com.google.android.recaptcha.internal.zzku.zzb(p32, v2_6)));
                                                v1_3 = (v2_6 + 4);
                                            }
                                        }
                                    } else {
                                        com.google.android.recaptcha.internal.zznx v11_8 = ((com.google.android.recaptcha.internal.zzmv) v5_7);
                                        v1_3 = com.google.android.recaptcha.internal.zzku.zzi(p32, v4_0, p36);
                                        int v5_10 = p36.zza;
                                        long v7_4 = (v1_3 + v5_10);
                                        if (v7_4 > p32.length) {
                                            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        } else {
                                            v11_8.zzg(((v5_10 / 4) + v11_8.size()));
                                            while (v1_3 < v7_4) {
                                                v11_8.zzf(Float.intBitsToFloat(com.google.android.recaptcha.internal.zzku.zzb(p32, v1_3)));
                                                v1_3 += 4;
                                            }
                                            if (v1_3 != v7_4) {
                                                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                    }
                                    break;
                                case 20:
                                case 21:
                                case 37:
                                case 38:
                                    v3_0 = p32;
                                    v9_0 = p34;
                                    v6_1 = p36;
                                    v21_0 = v5_74;
                                    int v5_3 = v11_36;
                                    v4_0 = v24_5;
                                    v15_0 = v25;
                                    v10_0 = v27_3;
                                    if (v12_12 != 2) {
                                        if (v12_12 != null) {
                                        } else {
                                            com.google.android.recaptcha.internal.zznx v11_2 = ((com.google.android.recaptcha.internal.zznx) v5_3);
                                            v1_3 = com.google.android.recaptcha.internal.zzku.zzl(p32, v4_0, p36);
                                            v11_2.zzg(p36.zzb);
                                            while (v1_3 < p34) {
                                                com.google.android.recaptcha.internal.zznn v2_2 = com.google.android.recaptcha.internal.zzku.zzi(p32, v1_3, p36);
                                                if (v10_0 != p36.zza) {
                                                    break;
                                                }
                                                v1_3 = com.google.android.recaptcha.internal.zzku.zzl(p32, v2_2, p36);
                                                v11_2.zzg(p36.zzb);
                                            }
                                        }
                                    } else {
                                        com.google.android.recaptcha.internal.zznx v11_4 = ((com.google.android.recaptcha.internal.zznx) v5_3);
                                        v1_3 = com.google.android.recaptcha.internal.zzku.zzi(p32, v4_0, p36);
                                        int v5_6 = (p36.zza + v1_3);
                                        while (v1_3 < v5_6) {
                                            v1_3 = com.google.android.recaptcha.internal.zzku.zzl(p32, v1_3, p36);
                                            v11_4.zzg(p36.zzb);
                                        }
                                        if (v1_3 != v5_6) {
                                            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    break;
                                case 22:
                                case 29:
                                case 39:
                                case 43:
                                    v7_32 = p32;
                                    v6_1 = p36;
                                    v21_0 = v5_74;
                                    int v9_35 = v11_36;
                                    v11_44 = v24_5;
                                    v15_0 = v25;
                                    v8_1 = v27_3;
                                    v5_0 = p34;
                                    if (v12_12 != 2) {
                                        if (v12_12 != null) {
                                            v9_0 = v5_0;
                                            v3_0 = v7_32;
                                            v10_0 = v8_1;
                                            v4_0 = v11_44;
                                        } else {
                                            com.google.android.recaptcha.internal.zznn v1_2 = v8_1;
                                            int v3_1 = v11_44;
                                            v5_2 = com.google.android.recaptcha.internal.zzku.zzk(v1_2, p32, v3_1, p34, v9_35, p36);
                                            v10_0 = v1_2;
                                            v9_0 = p34;
                                            v4_0 = v3_1;
                                            v3_0 = p32;
                                        }
                                    } else {
                                        v1_3 = com.google.android.recaptcha.internal.zzku.zzf(p32, v11_44, v9_35, p36);
                                        v9_0 = v5_0;
                                        v3_0 = v7_32;
                                        v10_0 = v8_1;
                                        v4_0 = v11_44;
                                    }
                                    break;
                                case 23:
                                case 32:
                                case 40:
                                case 46:
                                    v7_32 = p32;
                                    v6_1 = p36;
                                    v21_0 = v5_74;
                                    int v9_32 = v11_36;
                                    v11_44 = v24_5;
                                    v15_0 = v25;
                                    v8_1 = v27_3;
                                    v5_0 = p34;
                                    if (v12_12 != 2) {
                                        if (v12_12 != 1) {
                                        } else {
                                            v1_3 = (v11_44 + 8);
                                            com.google.android.recaptcha.internal.zznn v2_85 = ((com.google.android.recaptcha.internal.zznx) v9_32);
                                            v2_85.zzg(com.google.android.recaptcha.internal.zzku.zzp(p32, v11_44));
                                            while (v1_3 < p34) {
                                                int v3_68 = com.google.android.recaptcha.internal.zzku.zzi(p32, v1_3, p36);
                                                if (v8_1 != p36.zza) {
                                                    break;
                                                }
                                                v2_85.zzg(com.google.android.recaptcha.internal.zzku.zzp(p32, v3_68));
                                                v1_3 = (v3_68 + 8);
                                            }
                                        }
                                    } else {
                                        com.google.android.recaptcha.internal.zznn v1_126 = ((com.google.android.recaptcha.internal.zznx) v9_32);
                                        v3_60 = com.google.android.recaptcha.internal.zzku.zzi(p32, v11_44, p36);
                                        com.google.android.recaptcha.internal.zzle v4_58 = p36.zza;
                                        int v9_34 = (v3_60 + v4_58);
                                        if (v9_34 > p32.length) {
                                            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        } else {
                                            v1_126.zzh(((v4_58 / 8) + v1_126.size()));
                                            while (v3_60 < v9_34) {
                                                v1_126.zzg(com.google.android.recaptcha.internal.zzku.zzp(p32, v3_60));
                                                v3_60 += 8;
                                            }
                                            if (v3_60 != v9_34) {
                                                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            } else {
                                                v9_0 = v5_0;
                                                v10_0 = v8_1;
                                                v4_0 = v11_44;
                                                v5_2 = v3_60;
                                                v3_0 = v7_32;
                                            }
                                        }
                                    }
                                    break;
                                case 24:
                                case 31:
                                case 41:
                                case 45:
                                    v7_32 = p32;
                                    v6_1 = p36;
                                    v21_0 = v5_74;
                                    int v9_30 = v11_36;
                                    v11_44 = v24_5;
                                    v15_0 = v25;
                                    v8_1 = v27_3;
                                    v5_0 = p34;
                                    if (v12_12 != 2) {
                                        if (v12_12 != 5) {
                                        } else {
                                            v1_3 = (v11_44 + 4);
                                            com.google.android.recaptcha.internal.zznn v2_83 = ((com.google.android.recaptcha.internal.zzne) v9_30);
                                            v2_83.zzh(com.google.android.recaptcha.internal.zzku.zzb(p32, v11_44));
                                            while (v1_3 < p34) {
                                                int v3_65 = com.google.android.recaptcha.internal.zzku.zzi(p32, v1_3, p36);
                                                if (v8_1 != p36.zza) {
                                                    break;
                                                }
                                                v2_83.zzh(com.google.android.recaptcha.internal.zzku.zzb(p32, v3_65));
                                                v1_3 = (v3_65 + 4);
                                            }
                                        }
                                    } else {
                                        com.google.android.recaptcha.internal.zznn v1_119 = ((com.google.android.recaptcha.internal.zzne) v9_30);
                                        v3_60 = com.google.android.recaptcha.internal.zzku.zzi(p32, v11_44, p36);
                                        com.google.android.recaptcha.internal.zzle v4_53 = p36.zza;
                                        int v9_31 = (v3_60 + v4_53);
                                        if (v9_31 > p32.length) {
                                            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        } else {
                                            v1_119.zzi(((v4_53 / 4) + v1_119.size()));
                                            while (v3_60 < v9_31) {
                                                v1_119.zzh(com.google.android.recaptcha.internal.zzku.zzb(p32, v3_60));
                                                v3_60 += 4;
                                            }
                                            if (v3_60 != v9_31) {
                                                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                    }
                                    break;
                                case 25:
                                case 42:
                                    v7_32 = p32;
                                    v6_1 = p36;
                                    v21_0 = v5_74;
                                    int v9_26 = v11_36;
                                    v11_44 = v24_5;
                                    v15_0 = v25;
                                    v8_1 = v27_3;
                                    v5_0 = p34;
                                    if (v12_12 != 2) {
                                        if (v12_12 != null) {
                                        } else {
                                            int v3_54;
                                            com.google.android.recaptcha.internal.zznn v1_111 = ((com.google.android.recaptcha.internal.zzkv) v9_26);
                                            v2_75 = com.google.android.recaptcha.internal.zzku.zzl(p32, v11_44, p36);
                                            if (p36.zzb == 0) {
                                                v3_54 = 0;
                                            } else {
                                                v3_54 = 1;
                                            }
                                            v1_111.zze(v3_54);
                                            while (v2_75 < p34) {
                                                int v3_55 = com.google.android.recaptcha.internal.zzku.zzi(p32, v2_75, p36);
                                                if (v8_1 != p36.zza) {
                                                    break;
                                                }
                                                int v3_59;
                                                v2_75 = com.google.android.recaptcha.internal.zzku.zzl(p32, v3_55, p36);
                                                if (p36.zzb == 0) {
                                                    v3_59 = 0;
                                                } else {
                                                    v3_59 = 1;
                                                }
                                                v1_111.zze(v3_59);
                                            }
                                            v9_0 = v5_0;
                                            v3_0 = v7_32;
                                            v10_0 = v8_1;
                                            v4_0 = v11_44;
                                            v5_2 = v2_75;
                                        }
                                    } else {
                                        com.google.android.recaptcha.internal.zznn v1_113 = ((com.google.android.recaptcha.internal.zzkv) v9_26);
                                        v3_60 = com.google.android.recaptcha.internal.zzku.zzi(p32, v11_44, p36);
                                        com.google.android.recaptcha.internal.zzle v4_51 = (p36.zza + v3_60);
                                        while (v3_60 < v4_51) {
                                            int v9_29;
                                            v3_60 = com.google.android.recaptcha.internal.zzku.zzl(p32, v3_60, p36);
                                            if (p36.zzb == 0) {
                                                v9_29 = 0;
                                            } else {
                                                v9_29 = 1;
                                            }
                                            v1_113.zze(v9_29);
                                        }
                                        if (v3_60 != v4_51) {
                                            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    break;
                                case 26:
                                    v7_32 = p32;
                                    v6_1 = p36;
                                    v13_7 = v5_74;
                                    int v9_25 = v11_36;
                                    v11_44 = v24_5;
                                    v15_0 = v25;
                                    v8_1 = v27_3;
                                    v5_0 = p34;
                                    if (v12_12 != 2) {
                                        v21_0 = v13_7;
                                    } else {
                                        if ((v9_24 & 536870912) != 0) {
                                            v2_75 = com.google.android.recaptcha.internal.zzku.zzi(p32, v11_44, p36);
                                            String v10_9 = p36.zza;
                                            if (v10_9 < null) {
                                                throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            } else {
                                                int v20_8;
                                                if (v10_9 != null) {
                                                    java.nio.charset.Charset v12_14 = (v2_75 + v10_9);
                                                    if (!com.google.android.recaptcha.internal.zzpv.zze(p32, v2_75, v12_14)) {
                                                        throw new com.google.android.recaptcha.internal.zznn("Protocol message had invalid UTF-8.");
                                                    } else {
                                                        v20_8 = v12_14;
                                                        v21_0 = v13_7;
                                                        v9_25.add(new String(p32, v2_75, v10_9, com.google.android.recaptcha.internal.zznl.zza));
                                                    }
                                                } else {
                                                    v9_25.add("");
                                                    v21_0 = v13_7;
                                                    while (v2_75 < p34) {
                                                        String v10_10 = com.google.android.recaptcha.internal.zzku.zzi(p32, v2_75, p36);
                                                        if (v8_1 != p36.zza) {
                                                            break;
                                                        }
                                                        v2_75 = com.google.android.recaptcha.internal.zzku.zzi(p32, v10_10, p36);
                                                        String v10_11 = p36.zza;
                                                        if (v10_11 < null) {
                                                            throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        } else {
                                                            if (v10_11 != null) {
                                                                java.nio.charset.Charset v12_18 = (v2_75 + v10_11);
                                                                if (!com.google.android.recaptcha.internal.zzpv.zze(p32, v2_75, v12_18)) {
                                                                    throw new com.google.android.recaptcha.internal.zznn("Protocol message had invalid UTF-8.");
                                                                } else {
                                                                    v20_8 = v12_18;
                                                                    v9_25.add(new String(p32, v2_75, v10_11, com.google.android.recaptcha.internal.zznl.zza));
                                                                }
                                                            } else {
                                                                v9_25.add("");
                                                            }
                                                        }
                                                    }
                                                }
                                                v2_75 = v20_8;
                                            }
                                        } else {
                                            v1_3 = com.google.android.recaptcha.internal.zzku.zzi(p32, v11_44, p36);
                                            com.google.android.recaptcha.internal.zznn v2_80 = p36.zza;
                                            if (v2_80 < null) {
                                                throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            } else {
                                                if (v2_80 != null) {
                                                    v9_25.add(new String(p32, v1_3, v2_80, com.google.android.recaptcha.internal.zznl.zza));
                                                } else {
                                                    v9_25.add("");
                                                    while (v1_3 < p34) {
                                                        com.google.android.recaptcha.internal.zznn v2_81 = com.google.android.recaptcha.internal.zzku.zzi(p32, v1_3, p36);
                                                        if (v8_1 != p36.zza) {
                                                            break;
                                                        }
                                                        v1_3 = com.google.android.recaptcha.internal.zzku.zzi(p32, v2_81, p36);
                                                        v2_80 = p36.zza;
                                                        if (v2_80 < null) {
                                                            throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        } else {
                                                            if (v2_80 != null) {
                                                                v9_25.add(new String(p32, v1_3, v2_80, com.google.android.recaptcha.internal.zznl.zza));
                                                                v1_3 += v2_80;
                                                            } else {
                                                                v9_25.add("");
                                                            }
                                                        }
                                                    }
                                                    v9_0 = p34;
                                                    v3_0 = p32;
                                                    v10_0 = v8_1;
                                                    v4_0 = v11_44;
                                                    v21_0 = v13_7;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 27:
                                    v8_29 = p32;
                                    v9_0 = p34;
                                    v7_30 = p36;
                                    v13_7 = v5_74;
                                    v11_42 = v24_5;
                                    v15_0 = v25;
                                    v10_0 = v27_3;
                                    if (v12_12 != 2) {
                                        v6_1 = v7_30;
                                        v3_0 = v8_29;
                                        v4_0 = v11_42;
                                        v21_0 = v13_7;
                                    } else {
                                        v3_0 = p32;
                                        v4_0 = v11_42;
                                        v1_3 = com.google.android.recaptcha.internal.zzku.zze(v0_0.zzx(v13_7), v10_0, p32, v4_0, p34, v11_36, p36);
                                        v6_1 = p36;
                                    }
                                    break;
                                case 28:
                                    v8_29 = p32;
                                    v9_0 = p34;
                                    v7_30 = p36;
                                    v13_7 = v5_74;
                                    int v5_71 = v11_36;
                                    v11_42 = v24_5;
                                    v15_0 = v25;
                                    v10_0 = v27_3;
                                    if (v12_12 != 2) {
                                    } else {
                                        com.google.android.recaptcha.internal.zznn v1_89 = com.google.android.recaptcha.internal.zzku.zzi(p32, v11_42, p36);
                                        com.google.android.recaptcha.internal.zzle v4_45 = p36.zza;
                                        if (v4_45 < null) {
                                            throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        } else {
                                            if (v4_45 > (p32.length - v1_89)) {
                                                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            } else {
                                                if (v4_45 != null) {
                                                    v5_71.add(com.google.android.recaptcha.internal.zzle.zzk(p32, v1_89, v4_45));
                                                } else {
                                                    v5_71.add(com.google.android.recaptcha.internal.zzle.zzb);
                                                    while (v1_89 < p34) {
                                                        com.google.android.recaptcha.internal.zzle v4_47 = com.google.android.recaptcha.internal.zzku.zzi(p32, v1_89, p36);
                                                        if (v10_0 != p36.zza) {
                                                            break;
                                                        }
                                                        v1_89 = com.google.android.recaptcha.internal.zzku.zzi(p32, v4_47, p36);
                                                        v4_45 = p36.zza;
                                                        if (v4_45 < null) {
                                                            throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        } else {
                                                            if (v4_45 > (p32.length - v1_89)) {
                                                                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            } else {
                                                                if (v4_45 != null) {
                                                                    v5_71.add(com.google.android.recaptcha.internal.zzle.zzk(p32, v1_89, v4_45));
                                                                    v1_89 += v4_45;
                                                                } else {
                                                                    v5_71.add(com.google.android.recaptcha.internal.zzle.zzb);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    v5_2 = v1_89;
                                                    v6_1 = p36;
                                                    v3_0 = p32;
                                                    v4_0 = v11_42;
                                                    v21_0 = v13_7;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 30:
                                case 44:
                                    long v7_29;
                                    long v8_28;
                                    java.nio.charset.Charset v12_13;
                                    int v5_68;
                                    com.google.android.recaptcha.internal.zznx v11_43;
                                    v3_0 = p32;
                                    v6_1 = p36;
                                    v13_7 = v5_74;
                                    String v10_8 = v24_5;
                                    long v7_27 = v27_3;
                                    if (v12_12 != 2) {
                                        if (v12_12 != null) {
                                            v11_42 = v10_8;
                                            v15_0 = v25;
                                            v10_0 = v7_27;
                                            v9_0 = p34;
                                        } else {
                                            com.google.android.recaptcha.internal.zznn v1_83 = v7_27;
                                            int v3_50 = v10_8;
                                            v5_68 = v11_36;
                                            v10_0 = v1_83;
                                            v8_28 = p32;
                                            v11_43 = v3_50;
                                            v9_0 = p34;
                                            v7_29 = p36;
                                            v12_13 = com.google.android.recaptcha.internal.zzku.zzk(v1_83, p32, v3_50, p34, v5_68, p36);
                                        }
                                    } else {
                                        v8_28 = p32;
                                        v5_68 = v11_36;
                                        v11_43 = v10_8;
                                        v10_0 = v7_27;
                                        v12_13 = com.google.android.recaptcha.internal.zzku.zzf(p32, v10_8, v11_36, p36);
                                        v9_0 = p34;
                                        v7_29 = p36;
                                    }
                                    com.google.android.recaptcha.internal.zznn v2_68 = v25;
                                    com.google.android.recaptcha.internal.zzoy.zzn(v15_4, v2_68, v5_68, v0_0.zzw(v13_7), 0, v0_0.zzm);
                                    v15_0 = v2_68;
                                    v6_1 = v7_29;
                                    v3_0 = v8_28;
                                    v4_0 = v11_43;
                                    v5_2 = v12_13;
                                    break;
                                case 33:
                                case 47:
                                    v3_0 = p32;
                                    v4_41 = p34;
                                    v6_1 = p36;
                                    v13_5 = v5_74;
                                    v10_7 = v24_5;
                                    v7_10 = v27_3;
                                    if (v12_12 != 2) {
                                        if (v12_12 != null) {
                                            v9_0 = v4_41;
                                            v4_0 = v10_7;
                                            v21_0 = v13_5;
                                            v15_0 = v25;
                                            v10_0 = v7_10;
                                        } else {
                                            com.google.android.recaptcha.internal.zznx v11_40 = ((com.google.android.recaptcha.internal.zzne) v11_36);
                                            v1_76 = com.google.android.recaptcha.internal.zzku.zzi(p32, v10_7, p36);
                                            v11_40.zzh(com.google.android.recaptcha.internal.zzli.zzF(p36.zza));
                                            while (v1_76 < p34) {
                                                com.google.android.recaptcha.internal.zznn v2_64 = com.google.android.recaptcha.internal.zzku.zzi(p32, v1_76, p36);
                                                if (v7_10 != p36.zza) {
                                                    break;
                                                }
                                                v1_76 = com.google.android.recaptcha.internal.zzku.zzi(p32, v2_64, p36);
                                                v11_40.zzh(com.google.android.recaptcha.internal.zzli.zzF(p36.zza));
                                            }
                                            v5_2 = v1_76;
                                            v9_0 = v4_41;
                                            v4_0 = v10_7;
                                            v21_0 = v13_5;
                                            v15_0 = v25;
                                            v10_0 = v7_10;
                                        }
                                    } else {
                                        com.google.android.recaptcha.internal.zznx v11_41 = ((com.google.android.recaptcha.internal.zzne) v11_36);
                                        v1_76 = com.google.android.recaptcha.internal.zzku.zzi(p32, v10_7, p36);
                                        int v5_66 = (p36.zza + v1_76);
                                        while (v1_76 < v5_66) {
                                            v1_76 = com.google.android.recaptcha.internal.zzku.zzi(p32, v1_76, p36);
                                            v11_41.zzh(com.google.android.recaptcha.internal.zzli.zzF(p36.zza));
                                        }
                                        if (v1_76 != v5_66) {
                                            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    break;
                                case 34:
                                case 48:
                                    v3_0 = p32;
                                    v4_41 = p34;
                                    v6_1 = p36;
                                    v13_5 = v5_74;
                                    long v8_19 = v22_0;
                                    v10_7 = v24_5;
                                    v7_10 = v27_3;
                                    if (v12_12 != 2) {
                                        v22_0 = v8_19;
                                        if (v12_12 != null) {
                                        } else {
                                            com.google.android.recaptcha.internal.zznx v11_38 = ((com.google.android.recaptcha.internal.zznx) v11_36);
                                            v1_76 = com.google.android.recaptcha.internal.zzku.zzl(p32, v10_7, p36);
                                            v11_38.zzg(com.google.android.recaptcha.internal.zzli.zzG(p36.zzb));
                                            while (v1_76 < p34) {
                                                com.google.android.recaptcha.internal.zznn v2_61 = com.google.android.recaptcha.internal.zzku.zzi(p32, v1_76, p36);
                                                if (v7_10 != p36.zza) {
                                                    break;
                                                }
                                                v1_76 = com.google.android.recaptcha.internal.zzku.zzl(p32, v2_61, p36);
                                                v11_38.zzg(com.google.android.recaptcha.internal.zzli.zzG(p36.zzb));
                                            }
                                        }
                                    } else {
                                        com.google.android.recaptcha.internal.zznx v11_39 = ((com.google.android.recaptcha.internal.zznx) v11_36);
                                        v1_76 = com.google.android.recaptcha.internal.zzku.zzi(p32, v10_7, p36);
                                        int v5_63 = (p36.zza + v1_76);
                                        while (v1_76 < v5_63) {
                                            v1_76 = com.google.android.recaptcha.internal.zzku.zzl(p32, v1_76, p36);
                                            int v22_2 = v8_19;
                                            v11_39.zzg(com.google.android.recaptcha.internal.zzli.zzG(p36.zzb));
                                            v8_19 = v22_2;
                                        }
                                        v22_0 = v8_19;
                                        if (v1_76 != v5_63) {
                                            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    break;
                                default:
                                    if (v12_12 != 3) {
                                        v3_0 = p32;
                                        v9_0 = p34;
                                        v6_1 = p36;
                                        v21_0 = v5_74;
                                        v4_0 = v24_5;
                                        v15_0 = v25;
                                        v10_0 = v27_3;
                                    } else {
                                        com.google.android.recaptcha.internal.zznn v2_9 = ((v27_3 & -8) | 4);
                                        com.google.android.recaptcha.internal.zznn v1_25 = v0_0.zzx(v5_74);
                                        v6_1 = p36;
                                        String v13_1 = v5_74;
                                        long v8_6 = v22_0;
                                        int v3_4 = v24_5;
                                        v7_10 = v27_3;
                                        int v5_20 = v2_9;
                                        com.google.android.recaptcha.internal.zznn v2_10 = p32;
                                        int v9_2 = com.google.android.recaptcha.internal.zzku.zzc(v1_25, p32, v3_4, p34, v5_20, p36);
                                        String v10_1 = v3_4;
                                        v11_36.add(p36.zzc);
                                        while (v9_2 < p34) {
                                            int v3_6 = com.google.android.recaptcha.internal.zzku.zzi(v2_10, v9_2, p36);
                                            if (v7_10 != p36.zza) {
                                                break;
                                            }
                                            v9_2 = com.google.android.recaptcha.internal.zzku.zzc(v1_25, v2_10, v3_6, p34, v5_20, p36);
                                            int v3_8 = v2_10;
                                            v11_36.add(p36.zzc);
                                            v2_10 = v3_8;
                                        }
                                        v3_0 = v2_10;
                                        v22_0 = v8_6;
                                        v5_2 = v9_2;
                                        v21_0 = v13_1;
                                        v15_0 = v25;
                                        v9_0 = p34;
                                        v4_0 = v10_1;
                                    }
                            }
                            if (v5_2 == v4_0) {
                                v13_0 = p31;
                                v7_11 = p35;
                                v11_0 = v6_1;
                                v9_3 = v10_0;
                                v8_0 = v21_0;
                                v23_0 = v22_0;
                                v1_26 = 1;
                                v10_2 = v3_0;
                                v3_7 = v5_2;
                            } else {
                                v2_0 = p31;
                                v4_5 = v9_0;
                                v7_12 = v15_0;
                                v8_0 = v21_0;
                                v1_27 = v22_0;
                                v9_1 = v26_0;
                                v12_3 = -1;
                                v15_1 = v10_0;
                            }
                        }
                    } else {
                        if (v12_12 != 2) {
                            v2_13 = v1_86;
                            v26_0 = v9_1;
                            v10_3 = v15_1;
                            v15_0 = v25;
                            v9_4 = v6_24;
                            v6_3 = p36;
                        } else {
                            com.google.android.recaptcha.internal.zznn v2_15 = ((com.google.android.recaptcha.internal.zznk) v5_69.getObject(v1_86, v7_31));
                            if (!v2_15.zzc()) {
                                int v3_11;
                                int v3_10 = v2_15.size();
                                if (v3_10 != 0) {
                                    v3_11 = (v3_10 + v3_10);
                                } else {
                                    v3_11 = 10;
                                }
                                v2_15 = v2_15.zzd(v3_11);
                                v5_69.putObject(v1_86, v7_31, v2_15);
                            }
                            v26_1 = v6_24;
                            com.google.android.recaptcha.internal.zznn v2_16 = v15_1;
                            v15_1 = v2_16;
                            v2_0 = p31;
                            v3_0 = p32;
                            v4_5 = p34;
                            v6_1 = p36;
                            v5_2 = com.google.android.recaptcha.internal.zzku.zze(v0_0.zzx(v6_24), v2_16, p32, v24_5, p34, v2_15, p36);
                            v1_27 = v5_69;
                            v7_12 = v25;
                            v8_0 = v26_1;
                            v12_3 = -1;
                        }
                    }
                    v7_11 = p35;
                    v13_0 = v2_13;
                    v23_0 = v5_69;
                    v11_0 = v6_3;
                    v8_0 = v9_4;
                    v9_3 = v10_3;
                    v3_7 = v24_5;
                    v1_26 = 1;
                    v10_2 = p32;
                } else {
                    com.google.android.recaptcha.internal.zznx v14_1;
                    com.google.android.recaptcha.internal.zzle v6_5;
                    int v5_23 = v8_18[(v7_24 + 2)];
                    long v8_9 = (1 << (v5_23 >> 20));
                    int v5_24 = (v5_23 & 1048575);
                    int v24_0 = v6_21;
                    if (v5_24 == v9_1) {
                        v26_1 = v7_24;
                        v6_5 = v14_0;
                        v14_1 = v9_1;
                    } else {
                        com.google.android.recaptcha.internal.zzle v6_6 = 1048575;
                        v26_1 = v7_24;
                        if (v9_1 != 1048575) {
                            v1_27.putInt(v2_0, ((long) v9_1), v14_0);
                            v6_6 = 1048575;
                        }
                        if (v5_24 != v6_6) {
                            v6_5 = v1_27.getInt(v2_0, ((long) v5_24));
                        } else {
                            v6_5 = 0;
                        }
                        v14_1 = v5_24;
                    }
                    com.google.android.recaptcha.internal.zzle v4_9;
                    com.google.android.recaptcha.internal.zznn v2_21;
                    com.google.android.recaptcha.internal.zzle v4_10;
                    int v3_17;
                    int v20_0;
                    com.google.android.recaptcha.internal.zznn v1_36;
                    com.google.android.recaptcha.internal.zznn v2_25;
                    com.google.android.recaptcha.internal.zznn v2_19;
                    int v9_14;
                    long v7_14;
                    int v3_26;
                    int v9_17;
                    long v7_18;
                    int v5_25;
                    com.google.android.recaptcha.internal.zzle v6_13;
                    com.google.android.recaptcha.internal.zznx v11_23;
                    long v8_10;
                    long v8_13;
                    com.google.android.recaptcha.internal.zznn v1_30;
                    int v9_5;
                    String v13_2;
                    switch (v13_6) {
                        case 0:
                            v7_14 = p32;
                            v5_25 = v1_27;
                            v1_30 = v2_0;
                            v20_0 = v6_5;
                            v2_19 = v24_0;
                            v8_13 = p36;
                            if (v12_12 != 1) {
                                v13_0 = v1_30;
                                v3_7 = v2_19;
                                v23_0 = v5_25;
                                v10_2 = v7_14;
                                v11_0 = v8_13;
                                v9_3 = v15_1;
                                v15_0 = v25;
                                v8_0 = v26_1;
                                v1_26 = 1;
                                v7_11 = p35;
                                v26_0 = v14_1;
                                v14_0 = v20_0;
                            } else {
                                v6_13 = (v2_19 + 8);
                                v9_17 = (v20_0 | v8_9);
                                com.google.android.recaptcha.internal.zzps.zzo(v1_30, v21_12, Double.longBitsToDouble(com.google.android.recaptcha.internal.zzku.zzp(p32, v2_19)));
                                v14_0 = v9_17;
                                v9_1 = v14_1;
                                v4_5 = p34;
                                v2_0 = v1_30;
                                v1_27 = v5_25;
                                v5_2 = v6_13;
                                v3_0 = v7_14;
                                v6_1 = v8_13;
                            }
                            break;
                        case 1:
                            v7_14 = p32;
                            v5_25 = v1_27;
                            v1_30 = v2_0;
                            v20_0 = v6_5;
                            v2_19 = v24_0;
                            v8_13 = p36;
                            if (v12_12 != 5) {
                            } else {
                                v6_13 = (v2_19 + 4);
                                v9_17 = (v20_0 | v8_9);
                                com.google.android.recaptcha.internal.zzps.zzp(v1_30, v21_12, Float.intBitsToFloat(com.google.android.recaptcha.internal.zzku.zzb(p32, v2_19)));
                            }
                            break;
                        case 2:
                        case 3:
                            v7_14 = p32;
                            v9_14 = v1_27;
                            v1_30 = v2_0;
                            v20_0 = v6_5;
                            int v3_33 = v21_12;
                            v2_19 = v24_0;
                            v8_13 = p36;
                            if (v12_12 != null) {
                                v5_25 = v9_14;
                            } else {
                                v11_23 = (v20_0 | v8_9);
                                java.nio.charset.Charset v12_6 = com.google.android.recaptcha.internal.zzku.zzl(p32, v2_19, p36);
                                v2_0 = v1_30;
                                v1_27 = v9_14;
                                v1_27.putLong(v2_0, v3_33, p36.zzb);
                                v4_5 = p34;
                                v3_0 = p32;
                                v6_1 = p36;
                                v5_2 = v12_6;
                                v9_1 = v14_1;
                                v7_12 = v25;
                                v8_0 = v26_1;
                                v12_3 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            v7_14 = p32;
                            v9_14 = v1_27;
                            v1_30 = v2_0;
                            v20_0 = v6_5;
                            int v3_31 = v21_12;
                            v2_19 = v24_0;
                            v8_13 = p36;
                            if (v12_12 != null) {
                            } else {
                                int v5_41 = (v20_0 | v8_9);
                                com.google.android.recaptcha.internal.zznn v2_27 = com.google.android.recaptcha.internal.zzku.zzi(p32, v2_19, p36);
                                v9_14.putInt(v1_30, v3_31, p36.zza);
                                v2_0 = v1_30;
                                v1_27 = v9_14;
                                v9_1 = v14_1;
                                v14_0 = v5_41;
                                v5_2 = v2_27;
                                v4_5 = p34;
                            }
                            break;
                        case 5:
                        case 14:
                            v9_14 = v1_27;
                            long v7_19 = v2_0;
                            v20_0 = v6_5;
                            v2_19 = v24_0;
                            v8_13 = p36;
                            if (v12_12 != 1) {
                                v7_14 = p32;
                                v1_30 = v7_19;
                            } else {
                                com.google.android.recaptcha.internal.zznx v11_22 = (v2_19 + 8);
                                java.nio.charset.Charset v12_5 = (v20_0 | v8_9);
                                v2_0 = v7_19;
                                v1_27 = v9_14;
                                v1_27.putLong(v2_0, v21_12, com.google.android.recaptcha.internal.zzku.zzp(p32, v2_19));
                                v4_5 = p34;
                                v3_0 = p32;
                                v6_1 = p36;
                                v5_2 = v11_22;
                                v9_1 = v14_1;
                                v7_12 = v25;
                                v8_0 = v26_1;
                                v14_0 = v12_5;
                            }
                            break;
                        case 6:
                        case 13:
                            v9_14 = v1_27;
                            v7_18 = v2_0;
                            v20_0 = v6_5;
                            v2_19 = v24_0;
                            v1_36 = p32;
                            v8_13 = p36;
                            if (v12_12 != 5) {
                                v7_14 = v1_36;
                                v1_30 = v7_18;
                            } else {
                                int v3_28 = (v2_19 + 4);
                                com.google.android.recaptcha.internal.zzle v4_22 = (v20_0 | v8_9);
                                v9_14.putInt(v7_18, v21_12, com.google.android.recaptcha.internal.zzku.zzb(p32, v2_19));
                                v5_2 = v3_28;
                                v2_0 = v7_18;
                                v6_1 = p36;
                                v7_12 = v25;
                                v8_0 = v26_1;
                                v12_3 = -1;
                                v3_0 = p32;
                                v1_27 = v9_14;
                                v9_1 = v14_1;
                                v14_0 = v4_22;
                                v4_5 = p34;
                            }
                            break;
                        case 7:
                            v9_14 = v1_27;
                            v7_18 = v2_0;
                            v20_0 = v6_5;
                            int v5_36 = v21_12;
                            v2_19 = v24_0;
                            v1_36 = p32;
                            v8_13 = p36;
                            if (v12_12 != null) {
                            } else {
                                com.google.android.recaptcha.internal.zzle v4_20;
                                v3_26 = (v20_0 | v8_9);
                                v2_25 = com.google.android.recaptcha.internal.zzku.zzl(p32, v2_19, p36);
                                if (p36.zzb == 0) {
                                    v4_20 = 0;
                                } else {
                                    v4_20 = 1;
                                }
                                com.google.android.recaptcha.internal.zzps.zzm(v7_18, v5_36, v4_20);
                                v3_0 = v1_36;
                                v1_27 = v9_14;
                                v9_1 = v14_1;
                                v14_0 = v3_26;
                                v4_5 = p34;
                                v5_2 = v2_25;
                                v2_0 = v7_18;
                            }
                            break;
                        case 8:
                            v9_14 = v1_27;
                            v7_18 = v2_0;
                            v20_0 = v6_5;
                            int v5_35 = v21_12;
                            v2_19 = v24_0;
                            v1_36 = p32;
                            Object v21_2 = v8_9;
                            v8_13 = p36;
                            if (v12_12 != 2) {
                            } else {
                                if (!com.google.android.recaptcha.internal.zzol.zzM(v11_37)) {
                                    v3_26 = (v20_0 | v21_2);
                                    v2_25 = com.google.android.recaptcha.internal.zzku.zzg(p32, v2_19, p36);
                                } else {
                                    v2_25 = com.google.android.recaptcha.internal.zzku.zzi(p32, v2_19, p36);
                                    com.google.android.recaptcha.internal.zznx v11_20 = p36.zza;
                                    if (v11_20 < null) {
                                        throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                    } else {
                                        v3_26 = (v20_0 | v21_2);
                                        if (v11_20 != null) {
                                            p36.zzc = com.google.android.recaptcha.internal.zzpv.zzd(p32, v2_25, v11_20);
                                            v2_25 += v11_20;
                                        } else {
                                            p36.zzc = "";
                                        }
                                    }
                                }
                                v9_14.putObject(v7_18, v5_35, p36.zzc);
                            }
                            break;
                        case 9:
                            com.google.android.recaptcha.internal.zznn v2_22 = v1_27;
                            com.google.android.recaptcha.internal.zznn v1_32 = v2_0;
                            v20_0 = v6_5;
                            com.google.android.recaptcha.internal.zzle v4_16 = v24_0;
                            v13_2 = v26_1;
                            if (v12_12 != 2) {
                                v2_19 = v4_16;
                                v7_14 = p32;
                                v1_30 = v1_32;
                                v8_13 = p36;
                                v5_25 = v2_22;
                                v26_1 = v13_2;
                            } else {
                                v8_10 = (v20_0 | v8_9);
                                int v3_23 = v1_32;
                                com.google.android.recaptcha.internal.zznn v1_34 = v0_0.zzA(v3_23, v13_2);
                                long v7_17 = v3_23;
                                int v9_12 = v2_22;
                                com.google.android.recaptcha.internal.zznn v2_24 = com.google.android.recaptcha.internal.zzku.zzn(v1_34, v0_0.zzx(v13_2), p32, v4_16, p34, p36);
                                v0_0 = v0_0.zzJ(v7_17, v13_2, v1_34);
                                v4_5 = p34;
                                v6_1 = p36;
                                v3_0 = p32;
                                v5_2 = v2_24;
                                v2_0 = v7_17;
                                v1_27 = v9_12;
                                v9_1 = v14_1;
                                v7_12 = v25;
                                v12_3 = -1;
                                v14_0 = v8_10;
                                v8_0 = v13_2;
                            }
                            break;
                        case 10:
                            v2_21 = v1_27;
                            v1_30 = v2_0;
                            v7_14 = p32;
                            v9_5 = p36;
                            v20_0 = v6_5;
                            int v5_30 = v21_12;
                            v4_9 = v24_0;
                            v13_2 = v26_1;
                            if (v12_12 != 2) {
                                v5_25 = v2_21;
                                v2_19 = v4_9;
                                v8_13 = v9_5;
                            } else {
                                v3_17 = (v20_0 | v8_9);
                                v4_10 = com.google.android.recaptcha.internal.zzku.zza(p32, v4_9, p36);
                                v2_21.putObject(v1_30, v5_30, p36.zzc);
                                v2_0 = v1_30;
                                v1_27 = v2_21;
                                v5_2 = v4_10;
                                v6_1 = v9_5;
                                v8_0 = v13_2;
                                v9_1 = v14_1;
                                v12_3 = -1;
                                v4_5 = p34;
                                v14_0 = v3_17;
                                v3_0 = v7_14;
                                v7_12 = v25;
                            }
                            break;
                        case 12:
                            v2_21 = v1_27;
                            v1_30 = v2_0;
                            v7_14 = p32;
                            v9_5 = p36;
                            v20_0 = v6_5;
                            int v5_28 = v21_12;
                            v4_9 = v24_0;
                            v13_2 = v26_1;
                            if (v12_12 != null) {
                            } else {
                                int v3_18 = com.google.android.recaptcha.internal.zzku.zzi(p32, v4_9, p36);
                                com.google.android.recaptcha.internal.zzle v4_12 = p36.zza;
                                java.nio.charset.Charset v12_4 = v0_0.zzw(v13_2);
                                if (((v11_37 & -2147483648) != 0) && ((v12_4 != null) && (!v12_4.zza(v4_12)))) {
                                    com.google.android.recaptcha.internal.zzol.zzd(v1_30).zzj(v15_1, Long.valueOf(((long) v4_12)));
                                    v2_0 = v1_30;
                                    v1_27 = v2_21;
                                    v4_5 = p34;
                                    v5_2 = v3_18;
                                    v3_0 = p32;
                                    v6_1 = p36;
                                    v8_0 = v13_2;
                                    v9_1 = v14_1;
                                    v14_0 = v20_0;
                                    v7_12 = v25;
                                } else {
                                    v8_10 = (v20_0 | v8_9);
                                    v2_21.putInt(v1_30, v5_28, v4_12);
                                    v2_0 = v1_30;
                                    v1_27 = v2_21;
                                    v4_5 = p34;
                                    v5_2 = v3_18;
                                    v3_0 = p32;
                                    v6_1 = p36;
                                }
                            }
                            break;
                        case 15:
                            v2_21 = v1_27;
                            v1_30 = v2_0;
                            v7_14 = p32;
                            v9_5 = p36;
                            v20_0 = v6_5;
                            int v5_27 = v21_12;
                            v4_9 = v24_0;
                            v13_2 = v26_1;
                            if (v12_12 != null) {
                            } else {
                                v3_17 = (v20_0 | v8_9);
                                v4_10 = com.google.android.recaptcha.internal.zzku.zzi(p32, v4_9, p36);
                                v2_21.putInt(v1_30, v5_27, com.google.android.recaptcha.internal.zzli.zzF(p36.zza));
                            }
                            break;
                        case 16:
                            v7_14 = p32;
                            v9_5 = p36;
                            com.google.android.recaptcha.internal.zzle v4_7 = v24_0;
                            v13_2 = v26_1;
                            if (v12_12 != null) {
                                v1_30 = v2_0;
                                v5_25 = v1_27;
                                v2_19 = v4_7;
                                v20_0 = v6_5;
                            } else {
                                v8_10 = (v8_9 | v6_5);
                                com.google.android.recaptcha.internal.zznx v11_15 = com.google.android.recaptcha.internal.zzku.zzl(p32, v4_7, p36);
                                v1_27.putLong(v2_0, v21_12, com.google.android.recaptcha.internal.zzli.zzG(p36.zzb));
                                v4_5 = p34;
                                v3_0 = p32;
                                v6_1 = p36;
                                v5_2 = v11_15;
                            }
                            break;
                        default:
                            if (v12_12 != 3) {
                                v7_14 = p32;
                                v8_13 = p36;
                                v5_25 = v1_27;
                                v1_30 = v2_0;
                                v20_0 = v6_5;
                                v2_19 = v24_0;
                            } else {
                                v11_23 = (v6_5 | v8_9);
                                long v7_21 = v26_1;
                                int v3_36 = v0_0.zzA(v2_0, v7_21);
                                String v13_4 = v7_21;
                                com.google.android.recaptcha.internal.zzle v4_25 = com.google.android.recaptcha.internal.zzku.zzm(v3_36, v0_0.zzx(v7_21), p32, v24_0, p34, ((v25 << 3) | 4), p36);
                                v0_0 = v0_0.zzJ(v2_0, v13_4, v3_36);
                                v5_2 = v4_25;
                                v3_0 = p32;
                                v6_1 = p36;
                                v8_0 = v13_4;
                                v9_1 = v14_1;
                                v7_12 = v25;
                                v12_3 = -1;
                                v4_5 = p34;
                            }
                    }
                    v14_0 = v11_23;
                }
            } else {
                v7_11 = p35;
                v11_0 = p36;
                v23_0 = v1_27;
                v13_0 = v2_0;
                v10_2 = v3_0;
                v3_7 = v6_21;
                v26_0 = v9_1;
                v9_3 = v15_1;
                v1_26 = 1;
                v8_0 = 0;
                v15_0 = v5_57;
            }
        }
        v7_11 = p35;
        v23_0 = v1_27;
        v13_0 = v2_0;
        v26_0 = v9_1;
        v9_22 = v4_5;
        v6_19 = v5_2;
    }

    public final Object zze()
    {
        return ((com.google.android.recaptcha.internal.zznd) this.zzg).zzv();
    }

    public final void zzf(Object p8)
    {
        if (com.google.android.recaptcha.internal.zzol.zzQ(p8)) {
            int v1 = 0;
            if ((p8 instanceof com.google.android.recaptcha.internal.zznd)) {
                ((com.google.android.recaptcha.internal.zznd) p8).zzJ(2147483647);
                ((com.google.android.recaptcha.internal.zznd) p8).zza = 0;
                ((com.google.android.recaptcha.internal.zznd) p8).zzH();
            }
            com.google.android.recaptcha.internal.zzmp v0_1 = this.zzc;
            while (v1 < v0_1.length) {
                sun.misc.Unsafe v2_1 = this.zzu(v1);
                Object v3_1 = (1048575 & v2_1);
                sun.misc.Unsafe v2_2 = com.google.android.recaptcha.internal.zzol.zzt(v2_1);
                Object v3_2 = ((long) v3_1);
                if (v2_2 == 9) {
                    if (this.zzN(p8, v1)) {
                        this.zzx(v1).zzf(com.google.android.recaptcha.internal.zzol.zzb.getObject(p8, v3_2));
                    }
                } else {
                    if ((v2_2 == 60) || (v2_2 == 68)) {
                        if (this.zzR(p8, this.zzc[v1], v1)) {
                            this.zzx(v1).zzf(com.google.android.recaptcha.internal.zzol.zzb.getObject(p8, v3_2));
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
                                ((com.google.android.recaptcha.internal.zznk) com.google.android.recaptcha.internal.zzps.zzf(p8, v3_2)).zzb();
                                break;
                            case 50:
                                sun.misc.Unsafe v2_7 = com.google.android.recaptcha.internal.zzol.zzb;
                                Object v5_4 = v2_7.getObject(p8, v3_2);
                                if (v5_4 != null) {
                                    ((com.google.android.recaptcha.internal.zzoc) v5_4).zzc();
                                    v2_7.putObject(p8, v3_2, v5_4);
                                }
                                break;
                            default:
                        }
                    }
                }
                v1 += 3;
            }
            this.zzm.zzi(p8);
            if (this.zzh) {
                this.zzn.zza(p8);
            }
        }
        return;
    }

    public final void zzg(Object p9, Object p10)
    {
        com.google.android.recaptcha.internal.zzol.zzD(p9);
        p10.getClass();
        int v0_1 = 0;
        while (v0_1 < this.zzc.length) {
            com.google.android.recaptcha.internal.zznk v1_11 = this.zzu(v0_1);
            int v3_1 = this.zzc[v0_1];
            long v4 = ((long) (1048575 & v1_11));
            switch (com.google.android.recaptcha.internal.zzol.zzt(v1_11)) {
                case 0:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzo(p9, v4, com.google.android.recaptcha.internal.zzps.zza(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 1:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzp(p9, v4, com.google.android.recaptcha.internal.zzps.zzb(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 2:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzr(p9, v4, com.google.android.recaptcha.internal.zzps.zzd(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 3:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzr(p9, v4, com.google.android.recaptcha.internal.zzps.zzd(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 4:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzq(p9, v4, com.google.android.recaptcha.internal.zzps.zzc(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 5:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzr(p9, v4, com.google.android.recaptcha.internal.zzps.zzd(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 6:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzq(p9, v4, com.google.android.recaptcha.internal.zzps.zzc(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 7:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzm(p9, v4, com.google.android.recaptcha.internal.zzps.zzw(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 8:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzs(p9, v4, com.google.android.recaptcha.internal.zzps.zzf(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 9:
                    this.zzE(p9, p10, v0_1);
                    break;
                case 10:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzs(p9, v4, com.google.android.recaptcha.internal.zzps.zzf(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 11:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzq(p9, v4, com.google.android.recaptcha.internal.zzps.zzc(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 12:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzq(p9, v4, com.google.android.recaptcha.internal.zzps.zzc(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 13:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzq(p9, v4, com.google.android.recaptcha.internal.zzps.zzc(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 14:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzr(p9, v4, com.google.android.recaptcha.internal.zzps.zzd(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 15:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzq(p9, v4, com.google.android.recaptcha.internal.zzps.zzc(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 16:
                    if (!this.zzN(p10, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzr(p9, v4, com.google.android.recaptcha.internal.zzps.zzd(p10, v4));
                        this.zzH(p9, v0_1);
                    }
                    break;
                case 17:
                    this.zzE(p9, p10, v0_1);
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
                    com.google.android.recaptcha.internal.zznk v1_34 = ((com.google.android.recaptcha.internal.zznk) com.google.android.recaptcha.internal.zzps.zzf(p9, v4));
                    Object v2_4 = ((com.google.android.recaptcha.internal.zznk) com.google.android.recaptcha.internal.zzps.zzf(p10, v4));
                    int v3_2 = v1_34.size();
                    int v6_0 = v2_4.size();
                    if ((v3_2 > 0) && (v6_0 > 0)) {
                        if (!v1_34.zzc()) {
                            v1_34 = v1_34.zzd((v6_0 + v3_2));
                        }
                        v1_34.addAll(v2_4);
                    }
                    if (v3_2 > 0) {
                        v2_4 = v1_34;
                    }
                    com.google.android.recaptcha.internal.zzps.zzs(p9, v4, v2_4);
                    break;
                case 50:
                    com.google.android.recaptcha.internal.zzps.zzs(p9, v4, com.google.android.recaptcha.internal.zzod.zzb(com.google.android.recaptcha.internal.zzps.zzf(p9, v4), com.google.android.recaptcha.internal.zzps.zzf(p10, v4)));
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
                    if (!this.zzR(p10, v3_1, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzs(p9, v4, com.google.android.recaptcha.internal.zzps.zzf(p10, v4));
                        this.zzI(p9, v3_1, v0_1);
                    }
                    break;
                case 60:
                    this.zzF(p9, p10, v0_1);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!this.zzR(p10, v3_1, v0_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzps.zzs(p9, v4, com.google.android.recaptcha.internal.zzps.zzf(p10, v4));
                        this.zzI(p9, v3_1, v0_1);
                    }
                    break;
                case 68:
                    this.zzF(p9, p10, v0_1);
                    break;
                default:
            }
            v0_1 += 3;
        }
        com.google.android.recaptcha.internal.zzoy.zzq(this.zzm, p9, p10);
        if (this.zzh) {
            com.google.android.recaptcha.internal.zzoy.zzp(this.zzn, p9, p10);
        }
        return;
    }

    public final void zzh(Object p13, com.google.android.recaptcha.internal.zzov p14, com.google.android.recaptcha.internal.zzmo p15)
    {
        p15.getClass();
        com.google.android.recaptcha.internal.zzol.zzD(p13);
        boolean v5_0 = this.zzm;
        Throwable v0_0 = 0;
        boolean v4_15 = 0;
        com.google.android.recaptcha.internal.zzmt v7 = 0;
        try {
            while(true) {
                com.google.android.recaptcha.internal.zznb v2_0;
                com.google.android.recaptcha.internal.zzoi v3_0;
                boolean v6_0;
                com.google.android.recaptcha.internal.zznb v2_4 = p14.zzc();
                boolean v1_0 = this.zzq(v2_4);
                p13 = v2_0;
            }
            int v14_2 = this.zzk;
        } catch (Throwable v0_0) {
            v2_0 = p13;
            v1_0 = v4_15;
            p13 = this;
            int v14_1 = v0_0;
            v4_15 = v1_0;
            int[] v15_10 = p13.zzk;
        }
        if (v1_0) {
            v3_0 = p13;
            v6_0 = v5_0;
            p13 = this;
            v5_0 = v4_15;
            try {
                boolean v4_11 = this.zzu(v1_0);
                try {
                    switch (com.google.android.recaptcha.internal.zzol.zzt(v4_11)) {
                        case 0:
                            Integer v9_52 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzo(p13, ((long) (v4_11 & 1048575)), p14.zza());
                            this.zzH(p13, v9_52);
                            v4_15 = v1_0;
                            break;
                        case 1:
                            Integer v9_50 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzp(p13, ((long) (v4_11 & 1048575)), p14.zzb());
                            this.zzH(p13, v9_50);
                            break;
                        case 2:
                            Integer v9_49 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzr(p13, ((long) (v4_11 & 1048575)), p14.zzl());
                            this.zzH(p13, v9_49);
                            break;
                        case 3:
                            Integer v9_48 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzr(p13, ((long) (v4_11 & 1048575)), p14.zzo());
                            this.zzH(p13, v9_48);
                            break;
                        case 4:
                            Integer v9_47 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzq(p13, ((long) (v4_11 & 1048575)), p14.zzg());
                            this.zzH(p13, v9_47);
                            break;
                        case 5:
                            Integer v9_46 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzr(p13, ((long) (v4_11 & 1048575)), p14.zzk());
                            this.zzH(p13, v9_46);
                            break;
                        case 6:
                            Integer v9_44 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzq(p13, ((long) (v4_11 & 1048575)), p14.zzf());
                            this.zzH(p13, v9_44);
                            break;
                        case 7:
                            Integer v9_43 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzm(p13, ((long) (v4_11 & 1048575)), p14.zzN());
                            this.zzH(p13, v9_43);
                            break;
                        case 8:
                            Integer v9_41 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            this.zzG(p13, v4_11, p14);
                            this.zzH(p13, v9_41);
                            break;
                        case 9:
                            Integer v9_40 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzoi v3_93 = ((com.google.android.recaptcha.internal.zzoi) this.zzA(p13, v9_40));
                            p14.zzu(v3_93, this.zzx(v9_40), p15);
                            this.zzJ(p13, v9_40, v3_93);
                            break;
                        case 10:
                            Integer v9_39 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), p14.zzp());
                            this.zzH(p13, v9_39);
                            break;
                        case 11:
                            Integer v9_38 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzq(p13, ((long) (v4_11 & 1048575)), p14.zzj());
                            this.zzH(p13, v9_38);
                            break;
                        case 12:
                            com.google.android.recaptcha.internal.zzoi v3_87 = v2_4;
                            v2_0 = p13;
                            Integer v9_37 = v1_0;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            boolean v6_2 = p14.zze();
                            boolean v11_0 = this.zzw(v9_37);
                            if (v11_0) {
                                if (!v11_0.zza(v6_2)) {
                                    v4_15 = com.google.android.recaptcha.internal.zzoy.zzo(p13, v3_87, v6_2, v1_0, v5_0);
                                } else {
                                }
                            }
                            com.google.android.recaptcha.internal.zzps.zzq(p13, ((long) (v4_11 & 1048575)), v6_2);
                            this.zzH(p13, v9_37);
                            break;
                        case 13:
                            Integer v9_34 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzq(p13, ((long) (v4_11 & 1048575)), p14.zzh());
                            this.zzH(p13, v9_34);
                            break;
                        case 14:
                            Integer v9_33 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzr(p13, ((long) (v4_11 & 1048575)), p14.zzm());
                            this.zzH(p13, v9_33);
                            break;
                        case 15:
                            Integer v9_31 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzq(p13, ((long) (v4_11 & 1048575)), p14.zzi());
                            this.zzH(p13, v9_31);
                            break;
                        case 16:
                            Integer v9_30 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzps.zzr(p13, ((long) (v4_11 & 1048575)), p14.zzn());
                            this.zzH(p13, v9_30);
                            break;
                        case 17:
                            Integer v9_29 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            com.google.android.recaptcha.internal.zzoi v3_80 = ((com.google.android.recaptcha.internal.zzoi) this.zzA(p13, v9_29));
                            p14.zzt(v3_80, this.zzx(v9_29), p15);
                            this.zzJ(p13, v9_29, v3_80);
                            break;
                        case 18:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzx(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 19:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzB(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 20:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzE(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 21:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzM(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 22:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzD(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 23:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzA(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 24:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzz(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 25:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzv(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 26:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            if (!com.google.android.recaptcha.internal.zzol.zzM(v4_11)) {
                                ((com.google.android.recaptcha.internal.zzlj) p14).zzK(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))), 0);
                            } else {
                                ((com.google.android.recaptcha.internal.zzlj) p14).zzK(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))), 1);
                            }
                            break;
                        case 27:
                            Integer v9_25 = v1_0;
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzF(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))), this.zzx(v9_25), p15);
                            break;
                        case 28:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzw(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 29:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzL(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 30:
                            Integer v9_22 = v1_0;
                            boolean v1_18 = v5_0;
                            boolean v5_1 = v6_0;
                            try {
                                boolean v4_20 = com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575)));
                                p14.zzy(v4_20);
                                v6_0 = v5_1;
                                v5_0 = v1_18;
                                v1_0 = p13;
                                com.google.android.recaptcha.internal.zzoi v3_40 = v4_20;
                            } catch (com.google.android.recaptcha.internal.zznm) {
                                v2_0 = v3_40;
                                v4_15 = v1_0;
                                if (!v4_15) {
                                    v4_15 = v5_0.zza(v2_0);
                                }
                                if (v5_0.zzk(v4_15, p14, 0)) {
                                }
                            } catch (Throwable v0_0) {
                                v2_0 = v3_40;
                            }
                            v4_15 = com.google.android.recaptcha.internal.zzoy.zzn(p13, v2_4, v3_40, this.zzw(v9_22), v5_0, v6_0);
                            v2_0 = p13;
                            v5_0 = v6_0;
                            break;
                        case 31:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzG(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 32:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzH(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 33:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzI(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 34:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzJ(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 35:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzx(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 36:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzB(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 37:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzE(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 38:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzM(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 39:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzD(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 40:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzA(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 41:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzz(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 42:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzv(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 43:
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            p14.zzL(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 44:
                            boolean v4_13 = com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575)));
                            p14.zzy(v4_13);
                            Integer v9_20 = v1_0;
                            v1_0 = p13;
                            v3_0 = v4_13;
                            v4_15 = com.google.android.recaptcha.internal.zzoy.zzn(p13, v2_4, v3_0, this.zzw(v9_20), v5_0, v6_0);
                            v2_0 = p13;
                            v5_0 = v6_0;
                            break;
                        case 45:
                            p14.zzG(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            v2_0 = p13;
                            v1_0 = v5_0;
                            v5_0 = v6_0;
                            break;
                        case 46:
                            p14.zzH(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 47:
                            p14.zzI(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 48:
                            p14.zzJ(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))));
                            break;
                        case 49:
                            p14.zzC(com.google.android.recaptcha.internal.zznv.zza(p13, ((long) (v4_11 & 1048575))), this.zzx(v1_0), p15);
                            break;
                        case 50:
                            com.google.android.recaptcha.internal.zznb v2_1 = this.zzz(v1_0);
                            Integer v9_16 = ((long) (this.zzu(v1_0) & 1048575));
                            boolean v1_3 = com.google.android.recaptcha.internal.zzps.zzf(p13, v9_16);
                            if (!v1_3) {
                                com.google.android.recaptcha.internal.zzps.zzs(p13, v9_16, com.google.android.recaptcha.internal.zzoc.zza().zzb());
                            } else {
                                if (com.google.android.recaptcha.internal.zzod.zza(v1_3)) {
                                    boolean v4_10 = com.google.android.recaptcha.internal.zzoc.zza().zzb();
                                    com.google.android.recaptcha.internal.zzod.zzb(v4_10, v1_3);
                                    com.google.android.recaptcha.internal.zzps.zzs(p13, v9_16, v4_10);
                                }
                            }
                            com.google.android.recaptcha.internal.zznb v2 = ((com.google.android.recaptcha.internal.zzob) v2_1);
                            throw v0_0;
                            break;
                        case 51:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Double.valueOf(p14.zza()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 52:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Float.valueOf(p14.zzb()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 53:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Long.valueOf(p14.zzl()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 54:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Long.valueOf(p14.zzo()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 55:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Integer.valueOf(p14.zzg()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 56:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Long.valueOf(p14.zzk()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 57:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Integer.valueOf(p14.zzf()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 58:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Boolean.valueOf(p14.zzN()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 59:
                            this.zzG(p13, v4_11, p14);
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 60:
                            boolean v4_59 = ((com.google.android.recaptcha.internal.zzoi) this.zzB(p13, v2_4, v1_0));
                            p14.zzu(v4_59, this.zzx(v1_0), p15);
                            this.zzK(p13, v2_4, v1_0, v4_59);
                            break;
                        case 61:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), p14.zzp());
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 62:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Integer.valueOf(p14.zzj()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 63:
                            Integer v9_51 = p14.zze();
                            boolean v11_2 = this.zzw(v1_0);
                            if (v11_2) {
                                if (!v11_2.zza(v9_51)) {
                                    v4_15 = com.google.android.recaptcha.internal.zzoy.zzo(p13, v2_4, v9_51, v5_0, v6_0);
                                    p13 = v3_0;
                                    v5_0 = v6_0;
                                } else {
                                }
                            }
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Integer.valueOf(v9_51));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 64:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Integer.valueOf(p14.zzh()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 65:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Long.valueOf(p14.zzm()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 66:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Integer.valueOf(p14.zzi()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 67:
                            com.google.android.recaptcha.internal.zzps.zzs(p13, ((long) (v4_11 & 1048575)), Long.valueOf(p14.zzn()));
                            this.zzI(p13, v2_4, v1_0);
                            break;
                        case 68:
                            boolean v4_17 = ((com.google.android.recaptcha.internal.zzoi) this.zzB(p13, v2_4, v1_0));
                            p14.zzt(v4_17, this.zzx(v1_0), p15);
                            this.zzK(p13, v2_4, v1_0, v4_17);
                            break;
                        default:
                            if (v5_0) {
                                v4_15 = v5_0;
                            } else {
                                v4_15 = v6_0.zza(p13);
                            }
                            try {
                                v1_0 = v6_0.zzk(v4_15, p14, 0);
                            } catch (com.google.android.recaptcha.internal.zznm) {
                                v2_0 = p13;
                                v5_0 = v6_0;
                            } catch (Throwable v0_2) {
                                v14_1 = v0_2;
                                v2_0 = v3_0;
                                v5_0 = v6_0;
                            }
                            if (v1_0) {
                            } else {
                                int v14_3 = this.zzk;
                                while (v14_3 < this.zzl) {
                                    boolean v5_2 = v6_0;
                                    com.google.android.recaptcha.internal.zznb v2_5 = v3_0;
                                    this.zzy(v2_5, this.zzj[v14_3], v4_15, v5_2, v3_0);
                                    v3_0 = v2_5;
                                    v6_0 = v5_2;
                                    v14_3++;
                                }
                                v2_0 = v3_0;
                                v5_0 = v6_0;
                            }
                    }
                } catch (com.google.android.recaptcha.internal.zznm) {
                    v2_0 = v3_0;
                    v1_0 = v5_0;
                    v5_0 = v6_0;
                } catch (com.google.android.recaptcha.internal.zznm) {
                } catch (Throwable v0_1) {
                    v14_1 = v0_1;
                    v2_0 = v3_0;
                    v1_0 = v5_0;
                    v5_0 = v6_0;
                } catch (com.google.android.recaptcha.internal.zznm) {
                    v2_0 = v1_0;
                } catch (Throwable v0_0) {
                    v2_0 = v1_0;
                    v1_0 = v5_0;
                    v5_0 = v6_0;
                }
            } catch (Throwable v0_0) {
                v2_0 = v3_0;
            }
        } else {
            if (v2_4 != 2147483647) {
                v1_0 = this;
                v6_0 = v5_0;
                v5_0 = v4_15;
                try {
                    com.google.android.recaptcha.internal.zznb v2_6;
                    if (this.zzh) {
                        v2_6 = p15.zza(this.zzg, v2_4);
                    } else {
                        v2_6 = v0_0;
                    }
                } catch (Throwable v0_1) {
                    v3_0 = p13;
                    p13 = this;
                }
                if (v2_6 == null) {
                    if (v5_0) {
                        v4_15 = v5_0;
                    } else {
                        v4_15 = v6_0.zza(p13);
                    }
                    try {
                        if (v6_0.zzk(v4_15, p14, 0)) {
                            v3_0 = p13;
                        } else {
                            int v14_4 = this.zzk;
                            while (v14_4 < this.zzl) {
                                boolean v5_3 = v6_0;
                                this.zzy(p13, this.zzj[v14_4], v4_15, v5_3, p13);
                                v6_0 = v5_3;
                                v14_4++;
                            }
                            v3_0 = p13;
                        }
                    } catch (Throwable v0_2) {
                        v3_0 = p13;
                        p13 = this;
                    }
                } else {
                    if (v7 == null) {
                        v7 = ((com.google.android.recaptcha.internal.zzna) p13).zzi();
                    }
                    com.google.android.recaptcha.internal.zzoi v3_116 = v2_6.zza.zzb;
                    if (v3_116 == com.google.android.recaptcha.internal.zzpw.zzn) {
                        p14.zzg();
                        throw v0_0;
                    } else {
                        com.google.android.recaptcha.internal.zzoi v3_119;
                        switch (v3_116.ordinal()) {
                            case 0:
                                v3_119 = Double.valueOf(p14.zza());
                                boolean v4_53 = v2_6.zza.zzb.ordinal();
                                if ((v4_53 == 9) || (v4_53 == 10)) {
                                    boolean v4_55 = v7.zze(v2_6.zza);
                                    if (v4_55) {
                                        v3_119 = ((com.google.android.recaptcha.internal.zzoi) v4_55).zzae().zzc(((com.google.android.recaptcha.internal.zzoi) v3_119)).zzl();
                                    }
                                } else {
                                }
                                v7.zzi(v2_6.zza, v3_119);
                                break;
                            case 1:
                                v3_119 = Float.valueOf(p14.zzb());
                                break;
                            case 2:
                                v3_119 = Long.valueOf(p14.zzl());
                                break;
                            case 3:
                                v3_119 = Long.valueOf(p14.zzo());
                                break;
                            case 4:
                                v3_119 = Integer.valueOf(p14.zzg());
                                break;
                            case 5:
                                v3_119 = Long.valueOf(p14.zzk());
                                break;
                            case 6:
                                v3_119 = Integer.valueOf(p14.zzf());
                                break;
                            case 7:
                                v3_119 = Boolean.valueOf(p14.zzN());
                                break;
                            case 8:
                                v3_119 = p14.zzr();
                                break;
                            case 9:
                                com.google.android.recaptcha.internal.zzoi v3_127 = v7.zze(v2_6.zza);
                                if (!(v3_127 instanceof com.google.android.recaptcha.internal.zznd)) {
                                    throw v0_0;
                                } else {
                                    boolean v4_49 = com.google.android.recaptcha.internal.zzos.zza().zzb(v3_127.getClass());
                                    if (!((com.google.android.recaptcha.internal.zznd) v3_127).zzL()) {
                                        byte[] v8_10 = v4_49.zze();
                                        v4_49.zzg(v8_10, v3_127);
                                        v7.zzi(v2_6.zza, v8_10);
                                        v3_127 = v8_10;
                                    }
                                    p14.zzt(v3_127, v4_49, p15);
                                }
                                break;
                            case 10:
                                com.google.android.recaptcha.internal.zzoi v3_125 = v7.zze(v2_6.zza);
                                if (!(v3_125 instanceof com.google.android.recaptcha.internal.zznd)) {
                                    throw v0_0;
                                } else {
                                    boolean v4_46 = com.google.android.recaptcha.internal.zzos.zza().zzb(v3_125.getClass());
                                    if (!((com.google.android.recaptcha.internal.zznd) v3_125).zzL()) {
                                        byte[] v8_5 = v4_46.zze();
                                        v4_46.zzg(v8_5, v3_125);
                                        v7.zzi(v2_6.zza, v8_5);
                                        v3_125 = v8_5;
                                    }
                                    p14.zzu(v3_125, v4_46, p15);
                                }
                                break;
                            case 11:
                                v3_119 = p14.zzp();
                                break;
                            case 12:
                                v3_119 = Integer.valueOf(p14.zzj());
                                break;
                            case 13:
                                throw new IllegalStateException("Shouldn\'t reach here.");
                                break;
                            case 14:
                                v3_119 = Integer.valueOf(p14.zzh());
                                break;
                            case 15:
                                v3_119 = Long.valueOf(p14.zzm());
                                break;
                            case 16:
                                v3_119 = Integer.valueOf(p14.zzi());
                                break;
                            case 17:
                                v3_119 = Long.valueOf(p14.zzn());
                                break;
                            default:
                                v3_119 = v0_0;
                        }
                        v4_15 = v5_0;
                    }
                }
            } else {
                int v14_6 = this.zzk;
                while (v14_6 < this.zzl) {
                    this.zzy(p13, this.zzj[v14_6], v4_15, v5_0, p13);
                    v14_6++;
                }
                v2_0 = p13;
            }
        }
        if (v4_15) {
            v5_0.zzj(v2_0, v4_15);
        }
        return;
    }

    public final void zzi(Object p8, byte[] p9, int p10, int p11, com.google.android.recaptcha.internal.zzkt p12)
    {
        this.zzc(p8, p9, p10, p11, 0, p12);
        return;
    }

    public final void zzj(Object p21, com.google.android.recaptcha.internal.zzpy p22)
    {
        java.util.Iterator v8;
        int v3_1;
        int v0_0 = this;
        if (!this.zzh) {
            v3_1 = 0;
            v8 = 0;
        } else {
            int v2_8 = ((com.google.android.recaptcha.internal.zzna) p21).zzb;
            if (v2_8.zza.isEmpty()) {
            } else {
                int v2_0 = v2_8.zzf();
                v3_1 = ((java.util.Map$Entry) v2_0.next());
                v8 = v2_0;
            }
        }
        int[] v9 = this.zzc;
        sun.misc.Unsafe v10 = com.google.android.recaptcha.internal.zzol.zzb;
        int v2_1 = 0;
        int v4_0 = 1048575;
        Object v5_34 = 0;
        while (v2_1 < v9.length) {
            Object v5_110;
            int v3_4;
            int v18;
            int v4_1;
            int v11_0;
            int v13_6 = v0_0.zzu(v2_1);
            Object v14_28 = v0_0.zzc;
            com.google.android.recaptcha.internal.zzlo v15_4 = com.google.android.recaptcha.internal.zzol.zzt(v13_6);
            java.util.List v7_64 = v14_28[v2_1];
            if (v15_4 > 17) {
                v18 = 1;
                v11_0 = v3_1;
                v3_4 = v4_0;
                v4_1 = v5_34;
                v5_110 = 0;
            } else {
                com.google.android.recaptcha.internal.zzow v12_20 = v14_28[(v2_1 + 2)];
                Object v14_32 = (v12_20 & 1048575);
                if (v14_32 == v4_0) {
                    v18 = 1;
                } else {
                    v18 = 1;
                    if (v14_32 != 1048575) {
                        v5_34 = v10.getInt(p21, ((long) v14_32));
                    } else {
                        v5_34 = 0;
                    }
                    v4_0 = v14_32;
                }
                v11_0 = v3_1;
                v3_4 = v4_0;
                v4_1 = v5_34;
                v5_110 = (v18 << (v12_20 >> 20));
            }
            while ((v11_0 != 0) && (((com.google.android.recaptcha.internal.zznb) v11_0.getKey()).zza <= v7_64)) {
                v0_0.zzn.zzb(p22, v11_0);
                if (!v8.hasNext()) {
                    v11_0 = 0;
                } else {
                    v11_0 = ((java.util.Map$Entry) v8.next());
                }
            }
            com.google.android.recaptcha.internal.zzow v12_27 = ((long) (v13_6 & 1048575));
            switch (v15_4) {
                case 0:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzf(v7_64, com.google.android.recaptcha.internal.zzps.zza(p21, v12_27));
                    }
                    break;
                case 1:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                        v0_0 = this;
                    } else {
                        p22.zzo(v7_64, com.google.android.recaptcha.internal.zzps.zzb(p21, v12_27));
                    }
                    break;
                case 2:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzt(v7_64, v10.getLong(p21, v12_27));
                    }
                    break;
                case 3:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzK(v7_64, v10.getLong(p21, v12_27));
                    }
                    break;
                case 4:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzr(v7_64, v10.getInt(p21, v12_27));
                    }
                    break;
                case 5:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzm(v7_64, v10.getLong(p21, v12_27));
                    }
                    break;
                case 6:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzk(v7_64, v10.getInt(p21, v12_27));
                    }
                    break;
                case 7:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzb(v7_64, com.google.android.recaptcha.internal.zzps.zzw(p21, v12_27));
                    }
                    break;
                case 8:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        com.google.android.recaptcha.internal.zzol.zzT(v7_64, v10.getObject(p21, v12_27), p22);
                    }
                    break;
                case 9:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzv(v7_64, v10.getObject(p21, v12_27), v0_0.zzx(v2_1));
                    }
                    break;
                case 10:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzd(v7_64, ((com.google.android.recaptcha.internal.zzle) v10.getObject(p21, v12_27)));
                    }
                    break;
                case 11:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzI(v7_64, v10.getInt(p21, v12_27));
                    }
                    break;
                case 12:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzi(v7_64, v10.getInt(p21, v12_27));
                    }
                    break;
                case 13:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzx(v7_64, v10.getInt(p21, v12_27));
                    }
                    break;
                case 14:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzz(v7_64, v10.getLong(p21, v12_27));
                    }
                    break;
                case 15:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzB(v7_64, v10.getInt(p21, v12_27));
                    }
                    break;
                case 16:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzD(v7_64, v10.getLong(p21, v12_27));
                    }
                    break;
                case 17:
                    if (!v0_0.zzO(p21, v2_1, v3_4, v4_1, v5_110)) {
                    } else {
                        p22.zzq(v7_64, v10.getObject(p21, v12_27), v0_0.zzx(v2_1));
                    }
                    break;
                case 18:
                    com.google.android.recaptcha.internal.zzoy.zzs(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 19:
                    com.google.android.recaptcha.internal.zzoy.zzw(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 20:
                    com.google.android.recaptcha.internal.zzoy.zzy(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 21:
                    com.google.android.recaptcha.internal.zzoy.zzE(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 22:
                    com.google.android.recaptcha.internal.zzoy.zzx(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 23:
                    com.google.android.recaptcha.internal.zzoy.zzv(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 24:
                    com.google.android.recaptcha.internal.zzoy.zzu(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 25:
                    com.google.android.recaptcha.internal.zzoy.zzr(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 26:
                    java.util.List v7_47 = ((java.util.List) v10.getObject(p21, v12_27));
                    if ((v7_47 == null) || (v7_47.isEmpty())) {
                    } else {
                        p22.zzH(v0_0.zzc[v2_1], v7_47);
                    }
                    break;
                case 27:
                    Object v5_75 = v0_0.zzc[v2_1];
                    java.util.List v7_45 = ((java.util.List) v10.getObject(p21, v12_27));
                    com.google.android.recaptcha.internal.zzow v12_9 = v0_0.zzx(v2_1);
                    if ((v7_45 == null) || (v7_45.isEmpty())) {
                    } else {
                        Object v14_22 = 0;
                        while (v14_22 < v7_45.size()) {
                            ((com.google.android.recaptcha.internal.zzlo) p22).zzv(v5_75, v7_45.get(v14_22), v12_9);
                            v14_22++;
                        }
                    }
                    break;
                case 28:
                    java.util.List v7_43 = ((java.util.List) v10.getObject(p21, v12_27));
                    if ((v7_43 == null) || (v7_43.isEmpty())) {
                    } else {
                        p22.zze(v0_0.zzc[v2_1], v7_43);
                    }
                    break;
                case 29:
                    com.google.android.recaptcha.internal.zzoy.zzD(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 30:
                    com.google.android.recaptcha.internal.zzoy.zzt(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 31:
                    com.google.android.recaptcha.internal.zzoy.zzz(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 32:
                    com.google.android.recaptcha.internal.zzoy.zzA(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 33:
                    com.google.android.recaptcha.internal.zzoy.zzB(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 34:
                    com.google.android.recaptcha.internal.zzoy.zzC(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, 0);
                    break;
                case 35:
                    com.google.android.recaptcha.internal.zzoy.zzs(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 36:
                    com.google.android.recaptcha.internal.zzoy.zzw(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 37:
                    com.google.android.recaptcha.internal.zzoy.zzy(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 38:
                    com.google.android.recaptcha.internal.zzoy.zzE(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 39:
                    com.google.android.recaptcha.internal.zzoy.zzx(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 40:
                    com.google.android.recaptcha.internal.zzoy.zzv(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 41:
                    com.google.android.recaptcha.internal.zzoy.zzu(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 42:
                    com.google.android.recaptcha.internal.zzoy.zzr(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 43:
                    com.google.android.recaptcha.internal.zzoy.zzD(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 44:
                    com.google.android.recaptcha.internal.zzoy.zzt(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 45:
                    com.google.android.recaptcha.internal.zzoy.zzz(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 46:
                    com.google.android.recaptcha.internal.zzoy.zzA(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 47:
                    com.google.android.recaptcha.internal.zzoy.zzB(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 48:
                    com.google.android.recaptcha.internal.zzoy.zzC(v0_0.zzc[v2_1], ((java.util.List) v10.getObject(p21, v12_27)), p22, v18);
                    break;
                case 49:
                    Object v5_30 = v0_0.zzc[v2_1];
                    java.util.List v7_1 = ((java.util.List) v10.getObject(p21, v12_27));
                    com.google.android.recaptcha.internal.zzow v12_7 = v0_0.zzx(v2_1);
                    if ((v7_1 == null) || (v7_1.isEmpty())) {
                    } else {
                        int v13_1 = 0;
                        while (v13_1 < v7_1.size()) {
                            ((com.google.android.recaptcha.internal.zzlo) p22).zzq(v5_30, v7_1.get(v13_1), v12_7);
                            v13_1++;
                        }
                    }
                    break;
                case 50:
                    if (v10.getObject(p21, v12_27) != null) {
                        v0_0.zzz(v2_1);
                        throw 0;
                    }
                    break;
                case 51:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzf(v7_64, com.google.android.recaptcha.internal.zzol.zzn(p21, v12_27));
                    }
                    break;
                case 52:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzo(v7_64, com.google.android.recaptcha.internal.zzol.zzo(p21, v12_27));
                    }
                    break;
                case 53:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzt(v7_64, com.google.android.recaptcha.internal.zzol.zzv(p21, v12_27));
                    }
                    break;
                case 54:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzK(v7_64, com.google.android.recaptcha.internal.zzol.zzv(p21, v12_27));
                    }
                    break;
                case 55:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzr(v7_64, com.google.android.recaptcha.internal.zzol.zzp(p21, v12_27));
                    }
                    break;
                case 56:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzm(v7_64, com.google.android.recaptcha.internal.zzol.zzv(p21, v12_27));
                    }
                    break;
                case 57:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzk(v7_64, com.google.android.recaptcha.internal.zzol.zzp(p21, v12_27));
                    }
                    break;
                case 58:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzb(v7_64, com.google.android.recaptcha.internal.zzol.zzS(p21, v12_27));
                    }
                    break;
                case 59:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        com.google.android.recaptcha.internal.zzol.zzT(v7_64, v10.getObject(p21, v12_27), p22);
                    }
                    break;
                case 60:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzv(v7_64, v10.getObject(p21, v12_27), v0_0.zzx(v2_1));
                    }
                    break;
                case 61:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzd(v7_64, ((com.google.android.recaptcha.internal.zzle) v10.getObject(p21, v12_27)));
                    }
                    break;
                case 62:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzI(v7_64, com.google.android.recaptcha.internal.zzol.zzp(p21, v12_27));
                    }
                    break;
                case 63:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzi(v7_64, com.google.android.recaptcha.internal.zzol.zzp(p21, v12_27));
                    }
                    break;
                case 64:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzx(v7_64, com.google.android.recaptcha.internal.zzol.zzp(p21, v12_27));
                    }
                    break;
                case 65:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzz(v7_64, com.google.android.recaptcha.internal.zzol.zzv(p21, v12_27));
                    }
                    break;
                case 66:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzB(v7_64, com.google.android.recaptcha.internal.zzol.zzp(p21, v12_27));
                    }
                    break;
                case 67:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzD(v7_64, com.google.android.recaptcha.internal.zzol.zzv(p21, v12_27));
                    }
                    break;
                case 68:
                    if (!v0_0.zzR(p21, v7_64, v2_1)) {
                    } else {
                        p22.zzq(v7_64, v10.getObject(p21, v12_27), v0_0.zzx(v2_1));
                    }
                    break;
                default:
            }
            v2_1 += 3;
            v5_34 = v4_1;
            v4_0 = v3_4;
            v3_1 = v11_0;
        }
        while (v3_1 != 0) {
            v0_0.zzn.zzb(p22, v3_1);
            if (!v8.hasNext()) {
                v3_1 = 0;
            } else {
                v3_1 = ((java.util.Map$Entry) v8.next());
            }
        }
        ((com.google.android.recaptcha.internal.zznd) p21).zzc.zzl(p22);
        return;
    }

    public final boolean zzk(Object p8, Object p9)
    {
        int v1_0 = 0;
        while (v1_0 < this.zzc.length) {
            boolean v2_49;
            boolean v2_39 = this.zzu(v1_0);
            long v4_6 = ((long) (v2_39 & 1048575));
            switch (com.google.android.recaptcha.internal.zzol.zzt(v2_39)) {
                case 0:
                    if ((!this.zzL(p8, p9, v1_0)) || (Double.doubleToLongBits(com.google.android.recaptcha.internal.zzps.zza(p8, v4_6)) != Double.doubleToLongBits(com.google.android.recaptcha.internal.zzps.zza(p9, v4_6)))) {
                        return 0;
                    } else {
                    }
                case 1:
                    if ((!this.zzL(p8, p9, v1_0)) || (Float.floatToIntBits(com.google.android.recaptcha.internal.zzps.zzb(p8, v4_6)) != Float.floatToIntBits(com.google.android.recaptcha.internal.zzps.zzb(p9, v4_6)))) {
                        return 0;
                    } else {
                    }
                case 2:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzd(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzd(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 3:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzd(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzd(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 4:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzc(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 5:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzd(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzd(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 6:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzc(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 7:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzw(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzw(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 8:
                    if ((!this.zzL(p8, p9, v1_0)) || (!com.google.android.recaptcha.internal.zzoy.zzF(com.google.android.recaptcha.internal.zzps.zzf(p8, v4_6), com.google.android.recaptcha.internal.zzps.zzf(p9, v4_6)))) {
                        return 0;
                    } else {
                    }
                case 9:
                    if ((!this.zzL(p8, p9, v1_0)) || (!com.google.android.recaptcha.internal.zzoy.zzF(com.google.android.recaptcha.internal.zzps.zzf(p8, v4_6), com.google.android.recaptcha.internal.zzps.zzf(p9, v4_6)))) {
                        return 0;
                    } else {
                    }
                case 10:
                    if ((!this.zzL(p8, p9, v1_0)) || (!com.google.android.recaptcha.internal.zzoy.zzF(com.google.android.recaptcha.internal.zzps.zzf(p8, v4_6), com.google.android.recaptcha.internal.zzps.zzf(p9, v4_6)))) {
                        return 0;
                    } else {
                    }
                case 11:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzc(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 12:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzc(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 13:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzc(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 14:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzd(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzd(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 15:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzc(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 16:
                    if ((!this.zzL(p8, p9, v1_0)) || (com.google.android.recaptcha.internal.zzps.zzd(p8, v4_6) != com.google.android.recaptcha.internal.zzps.zzd(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 17:
                    if ((!this.zzL(p8, p9, v1_0)) || (!com.google.android.recaptcha.internal.zzoy.zzF(com.google.android.recaptcha.internal.zzps.zzf(p8, v4_6), com.google.android.recaptcha.internal.zzps.zzf(p9, v4_6)))) {
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
                    v2_49 = com.google.android.recaptcha.internal.zzoy.zzF(com.google.android.recaptcha.internal.zzps.zzf(p8, v4_6), com.google.android.recaptcha.internal.zzps.zzf(p9, v4_6));
                    if (v2_49) {
                    }
                    break;
                case 50:
                    v2_49 = com.google.android.recaptcha.internal.zzoy.zzF(com.google.android.recaptcha.internal.zzps.zzf(p8, v4_6), com.google.android.recaptcha.internal.zzps.zzf(p9, v4_6));
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
                    boolean v2_44 = ((long) (this.zzr(v1_0) & 1048575));
                    if ((com.google.android.recaptcha.internal.zzps.zzc(p8, v2_44) == com.google.android.recaptcha.internal.zzps.zzc(p9, v2_44)) && (com.google.android.recaptcha.internal.zzoy.zzF(com.google.android.recaptcha.internal.zzps.zzf(p8, v4_6), com.google.android.recaptcha.internal.zzps.zzf(p9, v4_6)))) {
                    }
                    break;
                default:
            }
            v1_0 += 3;
        }
        if (((com.google.android.recaptcha.internal.zznd) p8).zzc.equals(((com.google.android.recaptcha.internal.zznd) p9).zzc)) {
            if (!this.zzh) {
                return 1;
            } else {
                return ((com.google.android.recaptcha.internal.zzna) p8).zzb.equals(((com.google.android.recaptcha.internal.zzna) p9).zzb);
            }
        } else {
            return 0;
        }
    }

    public final boolean zzl(Object p15)
    {
        int v2 = 0;
        int v4_1 = 0;
        long v3_2 = 1048575;
        while (v2 < this.zzk) {
            Object v11;
            int v12;
            int v10 = this.zzj[v2];
            boolean v5_2 = this.zzc[v10];
            int v7_1 = this.zzu(v10);
            com.google.android.recaptcha.internal.zzol v8_1 = this.zzc[(v10 + 2)];
            boolean v9_1 = (v8_1 & 1048575);
            int v13 = (1 << (v8_1 >> 20));
            if (v9_1 == v3_2) {
                v11 = v3_2;
                v12 = v4_1;
            } else {
                if (v9_1 != 1048575) {
                    v4_1 = com.google.android.recaptcha.internal.zzol.zzb.getInt(p15, ((long) v9_1));
                }
                v12 = v4_1;
                v11 = v9_1;
            }
            if (((268435456 & v7_1) != 0) && (!this.zzO(p15, v10, v11, v12, v13))) {
                return 0;
            } else {
                int v15_13 = com.google.android.recaptcha.internal.zzol.zzt(v7_1);
                if ((v15_13 == 9) || (v15_13 == 17)) {
                    if ((this.zzO(p15, v10, v11, v12, v13)) && (!com.google.android.recaptcha.internal.zzol.zzP(p15, v7_1, this.zzx(v10)))) {
                        return 0;
                    }
                } else {
                    if (v15_13 != 27) {
                        if ((v15_13 == 60) || (v15_13 == 68)) {
                            if ((!this.zzR(p15, v5_2, v10)) || (com.google.android.recaptcha.internal.zzol.zzP(p15, v7_1, this.zzx(v10)))) {
                                v2++;
                                v3_2 = v11;
                                v4_1 = v12;
                            } else {
                                return 0;
                            }
                        } else {
                            if (v15_13 != 49) {
                                if ((v15_13 == 50) && (!((com.google.android.recaptcha.internal.zzoc) com.google.android.recaptcha.internal.zzps.zzf(p15, ((long) (v7_1 & 1048575)))).isEmpty())) {
                                    this.zzz(v10);
                                    throw 0;
                                }
                            }
                        }
                    }
                    int v15_22 = ((java.util.List) com.google.android.recaptcha.internal.zzps.zzf(p15, ((long) (v7_1 & 1048575))));
                    if (!v15_22.isEmpty()) {
                        long v3_14 = this.zzx(v10);
                        int v4_0 = 0;
                        while (v4_0 < v15_22.size()) {
                            if (v3_14.zzl(v15_22.get(v4_0))) {
                                v4_0++;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        if ((!this.zzh) || (((com.google.android.recaptcha.internal.zzna) p15).zzb.zzk())) {
            return 1;
        } else {
            return 0;
        }
    }
}
