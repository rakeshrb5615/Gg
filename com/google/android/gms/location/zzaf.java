package com.google.android.gms.location;
public final class zzaf implements android.os.Parcelable$Creator {

    public zzaf()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p41)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p41);
        android.os.WorkSource v38 = new android.os.WorkSource();
        com.google.android.gms.internal.location.zze v39 = 0;
        boolean v32 = 0;
        int v35 = 0;
        int v36 = 0;
        boolean v37 = 0;
        long v33 = -1;
        float v31 = 0;
        int v30 = 2147483647;
        long v26 = 9223372036854775807;
        long v28 = 9223372036854775807;
        long v24 = 0;
        long v22 = 600000;
        long v20 = 3600000;
        int v19 = 102;
        while (p41.dataPosition() < v1) {
            com.google.android.gms.internal.location.zze v2_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p41);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_2)) {
                case 1:
                    v19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p41, v2_2);
                    break;
                case 2:
                    v20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p41, v2_2);
                    break;
                case 3:
                    v22 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p41, v2_2);
                    break;
                case 4:
                case 14:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p41, v2_2);
                    break;
                case 5:
                    v26 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p41, v2_2);
                    break;
                case 6:
                    v30 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p41, v2_2);
                    break;
                case 7:
                    v31 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(p41, v2_2);
                    break;
                case 8:
                    v24 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p41, v2_2);
                    break;
                case 9:
                    v32 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p41, v2_2);
                    break;
                case 10:
                    v28 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p41, v2_2);
                    break;
                case 11:
                    v33 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p41, v2_2);
                    break;
                case 12:
                    v35 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p41, v2_2);
                    break;
                case 13:
                    v36 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p41, v2_2);
                    break;
                case 15:
                    v37 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p41, v2_2);
                    break;
                case 16:
                    v38 = ((android.os.WorkSource) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p41, v2_2, android.os.WorkSource.CREATOR));
                    break;
                case 17:
                    v39 = ((com.google.android.gms.internal.location.zze) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p41, v2_2, com.google.android.gms.internal.location.zze.CREATOR));
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p41, v1);
        return new com.google.android.gms.location.LocationRequest(v19, v20, v22, v24, v26, v28, v30, v31, v32, v33, v35, v36, v37, v38, v39);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.LocationRequest[] v1_1 = new com.google.android.gms.location.LocationRequest[p1];
        return v1_1;
    }
}
