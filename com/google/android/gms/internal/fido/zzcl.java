package com.google.android.gms.internal.fido;
public final class zzcl {

    public static varargs byte[] zza(byte[][] p7)
    {
        byte[] v1_0 = 0;
        int v2_1 = 0;
        while(true) {
            int v3_2 = p7.length;
            if (v1_0 >= v3_2) {
                break;
            }
            v2_1 += p7[v1_0].length;
            v1_0++;
        }
        byte[] v1_1 = new byte[v2_1];
        int v2_0 = 0;
        int v4 = 0;
        while (v2_0 < v3_2) {
            byte[] v5 = p7[v2_0];
            int v6 = v5.length;
            System.arraycopy(v5, 0, v1_1, v4, v6);
            v4 += v6;
            v2_0++;
        }
        return v1_1;
    }
}
