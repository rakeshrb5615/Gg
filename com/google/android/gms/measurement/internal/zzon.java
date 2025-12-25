package com.google.android.gms.measurement.internal;
public final class zzon implements android.os.Parcelable$Creator {

    public zzon()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p17)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p17);
        byte[] v9 = 0;
        String v10 = 0;
        android.os.Bundle v11 = 0;
        String v15 = 0;
        long v7 = 0;
        long v13 = 0;
        int v12 = 0;
        while (p17.dataPosition() < v1) {
            String v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p17);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1)) {
                case 1:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p17, v2_1);
                    break;
                case 2:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p17, v2_1);
                    break;
                case 3:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p17, v2_1);
                    break;
                case 4:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p17, v2_1);
                    break;
                case 5:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p17, v2_1);
                    break;
                case 6:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p17, v2_1);
                    break;
                case 7:
                    v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p17, v2_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p17, v2_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p17, v1);
        return new com.google.android.gms.measurement.internal.zzom(v7, v9, v10, v11, v12, v13, v15);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.measurement.internal.zzom[] v1_1 = new com.google.android.gms.measurement.internal.zzom[p1];
        return v1_1;
    }
}
