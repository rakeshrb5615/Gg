package com.google.android.gms.fido.fido2.api.common;
public final class zzba implements android.os.Parcelable$Creator {

    public zzba()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        int v1 = 0;
        short v2 = 0;
        short v3 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 1) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p8, v4_0);
            } else {
                if (v5 == 2) {
                    v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readShort(p8, v4_0);
                } else {
                    if (v5 == 3) {
                        v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readShort(p8, v4_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.fido.fido2.api.common.UvmEntry(v1, v2, v3);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.UvmEntry[] v1_1 = new com.google.android.gms.fido.fido2.api.common.UvmEntry[p1];
        return v1_1;
    }
}
