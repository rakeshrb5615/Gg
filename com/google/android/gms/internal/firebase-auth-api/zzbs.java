package com.google.android.gms.internal.firebase-auth-api;
public final class zzbs implements com.google.android.gms.internal.firebase-auth-api.zzoa {
    private static final com.google.android.gms.internal.firebase-auth-api.zzbu zza;
    private final com.google.android.gms.internal.firebase-auth-api.zzbi zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzxc zzc;
    private final com.google.android.gms.internal.firebase-auth-api.zzbk zzd;
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final com.google.android.gms.internal.firebase-auth-api.zzbu zzh;

    static zzbs()
    {
        com.google.android.gms.internal.firebase-auth-api.zzbs.zza = new com.google.android.gms.internal.firebase-auth-api.zzbr();
        return;
    }

    private zzbs(com.google.android.gms.internal.firebase-auth-api.zzbi p1, com.google.android.gms.internal.firebase-auth-api.zzxc p2, int p3, boolean p4, boolean p5, com.google.android.gms.internal.firebase-auth-api.zzbu p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzbk v1_1;
        this.zzb = p1;
        this.zzc = p2;
        com.google.android.gms.internal.firebase-auth-api.zzbk v1_3 = com.google.android.gms.internal.firebase-auth-api.zzbo.zza[p2.ordinal()];
        if (v1_3 == 1) {
            v1_1 = com.google.android.gms.internal.firebase-auth-api.zzbk.zza;
        } else {
            if (v1_3 == 2) {
                v1_1 = com.google.android.gms.internal.firebase-auth-api.zzbk.zzc;
            } else {
                v1_1 = com.google.android.gms.internal.firebase-auth-api.zzbk.zzb;
            }
        }
        this.zzd = v1_1;
        this.zze = p3;
        this.zzf = p4;
        this.zzg = p5;
        this.zzh = p6;
        return;
    }

    public synthetic zzbs(com.google.android.gms.internal.firebase-auth-api.zzbi p1, com.google.android.gms.internal.firebase-auth-api.zzxc p2, int p3, boolean p4, boolean p5, com.google.android.gms.internal.firebase-auth-api.zzbu p6, com.google.android.gms.internal.firebase-auth-api.zzbt p7)
    {
        this(p1, p2, p3, p4, p5, p6);
        return;
    }

    public static bridge synthetic int zza(com.google.android.gms.internal.firebase-auth-api.zzbs p0)
    {
        return p0.zze;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzbi zzb(com.google.android.gms.internal.firebase-auth-api.zzbs p0)
    {
        return p0.zzb;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzxc zzc(com.google.android.gms.internal.firebase-auth-api.zzbs p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzbu zzd()
    {
        return com.google.android.gms.internal.firebase-auth-api.zzbs.zza;
    }

    public static synthetic void zzd(com.google.android.gms.internal.firebase-auth-api.zzbs p0)
    {
        return;
    }

    public static bridge synthetic boolean zze(com.google.android.gms.internal.firebase-auth-api.zzbs p0)
    {
        return p0.zzf;
    }

    public static bridge synthetic boolean zzf(com.google.android.gms.internal.firebase-auth-api.zzbs p0)
    {
        return p0.zzg;
    }

    public final int zza()
    {
        return this.zze;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzbi zzb()
    {
        this.zzh.zza(this);
        return this.zzb;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzbk zzc()
    {
        return this.zzd;
    }

    public final boolean zze()
    {
        return this.zzf;
    }
}
