package com.google.android.gms.fido.fido2.api.common;
public final class zzj implements android.os.Parcelable$Creator {

    public zzj()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p10)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p10);
        byte[] v3 = 0;
        byte[] v4 = 0;
        byte[] v5 = 0;
        byte[] v6 = 0;
        byte[] v7 = 0;
        while (p10.dataPosition() < v0) {
            int v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p10);
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse v2_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_0);
            if (v2_2 == 2) {
                v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p10, v1_0);
            } else {
                if (v2_2 == 3) {
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p10, v1_0);
                } else {
                    if (v2_2 == 4) {
                        v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p10, v1_0);
                    } else {
                        if (v2_2 == 5) {
                            v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p10, v1_0);
                        } else {
                            if (v2_2 == 6) {
                                v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p10, v1_0);
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p10, v1_0);
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p10, v0);
        return new com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse(v3, v4, v5, v6, v7);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse[] v1_1 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse[p1];
        return v1_1;
    }
}
