package com.google.android.gms.auth.api.identity;
public final class zbt implements android.os.Parcelable$Creator {

    public zbt()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p13)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p13);
        String v3 = 0;
        String v4 = 0;
        String v5 = 0;
        String v6 = 0;
        android.net.Uri v7_1 = 0;
        String v8 = 0;
        String v9 = 0;
        String v10 = 0;
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredential v11_0 = 0;
        while (p13.dataPosition() < v0) {
            android.os.Parcelable v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p13);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2)) {
                case 1:
                    v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 2:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 3:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 4:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 5:
                    v7_1 = ((android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p13, v1_2, android.net.Uri.CREATOR));
                    break;
                case 6:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 7:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 8:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                    break;
                case 9:
                    v11_0 = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p13, v1_2, com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.CREATOR));
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p13, v1_2);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p13, v0);
        return new com.google.android.gms.auth.api.identity.SignInCredential(v3, v4, v5, v6, v7_1, v8, v9, v10, v11_0);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.identity.SignInCredential[] v1_1 = new com.google.android.gms.auth.api.identity.SignInCredential[p1];
        return v1_1;
    }
}
