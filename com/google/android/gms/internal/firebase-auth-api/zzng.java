package com.google.android.gms.internal.firebase-auth-api;
public final class zzng {
    private static final byte[][] zza;

    static zzng()
    {
        byte[] v1 = new byte[32];
        v1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] v2 = new byte[32];
        v2 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] v3 = new byte[32];
        v3 = {-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0};
        byte[] v4 = new byte[32];
        v4 = {95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87};
        byte[] v5 = new byte[32];
        v5 = {-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127};
        byte[] v6 = new byte[32];
        v6 = {-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127};
        byte[] v7 = new byte[32];
        v7 = {-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127};
        com.google.android.gms.internal.firebase-auth-api.zzng.zza = new byte[][] {v1, v7});
        return;
    }

    public static void zza(long[] p24, byte[] p25, byte[] p26)
    {
        int v3_4 = 32;
        if (p26.length != 32) {
            throw new java.security.InvalidKeyException("Public key length is not 32-byte");
        } else {
            String v2_1 = java.util.Arrays.copyOf(p26, p26.length);
            v2_1[31] = ((byte) (v2_1[31] & 127));
            int v4_2 = 0;
            int v5_8 = 0;
            while(true) {
                long[] v6_2 = com.google.android.gms.internal.firebase-auth-api.zzng.zza;
                if (v5_8 >= v6_2.length) {
                    break;
                }
                if (java.security.MessageDigest.isEqual(v6_2[v5_8], v2_1)) {
                    throw new java.security.InvalidKeyException(g2.g.l("Banned public key: ", com.google.android.gms.internal.firebase-auth-api.zzzx.zza(v6_2[v5_8])));
                } else {
                    v5_8++;
                }
            }
            String v2_3 = com.google.android.gms.internal.firebase-auth-api.zznm.zza(v2_1);
            long[] v6_1 = new long[19];
            long[] v7_0 = new long[19];
            v7_0[0] = 1;
            long[] v10 = new long[19];
            v10[0] = 1;
            long[] v11 = new long[19];
            long[] v12 = new long[19];
            long[] v13 = new long[19];
            v13[0] = 1;
            long[] v14 = new long[19];
            long[] v15_2 = new long[19];
            v15_2[0] = 1;
            int v8_2 = 10;
            System.arraycopy(v2_3, 0, v6_1, 0, 10);
            int v9_1 = 0;
            while (v9_1 < v3_4) {
                int v3_3 = (p25[(31 - v9_1)] & 255);
                while (v4_2 < 8) {
                    int v5_2 = ((v3_3 >> (7 - v4_2)) & 1);
                    com.google.android.gms.internal.firebase-auth-api.zzng.zza(v10, v6_1, v5_2);
                    com.google.android.gms.internal.firebase-auth-api.zzng.zza(v11, v7_0, v5_2);
                    byte[] v1_1 = java.util.Arrays.copyOf(v10, v8_2);
                    long[] v17 = v3_3;
                    int v3_0 = new long[19];
                    long[] v18 = v4_2;
                    int v4_1 = new long[19];
                    long[] v19_0 = v9_1;
                    int v9_0 = new long[19];
                    int v0_0 = new long[19];
                    int v20 = v5_2;
                    int v5_3 = new long[19];
                    long[] v21 = v15_2;
                    long[] v15_0 = new long[19];
                    long[] v22 = v3_0;
                    int v3_1 = new long[19];
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzd(v10, v11);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzc(v11, v1_1);
                    int v8_1 = java.util.Arrays.copyOf(v6_1, 10);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzd(v6_1, v7_0);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzc(v7_0, v8_1);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v0_0, v6_1, v11);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v5_3, v10, v7_0);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v0_0);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zza(v0_0);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v5_3);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zza(v5_3);
                    long[] v23 = v6_1;
                    System.arraycopy(v0_0, 0, v8_1, 0, 10);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzd(v0_0, v5_3);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzc(v5_3, v8_1);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v3_1, v0_0);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v15_0, v5_3);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v5_3, v15_0, v2_3);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v5_3);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zza(v5_3);
                    System.arraycopy(v3_1, 0, v12, 0, 10);
                    System.arraycopy(v5_3, 0, v13, 0, 10);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v4_1, v10);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9_0, v11);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v14, v4_1, v9_0);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v14);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zza(v14);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzc(v9_0, v4_1);
                    int v3_2 = v22;
                    java.util.Arrays.fill(v3_2, 10, 18, 0);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zza(v3_2, v9_0, 121665);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zza(v3_2);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzd(v3_2, v4_1);
                    long[] v15_1 = v21;
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v15_1, v9_0, v3_2);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v15_1);
                    com.google.android.gms.internal.firebase-auth-api.zznm.zza(v15_1);
                    int v0_3 = v20;
                    com.google.android.gms.internal.firebase-auth-api.zzng.zza(v14, v12, v0_3);
                    com.google.android.gms.internal.firebase-auth-api.zzng.zza(v15_1, v13, v0_3);
                    v4_2 = (v18 + 1);
                    byte[] v1_3 = v13;
                    v13 = v7_0;
                    v7_0 = v1_3;
                    byte[] v1_4 = v14;
                    v14 = v10;
                    v10 = v1_4;
                    v15_2 = v11;
                    v11 = v15_1;
                    v6_1 = v12;
                    v3_3 = v17;
                    v9_1 = v19_0;
                    v12 = v23;
                    v8_2 = 10;
                }
                v9_1++;
                v3_4 = 32;
                v4_2 = 0;
                v8_2 = 10;
            }
            byte[] v1_9 = v8_2;
            int v0_7 = new long[v1_9];
            com.google.android.gms.internal.firebase-auth-api.zznm.zza(v0_7, v11);
            com.google.android.gms.internal.firebase-auth-api.zznm.zza(p24, v10, v0_7);
            int v0_8 = new long[v1_9];
            int v4_3 = new long[v1_9];
            int v8_4 = new long[11];
            int v9_2 = new long[11];
            int v5_11 = new long[11];
            com.google.android.gms.internal.firebase-auth-api.zznm.zza(v0_8, v2_3, p24);
            com.google.android.gms.internal.firebase-auth-api.zznm.zzd(v4_3, v2_3, p24);
            byte[] v1_11 = new long[v1_9];
            v1_11[0] = 486662;
            com.google.android.gms.internal.firebase-auth-api.zznm.zzd(v9_2, v4_3, v1_11);
            com.google.android.gms.internal.firebase-auth-api.zznm.zza(v9_2, v9_2, v7_0);
            com.google.android.gms.internal.firebase-auth-api.zznm.zzd(v9_2, v6_1);
            com.google.android.gms.internal.firebase-auth-api.zznm.zza(v9_2, v9_2, v0_8);
            com.google.android.gms.internal.firebase-auth-api.zznm.zza(v9_2, v9_2, v6_1);
            com.google.android.gms.internal.firebase-auth-api.zznm.zza(v8_4, v9_2, 4);
            com.google.android.gms.internal.firebase-auth-api.zznm.zza(v8_4);
            com.google.android.gms.internal.firebase-auth-api.zznm.zza(v9_2, v0_8, v7_0);
            com.google.android.gms.internal.firebase-auth-api.zznm.zzc(v9_2, v9_2, v7_0);
            com.google.android.gms.internal.firebase-auth-api.zznm.zza(v5_11, v4_3, v6_1);
            com.google.android.gms.internal.firebase-auth-api.zznm.zzd(v9_2, v9_2, v5_11);
            com.google.android.gms.internal.firebase-auth-api.zznm.zzb(v9_2, v9_2);
            if (!java.security.MessageDigest.isEqual(com.google.android.gms.internal.firebase-auth-api.zznm.zzc(v8_4), com.google.android.gms.internal.firebase-auth-api.zznm.zzc(v9_2))) {
                throw new IllegalStateException(g2.g.l("Arithmetic error in curve multiplication with the public key: ", com.google.android.gms.internal.firebase-auth-api.zzzx.zza(p26)));
            } else {
                return;
            }
        }
    }

    private static void zza(long[] p6, long[] p7, int p8)
    {
        int v0 = 0;
        while (v0 < 10) {
            long v1_8 = p6[v0];
            int v3_0 = ((((int) v1_8) ^ ((int) p7[v0])) & (- p8));
            p6[v0] = ((long) (((int) v1_8) ^ v3_0));
            p7[v0] = ((long) (((int) p7[v0]) ^ v3_0));
            v0++;
        }
        return;
    }
}
