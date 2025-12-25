package com.google.android.gms.internal.firebase-auth-api;
public final class zzsm implements com.google.android.gms.internal.firebase-auth-api.zzcc {
    private static final byte[] zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzcc zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzxz zzc;
    private final byte[] zzd;

    static zzsm()
    {
        byte[] v0_1 = new byte[1];
        v0_1[0] = 0;
        com.google.android.gms.internal.firebase-auth-api.zzsm.zza = v0_1;
        return;
    }

    private zzsm(com.google.android.gms.internal.firebase-auth-api.zzcc p1, com.google.android.gms.internal.firebase-auth-api.zzxz p2, byte[] p3)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzcc zza(com.google.android.gms.internal.firebase-auth-api.zzof p4)
    {
        java.security.GeneralSecurityException v4_2;
        String v0_2 = p4.zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
        com.google.android.gms.internal.firebase-auth-api.zzcc v1_2 = ((com.google.android.gms.internal.firebase-auth-api.zzcc) com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(v0_2.zzf(), com.google.android.gms.internal.firebase-auth-api.zzcc).zzb(v0_2.zzd()));
        String v0_1 = v0_2.zzb();
        com.google.android.gms.internal.firebase-auth-api.zzsm v2_2 = com.google.android.gms.internal.firebase-auth-api.zzsp.zza[v0_1.ordinal()];
        if (v2_2 == 1) {
            v4_2 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza.zzb();
        } else {
            if ((v2_2 == 2) || (v2_2 == 3)) {
                v4_2 = com.google.android.gms.internal.firebase-auth-api.zzpe.zza(p4.zzb().intValue()).zzb();
            } else {
                if (v2_2 != 4) {
                    throw new java.security.GeneralSecurityException("unknown output prefix type");
                } else {
                    v4_2 = com.google.android.gms.internal.firebase-auth-api.zzpe.zzb(p4.zzb().intValue()).zzb();
                }
            }
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzsm(v1_2, v0_1, v4_2);
    }

    public final void zza(byte[] p4, byte[] p5)
    {
        if (p4.length < 10) {
            throw new java.security.GeneralSecurityException("tag too short");
        } else {
            if (this.zzc.equals(com.google.android.gms.internal.firebase-auth-api.zzxz.zzc)) {
                p5 = com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {p5, com.google.android.gms.internal.firebase-auth-api.zzsm.zza}));
            }
            com.google.android.gms.internal.firebase-auth-api.zzcc v0_4 = new byte[0];
            if (!this.zzc.equals(com.google.android.gms.internal.firebase-auth-api.zzxz.zzd)) {
                byte[] v1_3 = java.util.Arrays.copyOf(p4, 5);
                p4 = java.util.Arrays.copyOfRange(p4, 5, p4.length);
                v0_4 = v1_3;
            }
            if (!java.util.Arrays.equals(this.zzd, v0_4)) {
                throw new java.security.GeneralSecurityException("wrong prefix");
            } else {
                this.zzb.zza(p4, p5);
                return;
            }
        }
    }

    public final byte[] zza(byte[] p3)
    {
        if (this.zzc.equals(com.google.android.gms.internal.firebase-auth-api.zzxz.zzc)) {
            p3 = com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {p3, com.google.android.gms.internal.firebase-auth-api.zzsm.zza}));
        }
        return com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {this.zzd, this.zzb.zza(p3)}));
    }
}
