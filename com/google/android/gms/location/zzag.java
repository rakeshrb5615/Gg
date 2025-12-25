package com.google.android.gms.location;
public final class zzag implements android.os.Parcelable$Creator {

    public zzag()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p6);
        java.util.ArrayList v1_1 = com.google.android.gms.location.LocationResult.zza;
        while (p6.dataPosition() < v0) {
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p6);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_0) == 1) {
                v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p6, v2_0, android.location.Location.CREATOR);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p6, v2_0);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p6, v0);
        return new com.google.android.gms.location.LocationResult(v1_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.LocationResult[] v1_1 = new com.google.android.gms.location.LocationResult[p1];
        return v1_1;
    }
}
