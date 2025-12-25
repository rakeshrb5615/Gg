package com.google.android.gms.internal.firebase-auth-api;
public final class zzof extends com.google.android.gms.internal.firebase-auth-api.zzbi {
    private final com.google.android.gms.internal.firebase-auth-api.zzqb zza;

    public zzof(com.google.android.gms.internal.firebase-auth-api.zzqb p1, com.google.android.gms.internal.firebase-auth-api.zzch p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzof.zza(p1, p2);
        this.zza = p1;
        return;
    }

    private static void zza(com.google.android.gms.internal.firebase-auth-api.zzqb p1, com.google.android.gms.internal.firebase-auth-api.zzch p2)
    {
        int v1_3 = com.google.android.gms.internal.firebase-auth-api.zzoe.zzb[p1.zza().ordinal()];
        if ((v1_3 == 1) || (v1_3 == 2)) {
            com.google.android.gms.internal.firebase-auth-api.zzch.zza(p2);
            return;
        } else {
            return;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzcb zza()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzof$zza(this.zza.zzf(), this.zza.zzb(), 0);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzqb zza(com.google.android.gms.internal.firebase-auth-api.zzch p2)
    {
        com.google.android.gms.internal.firebase-auth-api.zzof.zza(this.zza, p2);
        return this.zza;
    }

    public final Integer zzb()
    {
        return this.zza.zze();
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaaj zzc()
    {
        java.security.GeneralSecurityException v0_0 = this.zza;
        if (!v0_0.zzb().equals(com.google.android.gms.internal.firebase-auth-api.zzxz.zzd)) {
            if (!v0_0.zzb().equals(com.google.android.gms.internal.firebase-auth-api.zzxz.zzb)) {
                if ((!v0_0.zzb().equals(com.google.android.gms.internal.firebase-auth-api.zzxz.zzc)) && (!v0_0.zzb().equals(com.google.android.gms.internal.firebase-auth-api.zzxz.zze))) {
                    throw new java.security.GeneralSecurityException("Unknown output prefix type");
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzpe.zza(v0_0.zze().intValue());
                }
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzpe.zzb(v0_0.zze().intValue());
            }
        } else {
            java.security.GeneralSecurityException v0_10 = new byte[0];
            return com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(v0_10);
        }
    }
}
