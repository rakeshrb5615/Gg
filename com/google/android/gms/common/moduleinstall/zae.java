package com.google.android.gms.common.moduleinstall;
public final class zae implements android.os.Parcelable$Creator {

    public zae()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p10)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p10);
        int v4 = 0;
        int v5 = 0;
        int v8 = 0;
        Long v6 = 0;
        Long v7 = 0;
        while (p10.dataPosition() < v0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p10);
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1);
            if (v2_0 == 1) {
                v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v1_1);
            } else {
                if (v2_0 == 2) {
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v1_1);
                } else {
                    if (v2_0 == 3) {
                        v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(p10, v1_1);
                    } else {
                        if (v2_0 == 4) {
                            v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(p10, v1_1);
                        } else {
                            if (v2_0 == 5) {
                                v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v1_1);
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p10, v1_1);
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p10, v0);
        return new com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate(v4, v5, v6, v7, v8);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate[] v1_1 = new com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate[p1];
        return v1_1;
    }
}
