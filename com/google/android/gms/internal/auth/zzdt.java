package com.google.android.gms.internal.auth;
final class zzdt {

    public static int zza(byte[] p2, int p3, com.google.android.gms.internal.auth.zzds p4)
    {
        int v3_1 = com.google.android.gms.internal.auth.zzdt.zzj(p2, p3, p4);
        int v0 = p4.zza;
        if (v0 < 0) {
            throw com.google.android.gms.internal.auth.zzfa.zzc();
        } else {
            if (v0 > (p2.length - v3_1)) {
                throw com.google.android.gms.internal.auth.zzfa.zzf();
            } else {
                if (v0 != 0) {
                    p4.zzc = com.google.android.gms.internal.auth.zzee.zzk(p2, v3_1, v0);
                    return (v3_1 + v0);
                } else {
                    p4.zzc = com.google.android.gms.internal.auth.zzee.zzb;
                    return v3_1;
                }
            }
        }
    }

    public static int zzb(byte[] p2, int p3)
    {
        return (((p2[(p3 + 3)] & 255) << 24) | (((p2[p3] & 255) | ((p2[(p3 + 1)] & 255) << 8)) | ((p2[(p3 + 2)] & 255) << 16)));
    }

    public static int zzc(com.google.android.gms.internal.auth.zzgh p7, byte[] p8, int p9, int p10, int p11, com.google.android.gms.internal.auth.zzds p12)
    {
        Object v1 = ((com.google.android.gms.internal.auth.zzfz) p7).zzd();
        int v7_1 = ((com.google.android.gms.internal.auth.zzfz) p7).zzb(v1, p8, p9, p10, p11, p12);
        ((com.google.android.gms.internal.auth.zzfz) p7).zze(v1);
        p12.zzc = v1;
        return v7_1;
    }

    public static int zzd(com.google.android.gms.internal.auth.zzgh p6, byte[] p7, int p8, int p9, com.google.android.gms.internal.auth.zzds p10)
    {
        com.google.android.gms.internal.auth.zzfa v0_0 = (p8 + 1);
        int v8_1 = p7[p8];
        if (v8_1 < 0) {
            v0_0 = com.google.android.gms.internal.auth.zzdt.zzk(v8_1, p7, v0_0, p10);
            v8_1 = p10.zza;
        }
        int v3 = v0_0;
        if ((v8_1 < 0) || (v8_1 > (p9 - v3))) {
            throw com.google.android.gms.internal.auth.zzfa.zzf();
        } else {
            Object v1 = p6.zzd();
            int v4 = (v3 + v8_1);
            p6.zzg(v1, p7, v3, v4, p10);
            p6.zze(v1);
            p10.zzc = v1;
            return v4;
        }
    }

    public static int zze(com.google.android.gms.internal.auth.zzgh p2, int p3, byte[] p4, int p5, int p6, com.google.android.gms.internal.auth.zzey p7, com.google.android.gms.internal.auth.zzds p8)
    {
        int v5_1 = com.google.android.gms.internal.auth.zzdt.zzd(p2, p4, p5, p6, p8);
        p7.add(p8.zzc);
        while (v5_1 < p6) {
            Object v0_2 = com.google.android.gms.internal.auth.zzdt.zzj(p4, v5_1, p8);
            if (p3 != p8.zza) {
                break;
            }
            v5_1 = com.google.android.gms.internal.auth.zzdt.zzd(p2, p4, v0_2, p6, p8);
            p7.add(p8.zzc);
        }
        return v5_1;
    }

    public static int zzf(byte[] p2, int p3, com.google.android.gms.internal.auth.zzey p4, com.google.android.gms.internal.auth.zzds p5)
    {
        int v3_1 = com.google.android.gms.internal.auth.zzdt.zzj(p2, p3, p5);
        int v0_1 = (p5.zza + v3_1);
        while (v3_1 < v0_1) {
            v3_1 = com.google.android.gms.internal.auth.zzdt.zzj(p2, v3_1, p5);
            ((com.google.android.gms.internal.auth.zzev) p4).zze(p5.zza);
        }
        if (v3_1 != v0_1) {
            throw com.google.android.gms.internal.auth.zzfa.zzf();
        } else {
            return v3_1;
        }
    }

    public static int zzg(byte[] p3, int p4, com.google.android.gms.internal.auth.zzds p5)
    {
        int v4_1 = com.google.android.gms.internal.auth.zzdt.zzj(p3, p4, p5);
        int v0 = p5.zza;
        if (v0 < 0) {
            throw com.google.android.gms.internal.auth.zzfa.zzc();
        } else {
            if (v0 != 0) {
                p5.zzc = new String(p3, v4_1, v0, com.google.android.gms.internal.auth.zzez.zzb);
                return (v4_1 + v0);
            } else {
                p5.zzc = "";
                return v4_1;
            }
        }
    }

    public static int zzh(byte[] p1, int p2, com.google.android.gms.internal.auth.zzds p3)
    {
        int v2_1 = com.google.android.gms.internal.auth.zzdt.zzj(p1, p2, p3);
        int v0 = p3.zza;
        if (v0 < 0) {
            throw com.google.android.gms.internal.auth.zzfa.zzc();
        } else {
            if (v0 != 0) {
                p3.zzc = com.google.android.gms.internal.auth.zzhm.zzb(p1, v2_1, v0);
                return (v2_1 + v0);
            } else {
                p3.zzc = "";
                return v2_1;
            }
        }
    }

    public static int zzi(int p7, byte[] p8, int p9, int p10, com.google.android.gms.internal.auth.zzgz p11, com.google.android.gms.internal.auth.zzds p12)
    {
        if ((p7 >> 3) == 0) {
            throw com.google.android.gms.internal.auth.zzfa.zza();
        } else {
            int v0_2 = (p7 & 7);
            if (v0_2 == 0) {
                int v8_1 = com.google.android.gms.internal.auth.zzdt.zzm(p8, p9, p12);
                p11.zzf(p7, Long.valueOf(p12.zzb));
                return v8_1;
            } else {
                if (v0_2 == 1) {
                    p11.zzf(p7, Long.valueOf(com.google.android.gms.internal.auth.zzdt.zzn(p8, p9)));
                    return (p9 + 8);
                } else {
                    if (v0_2 == 2) {
                        int v8_3 = com.google.android.gms.internal.auth.zzdt.zzj(p8, p9, p12);
                        int v9_4 = p12.zza;
                        if (v9_4 < 0) {
                            throw com.google.android.gms.internal.auth.zzfa.zzc();
                        } else {
                            if (v9_4 > (p8.length - v8_3)) {
                                throw com.google.android.gms.internal.auth.zzfa.zzf();
                            } else {
                                if (v9_4 != 0) {
                                    p11.zzf(p7, com.google.android.gms.internal.auth.zzee.zzk(p8, v8_3, v9_4));
                                } else {
                                    p11.zzf(p7, com.google.android.gms.internal.auth.zzee.zzb);
                                }
                                return (v8_3 + v9_4);
                            }
                        }
                    } else {
                        if (v0_2 == 3) {
                            int v0_4 = ((p7 & -8) | 4);
                            com.google.android.gms.internal.auth.zzgz v5 = com.google.android.gms.internal.auth.zzgz.zzc();
                            int v1_3 = 0;
                            while (p9 < p10) {
                                int v3 = com.google.android.gms.internal.auth.zzdt.zzj(p8, p9, p12);
                                v1_3 = p12.zza;
                                if (v1_3 != v0_4) {
                                    p9 = com.google.android.gms.internal.auth.zzdt.zzi(v1_3, p8, v3, p10, v5, p12);
                                } else {
                                    p9 = v3;
                                    break;
                                }
                            }
                            if ((p9 > p10) || (v1_3 != v0_4)) {
                                throw com.google.android.gms.internal.auth.zzfa.zzd();
                            } else {
                                p11.zzf(p7, v5);
                                return p9;
                            }
                        } else {
                            if (v0_2 != 5) {
                                throw com.google.android.gms.internal.auth.zzfa.zza();
                            } else {
                                p11.zzf(p7, Integer.valueOf(com.google.android.gms.internal.auth.zzdt.zzb(p8, p9)));
                                return (p9 + 4);
                            }
                        }
                    }
                }
            }
        }
    }

    public static int zzj(byte[] p1, int p2, com.google.android.gms.internal.auth.zzds p3)
    {
        int v0 = (p2 + 1);
        byte v2_1 = p1[p2];
        if (v2_1 < 0) {
            return com.google.android.gms.internal.auth.zzdt.zzk(v2_1, p1, v0, p3);
        } else {
            p3.zza = v2_1;
            return v0;
        }
    }

    public static int zzk(int p2, byte[] p3, int p4, com.google.android.gms.internal.auth.zzds p5)
    {
        int v2_1 = (p2 & 127);
        int v0_0 = (p4 + 1);
        int v1_3 = p3[p4];
        if (v1_3 < 0) {
            int v2_9 = (v2_1 | ((v1_3 & 127) << 7));
            int v1_6 = (p4 + 2);
            int v0_8 = p3[v0_0];
            if (v0_8 < 0) {
                int v2_2 = (v2_9 | ((v0_8 & 127) << 14));
                int v0_3 = (p4 + 3);
                int v1_0 = p3[v1_6];
                if (v1_0 < 0) {
                    int v2_3 = (v2_2 | ((v1_0 & 127) << 21));
                    int v4_1 = (p4 + 4);
                    int v0_4 = p3[v0_3];
                    if (v0_4 >= 0) {
                        p5.zza = (v2_3 | (v0_4 << 28));
                        return v4_1;
                    }
                    while(true) {
                        int v0_7 = (v4_1 + 1);
                        if (p3[v4_1] >= 0) {
                            break;
                        }
                        v4_1 = v0_7;
                    }
                    p5.zza = (v2_3 | ((v0_4 & 127) << 28));
                    return v0_7;
                } else {
                    p5.zza = (v2_2 | (v1_0 << 21));
                    return v0_3;
                }
            } else {
                p5.zza = (v2_9 | (v0_8 << 14));
                return v1_6;
            }
        } else {
            p5.zza = (v2_1 | (v1_3 << 7));
            return v0_0;
        }
    }

    public static int zzl(int p2, byte[] p3, int p4, int p5, com.google.android.gms.internal.auth.zzey p6, com.google.android.gms.internal.auth.zzds p7)
    {
        int v4_1 = com.google.android.gms.internal.auth.zzdt.zzj(p3, p4, p7);
        ((com.google.android.gms.internal.auth.zzev) p6).zze(p7.zza);
        while (v4_1 < p5) {
            int v0_2 = com.google.android.gms.internal.auth.zzdt.zzj(p3, v4_1, p7);
            if (p2 != p7.zza) {
                break;
            }
            v4_1 = com.google.android.gms.internal.auth.zzdt.zzj(p3, v0_2, p7);
            ((com.google.android.gms.internal.auth.zzev) p6).zze(p7.zza);
        }
        return v4_1;
    }

    public static int zzm(byte[] p9, int p10, com.google.android.gms.internal.auth.zzds p11)
    {
        byte v0_0 = (p10 + 1);
        long v1_2 = ((long) p9[p10]);
        if (v1_2 < 0) {
            int v10_2 = (p10 + 2);
            byte v0_2 = p9[v0_0];
            long v1_1 = ((v1_2 & 127) | (((long) (v0_2 & 127)) << 7));
            int v3_3 = 7;
            while (v0_2 < 0) {
                int v10_1 = p9[v10_2];
                v3_3 += 7;
                v1_1 |= (((long) (v10_1 & 127)) << v3_3);
                v0_2 = v10_1;
                v10_2++;
            }
            p11.zzb = v1_1;
            return v10_2;
        } else {
            p11.zzb = v1_2;
            return v0_0;
        }
    }

    public static long zzn(byte[] p7, int p8)
    {
        return (((((long) p7[(p8 + 7)]) & 255) << 56) | (((((((((long) p7[p8]) & 255) | ((((long) p7[(p8 + 1)]) & 255) << 8)) | ((((long) p7[(p8 + 2)]) & 255) << 16)) | ((((long) p7[(p8 + 3)]) & 255) << 24)) | ((((long) p7[(p8 + 4)]) & 255) << 32)) | ((((long) p7[(p8 + 5)]) & 255) << 40)) | ((((long) p7[(p8 + 6)]) & 255) << 48)));
    }
}
