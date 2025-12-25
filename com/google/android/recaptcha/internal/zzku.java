package com.google.android.recaptcha.internal;
final class zzku {
    public static final synthetic int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] p2, int p3, com.google.android.recaptcha.internal.zzkt p4)
    {
        int v3_1 = com.google.android.recaptcha.internal.zzku.zzi(p2, p3, p4);
        int v0 = p4.zza;
        if (v0 < 0) {
            throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            if (v0 > (p2.length - v3_1)) {
                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else {
                if (v0 != 0) {
                    p4.zzc = com.google.android.recaptcha.internal.zzle.zzk(p2, v3_1, v0);
                    return (v3_1 + v0);
                } else {
                    p4.zzc = com.google.android.recaptcha.internal.zzle.zzb;
                    return v3_1;
                }
            }
        }
    }

    public static int zzb(byte[] p3, int p4)
    {
        return (((p3[(p4 + 3)] & 255) << 24) | ((((p3[(p4 + 1)] & 255) << 8) | (p3[p4] & 255)) | ((p3[(p4 + 2)] & 255) << 16)));
    }

    public static int zzc(com.google.android.recaptcha.internal.zzow p7, byte[] p8, int p9, int p10, int p11, com.google.android.recaptcha.internal.zzkt p12)
    {
        Object v0 = p7.zze();
        int v7_1 = com.google.android.recaptcha.internal.zzku.zzm(v0, p7, p8, p9, p10, p11, p12);
        p7.zzf(v0);
        p12.zzc = v0;
        return v7_1;
    }

    public static int zzd(com.google.android.recaptcha.internal.zzow p6, byte[] p7, int p8, int p9, com.google.android.recaptcha.internal.zzkt p10)
    {
        Object v0 = p6.zze();
        int v6_1 = com.google.android.recaptcha.internal.zzku.zzn(v0, p6, p7, p8, p9, p10);
        p6.zzf(v0);
        p10.zzc = v0;
        return v6_1;
    }

    public static int zze(com.google.android.recaptcha.internal.zzow p2, int p3, byte[] p4, int p5, int p6, com.google.android.recaptcha.internal.zznk p7, com.google.android.recaptcha.internal.zzkt p8)
    {
        int v5_1 = com.google.android.recaptcha.internal.zzku.zzd(p2, p4, p5, p6, p8);
        p7.add(p8.zzc);
        while (v5_1 < p6) {
            Object v0_2 = com.google.android.recaptcha.internal.zzku.zzi(p4, v5_1, p8);
            if (p3 != p8.zza) {
                break;
            }
            v5_1 = com.google.android.recaptcha.internal.zzku.zzd(p2, p4, v0_2, p6, p8);
            p7.add(p8.zzc);
        }
        return v5_1;
    }

    public static int zzf(byte[] p2, int p3, com.google.android.recaptcha.internal.zznk p4, com.google.android.recaptcha.internal.zzkt p5)
    {
        String v3_1 = com.google.android.recaptcha.internal.zzku.zzi(p2, p3, p5);
        int v0_1 = (p5.zza + v3_1);
        while (v3_1 < v0_1) {
            v3_1 = com.google.android.recaptcha.internal.zzku.zzi(p2, v3_1, p5);
            ((com.google.android.recaptcha.internal.zzne) p4).zzh(p5.zza);
        }
        if (v3_1 != v0_1) {
            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else {
            return v3_1;
        }
    }

    public static int zzg(byte[] p3, int p4, com.google.android.recaptcha.internal.zzkt p5)
    {
        int v4_1 = com.google.android.recaptcha.internal.zzku.zzi(p3, p4, p5);
        int v0 = p5.zza;
        if (v0 < 0) {
            throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            if (v0 != 0) {
                p5.zzc = new String(p3, v4_1, v0, com.google.android.recaptcha.internal.zznl.zza);
                return (v4_1 + v0);
            } else {
                p5.zzc = "";
                return v4_1;
            }
        }
    }

    public static int zzh(int p9, byte[] p10, int p11, int p12, com.google.android.recaptcha.internal.zzpm p13, com.google.android.recaptcha.internal.zzkt p14)
    {
        if ((p9 >> 3) == 0) {
            throw new com.google.android.recaptcha.internal.zznn("Protocol message contained an invalid tag (zero).");
        } else {
            int v0_4 = (p9 & 7);
            if (v0_4 == 0) {
                String v10_1 = com.google.android.recaptcha.internal.zzku.zzl(p10, p11, p14);
                p13.zzj(p9, Long.valueOf(p14.zzb));
                return v10_1;
            } else {
                if (v0_4 == 1) {
                    p13.zzj(p9, Long.valueOf(com.google.android.recaptcha.internal.zzku.zzp(p10, p11)));
                    return (p11 + 8);
                } else {
                    if (v0_4 == 2) {
                        String v10_3 = com.google.android.recaptcha.internal.zzku.zzi(p10, p11, p14);
                        int v11_5 = p14.zza;
                        if (v11_5 < 0) {
                            throw new com.google.android.recaptcha.internal.zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                        } else {
                            if (v11_5 > (p10.length - v10_3)) {
                                throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            } else {
                                if (v11_5 != 0) {
                                    p13.zzj(p9, com.google.android.recaptcha.internal.zzle.zzk(p10, v10_3, v11_5));
                                } else {
                                    p13.zzj(p9, com.google.android.recaptcha.internal.zzle.zzb);
                                }
                                return (v10_3 + v11_5);
                            }
                        }
                    } else {
                        if (v0_4 == 3) {
                            int v0_3 = ((p9 & -8) | 4);
                            com.google.android.recaptcha.internal.zzpm v7 = com.google.android.recaptcha.internal.zzpm.zzf();
                            int v1_2 = (p14.zze + 1);
                            p14.zze = v1_2;
                            com.google.android.recaptcha.internal.zzku.zzq(v1_2);
                            int v1_3 = 0;
                            while (p11 < p12) {
                                int v5 = com.google.android.recaptcha.internal.zzku.zzi(p10, p11, p14);
                                int v3_2 = p14.zza;
                                if (v3_2 != v0_3) {
                                    p11 = com.google.android.recaptcha.internal.zzku.zzh(v3_2, p10, v5, p12, v7, p14);
                                    v1_3 = v3_2;
                                } else {
                                    v1_3 = v3_2;
                                    p11 = v5;
                                    break;
                                }
                            }
                            p14.zze = (p14.zze - 1);
                            if ((p11 > p12) || (v1_3 != v0_3)) {
                                throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
                            } else {
                                p13.zzj(p9, v7);
                                return p11;
                            }
                        } else {
                            if (v0_4 != 5) {
                                throw new com.google.android.recaptcha.internal.zznn("Protocol message contained an invalid tag (zero).");
                            } else {
                                p13.zzj(p9, Integer.valueOf(com.google.android.recaptcha.internal.zzku.zzb(p10, p11)));
                                return (p11 + 4);
                            }
                        }
                    }
                }
            }
        }
    }

    public static int zzi(byte[] p1, int p2, com.google.android.recaptcha.internal.zzkt p3)
    {
        int v0 = (p2 + 1);
        byte v2_1 = p1[p2];
        if (v2_1 < 0) {
            return com.google.android.recaptcha.internal.zzku.zzj(v2_1, p1, v0, p3);
        } else {
            p3.zza = v2_1;
            return v0;
        }
    }

    public static int zzj(int p2, byte[] p3, int p4, com.google.android.recaptcha.internal.zzkt p5)
    {
        int v0_0 = p3[p4];
        int v1_0 = (p4 + 1);
        int v2_3 = (p2 & 127);
        if (v0_0 < 0) {
            int v2_9 = (v2_3 | ((v0_0 & 127) << 7));
            int v0_10 = (p4 + 2);
            int v1_4 = p3[v1_0];
            if (v1_4 < 0) {
                int v2_1 = (v2_9 | ((v1_4 & 127) << 14));
                int v1_3 = (p4 + 3);
                int v0_1 = p3[v0_10];
                if (v0_1 < 0) {
                    int v2_2 = (v2_1 | ((v0_1 & 127) << 21));
                    int v4_1 = (p4 + 4);
                    int v0_4 = p3[v1_3];
                    if (v0_4 >= 0) {
                        p5.zza = (v2_2 | (v0_4 << 28));
                        return v4_1;
                    }
                    while(true) {
                        int v0_7 = (v4_1 + 1);
                        if (p3[v4_1] >= 0) {
                            break;
                        }
                        v4_1 = v0_7;
                    }
                    p5.zza = (v2_2 | ((v0_4 & 127) << 28));
                    return v0_7;
                } else {
                    p5.zza = (v2_1 | (v0_1 << 21));
                    return v1_3;
                }
            } else {
                p5.zza = (v2_9 | (v1_4 << 14));
                return v0_10;
            }
        } else {
            p5.zza = (v2_3 | (v0_0 << 7));
            return v1_0;
        }
    }

    public static int zzk(int p2, byte[] p3, int p4, int p5, com.google.android.recaptcha.internal.zznk p6, com.google.android.recaptcha.internal.zzkt p7)
    {
        int v4_1 = com.google.android.recaptcha.internal.zzku.zzi(p3, p4, p7);
        ((com.google.android.recaptcha.internal.zzne) p6).zzh(p7.zza);
        while (v4_1 < p5) {
            int v0_2 = com.google.android.recaptcha.internal.zzku.zzi(p3, v4_1, p7);
            if (p2 != p7.zza) {
                break;
            }
            v4_1 = com.google.android.recaptcha.internal.zzku.zzi(p3, v0_2, p7);
            ((com.google.android.recaptcha.internal.zzne) p6).zzh(p7.zza);
        }
        return v4_1;
    }

    public static int zzl(byte[] p9, int p10, com.google.android.recaptcha.internal.zzkt p11)
    {
        long v0_1 = ((long) p9[p10]);
        int v3_3 = (p10 + 1);
        if (v0_1 < 0) {
            int v10_2 = (p10 + 2);
            byte v2_2 = p9[v3_3];
            long v0_3 = ((v0_1 & 127) | (((long) (v2_2 & 127)) << 7));
            int v3_2 = 7;
            while (v2_2 < 0) {
                int v10_1 = p9[v10_2];
                v3_2 += 7;
                v0_3 |= (((long) (v10_1 & 127)) << v3_2);
                v2_2 = v10_1;
                v10_2++;
            }
            p11.zzb = v0_3;
            return v10_2;
        } else {
            p11.zzb = v0_1;
            return v3_3;
        }
    }

    public static int zzm(Object p2, com.google.android.recaptcha.internal.zzow p3, byte[] p4, int p5, int p6, int p7, com.google.android.recaptcha.internal.zzkt p8)
    {
        int v0_1 = (p8.zze + 1);
        p8.zze = v0_1;
        com.google.android.recaptcha.internal.zzku.zzq(v0_1);
        int v2_2 = ((com.google.android.recaptcha.internal.zzol) p3).zzc(p2, p4, p5, p6, p7, p8);
        p8.zze = (p8.zze - 1);
        p8.zzc = p2;
        return v2_2;
    }

    public static int zzn(Object p6, com.google.android.recaptcha.internal.zzow p7, byte[] p8, int p9, int p10, com.google.android.recaptcha.internal.zzkt p11)
    {
        String v0_0 = (p9 + 1);
        int v9_1 = p8[p9];
        if (v9_1 < 0) {
            v0_0 = com.google.android.recaptcha.internal.zzku.zzj(v9_1, p8, v0_0, p11);
            v9_1 = p11.zza;
        }
        int v3 = v0_0;
        if ((v9_1 < 0) || (v9_1 > (p10 - v3))) {
            throw new com.google.android.recaptcha.internal.zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else {
            int v10_2 = (p11.zze + 1);
            p11.zze = v10_2;
            com.google.android.recaptcha.internal.zzku.zzq(v10_2);
            int v4 = (v3 + v9_1);
            p7.zzi(p6, p8, v3, v4, p11);
            p11.zze = (p11.zze - 1);
            p11.zzc = p6;
            return v4;
        }
    }

    public static int zzo(int p3, byte[] p4, int p5, int p6, com.google.android.recaptcha.internal.zzkt p7)
    {
        if ((p3 >> 3) == 0) {
            throw new com.google.android.recaptcha.internal.zznn("Protocol message contained an invalid tag (zero).");
        } else {
            int v0_2 = (p3 & 7);
            if (v0_2 == 0) {
                return com.google.android.recaptcha.internal.zzku.zzl(p4, p5, p7);
            } else {
                if (v0_2 == 1) {
                    return (p5 + 8);
                } else {
                    if (v0_2 == 2) {
                        return (com.google.android.recaptcha.internal.zzku.zzi(p4, p5, p7) + p7.zza);
                    } else {
                        if (v0_2 == 3) {
                            com.google.android.recaptcha.internal.zznn v3_4 = ((p3 & -8) | 4);
                            int v0_1 = 0;
                            while (p5 < p6) {
                                p5 = com.google.android.recaptcha.internal.zzku.zzi(p4, p5, p7);
                                v0_1 = p7.zza;
                                if (v0_1 == v3_4) {
                                    break;
                                }
                                p5 = com.google.android.recaptcha.internal.zzku.zzo(v0_1, p4, p5, p6, p7);
                            }
                            if ((p5 > p6) || (v0_1 != v3_4)) {
                                throw new com.google.android.recaptcha.internal.zznn("Failed to parse the message.");
                            } else {
                                return p5;
                            }
                        } else {
                            if (v0_2 != 5) {
                                throw new com.google.android.recaptcha.internal.zznn("Protocol message contained an invalid tag (zero).");
                            } else {
                                return (p5 + 4);
                            }
                        }
                    }
                }
            }
        }
    }

    public static long zzp(byte[] p18, int p19)
    {
        return ((((((((((long) p18[p19]) & 255) | ((((long) p18[(p19 + 1)]) & 255) << 8)) | ((((long) p18[(p19 + 2)]) & 255) << 16)) | ((((long) p18[(p19 + 3)]) & 255) << 24)) | ((((long) p18[(p19 + 4)]) & 255) << 32)) | ((((long) p18[(p19 + 5)]) & 255) << 40)) | ((((long) p18[(p19 + 6)]) & 255) << 48)) | ((((long) p18[(p19 + 7)]) & 255) << 56));
    }

    private static void zzq(int p1)
    {
        if (p1 >= com.google.android.recaptcha.internal.zzku.zzb) {
            throw new com.google.android.recaptcha.internal.zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        } else {
            return;
        }
    }
}
