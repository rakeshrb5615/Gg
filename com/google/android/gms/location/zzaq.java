package com.google.android.gms.location;
public final class zzaq implements android.os.Parcelable$Creator {

    public zzaq()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p7)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p7);
        int v1 = 0;
        java.util.ArrayList v2_1 = 0;
        while (p7.dataPosition() < v0) {
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p7);
            int v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0);
            if (v4 == 1) {
                v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p7, v3_0, com.google.android.gms.location.zzas.CREATOR);
            } else {
                if (v4 == 2) {
                    v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p7, v3_0);
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p7, v3_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p7, v0);
        return new com.google.android.gms.location.SleepSegmentRequest(v2_1, v1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.SleepSegmentRequest[] v1_1 = new com.google.android.gms.location.SleepSegmentRequest[p1];
        return v1_1;
    }
}
