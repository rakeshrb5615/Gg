package com.google.android.gms.common.server.response;
public final class zao implements android.os.Parcelable$Creator {

    public zao()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        java.util.ArrayList v1_0 = 0;
        int v3 = 0;
        String v2_0 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 1) {
                v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p8, v4_0);
            } else {
                if (v5 == 2) {
                    v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p8, v4_0, com.google.android.gms.common.server.response.zal.CREATOR);
                } else {
                    if (v5 == 3) {
                        v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p8, v4_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.common.server.response.zan(v3, v1_0, v2_0);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.server.response.zan[] v1_1 = new com.google.android.gms.common.server.response.zan[p1];
        return v1_1;
    }
}
