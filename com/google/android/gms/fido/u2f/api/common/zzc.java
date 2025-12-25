package com.google.android.gms.fido.u2f.api.common;
final class zzc implements android.os.Parcelable$Creator {

    public zzc()
    {
        return;
    }

    public final synthetic Object createFromParcel(android.os.Parcel p1)
    {
        return com.google.android.gms.fido.u2f.api.common.ErrorCode.toErrorCode(p1.readInt());
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.u2f.api.common.ErrorCode[] v1_1 = new com.google.android.gms.fido.u2f.api.common.ErrorCode[p1];
        return v1_1;
    }
}
