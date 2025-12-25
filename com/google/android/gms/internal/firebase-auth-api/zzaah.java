package com.google.android.gms.internal.firebase-auth-api;
public final class zzaah {

    public static byte[] zza()
    {
        byte[] v0_1 = com.google.android.gms.internal.firebase-auth-api.zzqd.zza(32);
        v0_1[0] = ((byte) (v0_1[0] | 7));
        byte v2_1 = ((byte) (v0_1[31] & 63));
        v0_1[31] = v2_1;
        v0_1[31] = ((byte) (v2_1 | 128));
        return v0_1;
    }

    public static byte[] zza(byte[] p3)
    {
        if (p3.length != 32) {
            throw new java.security.InvalidKeyException("Private key must have 32 bytes.");
        } else {
            String v0_2 = new byte[32];
            v0_2[0] = 9;
            return com.google.android.gms.internal.firebase-auth-api.zzaah.zza(p3, v0_2);
        }
    }

    public static byte[] zza(byte[] p3, byte[] p4)
    {
        if (p3.length != 32) {
            throw new java.security.InvalidKeyException("Private key must have 32 bytes.");
        } else {
            long[] v0_2 = new long[11];
            java.security.InvalidKeyException v3_1 = java.util.Arrays.copyOf(p3, 32);
            v3_1[0] = ((byte) (v3_1[0] & 248));
            byte v2_5 = ((byte) (v3_1[31] & 127));
            v3_1[31] = v2_5;
            v3_1[31] = ((byte) (v2_5 | 64));
            com.google.android.gms.internal.firebase-auth-api.zzng.zza(v0_2, v3_1, p4);
            return com.google.android.gms.internal.firebase-auth-api.zznm.zzc(v0_2);
        }
    }
}
