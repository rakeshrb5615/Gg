package com.google.android.gms.internal.firebase-auth-api;
public final class zzia implements com.google.android.gms.internal.firebase-auth-api.zzba {
    private final com.google.android.gms.internal.firebase-auth-api.zzba zza;
    private final byte[] zzb;

    private zzia(com.google.android.gms.internal.firebase-auth-api.zzba p2, byte[] p3)
    {
        this.zza = p2;
        if ((p3.length != 0) && (p3.length != 5)) {
            throw new IllegalArgumentException("identifier has an invalid length");
        } else {
            this.zzb = p3;
            return;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzba p1, com.google.android.gms.internal.firebase-auth-api.zzaaj p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzia(p1, p2.zzb());
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzba zza(com.google.android.gms.internal.firebase-auth-api.zzof p4)
    {
        java.security.GeneralSecurityException v4_2;
        String v0_2 = p4.zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
        String v1_2 = ((com.google.android.gms.internal.firebase-auth-api.zzba) com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(v0_2.zzf(), com.google.android.gms.internal.firebase-auth-api.zzba).zzb(v0_2.zzd()));
        String v0_1 = v0_2.zzb();
        int v2_2 = com.google.android.gms.internal.firebase-auth-api.zzhz.zza[v0_1.ordinal()];
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
        return new com.google.android.gms.internal.firebase-auth-api.zzia(v1_2, v4_2);
    }

    public final byte[] zza(byte[] p4, byte[] p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zzba v0_0 = this.zzb;
        if (v0_0.length != 0) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v0_0, p4)) {
                throw new java.security.GeneralSecurityException("wrong prefix");
            } else {
                return this.zza.zza(java.util.Arrays.copyOfRange(p4, 5, p4.length), p5);
            }
        } else {
            return this.zza.zza(p4, p5);
        }
    }

    public final byte[] zzb(byte[] p3, byte[] p4)
    {
        com.google.android.gms.internal.firebase-auth-api.zzba v0_0 = this.zzb;
        if (v0_0.length != 0) {
            return com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {v0_0, this.zza.zzb(p3, p4)}));
        } else {
            return this.zza.zzb(p3, p4);
        }
    }
}
