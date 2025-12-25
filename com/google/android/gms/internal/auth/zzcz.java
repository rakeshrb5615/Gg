package com.google.android.gms.internal.auth;
public final class zzcz {
    final String zza;
    final android.net.Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final com.google.android.gms.internal.auth.zzdg zzi;

    public zzcz(android.net.Uri p11)
    {
        this(0, p11, "", "", 0, 0, 0, 0, 0);
        return;
    }

    private zzcz(String p1, android.net.Uri p2, String p3, String p4, boolean p5, boolean p6, boolean p7, boolean p8, com.google.android.gms.internal.auth.zzdg p9)
    {
        this.zza = 0;
        this.zzb = p2;
        this.zzc = "";
        this.zzd = "";
        this.zze = p5;
        this.zzf = 0;
        this.zzg = p7;
        this.zzh = 0;
        this.zzi = 0;
        return;
    }

    public final com.google.android.gms.internal.auth.zzcz zza()
    {
        return new com.google.android.gms.internal.auth.zzcz(0, this.zzb, this.zzc, this.zzd, this.zze, 0, 1, 0, 0);
    }

    public final com.google.android.gms.internal.auth.zzcz zzb()
    {
        if (!this.zzc.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        } else {
            return new com.google.android.gms.internal.auth.zzcz(0, this.zzb, this.zzc, this.zzd, 1, 0, this.zzg, 0, 0);
        }
    }

    public final com.google.android.gms.internal.auth.zzdc zzc(String p2, double p3)
    {
        return new com.google.android.gms.internal.auth.zzcx(this, p2, Double.valueOf(0), 1);
    }

    public final com.google.android.gms.internal.auth.zzdc zzd(String p2, long p3)
    {
        return new com.google.android.gms.internal.auth.zzcv(this, p2, Long.valueOf(p3), 1);
    }

    public final com.google.android.gms.internal.auth.zzdc zze(String p3, boolean p4)
    {
        return new com.google.android.gms.internal.auth.zzcw(this, p3, Boolean.valueOf(p4), 1);
    }

    public final com.google.android.gms.internal.auth.zzdc zzf(String p8, Object p9, com.google.android.gms.internal.auth.zzhu p10)
    {
        return new com.google.android.gms.internal.auth.zzcy(this, "getTokenRefactor__blocked_packages", p9, 1, p10, 0);
    }
}
