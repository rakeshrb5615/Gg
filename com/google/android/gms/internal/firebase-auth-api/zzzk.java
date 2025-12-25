package com.google.android.gms.internal.firebase-auth-api;
public final class zzzk implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private final com.google.android.gms.internal.firebase-auth-api.zzaaa zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzcc zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzzk(com.google.android.gms.internal.firebase-auth-api.zzaaa p1, com.google.android.gms.internal.firebase-auth-api.zzcc p2, int p3, byte[] p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzdd p9)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzzk(new com.google.android.gms.internal.firebase-auth-api.zzyu(p9.zzf().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), ((com.google.android.gms.internal.firebase-auth-api.zzdi) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p9.zza())).zzd()), new com.google.android.gms.internal.firebase-auth-api.zzaag(new com.google.android.gms.internal.firebase-auth-api.zzaae("HMAC".concat(String.valueOf(((com.google.android.gms.internal.firebase-auth-api.zzdi) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p9.zza())).zzg())), new javax.crypto.spec.SecretKeySpec(p9.zzg().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), "HMAC")), ((com.google.android.gms.internal.firebase-auth-api.zzdi) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p9.zza())).zze()), ((com.google.android.gms.internal.firebase-auth-api.zzdi) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p9.zza())).zze(), p9.zzd().zzb());
    }

    public final byte[] zza(byte[] p8, byte[] p9)
    {
        com.google.android.gms.internal.firebase-auth-api.zzcc v2_0 = this.zzd;
        if (p8.length < (this.zzc + v2_0.length)) {
            throw new java.security.GeneralSecurityException("Decryption failed (ciphertext too short).");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v2_0, p8)) {
                throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            } else {
                byte[] v0_4 = java.util.Arrays.copyOfRange(p8, this.zzd.length, (p8.length - this.zzc));
                byte[] v8_3 = java.util.Arrays.copyOfRange(p8, (p8.length - this.zzc), p8.length);
                if (p9 == null) {
                    p9 = new byte[0];
                }
                this.zzb.zza(v8_3, com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {p9, v0_4, java.util.Arrays.copyOf(java.nio.ByteBuffer.allocate(8).putLong((((long) p9.length) * 8)).array(), 8)})));
                return this.zza.zza(v0_4);
            }
        }
    }

    public final byte[] zzb(byte[] p7, byte[] p8)
    {
        byte[] v7_1 = this.zza.zzb(p7);
        if (p8 == null) {
            p8 = new byte[0];
        }
        return com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {this.zzd, v7_1, this.zzb.zza(com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {p8, v7_1, java.util.Arrays.copyOf(java.nio.ByteBuffer.allocate(8).putLong((((long) p8.length) * 8)).array(), 8)})))}));
    }
}
