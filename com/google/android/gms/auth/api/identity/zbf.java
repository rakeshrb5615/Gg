package com.google.android.gms.auth.api.identity;
public final class zbf implements android.os.Parcelable$Creator {

    public zbf()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p12)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p12);
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions v4_0 = 0;
        com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions v5_1 = 0;
        String v6 = 0;
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions v9_1 = 0;
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions v10_1 = 0;
        boolean v7 = 0;
        int v8 = 0;
        while (p12.dataPosition() < v0) {
            android.os.Parcelable v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p12);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1)) {
                case 1:
                    v4_0 = ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions.CREATOR));
                    break;
                case 2:
                    v5_1 = ((com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions.CREATOR));
                    break;
                case 3:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
                case 4:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p12, v1_1);
                    break;
                case 5:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p12, v1_1);
                    break;
                case 6:
                    v9_1 = ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions.CREATOR));
                    break;
                case 7:
                    v10_1 = ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions.CREATOR));
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p12, v1_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p12, v0);
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest(v4_0, v5_1, v6, v7, v8, v9_1, v10_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.identity.BeginSignInRequest[] v1_1 = new com.google.android.gms.auth.api.identity.BeginSignInRequest[p1];
        return v1_1;
    }
}
