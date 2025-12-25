package com.google.android.gms.location;
public final class zzap implements android.os.Parcelable$Creator {

    public zzap()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p13)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p13);
        int v9 = 0;
        int v10 = 0;
        int v11 = 0;
        long v5 = 0;
        long v7 = 0;
        while (p13.dataPosition() < v0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p13);
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1);
            if (v2_0 == 1) {
                v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p13, v1_1);
            } else {
                if (v2_0 == 2) {
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p13, v1_1);
                } else {
                    if (v2_0 == 3) {
                        v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_1);
                    } else {
                        if (v2_0 == 4) {
                            v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_1);
                        } else {
                            if (v2_0 == 5) {
                                v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_1);
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p13, v1_1);
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p13, v0);
        return new com.google.android.gms.location.SleepSegmentEvent(v5, v7, v9, v10, v11);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.SleepSegmentEvent[] v1_1 = new com.google.android.gms.location.SleepSegmentEvent[p1];
        return v1_1;
    }
}
