package com.google.android.gms.internal.auth-api;
public final class zbbj {
    private static final java.security.SecureRandom zba;

    static zbbj()
    {
        com.google.android.gms.internal.auth-api.zbbj.zba = new java.security.SecureRandom();
        return;
    }

    public static String zba()
    {
        String v0_1 = new byte[16];
        com.google.android.gms.internal.auth-api.zbbj.zba.nextBytes(v0_1);
        return android.util.Base64.encodeToString(v0_1, 11);
    }
}
