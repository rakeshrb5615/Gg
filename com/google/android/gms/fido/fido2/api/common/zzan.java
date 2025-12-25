package com.google.android.gms.fido.fido2.api.common;
public final class zzan implements android.os.Parcelable$Creator {

    public zzan()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p7)
    {
        int v0_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p7);
        String v1 = 0;
        Integer v2 = 0;
        while (p7.dataPosition() < v0_0) {
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p7);
            int v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0);
            if (v4 == 2) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p7, v3_0);
            } else {
                if (v4 == 3) {
                    v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(p7, v3_0);
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p7, v3_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p7, v0_0);
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters(v1, v2.intValue());
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters[] v1_1 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters[p1];
        return v1_1;
    }
}
