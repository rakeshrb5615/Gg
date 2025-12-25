package com.google.android.gms.fido.fido2.api.common;
public final class zzak implements android.os.Parcelable$Creator {

    public zzak()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p15)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p15);
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity v3_0 = 0;
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity v4_0 = 0;
        byte[] v5 = 0;
        java.util.ArrayList v6 = 0;
        Double v7 = 0;
        java.util.ArrayList v8 = 0;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria v9_1 = 0;
        Integer v10 = 0;
        com.google.android.gms.fido.fido2.api.common.TokenBinding v11_0 = 0;
        String v12 = 0;
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions v13_0 = 0;
        while (p15.dataPosition() < v0) {
            android.os.Parcelable v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p15);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2)) {
                case 2:
                    v3_0 = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p15, v1_2, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity.CREATOR));
                    break;
                case 3:
                    v4_0 = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p15, v1_2, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity.CREATOR));
                    break;
                case 4:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p15, v1_2);
                    break;
                case 5:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p15, v1_2, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(p15, v1_2);
                    break;
                case 7:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p15, v1_2, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    v9_1 = ((com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p15, v1_2, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.CREATOR));
                    break;
                case 9:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(p15, v1_2);
                    break;
                case 10:
                    v11_0 = ((com.google.android.gms.fido.fido2.api.common.TokenBinding) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p15, v1_2, com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR));
                    break;
                case 11:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p15, v1_2);
                    break;
                case 12:
                    v13_0 = ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p15, v1_2, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR));
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p15, v1_2);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p15, v0);
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions(v3_0, v4_0, v5, v6, v7, v8, v9_1, v10, v11_0, v12, v13_0);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions[] v1_1 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions[p1];
        return v1_1;
    }
}
