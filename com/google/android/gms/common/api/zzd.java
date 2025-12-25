package com.google.android.gms.common.api;
public final class zzd implements android.os.Parcelable$Creator {

    public zzd()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p7)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p7);
        String v1 = 0;
        int v2 = 0;
        while (p7.dataPosition() < v0) {
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p7);
            int v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0);
            if (v4 == 1) {
                v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p7, v3_0);
            } else {
                if (v4 == 2) {
                    v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p7, v3_0);
                } else {
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p7, v3_0);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p7, v0);
        return new com.google.android.gms.common.api.Scope(v2, v1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.api.Scope[] v1_1 = new com.google.android.gms.common.api.Scope[p1];
        return v1_1;
    }
}
