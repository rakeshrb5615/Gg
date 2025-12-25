package com.google.android.gms.location;
public final class zzam implements android.os.Parcelable$Creator {

    public zzam()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p12)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p12);
        long v7 = -1;
        long v9 = -1;
        int v5 = 1;
        int v6 = 1;
        while (p12.dataPosition() < v0) {
            long v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p12);
            int v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_0);
            if (v2 == 1) {
                v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p12, v1_0);
            } else {
                if (v2 == 2) {
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p12, v1_0);
                } else {
                    if (v2 == 3) {
                        v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p12, v1_0);
                    } else {
                        if (v2 == 4) {
                            v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p12, v1_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p12, v1_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p12, v0);
        return new com.google.android.gms.location.zzal(v5, v6, v7, v9);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.zzal[] v1_1 = new com.google.android.gms.location.zzal[p1];
        return v1_1;
    }
}
