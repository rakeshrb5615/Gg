package com.google.android.gms.location;
public final class zzm implements android.os.Parcelable$Creator {

    public zzm()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p17)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p17);
        float v9 = 0;
        float v10 = 0;
        float v14 = 0;
        float v15 = 0;
        byte v13 = 0;
        long v11 = 0;
        float[] v8 = 0;
        while (p17.dataPosition() < v1) {
            float v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p17);
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1);
            if (v3_0 == 1) {
                v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createFloatArray(p17, v2_1);
            } else {
                switch (v3_0) {
                    case 4:
                        v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(p17, v2_1);
                        break;
                    case 5:
                        v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(p17, v2_1);
                        break;
                    case 6:
                        v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p17, v2_1);
                        break;
                    case 7:
                        v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(p17, v2_1);
                        break;
                    case 8:
                        v14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(p17, v2_1);
                        break;
                    case 9:
                        v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(p17, v2_1);
                        break;
                    default:
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p17, v2_1);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p17, v1);
        return new com.google.android.gms.location.DeviceOrientation(v8, v9, v10, v11, v13, v14, v15);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.DeviceOrientation[] v1_1 = new com.google.android.gms.location.DeviceOrientation[p1];
        return v1_1;
    }
}
