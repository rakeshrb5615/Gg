package com.google.android.gms.internal.firebase-auth-api;
public final class zzsr extends com.google.android.gms.internal.firebase-auth-api.zzss {
    private final int zza;

    private zzsr(int p1)
    {
        this.zza = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzsr zza(int p2)
    {
        if ((p2 != 16) && (p2 != 32)) {
            throw new java.security.InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", new Object[] {Integer.valueOf((p2 << 3))})));
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzsr(p2);
        }
    }

    public final boolean equals(Object p3)
    {
        if ((p3 instanceof com.google.android.gms.internal.firebase-auth-api.zzsr)) {
            if (((com.google.android.gms.internal.firebase-auth-api.zzsr) p3).zza != this.zza) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzsr, Integer.valueOf(this.zza)}));
    }

    public final String toString()
    {
        return v1.a.j("AesCmac PRF Parameters (", this.zza, "-byte key)");
    }

    public final boolean zza()
    {
        return 0;
    }

    public final int zzb()
    {
        return this.zza;
    }
}
