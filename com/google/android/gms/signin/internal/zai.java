package com.google.android.gms.signin.internal;
public final class zai extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    final com.google.android.gms.common.internal.zat zab;

    static zai()
    {
        com.google.android.gms.signin.internal.zai.CREATOR = new com.google.android.gms.signin.internal.zaj();
        return;
    }

    public zai(int p1, com.google.android.gms.common.internal.zat p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.zab, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
