package com.google.android.gms.internal.firebase-auth-api;
final class zzlk implements com.google.android.gms.internal.firebase-auth-api.zzly {

    public zzlk()
    {
        return;
    }

    public final int zza()
    {
        return 32;
    }

    public final byte[] zza(byte[] p3, byte[] p4, byte[] p5, int p6, byte[] p7)
    {
        if (p3.length != 32) {
            throw new java.security.InvalidAlgorithmParameterException("Unexpected key length: 32");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzhv.zza()) {
                return new com.google.android.gms.internal.firebase-auth-api.zzht(p3).zza(p4, java.util.Arrays.copyOfRange(p5, p6, p5.length), p7);
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzhv.zza(p3).zza(p4, p5, p6, p7);
            }
        }
    }

    public final int zzb()
    {
        return 12;
    }

    public final byte[] zzc()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzmk.zzk;
    }
}
