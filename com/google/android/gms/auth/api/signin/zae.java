package com.google.android.gms.auth.api.signin;
public final class zae implements android.os.Parcelable$Creator {

    public zae()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p15)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p15);
        java.util.ArrayList v5 = 0;
        android.accounts.Account v6_1 = 0;
        String v10 = 0;
        String v11 = 0;
        java.util.ArrayList v12 = 0;
        String v13 = 0;
        int v4 = 0;
        boolean v7 = 0;
        boolean v8 = 0;
        boolean v9 = 0;
        while (p15.dataPosition() < v0) {
            android.os.Parcelable v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p15);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2)) {
                case 1:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p15, v1_2);
                    break;
                case 2:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p15, v1_2, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 3:
                    v6_1 = ((android.accounts.Account) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p15, v1_2, android.accounts.Account.CREATOR));
                    break;
                case 4:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p15, v1_2);
                    break;
                case 5:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p15, v1_2);
                    break;
                case 6:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p15, v1_2);
                    break;
                case 7:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p15, v1_2);
                    break;
                case 8:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p15, v1_2);
                    break;
                case 9:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p15, v1_2, com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p15, v1_2);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p15, v1_2);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p15, v0);
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(v4, v5, v6_1, v7, v8, v9, v10, v11, v12, v13);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions[] v1_1 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions[p1];
        return v1_1;
    }
}
