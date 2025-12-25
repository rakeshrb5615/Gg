package com.google.android.gms.measurement.internal;
public final class zzaf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final long zza;
    public final int zzb;
    public final long zzc;

    static zzaf()
    {
        com.google.android.gms.measurement.internal.zzaf.CREATOR = new com.google.android.gms.measurement.internal.zzag();
        return;
    }

    public zzaf(long p1, int p3, long p4)
    {
        this.zza = p1;
        this.zzb = p3;
        this.zzc = p4;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v0_0 = this.zza;
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
