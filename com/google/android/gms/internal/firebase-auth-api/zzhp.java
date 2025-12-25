package com.google.android.gms.internal.firebase-auth-api;
final class zzhp {
    private static final int[] zza;

    static zzhp()
    {
        int[] v0_1 = new byte[16];
        v0_1 = {101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107};
        com.google.android.gms.internal.firebase-auth-api.zzhp.zza = com.google.android.gms.internal.firebase-auth-api.zzhp.zza(v0_1);
        return;
    }

    private static int zza(int p1, int p2)
    {
        return ((p1 >> (- p2)) | (p1 << p2));
    }

    public static void zza(int[] p16)
    {
        int v2 = 0;
        while (v2 < 10) {
            com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p16, 0, 4, 8, 12);
            com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p16, 1, 5, 9, 13);
            com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p16, 2, 6, 10, 14);
            com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p16, 3, 7, 11, 15);
            com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p16, 0, 5, 10, 15);
            com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p16, 1, 6, 11, 12);
            com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p16, 2, 7, 8, 13);
            com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p16, 3, 4, 9, 14);
            v2++;
        }
        return;
    }

    private static void zza(int[] p2, int p3, int p4, int p5, int p6)
    {
        int v0_4 = (p2[p3] + p2[p4]);
        p2[p3] = v0_4;
        int v0_7 = com.google.android.gms.internal.firebase-auth-api.zzhp.zza((v0_4 ^ p2[p6]), 16);
        p2[p6] = v0_7;
        int v1_2 = (p2[p5] + v0_7);
        p2[p5] = v1_2;
        int v0_3 = com.google.android.gms.internal.firebase-auth-api.zzhp.zza((p2[p4] ^ v1_2), 12);
        p2[p4] = v0_3;
        int v1_5 = (p2[p3] + v0_3);
        p2[p3] = v1_5;
        int v3_3 = com.google.android.gms.internal.firebase-auth-api.zzhp.zza((p2[p6] ^ v1_5), 8);
        p2[p6] = v3_3;
        int v6_2 = (p2[p5] + v3_3);
        p2[p5] = v6_2;
        p2[p4] = com.google.android.gms.internal.firebase-auth-api.zzhp.zza((p2[p4] ^ v6_2), 7);
        return;
    }

    public static void zza(int[] p3, int[] p4)
    {
        int v0_0 = com.google.android.gms.internal.firebase-auth-api.zzhp.zza;
        System.arraycopy(v0_0, 0, p3, 0, v0_0.length);
        System.arraycopy(p4, 0, p3, v0_0.length, 8);
        return;
    }

    public static byte[] zza(byte[] p1, byte[] p2)
    {
        byte[] v1_3 = com.google.android.gms.internal.firebase-auth-api.zzhp.zzb(com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p1), com.google.android.gms.internal.firebase-auth-api.zzhp.zza(p2));
        java.nio.ByteBuffer v2_1 = java.nio.ByteBuffer.allocate((v1_3.length << 2)).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        v2_1.asIntBuffer().put(v1_3);
        return v2_1.array();
    }

    public static int[] zza(byte[] p1)
    {
        if ((p1.length % 4) != 0) {
            throw new IllegalArgumentException("invalid input length");
        } else {
            IllegalArgumentException v1_2 = java.nio.ByteBuffer.wrap(p1).order(java.nio.ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            String v0_3 = new int[v1_2.remaining()];
            v1_2.get(v0_3);
            return v0_3;
        }
    }

    public static int[] zzb(int[] p4, int[] p5)
    {
        int[] v0_1 = new int[16];
        com.google.android.gms.internal.firebase-auth-api.zzhp.zza(v0_1, p4);
        v0_1[12] = p5[0];
        v0_1[13] = p5[1];
        v0_1[14] = p5[2];
        v0_1[15] = p5[3];
        com.google.android.gms.internal.firebase-auth-api.zzhp.zza(v0_1);
        v0_1[4] = v0_1[12];
        v0_1[5] = v0_1[13];
        v0_1[6] = v0_1[14];
        v0_1[7] = v0_1[15];
        return java.util.Arrays.copyOf(v0_1, 8);
    }
}
