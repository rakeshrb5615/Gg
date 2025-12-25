package com.google.android.gms.internal.location;
public final class zzel implements android.os.Parcelable$Creator {

    public zzel()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p24)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p24);
        int v22 = -1;
        int v12 = 0;
        short v13 = 0;
        int v21 = 0;
        long v19 = 0;
        float v18 = 0;
        double v14 = 0;
        double v16 = 0;
        String v11 = 0;
        while (p24.dataPosition() < v1) {
            int v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p24);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1)) {
                case 1:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p24, v2_1);
                    break;
                case 2:
                    v19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p24, v2_1);
                    break;
                case 3:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readShort(p24, v2_1);
                    break;
                case 4:
                    v14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(p24, v2_1);
                    break;
                case 5:
                    v16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(p24, v2_1);
                    break;
                case 6:
                    v18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(p24, v2_1);
                    break;
                case 7:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p24, v2_1);
                    break;
                case 8:
                    v21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p24, v2_1);
                    break;
                case 9:
                    v22 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p24, v2_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p24, v2_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p24, v1);
        return new com.google.android.gms.internal.location.zzek(v11, v12, v13, v14, v16, v18, v19, v21, v22);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.location.zzek[] v1_1 = new com.google.android.gms.internal.location.zzek[p1];
        return v1_1;
    }
}
