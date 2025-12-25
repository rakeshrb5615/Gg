package com.google.android.gms.signin.internal;
public final class zak extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    private final com.google.android.gms.common.ConnectionResult zab;
    private final com.google.android.gms.common.internal.zav zac;

    static zak()
    {
        com.google.android.gms.signin.internal.zak.CREATOR = new com.google.android.gms.signin.internal.zal();
        return;
    }

    public zak(int p1, com.google.android.gms.common.ConnectionResult p2, com.google.android.gms.common.internal.zav p3)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.zab, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.zac, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final com.google.android.gms.common.ConnectionResult zaa()
    {
        return this.zab;
    }

    public final com.google.android.gms.common.internal.zav zab()
    {
        return this.zac;
    }
}
