package com.google.android.gms.internal.firebase-auth-api;
final class zzhk extends java.lang.ThreadLocal {

    public zzhk()
    {
        return;
    }

    private static javax.crypto.Cipher zza()
    {
        try {
            javax.crypto.Cipher v1_2 = ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzzj.zza.zza("ChaCha20-Poly1305"));
        } catch (java.security.GeneralSecurityException) {
            return 0;
        }
        if (com.google.android.gms.internal.firebase-auth-api.zzhh.zza(v1_2)) {
            return v1_2;
        } else {
            return 0;
        }
    }

    public final synthetic Object initialValue()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzhk.zza();
    }
}
