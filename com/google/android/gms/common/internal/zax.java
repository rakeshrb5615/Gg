package com.google.android.gms.common.internal;
public final class zax extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    private final int zab;
    private final int zac;
    private final com.google.android.gms.common.api.Scope[] zad;

    static zax()
    {
        com.google.android.gms.common.internal.zax.CREATOR = new com.google.android.gms.common.internal.zay();
        return;
    }

    public zax(int p1, int p2, int p3, com.google.android.gms.common.api.Scope[] p4)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        this.zad = p4;
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        com.google.android.gms.common.api.Scope[] v0_0 = this.zaa;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 2, this.zab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 3, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(p5, 4, this.zad, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }
}
