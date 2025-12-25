package com.google.android.gms.fido.u2f.api.common;
final class zzf implements android.os.Parcelable$Creator {

    public zzf()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p2)
    {
        try {
            return com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(p2.readString());
        } catch (com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException v2_3) {
            throw new RuntimeException(v2_3);
        }
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion[] v1_1 = new com.google.android.gms.fido.u2f.api.common.ProtocolVersion[p1];
        return v1_1;
    }
}
