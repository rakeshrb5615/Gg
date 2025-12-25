package com.google.android.gms.internal.measurement;
public final class zzkg {
    final android.net.Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;

    public zzkg(android.net.Uri p11)
    {
        this(0, p11, "", "", 0, 0, 0, 0, 0);
        return;
    }

    private zzkg(String p1, android.net.Uri p2, String p3, String p4, boolean p5, boolean p6, boolean p7, boolean p8, l4.c p9)
    {
        this.zza = p2;
        this.zzb = "";
        this.zzc = "";
        this.zzd = p5;
        this.zze = p7;
        return;
    }

    public final com.google.android.gms.internal.measurement.zzkg zza()
    {
        String v3 = this.zzb;
        if (!v3.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        } else {
            return new com.google.android.gms.internal.measurement.zzkg(0, this.zza, v3, this.zzc, 1, 0, this.zze, 0, 0);
        }
    }

    public final com.google.android.gms.internal.measurement.zzkg zzb()
    {
        return new com.google.android.gms.internal.measurement.zzkg(0, this.zza, this.zzb, this.zzc, this.zzd, 0, 1, 0, 0);
    }

    public final com.google.android.gms.internal.measurement.zzkm zzc(String p2, long p3)
    {
        return new com.google.android.gms.internal.measurement.zzkc(this, p2, Long.valueOf(p3), 1);
    }

    public final com.google.android.gms.internal.measurement.zzkm zzd(String p3, boolean p4)
    {
        return new com.google.android.gms.internal.measurement.zzkd(this, p3, Boolean.valueOf(p4), 1);
    }

    public final com.google.android.gms.internal.measurement.zzkm zze(String p2, double p3)
    {
        return new com.google.android.gms.internal.measurement.zzke(this, "measurement.test.double_flag", Double.valueOf(-4609434218613702656), 1);
    }

    public final com.google.android.gms.internal.measurement.zzkm zzf(String p3, String p4)
    {
        return new com.google.android.gms.internal.measurement.zzkf(this, p3, p4, 1);
    }
}
