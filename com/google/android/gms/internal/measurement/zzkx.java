package com.google.android.gms.internal.measurement;
final class zzkx {
    public static final synthetic int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] p1, int p2, com.google.android.gms.internal.measurement.zzkw p3)
    {
        int v0 = (p2 + 1);
        byte v2_1 = p1[p2];
        if (v2_1 < 0) {
            return com.google.android.gms.internal.measurement.zzkx.zzb(v2_1, p1, v0, p3);
        } else {
            p3.zza = v2_1;
            return v0;
        }
    }

    public static int zzb(int p2, byte[] p3, int p4, com.google.android.gms.internal.measurement.zzkw p5)
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

    public static int zzc(byte[] p9, int p10, com.google.android.gms.internal.measurement.zzkw p11)
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

    public static int zzd(byte[] p3, int p4)
    {
        return (((p3[(p4 + 3)] & 255) << 24) | ((((p3[(p4 + 1)] & 255) << 8) | (p3[p4] & 255)) | ((p3[(p4 + 2)] & 255) << 16)));
    }

    public static long zze(byte[] p18, int p19)
    {
        return ((((((((((long) p18[p19]) & 255) | ((((long) p18[(p19 + 1)]) & 255) << 8)) | ((((long) p18[(p19 + 2)]) & 255) << 16)) | ((((long) p18[(p19 + 3)]) & 255) << 24)) | ((((long) p18[(p19 + 4)]) & 255) << 32)) | ((((long) p18[(p19 + 5)]) & 255) << 40)) | ((((long) p18[(p19 + 6)]) & 255) << 48)) | ((((long) p18[(p19 + 7)]) & 255) << 56));
    }

    public static int zzf(byte[] p8, int p9, com.google.android.gms.internal.measurement.zzkw p10)
    {
        int v9_1 = com.google.android.gms.internal.measurement.zzkx.zza(p8, p9, p10);
        Integer v0_0 = p10.zza;
        if (v0_0 < null) {
            throw new com.google.android.gms.internal.measurement.zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            if (v0_0 != null) {
                int v1_0 = p8.length;
                if ((((v1_0 - v9_1) - v0_0) | (v9_1 | v0_0)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] {Integer.valueOf(v1_0), Integer.valueOf(v9_1), Integer.valueOf(v0_0)})));
                } else {
                    int v1_1 = (v9_1 + v0_0);
                    char[] v6 = new char[v0_0];
                    char v2_1 = 0;
                    while (v9_1 < v1_1) {
                        com.google.android.gms.internal.measurement.zzmr v3_3 = p8[v9_1];
                        if (!com.google.android.gms.internal.measurement.zzoq.zza(v3_3)) {
                            break;
                        }
                        v9_1++;
                        com.google.android.gms.internal.measurement.zzmr v4_0 = (v2_1 + 1);
                        v6[v2_1] = ((char) v3_3);
                        v2_1 = v4_0;
                    }
                    int v7 = v2_1;
                    while (v9_1 < v1_1) {
                        com.google.android.gms.internal.measurement.zzmr v3_4 = (v9_1 + 1);
                        char v2_6 = p8[v9_1];
                        if (!com.google.android.gms.internal.measurement.zzoq.zza(v2_6)) {
                            com.google.android.gms.internal.measurement.zzmr v4_9;
                            if (v2_6 >= -32) {
                                if (v2_6 >= -16) {
                                    if (v3_4 >= (v1_1 - 2)) {
                                        throw new com.google.android.gms.internal.measurement.zzmr("Protocol message had invalid UTF-8.");
                                    } else {
                                        com.google.android.gms.internal.measurement.zzmr v5_1 = (v9_1 + 3);
                                        com.google.android.gms.internal.measurement.zzmr v4_7 = p8[(v9_1 + 2)];
                                        v9_1 += 4;
                                        com.google.android.gms.internal.measurement.zzoq.zzd(v2_6, p8[v3_4], v4_7, p8[v5_1], v6, v7);
                                        v7 += 2;
                                    }
                                } else {
                                    if (v3_4 >= (v1_1 - 1)) {
                                        throw new com.google.android.gms.internal.measurement.zzmr("Protocol message had invalid UTF-8.");
                                    } else {
                                        v4_9 = (v7 + 1);
                                        com.google.android.gms.internal.measurement.zzmr v5_3 = (v9_1 + 2);
                                        v9_1 += 3;
                                        com.google.android.gms.internal.measurement.zzoq.zzc(v2_6, p8[v3_4], p8[v5_3], v6, v7);
                                    }
                                }
                            } else {
                                if (v3_4 >= v1_1) {
                                    throw new com.google.android.gms.internal.measurement.zzmr("Protocol message had invalid UTF-8.");
                                } else {
                                    v4_9 = (v7 + 1);
                                    v9_1 += 2;
                                    com.google.android.gms.internal.measurement.zzoq.zzb(v2_6, p8[v3_4], v6, v7);
                                }
                            }
                            v7 = v4_9;
                        } else {
                            int v9_6 = (v7 + 1);
                            v6[v7] = ((char) v2_6);
                            v7 = v9_6;
                            v9_1 = v3_4;
                            while (v9_1 < v1_1) {
                                char v2_8 = p8[v9_1];
                                if (!com.google.android.gms.internal.measurement.zzoq.zza(v2_8)) {
                                    break;
                                }
                                v9_1++;
                                com.google.android.gms.internal.measurement.zzmr v3_0 = (v7 + 1);
                                v6[v7] = ((char) v2_8);
                                v7 = v3_0;
                            }
                        }
                    }
                    p10.zzc = new String(v6, 0, v7);
                    return v1_1;
                }
            } else {
                p10.zzc = "";
                return v9_1;
            }
        }
    }

    public static int zzg(byte[] p2, int p3, com.google.android.gms.internal.measurement.zzkw p4)
    {
        int v3_1 = com.google.android.gms.internal.measurement.zzkx.zza(p2, p3, p4);
        int v0 = p4.zza;
        if (v0 < 0) {
            throw new com.google.android.gms.internal.measurement.zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            if (v0 > (p2.length - v3_1)) {
                throw new com.google.android.gms.internal.measurement.zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else {
                if (v0 != 0) {
                    p4.zzc = com.google.android.gms.internal.measurement.zzlh.zzh(p2, v3_1, v0);
                    return (v3_1 + v0);
                } else {
                    p4.zzc = com.google.android.gms.internal.measurement.zzlh.zzb;
                    return v3_1;
                }
            }
        }
    }

    public static int zzh(com.google.android.gms.internal.measurement.zznx p6, byte[] p7, int p8, int p9, com.google.android.gms.internal.measurement.zzkw p10)
    {
        Object v0 = p6.zza();
        int v6_1 = com.google.android.gms.internal.measurement.zzkx.zzj(v0, p6, p7, p8, p9, p10);
        p6.zzj(v0);
        p10.zzc = v0;
        return v6_1;
    }

    public static int zzi(com.google.android.gms.internal.measurement.zznx p7, byte[] p8, int p9, int p10, int p11, com.google.android.gms.internal.measurement.zzkw p12)
    {
        Object v0 = p7.zza();
        int v7_1 = com.google.android.gms.internal.measurement.zzkx.zzk(v0, p7, p8, p9, p10, p11, p12);
        p7.zzj(v0);
        p12.zzc = v0;
        return v7_1;
    }

    public static int zzj(Object p6, com.google.android.gms.internal.measurement.zznx p7, byte[] p8, int p9, int p10, com.google.android.gms.internal.measurement.zzkw p11)
    {
        String v0_0 = (p9 + 1);
        int v9_1 = p8[p9];
        if (v9_1 < 0) {
            v0_0 = com.google.android.gms.internal.measurement.zzkx.zzb(v9_1, p8, v0_0, p11);
            v9_1 = p11.zza;
        }
        int v3 = v0_0;
        if ((v9_1 < 0) || (v9_1 > (p10 - v3))) {
            throw new com.google.android.gms.internal.measurement.zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else {
            int v10_2 = (p11.zze + 1);
            p11.zze = v10_2;
            com.google.android.gms.internal.measurement.zzkx.zzq(v10_2);
            int v4 = (v3 + v9_1);
            p7.zzi(p6, p8, v3, v4, p11);
            p11.zze = (p11.zze - 1);
            p11.zzc = p6;
            return v4;
        }
    }

    public static int zzk(Object p2, com.google.android.gms.internal.measurement.zznx p3, byte[] p4, int p5, int p6, int p7, com.google.android.gms.internal.measurement.zzkw p8)
    {
        int v0_1 = (p8.zze + 1);
        p8.zze = v0_1;
        com.google.android.gms.internal.measurement.zzkx.zzq(v0_1);
        int v2_2 = ((com.google.android.gms.internal.measurement.zznp) p3).zzh(p2, p4, p5, p6, p7, p8);
        p8.zze = (p8.zze - 1);
        p8.zzc = p2;
        return v2_2;
    }

    public static int zzl(int p2, byte[] p3, int p4, int p5, com.google.android.gms.internal.measurement.zzmo p6, com.google.android.gms.internal.measurement.zzkw p7)
    {
        int v4_1 = com.google.android.gms.internal.measurement.zzkx.zza(p3, p4, p7);
        ((com.google.android.gms.internal.measurement.zzmg) p6).zzh(p7.zza);
        while (v4_1 < p5) {
            int v0_2 = com.google.android.gms.internal.measurement.zzkx.zza(p3, v4_1, p7);
            if (p2 != p7.zza) {
                break;
            }
            v4_1 = com.google.android.gms.internal.measurement.zzkx.zza(p3, v0_2, p7);
            ((com.google.android.gms.internal.measurement.zzmg) p6).zzh(p7.zza);
        }
        return v4_1;
    }

    public static int zzm(byte[] p2, int p3, com.google.android.gms.internal.measurement.zzmo p4, com.google.android.gms.internal.measurement.zzkw p5)
    {
        String v3_1 = com.google.android.gms.internal.measurement.zzkx.zza(p2, p3, p5);
        int v0_1 = (p5.zza + v3_1);
        while (v3_1 < v0_1) {
            v3_1 = com.google.android.gms.internal.measurement.zzkx.zza(p2, v3_1, p5);
            ((com.google.android.gms.internal.measurement.zzmg) p4).zzh(p5.zza);
        }
        if (v3_1 != v0_1) {
            throw new com.google.android.gms.internal.measurement.zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else {
            return v3_1;
        }
    }

    public static int zzn(com.google.android.gms.internal.measurement.zznx p2, int p3, byte[] p4, int p5, int p6, com.google.android.gms.internal.measurement.zzmo p7, com.google.android.gms.internal.measurement.zzkw p8)
    {
        int v5_1 = com.google.android.gms.internal.measurement.zzkx.zzh(p2, p4, p5, p6, p8);
        p7.add(p8.zzc);
        while (v5_1 < p6) {
            Object v0_2 = com.google.android.gms.internal.measurement.zzkx.zza(p4, v5_1, p8);
            if (p3 != p8.zza) {
                break;
            }
            v5_1 = com.google.android.gms.internal.measurement.zzkx.zzh(p2, p4, v0_2, p6, p8);
            p7.add(p8.zzc);
        }
        return v5_1;
    }

    public static int zzo(int p9, byte[] p10, int p11, int p12, com.google.android.gms.internal.measurement.zzoj p13, com.google.android.gms.internal.measurement.zzkw p14)
    {
        if ((p9 >> 3) == 0) {
            throw new com.google.android.gms.internal.measurement.zzmr("Protocol message contained an invalid tag (zero).");
        } else {
            int v0_4 = (p9 & 7);
            if (v0_4 == 0) {
                String v10_1 = com.google.android.gms.internal.measurement.zzkx.zzc(p10, p11, p14);
                p13.zzk(p9, Long.valueOf(p14.zzb));
                return v10_1;
            } else {
                if (v0_4 == 1) {
                    p13.zzk(p9, Long.valueOf(com.google.android.gms.internal.measurement.zzkx.zze(p10, p11)));
                    return (p11 + 8);
                } else {
                    if (v0_4 == 2) {
                        String v10_3 = com.google.android.gms.internal.measurement.zzkx.zza(p10, p11, p14);
                        int v11_5 = p14.zza;
                        if (v11_5 < 0) {
                            throw new com.google.android.gms.internal.measurement.zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                        } else {
                            if (v11_5 > (p10.length - v10_3)) {
                                throw new com.google.android.gms.internal.measurement.zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            } else {
                                if (v11_5 != 0) {
                                    p13.zzk(p9, com.google.android.gms.internal.measurement.zzlh.zzh(p10, v10_3, v11_5));
                                } else {
                                    p13.zzk(p9, com.google.android.gms.internal.measurement.zzlh.zzb);
                                }
                                return (v10_3 + v11_5);
                            }
                        }
                    } else {
                        if (v0_4 == 3) {
                            int v0_3 = ((p9 & -8) | 4);
                            com.google.android.gms.internal.measurement.zzoj v7 = com.google.android.gms.internal.measurement.zzoj.zzb();
                            int v1_2 = (p14.zze + 1);
                            p14.zze = v1_2;
                            com.google.android.gms.internal.measurement.zzkx.zzq(v1_2);
                            int v1_3 = 0;
                            while (p11 < p12) {
                                int v5 = com.google.android.gms.internal.measurement.zzkx.zza(p10, p11, p14);
                                int v3_2 = p14.zza;
                                if (v3_2 != v0_3) {
                                    p11 = com.google.android.gms.internal.measurement.zzkx.zzo(v3_2, p10, v5, p12, v7, p14);
                                    v1_3 = v3_2;
                                } else {
                                    v1_3 = v3_2;
                                    p11 = v5;
                                    break;
                                }
                            }
                            p14.zze = (p14.zze - 1);
                            if ((p11 > p12) || (v1_3 != v0_3)) {
                                throw new com.google.android.gms.internal.measurement.zzmr("Failed to parse the message.");
                            } else {
                                p13.zzk(p9, v7);
                                return p11;
                            }
                        } else {
                            if (v0_4 != 5) {
                                throw new com.google.android.gms.internal.measurement.zzmr("Protocol message contained an invalid tag (zero).");
                            } else {
                                p13.zzk(p9, Integer.valueOf(com.google.android.gms.internal.measurement.zzkx.zzd(p10, p11)));
                                return (p11 + 4);
                            }
                        }
                    }
                }
            }
        }
    }

    public static int zzp(int p3, byte[] p4, int p5, int p6, com.google.android.gms.internal.measurement.zzkw p7)
    {
        if ((p3 >> 3) == 0) {
            throw new com.google.android.gms.internal.measurement.zzmr("Protocol message contained an invalid tag (zero).");
        } else {
            int v0_2 = (p3 & 7);
            if (v0_2 == 0) {
                return com.google.android.gms.internal.measurement.zzkx.zzc(p4, p5, p7);
            } else {
                if (v0_2 == 1) {
                    return (p5 + 8);
                } else {
                    if (v0_2 == 2) {
                        return (com.google.android.gms.internal.measurement.zzkx.zza(p4, p5, p7) + p7.zza);
                    } else {
                        if (v0_2 == 3) {
                            com.google.android.gms.internal.measurement.zzmr v3_4 = ((p3 & -8) | 4);
                            int v0_1 = 0;
                            while (p5 < p6) {
                                p5 = com.google.android.gms.internal.measurement.zzkx.zza(p4, p5, p7);
                                v0_1 = p7.zza;
                                if (v0_1 == v3_4) {
                                    break;
                                }
                                p5 = com.google.android.gms.internal.measurement.zzkx.zzp(v0_1, p4, p5, p6, p7);
                            }
                            if ((p5 > p6) || (v0_1 != v3_4)) {
                                throw new com.google.android.gms.internal.measurement.zzmr("Failed to parse the message.");
                            } else {
                                return p5;
                            }
                        } else {
                            if (v0_2 != 5) {
                                throw new com.google.android.gms.internal.measurement.zzmr("Protocol message contained an invalid tag (zero).");
                            } else {
                                return (p5 + 4);
                            }
                        }
                    }
                }
            }
        }
    }

    private static void zzq(int p1)
    {
        if (p1 >= com.google.android.gms.internal.measurement.zzkx.zzb) {
            throw new com.google.android.gms.internal.measurement.zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        } else {
            return;
        }
    }
}
