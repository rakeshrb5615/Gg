package com.google.android.gms.internal.firebase-auth-api;
final class zzajr {
    private static volatile int zza = 100;

    public static double zza(byte[] p0, int p1)
    {
        return Double.longBitsToDouble(com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p0, p1));
    }

    public static int zza(int p2, byte[] p3, int p4, int p5, com.google.android.gms.internal.firebase-auth-api.zzaju p6)
    {
        if ((p2 >> 3) == 0) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzc();
        } else {
            int v0_2 = (p2 & 7);
            if (v0_2 == 0) {
                return com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p3, p4, p6);
            } else {
                if (v0_2 == 1) {
                    return (p4 + 8);
                } else {
                    if (v0_2 == 2) {
                        return (com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p3, p4, p6) + p6.zza);
                    } else {
                        if (v0_2 == 3) {
                            com.google.android.gms.internal.firebase-auth-api.zzall v2_4 = ((p2 & -8) | 4);
                            int v0_1 = 0;
                            while (p4 < p5) {
                                p4 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p3, p4, p6);
                                v0_1 = p6.zza;
                                if (v0_1 == v2_4) {
                                    break;
                                }
                                p4 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v0_1, p3, p4, p5, p6);
                            }
                            if ((p4 > p5) || (v0_1 != v2_4)) {
                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzg();
                            } else {
                                return p4;
                            }
                        } else {
                            if (v0_2 != 5) {
                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzc();
                            } else {
                                return (p4 + 4);
                            }
                        }
                    }
                }
            }
        }
    }

    public static int zza(int p2, byte[] p3, int p4, int p5, com.google.android.gms.internal.firebase-auth-api.zzalm p6, com.google.android.gms.internal.firebase-auth-api.zzaju p7)
    {
        int v4_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p3, p4, p7);
        ((com.google.android.gms.internal.firebase-auth-api.zzali) p6).zzc(p7.zza);
        while (v4_1 < p5) {
            int v0_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p3, v4_1, p7);
            if (p2 != p7.zza) {
                break;
            }
            v4_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p3, v0_2, p7);
            ((com.google.android.gms.internal.firebase-auth-api.zzali) p6).zzc(p7.zza);
        }
        return v4_1;
    }

    public static int zza(int p8, byte[] p9, int p10, int p11, com.google.android.gms.internal.firebase-auth-api.zzanx p12, com.google.android.gms.internal.firebase-auth-api.zzaju p13)
    {
        if ((p8 >> 3) == 0) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzc();
        } else {
            int v0_2 = (p8 & 7);
            if (v0_2 == 0) {
                int v9_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p9, p10, p13);
                p12.zza(p8, Long.valueOf(p13.zzb));
                return v9_1;
            } else {
                if (v0_2 == 1) {
                    p12.zza(p8, Long.valueOf(com.google.android.gms.internal.firebase-auth-api.zzajr.zzd(p9, p10)));
                    return (p10 + 8);
                } else {
                    if (v0_2 == 2) {
                        int v9_3 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p9, p10, p13);
                        int v10_4 = p13.zza;
                        if (v10_4 < 0) {
                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
                        } else {
                            if (v10_4 > (p9.length - v9_3)) {
                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
                            } else {
                                if (v10_4 != 0) {
                                    p12.zza(p8, com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p9, v9_3, v10_4));
                                } else {
                                    p12.zza(p8, com.google.android.gms.internal.firebase-auth-api.zzajv.zza);
                                }
                                return (v9_3 + v10_4);
                            }
                        }
                    } else {
                        if (v0_2 == 3) {
                            com.google.android.gms.internal.firebase-auth-api.zzanx v6 = com.google.android.gms.internal.firebase-auth-api.zzanx.zzd();
                            int v0_4 = ((p8 & -8) | 4);
                            int v2_3 = (p13.zze + 1);
                            p13.zze = v2_3;
                            com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v2_3);
                            int v2_4 = 0;
                            while (p10 < p11) {
                                int v4 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p9, p10, p13);
                                v2_4 = p13.zza;
                                if (v2_4 == v0_4) {
                                    p10 = v4;
                                    break;
                                } else {
                                    p10 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v2_4, p9, v4, p11, v6, p13);
                                }
                            }
                            p13.zze = (p13.zze - 1);
                            if ((p10 > p11) || (v2_4 != v0_4)) {
                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzg();
                            } else {
                                p12.zza(p8, v6);
                                return p10;
                            }
                        } else {
                            if (v0_2 != 5) {
                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzc();
                            } else {
                                p12.zza(p8, Integer.valueOf(com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p9, p10)));
                                return (p10 + 4);
                            }
                        }
                    }
                }
            }
        }
    }

    public static int zza(int p6, byte[] p7, int p8, int p9, Object p10, com.google.android.gms.internal.firebase-auth-api.zzamm p11, com.google.android.gms.internal.firebase-auth-api.zzanu p12, com.google.android.gms.internal.firebase-auth-api.zzaju p13)
    {
        if (p13.zzd.zza(p11, (p6 >> 3)) != null) {
            ((com.google.android.gms.internal.firebase-auth-api.zzalf$zzd) p10).zza();
            throw new NoSuchMethodError();
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p6, p7, p8, p9, com.google.android.gms.internal.firebase-auth-api.zzamq.zzc(p10), p13);
        }
    }

    public static int zza(int p2, byte[] p3, int p4, com.google.android.gms.internal.firebase-auth-api.zzaju p5)
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

    public static int zza(com.google.android.gms.internal.firebase-auth-api.zzanb p7, int p8, byte[] p9, int p10, int p11, com.google.android.gms.internal.firebase-auth-api.zzalm p12, com.google.android.gms.internal.firebase-auth-api.zzaju p13)
    {
        int v5 = ((p8 & -8) | 4);
        int v7_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p7, p9, p10, p11, v5, p13);
        p12.add(p13.zzc);
        while (v7_1 < p11) {
            int v3_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p9, v7_1, p13);
            if (p8 != p13.zza) {
                break;
            }
            v7_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p7, p9, v3_0, p11, v5, p13);
            p12.add(p13.zzc);
        }
        return v7_1;
    }

    private static int zza(com.google.android.gms.internal.firebase-auth-api.zzanb p7, byte[] p8, int p9, int p10, int p11, com.google.android.gms.internal.firebase-auth-api.zzaju p12)
    {
        Object v0 = p7.zza();
        int v7_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v0, p7, p8, p9, p10, p11, p12);
        p7.zzd(v0);
        p12.zzc = v0;
        return v7_1;
    }

    public static int zza(com.google.android.gms.internal.firebase-auth-api.zzanb p6, byte[] p7, int p8, int p9, com.google.android.gms.internal.firebase-auth-api.zzaju p10)
    {
        Object v0 = p6.zza();
        int v6_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v0, p6, p7, p8, p9, p10);
        p6.zzd(v0);
        p10.zzc = v0;
        return v6_1;
    }

    public static int zza(Object p2, com.google.android.gms.internal.firebase-auth-api.zzanb p3, byte[] p4, int p5, int p6, int p7, com.google.android.gms.internal.firebase-auth-api.zzaju p8)
    {
        int v0_1 = (p8.zze + 1);
        p8.zze = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v0_1);
        int v2_2 = ((com.google.android.gms.internal.firebase-auth-api.zzamq) p3).zza(p2, p4, p5, p6, p7, p8);
        p8.zze = (p8.zze - 1);
        p8.zzc = p2;
        return v2_2;
    }

    public static int zza(Object p6, com.google.android.gms.internal.firebase-auth-api.zzanb p7, byte[] p8, int p9, int p10, com.google.android.gms.internal.firebase-auth-api.zzaju p11)
    {
        com.google.android.gms.internal.firebase-auth-api.zzanb v0_0 = (p9 + 1);
        int v9_1 = p8[p9];
        if (v9_1 < 0) {
            v0_0 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v9_1, p8, v0_0, p11);
            v9_1 = p11.zza;
        }
        int v3 = v0_0;
        if ((v9_1 < 0) || (v9_1 > (p10 - v3))) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
        } else {
            int v10_2 = (p11.zze + 1);
            p11.zze = v10_2;
            com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v10_2);
            int v4 = (v3 + v9_1);
            p7.zza(p6, p8, v3, v4, p11);
            p11.zze = (p11.zze - 1);
            p11.zzc = p6;
            return v4;
        }
    }

    public static int zza(byte[] p2, int p3, com.google.android.gms.internal.firebase-auth-api.zzaju p4)
    {
        int v3_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p2, p3, p4);
        int v0 = p4.zza;
        if (v0 < 0) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
        } else {
            if (v0 > (p2.length - v3_1)) {
                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
            } else {
                if (v0 != 0) {
                    p4.zzc = com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p2, v3_1, v0);
                    return (v3_1 + v0);
                } else {
                    p4.zzc = com.google.android.gms.internal.firebase-auth-api.zzajv.zza;
                    return v3_1;
                }
            }
        }
    }

    public static int zza(byte[] p2, int p3, com.google.android.gms.internal.firebase-auth-api.zzalm p4, com.google.android.gms.internal.firebase-auth-api.zzaju p5)
    {
        int v3_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p2, p3, p5);
        int v0_1 = (p5.zza + v3_1);
        while (v3_1 < v0_1) {
            v3_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p2, v3_1, p5);
            ((com.google.android.gms.internal.firebase-auth-api.zzali) p4).zzc(p5.zza);
        }
        if (v3_1 != v0_1) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzj();
        } else {
            return v3_1;
        }
    }

    private static void zza(int p1)
    {
        if (p1 >= com.google.android.gms.internal.firebase-auth-api.zzajr.zza) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzh();
        } else {
            return;
        }
    }

    public static float zzb(byte[] p0, int p1)
    {
        return Float.intBitsToFloat(com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p0, p1));
    }

    public static int zzb(com.google.android.gms.internal.firebase-auth-api.zzanb p2, int p3, byte[] p4, int p5, int p6, com.google.android.gms.internal.firebase-auth-api.zzalm p7, com.google.android.gms.internal.firebase-auth-api.zzaju p8)
    {
        int v5_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p2, p4, p5, p6, p8);
        p7.add(p8.zzc);
        while (v5_1 < p6) {
            Object v0_2 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p4, v5_1, p8);
            if (p3 != p8.zza) {
                break;
            }
            v5_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zza(p2, p4, v0_2, p6, p8);
            p7.add(p8.zzc);
        }
        return v5_1;
    }

    public static int zzb(byte[] p1, int p2, com.google.android.gms.internal.firebase-auth-api.zzaju p3)
    {
        int v2_1 = com.google.android.gms.internal.firebase-auth-api.zzajr.zzc(p1, p2, p3);
        int v0 = p3.zza;
        if (v0 < 0) {
            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzf();
        } else {
            if (v0 != 0) {
                p3.zzc = com.google.android.gms.internal.firebase-auth-api.zzaoa.zzb(p1, v2_1, v0);
                return (v2_1 + v0);
            } else {
                p3.zzc = "";
                return v2_1;
            }
        }
    }

    public static int zzc(byte[] p2, int p3)
    {
        return (((p2[(p3 + 3)] & 255) << 24) | (((p2[p3] & 255) | ((p2[(p3 + 1)] & 255) << 8)) | ((p2[(p3 + 2)] & 255) << 16)));
    }

    public static int zzc(byte[] p1, int p2, com.google.android.gms.internal.firebase-auth-api.zzaju p3)
    {
        int v0 = (p2 + 1);
        byte v2_1 = p1[p2];
        if (v2_1 < 0) {
            return com.google.android.gms.internal.firebase-auth-api.zzajr.zza(v2_1, p1, v0, p3);
        } else {
            p3.zza = v2_1;
            return v0;
        }
    }

    public static int zzd(byte[] p9, int p10, com.google.android.gms.internal.firebase-auth-api.zzaju p11)
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

    public static long zzd(byte[] p7, int p8)
    {
        return (((((long) p7[(p8 + 7)]) & 255) << 56) | (((((((((long) p7[p8]) & 255) | ((((long) p7[(p8 + 1)]) & 255) << 8)) | ((((long) p7[(p8 + 2)]) & 255) << 16)) | ((((long) p7[(p8 + 3)]) & 255) << 24)) | ((((long) p7[(p8 + 4)]) & 255) << 32)) | ((((long) p7[(p8 + 5)]) & 255) << 40)) | ((((long) p7[(p8 + 6)]) & 255) << 48)));
    }
}
