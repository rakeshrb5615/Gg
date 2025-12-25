package com.google.android.gms.fido.u2f.api.common;
public final class zzl implements android.os.Parcelable$Creator {

    public zzl()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        byte[] v1 = 0;
        String v2 = 0;
        byte[] v3 = 0;
        byte[] v4 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 2) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p9, v5_0);
            } else {
                if (v6 == 3) {
                    v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p9, v5_0);
                } else {
                    if (v6 == 4) {
                        v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p9, v5_0);
                    } else {
                        if (v6 == 5) {
                            v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p9, v5_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.fido.u2f.api.common.SignResponseData(v1, v2, v3, v4);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.u2f.api.common.SignResponseData[] v1_1 = new com.google.android.gms.fido.u2f.api.common.SignResponseData[p1];
        return v1_1;
    }
}
