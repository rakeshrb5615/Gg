package com.google.android.gms.measurement.internal;
public final class zzoq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final java.util.List zza;

    static zzoq()
    {
        com.google.android.gms.measurement.internal.zzoq.CREATOR = new com.google.android.gms.measurement.internal.zzor();
        return;
    }

    public zzoq(java.util.List p1)
    {
        this.zza = p1;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 1, p5, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
