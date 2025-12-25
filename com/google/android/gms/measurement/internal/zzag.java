package com.google.android.gms.measurement.internal;
public final class zzag implements android.os.Parcelable$Creator {

    public zzag()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p11)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
        long v5 = 0;
        long v8 = 0;
        int v7 = 0;
        while (p11.dataPosition() < v0) {
            long v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
            int v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_0);
            if (v2 == 1) {
                v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p11, v1_0);
            } else {
                if (v2 == 2) {
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p11, v1_0);
                } else {
                    if (v2 == 3) {
                        v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p11, v1_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0);
        return new com.google.android.gms.measurement.internal.zzaf(v5, v7, v8);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.measurement.internal.zzaf[] v1_1 = new com.google.android.gms.measurement.internal.zzaf[p1];
        return v1_1;
    }
}
