package com.google.android.gms.auth.api.identity;
public final class zbo implements android.os.Parcelable$Creator {

    public zbo()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p6);
        boolean v1 = 0;
        while (p6.dataPosition() < v0) {
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p6);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_0) == 1) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p6, v2_0);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p6, v2_0);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p6, v0);
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions(v1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions[] v1_1 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions[p1];
        return v1_1;
    }
}
