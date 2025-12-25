package com.google.android.gms.internal.firebase-auth-api;
public final class zzaak implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private final com.google.android.gms.internal.firebase-auth-api.zzhx zza;
    private final byte[] zzb;

    private zzaak(byte[] p2, byte[] p3)
    {
        this.zza = new com.google.android.gms.internal.firebase-auth-api.zzhx(p2);
        this.zzb = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzgb p3)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzaak(p3.zze().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), p3.zzd().zzb());
    }

    private final byte[] zzc(byte[] p4, byte[] p5)
    {
        if (p4.length < 40) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        } else {
            return this.zza.zza(java.nio.ByteBuffer.wrap(p4, 24, (p4.length - 24)), java.util.Arrays.copyOf(p4, 24), p5);
        }
    }

    public final byte[] zza(byte[] p3, byte[] p4)
    {
        int v0_0 = this.zzb;
        if (v0_0.length != 0) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v0_0, p3)) {
                throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            } else {
                return this.zzc(java.util.Arrays.copyOfRange(p3, this.zzb.length, p3.length), p4);
            }
        } else {
            return this.zzc(p3, p4);
        }
    }

    public final byte[] zzb(byte[] p4, byte[] p5)
    {
        int v0_3 = java.nio.ByteBuffer.allocate((p4.length + 40));
        byte[] v1_1 = com.google.android.gms.internal.firebase-auth-api.zzqd.zza(24);
        v0_3.put(v1_1);
        this.zza.zza(v0_3, v1_1, p4, p5);
        byte[] v4_1 = v0_3.array();
        byte[] v5_1 = this.zzb;
        if (v5_1.length != 0) {
            return com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {v5_1, v4_1}));
        } else {
            return v4_1;
        }
    }
}
