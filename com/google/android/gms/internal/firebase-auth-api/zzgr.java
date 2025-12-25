package com.google.android.gms.internal.firebase-auth-api;
public final class zzgr {
    private static final ThreadLocal zza;

    static zzgr()
    {
        com.google.android.gms.internal.firebase-auth-api.zzgr.zza = new com.google.android.gms.internal.firebase-auth-api.zzgu();
        return;
    }

    public static java.security.spec.AlgorithmParameterSpec zza(byte[] p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzgr.zza(p2, 0, p2.length);
    }

    public static java.security.spec.AlgorithmParameterSpec zza(byte[] p2, int p3, int p4)
    {
        javax.crypto.spec.IvParameterSpec v0_0 = com.google.android.gms.internal.firebase-auth-api.zzqn.zzb();
        if ((v0_0 == null) || (v0_0.intValue() > 19)) {
            return new javax.crypto.spec.GCMParameterSpec(128, p2, p3, p4);
        } else {
            return new javax.crypto.spec.IvParameterSpec(p2, p3, p4);
        }
    }

    public static javax.crypto.Cipher zza()
    {
        return ((javax.crypto.Cipher) com.google.android.gms.internal.firebase-auth-api.zzgr.zza.get());
    }

    public static javax.crypto.SecretKey zzb(byte[] p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzaai.zza(p2.length);
        return new javax.crypto.spec.SecretKeySpec(p2, "AES");
    }
}
