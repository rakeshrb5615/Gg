package com.google.android.gms.common.api;
public final class zzc implements android.os.Parcelable$Creator {

    public zzc()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p10)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p10);
        int v2 = 0;
        boolean v5 = 1;
        int v3 = 0;
        int v4 = 0;
        while (p10.dataPosition() < v0) {
            int v6_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p10);
            int v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v6_0);
            if (v7 == 1) {
                v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v6_0);
            } else {
                if (v7 == 2) {
                    v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v6_0);
                } else {
                    if (v7 == 3) {
                        v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v6_0);
                    } else {
                        if (v7 == 4) {
                            v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v6_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p10, v6_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p10, v0);
        return new com.google.android.gms.common.api.ComplianceOptions(v2, v3, v4, v5);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.api.ComplianceOptions[] v1_1 = new com.google.android.gms.common.api.ComplianceOptions[p1];
        return v1_1;
    }
}
