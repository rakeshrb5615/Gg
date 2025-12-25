package com.google.android.gms.common.server.response;
public final class zam extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    final String zab;
    final com.google.android.gms.common.server.response.FastJsonResponse$Field zac;

    static zam()
    {
        com.google.android.gms.common.server.response.zam.CREATOR = new com.google.android.gms.common.server.response.zak();
        return;
    }

    public zam(int p1, String p2, com.google.android.gms.common.server.response.FastJsonResponse$Field p3)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public zam(String p2, com.google.android.gms.common.server.response.FastJsonResponse$Field p3)
    {
        this.zaa = 1;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0_0 = this.zaa;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.zab, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.zac, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }
}
