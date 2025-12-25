package com.google.android.gms.location;
public final class zzi implements android.os.Parcelable$Creator {

    public zzi()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p7)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p7);
        java.util.ArrayList v1_1 = 0;
        android.os.Bundle v2 = 0;
        while (p7.dataPosition() < v0) {
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p7);
            int v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0);
            if (v4 == 1) {
                v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p7, v3_0, com.google.android.gms.location.ActivityTransitionEvent.CREATOR);
            } else {
                if (v4 == 2) {
                    v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p7, v3_0);
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p7, v3_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p7, v0);
        return new com.google.android.gms.location.ActivityTransitionResult(v1_1, v2);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.ActivityTransitionResult[] v1_1 = new com.google.android.gms.location.ActivityTransitionResult[p1];
        return v1_1;
    }
}
