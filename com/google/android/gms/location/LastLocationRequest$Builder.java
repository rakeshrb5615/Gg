package com.google.android.gms.location;
public final class LastLocationRequest$Builder {
    private long zza;
    private int zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.location.zze zzd;

    public LastLocationRequest$Builder()
    {
        this.zza = 9223372036854775807;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        return;
    }

    public LastLocationRequest$Builder(com.google.android.gms.location.LastLocationRequest p3)
    {
        this.zza = p3.getMaxUpdateAgeMillis();
        this.zzb = p3.getGranularity();
        this.zzc = p3.zza();
        this.zzd = p3.zzb();
        return;
    }

    public com.google.android.gms.location.LastLocationRequest build()
    {
        return new com.google.android.gms.location.LastLocationRequest(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public com.google.android.gms.location.LastLocationRequest$Builder setGranularity(int p1)
    {
        com.google.android.gms.location.zzq.zza(p1);
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.location.LastLocationRequest$Builder setMaxUpdateAgeMillis(long p3)
    {
        int v0_2;
        if (p3 <= 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_2, "maxUpdateAgeMillis must be greater than 0");
        this.zza = p3;
        return this;
    }
}
