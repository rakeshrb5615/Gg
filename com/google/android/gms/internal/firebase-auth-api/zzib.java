package com.google.android.gms.internal.firebase-auth-api;
public final class zzib implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private final byte[] zza;
    private final int zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzsq zzc;

    private zzib(byte[] p3, com.google.android.gms.internal.firebase-auth-api.zzaaj p4, int p5)
    {
        this.zzc = com.google.android.gms.internal.firebase-auth-api.zzzz.zza(com.google.android.gms.internal.firebase-auth-api.zzso.zza(com.google.android.gms.internal.firebase-auth-api.zzsr.zza(p3.length), com.google.android.gms.internal.firebase-auth-api.zzaal.zza(p3, com.google.android.gms.internal.firebase-auth-api.zzbf.zza())));
        this.zza = p4.zzb();
        this.zzb = p5;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzfw p3)
    {
        if ((((com.google.android.gms.internal.firebase-auth-api.zzfz) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzb() < 8) || (((com.google.android.gms.internal.firebase-auth-api.zzfz) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzb() > 12)) {
            throw new java.security.GeneralSecurityException("invalid salt size");
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzib(p3.zze().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), p3.zzd(), ((com.google.android.gms.internal.firebase-auth-api.zzfz) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzb());
        }
    }

    private final byte[] zza(byte[] p7)
    {
        byte[] v1_0 = new byte[16];
        v1_0 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] v2 = new byte[16];
        v2 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if ((p7.length > 12) || (p7.length < 8)) {
            throw new java.security.GeneralSecurityException("invalid salt size");
        } else {
            System.arraycopy(p7, 0, v1_0, 4, p7.length);
            System.arraycopy(p7, 0, v2, 4, p7.length);
            byte[] v7_4 = new byte[32];
            System.arraycopy(this.zzc.zza(v1_0, 16), 0, v7_4, 0, 16);
            System.arraycopy(this.zzc.zza(v2, 16), 0, v7_4, 16, 16);
            return v7_4;
        }
    }

    public final byte[] zza(byte[] p5, byte[] p6)
    {
        if (p5 == null) {
            throw new NullPointerException("ciphertext is null");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzhs v1_3 = this.zza;
            if (p5.length < ((v1_3.length + this.zzb) + 28)) {
                throw new java.security.GeneralSecurityException("ciphertext too short");
            } else {
                if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v1_3, p5)) {
                    throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                } else {
                    byte[] v0_3 = (this.zza.length + this.zzb);
                    int v2_5 = (v0_3 + 12);
                    return new com.google.android.gms.internal.firebase-auth-api.zzhs(this.zza(java.util.Arrays.copyOfRange(p5, this.zza.length, v0_3))).zza(java.util.Arrays.copyOfRange(p5, v0_3, v2_5), p5, v2_5, p6);
                }
            }
        }
    }

    public final byte[] zzb(byte[] p6, byte[] p7)
    {
        if (p6 == null) {
            throw new NullPointerException("plaintext is null");
        } else {
            byte[] v0_2 = com.google.android.gms.internal.firebase-auth-api.zzqd.zza((this.zzb + 12));
            int v1_0 = java.util.Arrays.copyOf(v0_2, this.zzb);
            int v2_0 = this.zzb;
            int v2_1 = java.util.Arrays.copyOfRange(v0_2, v2_0, (v2_0 + 12));
            NullPointerException v6_2 = new com.google.android.gms.internal.firebase-auth-api.zzhs(this.zza(v1_0)).zzb(v2_1, p6, ((this.zza.length + this.zzb) + v2_1.length), p7);
            String v7_2 = this.zza;
            System.arraycopy(v7_2, 0, v6_2, 0, v7_2.length);
            System.arraycopy(v0_2, 0, v6_2, this.zza.length, v0_2.length);
            return v6_2;
        }
    }
}
