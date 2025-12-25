package com.google.android.gms.measurement.internal;
public final class zzoh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final String zza;
    public final long zzb;
    public final int zzc;

    static zzoh()
    {
        com.google.android.gms.measurement.internal.zzoh.CREATOR = new com.google.android.gms.measurement.internal.zzoi();
        return;
    }

    public zzoh(String p1, long p2, int p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p4;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v5_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 1, v5_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
