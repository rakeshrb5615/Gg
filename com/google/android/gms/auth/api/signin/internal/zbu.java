package com.google.android.gms.auth.api.signin.internal;
public final class zbu implements android.os.Parcelable$Creator {

    public zbu()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p7)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p7);
        String v1 = 0;
        com.google.android.gms.auth.api.signin.GoogleSignInOptions v2_2 = 0;
        while (p7.dataPosition() < v0) {
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p7);
            int v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0);
            if (v4 == 2) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p7, v3_0);
            } else {
                if (v4 == 5) {
                    v2_2 = ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p7, v3_0, com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR));
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p7, v3_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p7, v0);
        return new com.google.android.gms.auth.api.signin.internal.SignInConfiguration(v1, v2_2);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.signin.internal.SignInConfiguration[] v1_1 = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration[p1];
        return v1_1;
    }
}
