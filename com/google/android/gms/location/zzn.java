package com.google.android.gms.location;
public final class zzn implements android.os.Parcelable$Creator {

    public zzn()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        boolean v1 = 0;
        long v2 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 2) {
                v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p8, v4_0);
            } else {
                if (v5 == 6) {
                    v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p8, v4_0);
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.location.DeviceOrientationRequest(v2, v1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.DeviceOrientationRequest[] v1_1 = new com.google.android.gms.location.DeviceOrientationRequest[p1];
        return v1_1;
    }
}
