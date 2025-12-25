package com.google.android.gms.fido.fido2.api.common;
final class zzp implements android.os.Parcelable$Creator {

    public zzp()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p2)
    {
        try {
            return com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.fromCoseValue(p2.readInt());
        } catch (com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException v2_3) {
            throw new RuntimeException(v2_3);
        }
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier[] v1_1 = new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier[p1];
        return v1_1;
    }
}
