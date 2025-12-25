package com.google.android.gms.location;
public final class CurrentLocationRequest$Builder {
    private long zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private final boolean zze;
    private final int zzf;
    private final android.os.WorkSource zzg;
    private final com.google.android.gms.internal.location.zze zzh;

    public CurrentLocationRequest$Builder()
    {
        this.zza = 10000;
        this.zzb = 0;
        this.zzc = 102;
        this.zzd = 9223372036854775807;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        return;
    }

    public CurrentLocationRequest$Builder(com.google.android.gms.location.CurrentLocationRequest p3)
    {
        this.zza = p3.getMaxUpdateAgeMillis();
        this.zzb = p3.getGranularity();
        this.zzc = p3.getPriority();
        this.zzd = p3.getDurationMillis();
        this.zze = p3.zza();
        this.zzf = p3.zzb();
        this.zzg = new android.os.WorkSource(p3.zzc());
        this.zzh = p3.zzd();
        return;
    }

    public com.google.android.gms.location.CurrentLocationRequest build()
    {
        return new com.google.android.gms.location.CurrentLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, new android.os.WorkSource(this.zzg), this.zzh);
    }

    public com.google.android.gms.location.CurrentLocationRequest$Builder setDurationMillis(long p3)
    {
        int v0_2;
        if (p3 <= 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_2, "durationMillis must be greater than 0");
        this.zzd = p3;
        return this;
    }

    public com.google.android.gms.location.CurrentLocationRequest$Builder setGranularity(int p1)
    {
        com.google.android.gms.location.zzq.zza(p1);
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.location.CurrentLocationRequest$Builder setMaxUpdateAgeMillis(long p3)
    {
        int v0_2;
        if (p3 < 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_2, "maxUpdateAgeMillis must be greater than or equal to 0");
        this.zza = p3;
        return this;
    }

    public com.google.android.gms.location.CurrentLocationRequest$Builder setPriority(int p1)
    {
        com.google.android.gms.location.zzan.zza(p1);
        this.zzc = p1;
        return this;
    }
}
