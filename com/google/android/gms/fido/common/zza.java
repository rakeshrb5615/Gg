package com.google.android.gms.fido.common;
final class zza implements android.os.Parcelable$Creator {

    public zza()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p2)
    {
        try {
            return com.google.android.gms.fido.common.Transport.fromString(p2.readString());
        } catch (com.google.android.gms.fido.common.Transport$UnsupportedTransportException v2_3) {
            throw new RuntimeException(v2_3);
        }
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.common.Transport[] v1_1 = new com.google.android.gms.fido.common.Transport[p1];
        return v1_1;
    }
}
