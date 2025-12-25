package com.google.android.gms.common;
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final boolean zza;
    private final String zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    static zzr()
    {
        com.google.android.gms.common.zzr.CREATOR = new com.google.android.gms.common.zzs();
        return;
    }

    public zzr(boolean p1, String p2, int p3, int p4, long p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = (com.google.android.gms.common.zzz.zza(p3) - 1);
        this.zzd = (com.google.android.gms.common.zzc.zza(p4) - 1);
        this.zze = p5;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final boolean zza()
    {
        return this.zza;
    }

    public final String zzb()
    {
        return this.zzb;
    }

    public final long zzc()
    {
        return this.zze;
    }

    public final int zzd()
    {
        return com.google.android.gms.common.zzz.zza(this.zzc);
    }

    public final int zze()
    {
        return com.google.android.gms.common.zzc.zza(this.zzd);
    }
}
