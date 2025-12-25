package com.google.android.gms.common.internal;
public final class zzai extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;

    static zzai()
    {
        com.google.android.gms.common.internal.zzai.CREATOR = new com.google.android.gms.common.internal.zzaj();
        return;
    }

    public zzai(int p1)
    {
        this.zza = p1;
        return;
    }

    public final void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 1, p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, v0);
        return;
    }
}
