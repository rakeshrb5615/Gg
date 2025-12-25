package com.google.android.gms.internal.firebase-auth-api;
public final class zzaai {

    public static String zza(String p1, String p2)
    {
        if (!p2.toLowerCase(java.util.Locale.US).startsWith(p1)) {
            throw new IllegalArgumentException(g2.g.l("key URI must start with ", p1));
        } else {
            return p2.substring(p1.length());
        }
    }

    public static void zza(int p2)
    {
        if ((p2 != 16) && (p2 != 32)) {
            throw new java.security.InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[] {Integer.valueOf((p2 << 3))})));
        } else {
            return;
        }
    }
}
