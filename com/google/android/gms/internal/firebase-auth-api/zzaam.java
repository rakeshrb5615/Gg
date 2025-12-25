package com.google.android.gms.internal.firebase-auth-api;
public final class zzaam {
    private final java.math.BigInteger zza;

    private zzaam(java.math.BigInteger p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzaam zza(java.math.BigInteger p0, com.google.android.gms.internal.firebase-auth-api.zzch p1)
    {
        if (p1 == null) {
            throw new NullPointerException("SecretKeyAccess required");
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzaam(p0);
        }
    }

    public final java.math.BigInteger zza(com.google.android.gms.internal.firebase-auth-api.zzch p2)
    {
        if (p2 == null) {
            throw new NullPointerException("SecretKeyAccess required");
        } else {
            return this.zza;
        }
    }
}
