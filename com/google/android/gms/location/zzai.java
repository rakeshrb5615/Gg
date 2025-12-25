package com.google.android.gms.location;
public final class zzai implements android.os.Parcelable$Creator {

    public zzai()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p7)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p7);
        com.google.android.gms.common.api.Status v1_2 = 0;
        com.google.android.gms.location.LocationSettingsStates v2_2 = 0;
        while (p7.dataPosition() < v0) {
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p7);
            int v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0);
            if (v4 == 1) {
                v1_2 = ((com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p7, v3_0, com.google.android.gms.common.api.Status.CREATOR));
            } else {
                if (v4 == 2) {
                    v2_2 = ((com.google.android.gms.location.LocationSettingsStates) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p7, v3_0, com.google.android.gms.location.LocationSettingsStates.CREATOR));
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p7, v3_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p7, v0);
        return new com.google.android.gms.location.LocationSettingsResult(v1_2, v2_2);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.LocationSettingsResult[] v1_1 = new com.google.android.gms.location.LocationSettingsResult[p1];
        return v1_1;
    }
}
