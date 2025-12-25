package com.google.android.gms.location;
public final class zzh implements android.os.Parcelable$Creator {

    public zzh()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        java.util.ArrayList v1_1 = 0;
        String v2 = 0;
        java.util.ArrayList v3_1 = 0;
        String v4 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p9, v5_0, com.google.android.gms.location.ActivityTransition.CREATOR);
            } else {
                if (v6 == 2) {
                    v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p9, v5_0);
                } else {
                    if (v6 == 3) {
                        v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p9, v5_0, com.google.android.gms.common.internal.ClientIdentity.CREATOR);
                    } else {
                        if (v6 == 4) {
                            v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p9, v5_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.location.ActivityTransitionRequest(v1_1, v2, v3_1, v4);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.ActivityTransitionRequest[] v1_1 = new com.google.android.gms.location.ActivityTransitionRequest[p1];
        return v1_1;
    }
}
