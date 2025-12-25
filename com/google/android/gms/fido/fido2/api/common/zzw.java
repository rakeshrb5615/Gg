package com.google.android.gms.fido.fido2.api.common;
final class zzw implements android.os.Parcelable$Creator {

    public zzw()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p2)
    {
        try {
            return com.google.android.gms.fido.fido2.api.common.ErrorCode.toErrorCode(p2.readInt());
        } catch (com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException v2_3) {
            throw new IllegalArgumentException(v2_3);
        }
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.ErrorCode[] v1_1 = new com.google.android.gms.fido.fido2.api.common.ErrorCode[p1];
        return v1_1;
    }
}
