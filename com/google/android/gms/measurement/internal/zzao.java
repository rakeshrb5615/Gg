package com.google.android.gms.measurement.internal;
public final class zzao extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final android.os.Bundle zza;

    static zzao()
    {
        com.google.android.gms.measurement.internal.zzao.CREATOR = new com.google.android.gms.measurement.internal.zzap();
        return;
    }

    public zzao(android.os.Bundle p1)
    {
        this.zza = p1;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(p4, 1, p5, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
