package com.google.android.gms.internal.firebase-auth-api;
public final class zzic {

    private static long zza(byte[] p2, int p3)
    {
        return (((long) (((p2[(p3 + 3)] & 255) << 24) | (((p2[p3] & 255) | ((p2[(p3 + 1)] & 255) << 8)) | ((p2[(p3 + 2)] & 255) << 16)))) & 4294967295);
    }

    private static long zza(byte[] p2, int p3, int p4)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzic.zza(p2, p3) >> p4) & 67108863);
    }

    private static void zza(byte[] p4, long p5, int p7)
    {
        int v0 = 0;
        while (v0 < 4) {
            p4[(p7 + v0)] = ((byte) ((int) (255 & p5)));
            v0++;
            p5 >>= 8;
        }
        return;
    }

    public static byte[] zza(byte[] p59, byte[] p60)
    {
        if (p59.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        } else {
            long v4_1 = (com.google.android.gms.internal.firebase-auth-api.zzic.zza(p59, 0, 0) & 67108863);
            int v8_0 = 3;
            int v9_6 = 2;
            long v10_1 = (com.google.android.gms.internal.firebase-auth-api.zzic.zza(p59, 3, 2) & 67108611);
            long v14_9 = (com.google.android.gms.internal.firebase-auth-api.zzic.zza(p59, 6, 4) & 67092735);
            long v17_3 = (com.google.android.gms.internal.firebase-auth-api.zzic.zza(p59, 9, 6) & 66076671);
            long v21_1 = (com.google.android.gms.internal.firebase-auth-api.zzic.zza(p59, 12, 8) & 1048575);
            long v25_0 = (v10_1 * 5);
            long v27_0 = (v14_9 * 5);
            long v29 = (v17_3 * 5);
            long v31 = (v21_1 * 5);
            int v6_6 = 17;
            long v7_5 = new byte[17];
            long v35_11 = 0;
            int v3_8 = 0;
            long v37_4 = 0;
            long v39_4 = 0;
            long v41_4 = 0;
            long v43_3 = 0;
            while (v3_8 < p60.length) {
                int v12_3 = Math.min(16, (p60.length - v3_8));
                System.arraycopy(p60, v3_8, v7_5, 0, v12_3);
                v7_5[v12_3] = 1;
                if (v12_3 != 16) {
                    java.util.Arrays.fill(v7_5, (v12_3 + 1), v6_6, 0);
                }
                long v43_0 = (v43_3 + com.google.android.gms.internal.firebase-auth-api.zzic.zza(v7_5, 0, 0));
                long v35_0 = (v35_11 + com.google.android.gms.internal.firebase-auth-api.zzic.zza(v7_5, v8_0, v9_6));
                long v37_0 = (v37_4 + com.google.android.gms.internal.firebase-auth-api.zzic.zza(v7_5, 6, 4));
                long v39_0 = (v39_4 + com.google.android.gms.internal.firebase-auth-api.zzic.zza(v7_5, 9, 6));
                long v51 = v10_1;
                long v41_0 = (v41_4 + (com.google.android.gms.internal.firebase-auth-api.zzic.zza(v7_5, 12, 8) | ((long) (v7_5[16] << 24))));
                int v9_13 = ((v41_0 * v25_0) + ((v39_0 * v27_0) + ((v37_0 * v29) + ((v35_0 * v31) + (v43_0 * v4_1)))));
                long v49_12 = (((v41_0 * v27_0) + ((v39_0 * v29) + ((v37_0 * v31) + ((v35_0 * v4_1) + (v43_0 * v51))))) + (v9_13 >> 26));
                long v53_9 = (((v41_0 * v29) + ((v39_0 * v31) + ((v37_0 * v4_1) + ((v35_0 * v51) + (v43_0 * v14_9))))) + (v49_12 >> 26));
                long v55_9 = (((v41_0 * v31) + ((v39_0 * v4_1) + ((v37_0 * v51) + ((v35_0 * v14_9) + (v43_0 * v17_3))))) + (v53_9 >> 26));
                long v41_3 = (((v41_0 * v4_1) + ((v39_0 * v51) + ((v37_0 * v14_9) + ((v35_0 * v17_3) + (v43_0 * v21_1))))) + (v55_9 >> 26));
                v41_4 = (v41_3 & 67108863);
                long v35_9 = (((v41_3 >> 26) * 5) + (v9_13 & 67108863));
                v3_8 += 16;
                v37_4 = (v53_9 & 67108863);
                v39_4 = (v55_9 & 67108863);
                v6_6 = 17;
                v8_0 = 3;
                v43_3 = (v35_9 & 67108863);
                v35_11 = ((v49_12 & 67108863) + (v35_9 >> 26));
                v10_1 = v51;
                v9_6 = 2;
            }
            long v37_5 = (v37_4 + (v35_11 >> 26));
            long v7_6 = (v37_5 & 67108863);
            long v39_5 = (v39_4 + (v37_5 >> 26));
            int v9_17 = (v39_5 & 67108863);
            long v41_5 = (v41_4 + (v39_5 >> 26));
            long v11_1 = (v41_5 & 67108863);
            int v3_16 = (((v41_5 >> 26) * 5) + v43_3);
            int v3_17 = (v3_16 & 67108863);
            int v5_9 = ((v35_11 & 67108863) + (v3_16 >> 26));
            long v23_2 = (v3_17 + 5);
            long v14_12 = ((v23_2 >> 26) + v5_9);
            long v21_3 = (v7_6 + (v14_12 >> 26));
            long v23_4 = (v9_17 + (v21_3 >> 26));
            long v25_3 = ((v11_1 + (v23_4 >> 26)) - 67108864);
            byte[] v2_3 = (v25_3 >> 63);
            long v1_10 = (~ v2_3);
            int v3_0 = ((v5_9 & v2_3) | ((v14_12 & 67108863) & v1_10));
            int v5_0 = ((v7_6 & v2_3) | ((v21_3 & 67108863) & v1_10));
            long v7_0 = ((v9_17 & v2_3) | ((v23_4 & 67108863) & v1_10));
            int v3_3 = (((v3_0 >> 6) | (v5_0 << 20)) & 4294967295);
            int v5_3 = (((v5_0 >> 12) | (v7_0 << 14)) & 4294967295);
            long v1_5 = (((((v25_3 & v1_10) | (v11_1 & v2_3)) << 8) | (v7_0 >> 18)) & 4294967295);
            int v9_3 = (((((v3_17 & v2_3) | ((v23_2 & 67108863) & v1_10)) | (v3_0 << 26)) & 4294967295) + com.google.android.gms.internal.firebase-auth-api.zzic.zza(p59, 16));
            long v7_3 = (v9_3 & 4294967295);
            int v3_5 = ((v3_3 + com.google.android.gms.internal.firebase-auth-api.zzic.zza(p59, 20)) + (v9_3 >> 32));
            int v9_5 = (v3_5 & 4294967295);
            int v5_5 = ((v5_3 + com.google.android.gms.internal.firebase-auth-api.zzic.zza(p59, 24)) + (v3_5 >> 32));
            int v3_7 = (v5_5 & 4294967295);
            long v0_1 = (((v1_5 + com.google.android.gms.internal.firebase-auth-api.zzic.zza(p59, 28)) + (v5_5 >> 32)) & 4294967295);
            byte[] v2_0 = new byte[16];
            com.google.android.gms.internal.firebase-auth-api.zzic.zza(v2_0, v7_3, 0);
            com.google.android.gms.internal.firebase-auth-api.zzic.zza(v2_0, v9_5, 4);
            com.google.android.gms.internal.firebase-auth-api.zzic.zza(v2_0, v3_7, 8);
            com.google.android.gms.internal.firebase-auth-api.zzic.zza(v2_0, v0_1, 12);
            return v2_0;
        }
    }
}
