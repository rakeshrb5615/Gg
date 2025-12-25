package com.google.android.gms.internal.auth;
final class zzhm {
    private static final com.google.android.gms.internal.auth.zzhk zza;

    static zzhm()
    {
        // Both branches of the condition point to the same code.
        // if ((com.google.android.gms.internal.auth.zzhi.zzu()) && (!com.google.android.gms.internal.auth.zzhi.zzv())) {
            com.google.android.gms.internal.auth.zzhm.zza = new com.google.android.gms.internal.auth.zzhl();
            return;
        // }
    }

    public static bridge synthetic int zza(byte[] p6, int p7, int p8)
    {
        byte v0_1 = p6[(p7 - 1)];
        byte v8_1 = (p8 - p7);
        if (v8_1 == 0) {
            if (v0_1 <= -12) {
                return v0_1;
            } else {
                return -1;
            }
        } else {
            if (v8_1 == 1) {
                int v6_1 = p6[p7];
                if (v0_1 > -12) {
                    return -1;
                } else {
                    if (v6_1 <= -65) {
                        return ((v6_1 << 8) ^ v0_1);
                    } else {
                        return -1;
                    }
                }
            } else {
                if (v8_1 != 2) {
                    throw new AssertionError();
                } else {
                    byte v8_2 = p6[p7];
                    int v6_6 = p6[(p7 + 1)];
                    if ((v0_1 > -12) || (v8_2 > -65)) {
                        return -1;
                    } else {
                        if (v6_6 <= -65) {
                            return ((v6_6 << 16) ^ ((v8_2 << 8) ^ v0_1));
                        } else {
                            return -1;
                        }
                    }
                }
            }
        }
    }

    public static String zzb(byte[] p7, int p8, int p9)
    {
        Integer v0_0 = p7.length;
        if (((p8 | p9) | ((v0_0 - p8) - p9)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] {Integer.valueOf(v0_0), Integer.valueOf(p8), Integer.valueOf(p9)})));
        } else {
            Integer v0_1 = (p8 + p9);
            char[] v5 = new char[p9];
            char v1_1 = 0;
            while (p8 < v0_1) {
                com.google.android.gms.internal.auth.zzfa v2_1 = p7[p8];
                if (!com.google.android.gms.internal.auth.zzhj.zzd(v2_1)) {
                    break;
                }
                p8++;
                com.google.android.gms.internal.auth.zzfa v3_1 = (v1_1 + 1);
                v5[v1_1] = ((char) v2_1);
                v1_1 = v3_1;
            }
            int v6 = v1_1;
            while (p8 < v0_1) {
                com.google.android.gms.internal.auth.zzfa v2_4 = (p8 + 1);
                char v1_4 = p7[p8];
                if (!com.google.android.gms.internal.auth.zzhj.zzd(v1_4)) {
                    if (v1_4 >= -32) {
                        if (v1_4 >= -16) {
                            if (v2_4 >= (v0_1 - 2)) {
                                throw com.google.android.gms.internal.auth.zzfa.zzb();
                            } else {
                                com.google.android.gms.internal.auth.zzfa v3_6 = (p8 + 2);
                                com.google.android.gms.internal.auth.zzfa v4_0 = (p8 + 3);
                                p8 += 4;
                                com.google.android.gms.internal.auth.zzhj.zza(v1_4, p7[v2_4], p7[v3_6], p7[v4_0], v5, v6);
                                v6 += 2;
                            }
                        } else {
                            if (v2_4 >= (v0_1 - 1)) {
                                throw com.google.android.gms.internal.auth.zzfa.zzb();
                            } else {
                                com.google.android.gms.internal.auth.zzfa v3_9 = (p8 + 2);
                                p8 += 3;
                                com.google.android.gms.internal.auth.zzfa v4_2 = (v6 + 1);
                                com.google.android.gms.internal.auth.zzhj.zzb(v1_4, p7[v2_4], p7[v3_9], v5, v6);
                                v6 = v4_2;
                            }
                        }
                    } else {
                        if (v2_4 >= v0_1) {
                            throw com.google.android.gms.internal.auth.zzfa.zzb();
                        } else {
                            p8 += 2;
                            com.google.android.gms.internal.auth.zzfa v3_11 = (v6 + 1);
                            com.google.android.gms.internal.auth.zzhj.zzc(v1_4, p7[v2_4], v5, v6);
                            v6 = v3_11;
                        }
                    }
                } else {
                    int v8_4 = (v6 + 1);
                    v5[v6] = ((char) v1_4);
                    v6 = v8_4;
                    p8 = v2_4;
                    while (p8 < v0_1) {
                        char v1_6 = p7[p8];
                        if (!com.google.android.gms.internal.auth.zzhj.zzd(v1_6)) {
                            break;
                        }
                        p8++;
                        com.google.android.gms.internal.auth.zzfa v2_9 = (v6 + 1);
                        v5[v6] = ((char) v1_6);
                        v6 = v2_9;
                    }
                }
            }
            return new String(v5, 0, v6);
        }
    }

    public static boolean zzc(byte[] p3)
    {
        return com.google.android.gms.internal.auth.zzhm.zza.zzb(p3, 0, p3.length);
    }

    public static boolean zzd(byte[] p1, int p2, int p3)
    {
        return com.google.android.gms.internal.auth.zzhm.zza.zzb(p1, p2, p3);
    }
}
