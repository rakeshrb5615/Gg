package com.google.android.gms.fido.fido2.api.common;
public final class zzal implements android.os.Parcelable$Creator {

    public zzal()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p12)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p12);
        String v3 = 0;
        String v4 = 0;
        byte[] v5 = 0;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse v6_1 = 0;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse v7_1 = 0;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse v8_1 = 0;
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs v9_1 = 0;
        String v10 = 0;
        while (p12.dataPosition() < v0) {
            android.os.Parcelable v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p12);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1)) {
                case 1:
                    v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
                case 2:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
                case 3:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p12, v1_1);
                    break;
                case 4:
                    v6_1 = ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.CREATOR));
                    break;
                case 5:
                    v7_1 = ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse.CREATOR));
                    break;
                case 6:
                    v8_1 = ((com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse.CREATOR));
                    break;
                case 7:
                    v9_1 = ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.CREATOR));
                    break;
                case 8:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p12, v1_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p12, v0);
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential(v3, v4, v5, v6_1, v7_1, v8_1, v9_1, v10);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredential[] v1_1 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential[p1];
        return v1_1;
    }
}
