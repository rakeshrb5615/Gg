package com.google.android.gms.internal.auth;
public final class zzar implements android.os.Parcelable$Creator {

    public zzar()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p7)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p7);
        int v1 = 0;
        String v2 = 0;
        while (p7.dataPosition() < v0) {
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p7);
            int v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0);
            if (v4 == 1) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p7, v3_0);
            } else {
                if (v4 == 2) {
                    v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p7, v3_0);
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p7, v3_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p7, v0);
        return new com.google.android.gms.internal.auth.zzaq(v1, v2);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.auth.zzaq[] v1_1 = new com.google.android.gms.internal.auth.zzaq[p1];
        return v1_1;
    }
}
