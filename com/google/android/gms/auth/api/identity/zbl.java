package com.google.android.gms.auth.api.identity;
public final class zbl implements android.os.Parcelable$Creator {

    public zbl()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p12)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p12);
        boolean v4 = 0;
        boolean v7 = 0;
        boolean v10 = 0;
        String v5 = 0;
        String v6 = 0;
        String v8 = 0;
        java.util.ArrayList v9 = 0;
        while (p12.dataPosition() < v0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p12);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1)) {
                case 1:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p12, v1_1);
                    break;
                case 2:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
                case 3:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
                case 4:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p12, v1_1);
                    break;
                case 5:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
                case 6:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(p12, v1_1);
                    break;
                case 7:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p12, v1_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p12, v1_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p12, v0);
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions(v4, v5, v6, v7, v8, v9, v10);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions[] v1_1 = new com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions[p1];
        return v1_1;
    }
}
