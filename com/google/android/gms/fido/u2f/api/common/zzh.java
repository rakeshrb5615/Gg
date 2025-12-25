package com.google.android.gms.fido.u2f.api.common;
public final class zzh implements android.os.Parcelable$Creator {

    public zzh()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p11)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
        Integer v3 = 0;
        Double v4 = 0;
        android.net.Uri v5_1 = 0;
        java.util.ArrayList v6 = 0;
        java.util.ArrayList v7 = 0;
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue v8_1 = 0;
        String v9 = 0;
        while (p11.dataPosition() < v0) {
            android.os.Parcelable v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1)) {
                case 2:
                    v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(p11, v1_1);
                    break;
                case 3:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(p11, v1_1);
                    break;
                case 4:
                    v5_1 = ((android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p11, v1_1, android.net.Uri.CREATOR));
                    break;
                case 5:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p11, v1_1, com.google.android.gms.fido.u2f.api.common.RegisterRequest.CREATOR);
                    break;
                case 6:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p11, v1_1, com.google.android.gms.fido.u2f.api.common.RegisteredKey.CREATOR);
                    break;
                case 7:
                    v8_1 = ((com.google.android.gms.fido.u2f.api.common.ChannelIdValue) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p11, v1_1, com.google.android.gms.fido.u2f.api.common.ChannelIdValue.CREATOR));
                    break;
                case 8:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0);
        return new com.google.android.gms.fido.u2f.api.common.RegisterRequestParams(v3, v4, v5_1, v6, v7, v8_1, v9);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.u2f.api.common.RegisterRequestParams[] v1_1 = new com.google.android.gms.fido.u2f.api.common.RegisterRequestParams[p1];
        return v1_1;
    }
}
