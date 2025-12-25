package com.google.android.gms.internal.firebase-auth-api;
public final class zzip implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private static final ThreadLocal zza;

    static zzip()
    {
        com.google.android.gms.internal.firebase-auth-api.zzip.zza = new com.google.android.gms.internal.firebase-auth-api.zzir();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzdz p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzgz.zza(p1, new com.google.android.gms.internal.firebase-auth-api.zzis());
    }

    public static synthetic javax.crypto.Cipher zza()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzip.zzb();
    }

    private static javax.crypto.Cipher zzb()
    {
        try {
            java.security.GeneralSecurityException v0_3 = ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzip.zza.get());
        } catch (java.security.GeneralSecurityException v0_1) {
            throw new java.security.GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", v0_1);
        }
        if (v0_3 == null) {
            throw new java.security.GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } else {
            return v0_3;
        }
    }

    public final byte[] zza(byte[] p1, byte[] p2)
    {
        throw new NoSuchMethodError();
    }

    public final byte[] zzb(byte[] p1, byte[] p2)
    {
        throw new NoSuchMethodError();
    }
}
