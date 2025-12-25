package com.google.android.gms.internal.firebase-auth-api;
public final class zznm {
    private static final int[] zza;
    private static final int[] zzb;
    private static final int[] zzc;
    private static final int[] zzd;

    static zznm()
    {
        int v1_0 = new int[10];
        v1_0 = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
        com.google.android.gms.internal.firebase-auth-api.zznm.zza = v1_0;
        int[] v0_4 = new int[10];
        v0_4 = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb = v0_4;
        com.google.android.gms.internal.firebase-auth-api.zznm.zzc = new int[] {67108863, 33554431});
        com.google.android.gms.internal.firebase-auth-api.zznm.zzd = new int[] {26, 25});
        return;
    }

    public static void zza(long[] p14)
    {
        p14[10] = 0;
        int v4_2 = 0;
        while (v4_2 < 10) {
            long v8_4 = p14[v4_2];
            long v6_0 = (v8_4 / 67108864);
            p14[v4_2] = (v8_4 - (v6_0 << 26));
            long v5_1 = (v4_2 + 1);
            long v8_7 = (p14[v5_1] + v6_0);
            p14[v5_1] = v8_7;
            long v6_2 = (v8_7 / 33554432);
            p14[v5_1] = (v8_7 - (v6_2 << 25));
            v4_2 += 2;
            p14[v4_2] = (p14[v4_2] + v6_2);
        }
        long v10_3 = p14[10];
        long v8_0 = (p14[0] + (v10_3 << 4));
        p14[0] = v8_0;
        long v8_1 = (v8_0 + (v10_3 << 1));
        p14[0] = v8_1;
        long v8_2 = (v8_1 + v10_3);
        p14[0] = v8_2;
        p14[10] = 0;
        long v0_1 = (v8_2 / 67108864);
        p14[0] = (v8_2 - (v0_1 << 26));
        p14[1] = (p14[1] + v0_1);
        return;
    }

    public static void zza(long[] p11, long[] p12)
    {
        int v1_0 = new long[10];
        int v2_0 = new long[10];
        long[] v3 = new long[10];
        long[] v4 = new long[10];
        long[] v5 = new long[10];
        long[] v6 = new long[10];
        long[] v7 = new long[10];
        long[] v8 = new long[10];
        long[] v9 = new long[10];
        long[] v10 = new long[10];
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v1_0, p12);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v1_0);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(v2_0, v9, p12);
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(v3, v2_0, v1_0);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v3);
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(v4, v9, v2_0);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v4);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(v5, v9, v4);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v5);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
        int v12_1 = 2;
        int v1_1 = 2;
        while (v1_1 < 10) {
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
            v1_1 += 2;
        }
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(v6, v10, v5);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v6);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
        int v1_2 = 2;
        while (v1_2 < 20) {
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
            v1_2 += 2;
        }
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(v9, v10, v6);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
        int v1_3 = 2;
        while (v1_3 < 10) {
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
            v1_3 += 2;
        }
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(v7, v9, v5);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v7);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
        int v0_1 = 2;
        while (v0_1 < 50) {
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
            v0_1 += 2;
        }
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(v8, v10, v7);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v8);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
        int v0_2 = 2;
        while (v0_2 < 100) {
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
            v0_2 += 2;
        }
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(v10, v9, v8);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
        while (v12_1 < 50) {
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
            v12_1 += 2;
        }
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(v9, v10, v7);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9, v10);
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v10, v9);
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(p11, v10, v3);
        return;
    }

    public static void zza(long[] p3, long[] p4, long p5)
    {
        int v0 = 0;
        while (v0 < 10) {
            p3[v0] = (p4[v0] * p5);
            v0++;
        }
        return;
    }

    public static void zza(long[] p1, long[] p2, long[] p3)
    {
        long[] v0_1 = new long[19];
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v0_1, p2, p3);
        com.google.android.gms.internal.firebase-auth-api.zznm.zze(v0_1, p1);
        return;
    }

    public static long[] zza(byte[] p9)
    {
        long[] v1 = new long[10];
        int v2 = 0;
        while (v2 < 10) {
            long v3_8 = com.google.android.gms.internal.firebase-auth-api.zznm.zza[v2];
            v1[v2] = (((((((long) (p9[v3_8] & 255)) | (((long) (p9[(v3_8 + 1)] & 255)) << 8)) | (((long) (p9[(v3_8 + 2)] & 255)) << 16)) | (((long) (p9[(v3_8 + 3)] & 255)) << 24)) >> com.google.android.gms.internal.firebase-auth-api.zznm.zzb[v2]) & ((long) com.google.android.gms.internal.firebase-auth-api.zznm.zzc[(v2 & 1)]));
            v2++;
        }
        return v1;
    }

    public static void zzb(long[] p9)
    {
        long v3_5 = p9[18];
        long v5_1 = 4;
        long v1_18 = (p9[8] + (v3_5 << 4));
        p9[8] = v1_18;
        long v1_1 = (v1_18 + (v3_5 << 1));
        p9[8] = v1_1;
        p9[8] = (v1_1 + v3_5);
        long v3_1 = p9[17];
        long v1_7 = (p9[7] + (v3_1 << 4));
        p9[7] = v1_7;
        long v1_8 = (v1_7 + (v3_1 << 1));
        p9[7] = v1_8;
        p9[7] = (v1_8 + v3_1);
        long v3_4 = p9[16];
        long v1_11 = (p9[6] + (v3_4 << 4));
        p9[6] = v1_11;
        long v1_12 = (v1_11 + (v3_4 << 1));
        p9[6] = v1_12;
        p9[6] = (v1_12 + v3_4);
        long v3_7 = p9[15];
        long v1_15 = (p9[5] + (v3_7 << 4));
        p9[5] = v1_15;
        long v1_16 = (v1_15 + (v3_7 << 1));
        p9[5] = v1_16;
        p9[5] = (v1_16 + v3_7);
        long v2_1 = p9[14];
        int v0_5 = (p9[v5_1] + (v2_1 << v5_1));
        p9[4] = v0_5;
        int v0_6 = (v0_5 + (v2_1 << 1));
        p9[4] = v0_6;
        p9[4] = (v0_6 + v2_1);
        long v3_9 = p9[13];
        long v1_20 = (p9[3] + (v3_9 << 4));
        p9[3] = v1_20;
        long v1_21 = (v1_20 + (v3_9 << 1));
        p9[3] = v1_21;
        p9[3] = (v1_21 + v3_9);
        long v3_11 = p9[12];
        long v1_24 = (p9[2] + (v3_11 << 4));
        p9[2] = v1_24;
        long v1_25 = (v1_24 + (v3_11 << 1));
        p9[2] = v1_25;
        p9[2] = (v1_25 + v3_11);
        long v2_3 = p9[11];
        int v0_11 = (p9[1] + (v2_3 << 4));
        p9[1] = v0_11;
        int v0_12 = (v0_11 + (v2_3 << 1));
        p9[1] = v0_12;
        p9[1] = (v0_12 + v2_3);
        long v3_13 = p9[10];
        long v1_2 = (p9[0] + (v3_13 << 4));
        p9[0] = v1_2;
        long v1_3 = (v1_2 + (v3_13 << 1));
        p9[0] = v1_3;
        p9[0] = (v1_3 + v3_13);
        return;
    }

    public static void zzb(long[] p59, long[] p60)
    {
        long[] v1_0 = p60[0];
        long v10_0 = p60[1];
        long v7_1 = ((v1_0 * 2) * v10_0);
        long v15_0 = p60[2];
        long v17_2 = (((v1_0 * v15_0) + (v10_0 * v10_0)) * 2);
        long v20_6 = p60[3];
        long v22_2 = (((v1_0 * v20_6) + (v10_0 * v15_0)) * 2);
        long v29_3 = p60[4];
        long v12_4 = (((v1_0 * 2) * v29_3) + (((v10_0 * 4) * v20_6) + (v15_0 * v15_0)));
        long v33_4 = p60[5];
        long v35_2 = (((v1_0 * v33_4) + ((v10_0 * v29_3) + (v15_0 * v20_6))) * 2);
        long v31_6 = p60[6];
        long v37_5 = ((((v10_0 * 2) * v33_4) + ((v1_0 * v31_6) + ((v15_0 * v29_3) + (v20_6 * v20_6)))) * 2);
        long v42_3 = p60[7];
        long v44_2 = (((v1_0 * v42_3) + ((v10_0 * v31_6) + ((v15_0 * v33_4) + (v20_6 * v29_3)))) * 2);
        long v49_2 = p60[8];
        long v53_5 = ((((((v20_6 * v33_4) + (v10_0 * v42_3)) * 2) + ((v1_0 * v49_2) + (v15_0 * v31_6))) * 2) + (v29_3 * v29_3));
        long v51_2 = p60[9];
        long[] v1_13 = (((v1_0 * v51_2) + ((v10_0 * v49_2) + ((v15_0 * v42_3) + ((v20_6 * v31_6) + (v29_3 * v33_4))))) * 2);
        long v10_5 = (((((v10_0 * v51_2) + (v20_6 * v42_3)) * long v5_2) + ((v15_0 * v49_2) + ((v29_3 * v31_6) + (v33_4 * v33_4)))) * 2);
        long v15_3 = (((v15_0 * v51_2) + ((v20_6 * v49_2) + ((v29_3 * v42_3) + (v33_4 * v31_6)))) * 2);
        long v20_5 = ((((((v20_6 * v51_2) + (v33_4 * v42_3)) * 2) + (v29_3 * v49_2)) * 2) + (v31_6 * v31_6));
        long v29_2 = (((v29_3 * v51_2) + ((v33_4 * v49_2) + (v31_6 * v42_3))) * 2);
        long v33_3 = ((((v33_4 * v5_2) * v51_2) + ((v31_6 * v49_2) + (v42_3 * v42_3))) * 2);
        long v31_2 = (((v31_6 * v51_2) + (v42_3 * v49_2)) * 2);
        long v42_2 = (((v42_3 * 4) * v51_2) + (v49_2 * v49_2));
        long v49_1 = ((v49_2 * 2) * v51_2);
        long v5_1 = ((2 * v51_2) * v51_2);
        long[] v0_2 = new long[19];
        v0_2[0] = (v1_0 * v1_0);
        v0_2[1] = v7_1;
        v0_2[2] = v17_2;
        v0_2[3] = v22_2;
        v0_2[4] = v12_4;
        v0_2[5] = v35_2;
        v0_2[6] = v37_5;
        v0_2[7] = v44_2;
        v0_2[8] = v53_5;
        v0_2[9] = v1_13;
        v0_2[10] = v10_5;
        v0_2[11] = v15_3;
        v0_2[12] = v20_5;
        v0_2[13] = v29_2;
        v0_2[14] = v33_3;
        v0_2[15] = v31_2;
        v0_2[16] = v42_2;
        v0_2[17] = v49_1;
        v0_2[18] = v5_1;
        com.google.android.gms.internal.firebase-auth-api.zznm.zze(v0_2, p59);
        return;
    }

    public static void zzb(long[] p44, long[] p45, long[] p46)
    {
        p44[0] = (p45[0] * p46[0]);
        long v1_7 = p45[0];
        long v8_0 = p46[0];
        p44[1] = ((p45[1] * v8_0) + (p46[1] * v1_7));
        long v4_0 = p45[1];
        long v12_0 = p46[1];
        p44[2] = ((p45[2] * v8_0) + ((p46[2] * v1_7) + ((v4_0 * 2) * v12_0)));
        long v10_9 = p46[2];
        long v16_2 = p45[2];
        p44[3] = ((p45[3] * v8_0) + ((p46[3] * v1_7) + ((v16_2 * v12_0) + (v4_0 * v10_9))));
        long v18_9 = p46[3];
        long v22_2 = p45[3];
        p44[4] = ((p45[4] * v8_0) + ((p46[4] * v1_7) + ((((v22_2 * v12_0) + (v4_0 * v18_9)) * 2) + (v16_2 * v10_9))));
        long v14_14 = p46[4];
        long v20_8 = p45[4];
        p44[5] = ((p45[5] * v8_0) + ((p46[5] * v1_7) + ((v20_8 * v12_0) + ((v4_0 * v14_14) + ((v22_2 * v10_9) + (v16_2 * v18_9))))));
        long v26_8 = p46[5];
        long v24_12 = p45[5];
        p44[6] = ((p45[6] * v8_0) + ((p46[6] * v1_7) + ((v20_8 * v10_9) + ((v16_2 * v14_14) + (((v24_12 * v12_0) + ((v4_0 * v26_8) + (v22_2 * v18_9))) * 2)))));
        long v28_0 = p46[6];
        long v30_0 = p45[6];
        p44[7] = ((p45[7] * v8_0) + ((p46[7] * v1_7) + ((v30_0 * v12_0) + ((v4_0 * v28_0) + ((v24_12 * v10_9) + ((v16_2 * v26_8) + ((v20_8 * v18_9) + (v22_2 * v14_14))))))));
        long v34_6 = p46[7];
        long v36_2 = p45[7];
        p44[8] = ((p45[8] * v8_0) + ((p46[8] * v1_7) + ((v30_0 * v10_9) + ((v16_2 * v28_0) + ((((v36_2 * v12_0) + ((v4_0 * v34_6) + ((v24_12 * v18_9) + (v22_2 * v26_8)))) * 2) + (v20_8 * v14_14))))));
        long v32_16 = p46[8];
        long v38_13 = p45[8];
        p44[9] = ((p45[9] * v8_0) + ((v1_7 * p46[9]) + ((v38_13 * v12_0) + ((v4_0 * v32_16) + ((v36_2 * v10_9) + ((v16_2 * v34_6) + ((v30_0 * v18_9) + ((v22_2 * v28_0) + ((v24_12 * v14_14) + (v20_8 * v26_8))))))))));
        long v8_3 = p46[9];
        long v0_4 = p45[9];
        p44[10] = ((v38_13 * v10_9) + ((v16_2 * v32_16) + ((v30_0 * v14_14) + ((v20_8 * v28_0) + (((v12_0 * v0_4) + ((v4_0 * v8_3) + ((v36_2 * v18_9) + ((v22_2 * v34_6) + (v24_12 * v26_8))))) * 2)))));
        p44[11] = ((v10_9 * v0_4) + ((v16_2 * v8_3) + ((v38_13 * v18_9) + ((v22_2 * v32_16) + ((v36_2 * v14_14) + ((v20_8 * v34_6) + ((v30_0 * v26_8) + (v24_12 * v28_0))))))));
        p44[12] = ((v38_13 * v14_14) + ((v20_8 * v32_16) + ((((v18_9 * v0_4) + ((v22_2 * v8_3) + ((v36_2 * v26_8) + (v24_12 * v34_6)))) * 2) + (v30_0 * v28_0))));
        p44[13] = ((v14_14 * v0_4) + ((v20_8 * v8_3) + ((v38_13 * v26_8) + ((v24_12 * v32_16) + ((v36_2 * v28_0) + (v30_0 * v34_6))))));
        p44[14] = ((v38_13 * v28_0) + ((v30_0 * v32_16) + (((v26_8 * v0_4) + ((v24_12 * v8_3) + (v36_2 * v34_6))) * 2)));
        p44[15] = ((v28_0 * v0_4) + ((v30_0 * v8_3) + ((v38_13 * v34_6) + (v36_2 * v32_16))));
        p44[16] = ((((v34_6 * v0_4) + (v36_2 * v8_3)) * 2) + (v38_13 * v32_16));
        p44[17] = ((v32_16 * v0_4) + (v38_13 * v8_3));
        p44[18] = ((v0_4 * 2) * v8_3);
        return;
    }

    public static void zzc(long[] p0, long[] p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zznm.zzc(p0, p1, p0);
        return;
    }

    public static void zzc(long[] p5, long[] p6, long[] p7)
    {
        int v0 = 0;
        while (v0 < 10) {
            p5[v0] = (p6[v0] - p7[v0]);
            v0++;
        }
        return;
    }

    public static byte[] zzc(long[] p17)
    {
        long[] v1_1 = java.util.Arrays.copyOf(p17, 10);
        byte[] v2_5 = 0;
        int v3_12 = 0;
        while(true) {
            long v9_0 = 2;
            if (v3_12 >= 2) {
                break;
            }
            long v9_1 = 0;
            while (v9_1 < 9) {
                long v10_1 = v1_1[v9_1];
                long v14_4 = com.google.android.gms.internal.firebase-auth-api.zznm.zzd[(v9_1 & 1)];
                long v12_12 = (- ((int) (((v10_1 >> 31) & v10_1) >> v14_4)));
                v1_1[v9_1] = (v10_1 + ((long) (v12_12 << v14_4)));
                v9_1++;
                v1_1[v9_1] = (v1_1[v9_1] - ((long) v12_12));
            }
            long v9_2 = v1_1[9];
            byte v6_9 = (- ((int) (((v9_2 >> 31) & v9_2) >> 25)));
            v1_1[9] = (v9_2 + ((long) (v6_9 << 25)));
            v1_1[0] = (v1_1[v2_5] - (((long) v6_9) * 19));
            v3_12++;
        }
        long v10_0 = v1_1[0];
        int v3_11 = (- ((int) (((v10_0 >> 31) & v10_0) >> 26)));
        v1_1[0] = (v10_0 + ((long) (v3_11 << 26)));
        v1_1[1] = (v1_1[1] - ((long) v3_11));
        int v3_7 = 0;
        while (v3_7 < 2) {
            int v11_1 = v2_5;
            while (v11_1 < 9) {
                long v12_2 = v1_1[v11_1];
                int v15_0 = (v11_1 & 1);
                int v17_1 = v2_5;
                int v16_1 = v3_7;
                byte[] v2_3 = ((int) (v12_2 >> com.google.android.gms.internal.firebase-auth-api.zznm.zzd[v15_0]));
                v1_1[v11_1] = (v12_2 & ((long) com.google.android.gms.internal.firebase-auth-api.zznm.zzc[v15_0]));
                v11_1++;
                v1_1[v11_1] = (v1_1[v11_1] + ((long) v2_3));
                v2_5 = v17_1;
                v3_7 = v16_1;
            }
            v3_7++;
        }
        int v17_2 = v2_5;
        byte[] v2_6 = v1_1[9];
        byte v6_10 = ((int) (v2_6 >> 25));
        v1_1[9] = (v2_6 & 33554431);
        int v11_11 = ((((long) v6_10) * 19) + v1_1[v17_2]);
        v1_1[v17_2] = v11_11;
        byte[] v2_1 = (~ ((((int) v11_11) - 67108845) >> 31));
        int v4_0 = 1;
        while (v4_0 < 10) {
            byte v5_10 = (~ (((int) v1_1[v4_0]) ^ com.google.android.gms.internal.firebase-auth-api.zznm.zzc[(v4_0 & 1)]));
            byte v5_11 = (v5_10 & (v5_10 << 16));
            byte v5_12 = (v5_11 & (v5_11 << 8));
            byte v5_13 = (v5_12 & (v5_12 << 4));
            byte v5_14 = (v5_13 & (v5_13 << 2));
            v2_1 &= ((v5_14 & (v5_14 << 1)) >> 31);
            v4_0++;
        }
        v1_1[v17_2] = (v1_1[v17_2] - ((long) (67108845 & v2_1)));
        byte v5_19 = ((long) (33554431 & v2_1));
        v1_1[1] = (v1_1[1] - v5_19);
        while (v9_0 < 10) {
            v1_1[v9_0] = (v1_1[v9_0] - ((long) (67108863 & v2_1)));
            int v3_5 = (v9_0 + 1);
            v1_1[v3_5] = (v1_1[v3_5] - v5_19);
            v9_0 += 2;
        }
        byte[] v2_0 = v17_2;
        while (v2_0 < 10) {
            v1_1[v2_0] = (v1_1[v2_0] << com.google.android.gms.internal.firebase-auth-api.zznm.zzb[v2_0]);
            v2_0++;
        }
        byte[] v2_13 = new byte[32];
        int v3_0 = v17_2;
        while (v3_0 < 10) {
            int v4_5 = com.google.android.gms.internal.firebase-auth-api.zznm.zza[v3_0];
            long v7_10 = v1_1[v3_0];
            v2_13[v4_5] = ((byte) ((int) (((long) v2_13[v4_5]) | (v7_10 & 255))));
            byte v5_25 = (v4_5 + 1);
            v2_13[v5_25] = ((byte) ((int) (((long) v2_13[v5_25]) | ((v7_10 >> 8) & 255))));
            byte v5_26 = (v4_5 + 2);
            v2_13[v5_26] = ((byte) ((int) (((long) v2_13[v5_26]) | ((v7_10 >> 16) & 255))));
            int v4_6 = (v4_5 + 3);
            v2_13[v4_6] = ((byte) ((int) (((long) v2_13[v4_6]) | ((v7_10 >> 24) & 255))));
            v3_0++;
        }
        return v2_13;
    }

    public static void zzd(long[] p0, long[] p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zznm.zzd(p0, p0, p1);
        return;
    }

    public static void zzd(long[] p5, long[] p6, long[] p7)
    {
        int v0 = 0;
        while (v0 < 10) {
            p5[v0] = (p6[v0] + p7[v0]);
            v0++;
        }
        return;
    }

    private static void zze(long[] p3, long[] p4)
    {
        if (p3.length != 19) {
            int v0_2 = new long[19];
            System.arraycopy(p3, 0, v0_2, 0, p3.length);
            p3 = v0_2;
        }
        com.google.android.gms.internal.firebase-auth-api.zznm.zzb(p3);
        com.google.android.gms.internal.firebase-auth-api.zznm.zza(p3);
        System.arraycopy(p3, 0, p4, 0, 10);
        return;
    }
}
