package com.google.android.gms.internal.play_billing;
final class zzhr {
    public static final synthetic int zza;

    static zzhr()
    {
        // Both branches of the condition point to the same code.
        // if ((com.google.android.gms.internal.play_billing.zzho.zzx()) && (!com.google.android.gms.internal.play_billing.zzho.zzy())) {
            return;
        // }
    }

    public static bridge synthetic int zza(byte[] p5, int p6, int p7)
    {
        int v7_1 = (p7 - p6);
        byte v0_1 = p5[(p6 - 1)];
        if (v7_1 == 0) {
            if (v0_1 <= -12) {
                return v0_1;
            }
        } else {
            if (v7_1 == 1) {
                int v5_1 = p5[p6];
                if ((v0_1 <= -12) && (v5_1 <= -65)) {
                    return ((v5_1 << 8) ^ v0_1);
                }
            } else {
                if (v7_1 != 2) {
                    throw new AssertionError();
                } else {
                    int v7_2 = p5[p6];
                    int v5_6 = p5[(p6 + 1)];
                    if ((v0_1 <= -12) && ((v7_2 <= -65) && (v5_6 <= -65))) {
                        return ((v5_6 << 16) ^ ((v7_2 << 8) ^ v0_1));
                    }
                }
            }
        }
        return -1;
    }

    public static int zzb(String p8, byte[] p9, int p10, int p11)
    {
        String v0_0 = p8.length();
        int v1_0 = 0;
        while(true) {
            int v2_1 = (p10 + p11);
            if (v1_0 >= v0_0) {
                break;
            }
            int v4_6 = (v1_0 + p10);
            if (v4_6 >= v2_1) {
                break;
            }
            int v5_5 = p8.charAt(v1_0);
            if (v5_5 >= 128) {
                break;
            }
            p9[v4_6] = ((byte) v5_5);
            v1_0++;
        }
        if (v1_0 != v0_0) {
            int v10_8 = (p10 + v1_0);
            while (v1_0 < v0_0) {
                byte v11_2 = p8.charAt(v1_0);
                if ((v11_2 >= 128) || (v10_8 >= v2_1)) {
                    if ((v11_2 >= 2048) || (v10_8 > (v2_1 - 2))) {
                        if (((v11_2 >= 55296) && (v11_2 <= 57343)) || (v10_8 > (v2_1 - 3))) {
                            if (v10_8 > (v2_1 - 4)) {
                                if ((v11_2 >= 55296) && (v11_2 <= 57343)) {
                                    int v9_1 = (v1_0 + 1);
                                    if ((v9_1 == p8.length()) || (!Character.isSurrogatePair(v11_2, p8.charAt(v9_1)))) {
                                        throw new com.google.android.gms.internal.play_billing.zzhq(v1_0, v0_0);
                                    }
                                }
                                int v9_3 = new StringBuilder("Failed writing ");
                                v9_3.append(v11_2);
                                v9_3.append(" at index ");
                                v9_3.append(v10_8);
                                throw new ArrayIndexOutOfBoundsException(v9_3.toString());
                            } else {
                                int v4_5 = (v1_0 + 1);
                                if (v4_5 != p8.length()) {
                                    int v1_1 = p8.charAt(v4_5);
                                    if (!Character.isSurrogatePair(v11_2, v1_1)) {
                                        v1_0 = v4_5;
                                    } else {
                                        int v5_4 = (v10_8 + 1);
                                        int v6_5 = (v10_8 + 2);
                                        int v7_2 = (v10_8 + 3);
                                        byte v11_4 = Character.toCodePoint(v11_2, v1_1);
                                        p9[v10_8] = ((byte) ((v11_4 >> 18) | 240));
                                        p9[v5_4] = ((byte) (((v11_4 >> 12) & 63) | 128));
                                        p9[v6_5] = ((byte) (((v11_4 >> 6) & 63) | 128));
                                        v10_8 += 4;
                                        p9[v7_2] = ((byte) ((v11_4 & 63) | 128));
                                        v1_0 = v4_5;
                                        v1_0++;
                                    }
                                }
                                throw new com.google.android.gms.internal.play_billing.zzhq((v1_0 - 1), v0_0);
                            }
                        } else {
                            int v4_7 = (v10_8 + 1);
                            int v5_6 = (v10_8 + 2);
                            int v6_6 = (v10_8 + 3);
                            p9[v10_8] = ((byte) ((v11_2 >> 12) | 480));
                            p9[v4_7] = ((byte) (((v11_2 >> 6) & 63) | 128));
                            p9[v5_6] = ((byte) ((v11_2 & 63) | 128));
                            v10_8 = v6_6;
                        }
                    } else {
                        int v4_0 = (v10_8 + 1);
                        int v5_0 = (v10_8 + 2);
                        p9[v10_8] = ((byte) ((v11_2 >> 6) | 960));
                        p9[v4_0] = ((byte) ((v11_2 & 63) | 128));
                        v10_8 = v5_0;
                    }
                } else {
                    int v4_1 = (v10_8 + 1);
                    p9[v10_8] = ((byte) v11_2);
                    v10_8 = v4_1;
                }
            }
            return v10_8;
        } else {
            return (p10 + v0_0);
        }
    }

    public static int zzc(String p8)
    {
        String v0_0 = p8.length();
        int v1 = 0;
        int v2_2 = 0;
        while ((v2_2 < v0_0) && (p8.charAt(v2_2) < 128)) {
            v2_2++;
        }
        int v3_0 = v0_0;
        while (v2_2 < v0_0) {
            int v4_0 = p8.charAt(v2_2);
            if (v4_0 >= 2048) {
                int v4_1 = p8.length();
                while (v2_2 < v4_1) {
                    int v6_0 = p8.charAt(v2_2);
                    if (v6_0 >= 2048) {
                        v1 += 2;
                        if ((v6_0 >= 55296) && (v6_0 <= 57343)) {
                            if (Character.codePointAt(p8, v2_2) < 65536) {
                                throw new com.google.android.gms.internal.play_billing.zzhq(v2_2, v4_1);
                            } else {
                                v2_2++;
                            }
                        }
                    } else {
                        v1 += ((127 - v6_0) >> 31);
                    }
                    v2_2++;
                }
                v3_0 += v1;
                break;
            } else {
                v3_0 += ((127 - v4_0) >> 31);
                v2_2++;
            }
        }
        if (v3_0 < v0_0) {
            String v0_1 = ((long) v3_0);
            int v2_1 = new StringBuilder("UTF-8 length does not fit in int: ");
            v2_1.append((v0_1 + 4294967296));
            throw new IllegalArgumentException(v2_1.toString());
        } else {
            return v3_0;
        }
    }

    public static boolean zzd(byte[] p6, int p7, int p8)
    {
        while ((p7 < p8) && (p6[p7] >= 0)) {
            p7++;
        }
        if (p7 < p8) {
            while (p7 < p8) {
                int v0_9 = (p7 + 1);
                int v1_2 = p6[p7];
                if (v1_2 >= 0) {
                    p7 = v0_9;
                } else {
                    if (v1_2 >= -32) {
                        if (v1_2 >= -16) {
                            if (v0_9 < (p8 - 2)) {
                                int v0_1 = p6[v0_9];
                                if ((v0_1 <= -65) && ((((v0_1 + 112) + (v1_2 << 28)) >> 30) == 0)) {
                                    int v0_5 = (p7 + 3);
                                    if (p6[(p7 + 2)] <= -65) {
                                        p7 += 4;
                                        if (p6[v0_5] <= -65) {
                                        }
                                    }
                                }
                            } else {
                                v1_2 = com.google.android.gms.internal.play_billing.zzhr.zza(p6, v0_9, p8);
                                if (v1_2 == 0) {
                                    break;
                                }
                            }
                        } else {
                            if (v0_9 < (p8 - 1)) {
                                int v4_2 = (p7 + 2);
                                int v0_7 = p6[v0_9];
                                if (((v0_7 <= -65) && ((v1_2 != -32) || (v0_7 >= -96))) && ((v1_2 != -19) || (v0_7 < -96))) {
                                    p7 += 3;
                                    if (p6[v4_2] > -65) {
                                    }
                                }
                            } else {
                                v1_2 = com.google.android.gms.internal.play_billing.zzhr.zza(p6, v0_9, p8);
                            }
                        }
                    } else {
                        if (v0_9 < p8) {
                            if (v1_2 >= -62) {
                                p7 += 2;
                                if (p6[v0_9] > -65) {
                                }
                            }
                        }
                    }
                    return 0;
                }
            }
        }
        return 1;
    }
}
