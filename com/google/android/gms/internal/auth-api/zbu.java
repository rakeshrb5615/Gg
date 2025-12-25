package com.google.android.gms.internal.auth-api;
public final class zbu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.auth.api.credentials.Credential zba;

    static zbu()
    {
        com.google.android.gms.internal.auth-api.zbu.CREATOR = new com.google.android.gms.internal.auth-api.zbv();
        return;
    }

    public zbu(com.google.android.gms.auth.api.credentials.Credential p1)
    {
        this.zba = p1;
        return;
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.zba, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
