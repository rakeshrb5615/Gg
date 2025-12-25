package com.google.android.gms.fido.fido2.api.common;
public final class zzg implements android.os.Parcelable$Creator {

    public zzg()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p7)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p7);
        byte[] v1 = 0;
        byte[] v2 = 0;
        while (p7.dataPosition() < v0) {
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p7);
            int v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0);
            if (v4 == 1) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p7, v3_0);
            } else {
                if (v4 == 2) {
                    v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p7, v3_0);
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p7, v3_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p7, v0);
        return new com.google.android.gms.fido.fido2.api.common.zzf(v1, v2);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.zzf[] v1_1 = new com.google.android.gms.fido.fido2.api.common.zzf[p1];
        return v1_1;
    }
}
