package com.google.android.gms.internal.firebase-auth-api;
public final class zzmp implements com.google.android.gms.internal.firebase-auth-api.zzbg {

    private zzmp(com.google.android.gms.internal.firebase-auth-api.zzbg p1, byte[] p2)
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbg zza(com.google.android.gms.internal.firebase-auth-api.zzof p4)
    {
        java.security.GeneralSecurityException v4_2;
        String v0_2 = p4.zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
        String v1_2 = ((com.google.android.gms.internal.firebase-auth-api.zzbg) com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(v0_2.zzf(), com.google.android.gms.internal.firebase-auth-api.zzbg).zzb(v0_2.zzd()));
        String v0_1 = v0_2.zzb();
        int v2_2 = com.google.android.gms.internal.firebase-auth-api.zzmo.zza[v0_1.ordinal()];
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
        return new com.google.android.gms.internal.firebase-auth-api.zzmp(v1_2, v4_2);
    }
}
