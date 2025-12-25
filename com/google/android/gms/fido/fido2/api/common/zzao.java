package com.google.android.gms.fido.fido2.api.common;
public final class zzao implements android.os.Parcelable$Creator {

    public zzao()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p13)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p13);
        byte[] v3 = 0;
        Double v4 = 0;
        String v5 = 0;
        java.util.ArrayList v6 = 0;
        Integer v7 = 0;
        com.google.android.gms.fido.fido2.api.common.TokenBinding v8_1 = 0;
        String v9 = 0;
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions v10_0 = 0;
        Long v11 = 0;
        while (p13.dataPosition() < v0) {
            android.os.Parcelable v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p13);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2)) {
                case 2:
                    v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p13, v1_2);
                    break;
                case 3:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(p13, v1_2);
                    break;
                case 4:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 5:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p13, v1_2, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(p13, v1_2);
                    break;
                case 7:
                    v8_1 = ((com.google.android.gms.fido.fido2.api.common.TokenBinding) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p13, v1_2, com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR));
                    break;
                case 8:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 9:
                    v10_0 = ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p13, v1_2, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR));
                    break;
                case 10:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(p13, v1_2);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p13, v1_2);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p13, v0);
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions(v3, v4, v5, v6, v7, v8_1, v9, v10_0, v11);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions[] v1_1 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions[p1];
        return v1_1;
    }
}
