package com.google.android.gms.internal.firebase-auth-api;
public final class zzjv implements com.google.android.gms.internal.firebase-auth-api.zzbe {
    private final com.google.android.gms.internal.firebase-auth-api.zzbe zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzxz zzb;
    private final byte[] zzc;

    private zzjv(com.google.android.gms.internal.firebase-auth-api.zzbe p1, com.google.android.gms.internal.firebase-auth-api.zzxz p2, byte[] p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzof p4)
    {
        java.security.GeneralSecurityException v4_2;
        String v0_2 = p4.zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
        String v1_2 = ((com.google.android.gms.internal.firebase-auth-api.zzbe) com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(v0_2.zzf(), com.google.android.gms.internal.firebase-auth-api.zzbe).zzb(v0_2.zzd()));
        String v0_1 = v0_2.zzb();
        com.google.android.gms.internal.firebase-auth-api.zzjv v2_2 = com.google.android.gms.internal.firebase-auth-api.zzjy.zza[v0_1.ordinal()];
        if (v2_2 == 1) {
            v4_2 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza.zzb();
        } else {
            if ((v2_2 == 2) || (v2_2 == 3)) {
                v4_2 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza(p4.zzb().intValue()).zzb();
            } else {
                if (v2_2 != 4) {
                    throw new java.security.GeneralSecurityException(g2.g.c(v0_1.zza(), "unknown output prefix type "));
                } else {
                    v4_2 = com.google.android.gms.internal.firebase-auth-api.zzpe.zzb(p4.zzb().intValue()).zzb();
                }
            }
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzjv(v1_2, v0_1, v4_2);
    }

    public final byte[] zza(byte[] p4, byte[] p5)
    {
        if (this.zzb != com.google.android.gms.internal.firebase-auth-api.zzxz.zzd) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(this.zzc, p4)) {
                throw new java.security.GeneralSecurityException("wrong prefix");
            } else {
                return this.zza.zza(java.util.Arrays.copyOfRange(p4, 5, p4.length), p5);
            }
        } else {
            return this.zza.zza(p4, p5);
        }
    }
}
