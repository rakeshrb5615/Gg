package com.google.android.gms.internal.auth;
final class zzhl extends com.google.android.gms.internal.auth.zzhk {

    public zzhl()
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
            byte v0_8 = (p10 + 1);
            byte v1_2 = p9[p10];
            if (v1_2 >= 0) {
                p10 = v0_8;
            } else {
                if (v1_2 >= -32) {
                    if (v1_2 >= -16) {
                        if (v0_8 < (p11 - 2)) {
                            byte v0_0 = p9[v0_8];
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
                            return com.google.android.gms.internal.auth.zzhm.zza(p9, v0_8, p11);
                        }
                    } else {
                        if (v0_8 < (p11 - 1)) {
                            int v5_2 = (p10 + 2);
                            byte v0_6 = p9[v0_8];
                            if (v0_6 <= -65) {
                                if ((v1_2 == -32) && (v0_6 < -96)) {
                                    return -1;
                                } else {
                                    if ((v1_2 == -19) && (v0_6 >= -96)) {
                                        return -1;
                                    } else {
                                        p10 += 3;
                                        if (p9[v5_2] > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        } else {
                            return com.google.android.gms.internal.auth.zzhm.zza(p9, v0_8, p11);
                        }
                    }
                } else {
                    if (v0_8 >= p11) {
                        return v1_2;
                    } else {
                        if (v1_2 >= -62) {
                            p10 += 2;
                            if (p9[v0_8] > -65) {
                            }
                        }
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}
