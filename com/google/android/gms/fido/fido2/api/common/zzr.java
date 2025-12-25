package com.google.android.gms.fido.fido2.api.common;
public final class zzr implements android.os.Parcelable$Creator {

    public zzr()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p11)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
        byte[] v7 = 0;
        byte[] v8 = 0;
        byte[] v9 = 0;
        long v5 = 0;
        while (p11.dataPosition() < v0) {
            byte[] v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_0);
            if (v2_0 == 1) {
                v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p11, v1_0);
            } else {
                if (v2_0 == 2) {
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p11, v1_0);
                } else {
                    if (v2_0 == 3) {
                        v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p11, v1_0);
                    } else {
                        if (v2_0 == 4) {
                            v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p11, v1_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0);
        return new com.google.android.gms.fido.fido2.api.common.zzq(v5, v7, v8, v9);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.zzq[] v1_1 = new com.google.android.gms.fido.fido2.api.common.zzq[p1];
        return v1_1;
    }
}
