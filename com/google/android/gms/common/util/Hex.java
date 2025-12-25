package com.google.android.gms.common.util;
public class Hex {
    private static final char[] zza;
    private static final char[] zzb;

    static Hex()
    {
        char[] v1 = new char[16];
        v1 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        com.google.android.gms.common.util.Hex.zza = v1;
        char[] v0_1 = new char[16];
        v0_1 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        com.google.android.gms.common.util.Hex.zzb = v0_1;
        return;
    }

    public Hex()
    {
        return;
    }

    public static String bytesToStringLowercase(byte[] p7)
    {
        char[] v0_2 = new char[(p7.length + p7.length)];
        int v1 = 0;
        int v2 = 0;
        while (v1 < p7.length) {
            char v3_0 = p7[v1];
            int v5 = (v2 + 1);
            char[] v6 = com.google.android.gms.common.util.Hex.zzb;
            v0_2[v2] = v6[((v3_0 & 255) >> 4)];
            v0_2[v5] = v6[(v3_0 & 15)];
            v2 += 2;
            v1++;
        }
        return new String(v0_2);
    }

    public static String bytesToStringUppercase(byte[] p1)
    {
        return com.google.android.gms.common.util.Hex.bytesToStringUppercase(p1, 0);
    }

    public static String bytesToStringUppercase(byte[] p5, boolean p6)
    {
        int v0 = p5.length;
        StringBuilder v2_1 = new StringBuilder((v0 + v0));
        int v1_1 = 0;
        while ((v1_1 < v0) && ((!p6) || ((v1_1 != (v0 - 1)) || ((p5[v1_1] & 255) != 0)))) {
            int v3_1 = com.google.android.gms.common.util.Hex.zza;
            v2_1.append(v3_1[((p5[v1_1] & 240) >> 4)]);
            v2_1.append(v3_1[(p5[v1_1] & 15)]);
            v1_1++;
        }
        return v2_1.toString();
    }

    public static byte[] stringToBytes(String p6)
    {
        String v0_0 = p6.length();
        if ((v0_0 % 2) != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        } else {
            byte[] v1_2 = new byte[(v0_0 / 2)];
            int v2_0 = 0;
            while (v2_0 < v0_0) {
                int v4 = (v2_0 + 2);
                v1_2[(v2_0 / 2)] = ((byte) Integer.parseInt(p6.substring(v2_0, v4), 16));
                v2_0 = v4;
            }
            return v1_2;
        }
    }
}
