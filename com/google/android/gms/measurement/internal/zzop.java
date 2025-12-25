package com.google.android.gms.measurement.internal;
public final class zzop implements android.os.Parcelable$Creator {

    public zzop()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p6);
        java.util.ArrayList v1 = 0;
        while (p6.dataPosition() < v0) {
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p6);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_0) == 1) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntegerList(p6, v2_0);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p6, v2_0);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p6, v0);
        return new com.google.android.gms.measurement.internal.zzoo(v1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.measurement.internal.zzoo[] v1_1 = new com.google.android.gms.measurement.internal.zzoo[p1];
        return v1_1;
    }
}
