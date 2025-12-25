package com.google.android.gms.internal.firebase-auth-api;
final class zzlm implements com.google.android.gms.internal.firebase-auth-api.zzlr {
    private final com.google.android.gms.internal.firebase-auth-api.zzdi zza;
    private final int zzb;

    public zzlm(com.google.android.gms.internal.firebase-auth-api.zzdi p2)
    {
        this.zza = p2;
        this.zzb = (p2.zzc() + p2.zzb());
        return;
    }

    public final int zza()
    {
        return this.zzb;
    }

    public final byte[] zza(byte[] p4, byte[] p5, int p6)
    {
        if (p5.length < p6) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzzk.zza(com.google.android.gms.internal.firebase-auth-api.zzdd.zze().zza(this.zza).zza(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(java.util.Arrays.copyOf(p4, this.zza.zzb()), com.google.android.gms.internal.firebase-auth-api.zzbf.zza())).zzb(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(java.util.Arrays.copyOfRange(p4, this.zza.zzb(), (this.zza.zzc() + this.zza.zzb())), com.google.android.gms.internal.firebase-auth-api.zzbf.zza())).zza()).zza(java.util.Arrays.copyOfRange(p5, p6, p5.length), com.google.android.gms.internal.firebase-auth-api.zzln.zza());
        }
    }
}
