package com.google.android.gms.internal.firebase-auth-api;
final class zzir extends java.lang.ThreadLocal {

    public zzir()
    {
        return;
    }

    private static javax.crypto.Cipher zza()
    {
        try {
            int v0_1 = ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzzj.zza.zza("AES/GCM-SIV/NoPadding"));
        } catch (int v0_3) {
            throw new IllegalStateException(v0_3);
        }
        if (!com.google.android.gms.internal.firebase-auth-api.zzgz.zza(v0_1)) {
            v0_1 = 0;
        }
        return v0_1;
    }

    public final synthetic Object initialValue()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzir.zza();
    }
}
