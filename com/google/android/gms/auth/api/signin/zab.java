package com.google.android.gms.auth.api.signin;
public final class zab implements android.os.Parcelable$Creator {

    public zab()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p21)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p21);
        String v8 = 0;
        String v9 = 0;
        String v10 = 0;
        String v11 = 0;
        android.net.Uri v12 = 0;
        String v13 = 0;
        String v16 = 0;
        java.util.ArrayList v17 = 0;
        String v18 = 0;
        String v19 = 0;
        long v14 = 0;
        int v7 = 0;
        while (p21.dataPosition() < v1) {
            String v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p21);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1)) {
                case 1:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p21, v2_1);
                    break;
                case 2:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p21, v2_1);
                    break;
                case 3:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p21, v2_1);
                    break;
                case 4:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p21, v2_1);
                    break;
                case 5:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p21, v2_1);
                    break;
                case 6:
                    v12 = ((android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p21, v2_1, android.net.Uri.CREATOR));
                    break;
                case 7:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p21, v2_1);
                    break;
                case 8:
                    v14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p21, v2_1);
                    break;
                case 9:
                    v16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p21, v2_1);
                    break;
                case 10:
                    v17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p21, v2_1, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 11:
                    v18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p21, v2_1);
                    break;
                case 12:
                    v19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p21, v2_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p21, v2_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p21, v1);
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(v7, v8, v9, v10, v11, v12, v13, v14, v16, v17, v18, v19);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount[] v1_1 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount[p1];
        return v1_1;
    }
}
