package com.google.android.gms.measurement.internal;
public final class zzah extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public String zza;
    public String zzb;
    public com.google.android.gms.measurement.internal.zzpl zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public final com.google.android.gms.measurement.internal.zzbg zzg;
    public long zzh;
    public com.google.android.gms.measurement.internal.zzbg zzi;
    public final long zzj;
    public final com.google.android.gms.measurement.internal.zzbg zzk;

    static zzah()
    {
        com.google.android.gms.measurement.internal.zzah.CREATOR = new com.google.android.gms.measurement.internal.zzai();
        return;
    }

    public zzah(com.google.android.gms.measurement.internal.zzah p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        this.zza = p3.zza;
        this.zzb = p3.zzb;
        this.zzc = p3.zzc;
        this.zzd = p3.zzd;
        this.zze = p3.zze;
        this.zzf = p3.zzf;
        this.zzg = p3.zzg;
        this.zzh = p3.zzh;
        this.zzi = p3.zzi;
        this.zzj = p3.zzj;
        this.zzk = p3.zzk;
        return;
    }

    public zzah(String p1, String p2, com.google.android.gms.measurement.internal.zzpl p3, long p4, boolean p6, String p7, com.google.android.gms.measurement.internal.zzbg p8, long p9, com.google.android.gms.measurement.internal.zzbg p11, long p12, com.google.android.gms.measurement.internal.zzbg p14)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p6;
        this.zzf = p7;
        this.zzg = p8;
        this.zzh = p9;
        this.zzi = p11;
        this.zzj = p12;
        this.zzk = p14;
        return;
    }

    public final void writeToParcel(android.os.Parcel p7, int p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p7);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p7, 2, this.zza, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p7, 3, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p7, 4, this.zzc, p8, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p7, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p7, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p7, 7, this.zzf, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p7, 8, this.zzg, p8, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p7, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p7, 10, this.zzi, p8, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p7, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p7, 12, this.zzk, p8, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p7, v0);
        return;
    }
}
