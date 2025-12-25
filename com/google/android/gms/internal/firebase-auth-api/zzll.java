package com.google.android.gms.internal.firebase-auth-api;
final class zzll implements com.google.android.gms.internal.firebase-auth-api.zzly {
    private final int zza;

    public zzll(int p3)
    {
        if ((p3 != 16) && (p3 != 32)) {
            throw new java.security.InvalidAlgorithmParameterException(g2.g.c(p3, "Unsupported key length: "));
        } else {
            this.zza = p3;
            return;
        }
    }

    public final int zza()
    {
        return this.zza;
    }

    public final byte[] zza(byte[] p3, byte[] p4, byte[] p5, int p6, byte[] p7)
    {
        if (p3.length != this.zza) {
            throw new java.security.InvalidAlgorithmParameterException(g2.g.c(p3.length, "Unexpected key length: "));
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzhs(p3).zza(p4, p5, p6, p7);
        }
    }

    public final int zzb()
    {
        return 12;
    }

    public final byte[] zzc()
    {
        java.security.GeneralSecurityException v0_0 = this.zza;
        if (v0_0 == 16) {
            return com.google.android.gms.internal.firebase-auth-api.zzmk.zzi;
        } else {
            if (v0_0 != 32) {
                throw new java.security.GeneralSecurityException("Could not determine HPKE AEAD ID");
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzmk.zzj;
            }
        }
    }
}
