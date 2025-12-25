package com.google.android.gms.internal.firebase-auth-api;
public final class zzmn implements com.google.android.gms.internal.firebase-auth-api.zzbd {
    private final com.google.android.gms.internal.firebase-auth-api.zzbd zza;
    private final byte[] zzb;

    private zzmn(com.google.android.gms.internal.firebase-auth-api.zzbd p1, byte[] p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbd zza(com.google.android.gms.internal.firebase-auth-api.zzof p4)
    {
        java.security.GeneralSecurityException v4_2;
        String v0_2 = p4.zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
        String v1_2 = ((com.google.android.gms.internal.firebase-auth-api.zzbd) com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(v0_2.zzf(), com.google.android.gms.internal.firebase-auth-api.zzbd).zzb(v0_2.zzd()));
        String v0_1 = v0_2.zzb();
        int v2_2 = com.google.android.gms.internal.firebase-auth-api.zzmm.zza[v0_1.ordinal()];
        if (v2_2 == 1) {
            v4_2 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza.zzb();
        } else {
            if ((v2_2 == 2) || (v2_2 == 3)) {
                v4_2 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza(p4.zzb().intValue()).zzb();
            } else {
                if (v2_2 != 4) {
                    throw new java.security.GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(v0_1)));
                } else {
                    v4_2 = com.google.android.gms.internal.firebase-auth-api.zzpe.zzb(p4.zzb().intValue()).zzb();
                }
            }
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzmn(v1_2, v4_2);
    }

    public final byte[] zza(byte[] p3, byte[] p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzbd v0_0 = this.zzb;
        if (v0_0.length != 0) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v0_0, p3)) {
                throw new java.security.GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
            } else {
                return this.zza.zza(java.util.Arrays.copyOfRange(p3, this.zzb.length, p3.length), p4);
            }
        } else {
            return this.zza.zza(p3, p4);
        }
    }
}
