package com.google.android.gms.signin.internal;
public final class zab implements android.os.Parcelable$Creator {

    public zab()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        android.content.Intent v1_0 = 0;
        int v2 = 0;
        int v3 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 1) {
                v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p8, v4_0);
            } else {
                if (v5 == 2) {
                    v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p8, v4_0);
                } else {
                    if (v5 == 3) {
                        v1_0 = ((android.content.Intent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p8, v4_0, android.content.Intent.CREATOR));
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.signin.internal.zaa(v2, v3, v1_0);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.signin.internal.zaa[] v1_1 = new com.google.android.gms.signin.internal.zaa[p1];
        return v1_1;
    }
}
