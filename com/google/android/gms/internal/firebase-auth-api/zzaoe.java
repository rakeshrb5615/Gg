package com.google.android.gms.internal.firebase-auth-api;
final class zzaoe extends com.google.android.gms.internal.firebase-auth-api.zzaob {

    public zzaoe()
    {
        return;
    }

    public final int zza(int p8, byte[] p9, int p10, int p11)
    {
        while ((p10 < p11) && (p9[p10] >= 0)) {
            p10++;
        }
        if (p10 >= p11) {
            return 0;
        }
        while (p10 < p11) {
            byte v0_9 = (p10 + 1);
            byte v1_2 = p9[p10];
            if (v1_2 >= 0) {
                p10 = v0_9;
            } else {
                if (v1_2 >= -32) {
                    if (v1_2 >= -16) {
                        if (v0_9 < (p11 - 2)) {
                            byte v0_0 = p9[v0_9];
                            if ((v0_0 <= -65) && ((((v0_0 + 112) + (v1_2 << 28)) >> 30) == 0)) {
                                byte v0_4 = (p10 + 3);
                                if (p9[(p10 + 2)] <= -65) {
                                    p10 += 4;
                                    if (p9[v0_4] > -65) {
                                    }
                                }
                            }
                            return -1;
                        } else {
                            return com.google.android.gms.internal.firebase-auth-api.zzaoa.zza(p9, v0_9, p11);
                        }
                    } else {
                        if (v0_9 < (p11 - 1)) {
                            int v5_2 = (p10 + 2);
                            byte v0_6 = p9[v0_9];
                            if (((v0_6 <= -65) && ((v1_2 != -32) || (v0_6 >= -96))) && ((v1_2 != -19) || (v0_6 < -96))) {
                                p10 += 3;
                                if (p9[v5_2] > -65) {
                                }
                            }
                            return -1;
                        } else {
                            return com.google.android.gms.internal.firebase-auth-api.zzaoa.zza(p9, v0_9, p11);
                        }
                    }
                } else {
                    if (v0_9 < p11) {
                        if (v1_2 >= -62) {
                            p10 += 2;
                            if (p9[v0_9] > -65) {
                            }
                        }
                        return -1;
                    } else {
                        return v1_2;
                    }
                }
            }
        }
        return 0;
    }

    public final int zza(String p8, byte[] p9, int p10, int p11)
    {
        int v0 = p8.length();
        int v11_1 = (p11 + p10);
        int v1_0 = 0;
        while (v1_0 < v0) {
            int v3_8 = (v1_0 + p10);
            if (v3_8 >= v11_1) {
                break;
            }
            int v4_6 = p8.charAt(v1_0);
            if (v4_6 >= 128) {
                break;
            }
            p9[v3_8] = ((byte) v4_6);
            v1_0++;
        }
        if (v1_0 != v0) {
            int v10_1 = (p10 + v1_0);
            while (v1_0 < v0) {
                int v3_7 = p8.charAt(v1_0);
                if ((v3_7 >= 128) || (v10_1 >= v11_1)) {
                    if ((v3_7 >= 2048) || (v10_1 > (v11_1 - 2))) {
                        if (((v3_7 >= 55296) && (57343 >= v3_7)) || (v10_1 > (v11_1 - 3))) {
                            if (v10_1 > (v11_1 - 4)) {
                                if ((55296 <= v3_7) && (v3_7 <= 57343)) {
                                    int v9_1 = (v1_0 + 1);
                                    if ((v9_1 == p8.length()) || (!Character.isSurrogatePair(v3_7, p8.charAt(v9_1)))) {
                                        throw new com.google.android.gms.internal.firebase-auth-api.zzaod(v1_0, v0);
                                    }
                                }
                                int v9_3 = new StringBuilder("Failed writing ");
                                v9_3.append(v3_7);
                                v9_3.append(" at index ");
                                v9_3.append(v10_1);
                                throw new ArrayIndexOutOfBoundsException(v9_3.toString());
                            } else {
                                int v4_5 = (v1_0 + 1);
                                if (v4_5 != p8.length()) {
                                    int v1_1 = p8.charAt(v4_5);
                                    if (!Character.isSurrogatePair(v3_7, v1_1)) {
                                        v1_0 = v4_5;
                                    } else {
                                        int v1_3 = Character.toCodePoint(v3_7, v1_1);
                                        int v3_9 = (v10_1 + 1);
                                        p9[v10_1] = ((byte) ((v1_3 >> 18) | 240));
                                        int v5_10 = (v10_1 + 2);
                                        p9[v3_9] = ((byte) (((v1_3 >> 12) & 63) | 128));
                                        int v3_10 = (v10_1 + 3);
                                        p9[v5_10] = ((byte) (((v1_3 >> 6) & 63) | 128));
                                        v10_1 += 4;
                                        p9[v3_10] = ((byte) ((v1_3 & 63) | 128));
                                        v1_0 = v4_5;
                                        v1_0++;
                                    }
                                }
                                throw new com.google.android.gms.internal.firebase-auth-api.zzaod((v1_0 - 1), v0);
                            }
                        } else {
                            int v4_7 = (v10_1 + 1);
                            p9[v10_1] = ((byte) ((v3_7 >> 12) | 480));
                            int v5_0 = (v10_1 + 2);
                            p9[v4_7] = ((byte) (((v3_7 >> 6) & 63) | 128));
                            v10_1 += 3;
                            p9[v5_0] = ((byte) ((v3_7 & 63) | 128));
                        }
                    } else {
                        int v4_0 = (v10_1 + 1);
                        p9[v10_1] = ((byte) ((v3_7 >> 6) | 960));
                        v10_1 += 2;
                        p9[v4_0] = ((byte) ((v3_7 & 63) | 128));
                    }
                } else {
                    int v4_1 = (v10_1 + 1);
                    p9[v10_1] = ((byte) v3_7);
                    v10_1 = v4_1;
                }
            }
            return v10_1;
        } else {
            return (p10 + v0);
        }
    }

    public final String zza(byte[] p8, int p9, int p10)
    {
        if (((p9 | p10) | ((p8.length - p9) - p10)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] {Integer.valueOf(p8.length), Integer.valueOf(p9), Integer.valueOf(p10)})));
        } else {
            ArrayIndexOutOfBoundsException v0_2 = (p9 + p10);
            char[] v5 = new char[p10];
            int v1_2 = 0;
            while (p9 < v0_2) {
                com.google.android.gms.internal.firebase-auth-api.zzall v2_0 = p8[p9];
                if (v2_0 < null) {
                    break;
                }
                p9++;
                com.google.android.gms.internal.firebase-auth-api.zzall v3_10 = (v1_2 + 1);
                com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(v2_0, v5, v1_2);
                v1_2 = v3_10;
            }
            int v6 = v1_2;
            while (p9 < v0_2) {
                com.google.android.gms.internal.firebase-auth-api.zzall v2_1 = (p9 + 1);
                int v1_5 = p8[p9];
                if (v1_5 < 0) {
                    if (v1_5 >= -32) {
                        if (v1_5 >= -16) {
                            if (v2_1 >= (v0_2 - 2)) {
                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzd();
                            } else {
                                com.google.android.gms.internal.firebase-auth-api.zzall v4_0 = (p9 + 3);
                                com.google.android.gms.internal.firebase-auth-api.zzall v3_4 = p8[(p9 + 2)];
                                p9 += 4;
                                com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(v1_5, p8[v2_1], v3_4, p8[v4_0], v5, v6);
                                v6 += 2;
                            }
                        } else {
                            if (v2_1 >= (v0_2 - 1)) {
                                throw com.google.android.gms.internal.firebase-auth-api.zzall.zzd();
                            } else {
                                com.google.android.gms.internal.firebase-auth-api.zzall v3_6 = (p9 + 2);
                                p9 += 3;
                                com.google.android.gms.internal.firebase-auth-api.zzall v4_2 = (v6 + 1);
                                com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(v1_5, p8[v2_1], p8[v3_6], v5, v6);
                                v6 = v4_2;
                            }
                        }
                    } else {
                        if (v2_1 >= v0_2) {
                            throw com.google.android.gms.internal.firebase-auth-api.zzall.zzd();
                        } else {
                            p9 += 2;
                            com.google.android.gms.internal.firebase-auth-api.zzall v3_8 = (v6 + 1);
                            com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(v1_5, p8[v2_1], v5, v6);
                            v6 = v3_8;
                        }
                    }
                } else {
                    int v9_3 = (v6 + 1);
                    com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(v1_5, v5, v6);
                    int v1_6 = v2_1;
                    while (v1_6 < v0_2) {
                        com.google.android.gms.internal.firebase-auth-api.zzall v2_5 = p8[v1_6];
                        if (v2_5 < null) {
                            break;
                        }
                        v1_6++;
                        com.google.android.gms.internal.firebase-auth-api.zzall v3_9 = (v9_3 + 1);
                        com.google.android.gms.internal.firebase-auth-api.zzaoc.zza(v2_5, v5, v9_3);
                        v9_3 = v3_9;
                    }
                    v6 = v9_3;
                    p9 = v1_6;
                }
            }
            return new String(v5, 0, v6);
        }
    }
}
