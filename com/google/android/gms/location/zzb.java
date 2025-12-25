package com.google.android.gms.location;
public final class zzb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final long zza;
    private final boolean zzb;
    private final android.os.WorkSource zzc;
    private final String zzd;
    private final int[] zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private String zzi;

    static zzb()
    {
        com.google.android.gms.location.zzb.CREATOR = new com.google.android.gms.location.zzc();
        return;
    }

    public zzb(long p1, boolean p3, android.os.WorkSource p4, String p5, int[] p6, boolean p7, String p8, long p9, String p11)
    {
        this.zza = p1;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        this.zzf = p7;
        this.zzg = p8;
        this.zzh = p9;
        this.zzi = p11;
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p5);
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.zzc, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 4, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(p5, 5, this.zze, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 7, this.zzg, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 9, this.zzi, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final com.google.android.gms.location.zzb zza(String p1)
    {
        this.zzi = p1;
        return this;
    }
}
