package com.google.android.gms.internal.firebase-auth-api;
final class zzlo implements com.google.android.gms.internal.firebase-auth-api.zzlr {
    private final com.google.android.gms.internal.firebase-auth-api.zzjf zza;
    private final int zzb;

    public zzlo(com.google.android.gms.internal.firebase-auth-api.zzjf p1)
    {
        this.zza = p1;
        this.zzb = p1.zzb();
        return;
    }

    public final int zza()
    {
        return this.zzb;
    }

    public final byte[] zza(byte[] p2, byte[] p3, int p4)
    {
        if (p3.length < p4) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzyx.zza(com.google.android.gms.internal.firebase-auth-api.zzja.zzc().zza(this.zza).zza(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(p2, com.google.android.gms.internal.firebase-auth-api.zzbf.zza())).zza()).zza(java.util.Arrays.copyOfRange(p3, p4, p3.length), com.google.android.gms.internal.firebase-auth-api.zzln.zza());
        }
    }
}
