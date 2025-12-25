package com.google.android.gms.fido.fido2.api.common;
public final class zzk implements android.os.Parcelable$Creator {

    public zzk()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        byte[] v1 = 0;
        byte[] v2 = 0;
        byte[] v3 = 0;
        String[] v4 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 2) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p9, v5_0);
            } else {
                if (v6 == 3) {
                    v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p9, v5_0);
                } else {
                    if (v6 == 4) {
                        v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p9, v5_0);
                    } else {
                        if (v6 == 5) {
                            v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(p9, v5_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse(v1, v2, v3, v4);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse[] v1_1 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse[p1];
        return v1_1;
    }
}
