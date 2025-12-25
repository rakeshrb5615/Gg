package com.google.android.gms.measurement.internal;
final class zzbc {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    public zzbc(String p14, String p15, long p16, long p18, long p20, long p22, long p24, Long p26, Long p27, Long p28, Boolean p29)
    {
        int v10_0;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p14);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p15);
        int v11 = 0;
        if (p16 < 0) {
            v10_0 = 0;
        } else {
            v10_0 = 1;
        }
        int v10_2;
        com.google.android.gms.common.internal.Preconditions.checkArgument(v10_0);
        if (p18 < 0) {
            v10_2 = 0;
        } else {
            v10_2 = 1;
        }
        int v10_4;
        com.google.android.gms.common.internal.Preconditions.checkArgument(v10_2);
        if (p20 < 0) {
            v10_4 = 0;
        } else {
            v10_4 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v10_4);
        if (p24 >= 0) {
            v11 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v11);
        this.zza = p14;
        this.zzb = p15;
        this.zzc = p16;
        this.zzd = p18;
        this.zze = p20;
        this.zzf = p22;
        this.zzg = p24;
        this.zzh = p26;
        this.zzi = p27;
        this.zzj = p28;
        this.zzk = p29;
        return;
    }

    public final com.google.android.gms.measurement.internal.zzbc zza(long p19)
    {
        return new com.google.android.gms.measurement.internal.zzbc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, p19, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }

    public final com.google.android.gms.measurement.internal.zzbc zzb(long p19, long p21)
    {
        com.google.android.gms.measurement.internal.zzbc v0 = this;
        return new com.google.android.gms.measurement.internal.zzbc(v0.zza, v0.zzb, this.zzc, this.zzd, this.zze, this.zzf, p19, Long.valueOf(p21), v0.zzi, this.zzj, this.zzk);
    }

    public final com.google.android.gms.measurement.internal.zzbc zzc(Long p19, Long p20, Boolean p21)
    {
        return new com.google.android.gms.measurement.internal.zzbc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, p19, p20, p21);
    }
}
