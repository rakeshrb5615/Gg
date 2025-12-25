package com.google.android.gms.internal.firebase-auth-api;
public final class zzahu implements android.os.Parcelable$Creator {

    public zzahu()
    {
        return;
    }

    public final synthetic Object createFromParcel(android.os.Parcel p10)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p10);
        String v3 = 0;
        String v4 = 0;
        Long v5 = 0;
        String v6 = 0;
        Long v7 = 0;
        while (p10.dataPosition() < v0) {
            int v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p10);
            com.google.android.gms.internal.firebase-auth-api.zzahv v2_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_0);
            if (v2_2 == 2) {
                v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p10, v1_0);
            } else {
                if (v2_2 == 3) {
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p10, v1_0);
                } else {
                    if (v2_2 == 4) {
                        v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(p10, v1_0);
                    } else {
                        if (v2_2 == 5) {
                            v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p10, v1_0);
                        } else {
                            if (v2_2 == 6) {
                                v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(p10, v1_0);
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p10, v1_0);
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p10, v0);
        return new com.google.android.gms.internal.firebase-auth-api.zzahv(v3, v4, v5, v6, v7);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zzahv[] v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzahv[p1];
        return v1_1;
    }
}
