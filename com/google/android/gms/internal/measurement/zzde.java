package com.google.android.gms.internal.measurement;
public final class zzde implements android.os.Parcelable$Creator {

    public zzde()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p14)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p14);
        android.os.Bundle v11 = 0;
        String v12 = 0;
        boolean v10 = 0;
        long v6 = 0;
        long v8 = 0;
        while (p14.dataPosition() < v0) {
            String v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p14);
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1);
            if (v2_0 == 1) {
                v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p14, v1_1);
            } else {
                if (v2_0 == 2) {
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p14, v1_1);
                } else {
                    if (v2_0 == 3) {
                        v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p14, v1_1);
                    } else {
                        if (v2_0 == 7) {
                            v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p14, v1_1);
                        } else {
                            if (v2_0 == 8) {
                                v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p14, v1_1);
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p14, v1_1);
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p14, v0);
        return new com.google.android.gms.internal.measurement.zzdd(v6, v8, v10, v11, v12);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.measurement.zzdd[] v1_1 = new com.google.android.gms.internal.measurement.zzdd[p1];
        return v1_1;
    }
}
