package com.google.android.gms.internal.firebase-auth-api;
public final class zzqb implements com.google.android.gms.internal.firebase-auth-api.zzqf {
    private final String zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzajv zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzwx$zzb zzd;
    private final com.google.android.gms.internal.firebase-auth-api.zzxz zze;
    private final Integer zzf;

    private zzqb(String p1, com.google.android.gms.internal.firebase-auth-api.zzaaj p2, com.google.android.gms.internal.firebase-auth-api.zzajv p3, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb p4, com.google.android.gms.internal.firebase-auth-api.zzxz p5, Integer p6)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p6;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzqb zza(String p7, com.google.android.gms.internal.firebase-auth-api.zzajv p8, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb p9, com.google.android.gms.internal.firebase-auth-api.zzxz p10, Integer p11)
    {
        if (p10 != com.google.android.gms.internal.firebase-auth-api.zzxz.zzd) {
            if (p11 == null) {
                throw new java.security.GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
            }
        } else {
            if (p11 != null) {
                throw new java.security.GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzqb(p7, com.google.android.gms.internal.firebase-auth-api.zzqn.zza(p7), p8, p9, p10, p11);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzwx$zzb zza()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzxz zzb()
    {
        return this.zze;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaaj zzc()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzajv zzd()
    {
        return this.zzc;
    }

    public final Integer zze()
    {
        return this.zzf;
    }

    public final String zzf()
    {
        return this.zza;
    }
}
