package com.google.android.gms.location;
public final class LastLocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final long zza;
    private final int zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.location.zze zzd;

    static LastLocationRequest()
    {
        com.google.android.gms.location.LastLocationRequest.CREATOR = new com.google.android.gms.location.zzaa();
        return;
    }

    public LastLocationRequest(long p1, int p3, boolean p4, com.google.android.gms.internal.location.zze p5)
    {
        this.zza = p1;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        return;
    }

    public boolean equals(Object p7)
    {
        if ((p7 instanceof com.google.android.gms.location.LastLocationRequest)) {
            if ((this.zza != ((com.google.android.gms.location.LastLocationRequest) p7).zza) || ((this.zzb != ((com.google.android.gms.location.LastLocationRequest) p7).zzb) || ((this.zzc != ((com.google.android.gms.location.LastLocationRequest) p7).zzc) || (!com.google.android.gms.common.internal.Objects.equal(this.zzd, ((com.google.android.gms.location.LastLocationRequest) p7).zzd))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public int getGranularity()
    {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis()
    {
        return this.zza;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc)}));
    }

    public String toString()
    {
        String v0_1 = u.e.b("LastLocationRequest[");
        if (this.zza != 9223372036854775807) {
            v0_1.append("maxAge=");
            com.google.android.gms.internal.location.zzeo.zzc(this.zza, v0_1);
        }
        if (this.zzb != 0) {
            v0_1.append(", ");
            v0_1.append(com.google.android.gms.location.zzq.zzb(this.zzb));
        }
        if (this.zzc) {
            v0_1.append(", bypass");
        }
        if (this.zzd != null) {
            v0_1.append(", impersonation=");
            v0_1.append(this.zzd);
        }
        v0_1.append(93);
        return v0_1.toString();
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 1, this.getMaxUpdateAgeMillis());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 2, this.getGranularity());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 5, this.zzd, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final boolean zza()
    {
        return this.zzc;
    }

    public final com.google.android.gms.internal.location.zze zzb()
    {
        return this.zzd;
    }
}
