package com.google.android.gms.auth.api.identity;
public final class zbd implements android.os.Parcelable$Creator {

    public zbd()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p13)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p13);
        boolean v6 = 0;
        boolean v7 = 0;
        boolean v11 = 0;
        java.util.ArrayList v4 = 0;
        String v5 = 0;
        android.accounts.Account v8_1 = 0;
        String v9 = 0;
        String v10 = 0;
        while (p13.dataPosition() < v0) {
            android.os.Parcelable v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p13);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2)) {
                case 1:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p13, v1_2, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 2:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 3:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p13, v1_2);
                    break;
                case 4:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p13, v1_2);
                    break;
                case 5:
                    v8_1 = ((android.accounts.Account) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p13, v1_2, android.accounts.Account.CREATOR));
                    break;
                case 6:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 7:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 8:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p13, v1_2);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p13, v1_2);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p13, v0);
        return new com.google.android.gms.auth.api.identity.AuthorizationRequest(v4, v5, v6, v7, v8_1, v9, v10, v11);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.identity.AuthorizationRequest[] v1_1 = new com.google.android.gms.auth.api.identity.AuthorizationRequest[p1];
        return v1_1;
    }
}
