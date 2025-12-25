package com.google.android.gms.location;
public final class CurrentLocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final boolean zze;
    private final int zzf;
    private final android.os.WorkSource zzg;
    private final com.google.android.gms.internal.location.zze zzh;

    static CurrentLocationRequest()
    {
        com.google.android.gms.location.CurrentLocationRequest.CREATOR = new com.google.android.gms.location.zzj();
        return;
    }

    public CurrentLocationRequest(long p1, int p3, int p4, long p5, boolean p7, int p8, android.os.WorkSource p9, com.google.android.gms.internal.location.zze p10)
    {
        this.zza = p1;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p7;
        this.zzf = p8;
        this.zzg = p9;
        this.zzh = p10;
        return;
    }

    public boolean equals(Object p7)
    {
        if ((p7 instanceof com.google.android.gms.location.CurrentLocationRequest)) {
            if ((this.zza != ((com.google.android.gms.location.CurrentLocationRequest) p7).zza) || ((this.zzb != ((com.google.android.gms.location.CurrentLocationRequest) p7).zzb) || ((this.zzc != ((com.google.android.gms.location.CurrentLocationRequest) p7).zzc) || ((this.zzd != ((com.google.android.gms.location.CurrentLocationRequest) p7).zzd) || ((this.zze != ((com.google.android.gms.location.CurrentLocationRequest) p7).zze) || ((this.zzf != ((com.google.android.gms.location.CurrentLocationRequest) p7).zzf) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzg, ((com.google.android.gms.location.CurrentLocationRequest) p7).zzg)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzh, ((com.google.android.gms.location.CurrentLocationRequest) p7).zzh))))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public long getDurationMillis()
    {
        return this.zzd;
    }

    public int getGranularity()
    {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis()
    {
        return this.zza;
    }

    public int getPriority()
    {
        return this.zzc;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Long.valueOf(this.zzd)}));
    }

    public String toString()
    {
        String v0_1 = u.e.b("CurrentLocationRequest[");
        v0_1.append(com.google.android.gms.location.zzan.zzb(this.zzc));
        if (this.zza != 9223372036854775807) {
            v0_1.append(", maxAge=");
            com.google.android.gms.internal.location.zzeo.zzc(this.zza, v0_1);
        }
        if (this.zzd != 9223372036854775807) {
            v0_1.append(", duration=");
            v0_1.append(this.zzd);
            v0_1.append("ms");
        }
        if (this.zzb != 0) {
            v0_1.append(", ");
            v0_1.append(com.google.android.gms.location.zzq.zzb(this.zzb));
        }
        if (this.zze) {
            v0_1.append(", bypass");
        }
        if (this.zzf != 0) {
            v0_1.append(", ");
            v0_1.append(com.google.android.gms.location.zzar.zzb(this.zzf));
        }
        if (!com.google.android.gms.common.util.WorkSourceUtil.isEmpty(this.zzg)) {
            v0_1.append(", workSource=");
            v0_1.append(this.zzg);
        }
        if (this.zzh != null) {
            v0_1.append(", impersonation=");
            v0_1.append(this.zzh);
        }
        v0_1.append(93);
        return v0_1.toString();
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 1, this.getMaxUpdateAgeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 2, this.getGranularity());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 3, this.getPriority());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 4, this.getDurationMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 6, this.zzg, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 7, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 9, this.zzh, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final boolean zza()
    {
        return this.zze;
    }

    public final int zzb()
    {
        return this.zzf;
    }

    public final android.os.WorkSource zzc()
    {
        return this.zzg;
    }

    public final com.google.android.gms.internal.location.zze zzd()
    {
        return this.zzh;
    }
}
