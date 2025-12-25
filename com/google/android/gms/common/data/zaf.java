package com.google.android.gms.common.data;
public final class zaf implements android.os.Parcelable$Creator {

    public zaf()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p10)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p10);
        String[] v5 = 0;
        android.database.CursorWindow[] v6_1 = 0;
        android.os.Bundle v8 = 0;
        int v4 = 0;
        int v7 = 0;
        while (p10.dataPosition() < v0) {
            Object[] v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p10);
            android.os.Parcelable$Creator v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1);
            if (v2_0 == 1) {
                v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(p10, v1_1);
            } else {
                if (v2_0 == 2) {
                    v6_1 = ((android.database.CursorWindow[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(p10, v1_1, android.database.CursorWindow.CREATOR));
                } else {
                    if (v2_0 == 3) {
                        v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v1_1);
                    } else {
                        if (v2_0 == 4) {
                            v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p10, v1_1);
                        } else {
                            if (v2_0 == 1000) {
                                v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v1_1);
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p10, v1_1);
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p10, v0);
        int v3_1 = new com.google.android.gms.common.data.DataHolder(v4, v5, v6_1, v7, v8);
        v3_1.zad();
        return v3_1;
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.data.DataHolder[] v1_1 = new com.google.android.gms.common.data.DataHolder[p1];
        return v1_1;
    }
}
