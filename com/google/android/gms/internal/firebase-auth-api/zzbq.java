package com.google.android.gms.internal.firebase-auth-api;
public final class zzbq {
    private boolean zza;
    private com.google.android.gms.internal.firebase-auth-api.zzbk zzb;
    private final com.google.android.gms.internal.firebase-auth-api.zzcb zzc;
    private com.google.android.gms.internal.firebase-auth-api.zzbp zzd;
    private com.google.android.gms.internal.firebase-auth-api.zzbn zze;

    private zzbq(com.google.android.gms.internal.firebase-auth-api.zzcb p2)
    {
        this.zzb = com.google.android.gms.internal.firebase-auth-api.zzbk.zza;
        this.zzd = 0;
        this.zze = 0;
        this.zzc = p2;
        return;
    }

    public synthetic zzbq(com.google.android.gms.internal.firebase-auth-api.zzcb p1, com.google.android.gms.internal.firebase-auth-api.zzbt p2)
    {
        this(p1);
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzbk zza(com.google.android.gms.internal.firebase-auth-api.zzbq p0)
    {
        return p0.zzb;
    }

    public static bridge synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzbq p0, com.google.android.gms.internal.firebase-auth-api.zzbn p1)
    {
        p0.zze = p1;
        return;
    }

    public static bridge synthetic void zza(com.google.android.gms.internal.firebase-auth-api.zzbq p0, boolean p1)
    {
        p0.zza = 0;
        return;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzbp zzb(com.google.android.gms.internal.firebase-auth-api.zzbq p0)
    {
        return p0.zzd;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzbn zzc(com.google.android.gms.internal.firebase-auth-api.zzbq p0)
    {
        return p0.zze;
    }

    public static bridge synthetic com.google.android.gms.internal.firebase-auth-api.zzcb zzd(com.google.android.gms.internal.firebase-auth-api.zzbq p0)
    {
        return p0.zzc;
    }

    public static bridge synthetic boolean zze(com.google.android.gms.internal.firebase-auth-api.zzbq p0)
    {
        return p0.zza;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzbq zza()
    {
        int v0_0 = this.zze;
        if (v0_0 != 0) {
            com.google.android.gms.internal.firebase-auth-api.zzbn.zza(v0_0);
        }
        this.zza = 1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzbq zzb()
    {
        this.zzd = com.google.android.gms.internal.firebase-auth-api.zzbp.zzb();
        return this;
    }
}
