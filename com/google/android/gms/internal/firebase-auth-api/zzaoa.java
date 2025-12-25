package com.google.android.gms.internal.firebase-auth-api;
final class zzaoa {
    private static final com.google.android.gms.internal.firebase-auth-api.zzaob zza;

    static zzaoa()
    {
        if (com.google.android.gms.internal.firebase-auth-api.zzanz.zzc()) {
            com.google.android.gms.internal.firebase-auth-api.zzanz.zzd();
        }
        com.google.android.gms.internal.firebase-auth-api.zzaoa.zza = new com.google.android.gms.internal.firebase-auth-api.zzaoe();
        return;
    }

    public static int zza(String p8)
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
                        if ((55296 <= v6_0) && (v6_0 <= 57343)) {
                            if (Character.codePointAt(p8, v2_2) < 65536) {
                                throw new com.google.android.gms.internal.firebase-auth-api.zzaod(v2_2, v4_1);
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
            throw new IllegalArgumentException(v1.a.g((((long) v3_0) + 4294967296), "UTF-8 length does not fit in int: "));
        } else {
            return v3_0;
        }
    }

    public static int zza(String p1, byte[] p2, int p3, int p4)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzaoa.zza.zza(p1, p2, p3, p4);
    }

    public static synthetic int zza(byte[] p6, int p7, int p8)
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
                if ((v0_1 <= -12) && (v6_1 <= -65)) {
                    return ((v6_1 << 8) ^ v0_1);
                } else {
                    return -1;
                }
            } else {
                if (v8_1 != 2) {
                    throw new AssertionError();
                } else {
                    byte v8_2 = p6[p7];
                    int v6_6 = p6[(p7 + 1)];
                    if ((v0_1 <= -12) && ((v8_2 <= -65) && (v6_6 <= -65))) {
                        return ((v6_6 << 16) ^ ((v8_2 << 8) ^ v0_1));
                    } else {
                        return -1;
                    }
                }
            }
        }
    }

    public static String zzb(byte[] p1, int p2, int p3)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzaoa.zza.zza(p1, p2, p3);
    }

    public static boolean zzc(byte[] p2, int p3, int p4)
    {
        if (com.google.android.gms.internal.firebase-auth-api.zzaoa.zza.zza(0, p2, p3, p4) != 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
