package com.google.android.gms.common.internal;
public final class zau implements android.os.Parcelable$Creator {

    public zau()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        android.accounts.Account v1_0 = 0;
        int v3 = 0;
        int v4 = 0;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount v2_3 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
            } else {
                if (v6 == 2) {
                    v1_0 = ((android.accounts.Account) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, android.accounts.Account.CREATOR));
                } else {
                    if (v6 == 3) {
                        v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
                    } else {
                        if (v6 == 4) {
                            v2_3 = ((com.google.android.gms.auth.api.signin.GoogleSignInAccount) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR));
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.common.internal.zat(v3, v1_0, v4, v2_3);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.internal.zat[] v1_1 = new com.google.android.gms.common.internal.zat[p1];
        return v1_1;
    }
}
