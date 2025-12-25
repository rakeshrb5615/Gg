package com.google.android.gms.location;
public final class LocationRequest$Builder {
    public static final long IMPLICIT_MAX_UPDATE_AGE = 255;
    public static final long IMPLICIT_MIN_UPDATE_INTERVAL = 255;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private int zzf;
    private float zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private android.os.WorkSource zzm;
    private com.google.android.gms.internal.location.zze zzn;

    public LocationRequest$Builder(int p1, long p2)
    {
        this(p2);
        this.setPriority(p1);
        return;
    }

    public LocationRequest$Builder(long p5)
    {
        this.zza = 102;
        this.zzc = -1;
        this.zzd = 0;
        this.zze = 9223372036854775807;
        this.zzf = 2147483647;
        this.zzg = 0;
        this.zzh = 1;
        this.zzi = -1;
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzn = 0;
        this.setIntervalMillis(p5);
        return;
    }

    public LocationRequest$Builder(com.google.android.gms.location.LocationRequest p4)
    {
        this(p4.getPriority(), p4.getIntervalMillis());
        this.setMinUpdateIntervalMillis(p4.getMinUpdateIntervalMillis());
        this.setMaxUpdateDelayMillis(p4.getMaxUpdateDelayMillis());
        this.setDurationMillis(p4.getDurationMillis());
        this.setMaxUpdates(p4.getMaxUpdates());
        this.setMinUpdateDistanceMeters(p4.getMinUpdateDistanceMeters());
        this.setWaitForAccurateLocation(p4.isWaitForAccurateLocation());
        this.setMaxUpdateAgeMillis(p4.getMaxUpdateAgeMillis());
        this.setGranularity(p4.getGranularity());
        int v0_7 = p4.zza();
        com.google.android.gms.location.zzar.zza(v0_7);
        this.zzk = v0_7;
        this.zzl = p4.zzb();
        this.zzm = p4.zzc();
        com.google.android.gms.internal.location.zze v4_1 = p4.zzd();
        int v0_10 = 1;
        if ((v4_1 != null) && (v4_1.zza())) {
            v0_10 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_10);
        this.zzn = v4_1;
        return;
    }

    public com.google.android.gms.location.LocationRequest build()
    {
        int v2_0 = this.zza;
        long v3 = this.zzb;
        long v5 = this.zzc;
        if (v5 != -1) {
            if (v2_0 != 105) {
                v5 = Math.min(v5, v3);
            }
        } else {
            v5 = v3;
        }
        long v9_1 = Math.max(this.zzd, this.zzb);
        long v7_0 = this.zzi;
        if (v7_0 == -1) {
            v7_0 = this.zzb;
        }
        return new com.google.android.gms.location.LocationRequest(v2_0, v3, v5, v9_1, 9223372036854775807, this.zze, this.zzf, this.zzg, this.zzh, v7_0, this.zzj, this.zzk, this.zzl, new android.os.WorkSource(this.zzm), this.zzn);
    }

    public com.google.android.gms.location.LocationRequest$Builder setDurationMillis(long p3)
    {
        int v0_2;
        if (p3 <= 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_2, "durationMillis must be greater than 0");
        this.zze = p3;
        return this;
    }

    public com.google.android.gms.location.LocationRequest$Builder setGranularity(int p1)
    {
        com.google.android.gms.location.zzq.zza(p1);
        this.zzj = p1;
        return this;
    }

    public com.google.android.gms.location.LocationRequest$Builder setIntervalMillis(long p3)
    {
        int v0_2;
        if (p3 < 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_2, "intervalMillis must be greater than or equal to 0");
        this.zzb = p3;
        return this;
    }

    public com.google.android.gms.location.LocationRequest$Builder setMaxUpdateAgeMillis(long p5)
    {
        int v1 = 1;
        if ((p5 != -1) && (p5 < 0)) {
            v1 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
        this.zzi = p5;
        return this;
    }

    public com.google.android.gms.location.LocationRequest$Builder setMaxUpdateDelayMillis(long p3)
    {
        int v0_2;
        if (p3 < 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_2, "maxUpdateDelayMillis must be greater than or equal to 0");
        this.zzd = p3;
        return this;
    }

    public com.google.android.gms.location.LocationRequest$Builder setMaxUpdates(int p3)
    {
        int v0;
        if (p3 <= 0) {
            v0 = 0;
        } else {
            v0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0, "maxUpdates must be greater than 0");
        this.zzf = p3;
        return this;
    }

    public com.google.android.gms.location.LocationRequest$Builder setMinUpdateDistanceMeters(float p3)
    {
        int v0_2;
        if (p3 < 0) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_2, "minUpdateDistanceMeters must be greater than or equal to 0");
        this.zzg = p3;
        return this;
    }

    public com.google.android.gms.location.LocationRequest$Builder setMinUpdateIntervalMillis(long p5)
    {
        int v1 = 1;
        if ((p5 != -1) && (p5 < 0)) {
            v1 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
        this.zzc = p5;
        return this;
    }

    public com.google.android.gms.location.LocationRequest$Builder setPriority(int p1)
    {
        com.google.android.gms.location.zzan.zza(p1);
        this.zza = p1;
        return this;
    }

    public com.google.android.gms.location.LocationRequest$Builder setWaitForAccurateLocation(boolean p1)
    {
        this.zzh = p1;
        return this;
    }

    public final com.google.android.gms.location.LocationRequest$Builder zza(int p1)
    {
        com.google.android.gms.location.zzar.zza(p1);
        this.zzk = p1;
        return this;
    }

    public final com.google.android.gms.location.LocationRequest$Builder zzb(boolean p1)
    {
        this.zzl = p1;
        return this;
    }

    public final com.google.android.gms.location.LocationRequest$Builder zzc(android.os.WorkSource p1)
    {
        this.zzm = p1;
        return this;
    }
}
