package com.google.android.gms.common.server.converter;
public final class zac extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    final String zab;
    final int zac;

    static zac()
    {
        com.google.android.gms.common.server.converter.zac.CREATOR = new com.google.android.gms.common.server.converter.zae();
        return;
    }

    public zac(int p1, String p2, int p3)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public zac(String p2, int p3)
    {
        this.zaa = 1;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v5_0 = this.zaa;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, v5_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zab, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 3, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
