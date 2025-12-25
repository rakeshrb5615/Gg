package com.google.android.gms.fido.u2f.api.common;
public final class zze implements android.os.Parcelable$Creator {

    public zze()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        byte[] v1 = 0;
        java.util.ArrayList v3_1 = 0;
        int v4 = 0;
        String v2_0 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
            } else {
                if (v6 == 2) {
                    v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p9, v5_0);
                } else {
                    if (v6 == 3) {
                        v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p9, v5_0);
                    } else {
                        if (v6 == 4) {
                            v3_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p9, v5_0, com.google.android.gms.fido.common.Transport.CREATOR);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.fido.u2f.api.common.KeyHandle(v4, v1, v2_0, v3_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.u2f.api.common.KeyHandle[] v1_1 = new com.google.android.gms.fido.u2f.api.common.KeyHandle[p1];
        return v1_1;
    }
}
