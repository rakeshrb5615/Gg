package com.google.android.gms.common;
public final class zzu implements android.os.Parcelable$Creator {

    public zzu()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        boolean v1 = 0;
        String v3 = 0;
        android.os.IBinder v4 = 0;
        boolean v2_1 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p9, v5_0);
            } else {
                if (v6 == 2) {
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(p9, v5_0);
                } else {
                    if (v6 == 3) {
                        v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p9, v5_0);
                    } else {
                        if (v6 == 4) {
                            v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p9, v5_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.common.zzt(v3, v4, v1, v2_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.zzt[] v1_1 = new com.google.android.gms.common.zzt[p1];
        return v1_1;
    }
}
