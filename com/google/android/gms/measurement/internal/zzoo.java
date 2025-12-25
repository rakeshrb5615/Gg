package com.google.android.gms.measurement.internal;
public final class zzoo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public final java.util.List zza;

    static zzoo()
    {
        com.google.android.gms.measurement.internal.zzoo.CREATOR = new com.google.android.gms.measurement.internal.zzop();
        return;
    }

    public zzoo(java.util.List p1)
    {
        this.zza = p1;
        return;
    }

    public static varargs com.google.android.gms.measurement.internal.zzoo zza(com.google.android.gms.measurement.internal.zzls[] p2)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(1);
        v0_1.add(Integer.valueOf(p2[0].zza()));
        return new com.google.android.gms.measurement.internal.zzoo(v0_1);
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerList(p4, 1, p5, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
