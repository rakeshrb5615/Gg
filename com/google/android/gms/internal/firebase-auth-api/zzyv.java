package com.google.android.gms.internal.firebase-auth-api;
final class zzyv extends java.lang.ThreadLocal {

    public zzyv()
    {
        return;
    }

    private static javax.crypto.Cipher zza()
    {
        try {
            return ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzzj.zza.zza("AES/CTR/NOPADDING"));
        } catch (java.security.GeneralSecurityException v0_3) {
            throw new IllegalStateException(v0_3);
        }
    }

    public final synthetic Object initialValue()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzyv.zza();
    }
}
