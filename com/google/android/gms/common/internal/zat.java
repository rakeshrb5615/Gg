package com.google.android.gms.common.internal;
public final class zat extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    private final android.accounts.Account zab;
    private final int zac;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zad;

    static zat()
    {
        com.google.android.gms.common.internal.zat.CREATOR = new com.google.android.gms.common.internal.zau();
        return;
    }

    public zat(int p1, android.accounts.Account p2, int p3, com.google.android.gms.auth.api.signin.GoogleSignInAccount p4)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        this.zad = p4;
        return;
    }

    public zat(android.accounts.Account p2, int p3, com.google.android.gms.auth.api.signin.GoogleSignInAccount p4)
    {
        this(2, p2, p3, p4);
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0_0 = this.zaa;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.zab, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 3, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.zad, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }
}
