package com.google.android.gms.common.internal;
public final class zaw implements android.os.Parcelable$Creator {

    public zaw()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p10)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p10);
        int v4 = 0;
        boolean v7 = 0;
        boolean v8 = 0;
        android.os.IBinder v5 = 0;
        com.google.android.gms.common.ConnectionResult v6_1 = 0;
        while (p10.dataPosition() < v0) {
            android.os.Parcelable v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p10);
            android.os.Parcelable$Creator v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1);
            if (v2_0 == 1) {
                v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v1_1);
            } else {
                if (v2_0 == 2) {
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(p10, v1_1);
                } else {
                    if (v2_0 == 3) {
                        v6_1 = ((com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p10, v1_1, com.google.android.gms.common.ConnectionResult.CREATOR));
                    } else {
                        if (v2_0 == 4) {
                            v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v1_1);
                        } else {
                            if (v2_0 == 5) {
                                v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v1_1);
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p10, v1_1);
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p10, v0);
        return new com.google.android.gms.common.internal.zav(v4, v5, v6_1, v7, v8);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.internal.zav[] v1_1 = new com.google.android.gms.common.internal.zav[p1];
        return v1_1;
    }
}
