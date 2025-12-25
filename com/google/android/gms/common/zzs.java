package com.google.android.gms.common;
public final class zzs implements android.os.Parcelable$Creator {

    public zzs()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p13)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p13);
        long v10 = -1;
        boolean v6 = 0;
        int v8 = 0;
        int v9 = 0;
        String v7 = 0;
        while (p13.dataPosition() < v0) {
            long v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p13);
            int v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1);
            if (v2 == 1) {
                v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p13, v1_1);
            } else {
                if (v2 == 2) {
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_1);
                } else {
                    if (v2 == 3) {
                        v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_1);
                    } else {
                        if (v2 == 4) {
                            v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_1);
                        } else {
                            if (v2 == 5) {
                                v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p13, v1_1);
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p13, v1_1);
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p13, v0);
        return new com.google.android.gms.common.zzr(v6, v7, v8, v9, v10);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.zzr[] v1_1 = new com.google.android.gms.common.zzr[p1];
        return v1_1;
    }
}
