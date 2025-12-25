package com.google.android.gms.measurement.internal;
public final class zzom extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final long zza;
    public byte[] zzb;
    public final String zzc;
    public final android.os.Bundle zzd;
    public final int zze;
    public final long zzf;
    public String zzg;

    static zzom()
    {
        com.google.android.gms.measurement.internal.zzom.CREATOR = new com.google.android.gms.measurement.internal.zzon();
        return;
    }

    public zzom(long p1, byte[] p3, String p4, android.os.Bundle p5, int p6, long p7, String p9)
    {
        this.zza = p1;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        this.zzf = p7;
        this.zzg = p9;
        return;
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        int v0_0 = this.zza;
        p7 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p6, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 3, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p6, 4, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p6, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 7, this.zzg, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, p7);
        return;
    }
}
