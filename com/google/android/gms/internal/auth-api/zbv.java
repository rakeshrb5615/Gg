package com.google.android.gms.internal.auth-api;
public final class zbv implements android.os.Parcelable$Creator {

    public zbv()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p6);
        com.google.android.gms.auth.api.credentials.Credential v1_2 = 0;
        while (p6.dataPosition() < v0) {
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p6);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_0) == 1) {
                v1_2 = ((com.google.android.gms.auth.api.credentials.Credential) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p6, v2_0, com.google.android.gms.auth.api.credentials.Credential.CREATOR));
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p6, v2_0);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p6, v0);
        return new com.google.android.gms.internal.auth-api.zbu(v1_2);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.auth-api.zbu[] v1_1 = new com.google.android.gms.internal.auth-api.zbu[p1];
        return v1_1;
    }
}
