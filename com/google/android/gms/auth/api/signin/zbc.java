package com.google.android.gms.auth.api.signin;
public final class zbc implements android.os.Parcelable$Creator {

    public zbc()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        String v1 = "";
        com.google.android.gms.auth.api.signin.GoogleSignInAccount v3_2 = 0;
        String v2_1 = "";
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 4) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p8, v4_0);
            } else {
                if (v5 == 7) {
                    v3_2 = ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p8, v4_0, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR));
                } else {
                    if (v5 == 8) {
                        v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p8, v4_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.auth.api.signin.SignInAccount(v1, v3_2, v2_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.signin.SignInAccount[] v1_1 = new com.google.android.gms.auth.api.signin.SignInAccount[p1];
        return v1_1;
    }
}
