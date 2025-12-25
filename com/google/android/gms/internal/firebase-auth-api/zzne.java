package com.google.android.gms.internal.firebase-auth-api;
public final class zzne {

    public static java.math.BigInteger zza(byte[] p2)
    {
        return new java.math.BigInteger(1, p2);
    }

    public static byte[] zza(java.math.BigInteger p2)
    {
        if (p2.signum() == -1) {
            throw new IllegalArgumentException("n must not be negative");
        } else {
            return p2.toByteArray();
        }
    }

    public static byte[] zza(java.math.BigInteger p4, int p5)
    {
        if (p4.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        } else {
            java.security.GeneralSecurityException v4_8 = p4.toByteArray();
            if (v4_8.length != p5) {
                int v1_0 = (p5 + 1);
                if (v4_8.length > v1_0) {
                    throw new java.security.GeneralSecurityException("integer too large");
                } else {
                    if (v4_8.length != v1_0) {
                        int v0_4 = new byte[p5];
                        System.arraycopy(v4_8, 0, v0_4, (p5 - v4_8.length), v4_8.length);
                        return v0_4;
                    } else {
                        if (v4_8[0] != null) {
                            throw new java.security.GeneralSecurityException("integer too large");
                        } else {
                            return java.util.Arrays.copyOfRange(v4_8, 1, v4_8.length);
                        }
                    }
                }
            } else {
                return v4_8;
            }
        }
    }
}
