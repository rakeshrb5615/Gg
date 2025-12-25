package com.google.android.gms.internal.firebase-auth-api;
public final class zzma implements com.google.android.gms.internal.firebase-auth-api.zzbd {
    private static final byte[] zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzme zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzmf zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzmc zzd;
    private final com.google.android.gms.internal.firebase-auth-api.zzly zze;
    private final int zzf;
    private final byte[] zzg;

    static zzma()
    {
        byte[] v0_1 = new byte[0];
        com.google.android.gms.internal.firebase-auth-api.zzma.zza = v0_1;
        return;
    }

    private zzma(com.google.android.gms.internal.firebase-auth-api.zzme p1, com.google.android.gms.internal.firebase-auth-api.zzmf p2, com.google.android.gms.internal.firebase-auth-api.zzmc p3, com.google.android.gms.internal.firebase-auth-api.zzly p4, int p5, com.google.android.gms.internal.firebase-auth-api.zzaaj p6)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        this.zze = p4;
        this.zzf = p5;
        this.zzg = p6.zzb();
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbd zza(com.google.android.gms.internal.firebase-auth-api.zzki p9)
    {
        boolean v0_5;
        boolean v0_3 = ((com.google.android.gms.internal.firebase-auth-api.zzkg) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p9.zza()));
        com.google.android.gms.internal.firebase-auth-api.zzmf v4 = com.google.android.gms.internal.firebase-auth-api.zzmh.zza(v0_3.zze());
        com.google.android.gms.internal.firebase-auth-api.zzmc v5 = com.google.android.gms.internal.firebase-auth-api.zzmh.zza(v0_3.zzd());
        com.google.android.gms.internal.firebase-auth-api.zzly v6 = com.google.android.gms.internal.firebase-auth-api.zzmh.zza(v0_3.zzb());
        boolean v0_1 = v0_3.zze();
        com.google.android.gms.internal.firebase-auth-api.zzkg$zzf v1_1 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzd;
        if (!v0_1.equals(v1_1)) {
            if (!v0_1.equals(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zza)) {
                if (!v0_1.equals(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb)) {
                    if (!v0_1.equals(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc)) {
                        throw new java.security.GeneralSecurityException("Unrecognized HPKE KEM identifier");
                    } else {
                        v0_5 = 133;
                    }
                } else {
                    v0_5 = 97;
                }
            } else {
                v0_5 = 65;
            }
        } else {
            v0_5 = 32;
        }
        int v7 = v0_5;
        boolean v0_9 = ((com.google.android.gms.internal.firebase-auth-api.zzkg) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p9.zza())).zze();
        if ((!v0_9.equals(v1_1)) && ((!v0_9.equals(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zza)) && ((!v0_9.equals(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb)) && (!v0_9.equals(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc))))) {
            throw new java.security.GeneralSecurityException("Unrecognized HPKE KEM identifier");
        } else {
            return new com.google.android.gms.internal.firebase-auth-api.zzma(new com.google.android.gms.internal.firebase-auth-api.zzme(com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(p9.zzf().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza())), ((com.google.android.gms.internal.firebase-auth-api.zzkq) ((com.google.android.gms.internal.firebase-auth-api.zzli) p9.zzc())).zze()), v4, v5, v6, v7, p9.zzh());
        }
    }

    public final byte[] zza(byte[] p9, byte[] p10)
    {
        byte[] v0_0 = this.zzg;
        int v1_1 = (v0_0.length + this.zzf);
        if (p9.length < v1_1) {
            throw new java.security.GeneralSecurityException("Ciphertext is too short.");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v0_0, p9)) {
                throw new java.security.GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
            } else {
                if (p10 == null) {
                    p10 = new byte[0];
                }
                return com.google.android.gms.internal.firebase-auth-api.zzmb.zza(java.util.Arrays.copyOfRange(p9, this.zzg.length, v1_1), this.zzb, this.zzc, this.zzd, this.zze, p10).zza(p9, v1_1, com.google.android.gms.internal.firebase-auth-api.zzma.zza);
            }
        }
    }
}
