package com.google.android.gms.location;
public final class LocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private int zzf;
    private float zzg;
    private boolean zzh;
    private long zzi;
    private final int zzj;
    private final int zzk;
    private final boolean zzl;
    private final android.os.WorkSource zzm;
    private final com.google.android.gms.internal.location.zze zzn;

    static LocationRequest()
    {
        com.google.android.gms.location.LocationRequest.CREATOR = new com.google.android.gms.location.zzaf();
        return;
    }

    public LocationRequest()
    {
        this(102, 3600000, 600000, 0, 9223372036854775807, 9223372036854775807, 2147483647, 0, 1, 3600000, 0, 0, 0, new android.os.WorkSource(), 0);
        return;
    }

    public LocationRequest(int p4, long p5, long p7, long p9, long p11, long p13, int p15, float p16, boolean p17, long p18, int p20, int p21, boolean p22, android.os.WorkSource p23, com.google.android.gms.internal.location.zze p24)
    {
        this.zza = p4;
        if (p4 != 105) {
            this.zzb = p5;
        } else {
            this.zzb = 9223372036854775807;
        }
        long v7_4;
        this.zzc = p7;
        this.zzd = p9;
        if (p11 != 9223372036854775807) {
            v7_4 = Math.min(Math.max(1, (p11 - android.os.SystemClock.elapsedRealtime())), p13);
        } else {
            v7_4 = p13;
        }
        this.zze = v7_4;
        this.zzf = p15;
        this.zzg = p16;
        this.zzh = p17;
        if (p18 != -1) {
            p5 = p18;
        }
        this.zzi = p5;
        this.zzj = p20;
        this.zzk = p21;
        this.zzl = p22;
        this.zzm = p23;
        this.zzn = p24;
        return;
    }

    public static com.google.android.gms.location.LocationRequest create()
    {
        return new com.google.android.gms.location.LocationRequest(102, 3600000, 600000, 0, 9223372036854775807, 9223372036854775807, 2147483647, 0, 1, 3600000, 0, 0, 0, new android.os.WorkSource(), 0);
    }

    private static String zze(long p2)
    {
        if (p2 != 9223372036854775807) {
            return com.google.android.gms.internal.location.zzeo.zzb(p2);
        } else {
            return "\u221e";
        }
    }

    public boolean equals(Object p7)
    {
        if (((!(p7 instanceof com.google.android.gms.location.LocationRequest)) || ((this.zza != ((com.google.android.gms.location.LocationRequest) p7).zza) || ((!this.isPassive()) && (this.zzb != ((com.google.android.gms.location.LocationRequest) p7).zzb)))) || (((this.zzc != ((com.google.android.gms.location.LocationRequest) p7).zzc) || ((this.isBatched() != ((com.google.android.gms.location.LocationRequest) p7).isBatched()) || ((this.isBatched()) && (this.zzd != ((com.google.android.gms.location.LocationRequest) p7).zzd)))) || ((this.zze != ((com.google.android.gms.location.LocationRequest) p7).zze) || ((this.zzf != ((com.google.android.gms.location.LocationRequest) p7).zzf) || ((this.zzg != ((com.google.android.gms.location.LocationRequest) p7).zzg) || ((this.zzh != ((com.google.android.gms.location.LocationRequest) p7).zzh) || ((this.zzj != ((com.google.android.gms.location.LocationRequest) p7).zzj) || ((this.zzk != ((com.google.android.gms.location.LocationRequest) p7).zzk) || ((this.zzl != ((com.google.android.gms.location.LocationRequest) p7).zzl) || ((!this.zzm.equals(((com.google.android.gms.location.LocationRequest) p7).zzm)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzn, ((com.google.android.gms.location.LocationRequest) p7).zzn)))))))))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public long getDurationMillis()
    {
        return this.zze;
    }

    public long getExpirationTime()
    {
        long v0_0 = android.os.SystemClock.elapsedRealtime();
        long v2_0 = this.zze;
        long v4 = (v0_0 + v2_0);
        if (((v0_0 ^ v4) & (v2_0 ^ v4)) >= 0) {
            return v4;
        } else {
            return 9223372036854775807;
        }
    }

    public long getFastestInterval()
    {
        return this.getMinUpdateIntervalMillis();
    }

    public int getGranularity()
    {
        return this.zzj;
    }

    public long getInterval()
    {
        return this.getIntervalMillis();
    }

    public long getIntervalMillis()
    {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis()
    {
        return this.zzi;
    }

    public long getMaxUpdateDelayMillis()
    {
        return this.zzd;
    }

    public int getMaxUpdates()
    {
        return this.zzf;
    }

    public long getMaxWaitTime()
    {
        return Math.max(this.zzd, this.zzb);
    }

    public float getMinUpdateDistanceMeters()
    {
        return this.zzg;
    }

    public long getMinUpdateIntervalMillis()
    {
        return this.zzc;
    }

    public int getNumUpdates()
    {
        return this.getMaxUpdates();
    }

    public int getPriority()
    {
        return this.zza;
    }

    public float getSmallestDisplacement()
    {
        return this.getMinUpdateDistanceMeters();
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzm}));
    }

    public boolean isBatched()
    {
        int v0_0 = this.zzd;
        if ((v0_0 <= 0) || ((v0_0 >> 1) < this.zzb)) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean isFastestIntervalExplicitlySet()
    {
        return 1;
    }

    public boolean isPassive()
    {
        if (this.zza != 105) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean isWaitForAccurateLocation()
    {
        return this.zzh;
    }

    public com.google.android.gms.location.LocationRequest setExpirationDuration(long p3)
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

    public com.google.android.gms.location.LocationRequest setExpirationTime(long p3)
    {
        this.zze = Math.max(1, (p3 - android.os.SystemClock.elapsedRealtime()));
        return this;
    }

    public com.google.android.gms.location.LocationRequest setFastestInterval(long p4)
    {
        int v1_2;
        Object[] v0_0 = Long.valueOf(p4);
        if (p4 < 0) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1_2, "illegal fastest interval: %d", new Object[] {v0_0}));
        this.zzc = p4;
        return this;
    }

    public com.google.android.gms.location.LocationRequest setInterval(long p9)
    {
        long v0_6;
        if (p9 < 0) {
            v0_6 = 0;
        } else {
            v0_6 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_6, "intervalMillis must be greater than or equal to 0");
        long v2 = this.zzb;
        if (this.zzc == (v2 / 6)) {
            this.zzc = (p9 / 6);
        }
        if (this.zzi == v2) {
            this.zzi = p9;
        }
        this.zzb = p9;
        return this;
    }

    public com.google.android.gms.location.LocationRequest setMaxWaitTime(long p4)
    {
        int v1_2;
        Object[] v0_0 = Long.valueOf(p4);
        if (p4 < 0) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1_2, "illegal max wait time: %d", new Object[] {v0_0}));
        this.zzd = p4;
        return this;
    }

    public com.google.android.gms.location.LocationRequest setNumUpdates(int p4)
    {
        if (p4 <= null) {
            throw new IllegalArgumentException(v1.a.m(new StringBuilder((String.valueOf(p4).length() + 20)), "invalid numUpdates: ", p4));
        } else {
            this.zzf = p4;
            return this;
        }
    }

    public com.google.android.gms.location.LocationRequest setPriority(int p1)
    {
        com.google.android.gms.location.zzan.zza(p1);
        this.zza = p1;
        return this;
    }

    public com.google.android.gms.location.LocationRequest setSmallestDisplacement(float p4)
    {
        if (p4 < 0) {
            StringBuilder v2_0 = new StringBuilder((String.valueOf(p4).length() + 22));
            v2_0.append("invalid displacement: ");
            v2_0.append(p4);
            throw new IllegalArgumentException(v2_0.toString());
        } else {
            this.zzg = p4;
            return this;
        }
    }

    public com.google.android.gms.location.LocationRequest setWaitForAccurateLocation(boolean p1)
    {
        this.zzh = p1;
        return this;
    }

    public String toString()
    {
        String v0_2 = u.e.b("Request[");
        if (!this.isPassive()) {
            v0_2.append("@");
            if (!this.isBatched()) {
                com.google.android.gms.internal.location.zzeo.zzc(this.zzb, v0_2);
            } else {
                com.google.android.gms.internal.location.zzeo.zzc(this.zzb, v0_2);
                v0_2.append("/");
                com.google.android.gms.internal.location.zzeo.zzc(this.zzd, v0_2);
            }
            v0_2.append(" ");
            v0_2.append(com.google.android.gms.location.zzan.zzb(this.zza));
        } else {
            v0_2.append(com.google.android.gms.location.zzan.zzb(this.zza));
            if (this.zzd > 0) {
                v0_2.append("/");
                com.google.android.gms.internal.location.zzeo.zzc(this.zzd, v0_2);
            }
        }
        if ((this.isPassive()) || (this.zzc != this.zzb)) {
            v0_2.append(", minUpdateInterval=");
            v0_2.append(com.google.android.gms.location.LocationRequest.zze(this.zzc));
        }
        if (((double) this.zzg) > 0) {
            v0_2.append(", minUpdateDistance=");
            v0_2.append(this.zzg);
        }
        if (!this.isPassive()) {
            if (this.zzi != this.zzb) {
                v0_2.append(", maxUpdateAge=");
                v0_2.append(com.google.android.gms.location.LocationRequest.zze(this.zzi));
            }
        } else {
            if (this.zzi != 9223372036854775807) {
            }
        }
        if (this.zze != 9223372036854775807) {
            v0_2.append(", duration=");
            com.google.android.gms.internal.location.zzeo.zzc(this.zze, v0_2);
        }
        if (this.zzf != 2147483647) {
            v0_2.append(", maxUpdates=");
            v0_2.append(this.zzf);
        }
        if (this.zzk != 0) {
            v0_2.append(", ");
            v0_2.append(com.google.android.gms.location.zzar.zzb(this.zzk));
        }
        if (this.zzj != 0) {
            v0_2.append(", ");
            v0_2.append(com.google.android.gms.location.zzq.zzb(this.zzj));
        }
        if (this.zzh) {
            v0_2.append(", waitForAccurateLocation");
        }
        if (this.zzl) {
            v0_2.append(", bypass");
        }
        if (!com.google.android.gms.common.util.WorkSourceUtil.isEmpty(this.zzm)) {
            v0_2.append(", ");
            v0_2.append(this.zzm);
        }
        if (this.zzn != null) {
            v0_2.append(", impersonation=");
            v0_2.append(this.zzn);
        }
        v0_2.append(93);
        return v0_2.toString();
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, this.getPriority());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 2, this.getIntervalMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 3, this.getMinUpdateIntervalMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 6, this.getMaxUpdates());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(p5, 7, this.getMinUpdateDistanceMeters());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 8, this.getMaxUpdateDelayMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 9, this.isWaitForAccurateLocation());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 10, this.getDurationMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 11, this.getMaxUpdateAgeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 12, this.getGranularity());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 13, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 15, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 16, this.zzm, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 17, this.zzn, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final int zza()
    {
        return this.zzk;
    }

    public final boolean zzb()
    {
        return this.zzl;
    }

    public final android.os.WorkSource zzc()
    {
        return this.zzm;
    }

    public final com.google.android.gms.internal.location.zze zzd()
    {
        return this.zzn;
    }
}
