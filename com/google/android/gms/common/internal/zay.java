package com.google.android.gms.common.internal;
public final class zay implements android.os.Parcelable$Creator {

    public zay()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        com.google.android.gms.common.api.Scope[] v1_0 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
            } else {
                if (v6 == 2) {
                    v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
                } else {
                    if (v6 == 3) {
                        v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
                    } else {
                        if (v6 == 4) {
                            v1_0 = ((com.google.android.gms.common.api.Scope[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(p9, v5_0, com.google.android.gms.common.api.Scope.CREATOR));
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.common.internal.zax(v2, v3, v4, v1_0);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.internal.zax[] v1_1 = new com.google.android.gms.common.internal.zax[p1];
        return v1_1;
    }
}
