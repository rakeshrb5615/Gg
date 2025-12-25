package com.google.android.gms.measurement.internal;
public final class zzbf implements android.os.Parcelable$Creator {

    public zzbf()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p6);
        android.os.Bundle v1 = 0;
        while (p6.dataPosition() < v0) {
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p6);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_0) == 2) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p6, v2_0);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p6, v2_0);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p6, v0);
        return new com.google.android.gms.measurement.internal.zzbe(v1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.measurement.internal.zzbe[] v1_1 = new com.google.android.gms.measurement.internal.zzbe[p1];
        return v1_1;
    }
}
