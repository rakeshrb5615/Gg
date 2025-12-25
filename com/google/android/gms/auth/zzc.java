package com.google.android.gms.auth;
public final class zzc implements android.os.Parcelable$Creator {

    public zzc()
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
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p7, v3_0);
            } else {
                if (v4 == 2) {
                    v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p7, v3_0, com.google.android.gms.auth.AccountChangeEvent.CREATOR);
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p7, v3_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p7, v0);
        return new com.google.android.gms.auth.AccountChangeEventsResponse(v1, v2_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.AccountChangeEventsResponse[] v1_1 = new com.google.android.gms.auth.AccountChangeEventsResponse[p1];
        return v1_1;
    }
}
