package com.google.android.gms.common.internal;
public final class zzj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    android.os.Bundle zza;
    com.google.android.gms.common.Feature[] zzb;
    int zzc;
    com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zzd;

    static zzj()
    {
        com.google.android.gms.common.internal.zzj.CREATOR = new com.google.android.gms.common.internal.zzk();
        return;
    }

    public zzj()
    {
        return;
    }

    public zzj(android.os.Bundle p1, com.google.android.gms.common.Feature[] p2, int p3, com.google.android.gms.common.internal.ConnectionTelemetryConfiguration p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p5, 1, this.zza, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(p5, 2, this.zzb, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.zzd, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
