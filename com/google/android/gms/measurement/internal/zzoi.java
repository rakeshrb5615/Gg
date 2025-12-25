package com.google.android.gms.measurement.internal;
public final class zzoi implements android.os.Parcelable$Creator {

    public zzoi()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        int v1 = 0;
        long v2 = 0;
        String v4 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p9, v5_0);
            } else {
                if (v6 == 2) {
                    v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p9, v5_0);
                } else {
                    if (v6 == 3) {
                        v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.measurement.internal.zzoh(v4, v2, v1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.measurement.internal.zzoh[] v1_1 = new com.google.android.gms.measurement.internal.zzoh[p1];
        return v1_1;
    }
}
