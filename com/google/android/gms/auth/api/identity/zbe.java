package com.google.android.gms.auth.api.identity;
public final class zbe implements android.os.Parcelable$Creator {

    public zbe()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p10)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p10);
        String v3 = 0;
        String v4 = 0;
        String v5 = 0;
        java.util.ArrayList v6 = 0;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount v7_1 = 0;
        android.app.PendingIntent v8_1 = 0;
        while (p10.dataPosition() < v0) {
            android.os.Parcelable v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p10);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1)) {
                case 1:
                    v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p10, v1_1);
                    break;
                case 2:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p10, v1_1);
                    break;
                case 3:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p10, v1_1);
                    break;
                case 4:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(p10, v1_1);
                    break;
                case 5:
                    v7_1 = ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p10, v1_1, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR));
                    break;
                case 6:
                    v8_1 = ((android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p10, v1_1, android.app.PendingIntent.CREATOR));
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p10, v1_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p10, v0);
        return new com.google.android.gms.auth.api.identity.AuthorizationResult(v3, v4, v5, v6, v7_1, v8_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.identity.AuthorizationResult[] v1_1 = new com.google.android.gms.auth.api.identity.AuthorizationResult[p1];
        return v1_1;
    }
}
