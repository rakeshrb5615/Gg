package com.google.android.gms.signin.internal;
public final class zaa extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zaa;
    private int zab;
    private android.content.Intent zac;

    static zaa()
    {
        com.google.android.gms.signin.internal.zaa.CREATOR = new com.google.android.gms.signin.internal.zab();
        return;
    }

    public zaa()
    {
        this(2, 0, 0);
        return;
    }

    public zaa(int p1, int p2, android.content.Intent p3)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        return;
    }

    public final com.google.android.gms.common.api.Status getStatus()
    {
        if (this.zab != 0) {
            return com.google.android.gms.common.api.Status.RESULT_CANCELED;
        } else {
            return com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
    }

    public final void writeToParcel(android.os.Parcel p5, int p6)
    {
        android.content.Intent v0_0 = this.zaa;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 2, this.zab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.zac, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }
}
