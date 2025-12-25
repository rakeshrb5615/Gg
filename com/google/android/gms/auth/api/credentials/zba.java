package com.google.android.gms.auth.api.credentials;
public final class zba implements android.os.Parcelable$Creator {

    public zba()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p12)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p12);
        String v3 = 0;
        String v4 = 0;
        android.net.Uri v5_1 = 0;
        java.util.ArrayList v6 = 0;
        String v7 = 0;
        String v8 = 0;
        String v9 = 0;
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
                    v5_1 = ((android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, android.net.Uri.CREATOR));
                    break;
                case 4:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p12, v1_1, com.google.android.gms.auth.api.credentials.IdToken.CREATOR);
                    break;
                case 5:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
                case 6:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
                case 7:
                case 8:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p12, v1_1);
                    break;
                case 9:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
                case 10:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p12, v1_1);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p12, v0);
        return new com.google.android.gms.auth.api.credentials.Credential(v3, v4, v5_1, v6, v7, v8, v9, v10);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.credentials.Credential[] v1_1 = new com.google.android.gms.auth.api.credentials.Credential[p1];
        return v1_1;
    }
}
