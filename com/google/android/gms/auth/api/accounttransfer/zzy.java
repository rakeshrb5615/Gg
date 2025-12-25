package com.google.android.gms.auth.api.accounttransfer;
public final class zzy implements android.os.Parcelable$Creator {

    public zzy()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p11)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
        int v5 = 0;
        boolean v6 = 0;
        boolean v9 = 0;
        long v7 = 0;
        while (p11.dataPosition() < v0) {
            boolean v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_0);
            if (v2_0 == 1) {
                v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p11, v1_0);
            } else {
                if (v2_0 == 2) {
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p11, v1_0);
                } else {
                    if (v2_0 == 3) {
                        v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p11, v1_0);
                    } else {
                        if (v2_0 == 4) {
                            v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p11, v1_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0);
        return new com.google.android.gms.auth.api.accounttransfer.DeviceMetaData(v5, v6, v7, v9);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.accounttransfer.DeviceMetaData[] v1_1 = new com.google.android.gms.auth.api.accounttransfer.DeviceMetaData[p1];
        return v1_1;
    }
}
