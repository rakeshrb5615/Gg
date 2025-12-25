package com.google.android.gms.internal.firebase-auth-api;
public final class zzkb extends com.google.android.gms.internal.firebase-auth-api.zzlg {
    private static final java.util.Set zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzkb$zzc zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzkb$zzb zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzkb$zze zzd;
    private final com.google.android.gms.internal.firebase-auth-api.zzkb$zzd zze;
    private final com.google.android.gms.internal.firebase-auth-api.zzcb zzf;
    private final com.google.android.gms.internal.firebase-auth-api.zzaaj zzg;

    static zzkb()
    {
        com.google.android.gms.internal.firebase-auth-api.zzkb.zza = ((java.util.Set) com.google.android.gms.internal.firebase-auth-api.zzql.zza(new com.google.android.gms.internal.firebase-auth-api.zzkd()));
        return;
    }

    private zzkb(com.google.android.gms.internal.firebase-auth-api.zzkb$zzc p1, com.google.android.gms.internal.firebase-auth-api.zzkb$zzb p2, com.google.android.gms.internal.firebase-auth-api.zzkb$zze p3, com.google.android.gms.internal.firebase-auth-api.zzcb p4, com.google.android.gms.internal.firebase-auth-api.zzkb$zzd p5, com.google.android.gms.internal.firebase-auth-api.zzaaj p6)
    {
        this.zzb = p1;
        this.zzc = p2;
        this.zzd = p3;
        this.zzf = p4;
        this.zze = p5;
        this.zzg = p6;
        return;
    }

    public synthetic zzkb(com.google.android.gms.internal.firebase-auth-api.zzkb$zzc p1, com.google.android.gms.internal.firebase-auth-api.zzkb$zzb p2, com.google.android.gms.internal.firebase-auth-api.zzkb$zze p3, com.google.android.gms.internal.firebase-auth-api.zzcb p4, com.google.android.gms.internal.firebase-auth-api.zzkb$zzd p5, com.google.android.gms.internal.firebase-auth-api.zzaaj p6, com.google.android.gms.internal.firebase-auth-api.zzkf p7)
    {
        this(p1, p2, p3, p4, p5, p6);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzkb$zza zzc()
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzkb$zza(0);
    }

    public static bridge synthetic java.util.Set zzi()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzkb.zza;
    }

    public static synthetic java.util.Set zzj()
    {
        java.util.Set v0_1 = new java.util.HashSet();
        com.google.android.gms.internal.firebase-auth-api.zzdi$zza v4_0 = com.google.android.gms.internal.firebase-auth-api.zzdx$zza.zzc;
        v0_1.add(com.google.android.gms.internal.firebase-auth-api.zzdx.zze().zza(12).zzb(16).zzc(16).zza(v4_0).zza());
        v0_1.add(com.google.android.gms.internal.firebase-auth-api.zzdx.zze().zza(12).zzb(32).zzc(16).zza(v4_0).zza());
        com.google.android.gms.internal.firebase-auth-api.zzdi$zza v4_1 = com.google.android.gms.internal.firebase-auth-api.zzdi$zza.zzc;
        com.google.android.gms.internal.firebase-auth-api.zzdi$zzc v5 = com.google.android.gms.internal.firebase-auth-api.zzdi$zzc.zzc;
        v0_1.add(com.google.android.gms.internal.firebase-auth-api.zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(v4_1).zza(v5).zza());
        v0_1.add(com.google.android.gms.internal.firebase-auth-api.zzdi.zzf().zza(32).zzb(com.google.android.gms.internal.firebase-auth-api.zzjf$zza v2_0).zzd(32).zzc(16).zza(v4_1).zza(v5).zza());
        v0_1.add(com.google.android.gms.internal.firebase-auth-api.zzge.zzc());
        v0_1.add(com.google.android.gms.internal.firebase-auth-api.zzjf.zzc().zza(64).zza(com.google.android.gms.internal.firebase-auth-api.zzjf$zza.zzc).zza());
        return java.util.Collections.unmodifiableSet(v0_1);
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.internal.firebase-auth-api.zzkb)) {
            if ((!java.util.Objects.equals(((com.google.android.gms.internal.firebase-auth-api.zzkb) p4).zzb, this.zzb)) || ((!java.util.Objects.equals(((com.google.android.gms.internal.firebase-auth-api.zzkb) p4).zzc, this.zzc)) || ((!java.util.Objects.equals(((com.google.android.gms.internal.firebase-auth-api.zzkb) p4).zzd, this.zzd)) || ((!java.util.Objects.equals(((com.google.android.gms.internal.firebase-auth-api.zzkb) p4).zzf, this.zzf)) || ((!java.util.Objects.equals(((com.google.android.gms.internal.firebase-auth-api.zzkb) p4).zze, this.zze)) || (!java.util.Objects.equals(((com.google.android.gms.internal.firebase-auth-api.zzkb) p4).zzg, this.zzg))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        com.google.android.gms.internal.firebase-auth-api.zzkb$zzb v2 = this.zzc;
        com.google.android.gms.internal.firebase-auth-api.zzcb v4 = this.zzf;
        return java.util.Objects.hash(new Object[] {com.google.android.gms.internal.firebase-auth-api.zzkb, this.zzg}));
    }

    public final String toString()
    {
        com.google.android.gms.internal.firebase-auth-api.zzkb$zze v2 = this.zzd;
        com.google.android.gms.internal.firebase-auth-api.zzkb$zzd v4 = this.zze;
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", new Object[] {this.zzb, this.zzg}));
    }

    public final boolean zza()
    {
        if (this.zze == com.google.android.gms.internal.firebase-auth-api.zzkb$zzd.zzc) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzcb zzb()
    {
        return this.zzf;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkb$zzc zzd()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkb$zzb zze()
    {
        return this.zzc;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkb$zze zzf()
    {
        return this.zzd;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzkb$zzd zzg()
    {
        return this.zze;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzaaj zzh()
    {
        return this.zzg;
    }
}
