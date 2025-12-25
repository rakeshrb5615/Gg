package com.google.android.gms.location;
public final class zzah implements android.os.Parcelable$Creator {

    public zzah()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        boolean v1 = 0;
        java.util.ArrayList v3_1 = 0;
        boolean v2_0 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 1) {
                v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p8, v4_0, com.google.android.gms.location.LocationRequest.CREATOR);
            } else {
                if (v5 == 2) {
                    v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p8, v4_0);
                } else {
                    if (v5 == 3) {
                        v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p8, v4_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.location.LocationSettingsRequest(v3_1, v1, v2_0);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.LocationSettingsRequest[] v1_1 = new com.google.android.gms.location.LocationSettingsRequest[p1];
        return v1_1;
    }
}
