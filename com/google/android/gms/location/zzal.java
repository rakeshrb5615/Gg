package com.google.android.gms.location;
public final class zzal extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    static zzal()
    {
        com.google.android.gms.location.zzal.CREATOR = new com.google.android.gms.location.zzam();
        return;
    }

    public zzal(int p1, int p2, long p3, long p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p5;
        return;
    }

    public final boolean equals(Object p7)
    {
        if ((!(p7 instanceof com.google.android.gms.location.zzal)) || ((this.zza != ((com.google.android.gms.location.zzal) p7).zza) || ((this.zzb != ((com.google.android.gms.location.zzal) p7).zzb) || ((this.zzc != ((com.google.android.gms.location.zzal) p7).zzc) || (this.zzd != ((com.google.android.gms.location.zzal) p7).zzd))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(this.zzb), Integer.valueOf(this.zza), Long.valueOf(this.zzd), Long.valueOf(this.zzc)}));
    }

    public final String toString()
    {
        String v0_0 = this.zza;
        int v2 = this.zzb;
        long v4 = this.zzd;
        long v7 = this.zzc;
        StringBuilder v3_1 = new StringBuilder(((((((String.valueOf(v0_0).length() + 50) + String.valueOf(v2).length()) + 18) + String.valueOf(v4).length()) + 17) + String.valueOf(v7).length()));
        v3_1.append("NetworkLocationStatus: Wifi status: ");
        v3_1.append(v0_0);
        v3_1.append(" Cell status: ");
        v3_1.append(v2);
        v3_1.append(" elapsed time NS: ");
        v3_1.append(v4);
        v3_1.append(" system time ms: ");
        v3_1.append(v7);
        return v3_1.toString();
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v5_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, v5_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
