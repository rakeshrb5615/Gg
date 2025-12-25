package com.google.android.gms.internal.firebase-auth-api;
public final class zzzx {

    public static String zza(byte[] p6)
    {
        StringBuilder v0_1 = new StringBuilder((p6.length * 2));
        int v1_2 = p6.length;
        int v2 = 0;
        while (v2 < v1_2) {
            char v3_1 = (p6[v2] & 255);
            v0_1.append("0123456789abcdef".charAt((v3_1 / 16)));
            v0_1.append("0123456789abcdef".charAt((v3_1 % 16)));
            v2++;
        }
        return v0_1.toString();
    }

    public static byte[] zza(String p6)
    {
        if ((p6.length() % 2) != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        } else {
            String v0_1 = (p6.length() / 2);
            byte[] v1 = new byte[v0_1];
            int v2 = 0;
            while (v2 < v0_1) {
                byte v3_0 = (v2 * 2);
                int v4_1 = Character.digit(p6.charAt(v3_0), 16);
                byte v3_3 = Character.digit(p6.charAt((v3_0 + 1)), 16);
                if ((v4_1 == -1) || (v3_3 == -1)) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                } else {
                    v1[v2] = ((byte) ((v4_1 << 4) + v3_3));
                    v2++;
                }
            }
            return v1;
        }
    }
}
