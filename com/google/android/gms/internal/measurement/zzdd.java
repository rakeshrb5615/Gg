package com.google.android.gms.internal.measurement;
public final class zzdd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final android.os.Bundle zzd;
    public final String zze;

    static zzdd()
    {
        com.google.android.gms.internal.measurement.zzdd.CREATOR = new com.google.android.gms.internal.measurement.zzde();
        return;
    }

    public zzdd(long p1, long p3, boolean p5, android.os.Bundle p6, String p7)
    {
        this.zza = p1;
        this.zzb = p3;
        this.zzc = p5;
        this.zzd = p6;
        this.zze = p7;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v0_0 = this.zza;
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p4, 7, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 8, this.zze, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
