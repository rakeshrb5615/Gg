package com.google.android.gms.internal.play_billing;
final class zzgo implements com.google.android.gms.internal.play_billing.zzgv {
    private static final int[] zza;
    private static final sun.misc.Unsafe zzb;
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.play_billing.zzgl zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final com.google.android.gms.internal.play_billing.zzhh zzl;
    private final com.google.android.gms.internal.play_billing.zzev zzm;

    static zzgo()
    {
        sun.misc.Unsafe v0_1 = new int[0];
        com.google.android.gms.internal.play_billing.zzgo.zza = v0_1;
        com.google.android.gms.internal.play_billing.zzgo.zzb = com.google.android.gms.internal.play_billing.zzho.zzg();
        return;
    }

    private zzgo(int[] p1, Object[] p2, int p3, int p4, com.google.android.gms.internal.play_billing.zzgl p5, boolean p6, int[] p7, int p8, int p9, com.google.android.gms.internal.play_billing.zzgq p10, com.google.android.gms.internal.play_billing.zzfy p11, com.google.android.gms.internal.play_billing.zzhh p12, com.google.android.gms.internal.play_billing.zzev p13, com.google.android.gms.internal.play_billing.zzgg p14)
    {
        this.zzc = p1;
        this.zzd = p2;
        this.zze = p3;
        this.zzf = p4;
        int v1_1 = 0;
        if ((p13 != null) && ((p5 instanceof com.google.android.gms.internal.play_billing.zzff))) {
            v1_1 = 1;
        }
        this.zzh = v1_1;
        this.zzi = p7;
        this.zzj = p8;
        this.zzk = p9;
        this.zzl = p12;
        this.zzm = p13;
        this.zzg = p5;
        return;
    }

    private static void zzA(Object p2)
    {
        if (!com.google.android.gms.internal.play_billing.zzgo.zzL(p2)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(p2)));
        } else {
            return;
        }
    }

    private final void zzB(Object p6, Object p7, int p8)
    {
        if (this.zzI(p7, p8)) {
            String v1_2 = com.google.android.gms.internal.play_billing.zzgo.zzb;
            long v2 = ((long) (this.zzs(p8) & 1048575));
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
                String v7_2 = this.zzv(p8);
                if (this.zzI(p6, p8)) {
                    Object v8_3 = v1_2.getObject(p6, v2);
                    if (!com.google.android.gms.internal.play_billing.zzgo.zzL(v8_3)) {
                        Object v4_2 = v7_2.zze();
                        v7_2.zzg(v4_2, v8_3);
                        v1_2.putObject(p6, v2, v4_2);
                        v8_3 = v4_2;
                    }
                    v7_2.zzg(v8_3, v0_1);
                    return;
                } else {
                    if (com.google.android.gms.internal.play_billing.zzgo.zzL(v0_1)) {
                        Object v4_4 = v7_2.zze();
                        v7_2.zzg(v4_4, v0_1);
                        v1_2.putObject(p6, v2, v4_4);
                    } else {
                        v1_2.putObject(p6, v2, v0_1);
                    }
                    this.zzD(p6, p8);
                    return;
                }
            }
        } else {
            return;
        }
    }

    private final void zzC(Object p7, Object p8, int p9)
    {
        Object v0_0 = this.zzc;
        String v1_0 = v0_0[p9];
        if (this.zzM(p8, v1_0, p9)) {
            sun.misc.Unsafe v3_1 = com.google.android.gms.internal.play_billing.zzgo.zzb;
            long v4 = ((long) (this.zzs(p9) & 1048575));
            Object v2_0 = v3_1.getObject(p8, v4);
            if (v2_0 == null) {
                Object v9_1 = v0_0[p9];
                String v8_1 = p8.toString();
                Object v0_2 = new StringBuilder("Source subfield ");
                v0_2.append(v9_1);
                v0_2.append(" is present but null: ");
                v0_2.append(v8_1);
                throw new IllegalStateException(v0_2.toString());
            } else {
                String v8_3 = this.zzv(p9);
                if (this.zzM(p7, v1_0, p9)) {
                    Object v9_3 = v3_1.getObject(p7, v4);
                    if (!com.google.android.gms.internal.play_billing.zzgo.zzL(v9_3)) {
                        Object v0_5 = v8_3.zze();
                        v8_3.zzg(v0_5, v9_3);
                        v3_1.putObject(p7, v4, v0_5);
                        v9_3 = v0_5;
                    }
                    v8_3.zzg(v9_3, v2_0);
                    return;
                } else {
                    if (com.google.android.gms.internal.play_billing.zzgo.zzL(v2_0)) {
                        Object v0_7 = v8_3.zze();
                        v8_3.zzg(v0_7, v2_0);
                        v3_1.putObject(p7, v4, v0_7);
                    } else {
                        v3_1.putObject(p7, v4, v2_0);
                    }
                    this.zzE(p7, v1_0, p9);
                    return;
                }
            }
        } else {
            return;
        }
    }

    private final void zzD(Object p5, int p6)
    {
        int v6_1 = this.zzp(p6);
        long v0_2 = ((long) (1048575 & v6_1));
        if (v0_2 != 1048575) {
            com.google.android.gms.internal.play_billing.zzho.zzq(p5, v0_2, ((1 << (v6_1 >> 20)) | com.google.android.gms.internal.play_billing.zzho.zzc(p5, v0_2)));
            return;
        } else {
            return;
        }
    }

    private final void zzE(Object p3, int p4, int p5)
    {
        com.google.android.gms.internal.play_billing.zzho.zzq(p3, ((long) (this.zzp(p5) & 1048575)), p4);
        return;
    }

    private final void zzF(Object p4, int p5, Object p6)
    {
        com.google.android.gms.internal.play_billing.zzgo.zzb.putObject(p4, ((long) (this.zzs(p5) & 1048575)), p6);
        this.zzD(p4, p5);
        return;
    }

    private final void zzG(Object p4, int p5, int p6, Object p7)
    {
        com.google.android.gms.internal.play_billing.zzgo.zzb.putObject(p4, ((long) (this.zzs(p6) & 1048575)), p7);
        this.zzE(p4, p5, p6);
        return;
    }

    private final boolean zzH(Object p1, Object p2, int p3)
    {
        if (this.zzI(p1, p3) != this.zzI(p2, p3)) {
            return 0;
        } else {
            return 1;
        }
    }

    private final boolean zzI(Object p8, int p9)
    {
        long v0_0 = this.zzp(p9);
        long v2_2 = ((long) (v0_0 & 1048575));
        if (v2_2 != 1048575) {
            if ((com.google.android.gms.internal.play_billing.zzho.zzc(p8, v2_2) & (1 << (v0_0 >> 20))) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            com.google.android.gms.internal.play_billing.zzei v9_3 = this.zzs(p9);
            long v0_2 = ((long) (v9_3 & 1048575));
            switch (com.google.android.gms.internal.play_billing.zzgo.zzr(v9_3)) {
                case 0:
                    if (Double.doubleToRawLongBits(com.google.android.gms.internal.play_billing.zzho.zza(p8, v0_2)) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 1:
                    if (Float.floatToRawIntBits(com.google.android.gms.internal.play_billing.zzho.zzb(p8, v0_2)) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 2:
                    if (com.google.android.gms.internal.play_billing.zzho.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 3:
                    if (com.google.android.gms.internal.play_billing.zzho.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 4:
                    if (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 5:
                    if (com.google.android.gms.internal.play_billing.zzho.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 6:
                    if (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 7:
                    return com.google.android.gms.internal.play_billing.zzho.zzw(p8, v0_2);
                case 8:
                    IllegalArgumentException v8_30 = com.google.android.gms.internal.play_billing.zzho.zzf(p8, v0_2);
                    if (!(v8_30 instanceof String)) {
                        if (!(v8_30 instanceof com.google.android.gms.internal.play_billing.zzei)) {
                            throw new IllegalArgumentException();
                        } else {
                            if (com.google.android.gms.internal.play_billing.zzei.zzb.equals(v8_30)) {
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
                    if (com.google.android.gms.internal.play_billing.zzho.zzf(p8, v0_2) == null) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 10:
                    if (com.google.android.gms.internal.play_billing.zzei.zzb.equals(com.google.android.gms.internal.play_billing.zzho.zzf(p8, v0_2))) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 11:
                    if (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 12:
                    if (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 13:
                    if (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 14:
                    if (com.google.android.gms.internal.play_billing.zzho.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 15:
                    if (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 16:
                    if (com.google.android.gms.internal.play_billing.zzho.zzd(p8, v0_2) == 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                case 17:
                    if (com.google.android.gms.internal.play_billing.zzho.zzf(p8, v0_2) == null) {
                        return 0;
                    } else {
                        return 1;
                    }
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    private final boolean zzJ(Object p2, int p3, int p4, int p5, int p6)
    {
        if (p4 != 1048575) {
            if ((p5 & p6) == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return this.zzI(p2, p3);
        }
    }

    private static boolean zzK(Object p2, int p3, com.google.android.gms.internal.play_billing.zzgv p4)
    {
        return p4.zzk(com.google.android.gms.internal.play_billing.zzho.zzf(p2, ((long) (p3 & 1048575))));
    }

    private static boolean zzL(Object p1)
    {
        if (p1 != 0) {
            if (!(p1 instanceof com.google.android.gms.internal.play_billing.zzfi)) {
                return 1;
            } else {
                return ((com.google.android.gms.internal.play_billing.zzfi) p1).zzz();
            }
        } else {
            return 0;
        }
    }

    private final boolean zzM(Object p3, int p4, int p5)
    {
        if (com.google.android.gms.internal.play_billing.zzho.zzc(p3, ((long) (this.zzp(p5) & 1048575))) != p4) {
            return 0;
        } else {
            return 1;
        }
    }

    private static boolean zzN(Object p0, long p1)
    {
        return ((Boolean) com.google.android.gms.internal.play_billing.zzho.zzf(p0, p1)).booleanValue();
    }

    private static final void zzO(int p1, Object p2, com.google.android.gms.internal.play_billing.zzhu p3)
    {
        if (!(p2 instanceof String)) {
            p3.zzd(p1, ((com.google.android.gms.internal.play_billing.zzei) p2));
            return;
        } else {
            p3.zzG(p1, ((String) p2));
            return;
        }
    }

    public static com.google.android.gms.internal.play_billing.zzhi zzd(Object p2)
    {
        com.google.android.gms.internal.play_billing.zzhi v0 = ((com.google.android.gms.internal.play_billing.zzfi) p2).zzc;
        if (v0 == com.google.android.gms.internal.play_billing.zzhi.zzc()) {
            v0 = com.google.android.gms.internal.play_billing.zzhi.zzf();
            ((com.google.android.gms.internal.play_billing.zzfi) p2).zzc = v0;
        }
        return v0;
    }

    public static com.google.android.gms.internal.play_billing.zzgo zzl(Class p31, com.google.android.gms.internal.play_billing.zzgi p32, com.google.android.gms.internal.play_billing.zzgq p33, com.google.android.gms.internal.play_billing.zzfy p34, com.google.android.gms.internal.play_billing.zzhh p35, com.google.android.gms.internal.play_billing.zzev p36, com.google.android.gms.internal.play_billing.zzgg p37)
    {
        if (!(p32 instanceof com.google.android.gms.internal.play_billing.zzgu)) {
            throw 0;
        } else {
            int v7_2;
            com.google.android.gms.internal.play_billing.zzgo v0_49 = ((com.google.android.gms.internal.play_billing.zzgu) p32);
            int v1_5 = ((com.google.android.gms.internal.play_billing.zzgu) p32).zzd();
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
            int v12_3;
            int v9_0;
            int v11_5;
            int v16_5;
            int v7_1;
            int v10_0;
            int v13_7;
            int v17_1;
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
                v16_5 = com.google.android.gms.internal.play_billing.zzgo.zza;
                v7_1 = 0;
            }
            int v14_8 = com.google.android.gms.internal.play_billing.zzgo.zzb;
            int v15_7 = ((com.google.android.gms.internal.play_billing.zzgu) p32).zze();
            Class v3_1 = ((com.google.android.gms.internal.play_billing.zzgu) p32).zza().getClass();
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
                        com.google.android.gms.internal.play_billing.zzgo v25_1 = (v6_1 + 1);
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
                int v1_2;
                int v23_5;
                int v7_20;
                int v30_0;
                int v29_0;
                int v2_4;
                com.google.android.gms.internal.play_billing.zzgo v0_26;
                int v28_4;
                int v5_3 = (v8_4 & 255);
                com.google.android.gms.internal.play_billing.zzgo v25_2 = v0_49;
                int v26_0 = (v8_4 & 2048);
                if (v5_3 < 51) {
                    int v28_1;
                    v29_0 = v2_0;
                    v30_0 = v7_1;
                    com.google.android.gms.internal.play_billing.zzgo v0_4 = (v10_0 + 1);
                    int v2_3 = com.google.android.gms.internal.play_billing.zzgo.zzz(v3_1, ((String) v15_7[v10_0]));
                    if ((v5_3 != 9) && (v5_3 != 17)) {
                        int v28_0;
                        com.google.android.gms.internal.play_billing.zzgo v0_5;
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
                                            com.google.android.gms.internal.play_billing.zzgo v0_13 = (v6_0 + 1);
                                            int v1_3 = v7_20.charAt(v6_0);
                                            if (v1_3 < 55296) {
                                                v28_5 = v0_13;
                                            } else {
                                                int v1_4 = (v1_3 & 8191);
                                                int v23_6 = 13;
                                                while(true) {
                                                    v28_5 = (v0_13 + 1);
                                                    com.google.android.gms.internal.play_billing.zzgo v0_14 = v7_20.charAt(v0_13);
                                                    if (v0_14 < 55296) {
                                                        break;
                                                    }
                                                    v1_4 |= ((v0_14 & 8191) << v23_6);
                                                    v23_6 += 13;
                                                    v0_13 = v28_5;
                                                }
                                                v1_3 = (v1_4 | (v0_14 << v23_6));
                                            }
                                            com.google.android.gms.internal.play_billing.zzgo v0_19;
                                            int v23_8 = ((v1_3 / 32) + (v30_0 + v30_0));
                                            com.google.android.gms.internal.play_billing.zzgo v0_17 = v15_7[v23_8];
                                            if (!(v0_17 instanceof reflect.Field)) {
                                                v0_19 = com.google.android.gms.internal.play_billing.zzgo.zzz(v3_1, ((String) v0_17));
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
                                            com.google.android.gms.internal.play_billing.zzgo v0_25 = (v22_0 + 1);
                                            v16_5[v22_0] = v2_4;
                                            v22_0 = v0_25;
                                        }
                                        v0_26 = v26_0;
                                        com.google.android.gms.internal.play_billing.zzgo v0_42;
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
                                            com.google.android.gms.internal.play_billing.zzgo v0_7 = (v10_0 + 3);
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
                    com.google.android.gms.internal.play_billing.zzgo v0_31;
                    com.google.android.gms.internal.play_billing.zzgo v0_29 = (v6_0 + 1);
                    int v6_7 = v1_5.charAt(v6_0);
                    int v27_0 = v0_29;
                    com.google.android.gms.internal.play_billing.zzgo v0_30 = 55296;
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
                    com.google.android.gms.internal.play_billing.zzgo v0_36;
                    com.google.android.gms.internal.play_billing.zzgo v0_35;
                    int v27_2 = v0_31;
                    com.google.android.gms.internal.play_billing.zzgo v0_33 = (v5_3 - 51);
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
                        v2_12 = com.google.android.gms.internal.play_billing.zzgo.zzz(v3_1, ((String) v2_10));
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
                        v7_35 = com.google.android.gms.internal.play_billing.zzgo.zzz(v3_1, ((String) v7_33));
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
            return new com.google.android.gms.internal.play_billing.zzgo(v11_7, v9_7, v12_3, v13_7, v0_49.zza(), 0, v16_5, v17_1, v18_1, p33, p34, p35, p36, p37);
        }
    }

    private static double zzm(Object p0, long p1)
    {
        return ((Double) com.google.android.gms.internal.play_billing.zzho.zzf(p0, p1)).doubleValue();
    }

    private static float zzn(Object p0, long p1)
    {
        return ((Float) com.google.android.gms.internal.play_billing.zzho.zzf(p0, p1)).floatValue();
    }

    private static int zzo(Object p0, long p1)
    {
        return ((Integer) com.google.android.gms.internal.play_billing.zzho.zzf(p0, p1)).intValue();
    }

    private final int zzp(int p2)
    {
        return this.zzc[(p2 + 2)];
    }

    private final int zzq(int p7, int p8)
    {
        int[] v0 = this.zzc;
        int v1_1 = ((v0.length / 3) + -1);
        while (p8 <= v1_1) {
            int v3_1 = ((v1_1 + p8) >> 1);
            int v4 = (v3_1 * 3);
            int v5 = v0[v4];
            if (p7 != v5) {
                if (p7 >= v5) {
                    p8 = (v3_1 + 1);
                } else {
                    v1_1 = (v3_1 - 1);
                }
            } else {
                return v4;
            }
        }
        return -1;
    }

    private static int zzr(int p0)
    {
        return ((p0 >> 20) & 255);
    }

    private final int zzs(int p2)
    {
        return this.zzc[(p2 + 1)];
    }

    private static long zzt(Object p0, long p1)
    {
        return ((Long) com.google.android.gms.internal.play_billing.zzho.zzf(p0, p1)).longValue();
    }

    private final com.google.android.gms.internal.play_billing.zzfl zzu(int p2)
    {
        return ((com.google.android.gms.internal.play_billing.zzfl) this.zzd[(((p2 / 3) + (p2 / 3)) + 1)]);
    }

    private final com.google.android.gms.internal.play_billing.zzgv zzv(int p4)
    {
        Object[] v0 = this.zzd;
        int v4_2 = ((p4 / 3) + (p4 / 3));
        com.google.android.gms.internal.play_billing.zzgv v1_3 = ((com.google.android.gms.internal.play_billing.zzgv) v0[v4_2]);
        if (v1_3 == null) {
            com.google.android.gms.internal.play_billing.zzgv v1_1 = com.google.android.gms.internal.play_billing.zzgs.zza().zzb(((Class) v0[(v4_2 + 1)]));
            v0[v4_2] = v1_1;
            return v1_1;
        } else {
            return v1_3;
        }
    }

    private final Object zzw(int p2)
    {
        return this.zzd[((p2 / 3) + (p2 / 3))];
    }

    private final Object zzx(Object p4, int p5)
    {
        com.google.android.gms.internal.play_billing.zzgv v0 = this.zzv(p5);
        long v1_1 = (this.zzs(p5) & 1048575);
        if (this.zzI(p4, p5)) {
            Object v4_1 = com.google.android.gms.internal.play_billing.zzgo.zzb.getObject(p4, ((long) v1_1));
            if (!com.google.android.gms.internal.play_billing.zzgo.zzL(v4_1)) {
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

    private final Object zzy(Object p4, int p5, int p6)
    {
        com.google.android.gms.internal.play_billing.zzgv v0 = this.zzv(p6);
        if (this.zzM(p4, p5, p6)) {
            Object v4_1 = com.google.android.gms.internal.play_billing.zzgo.zzb.getObject(p4, ((long) (this.zzs(p6) & 1048575)));
            if (!com.google.android.gms.internal.play_billing.zzgo.zzL(v4_1)) {
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

    private static reflect.Field zzz(Class p6, String p7)
    {
        try {
            String v6_1 = p6.getDeclaredField(p7);
            return v6_1;
        } catch (NoSuchFieldException v0) {
            String v1_1 = v6_1.getDeclaredFields();
            int v3_1 = 0;
        }
    }

    public final int zza(Object p18)
    {
        int v0_0 = this;
        int v1_0 = p18;
        com.google.android.gms.internal.play_billing.zzey v6_0 = com.google.android.gms.internal.play_billing.zzgo.zzb;
        int v7 = 0;
        int v8_28 = 1048575;
        int v2_7 = 0;
        int v4_1 = 0;
        int v9 = 0;
        int v3_8 = 1048575;
        while(true) {
            int v5_156 = v0_0.zzc;
            if (v2_7 >= v5_156.length) {
                break;
            }
            int v5_122;
            int v10_25 = v0_0.zzs(v2_7);
            int v11_11 = com.google.android.gms.internal.play_billing.zzgo.zzr(v10_25);
            int v12_14 = v5_156[v2_7];
            int v5_111 = v5_156[(v2_7 + 2)];
            int v13_10 = (v5_111 & v8_28);
            if (v11_11 > 17) {
                v5_122 = 0;
            } else {
                if (v13_10 != v3_8) {
                    if (v13_10 != v8_28) {
                        v4_1 = v6_0.getInt(v1_0, ((long) v13_10));
                    } else {
                        v4_1 = 0;
                    }
                    v3_8 = v13_10;
                }
                v5_122 = (1 << (v5_111 >> 20));
            }
            int v10_34 = (v10_25 & v8_28);
            if (v11_11 >= com.google.android.gms.internal.play_billing.zzfa.zzJ.zza()) {
                com.google.android.gms.internal.play_billing.zzfa.zzW.zza();
            }
            int v5_124;
            int v0_11;
            int v8_35;
            int v8_9;
            int v5_19;
            int v8_1;
            int v0_2;
            int v5_4;
            int v8_43;
            int v10_15;
            int v5_138;
            int v5_79;
            int v10_21;
            int v10_6;
            int v5_22;
            int v5_1;
            int v8_50;
            int v13_14 = ((long) v10_34);
            switch (v11_11) {
                case 0:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 8, v9);
                    }
                    break;
                case 1:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                        v0_0 = this;
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 4, v9);
                    }
                    break;
                case 2:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        int v0_18 = (v12_14 << 3);
                        int v10_37 = v6_0.getLong(v1_0, v13_14);
                        v0_2 = com.google.android.gms.internal.play_billing.zzep.zzC(v0_18);
                        v5_124 = com.google.android.gms.internal.play_billing.zzep.zzD(v10_37);
                        v9 += (v5_124 + v0_2);
                    }
                    break;
                case 3:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        int v0_17 = (v12_14 << 3);
                        int v10_36 = v6_0.getLong(v1_0, v13_14);
                        v0_2 = com.google.android.gms.internal.play_billing.zzep.zzC(v0_17);
                        v5_124 = com.google.android.gms.internal.play_billing.zzep.zzD(v10_36);
                    }
                    break;
                case 4:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        int v10_35 = ((long) v6_0.getInt(v1_0, v13_14));
                        v0_2 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v5_124 = com.google.android.gms.internal.play_billing.zzep.zzD(v10_35);
                    }
                    break;
                case 5:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 8, v9);
                    }
                    break;
                case 6:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 4, v9);
                    }
                    break;
                case 7:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 1, v9);
                    }
                    break;
                case 8:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        int v0_12 = (v12_14 << 3);
                        int v5_142 = v6_0.getObject(v1_0, v13_14);
                        if (!(v5_142 instanceof com.google.android.gms.internal.play_billing.zzei)) {
                            int v5_144 = ((String) v5_142);
                            v0_2 = com.google.android.gms.internal.play_billing.zzep.zzC(v0_12);
                            v5_124 = com.google.android.gms.internal.play_billing.zzep.zzB(v5_144);
                        } else {
                            int v5_145 = ((com.google.android.gms.internal.play_billing.zzei) v5_142);
                            v0_11 = com.google.android.gms.internal.play_billing.zzep.zzC(v0_12);
                            v5_138 = v5_145.zzd();
                            v8_50 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_138);
                            v9 += ((v8_50 + v5_138) + v0_11);
                        }
                    }
                    break;
                case 9:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        v5_22 = com.google.android.gms.internal.play_billing.zzgx.zzh(v12_14, v6_0.getObject(v1_0, v13_14), v0_0.zzv(v2_7));
                        v9 += v5_22;
                    }
                    break;
                case 10:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        int v5_137 = ((com.google.android.gms.internal.play_billing.zzei) v6_0.getObject(v1_0, v13_14));
                        v0_11 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v5_138 = v5_137.zzd();
                        v8_50 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_138);
                    }
                    break;
                case 11:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        v9 = v1.a.u(v6_0.getInt(v1_0, v13_14), com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3)), v9);
                    }
                    break;
                case 12:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        int v10_33 = ((long) v6_0.getInt(v1_0, v13_14));
                        v0_2 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v5_124 = com.google.android.gms.internal.play_billing.zzep.zzD(v10_33);
                    }
                    break;
                case 13:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 4, v9);
                    }
                    break;
                case 14:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 8, v9);
                    }
                    break;
                case 15:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        int v0_3 = (v12_14 << 3);
                        int v5_126 = v6_0.getInt(v1_0, v13_14);
                        v9 = v1.a.u(((v5_126 >> 31) ^ (v5_126 + v5_126)), com.google.android.gms.internal.play_billing.zzep.zzC(v0_3), v9);
                    }
                    break;
                case 16:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        int v0_1 = (v12_14 << 3);
                        int v10_30 = v6_0.getLong(v1_0, v13_14);
                        int v12_15 = (v10_30 + v10_30);
                        int v10_31 = (v10_30 >> 63);
                        v0_2 = com.google.android.gms.internal.play_billing.zzep.zzC(v0_1);
                        v5_124 = com.google.android.gms.internal.play_billing.zzep.zzD((v10_31 ^ v12_15));
                    }
                    break;
                case 17:
                    if (!v0_0.zzJ(v1_0, v2_7, v3_8, v4_1, v5_122)) {
                    } else {
                        v5_1 = com.google.android.gms.internal.play_billing.zzep.zzy(v12_14, ((com.google.android.gms.internal.play_billing.zzgl) v6_0.getObject(v1_0, v13_14)), v0_0.zzv(v2_7));
                        v9 += v5_1;
                    }
                    break;
                case 18:
                    v5_22 = com.google.android.gms.internal.play_billing.zzgx.zzd(v12_14, ((java.util.List) v6_0.getObject(v1_0, v13_14)), 0);
                    break;
                case 19:
                    v5_22 = com.google.android.gms.internal.play_billing.zzgx.zzb(v12_14, ((java.util.List) v6_0.getObject(v1_0, v13_14)), 0);
                    break;
                case 20:
                    int v5_113 = ((java.util.List) v6_0.getObject(v1_0, v13_14));
                    if (v5_113.size() != 0) {
                        v8_43 = ((com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3)) * v5_113.size()) + com.google.android.gms.internal.play_billing.zzgx.zzg(v5_113));
                        v9 += v8_43;
                    } else {
                        v8_43 = 0;
                    }
                    break;
                case 21:
                    int v5_110 = ((java.util.List) v6_0.getObject(v1_0, v13_14));
                    v8_35 = v5_110.size();
                    if (v8_35 != 0) {
                        int v10_27 = (v12_14 << 3);
                        v5_79 = com.google.android.gms.internal.play_billing.zzgx.zzl(v5_110);
                        v10_15 = com.google.android.gms.internal.play_billing.zzep.zzC(v10_27);
                        v10_21 = ((v10_15 * v8_35) + v5_79);
                        v9 += v10_21;
                    } else {
                        v10_21 = 0;
                    }
                    break;
                case 22:
                    int v5_108 = ((java.util.List) v6_0.getObject(v1_0, v13_14));
                    v8_35 = v5_108.size();
                    if (v8_35 != 0) {
                        int v10_26 = (v12_14 << 3);
                        v5_79 = com.google.android.gms.internal.play_billing.zzgx.zzf(v5_108);
                        v10_15 = com.google.android.gms.internal.play_billing.zzep.zzC(v10_26);
                    }
                    break;
                case 23:
                    v5_22 = com.google.android.gms.internal.play_billing.zzgx.zzd(v12_14, ((java.util.List) v6_0.getObject(v1_0, v13_14)), 0);
                    break;
                case 24:
                    v5_22 = com.google.android.gms.internal.play_billing.zzgx.zzb(v12_14, ((java.util.List) v6_0.getObject(v1_0, v13_14)), 0);
                    break;
                case 25:
                    int v5_102 = ((java.util.List) v6_0.getObject(v1_0, v13_14)).size();
                    if (v5_102 != 0) {
                        v8_43 = ((com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3)) + 1) * v5_102);
                    }
                    break;
                case 26:
                    int v5_98 = ((java.util.List) v6_0.getObject(v1_0, v13_14));
                    int v8_39 = v5_98.size();
                    if (v8_39 != 0) {
                        v10_21 = (com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3)) * v8_39);
                        if (!(v5_98 instanceof com.google.android.gms.internal.play_billing.zzfx)) {
                            int v11_9 = 0;
                            while (v11_9 < v8_39) {
                                int v12_2 = v5_98.get(v11_9);
                                if (!(v12_2 instanceof com.google.android.gms.internal.play_billing.zzei)) {
                                    v10_21 = (com.google.android.gms.internal.play_billing.zzep.zzB(((String) v12_2)) + v10_21);
                                } else {
                                    v10_21 = v1.a.u(((com.google.android.gms.internal.play_billing.zzei) v12_2).zzd(), ((com.google.android.gms.internal.play_billing.zzei) v12_2).zzd(), v10_21);
                                }
                                v11_9++;
                            }
                        } else {
                            int v5_99 = ((com.google.android.gms.internal.play_billing.zzfx) v5_98);
                            int v11_10 = 0;
                            while (v11_10 < v8_39) {
                                int v12_8 = v5_99.zza();
                                if (!(v12_8 instanceof com.google.android.gms.internal.play_billing.zzei)) {
                                    v10_21 = (com.google.android.gms.internal.play_billing.zzep.zzB(((String) v12_8)) + v10_21);
                                } else {
                                    v10_21 = v1.a.u(((com.google.android.gms.internal.play_billing.zzei) v12_8).zzd(), ((com.google.android.gms.internal.play_billing.zzei) v12_8).zzd(), v10_21);
                                }
                                v11_10++;
                            }
                        }
                    }
                    break;
                case 27:
                    int v11_7;
                    int v5_94 = ((java.util.List) v6_0.getObject(v1_0, v13_14));
                    int v8_38 = v0_0.zzv(v2_7);
                    int v10_22 = v5_94.size();
                    if (v10_22 != 0) {
                        v11_7 = (com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3)) * v10_22);
                        int v12_1 = 0;
                        while (v12_1 < v10_22) {
                            int v13_1 = v5_94.get(v12_1);
                            if (!(v13_1 instanceof com.google.android.gms.internal.play_billing.zzfw)) {
                                v11_7 = (com.google.android.gms.internal.play_billing.zzep.zzA(((com.google.android.gms.internal.play_billing.zzgl) v13_1), v8_38) + v11_7);
                            } else {
                                v11_7 = v1.a.u(((com.google.android.gms.internal.play_billing.zzfw) v13_1).zza(), ((com.google.android.gms.internal.play_billing.zzfw) v13_1).zza(), v11_7);
                            }
                            v12_1++;
                        }
                    } else {
                        v11_7 = 0;
                    }
                    v9 += v11_7;
                    break;
                case 28:
                    int v5_92 = ((java.util.List) v6_0.getObject(v1_0, v13_14));
                    int v8_36 = v5_92.size();
                    if (v8_36 != 0) {
                        v10_21 = (com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3)) * v8_36);
                        int v8_37 = 0;
                        while (v8_37 < v5_92.size()) {
                            v10_21 = v1.a.u(((com.google.android.gms.internal.play_billing.zzei) v5_92.get(v8_37)).zzd(), ((com.google.android.gms.internal.play_billing.zzei) v5_92.get(v8_37)).zzd(), v10_21);
                            v8_37++;
                        }
                    }
                    break;
                case 29:
                    int v5_90 = ((java.util.List) v6_0.getObject(v1_0, v13_14));
                    v8_35 = v5_90.size();
                    if (v8_35 != 0) {
                        int v10_18 = (v12_14 << 3);
                        v5_79 = com.google.android.gms.internal.play_billing.zzgx.zzk(v5_90);
                        v10_15 = com.google.android.gms.internal.play_billing.zzep.zzC(v10_18);
                    }
                    break;
                case 30:
                    int v5_88 = ((java.util.List) v6_0.getObject(v1_0, v13_14));
                    v8_35 = v5_88.size();
                    if (v8_35 != 0) {
                        int v10_17 = (v12_14 << 3);
                        v5_79 = com.google.android.gms.internal.play_billing.zzgx.zza(v5_88);
                        v10_15 = com.google.android.gms.internal.play_billing.zzep.zzC(v10_17);
                    }
                    break;
                case 31:
                    v5_22 = com.google.android.gms.internal.play_billing.zzgx.zzb(v12_14, ((java.util.List) v6_0.getObject(v1_0, v13_14)), 0);
                    break;
                case 32:
                    v5_22 = com.google.android.gms.internal.play_billing.zzgx.zzd(v12_14, ((java.util.List) v6_0.getObject(v1_0, v13_14)), 0);
                    break;
                case 33:
                    int v5_81 = ((java.util.List) v6_0.getObject(v1_0, v13_14));
                    v8_35 = v5_81.size();
                    if (v8_35 != 0) {
                        int v10_16 = (v12_14 << 3);
                        v5_79 = com.google.android.gms.internal.play_billing.zzgx.zzi(v5_81);
                        v10_15 = com.google.android.gms.internal.play_billing.zzep.zzC(v10_16);
                    }
                    break;
                case 34:
                    int v5_78 = ((java.util.List) v6_0.getObject(v1_0, v13_14));
                    v8_35 = v5_78.size();
                    if (v8_35 != 0) {
                        int v10_14 = (v12_14 << 3);
                        v5_79 = com.google.android.gms.internal.play_billing.zzgx.zzj(v5_78);
                        v10_15 = com.google.android.gms.internal.play_billing.zzep.zzC(v10_14);
                    }
                    break;
                case 35:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zze(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                        v9 += ((v10_6 + v8_9) + v5_19);
                    }
                    break;
                case 36:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zzc(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 37:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zzg(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 38:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zzl(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 39:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zzf(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 40:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zze(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 41:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zzc(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 42:
                    v5_19 = ((java.util.List) v6_0.getObject(v1_0, v13_14)).size();
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 43:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zzk(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 44:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zza(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 45:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zzc(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 46:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zze(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 47:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zzi(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 48:
                    v5_19 = com.google.android.gms.internal.play_billing.zzgx.zzj(((java.util.List) v6_0.getObject(v1_0, v13_14)));
                    if (v5_19 <= 0) {
                    } else {
                        v8_9 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_19);
                    }
                    break;
                case 49:
                    int v13_0;
                    int v5_46 = ((java.util.List) v6_0.getObject(v1_0, v13_14));
                    int v8_19 = v0_0.zzv(v2_7);
                    int v10_11 = v5_46.size();
                    if (v10_11 != 0) {
                        int v11_0 = 0;
                        v13_0 = 0;
                        while (v11_0 < v10_11) {
                            v13_0 += com.google.android.gms.internal.play_billing.zzep.zzy(v12_14, ((com.google.android.gms.internal.play_billing.zzgl) v5_46.get(v11_0)), v8_19);
                            v11_0++;
                        }
                    } else {
                        v13_0 = 0;
                    }
                    v9 += v13_0;
                    break;
                case 50:
                    int v5_41 = v6_0.getObject(v1_0, v13_14);
                    v0_0.zzw(v2_7);
                    int v5_42 = ((com.google.android.gms.internal.play_billing.zzgf) v5_41);
                    if (v5_42.isEmpty()) {
                    } else {
                        int v5_44 = v5_42.entrySet().iterator();
                        if (v5_44.hasNext()) {
                            int v1_7 = ((java.util.Map$Entry) v5_44.next());
                            v1_7.getKey();
                            v1_7.getValue();
                            throw 0;
                        } else {
                        }
                    }
                    break;
                case 51:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 8, v9);
                    }
                    break;
                case 52:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 4, v9);
                    }
                    break;
                case 53:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        int v5_36 = (v12_14 << 3);
                        int v10_10 = com.google.android.gms.internal.play_billing.zzgo.zzt(v1_0, v13_14);
                        v5_4 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_36);
                        v8_1 = com.google.android.gms.internal.play_billing.zzep.zzD(v10_10);
                        v9 += (v8_1 + v5_4);
                    }
                    break;
                case 54:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        int v5_34 = (v12_14 << 3);
                        int v10_9 = com.google.android.gms.internal.play_billing.zzgo.zzt(v1_0, v13_14);
                        v5_4 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_34);
                        v8_1 = com.google.android.gms.internal.play_billing.zzep.zzD(v10_9);
                    }
                    break;
                case 55:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        int v10_8 = ((long) com.google.android.gms.internal.play_billing.zzgo.zzo(v1_0, v13_14));
                        v5_4 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v8_1 = com.google.android.gms.internal.play_billing.zzep.zzD(v10_8);
                    }
                    break;
                case 56:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 8, v9);
                    }
                    break;
                case 57:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 4, v9);
                    }
                    break;
                case 58:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 1, v9);
                    }
                    break;
                case 59:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        int v5_24 = (v12_14 << 3);
                        int v8_11 = v6_0.getObject(v1_0, v13_14);
                        if (!(v8_11 instanceof com.google.android.gms.internal.play_billing.zzei)) {
                            int v8_12 = ((String) v8_11);
                            v5_4 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_24);
                            v8_1 = com.google.android.gms.internal.play_billing.zzep.zzB(v8_12);
                        } else {
                            int v8_13 = ((com.google.android.gms.internal.play_billing.zzei) v8_11);
                            v5_19 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_24);
                            v8_9 = v8_13.zzd();
                            v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v8_9);
                        }
                    }
                    break;
                case 60:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        v5_22 = com.google.android.gms.internal.play_billing.zzgx.zzh(v12_14, v6_0.getObject(v1_0, v13_14), v0_0.zzv(v2_7));
                    }
                    break;
                case 61:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        int v8_8 = ((com.google.android.gms.internal.play_billing.zzei) v6_0.getObject(v1_0, v13_14));
                        v5_19 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v8_9 = v8_8.zzd();
                        v10_6 = com.google.android.gms.internal.play_billing.zzep.zzC(v8_9);
                    }
                    break;
                case 62:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        v9 = v1.a.u(com.google.android.gms.internal.play_billing.zzgo.zzo(v1_0, v13_14), com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3)), v9);
                    }
                    break;
                case 63:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        int v10_5 = ((long) com.google.android.gms.internal.play_billing.zzgo.zzo(v1_0, v13_14));
                        v5_4 = com.google.android.gms.internal.play_billing.zzep.zzC((v12_14 << 3));
                        v8_1 = com.google.android.gms.internal.play_billing.zzep.zzD(v10_5);
                    }
                    break;
                case 64:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 4, v9);
                    }
                    break;
                case 65:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        v9 = v1.a.u((v12_14 << 3), 8, v9);
                    }
                    break;
                case 66:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        int v5_6 = (v12_14 << 3);
                        int v8_2 = com.google.android.gms.internal.play_billing.zzgo.zzo(v1_0, v13_14);
                        v9 = v1.a.u(((v8_2 >> 31) ^ (v8_2 + v8_2)), com.google.android.gms.internal.play_billing.zzep.zzC(v5_6), v9);
                    }
                    break;
                case 67:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        int v5_3 = (v12_14 << 3);
                        int v10_1 = com.google.android.gms.internal.play_billing.zzgo.zzt(v1_0, v13_14);
                        int v12_0 = (v10_1 + v10_1);
                        int v10_2 = (v10_1 >> 63);
                        v5_4 = com.google.android.gms.internal.play_billing.zzep.zzC(v5_3);
                        v8_1 = com.google.android.gms.internal.play_billing.zzep.zzD((v10_2 ^ v12_0));
                    }
                    break;
                case 68:
                    if (!v0_0.zzM(v1_0, v12_14, v2_7)) {
                    } else {
                        v5_1 = com.google.android.gms.internal.play_billing.zzep.zzy(v12_14, ((com.google.android.gms.internal.play_billing.zzgl) v6_0.getObject(v1_0, v13_14)), v0_0.zzv(v2_7));
                    }
                    break;
                default:
            }
            v2_7 += 3;
            v1_0 = p18;
            v8_28 = 1048575;
        }
        int v1_5 = (((com.google.android.gms.internal.play_billing.zzfi) p18).zzc.zza() + v9);
        if (v0_0.zzh) {
            int v2_4 = ((com.google.android.gms.internal.play_billing.zzff) p18).zzb.zza;
            int v3_0 = v2_4.zzc();
            int v4_0 = 0;
            while (v7 < v3_0) {
                int v5_82 = v2_4.zzg(v7);
                v4_0 += com.google.android.gms.internal.play_billing.zzez.zzc(((com.google.android.gms.internal.play_billing.zzey) ((com.google.android.gms.internal.play_billing.zzgz) v5_82).zza()), v5_82.getValue());
                v7++;
            }
            int v2_6 = v2_4.zzd().iterator();
            while (v2_6.hasNext()) {
                int v3_3 = ((java.util.Map$Entry) v2_6.next());
                v4_0 += com.google.android.gms.internal.play_billing.zzez.zzc(((com.google.android.gms.internal.play_billing.zzey) v3_3.getKey()), v3_3.getValue());
            }
            v1_5 += v4_0;
        }
        return v1_5;
    }

    public final int zzb(Object p9)
    {
        int v0_0 = 0;
        int v1_0 = 0;
        while(true) {
            int v2_19 = this.zzc;
            if (v0_0 >= v2_19.length) {
                break;
            }
            int v2_8;
            int v1_4;
            int v1_1;
            int v2_6;
            int v1_2;
            int v2_2;
            int v3_0 = this.zzs(v0_0);
            int v2_29 = v2_19[v0_0];
            byte[] v4_3 = ((long) (1048575 & v3_0));
            int v6 = 37;
            switch (com.google.android.gms.internal.play_billing.zzgo.zzr(v3_0)) {
                case 0:
                    v1_2 = (v1_0 * 53);
                    v2_8 = Double.doubleToLongBits(com.google.android.gms.internal.play_billing.zzho.zza(p9, v4_3));
                    v2_6 = ((int) (v2_8 ^ (v2_8 >> 32)));
                    v1_0 = (v1_2 + v2_6);
                    break;
                case 1:
                    v1_1 = (v1_0 * 53);
                    v2_2 = Float.floatToIntBits(com.google.android.gms.internal.play_billing.zzho.zzb(p9, v4_3));
                    v1_0 = (v2_2 + v1_1);
                    break;
                case 2:
                    v1_2 = (v1_0 * 53);
                    v2_8 = com.google.android.gms.internal.play_billing.zzho.zzd(p9, v4_3);
                    break;
                case 3:
                    v1_2 = (v1_0 * 53);
                    v2_8 = com.google.android.gms.internal.play_billing.zzho.zzd(p9, v4_3);
                    break;
                case 4:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_3);
                    break;
                case 5:
                    v1_2 = (v1_0 * 53);
                    v2_8 = com.google.android.gms.internal.play_billing.zzho.zzd(p9, v4_3);
                    break;
                case 6:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_3);
                    break;
                case 7:
                    v1_1 = (v1_0 * 53);
                    v2_2 = com.google.android.gms.internal.play_billing.zzfo.zza(com.google.android.gms.internal.play_billing.zzho.zzw(p9, v4_3));
                    break;
                case 8:
                    v1_1 = (v1_0 * 53);
                    v2_2 = ((String) com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_3)).hashCode();
                    break;
                case 9:
                    v1_4 = (v1_0 * 53);
                    int v2_21 = com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_3);
                    if (v2_21 == 0) {
                        v1_0 = (v1_4 + v6);
                    } else {
                        v6 = v2_21.hashCode();
                    }
                    break;
                case 10:
                    v1_1 = (v1_0 * 53);
                    v2_2 = com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_3).hashCode();
                    break;
                case 11:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_3);
                    break;
                case 12:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_3);
                    break;
                case 13:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_3);
                    break;
                case 14:
                    v1_2 = (v1_0 * 53);
                    v2_8 = com.google.android.gms.internal.play_billing.zzho.zzd(p9, v4_3);
                    break;
                case 15:
                    v1_2 = (v1_0 * 53);
                    v2_6 = com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_3);
                    break;
                case 16:
                    v1_2 = (v1_0 * 53);
                    v2_8 = com.google.android.gms.internal.play_billing.zzho.zzd(p9, v4_3);
                    break;
                case 17:
                    v1_4 = (v1_0 * 53);
                    int v2_18 = com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_3);
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
                    v2_2 = com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_3).hashCode();
                    break;
                case 50:
                    v1_1 = (v1_0 * 53);
                    v2_2 = com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_3).hashCode();
                    break;
                case 51:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = Double.doubleToLongBits(com.google.android.gms.internal.play_billing.zzgo.zzm(p9, v4_3));
                    }
                    break;
                case 52:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = Float.floatToIntBits(com.google.android.gms.internal.play_billing.zzgo.zzn(p9, v4_3));
                    }
                    break;
                case 53:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = com.google.android.gms.internal.play_billing.zzgo.zzt(p9, v4_3);
                    }
                    break;
                case 54:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = com.google.android.gms.internal.play_billing.zzgo.zzt(p9, v4_3);
                    }
                    break;
                case 55:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.gms.internal.play_billing.zzgo.zzo(p9, v4_3);
                    }
                    break;
                case 56:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = com.google.android.gms.internal.play_billing.zzgo.zzt(p9, v4_3);
                    }
                    break;
                case 57:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.gms.internal.play_billing.zzgo.zzo(p9, v4_3);
                    }
                    break;
                case 58:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = com.google.android.gms.internal.play_billing.zzfo.zza(com.google.android.gms.internal.play_billing.zzgo.zzN(p9, v4_3));
                    }
                    break;
                case 59:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = ((String) com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_3)).hashCode();
                    }
                    break;
                case 60:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_3).hashCode();
                    }
                    break;
                case 61:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_3).hashCode();
                    }
                    break;
                case 62:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.gms.internal.play_billing.zzgo.zzo(p9, v4_3);
                    }
                    break;
                case 63:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.gms.internal.play_billing.zzgo.zzo(p9, v4_3);
                    }
                    break;
                case 64:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.gms.internal.play_billing.zzgo.zzo(p9, v4_3);
                    }
                    break;
                case 65:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = com.google.android.gms.internal.play_billing.zzgo.zzt(p9, v4_3);
                    }
                    break;
                case 66:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_6 = com.google.android.gms.internal.play_billing.zzgo.zzo(p9, v4_3);
                    }
                    break;
                case 67:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_2 = (v1_0 * 53);
                        v2_8 = com.google.android.gms.internal.play_billing.zzgo.zzt(p9, v4_3);
                    }
                    break;
                case 68:
                    if (!this.zzM(p9, v2_29, v0_0)) {
                    } else {
                        v1_1 = (v1_0 * 53);
                        v2_2 = com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_3).hashCode();
                    }
                    break;
                default:
            }
            v0_0 += 3;
        }
        int v0_2 = (((com.google.android.gms.internal.play_billing.zzfi) p9).zzc.hashCode() + (v1_0 * 53));
        if (this.zzh) {
            v0_2 = ((v0_2 * 53) + ((com.google.android.gms.internal.play_billing.zzff) p9).zzb.zza.hashCode());
        }
        return v0_2;
    }

    public final int zzc(Object p33, byte[] p34, int p35, int p36, int p37, com.google.android.gms.internal.play_billing.zzdw p38)
    {
        com.google.android.gms.internal.play_billing.zzfq v0_0 = this;
        int v2_0 = p33;
        int v3_11 = p34;
        java.nio.charset.Charset v4_8 = p36;
        int v6_3 = p38;
        com.google.android.gms.internal.play_billing.zzgo.zzA(p33);
        int v1_11 = com.google.android.gms.internal.play_billing.zzgo.zzb;
        int v11_6 = 0;
        int v12_15 = -1;
        long v5_3 = p35;
        com.google.android.gms.internal.play_billing.zzei v8_0 = 0;
        int v14_1 = 0;
        Object v15_1 = 0;
        com.google.android.gms.internal.play_billing.zzei v7_2 = -1;
        com.google.android.gms.internal.play_billing.zzfq v9_7 = 1048575;
        while (v5_3 < v4_8) {
            Object v15_2 = (v5_3 + 1);
            long v5_41 = v3_11[v5_3];
            if (v5_41 < 0) {
                v15_2 = com.google.android.gms.internal.play_billing.zzdx.zzj(v5_41, v3_11, v15_2, v6_3);
                v5_41 = v6_3.zza;
            }
            com.google.android.gms.internal.play_billing.zzei v7_18;
            int v6_25 = v15_2;
            v15_1 = v5_41;
            long v5_45 = (v15_1 >> 3);
            if (v5_45 <= v7_2) {
                if ((v5_45 < v0_0.zze) || (v5_45 > v0_0.zzf)) {
                    v7_18 = v12_15;
                } else {
                    v7_18 = v0_0.zzq(v5_45, v11_6);
                }
            } else {
                if ((v5_45 < v0_0.zze) || (v5_45 > v0_0.zzf)) {
                } else {
                    v7_18 = v0_0.zzq(v5_45, (v8_0 / 3));
                }
            }
            com.google.android.gms.internal.play_billing.zzfq v9_4;
            int v11_0;
            int v12_14;
            String v10_2;
            int v20_0;
            com.google.android.gms.internal.play_billing.zzfq v0_25;
            com.google.android.gms.internal.play_billing.zzei v7_1;
            if (v7_18 != v12_15) {
                int v28_0;
                com.google.android.gms.internal.play_billing.zzei v8_25 = (v15_1 & 7);
                int v11_9 = v0_0.zzc;
                int v12_32 = v11_9[(v7_18 + 1)];
                Integer v13_9 = com.google.android.gms.internal.play_billing.zzgo.zzr(v12_32);
                Integer v19_10 = ((long) (v12_32 & 1048575));
                int v25_1 = v5_45;
                if (v13_9 > 17) {
                    int v6_8;
                    int v3_21;
                    String v10_3;
                    long v5_63 = v1_11;
                    int v1_60 = v2_0;
                    int v28_1 = v6_25;
                    int v6_33 = v7_18;
                    int v24_1 = v14_1;
                    int v20_1 = v15_1;
                    int v14_6 = v19_10;
                    if (v13_9 != 27) {
                        int v11_12 = v1_60;
                        int v1_63 = v5_63;
                        long v5_65 = v6_33;
                        com.google.android.gms.internal.play_billing.zzei v7_32 = v20_1;
                        if (v13_9 > 49) {
                            v11_0 = v0_0;
                            v0_25 = v11_12;
                            v3_21 = v1_63;
                            v10_3 = v5_65;
                            v20_0 = v9_7;
                            v6_8 = v25_1;
                            v9_4 = v7_32;
                            if (v13_9 != 50) {
                                java.nio.charset.Charset v4_11;
                                int v23_0;
                                int v2_53;
                                com.google.android.gms.internal.play_billing.zzei v8_3;
                                int v2_61;
                                int v1_17;
                                int v2_40;
                                int v1_6;
                                com.google.android.gms.internal.play_billing.zzei v8_5;
                                Integer v19_1 = v12_32;
                                int v12_1 = ((long) (v11_9[(v10_3 + 2)] & 1048575));
                                switch (v13_9) {
                                    case 51:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_6 = v28_1;
                                        v28_0 = v10_3;
                                        v10_2 = v6_8;
                                        v6_3 = p38;
                                        if (v8_25 != 1) {
                                            v5_3 = v1_6;
                                        } else {
                                            v2_61 = (v1_6 + 8);
                                            v7_1.putObject(v0_25, v14_6, Double.valueOf(Double.longBitsToDouble(com.google.android.gms.internal.play_billing.zzdx.zzo(p34, v1_6))));
                                            v7_1.putInt(v0_25, v12_1, v10_2);
                                            v5_3 = v2_61;
                                        }
                                        break;
                                    case 52:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_6 = v28_1;
                                        v28_0 = v10_3;
                                        v10_2 = v6_8;
                                        v6_3 = p38;
                                        if (v8_25 != 5) {
                                        } else {
                                            v2_61 = (v1_6 + 4);
                                            v7_1.putObject(v0_25, v14_6, Float.valueOf(Float.intBitsToFloat(com.google.android.gms.internal.play_billing.zzdx.zzb(p34, v1_6))));
                                            v7_1.putInt(v0_25, v12_1, v10_2);
                                        }
                                        break;
                                    case 53:
                                    case 54:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_6 = v28_1;
                                        v28_0 = v10_3;
                                        v10_2 = v6_8;
                                        v6_3 = p38;
                                        if (v8_25 != null) {
                                        } else {
                                            v2_61 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v1_6, p38);
                                            v7_1.putObject(v0_25, v14_6, Long.valueOf(p38.zzb));
                                            v7_1.putInt(v0_25, v12_1, v10_2);
                                        }
                                        break;
                                    case 55:
                                    case 62:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_6 = v28_1;
                                        v28_0 = v10_3;
                                        v10_2 = v6_8;
                                        v6_3 = p38;
                                        if (v8_25 != null) {
                                        } else {
                                            v2_61 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v1_6, p38);
                                            v7_1.putObject(v0_25, v14_6, Integer.valueOf(p38.zza));
                                            v7_1.putInt(v0_25, v12_1, v10_2);
                                        }
                                        break;
                                    case 56:
                                    case 65:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_6 = v28_1;
                                        v28_0 = v10_3;
                                        v10_2 = v6_8;
                                        v6_3 = p38;
                                        if (v8_25 != 1) {
                                        } else {
                                            v2_61 = (v1_6 + 8);
                                            v7_1.putObject(v0_25, v14_6, Long.valueOf(com.google.android.gms.internal.play_billing.zzdx.zzo(p34, v1_6)));
                                            v7_1.putInt(v0_25, v12_1, v10_2);
                                        }
                                        break;
                                    case 57:
                                    case 64:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_6 = v28_1;
                                        v28_0 = v10_3;
                                        v10_2 = v6_8;
                                        v6_3 = p38;
                                        if (v8_25 != 5) {
                                        } else {
                                            v2_61 = (v1_6 + 4);
                                            v7_1.putObject(v0_25, v14_6, Integer.valueOf(com.google.android.gms.internal.play_billing.zzdx.zzb(p34, v1_6)));
                                            v7_1.putInt(v0_25, v12_1, v10_2);
                                        }
                                        break;
                                    case 58:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_6 = v28_1;
                                        v28_0 = v10_3;
                                        v10_2 = v6_8;
                                        v6_3 = p38;
                                        if (v8_25 != null) {
                                        } else {
                                            long v5_44;
                                            v2_61 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v1_6, p38);
                                            if (p38.zzb == 0) {
                                                v5_44 = 0;
                                            } else {
                                                v5_44 = 1;
                                            }
                                            v7_1.putObject(v0_25, v14_6, Boolean.valueOf(v5_44));
                                            v7_1.putInt(v0_25, v12_1, v10_2);
                                        }
                                        break;
                                    case 59:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_6 = v28_1;
                                        v28_0 = v10_3;
                                        v10_2 = v6_8;
                                        v6_3 = p38;
                                        if (v8_25 != 2) {
                                        } else {
                                            v5_3 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v1_6, p38);
                                            com.google.android.gms.internal.play_billing.zzei v8_23 = p38.zza;
                                            if (v8_23 != null) {
                                                java.nio.charset.Charset v4_32 = (v5_3 + v8_23);
                                                if (((v19_1 & 536870912) != 0) && (!com.google.android.gms.internal.play_billing.zzhr.zzd(p34, v5_3, v4_32))) {
                                                    throw new com.google.android.gms.internal.play_billing.zzfq("Protocol message had invalid UTF-8.");
                                                } else {
                                                    int v35_7 = v4_32;
                                                    v7_1.putObject(v0_25, v14_6, new String(p34, v5_3, v8_23, com.google.android.gms.internal.play_billing.zzfo.zza));
                                                    v5_3 = v35_7;
                                                }
                                            } else {
                                                v7_1.putObject(v0_25, v14_6, "");
                                            }
                                            v7_1.putInt(v0_25, v12_1, v10_2);
                                        }
                                        break;
                                    case 60:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        int v1_41 = v6_8;
                                        java.nio.charset.Charset v4_29 = v28_1;
                                        v6_3 = p38;
                                        if (v8_25 != 2) {
                                            v8_3 = v1_41;
                                            v1_6 = v4_29;
                                            v28_0 = v10_3;
                                            v10_2 = v8_3;
                                        } else {
                                            int v14_5 = v1_41;
                                            int v1_42 = v11_0.zzy(v0_25, v14_5, v10_3);
                                            v8_5 = v14_5;
                                            int v2_58 = com.google.android.gms.internal.play_billing.zzdx.zzn(v1_42, v11_0.zzv(v10_3), p34, v4_29, p36, p38);
                                            v1_6 = v4_29;
                                            v11_0 = v11_0.zzG(v0_25, v8_5, v10_3, v1_42);
                                            v5_3 = v2_58;
                                            v28_0 = v10_3;
                                            v10_2 = v8_5;
                                        }
                                        break;
                                    case 61:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_17 = v6_8;
                                        v4_11 = v28_1;
                                        v6_3 = p38;
                                        if (v8_25 != 2) {
                                            v28_0 = v10_3;
                                            v10_2 = v1_17;
                                            v1_6 = v4_11;
                                        } else {
                                            v2_53 = com.google.android.gms.internal.play_billing.zzdx.zza(p34, v4_11, p38);
                                            v7_1.putObject(v0_25, v14_6, p38.zzc);
                                            v7_1.putInt(v0_25, v12_1, v1_17);
                                            v5_3 = v2_53;
                                            v28_0 = v10_3;
                                            v10_2 = v1_17;
                                            v1_6 = v4_11;
                                        }
                                        break;
                                    case 63:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_17 = v6_8;
                                        int v23_1 = v9_4;
                                        v4_11 = v28_1;
                                        v6_3 = p38;
                                        if (v8_25 != null) {
                                            v9_4 = v23_1;
                                        } else {
                                            v2_53 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v4_11, p38);
                                            long v5_35 = p38.zza;
                                            com.google.android.gms.internal.play_billing.zzei v8_20 = v11_0.zzu(v10_3);
                                            if ((v8_20 != null) && (!v8_20.zza(v5_35))) {
                                                v9_4 = v23_1;
                                                com.google.android.gms.internal.play_billing.zzgo.zzd(v0_25).zzj(v9_4, Long.valueOf(((long) v5_35)));
                                            } else {
                                                v9_4 = v23_1;
                                                v7_1.putObject(v0_25, v14_6, Integer.valueOf(v5_35));
                                                v7_1.putInt(v0_25, v12_1, v1_17);
                                            }
                                        }
                                        break;
                                    case 66:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_17 = v6_8;
                                        v23_0 = v9_4;
                                        v4_11 = v28_1;
                                        v6_3 = p38;
                                        if (v8_25 != null) {
                                            v28_0 = v10_3;
                                            v9_4 = v23_0;
                                        } else {
                                            v2_40 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v4_11, p38);
                                            v7_1.putObject(v0_25, v14_6, Integer.valueOf(com.google.android.gms.internal.play_billing.zzel.zzb(p38.zza)));
                                            v7_1.putInt(v0_25, v12_1, v1_17);
                                            v5_3 = v2_40;
                                            v28_0 = v10_3;
                                            v9_4 = v23_0;
                                        }
                                        break;
                                    case 67:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_17 = v6_8;
                                        v4_11 = v28_1;
                                        v6_3 = p38;
                                        if (v8_25 != null) {
                                        } else {
                                            v2_40 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v4_11, p38);
                                            v23_0 = v9_4;
                                            v7_1.putObject(v0_25, v14_6, Long.valueOf(com.google.android.gms.internal.play_billing.zzel.zzc(p38.zzb)));
                                            v7_1.putInt(v0_25, v12_1, v1_17);
                                        }
                                        break;
                                    case 68:
                                        if (v8_25 != 3) {
                                            v8_3 = v6_8;
                                            v7_1 = v3_21;
                                            v3_11 = p34;
                                            v6_3 = p38;
                                            v1_6 = v28_1;
                                        } else {
                                            int v2_18 = ((v9_4 & -8) | 4);
                                            int v1_9 = v11_0.zzy(v0_25, v6_8, v10_3);
                                            Integer v13_3 = v3_21;
                                            v3_11 = p34;
                                            v8_5 = v6_8;
                                            java.nio.charset.Charset v4_7 = v28_1;
                                            int v2_31 = com.google.android.gms.internal.play_billing.zzdx.zzm(v1_9, v11_0.zzv(v10_3), p34, v4_7, p36, v2_18, p38);
                                            v6_3 = p38;
                                            v11_0 = v11_0.zzG(v0_25, v8_5, v10_3, v1_9);
                                            v5_3 = v2_31;
                                            v1_6 = v4_7;
                                            v28_0 = v10_3;
                                            v7_1 = v13_3;
                                        }
                                        break;
                                    default:
                                        v7_1 = v3_21;
                                        v3_11 = p34;
                                        v1_6 = v28_1;
                                        v28_0 = v10_3;
                                        v10_2 = v6_8;
                                        v6_3 = p38;
                                }
                                if (v5_3 == v1_6) {
                                    v12_14 = p37;
                                    v14_1 = v24_1;
                                    v8_0 = v28_0;
                                    if ((v9_4 != v12_14) || (v12_14 == 0)) {
                                        int v1_31;
                                        int v3_48;
                                        if (!v11_0.zzh) {
                                            v1_31 = v9_4;
                                            v4_8 = p36;
                                            v3_48 = com.google.android.gms.internal.play_billing.zzdx.zzh(v1_31, p34, v5_3, p36, com.google.android.gms.internal.play_billing.zzgo.zzd(v0_25), p38);
                                        } else {
                                            int v1_30 = v6_3.zzd;
                                            int v2 = com.google.android.gms.internal.play_billing.zzgs.zza;
                                            if (v1_30 == com.google.android.gms.internal.play_billing.zzeu.zza) {
                                            } else {
                                                if (v1_30.zzb(v11_0.zzg, v10_2) != null) {
                                                    throw 0;
                                                } else {
                                                    v4_8 = p36;
                                                    v1_31 = v9_4;
                                                    v3_48 = com.google.android.gms.internal.play_billing.zzdx.zzh(v1_31, p34, v5_3, p36, com.google.android.gms.internal.play_billing.zzgo.zzd(v0_25), v6_3);
                                                }
                                            }
                                        }
                                        v5_3 = v3_48;
                                        v3_11 = p34;
                                        v6_3 = p38;
                                        v2_0 = v0_25;
                                        v15_1 = v1_31;
                                        v1_11 = v7_1;
                                        v7_2 = v10_2;
                                        v0_0 = v11_0;
                                        v9_7 = v20_0;
                                        v11_6 = 0;
                                    } else {
                                        v4_8 = p36;
                                        v15_1 = v9_4;
                                        v9_7 = v20_0;
                                        if (v9_7 != 1048575) {
                                            v7_1.putInt(v0_25, ((long) v9_7), v14_1);
                                        }
                                        int v1_34 = v11_0.zzj;
                                        while (v1_34 < v11_0.zzk) {
                                            int v2_56 = v11_0.zzi[v1_34];
                                            if ((com.google.android.gms.internal.play_billing.zzho.zzf(v0_25, ((long) (v11_0.zzs(v2_56) & 1048575))) != null) && (v11_0.zzu(v2_56) != null)) {
                                                v11_0.zzw(v2_56);
                                                throw 0;
                                            } else {
                                                v1_34++;
                                            }
                                        }
                                        if (v12_14 != 0) {
                                            if ((v5_3 > v4_8) || (v15_1 != v12_14)) {
                                                throw new com.google.android.gms.internal.play_billing.zzfq("Failed to parse the message.");
                                            }
                                        } else {
                                            if (v5_3 != v4_8) {
                                                throw new com.google.android.gms.internal.play_billing.zzfq("Failed to parse the message.");
                                            }
                                        }
                                        return v5_3;
                                    }
                                    v12_15 = -1;
                                } else {
                                    v4_8 = p36;
                                    v2_0 = v0_25;
                                    v1_11 = v7_1;
                                    v15_1 = v9_4;
                                    v7_2 = v10_2;
                                    v0_0 = v11_0;
                                    v9_7 = v20_0;
                                    v14_1 = v24_1;
                                    v8_0 = v28_0;
                                }
                            } else {
                                if (v8_25 == 2) {
                                    v11_0.zzw(v10_3);
                                    int v2_66 = v3_21.getObject(v0_25, v14_6);
                                    if (!((com.google.android.gms.internal.play_billing.zzgf) v2_66).zze()) {
                                        java.nio.charset.Charset v4_55 = com.google.android.gms.internal.play_billing.zzgf.zza().zzb();
                                        com.google.android.gms.internal.play_billing.zzgg.zza(v4_55, v2_66);
                                        v3_21.putObject(v0_25, v14_6, v4_55);
                                    }
                                    throw 0;
                                }
                            }
                        } else {
                            v20_0 = v9_7;
                            com.google.android.gms.internal.play_billing.zzfq v9_15 = ((long) v12_32);
                            int v6_27 = ((com.google.android.gms.internal.play_billing.zzfn) v1_63.getObject(v11_12, v14_6));
                            if (!v6_27.zzc()) {
                                v6_27 = v6_27.zzd((v6_27.size() + v6_27.size()));
                                v1_63.putObject(v11_12, v14_6, v6_27);
                            }
                            Object v15_0;
                            Integer v13_4;
                            int v3_55;
                            int v12_0;
                            int v2_3;
                            com.google.android.gms.internal.play_billing.zzfq v0_1;
                            com.google.android.gms.internal.play_billing.zzfq v9_6;
                            java.nio.charset.Charset v4_0;
                            int v2_30;
                            Integer v19_0;
                            int v14_0;
                            java.nio.charset.Charset v4_56;
                            java.nio.charset.Charset v4_57;
                            int v14_3;
                            long v5_61;
                            String v10_0;
                            long v5_0;
                            int v1_3;
                            com.google.android.gms.internal.play_billing.zzei v7_0;
                            int v6_0;
                            int v12_28 = v6_27;
                            switch (v13_9) {
                                case 18:
                                case 35:
                                    v19_0 = v1_63;
                                    v15_0 = v5_65;
                                    v9_4 = v7_32;
                                    int v14_2 = v25_1;
                                    v10_0 = v28_1;
                                    v7_0 = p34;
                                    v5_0 = p36;
                                    v1_3 = p38;
                                    v11_0 = v0_0;
                                    com.google.android.gms.internal.play_billing.zzfq v0_19 = v12_28;
                                    if (v8_25 != 2) {
                                        v25_1 = v14_2;
                                        if (v8_25 != 1) {
                                            v0_1 = v10_0;
                                        } else {
                                            int v6_4 = (v10_0 + 8);
                                            int v12_11 = ((com.google.android.gms.internal.play_billing.zzer) v0_19);
                                            v12_11.zzf(Double.longBitsToDouble(com.google.android.gms.internal.play_billing.zzdx.zzo(p34, v10_0)));
                                            while (v6_4 < p36) {
                                                com.google.android.gms.internal.play_billing.zzfq v0_20 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v6_4, p38);
                                                if (v9_4 != p38.zza) {
                                                    break;
                                                }
                                                v12_11.zzf(Double.longBitsToDouble(com.google.android.gms.internal.play_billing.zzdx.zzo(p34, v0_20)));
                                                v6_4 = (v0_20 + 8);
                                            }
                                            v0_1 = v6_4;
                                        }
                                    } else {
                                        int v12_13 = ((com.google.android.gms.internal.play_billing.zzer) v0_19);
                                        v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v10_0, p38);
                                        int v2_24 = p38.zza;
                                        int v3_15 = (v0_1 + v2_24);
                                        if (v3_15 > p34.length) {
                                            throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        } else {
                                            v12_13.zzg(((v2_24 / 8) + v12_13.size()));
                                            while (v0_1 < v3_15) {
                                                int v25_3 = v14_2;
                                                v12_13.zzf(Double.longBitsToDouble(com.google.android.gms.internal.play_billing.zzdx.zzo(p34, v0_1)));
                                                v0_1 += 8;
                                                v14_2 = v25_3;
                                            }
                                            v25_1 = v14_2;
                                            if (v0_1 != v3_15) {
                                                throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            } else {
                                            }
                                        }
                                    }
                                case 19:
                                case 36:
                                    v19_0 = v1_63;
                                    v15_0 = v5_65;
                                    v9_4 = v7_32;
                                    v14_0 = v25_1;
                                    v10_0 = v28_1;
                                    v7_0 = p34;
                                    v5_0 = p36;
                                    v1_3 = p38;
                                    v11_0 = v0_0;
                                    com.google.android.gms.internal.play_billing.zzfq v0_11 = v12_28;
                                    if (v8_25 != 2) {
                                        if (v8_25 != 5) {
                                            v25_1 = v14_0;
                                        } else {
                                            int v6_2 = (v10_0 + 4);
                                            int v12_7 = ((com.google.android.gms.internal.play_billing.zzfb) v0_11);
                                            v12_7.zzf(Float.intBitsToFloat(com.google.android.gms.internal.play_billing.zzdx.zzb(p34, v10_0)));
                                            while (v6_2 < p36) {
                                                com.google.android.gms.internal.play_billing.zzfq v0_14 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v6_2, p38);
                                                if (v9_4 != p38.zza) {
                                                    break;
                                                }
                                                v12_7.zzf(Float.intBitsToFloat(com.google.android.gms.internal.play_billing.zzdx.zzb(p34, v0_14)));
                                                v6_2 = (v0_14 + 4);
                                            }
                                            v0_1 = v6_2;
                                            v25_1 = v14_0;
                                        }
                                    } else {
                                        int v12_9 = ((com.google.android.gms.internal.play_billing.zzfb) v0_11);
                                        v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v10_0, p38);
                                        int v2_13 = p38.zza;
                                        int v3_12 = (v0_1 + v2_13);
                                        if (v3_12 > p34.length) {
                                            throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        } else {
                                            v12_9.zzg(((v2_13 / 4) + v12_9.size()));
                                            while (v0_1 < v3_12) {
                                                v12_9.zzf(Float.intBitsToFloat(com.google.android.gms.internal.play_billing.zzdx.zzb(p34, v0_1)));
                                                v0_1 += 4;
                                            }
                                            if (v0_1 != v3_12) {
                                                throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                    }
                                    break;
                                case 20:
                                case 21:
                                case 37:
                                case 38:
                                    v19_0 = v1_63;
                                    v15_0 = v5_65;
                                    v9_4 = v7_32;
                                    v14_0 = v25_1;
                                    v10_0 = v28_1;
                                    v7_0 = p34;
                                    v5_0 = p36;
                                    v1_3 = p38;
                                    v11_0 = v0_0;
                                    com.google.android.gms.internal.play_billing.zzfq v0_8 = v12_28;
                                    if (v8_25 != 2) {
                                        if (v8_25 != null) {
                                        } else {
                                            int v12_3 = ((com.google.android.gms.internal.play_billing.zzga) v0_8);
                                            v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v10_0, p38);
                                            v12_3.zzf(p38.zzb);
                                            while (v0_1 < p36) {
                                                int v2_6 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v0_1, p38);
                                                if (v9_4 != p38.zza) {
                                                    break;
                                                }
                                                v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v2_6, p38);
                                                v12_3.zzf(p38.zzb);
                                            }
                                        }
                                    } else {
                                        int v12_5 = ((com.google.android.gms.internal.play_billing.zzga) v0_8);
                                        v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v10_0, p38);
                                        int v2_9 = (p38.zza + v0_1);
                                        while (v0_1 < v2_9) {
                                            v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v0_1, p38);
                                            v12_5.zzf(p38.zzb);
                                        }
                                        if (v0_1 != v2_9) {
                                            throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    break;
                                case 22:
                                case 29:
                                case 39:
                                case 43:
                                    v19_0 = v1_63;
                                    v15_0 = v5_65;
                                    com.google.android.gms.internal.play_billing.zzfq v9_3 = v12_28;
                                    v14_0 = v25_1;
                                    v4_0 = v28_1;
                                    v5_0 = p36;
                                    v1_3 = p38;
                                    v11_0 = v0_0;
                                    v12_0 = v7_32;
                                    v7_0 = p34;
                                    if (v8_25 != 2) {
                                        if (v8_25 != null) {
                                            v10_0 = v4_0;
                                            v9_4 = v12_0;
                                        } else {
                                            int v3_5 = v4_0;
                                            int v1_4 = v12_0;
                                            v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzk(v1_4, p34, v3_5, p36, v9_3, p38);
                                            v9_4 = v1_4;
                                            v10_0 = v3_5;
                                            v5_0 = p36;
                                            v1_3 = p38;
                                        }
                                    } else {
                                        v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzf(p34, v4_0, v9_3, p38);
                                        v10_0 = v4_0;
                                        v9_4 = v12_0;
                                    }
                                    break;
                                case 23:
                                case 32:
                                case 40:
                                case 46:
                                    v19_0 = v1_63;
                                    v15_0 = v5_65;
                                    com.google.android.gms.internal.play_billing.zzfq v9_25 = v12_28;
                                    v14_0 = v25_1;
                                    v4_0 = v28_1;
                                    v5_0 = p36;
                                    v1_3 = p38;
                                    v11_0 = v0_0;
                                    v12_0 = v7_32;
                                    v7_0 = p34;
                                    if (v8_25 != 2) {
                                        if (v8_25 != 1) {
                                        } else {
                                            v6_0 = (v4_0 + 8);
                                            com.google.android.gms.internal.play_billing.zzfq v0_73 = ((com.google.android.gms.internal.play_billing.zzga) v9_25);
                                            v0_73.zzf(com.google.android.gms.internal.play_billing.zzdx.zzo(p34, v4_0));
                                            while (v6_0 < p36) {
                                                int v2_2 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v6_0, p38);
                                                if (v12_0 != p38.zza) {
                                                    break;
                                                }
                                                v0_73.zzf(com.google.android.gms.internal.play_billing.zzdx.zzo(p34, v2_2));
                                                v6_0 = (v2_2 + 8);
                                            }
                                            v10_0 = v4_0;
                                            v0_1 = v6_0;
                                        }
                                    } else {
                                        com.google.android.gms.internal.play_billing.zzfq v0_3 = ((com.google.android.gms.internal.play_billing.zzga) v9_25);
                                        v2_3 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v4_0, p38);
                                        int v3_1 = p38.zza;
                                        com.google.android.gms.internal.play_billing.zzei v8_2 = (v2_3 + v3_1);
                                        if (v8_2 > p34.length) {
                                            throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        } else {
                                            v0_3.zzg(((v3_1 / 8) + v0_3.size()));
                                            while (v2_3 < v8_2) {
                                                v0_3.zzf(com.google.android.gms.internal.play_billing.zzdx.zzo(p34, v2_3));
                                                v2_3 += 8;
                                            }
                                            if (v2_3 != v8_2) {
                                                throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            } else {
                                                v0_1 = v2_3;
                                            }
                                        }
                                    }
                                    break;
                                case 24:
                                case 31:
                                case 41:
                                case 45:
                                    v19_0 = v1_63;
                                    v15_0 = v5_65;
                                    com.google.android.gms.internal.play_billing.zzfq v9_22 = v12_28;
                                    v14_0 = v25_1;
                                    v4_0 = v28_1;
                                    v5_0 = p36;
                                    v1_3 = p38;
                                    v11_0 = v0_0;
                                    v12_0 = v7_32;
                                    v7_0 = p34;
                                    if (v8_25 != 2) {
                                        if (v8_25 != 5) {
                                        } else {
                                            v6_0 = (v4_0 + 4);
                                            com.google.android.gms.internal.play_billing.zzfq v0_65 = ((com.google.android.gms.internal.play_billing.zzfj) v9_22);
                                            v0_65.zzg(com.google.android.gms.internal.play_billing.zzdx.zzb(p34, v4_0));
                                            while (v6_0 < p36) {
                                                int v2_74 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v6_0, p38);
                                                if (v12_0 != p38.zza) {
                                                    break;
                                                }
                                                v0_65.zzg(com.google.android.gms.internal.play_billing.zzdx.zzb(p34, v2_74));
                                                v6_0 = (v2_74 + 4);
                                            }
                                        }
                                    } else {
                                        com.google.android.gms.internal.play_billing.zzfq v0_67 = ((com.google.android.gms.internal.play_billing.zzfj) v9_22);
                                        v2_3 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v4_0, p38);
                                        int v3_80 = p38.zza;
                                        com.google.android.gms.internal.play_billing.zzei v8_54 = (v2_3 + v3_80);
                                        if (v8_54 > p34.length) {
                                            throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        } else {
                                            v0_67.zzh(((v3_80 / 4) + v0_67.size()));
                                            while (v2_3 < v8_54) {
                                                v0_67.zzg(com.google.android.gms.internal.play_billing.zzdx.zzb(p34, v2_3));
                                                v2_3 += 4;
                                            }
                                            if (v2_3 != v8_54) {
                                                throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                    }
                                    break;
                                case 25:
                                case 42:
                                    v19_0 = v1_63;
                                    v15_0 = v5_65;
                                    com.google.android.gms.internal.play_billing.zzfq v9_21 = v12_28;
                                    v14_0 = v25_1;
                                    v4_0 = v28_1;
                                    v5_0 = p36;
                                    v1_3 = p38;
                                    v11_0 = v0_0;
                                    v12_0 = v7_32;
                                    v7_0 = p34;
                                    if (v8_25 != 2) {
                                        if (v8_25 != null) {
                                        } else {
                                            int v3_70;
                                            com.google.android.gms.internal.play_billing.zzfq v0_59 = ((com.google.android.gms.internal.play_billing.zzdy) v9_21);
                                            v2_3 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v4_0, p38);
                                            if (p38.zzb == 0) {
                                                v3_70 = 0;
                                            } else {
                                                v3_70 = 1;
                                            }
                                            v0_59.zze(v3_70);
                                            while (v2_3 < p36) {
                                                int v3_71 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v2_3, p38);
                                                if (v12_0 != p38.zza) {
                                                    break;
                                                }
                                                int v3_73;
                                                v2_3 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v3_71, p38);
                                                if (p38.zzb == 0) {
                                                    v3_73 = 0;
                                                } else {
                                                    v3_73 = 1;
                                                }
                                                v0_59.zze(v3_73);
                                            }
                                        }
                                    } else {
                                        com.google.android.gms.internal.play_billing.zzfq v0_61 = ((com.google.android.gms.internal.play_billing.zzdy) v9_21);
                                        v2_3 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v4_0, p38);
                                        int v3_75 = (p38.zza + v2_3);
                                        while (v2_3 < v3_75) {
                                            com.google.android.gms.internal.play_billing.zzei v8_53;
                                            v2_3 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v2_3, p38);
                                            if (p38.zzb == 0) {
                                                v8_53 = 0;
                                            } else {
                                                v8_53 = 1;
                                            }
                                            v0_61.zze(v8_53);
                                        }
                                        if (v2_3 != v3_75) {
                                            throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    break;
                                case 26:
                                    v19_0 = v1_63;
                                    v15_0 = v5_65;
                                    v14_0 = v25_1;
                                    int v6_35 = v28_1;
                                    v5_0 = p36;
                                    v1_3 = p38;
                                    v11_0 = v0_0;
                                    com.google.android.gms.internal.play_billing.zzfq v9_20 = v12_28;
                                    v12_0 = v7_32;
                                    v7_0 = p34;
                                    if (v8_25 != 2) {
                                        v10_0 = v6_35;
                                    } else {
                                        if ((v9_15 & 536870912) != 0) {
                                            v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v6_35, p38);
                                            com.google.android.gms.internal.play_billing.zzei v8_40 = p38.zza;
                                            if (v8_40 < null) {
                                                throw new com.google.android.gms.internal.play_billing.zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            } else {
                                                int v28_2;
                                                int v35_9;
                                                if (v8_40 != null) {
                                                    String v10_10 = (v0_1 + v8_40);
                                                    if (!com.google.android.gms.internal.play_billing.zzhr.zzd(p34, v0_1, v10_10)) {
                                                        throw new com.google.android.gms.internal.play_billing.zzfq("Protocol message had invalid UTF-8.");
                                                    } else {
                                                        v28_2 = v6_35;
                                                        v35_9 = v10_10;
                                                        v9_20.add(new String(p34, v0_1, v8_40, com.google.android.gms.internal.play_billing.zzfo.zza));
                                                    }
                                                } else {
                                                    v9_20.add("");
                                                    v28_2 = v6_35;
                                                    while (v0_1 < p36) {
                                                        int v6_38 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v0_1, p38);
                                                        if (v12_0 != p38.zza) {
                                                            break;
                                                        }
                                                        v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v6_38, p38);
                                                        int v6_39 = p38.zza;
                                                        if (v6_39 < 0) {
                                                            throw new com.google.android.gms.internal.play_billing.zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        } else {
                                                            if (v6_39 != 0) {
                                                                com.google.android.gms.internal.play_billing.zzei v8_42 = (v0_1 + v6_39);
                                                                if (!com.google.android.gms.internal.play_billing.zzhr.zzd(p34, v0_1, v8_42)) {
                                                                    throw new com.google.android.gms.internal.play_billing.zzfq("Protocol message had invalid UTF-8.");
                                                                } else {
                                                                    v35_9 = v8_42;
                                                                    v9_20.add(new String(p34, v0_1, v6_39, com.google.android.gms.internal.play_billing.zzfo.zza));
                                                                    v0_1 = v35_9;
                                                                }
                                                            } else {
                                                                v9_20.add("");
                                                            }
                                                        }
                                                    }
                                                    v9_4 = v12_0;
                                                    v25_1 = v14_0;
                                                    v10_0 = v28_2;
                                                }
                                            }
                                        } else {
                                            v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v6_35, p38);
                                            int v2_70 = p38.zza;
                                            if (v2_70 < 0) {
                                                throw new com.google.android.gms.internal.play_billing.zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            } else {
                                                if (v2_70 != 0) {
                                                    v9_20.add(new String(p34, v0_1, v2_70, com.google.android.gms.internal.play_billing.zzfo.zza));
                                                } else {
                                                    v9_20.add("");
                                                    while (v0_1 < p36) {
                                                        int v2_71 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v0_1, p38);
                                                        if (v12_0 != p38.zza) {
                                                            break;
                                                        }
                                                        v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v2_71, p38);
                                                        v2_70 = p38.zza;
                                                        if (v2_70 < 0) {
                                                            throw new com.google.android.gms.internal.play_billing.zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        } else {
                                                            if (v2_70 != 0) {
                                                                v9_20.add(new String(p34, v0_1, v2_70, com.google.android.gms.internal.play_billing.zzfo.zza));
                                                                v0_1 += v2_70;
                                                            } else {
                                                                v9_20.add("");
                                                            }
                                                        }
                                                    }
                                                    v10_0 = v6_35;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 27:
                                    v4_57 = p36;
                                    v19_0 = v1_63;
                                    v15_0 = v5_65;
                                    int v1_61 = v7_32;
                                    v14_3 = v25_1;
                                    long v5_64 = v28_1;
                                    if (v8_25 != 2) {
                                        v11_0 = this;
                                        v7_0 = p34;
                                        v10_0 = v5_64;
                                        v1_3 = p38;
                                        v9_4 = v1_61;
                                        v25_1 = v14_3;
                                        v5_0 = v4_57;
                                    } else {
                                        v11_0 = this;
                                        v5_0 = p36;
                                        java.nio.charset.Charset v4_59 = v5_64;
                                        int v2_68 = v1_61;
                                        v0_1 = com.google.android.gms.internal.play_billing.zzdx.zze(this.zzv(v15_0), v2_68, p34, v4_59, p36, v12_28, p38);
                                        v9_4 = v2_68;
                                        v10_0 = v4_59;
                                        v1_3 = p38;
                                        v25_1 = v14_3;
                                        v7_0 = p34;
                                    }
                                    break;
                                case 28:
                                    v2_30 = p34;
                                    v4_57 = p36;
                                    v19_0 = v1_63;
                                    v15_0 = v5_65;
                                    int v1_59 = v7_32;
                                    String v10_8 = v12_28;
                                    v14_3 = v25_1;
                                    v5_61 = v28_1;
                                    if (v8_25 != 2) {
                                        v9_4 = v1_59;
                                        v1_3 = p38;
                                        v11_0 = this;
                                        v7_0 = p34;
                                        v10_0 = v5_61;
                                    } else {
                                        v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v5_61, p38);
                                        com.google.android.gms.internal.play_billing.zzei v7_24 = p38.zza;
                                        if (v7_24 < null) {
                                            throw new com.google.android.gms.internal.play_billing.zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        } else {
                                            if (v7_24 > (p34.length - v0_1)) {
                                                throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            } else {
                                                if (v7_24 != null) {
                                                    v10_8.add(com.google.android.gms.internal.play_billing.zzei.zzj(p34, v0_1, v7_24));
                                                } else {
                                                    v10_8.add(com.google.android.gms.internal.play_billing.zzei.zzb);
                                                    while (v0_1 < p36) {
                                                        com.google.android.gms.internal.play_billing.zzei v7_26 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v0_1, p38);
                                                        if (v1_59 != p38.zza) {
                                                            break;
                                                        }
                                                        v0_1 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v7_26, p38);
                                                        v7_24 = p38.zza;
                                                        if (v7_24 < null) {
                                                            throw new com.google.android.gms.internal.play_billing.zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        } else {
                                                            if (v7_24 > (p34.length - v0_1)) {
                                                                throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            } else {
                                                                if (v7_24 != null) {
                                                                    v10_8.add(com.google.android.gms.internal.play_billing.zzei.zzj(p34, v0_1, v7_24));
                                                                    v0_1 += v7_24;
                                                                } else {
                                                                    v10_8.add(com.google.android.gms.internal.play_billing.zzei.zzb);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    v9_4 = v1_59;
                                                    v1_3 = p38;
                                                    v11_0 = this;
                                                    v7_0 = v2_30;
                                                    v10_0 = v5_61;
                                                    v25_1 = v14_3;
                                                    v5_0 = v4_57;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 30:
                                case 44:
                                    String v10_6;
                                    int v1_58;
                                    int v3_61;
                                    com.google.android.gms.internal.play_billing.zzfq v9_17;
                                    v2_30 = p34;
                                    v4_57 = p36;
                                    Integer v13_10 = v1_63;
                                    v15_0 = v5_65;
                                    v14_3 = v25_1;
                                    com.google.android.gms.internal.play_billing.zzfq v9_16 = v28_1;
                                    v1_3 = p38;
                                    if (v8_25 != 2) {
                                        if (v8_25 != null) {
                                            v19_0 = v13_10;
                                            v11_0 = this;
                                            v5_0 = p36;
                                            v10_0 = v9_16;
                                            v25_1 = v14_3;
                                            v9_4 = v7_32;
                                            v7_0 = v2_30;
                                        } else {
                                            v1_58 = v7_32;
                                            int v3_60 = v9_16;
                                            long v5_60 = v12_28;
                                            v10_6 = v5_60;
                                            v9_17 = p38;
                                            v5_61 = v3_60;
                                            v3_61 = com.google.android.gms.internal.play_billing.zzdx.zzk(v1_58, p34, v3_60, p36, v5_60, p38);
                                        }
                                    } else {
                                        v3_61 = com.google.android.gms.internal.play_billing.zzdx.zzf(p34, v9_16, v12_28, p38);
                                        v5_61 = v9_16;
                                        v10_6 = v12_28;
                                        v9_17 = p38;
                                        v1_58 = v7_32;
                                    }
                                    int v35_8;
                                    int v6_32 = v0_0.zzu(v15_0);
                                    com.google.android.gms.internal.play_billing.zzei v7_22 = v0_0.zzl;
                                    if (v6_32 == 0) {
                                        v35_8 = v3_61;
                                        v19_0 = v13_10;
                                    } else {
                                        if (v10_6 == null) {
                                            v35_8 = v3_61;
                                            v19_0 = v13_10;
                                            com.google.android.gms.internal.play_billing.zzfq v0_30 = v10_6.iterator();
                                            int v3_62 = 0;
                                            while (v0_30.hasNext()) {
                                                com.google.android.gms.internal.play_billing.zzei v8_31 = ((Integer) v0_30.next()).intValue();
                                                if (!v6_32.zza(v8_31)) {
                                                    v3_62 = com.google.android.gms.internal.play_billing.zzgx.zzn(p33, v14_3, v8_31, v3_62, v7_22);
                                                    v0_30.remove();
                                                }
                                            }
                                        } else {
                                            com.google.android.gms.internal.play_billing.zzei v8_32 = v10_6.size();
                                            v35_8 = v3_61;
                                            int v3_64 = 0;
                                            int v11_10 = 0;
                                            int v12_34 = 0;
                                            while (v11_10 < v8_32) {
                                                Integer v19_11 = v13_10;
                                                Integer v13_13 = ((Integer) v10_6.get(v11_10));
                                                com.google.android.gms.internal.play_billing.zzfq v0_33 = v13_13.intValue();
                                                if (!v6_32.zza(v0_33)) {
                                                    v3_64 = com.google.android.gms.internal.play_billing.zzgx.zzn(p33, v14_3, v0_33, v3_64, v7_22);
                                                } else {
                                                    if (v11_10 != v12_34) {
                                                        v10_6.set(v12_34, v13_13);
                                                    }
                                                    v12_34++;
                                                }
                                                v11_10++;
                                                v13_10 = v19_11;
                                            }
                                            v19_0 = v13_10;
                                            if (v12_34 != v8_32) {
                                                v10_6.subList(v12_34, v8_32).clear();
                                            }
                                        }
                                    }
                                    v9_4 = v1_58;
                                    v1_3 = v9_17;
                                    v11_0 = this;
                                    v0_1 = v35_8;
                                    break;
                                case 33:
                                case 47:
                                    v2_30 = p34;
                                    v4_56 = p36;
                                    v13_4 = v1_63;
                                    v15_0 = v5_65;
                                    v14_3 = v25_1;
                                    v9_6 = v28_1;
                                    v1_3 = p38;
                                    if (v8_25 != 2) {
                                        if (v8_25 != null) {
                                            v11_0 = v0_0;
                                            v5_0 = v4_56;
                                            v10_0 = v9_6;
                                            v19_0 = v13_4;
                                        } else {
                                            int v12_31 = ((com.google.android.gms.internal.play_billing.zzfj) v12_28);
                                            v3_55 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v9_6, p38);
                                            v12_31.zzg(com.google.android.gms.internal.play_billing.zzel.zzb(p38.zza));
                                            while (v3_55 < p36) {
                                                long v5_55 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v3_55, p38);
                                                if (v7_32 != p38.zza) {
                                                    break;
                                                }
                                                v3_55 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v5_55, p38);
                                                v12_31.zzg(com.google.android.gms.internal.play_billing.zzel.zzb(p38.zza));
                                            }
                                            v11_0 = v0_0;
                                            v0_1 = v3_55;
                                            v5_0 = v4_56;
                                            v10_0 = v9_6;
                                            v19_0 = v13_4;
                                            v25_1 = v14_3;
                                            v9_4 = v7_32;
                                            v7_0 = v2_30;
                                        }
                                    } else {
                                        int v12_33 = ((com.google.android.gms.internal.play_billing.zzfj) v12_28);
                                        v3_55 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v9_6, p38);
                                        long v5_59 = (p38.zza + v3_55);
                                        while (v3_55 < v5_59) {
                                            v3_55 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v3_55, p38);
                                            v12_33.zzg(com.google.android.gms.internal.play_billing.zzel.zzb(p38.zza));
                                        }
                                        if (v3_55 != v5_59) {
                                            throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    break;
                                case 34:
                                case 48:
                                    v2_30 = p34;
                                    v4_56 = p36;
                                    v13_4 = v1_63;
                                    v15_0 = v5_65;
                                    v14_3 = v25_1;
                                    v9_6 = v28_1;
                                    v1_3 = p38;
                                    if (v8_25 != 2) {
                                        if (v8_25 != null) {
                                        } else {
                                            int v12_29 = ((com.google.android.gms.internal.play_billing.zzga) v12_28);
                                            v3_55 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v9_6, p38);
                                            v12_29.zzf(com.google.android.gms.internal.play_billing.zzel.zzc(p38.zzb));
                                            while (v3_55 < p36) {
                                                long v5_48 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v3_55, p38);
                                                if (v7_32 != p38.zza) {
                                                    break;
                                                }
                                                v3_55 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v5_48, p38);
                                                v12_29.zzf(com.google.android.gms.internal.play_billing.zzel.zzc(p38.zzb));
                                            }
                                        }
                                    } else {
                                        int v12_30 = ((com.google.android.gms.internal.play_billing.zzga) v12_28);
                                        v3_55 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v9_6, p38);
                                        long v5_52 = (p38.zza + v3_55);
                                        while (v3_55 < v5_52) {
                                            v3_55 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v3_55, p38);
                                            v12_30.zzf(com.google.android.gms.internal.play_billing.zzel.zzc(p38.zzb));
                                        }
                                        if (v3_55 != v5_52) {
                                            throw new com.google.android.gms.internal.play_billing.zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                        }
                                    }
                                    break;
                                default:
                                    if (v8_25 != 3) {
                                        v15_0 = v5_65;
                                        v5_0 = p36;
                                        v11_0 = v0_0;
                                        v19_0 = v1_63;
                                        v9_4 = v7_32;
                                        v10_0 = v28_1;
                                        v7_0 = p34;
                                        v1_3 = p38;
                                    } else {
                                        int v2_29 = ((v7_32 & -8) | 4);
                                        com.google.android.gms.internal.play_billing.zzfq v9_5 = v1_63;
                                        int v1_10 = v0_0.zzv(v5_65);
                                        int v6_6 = p38;
                                        v15_0 = v5_65;
                                        v13_4 = v9_5;
                                        v14_3 = v25_1;
                                        int v3_16 = v28_1;
                                        long v5_2 = v2_29;
                                        v2_30 = p34;
                                        com.google.android.gms.internal.play_billing.zzei v8_4 = com.google.android.gms.internal.play_billing.zzdx.zzc(v1_10, p34, v3_16, p36, v5_2, p38);
                                        v9_6 = v3_16;
                                        v12_28.add(p38.zzc);
                                        while (v8_4 < p36) {
                                            int v3_18 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v8_4, v6_6);
                                            if (v7_32 != v6_6.zza) {
                                                break;
                                            }
                                            v8_4 = com.google.android.gms.internal.play_billing.zzdx.zzc(v1_10, p34, v3_18, p36, v5_2, v6_6);
                                            int v3_19 = v1_10;
                                            int v1_12 = v6_6;
                                            v12_28.add(v1_12.zzc);
                                            v6_6 = v1_12;
                                            v1_10 = v3_19;
                                        }
                                        v1_3 = v6_6;
                                        v11_0 = v0_0;
                                        v5_0 = p36;
                                        v0_1 = v8_4;
                                    }
                            }
                            if (v0_1 == v10_0) {
                                v12_14 = p37;
                                v5_3 = v0_1;
                                v6_3 = v1_3;
                                v8_0 = v15_0;
                                v7_1 = v19_0;
                                v14_1 = v24_1;
                                v10_2 = v25_1;
                                v0_25 = p33;
                            } else {
                                v2_0 = p33;
                                v6_3 = v1_3;
                                v4_8 = v5_0;
                                v3_11 = v7_0;
                                v8_0 = v15_0;
                                v1_11 = v19_0;
                                v14_1 = v24_1;
                                v7_2 = v25_1;
                                v12_15 = -1;
                                v5_3 = v0_1;
                                v15_1 = v9_4;
                                v0_0 = v11_0;
                                v9_7 = v20_0;
                                v11_6 = 0;
                            }
                        }
                    } else {
                        if (v8_25 != 2) {
                            v20_0 = v9_7;
                            v9_4 = v20_1;
                            v11_0 = v0_0;
                            v0_25 = v1_60;
                            v3_21 = v5_63;
                            v10_3 = v6_33;
                            v6_8 = v25_1;
                        } else {
                            int v2_34 = ((com.google.android.gms.internal.play_billing.zzfn) v5_63.getObject(v1_60, v14_6));
                            if (!v2_34.zzc()) {
                                int v3_24;
                                int v3_23 = v2_34.size();
                                if (v3_23 != 0) {
                                    v3_24 = (v3_23 + v3_23);
                                } else {
                                    v3_24 = 10;
                                }
                                v2_34 = v2_34.zzd(v3_24);
                                v5_63.putObject(v1_60, v14_6, v2_34);
                            }
                            v28_0 = v6_33;
                            int v2_35 = v20_1;
                            v3_11 = p34;
                            v4_8 = p36;
                            v6_3 = p38;
                            v5_3 = com.google.android.gms.internal.play_billing.zzdx.zze(v0_0.zzv(v6_33), v2_35, p34, v28_1, p36, v2_34, p38);
                            v15_1 = v2_35;
                            v1_11 = v5_63;
                            v2_0 = p33;
                            v14_1 = v24_1;
                            v7_2 = v25_1;
                        }
                    }
                    v7_1 = v3_21;
                    v12_14 = p37;
                    v8_0 = v10_3;
                    v14_1 = v24_1;
                    v5_3 = v28_1;
                    v10_2 = v6_8;
                    v6_3 = p38;
                } else {
                    int v6_10;
                    int v14_4;
                    long v5_7 = v11_9[(v7_18 + 2)];
                    int v11_3 = (1 << (v5_7 >> 20));
                    long v5_8 = (v5_7 & 1048575);
                    int v24_0 = v6_25;
                    if (v5_8 == v9_7) {
                        v28_0 = v7_18;
                        v6_10 = v14_1;
                        v14_4 = v9_7;
                    } else {
                        int v6_11 = 1048575;
                        v28_0 = v7_18;
                        if (v9_7 != 1048575) {
                            v1_11.putInt(v2_0, ((long) v9_7), v14_1);
                            v6_11 = 1048575;
                        }
                        if (v5_8 != v6_11) {
                            v6_10 = v1_11.getInt(v2_0, ((long) v5_8));
                        } else {
                            v6_10 = 0;
                        }
                        v14_4 = v5_8;
                    }
                    Integer v13_5;
                    int v2_44;
                    int v3_36;
                    long v5_9;
                    com.google.android.gms.internal.play_billing.zzei v7_7;
                    com.google.android.gms.internal.play_billing.zzei v8_18;
                    int v1_16;
                    com.google.android.gms.internal.play_billing.zzfq v9_8;
                    com.google.android.gms.internal.play_billing.zzei v7_11;
                    java.nio.charset.Charset v4_12;
                    java.nio.charset.Charset v4_13;
                    int v35_1;
                    com.google.android.gms.internal.play_billing.zzfq v9_13;
                    int v2_37;
                    int v1_24;
                    int v6_18;
                    com.google.android.gms.internal.play_billing.zzei v8_7;
                    int v11_7;
                    int v3_29;
                    int v2_39;
                    switch (v13_9) {
                        case 0:
                            v7_7 = p34;
                            v5_9 = v1_11;
                            v1_16 = v2_0;
                            v35_1 = v6_10;
                            v2_37 = v24_0;
                            v11_7 = p38;
                            if (v8_25 != 1) {
                            } else {
                                v6_18 = (v2_37 + 8);
                                v8_18 = (v35_1 | v11_3);
                                com.google.android.gms.internal.play_billing.zzho.zzo(v1_16, v19_10, Double.longBitsToDouble(com.google.android.gms.internal.play_billing.zzdx.zzo(p34, v2_37)));
                                v4_8 = p36;
                                v2_0 = v1_16;
                                v1_11 = v5_9;
                                v5_3 = v6_18;
                                v3_11 = v7_7;
                                v6_3 = v11_7;
                                v9_7 = v14_4;
                                v7_2 = v25_1;
                                v11_6 = 0;
                                v12_15 = -1;
                                v14_1 = v8_18;
                                v8_0 = v28_0;
                            }
                            break;
                        case 1:
                            v7_7 = p34;
                            v5_9 = v1_11;
                            v1_16 = v2_0;
                            v35_1 = v6_10;
                            v2_37 = v24_0;
                            v11_7 = p38;
                            if (v8_25 != 5) {
                            } else {
                                v6_18 = (v2_37 + 4);
                                v8_18 = (v35_1 | v11_3);
                                com.google.android.gms.internal.play_billing.zzho.zzp(v1_16, v19_10, Float.intBitsToFloat(com.google.android.gms.internal.play_billing.zzdx.zzb(p34, v2_37)));
                            }
                            break;
                        case 2:
                        case 3:
                            v9_13 = v1_11;
                            v1_16 = v2_0;
                            v35_1 = v6_10;
                            int v3_43 = v19_10;
                            v2_37 = v24_0;
                            v11_7 = p38;
                            if (v8_25 != null) {
                                v5_9 = v9_13;
                            } else {
                                v8_18 = (v35_1 | v11_3);
                                int v12_20 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v2_37, p38);
                                v2_0 = v1_16;
                                v1_11 = v9_13;
                                v1_11.putLong(v2_0, v3_43, p38.zzb);
                                v4_8 = p36;
                                v3_11 = p34;
                                v6_3 = p38;
                                v5_3 = v12_20;
                            }
                            break;
                        case 4:
                        case 11:
                            v9_13 = v1_11;
                            v1_16 = v2_0;
                            v35_1 = v6_10;
                            int v3_41 = v19_10;
                            v2_37 = v24_0;
                            v11_7 = p38;
                            if (v8_25 != null) {
                            } else {
                                long v5_28 = (v35_1 | v11_3);
                                int v2_46 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v2_37, p38);
                                v9_13.putInt(v1_16, v3_41, p38.zza);
                                v2_0 = v1_16;
                                v1_11 = v9_13;
                                v9_7 = v14_4;
                                v14_1 = v5_28;
                                v5_3 = v2_46;
                                v4_8 = p36;
                                v3_11 = p34;
                                v6_3 = v11_7;
                            }
                            break;
                        case 5:
                        case 14:
                            v9_13 = v1_11;
                            com.google.android.gms.internal.play_billing.zzei v7_12 = v2_0;
                            v35_1 = v6_10;
                            v2_37 = v24_0;
                            v11_7 = p38;
                            if (v8_25 != 1) {
                                v1_16 = v7_12;
                            } else {
                                com.google.android.gms.internal.play_billing.zzei v8_17 = (v2_37 + 8);
                                int v12_19 = (v35_1 | v11_3);
                                v2_0 = v7_12;
                                v1_11 = v9_13;
                                v1_11.putLong(v2_0, v19_10, com.google.android.gms.internal.play_billing.zzdx.zzo(p34, v2_37));
                                v4_8 = p36;
                                v3_11 = p34;
                                v5_3 = v8_17;
                                v6_3 = p38;
                                v9_7 = v14_4;
                                v7_2 = v25_1;
                                v8_0 = v28_0;
                                v11_6 = 0;
                                v14_1 = v12_19;
                            }
                            break;
                        case 6:
                        case 13:
                            v9_13 = v1_11;
                            v7_11 = v2_0;
                            v35_1 = v6_10;
                            v2_37 = v24_0;
                            v11_7 = p38;
                            if (v8_25 != 5) {
                                v1_16 = v7_11;
                            } else {
                                int v3_38 = (v2_37 + 4);
                                java.nio.charset.Charset v4_25 = (v35_1 | v11_3);
                                v9_13.putInt(v7_11, v19_10, com.google.android.gms.internal.play_billing.zzdx.zzb(p34, v2_37));
                                v5_3 = v3_38;
                                v2_0 = v7_11;
                                v6_3 = p38;
                                v7_2 = v25_1;
                                v8_0 = v28_0;
                                v11_6 = 0;
                                v12_15 = -1;
                                v3_11 = p34;
                                v1_11 = v9_13;
                                v9_7 = v14_4;
                                v14_1 = v4_25;
                                v4_8 = p36;
                            }
                            break;
                        case 7:
                            v9_13 = v1_11;
                            v7_11 = v2_0;
                            v35_1 = v6_10;
                            long v5_21 = v19_10;
                            v2_37 = v24_0;
                            v1_24 = p34;
                            v11_7 = p38;
                            if (v8_25 != null) {
                            } else {
                                java.nio.charset.Charset v4_23;
                                v3_36 = (v35_1 | v11_3);
                                v2_44 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v2_37, p38);
                                if (p38.zzb == 0) {
                                    v4_23 = 0;
                                } else {
                                    v4_23 = 1;
                                }
                                com.google.android.gms.internal.play_billing.zzho.zzm(v7_11, v5_21, v4_23);
                                v3_11 = v1_24;
                                v1_11 = v9_13;
                                v9_7 = v14_4;
                                v14_1 = v3_36;
                                v4_8 = p36;
                                v5_3 = v2_44;
                                v2_0 = v7_11;
                            }
                            break;
                        case 8:
                            v9_13 = v1_11;
                            v7_11 = v2_0;
                            v35_1 = v6_10;
                            long v5_20 = v19_10;
                            v2_37 = v24_0;
                            v1_24 = p34;
                            Integer v19_2 = v11_3;
                            v11_7 = p38;
                            if (v8_25 != 2) {
                            } else {
                                if ((v12_32 & 536870912) == 0) {
                                    v2_44 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v2_37, p38);
                                    com.google.android.gms.internal.play_billing.zzei v8_16 = p38.zza;
                                    if (v8_16 < null) {
                                        throw new com.google.android.gms.internal.play_billing.zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                    } else {
                                        v3_36 = (v35_1 | v19_2);
                                        if (v8_16 != null) {
                                            p38.zzc = new String(p34, v2_44, v8_16, com.google.android.gms.internal.play_billing.zzfo.zza);
                                            v2_44 += v8_16;
                                        } else {
                                            p38.zzc = "";
                                        }
                                    }
                                } else {
                                    v3_36 = (v35_1 | v19_2);
                                    v2_44 = com.google.android.gms.internal.play_billing.zzdx.zzg(p34, v2_37, p38);
                                }
                                v9_13.putObject(v7_11, v5_20, p38.zzc);
                            }
                            break;
                        case 9:
                            int v2_41 = v1_11;
                            int v1_19 = v2_0;
                            v35_1 = v6_10;
                            java.nio.charset.Charset v4_18 = v24_0;
                            v13_5 = v28_0;
                            if (v8_25 != 2) {
                                v2_37 = v4_18;
                                v1_16 = v1_19;
                                v11_7 = p38;
                                v5_9 = v2_41;
                                v28_0 = v13_5;
                            } else {
                                v8_7 = (v35_1 | v11_3);
                                int v3_33 = v1_19;
                                int v1_21 = v0_0.zzx(v3_33, v13_5);
                                com.google.android.gms.internal.play_billing.zzei v7_10 = v3_33;
                                com.google.android.gms.internal.play_billing.zzfq v9_12 = v2_41;
                                int v2_43 = com.google.android.gms.internal.play_billing.zzdx.zzn(v1_21, v0_0.zzv(v13_5), p34, v4_18, p36, p38);
                                v0_0 = v0_0.zzF(v7_10, v13_5, v1_21);
                                v4_8 = p36;
                                v6_3 = p38;
                                v3_11 = p34;
                                v5_3 = v2_43;
                                v2_0 = v7_10;
                                v1_11 = v9_12;
                                v9_7 = v14_4;
                                v7_2 = v25_1;
                                v11_6 = 0;
                                v12_15 = -1;
                                v14_1 = v8_7;
                                v8_0 = v13_5;
                            }
                            break;
                        case 10:
                            v2_39 = v1_11;
                            v1_16 = v2_0;
                            v7_7 = p34;
                            v9_8 = p38;
                            v35_1 = v6_10;
                            long v5_14 = v19_10;
                            v4_12 = v24_0;
                            v13_5 = v28_0;
                            if (v8_25 != 2) {
                                v5_9 = v2_39;
                                v2_37 = v4_12;
                                v11_7 = v9_8;
                            } else {
                                v3_29 = (v35_1 | v11_3);
                                v4_13 = com.google.android.gms.internal.play_billing.zzdx.zza(p34, v4_12, p38);
                                v2_39.putObject(v1_16, v5_14, p38.zzc);
                                v2_0 = v1_16;
                                v1_11 = v2_39;
                                v5_3 = v4_13;
                                v6_3 = v9_8;
                                v8_0 = v13_5;
                                v9_7 = v14_4;
                                v11_6 = 0;
                                v12_15 = -1;
                                v4_8 = p36;
                                v14_1 = v3_29;
                                v3_11 = v7_7;
                                v7_2 = v25_1;
                            }
                            break;
                        case 12:
                            v2_39 = v1_11;
                            v1_16 = v2_0;
                            v9_8 = p38;
                            v35_1 = v6_10;
                            long v5_12 = v19_10;
                            v4_12 = v24_0;
                            v13_5 = v28_0;
                            if (v8_25 != null) {
                            } else {
                                int v3_30 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v4_12, p38);
                                java.nio.charset.Charset v4_14 = p38.zza;
                                com.google.android.gms.internal.play_billing.zzei v8_10 = v0_0.zzu(v13_5);
                                if (((v12_32 & -2147483648) != 0) && ((v8_10 != null) && (!v8_10.zza(v4_14)))) {
                                    com.google.android.gms.internal.play_billing.zzgo.zzd(v1_16).zzj(v15_1, Long.valueOf(((long) v4_14)));
                                    v2_0 = v1_16;
                                    v1_11 = v2_39;
                                    v4_8 = p36;
                                    v5_3 = v3_30;
                                    v3_11 = p34;
                                    v6_3 = p38;
                                    v8_0 = v13_5;
                                    v9_7 = v14_4;
                                    v7_2 = v25_1;
                                    v11_6 = 0;
                                    v12_15 = -1;
                                    v14_1 = v35_1;
                                } else {
                                    v8_7 = (v35_1 | v11_3);
                                    v2_39.putInt(v1_16, v5_12, v4_14);
                                    v2_0 = v1_16;
                                    v1_11 = v2_39;
                                    v4_8 = p36;
                                    v5_3 = v3_30;
                                    v3_11 = p34;
                                    v6_3 = p38;
                                }
                            }
                            break;
                        case 15:
                            v2_39 = v1_11;
                            v1_16 = v2_0;
                            v7_7 = p34;
                            v9_8 = p38;
                            v35_1 = v6_10;
                            long v5_11 = v19_10;
                            v4_12 = v24_0;
                            v13_5 = v28_0;
                            if (v8_25 != null) {
                            } else {
                                v3_29 = (v35_1 | v11_3);
                                v4_13 = com.google.android.gms.internal.play_billing.zzdx.zzi(p34, v4_12, p38);
                                v2_39.putInt(v1_16, v5_11, com.google.android.gms.internal.play_billing.zzel.zzb(p38.zza));
                            }
                            break;
                        case 16:
                            v9_8 = p38;
                            java.nio.charset.Charset v4_10 = v24_0;
                            v13_5 = v28_0;
                            if (v8_25 != null) {
                                v1_16 = v2_0;
                                v5_9 = v1_11;
                                v2_37 = v4_10;
                                v35_1 = v6_10;
                            } else {
                                v8_7 = (v6_10 | v11_3);
                                int v11_4 = com.google.android.gms.internal.play_billing.zzdx.zzl(p34, v4_10, p38);
                                v1_11.putLong(v2_0, v19_10, com.google.android.gms.internal.play_billing.zzel.zzc(p38.zzb));
                                v4_8 = p36;
                                v3_11 = p34;
                                v6_3 = p38;
                                v5_3 = v11_4;
                            }
                            break;
                        default:
                            if (v8_25 != 3) {
                                v11_7 = p38;
                                v5_9 = v1_11;
                                v1_16 = v2_0;
                                v35_1 = v6_10;
                                v2_37 = v24_0;
                            } else {
                                int v11_8 = (v11_3 | v6_10);
                                int v12_23 = v28_0;
                                int v3_46 = v0_0.zzx(v2_0, v12_23);
                                Integer v13_7 = v12_23;
                                java.nio.charset.Charset v4_28 = com.google.android.gms.internal.play_billing.zzdx.zzm(v3_46, v0_0.zzv(v12_23), p34, v24_0, p36, ((v25_1 << 3) | 4), p38);
                                v0_0 = v0_0.zzF(v2_0, v13_7, v3_46);
                                v5_3 = v4_28;
                                v3_11 = p34;
                                v6_3 = p38;
                                v8_0 = v13_7;
                                v9_7 = v14_4;
                                v7_2 = v25_1;
                                v12_15 = -1;
                                v4_8 = p36;
                                v14_1 = v11_8;
                            }
                    }
                    v12_14 = p37;
                    v6_3 = v11_7;
                    v20_0 = v14_4;
                    v9_4 = v15_1;
                    v10_2 = v25_1;
                    v8_0 = v28_0;
                    v14_1 = v35_1;
                    v11_0 = v0_0;
                    v0_25 = v1_16;
                    v7_1 = v5_9;
                    v5_3 = v2_37;
                }
            } else {
                v12_14 = p37;
                v7_1 = v1_11;
                v10_2 = v5_45;
                v5_3 = v6_25;
                v20_0 = v9_7;
                v8_0 = v11_6;
                v9_4 = v15_1;
                v6_3 = p38;
                v11_0 = v0_0;
                v0_25 = v2_0;
            }
        }
        v12_14 = p37;
        v11_0 = v0_0;
        v7_1 = v1_11;
        v0_25 = v2_0;
        int v24 = v14_1;
    }

    public final Object zze()
    {
        return ((com.google.android.gms.internal.play_billing.zzfi) this.zzg).zzo();
    }

    public final void zzf(Object p8)
    {
        if (com.google.android.gms.internal.play_billing.zzgo.zzL(p8)) {
            int v1 = 0;
            if ((p8 instanceof com.google.android.gms.internal.play_billing.zzfi)) {
                ((com.google.android.gms.internal.play_billing.zzfi) p8).zzx(2147483647);
                ((com.google.android.gms.internal.play_billing.zzfi) p8).zza = 0;
                ((com.google.android.gms.internal.play_billing.zzfi) p8).zzv();
            }
            com.google.android.gms.internal.play_billing.zzev v0_1 = this.zzc;
            while (v1 < v0_1.length) {
                sun.misc.Unsafe v2_1 = this.zzs(v1);
                Object v3_1 = (1048575 & v2_1);
                sun.misc.Unsafe v2_2 = com.google.android.gms.internal.play_billing.zzgo.zzr(v2_1);
                Object v3_2 = ((long) v3_1);
                if (v2_2 == 9) {
                    if (this.zzI(p8, v1)) {
                        this.zzv(v1).zzf(com.google.android.gms.internal.play_billing.zzgo.zzb.getObject(p8, v3_2));
                    }
                } else {
                    if ((v2_2 == 60) || (v2_2 == 68)) {
                        if (this.zzM(p8, v0_1[v1], v1)) {
                            this.zzv(v1).zzf(com.google.android.gms.internal.play_billing.zzgo.zzb.getObject(p8, v3_2));
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
                                ((com.google.android.gms.internal.play_billing.zzfn) com.google.android.gms.internal.play_billing.zzho.zzf(p8, v3_2)).zzb();
                                break;
                            case 50:
                                sun.misc.Unsafe v2_6 = com.google.android.gms.internal.play_billing.zzgo.zzb;
                                Object v5_4 = v2_6.getObject(p8, v3_2);
                                if (v5_4 != null) {
                                    ((com.google.android.gms.internal.play_billing.zzgf) v5_4).zzc();
                                    v2_6.putObject(p8, v3_2, v5_4);
                                }
                                break;
                            default:
                        }
                    }
                }
                v1 += 3;
            }
            this.zzl.zzb(p8);
            if (this.zzh) {
                this.zzm.zza(p8);
            }
        }
        return;
    }

    public final void zzg(Object p9, Object p10)
    {
        com.google.android.gms.internal.play_billing.zzgo.zzA(p9);
        p10.getClass();
        int v0_1 = 0;
        while(true) {
            com.google.android.gms.internal.play_billing.zzfn v1_24 = this.zzc;
            if (v0_1 >= v1_24.length) {
                break;
            }
            long v2_0 = this.zzs(v0_1);
            com.google.android.gms.internal.play_billing.zzfn v1_23 = v1_24[v0_1];
            long v3_2 = ((long) (1048575 & v2_0));
            switch (com.google.android.gms.internal.play_billing.zzgo.zzr(v2_0)) {
                case 0:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzo(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zza(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 1:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzp(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzb(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 2:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzr(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzd(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 3:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzr(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzd(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 4:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzq(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzc(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 5:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzr(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzd(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 6:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzq(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzc(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 7:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzm(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzw(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 8:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzs(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzf(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 9:
                    this.zzB(p9, p10, v0_1);
                    break;
                case 10:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzs(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzf(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 11:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzq(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzc(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 12:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzq(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzc(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 13:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzq(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzc(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 14:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzr(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzd(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 15:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzq(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzc(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 16:
                    if (!this.zzI(p10, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzr(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzd(p10, v3_2));
                        this.zzD(p9, v0_1);
                    }
                    break;
                case 17:
                    this.zzB(p9, p10, v0_1);
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
                    com.google.android.gms.internal.play_billing.zzfn v1_28 = ((com.google.android.gms.internal.play_billing.zzfn) com.google.android.gms.internal.play_billing.zzho.zzf(p9, v3_2));
                    long v2_9 = ((com.google.android.gms.internal.play_billing.zzfn) com.google.android.gms.internal.play_billing.zzho.zzf(p10, v3_2));
                    int v5 = v1_28.size();
                    int v6_0 = v2_9.size();
                    if ((v5 > 0) && (v6_0 > 0)) {
                        if (!v1_28.zzc()) {
                            v1_28 = v1_28.zzd((v6_0 + v5));
                        }
                        v1_28.addAll(v2_9);
                    }
                    if (v5 > 0) {
                        v2_9 = v1_28;
                    }
                    com.google.android.gms.internal.play_billing.zzho.zzs(p9, v3_2, v2_9);
                    break;
                case 50:
                    com.google.android.gms.internal.play_billing.zzho.zzs(p9, v3_2, com.google.android.gms.internal.play_billing.zzgg.zza(com.google.android.gms.internal.play_billing.zzho.zzf(p9, v3_2), com.google.android.gms.internal.play_billing.zzho.zzf(p10, v3_2)));
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
                    if (!this.zzM(p10, v1_23, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzs(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzf(p10, v3_2));
                        this.zzE(p9, v1_23, v0_1);
                    }
                    break;
                case 60:
                    this.zzC(p9, p10, v0_1);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!this.zzM(p10, v1_23, v0_1)) {
                    } else {
                        com.google.android.gms.internal.play_billing.zzho.zzs(p9, v3_2, com.google.android.gms.internal.play_billing.zzho.zzf(p10, v3_2));
                        this.zzE(p9, v1_23, v0_1);
                    }
                    break;
                case 68:
                    this.zzC(p9, p10, v0_1);
                    break;
                default:
            }
            v0_1 += 3;
        }
        com.google.android.gms.internal.play_billing.zzgx.zzp(this.zzl, p9, p10);
        if (this.zzh) {
            com.google.android.gms.internal.play_billing.zzgx.zzo(this.zzm, p9, p10);
        }
        return;
    }

    public final void zzh(Object p8, byte[] p9, int p10, int p11, com.google.android.gms.internal.play_billing.zzdw p12)
    {
        this.zzc(p8, p9, p10, p11, 0, p12);
        return;
    }

    public final void zzi(Object p19, com.google.android.gms.internal.play_billing.zzhu p20)
    {
        java.util.Map$Entry v8;
        int v0_0 = this;
        if (!this.zzh) {
            v8 = 0;
        } else {
            int v2_7 = ((com.google.android.gms.internal.play_billing.zzff) p19).zzb;
            if (v2_7.zza.isEmpty()) {
            } else {
                v8 = ((java.util.Map$Entry) v2_7.zzf().next());
            }
        }
        int[] v9 = this.zzc;
        sun.misc.Unsafe v10 = com.google.android.gms.internal.play_billing.zzgo.zzb;
        long v11_5 = 1048575;
        int v3_1 = 1048575;
        int v2_3 = 0;
        int v4 = 0;
        while (v2_3 < v9.length) {
            Object v5_72;
            int v12_5;
            Object v5_56 = v0_0.zzs(v2_3);
            Object v13_17 = com.google.android.gms.internal.play_billing.zzgo.zzr(v5_56);
            com.google.android.gms.internal.play_billing.zzeq v14_4 = v9[v2_3];
            if (v13_17 > 17) {
                v12_5 = v5_56;
                v5_72 = 0;
            } else {
                int v15_2 = v9[(v2_3 + 2)];
                int v12_6 = (v15_2 & v11_5);
                if (v12_6 != v3_1) {
                    if (v12_6 != v11_5) {
                        v4 = v10.getInt(p19, ((long) v12_6));
                    } else {
                        v4 = 0;
                    }
                    v3_1 = v12_6;
                }
                v12_5 = v5_56;
                v5_72 = (1 << (v15_2 >> 20));
            }
            if (v8 != null) {
                v8.getKey();
                throw 0;
            } else {
                long v11_43 = ((long) (v12_5 & v11_5));
                switch (v13_17) {
                    case 0:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzf(v14_4, com.google.android.gms.internal.play_billing.zzho.zza(p19, v11_43));
                        }
                        break;
                    case 1:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzo(v14_4, com.google.android.gms.internal.play_billing.zzho.zzb(p19, v11_43));
                        }
                        break;
                    case 2:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzt(v14_4, v10.getLong(p19, v11_43));
                        }
                        break;
                    case 3:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzK(v14_4, v10.getLong(p19, v11_43));
                        }
                        break;
                    case 4:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzr(v14_4, v10.getInt(p19, v11_43));
                        }
                        break;
                    case 5:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzm(v14_4, v10.getLong(p19, v11_43));
                        }
                        break;
                    case 6:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzk(v14_4, v10.getInt(p19, v11_43));
                        }
                        break;
                    case 7:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzb(v14_4, com.google.android.gms.internal.play_billing.zzho.zzw(p19, v11_43));
                        }
                        break;
                    case 8:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            com.google.android.gms.internal.play_billing.zzgo.zzO(v14_4, v10.getObject(p19, v11_43), p20);
                        }
                        break;
                    case 9:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzv(v14_4, v10.getObject(p19, v11_43), v0_0.zzv(v2_3));
                        }
                        break;
                    case 10:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzd(v14_4, ((com.google.android.gms.internal.play_billing.zzei) v10.getObject(p19, v11_43)));
                        }
                        break;
                    case 11:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzI(v14_4, v10.getInt(p19, v11_43));
                        }
                        break;
                    case 12:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzi(v14_4, v10.getInt(p19, v11_43));
                        }
                        break;
                    case 13:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzx(v14_4, v10.getInt(p19, v11_43));
                        }
                        break;
                    case 14:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzz(v14_4, v10.getLong(p19, v11_43));
                        }
                        break;
                    case 15:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzB(v14_4, v10.getInt(p19, v11_43));
                        }
                        break;
                    case 16:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzD(v14_4, v10.getLong(p19, v11_43));
                        }
                        break;
                    case 17:
                        if (!v0_0.zzJ(p19, v2_3, v3_1, v4, v5_72)) {
                        } else {
                            p20.zzq(v14_4, v10.getObject(p19, v11_43), v0_0.zzv(v2_3));
                        }
                        break;
                    case 18:
                        com.google.android.gms.internal.play_billing.zzgx.zzr(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 19:
                        com.google.android.gms.internal.play_billing.zzgx.zzv(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 20:
                        com.google.android.gms.internal.play_billing.zzgx.zzx(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 21:
                        com.google.android.gms.internal.play_billing.zzgx.zzD(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 22:
                        com.google.android.gms.internal.play_billing.zzgx.zzw(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 23:
                        com.google.android.gms.internal.play_billing.zzgx.zzu(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 24:
                        com.google.android.gms.internal.play_billing.zzgx.zzt(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 25:
                        com.google.android.gms.internal.play_billing.zzgx.zzq(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 26:
                        com.google.android.gms.internal.play_billing.zzgv v7_20 = ((java.util.List) v10.getObject(p19, v11_43));
                        if ((v7_20 == null) || (v7_20.isEmpty())) {
                        } else {
                            p20.zzH(v9[v2_3], v7_20);
                        }
                        break;
                    case 27:
                        Object v5_49 = v9[v2_3];
                        com.google.android.gms.internal.play_billing.zzgv v7_18 = ((java.util.List) v10.getObject(p19, v11_43));
                        long v11_35 = v0_0.zzv(v2_3);
                        if ((v7_18 == null) || (v7_18.isEmpty())) {
                        } else {
                            Object v13_8 = 0;
                            while (v13_8 < v7_18.size()) {
                                ((com.google.android.gms.internal.play_billing.zzeq) p20).zzv(v5_49, v7_18.get(v13_8), v11_35);
                                v13_8++;
                            }
                        }
                        break;
                    case 28:
                        com.google.android.gms.internal.play_billing.zzgv v7_16 = ((java.util.List) v10.getObject(p19, v11_43));
                        if ((v7_16 == null) || (v7_16.isEmpty())) {
                        } else {
                            p20.zze(v9[v2_3], v7_16);
                        }
                        break;
                    case 29:
                        com.google.android.gms.internal.play_billing.zzgx.zzC(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 30:
                        com.google.android.gms.internal.play_billing.zzgx.zzs(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 31:
                        com.google.android.gms.internal.play_billing.zzgx.zzy(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 32:
                        com.google.android.gms.internal.play_billing.zzgx.zzz(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 33:
                        com.google.android.gms.internal.play_billing.zzgx.zzA(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 34:
                        com.google.android.gms.internal.play_billing.zzgx.zzB(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 0);
                        break;
                    case 35:
                        com.google.android.gms.internal.play_billing.zzgx.zzr(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 36:
                        com.google.android.gms.internal.play_billing.zzgx.zzv(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 37:
                        com.google.android.gms.internal.play_billing.zzgx.zzx(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 38:
                        com.google.android.gms.internal.play_billing.zzgx.zzD(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 39:
                        com.google.android.gms.internal.play_billing.zzgx.zzw(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 40:
                        com.google.android.gms.internal.play_billing.zzgx.zzu(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 41:
                        com.google.android.gms.internal.play_billing.zzgx.zzt(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 42:
                        com.google.android.gms.internal.play_billing.zzgx.zzq(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 43:
                        com.google.android.gms.internal.play_billing.zzgx.zzC(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 44:
                        com.google.android.gms.internal.play_billing.zzgx.zzs(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 45:
                        com.google.android.gms.internal.play_billing.zzgx.zzy(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 46:
                        com.google.android.gms.internal.play_billing.zzgx.zzz(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 47:
                        com.google.android.gms.internal.play_billing.zzgx.zzA(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 48:
                        com.google.android.gms.internal.play_billing.zzgx.zzB(v9[v2_3], ((java.util.List) v10.getObject(p19, v11_43)), p20, 1);
                        break;
                    case 49:
                        Object v5_26 = v9[v2_3];
                        com.google.android.gms.internal.play_billing.zzgv v7_2 = ((java.util.List) v10.getObject(p19, v11_43));
                        long v11_4 = v0_0.zzv(v2_3);
                        if ((v7_2 == null) || (v7_2.isEmpty())) {
                        } else {
                            int v12_1 = 0;
                            while (v12_1 < v7_2.size()) {
                                ((com.google.android.gms.internal.play_billing.zzeq) p20).zzq(v5_26, v7_2.get(v12_1), v11_4);
                                v12_1++;
                            }
                        }
                        break;
                    case 50:
                        if (v10.getObject(p19, v11_43) != null) {
                            v0_0.zzw(v2_3);
                            throw 0;
                        }
                        break;
                    case 51:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzf(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzm(p19, v11_43));
                        }
                        break;
                    case 52:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzo(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzn(p19, v11_43));
                        }
                        break;
                    case 53:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzt(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzt(p19, v11_43));
                        }
                        break;
                    case 54:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzK(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzt(p19, v11_43));
                        }
                        break;
                    case 55:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzr(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzo(p19, v11_43));
                        }
                        break;
                    case 56:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzm(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzt(p19, v11_43));
                        }
                        break;
                    case 57:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzk(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzo(p19, v11_43));
                        }
                        break;
                    case 58:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzb(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzN(p19, v11_43));
                        }
                        break;
                    case 59:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            com.google.android.gms.internal.play_billing.zzgo.zzO(v14_4, v10.getObject(p19, v11_43), p20);
                        }
                        break;
                    case 60:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzv(v14_4, v10.getObject(p19, v11_43), v0_0.zzv(v2_3));
                        }
                        break;
                    case 61:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzd(v14_4, ((com.google.android.gms.internal.play_billing.zzei) v10.getObject(p19, v11_43)));
                        }
                        break;
                    case 62:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzI(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzo(p19, v11_43));
                        }
                        break;
                    case 63:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzi(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzo(p19, v11_43));
                        }
                        break;
                    case 64:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzx(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzo(p19, v11_43));
                        }
                        break;
                    case 65:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzz(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzt(p19, v11_43));
                        }
                        break;
                    case 66:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzB(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzo(p19, v11_43));
                        }
                        break;
                    case 67:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzD(v14_4, com.google.android.gms.internal.play_billing.zzgo.zzt(p19, v11_43));
                        }
                        break;
                    case 68:
                        if (!v0_0.zzM(p19, v14_4, v2_3)) {
                        } else {
                            p20.zzq(v14_4, v10.getObject(p19, v11_43), v0_0.zzv(v2_3));
                        }
                        break;
                    default:
                }
                v2_3 += 3;
                v11_5 = 1048575;
                v0_0 = this;
            }
        }
        if (v8 != null) {
            v8.getKey();
            throw 0;
        } else {
            ((com.google.android.gms.internal.play_billing.zzfi) p19).zzc.zzl(p20);
            return;
        }
    }

    public final boolean zzj(Object p8, Object p9)
    {
        int v1_0 = 0;
        while (v1_0 < this.zzc.length) {
            boolean v2_49;
            boolean v2_39 = this.zzs(v1_0);
            long v4_6 = ((long) (v2_39 & 1048575));
            switch (com.google.android.gms.internal.play_billing.zzgo.zzr(v2_39)) {
                case 0:
                    if ((!this.zzH(p8, p9, v1_0)) || (Double.doubleToLongBits(com.google.android.gms.internal.play_billing.zzho.zza(p8, v4_6)) != Double.doubleToLongBits(com.google.android.gms.internal.play_billing.zzho.zza(p9, v4_6)))) {
                        return 0;
                    } else {
                    }
                case 1:
                    if ((!this.zzH(p8, p9, v1_0)) || (Float.floatToIntBits(com.google.android.gms.internal.play_billing.zzho.zzb(p8, v4_6)) != Float.floatToIntBits(com.google.android.gms.internal.play_billing.zzho.zzb(p9, v4_6)))) {
                        return 0;
                    } else {
                    }
                case 2:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzd(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzd(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 3:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzd(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzd(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 4:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 5:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzd(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzd(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 6:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 7:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzw(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzw(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 8:
                    if ((!this.zzH(p8, p9, v1_0)) || (!com.google.android.gms.internal.play_billing.zzgx.zzE(com.google.android.gms.internal.play_billing.zzho.zzf(p8, v4_6), com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_6)))) {
                        return 0;
                    } else {
                    }
                case 9:
                    if ((!this.zzH(p8, p9, v1_0)) || (!com.google.android.gms.internal.play_billing.zzgx.zzE(com.google.android.gms.internal.play_billing.zzho.zzf(p8, v4_6), com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_6)))) {
                        return 0;
                    } else {
                    }
                case 10:
                    if ((!this.zzH(p8, p9, v1_0)) || (!com.google.android.gms.internal.play_billing.zzgx.zzE(com.google.android.gms.internal.play_billing.zzho.zzf(p8, v4_6), com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_6)))) {
                        return 0;
                    } else {
                    }
                case 11:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 12:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 13:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 14:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzd(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzd(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 15:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzc(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzc(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 16:
                    if ((!this.zzH(p8, p9, v1_0)) || (com.google.android.gms.internal.play_billing.zzho.zzd(p8, v4_6) != com.google.android.gms.internal.play_billing.zzho.zzd(p9, v4_6))) {
                        return 0;
                    } else {
                    }
                case 17:
                    if ((!this.zzH(p8, p9, v1_0)) || (!com.google.android.gms.internal.play_billing.zzgx.zzE(com.google.android.gms.internal.play_billing.zzho.zzf(p8, v4_6), com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_6)))) {
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
                    v2_49 = com.google.android.gms.internal.play_billing.zzgx.zzE(com.google.android.gms.internal.play_billing.zzho.zzf(p8, v4_6), com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_6));
                    if (v2_49) {
                    }
                    break;
                case 50:
                    v2_49 = com.google.android.gms.internal.play_billing.zzgx.zzE(com.google.android.gms.internal.play_billing.zzho.zzf(p8, v4_6), com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_6));
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
                    boolean v2_44 = ((long) (this.zzp(v1_0) & 1048575));
                    if ((com.google.android.gms.internal.play_billing.zzho.zzc(p8, v2_44) == com.google.android.gms.internal.play_billing.zzho.zzc(p9, v2_44)) && (com.google.android.gms.internal.play_billing.zzgx.zzE(com.google.android.gms.internal.play_billing.zzho.zzf(p8, v4_6), com.google.android.gms.internal.play_billing.zzho.zzf(p9, v4_6)))) {
                    }
                    break;
                default:
            }
            v1_0 += 3;
        }
        if (((com.google.android.gms.internal.play_billing.zzfi) p8).zzc.equals(((com.google.android.gms.internal.play_billing.zzfi) p9).zzc)) {
            if (!this.zzh) {
                return 1;
            } else {
                return ((com.google.android.gms.internal.play_billing.zzff) p8).zzb.equals(((com.google.android.gms.internal.play_billing.zzff) p9).zzb);
            }
        } else {
            return 0;
        }
    }

    public final boolean zzk(Object p15)
    {
        int v3_0 = 0;
        int v8 = 0;
        boolean v2_0 = 1048575;
        while (v8 < this.zzj) {
            boolean v2_1;
            int v4_2;
            int v3_1;
            int v9_2 = this.zzc;
            int v4_1 = this.zzi[v8];
            boolean v10_2 = v9_2[v4_1];
            int v11 = this.zzs(v4_1);
            int v9_3 = v9_2[(v4_1 + 2)];
            int v12_1 = (v9_3 & 1048575);
            boolean v5_5 = (1 << (v9_3 >> 20));
            if (v12_1 == v2_0) {
                v3_1 = v2_0;
                v2_1 = v4_1;
                v4_2 = v3_0;
            } else {
                if (v12_1 != 1048575) {
                    v3_0 = com.google.android.gms.internal.play_billing.zzgo.zzb.getInt(p15, ((long) v12_1));
                }
                v2_1 = v4_1;
                v4_2 = v3_0;
                v3_1 = v12_1;
            }
            if (((268435456 & v11) != 0) && (!this.zzJ(p15, v2_1, v3_1, v4_2, v5_5))) {
                return 0;
            } else {
                int v9_9 = com.google.android.gms.internal.play_billing.zzgo.zzr(v11);
                if ((v9_9 == 9) || (v9_9 == 17)) {
                    if ((this.zzJ(p15, v2_1, v3_1, v4_2, v5_5)) && (!com.google.android.gms.internal.play_billing.zzgo.zzK(p15, v11, this.zzv(v2_1)))) {
                        return 0;
                    }
                } else {
                    if (v9_9 != 27) {
                        if ((v9_9 == 60) || (v9_9 == 68)) {
                            if ((!this.zzM(p15, v10_2, v2_1)) || (com.google.android.gms.internal.play_billing.zzgo.zzK(p15, v11, this.zzv(v2_1)))) {
                                v8++;
                                v2_0 = v3_1;
                                v3_0 = v4_2;
                            } else {
                                return 0;
                            }
                        } else {
                            if (v9_9 != 49) {
                                if ((v9_9 == 50) && (!((com.google.android.gms.internal.play_billing.zzgf) com.google.android.gms.internal.play_billing.zzho.zzf(p15, ((long) (v11 & 1048575)))).isEmpty())) {
                                    this.zzw(v2_1);
                                    throw 0;
                                }
                            }
                        }
                    }
                    boolean v5_15 = ((java.util.List) com.google.android.gms.internal.play_billing.zzho.zzf(p15, ((long) (v11 & 1048575))));
                    if (!v5_15.isEmpty()) {
                        boolean v2_8 = this.zzv(v2_1);
                        int v9_0 = 0;
                        while (v9_0 < v5_15.size()) {
                            if (v2_8.zzk(v5_15.get(v9_0))) {
                                v9_0++;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        if ((!this.zzh) || (((com.google.android.gms.internal.play_billing.zzff) p15).zzb.zzi())) {
            return 1;
        } else {
            return 0;
        }
    }
}
