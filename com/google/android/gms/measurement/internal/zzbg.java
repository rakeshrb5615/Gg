package com.google.android.gms.measurement.internal;
public final class zzbg extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String zza;
    public final com.google.android.gms.measurement.internal.zzbe zzb;
    public final String zzc;
    public final long zzd;

    static zzbg()
    {
        com.google.android.gms.measurement.internal.zzbg.CREATOR = new com.google.android.gms.measurement.internal.zzbh();
        return;
    }

    public zzbg(com.google.android.gms.measurement.internal.zzbg p2, long p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        this.zza = p2.zza;
        this.zzb = p2.zzb;
        this.zzc = p2.zzc;
        this.zzd = p3;
        return;
    }

    public zzbg(String p1, com.google.android.gms.measurement.internal.zzbe p2, String p3, long p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public final String toString()
    {
        String v0_1 = String.valueOf(this.zzb);
        String v1_2 = this.zzc;
        String v3 = this.zza;
        StringBuilder v4_3 = new StringBuilder(((((String.valueOf(v1_2).length() + 13) + String.valueOf(v3).length()) + 8) + v0_1.length()));
        v4_3.append("origin=");
        v4_3.append(v1_2);
        v4_3.append(",name=");
        v4_3.append(v3);
        return v1.a.n(v4_3, ",params=", v0_1);
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        com.google.android.gms.measurement.internal.zzbh.zza(this, p1, p2);
        return;
    }
}
