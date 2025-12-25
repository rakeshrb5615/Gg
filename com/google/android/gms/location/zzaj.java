package com.google.android.gms.location;
public final class zzaj implements android.os.Parcelable$Creator {

    public zzaj()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p10)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p10);
        boolean v3 = 0;
        boolean v4 = 0;
        boolean v5 = 0;
        boolean v6 = 0;
        boolean v7 = 0;
        boolean v8 = 0;
        while (p10.dataPosition() < v0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p10);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1)) {
                case 1:
                    v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v1_1);
                    break;
                case 2:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v1_1);
                    break;
                case 3:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v1_1);
                    break;
                case 4:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v1_1);
                    break;
                case 5:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v1_1);
                    break;
                case 6:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v1_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p10, v1_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p10, v0);
        return new com.google.android.gms.location.LocationSettingsStates(v3, v4, v5, v6, v7, v8);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.LocationSettingsStates[] v1_1 = new com.google.android.gms.location.LocationSettingsStates[p1];
        return v1_1;
    }
}
