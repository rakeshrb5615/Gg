package com.google.android.gms.internal.firebase-auth-api;
public final class zzqd {
    private static final ThreadLocal zza;

    static zzqd()
    {
        com.google.android.gms.internal.firebase-auth-api.zzqd.zza = new com.google.android.gms.internal.firebase-auth-api.zzqg();
        return;
    }

    public static synthetic java.security.SecureRandom zza()
    {
        java.security.SecureRandom v0 = com.google.android.gms.internal.firebase-auth-api.zzqd.zzb();
        v0.nextLong();
        return v0;
    }

    public static byte[] zza(int p1)
    {
        byte[] v1_1 = new byte[p1];
        ((java.security.SecureRandom) com.google.android.gms.internal.firebase-auth-api.zzqd.zza.get()).nextBytes(v1_1);
        return v1_1;
    }

    private static java.security.SecureRandom zzb()
    {
        java.security.SecureRandom v0_0 = com.google.android.gms.internal.firebase-auth-api.zznh.zza();
        try {
            if (v0_0 == null) {
                java.security.SecureRandom v0_5 = com.google.android.gms.internal.firebase-auth-api.zznh.zzb();
                try {
                    if (v0_5 == null) {
                        return new java.security.SecureRandom();
                    } else {
                        return java.security.SecureRandom.getInstance("SHA1PRNG", v0_5);
                    }
                } catch (java.security.GeneralSecurityException) {
                    return new java.security.SecureRandom();
                }
            } else {
                return java.security.SecureRandom.getInstance("SHA1PRNG", v0_0);
            }
        } catch (java.security.GeneralSecurityException) {
        }
    }
}
