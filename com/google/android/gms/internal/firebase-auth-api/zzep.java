package com.google.android.gms.internal.firebase-auth-api;
public final class zzep implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private static final byte[] zza;
    private static final java.util.Set zzb;
    private final String zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzcb zzd;
    private final com.google.android.gms.internal.firebase-auth-api.zzba zze;

    static zzep()
    {
        java.util.Set v0_1 = new byte[0];
        com.google.android.gms.internal.firebase-auth-api.zzep.zza = v0_1;
        java.util.Set v0_4 = new java.util.HashSet();
        v0_4.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        v0_4.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        v0_4.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        v0_4.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        v0_4.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        v0_4.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        com.google.android.gms.internal.firebase-auth-api.zzep.zzb = java.util.Collections.unmodifiableSet(v0_4);
        return;
    }

    private zzep(com.google.android.gms.internal.firebase-auth-api.zzxb p3, com.google.android.gms.internal.firebase-auth-api.zzba p4)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzep.zzb.contains(p3.zzf())) {
            throw new IllegalArgumentException(v1.a.l("Unsupported DEK key type: ", p3.zzf(), ". Only Tink AEAD key types are supported."));
        } else {
            this.zzc = p3.zzf();
            this.zzd = com.google.android.gms.internal.firebase-auth-api.zzcj.zza(((com.google.android.gms.internal.firebase-auth-api.zzxb) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzxb.zza(p3).zza(com.google.android.gms.internal.firebase-auth-api.zzxz.zzd).zze())).zzk());
            this.zze = p4;
            return;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzcy p1, com.google.android.gms.internal.firebase-auth-api.zzba p2)
    {
        try {
            return new com.google.android.gms.internal.firebase-auth-api.zzep(com.google.android.gms.internal.firebase-auth-api.zzxb.zza(com.google.android.gms.internal.firebase-auth-api.zzcj.zza(p1), com.google.android.gms.internal.firebase-auth-api.zzaku.zza()), p2);
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall v1_3) {
            throw new java.security.GeneralSecurityException(v1_3);
        }
    }

    public final byte[] zza(byte[] p6, byte[] p7)
    {
        com.google.android.gms.internal.firebase-auth-api.zzpa v0_0 = java.nio.ByteBuffer.wrap(p6);
        byte[] v1_2 = v0_0.getInt();
        if ((v1_2 <= null) || ((v1_2 > 4096) || (v1_2 > (p6.length - 4)))) {
            throw new java.security.GeneralSecurityException("length of encrypted DEK too large");
        } else {
            byte[] v6_3 = new byte[v1_2];
            v0_0.get(v6_3, 0, v1_2);
            byte[] v1_1 = new byte[v0_0.remaining()];
            v0_0.get(v1_1, 0, v0_0.remaining());
            return ((com.google.android.gms.internal.firebase-auth-api.zzba) com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzoz.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzqb.zza(this.zzc, com.google.android.gms.internal.firebase-auth-api.zzajv.zza(this.zze.zza(v6_3, com.google.android.gms.internal.firebase-auth-api.zzep.zza)), com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzxz.zzd, 0), com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), com.google.android.gms.internal.firebase-auth-api.zzba)).zza(v1_1, p7);
        }
    }

    public final byte[] zzb(byte[] p5, byte[] p6)
    {
        int v0_5 = com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(this.zzd, 0);
        byte[] v1_5 = this.zze.zzb(((com.google.android.gms.internal.firebase-auth-api.zzqb) com.google.android.gms.internal.firebase-auth-api.zzoz.zza().zza(v0_5, com.google.android.gms.internal.firebase-auth-api.zzqb, com.google.android.gms.internal.firebase-auth-api.zzbf.zza())).zzd().zzd(), com.google.android.gms.internal.firebase-auth-api.zzep.zza);
        if (v1_5.length > 4096) {
            throw new java.security.GeneralSecurityException("length of encrypted DEK too large");
        } else {
            java.security.GeneralSecurityException v5_3 = ((com.google.android.gms.internal.firebase-auth-api.zzba) com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(v0_5, com.google.android.gms.internal.firebase-auth-api.zzba)).zzb(p5, p6);
            return java.nio.ByteBuffer.allocate(((v1_5.length + 4) + v5_3.length)).putInt(v1_5.length).put(v1_5).put(v5_3).array();
        }
    }
}
