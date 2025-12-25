package com.google.android.gms.common.server.converter;
public final class zad implements android.os.Parcelable$Creator {

    public zad()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p7)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p7);
        java.util.ArrayList v1_0 = 0;
        int v2 = 0;
        while (p7.dataPosition() < v0) {
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p7);
            int v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0);
            if (v4 == 1) {
                v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p7, v3_0);
            } else {
                if (v4 == 2) {
                    v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p7, v3_0, com.google.android.gms.common.server.converter.zac.CREATOR);
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p7, v3_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p7, v0);
        return new com.google.android.gms.common.server.converter.StringToIntConverter(v2, v1_0);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.server.converter.StringToIntConverter[] v1_1 = new com.google.android.gms.common.server.converter.StringToIntConverter[p1];
        return v1_1;
    }
}
