package com.google.android.gms.measurement.internal;
public final class zzai implements android.os.Parcelable$Creator {

    public zzai()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p22)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p22);
        String v7 = 0;
        String v8 = 0;
        com.google.android.gms.measurement.internal.zzpl v9 = 0;
        String v13 = 0;
        com.google.android.gms.measurement.internal.zzbg v14 = 0;
        com.google.android.gms.measurement.internal.zzbg v17 = 0;
        com.google.android.gms.measurement.internal.zzbg v20 = 0;
        long v10 = 0;
        long v15 = 0;
        long v18 = 0;
        boolean v12 = 0;
        while (p22.dataPosition() < v1) {
            com.google.android.gms.measurement.internal.zzbg v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p22);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1)) {
                case 2:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 3:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 4:
                    v9 = ((com.google.android.gms.measurement.internal.zzpl) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p22, v2_1, com.google.android.gms.measurement.internal.zzpl.CREATOR));
                    break;
                case 5:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p22, v2_1);
                    break;
                case 6:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p22, v2_1);
                    break;
                case 7:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 8:
                    v14 = ((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p22, v2_1, com.google.android.gms.measurement.internal.zzbg.CREATOR));
                    break;
                case 9:
                    v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p22, v2_1);
                    break;
                case 10:
                    v17 = ((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p22, v2_1, com.google.android.gms.measurement.internal.zzbg.CREATOR));
                    break;
                case 11:
                    v18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p22, v2_1);
                    break;
                case 12:
                    v20 = ((com.google.android.gms.measurement.internal.zzbg) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p22, v2_1, com.google.android.gms.measurement.internal.zzbg.CREATOR));
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p22, v2_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p22, v1);
        return new com.google.android.gms.measurement.internal.zzah(v7, v8, v9, v10, v12, v13, v14, v15, v17, v18, v20);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.measurement.internal.zzah[] v1_1 = new com.google.android.gms.measurement.internal.zzah[p1];
        return v1_1;
    }
}
