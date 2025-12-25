package com.google.android.gms.signin.internal;
public final class zag extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable$Creator CREATOR;
    private final java.util.List zaa;
    private final String zab;

    static zag()
    {
        com.google.android.gms.signin.internal.zag.CREATOR = new com.google.android.gms.signin.internal.zah();
        return;
    }

    public zag(java.util.List p1, String p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public final com.google.android.gms.common.api.Status getStatus()
    {
        if (this.zab == null) {
            return com.google.android.gms.common.api.Status.RESULT_CANCELED;
        } else {
            return com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        }
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        int v5_0 = this.zaa;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p4, 1, v5_0, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zab, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
