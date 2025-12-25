package com.google.android.gms.location;
public final class zzao implements android.os.Parcelable$Creator {

    public zzao()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p13)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p13);
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        boolean v10 = 0;
        int v11 = 0;
        while (p13.dataPosition() < v0) {
            int v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p13);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2)) {
                case 1:
                    v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_2);
                    break;
                case 2:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_2);
                    break;
                case 3:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_2);
                    break;
                case 4:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_2);
                    break;
                case 5:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_2);
                    break;
                case 6:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_2);
                    break;
                case 7:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_2);
                    break;
                case 8:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p13, v1_2);
                    break;
                case 9:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_2);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p13, v1_2);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p13, v0);
        return new com.google.android.gms.location.SleepClassifyEvent(v3, v4, v5, v6, v7, v8, v9, v10, v11);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.SleepClassifyEvent[] v1_1 = new com.google.android.gms.location.SleepClassifyEvent[p1];
        return v1_1;
    }
}
