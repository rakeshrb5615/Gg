package com.google.android.gms.location;
public final class zzj implements android.os.Parcelable$Creator {

    public zzj()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p20)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p20);
        android.os.WorkSource v17 = new android.os.WorkSource();
        com.google.android.gms.internal.location.zze v18 = 0;
        int v11 = 0;
        boolean v15 = 0;
        int v16 = 0;
        long v9 = 9223372036854775807;
        long v13 = 9223372036854775807;
        int v12 = 102;
        while (p20.dataPosition() < v1) {
            com.google.android.gms.internal.location.zze v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p20);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1)) {
                case 1:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p20, v2_1);
                    break;
                case 2:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p20, v2_1);
                    break;
                case 3:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p20, v2_1);
                    break;
                case 4:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p20, v2_1);
                    break;
                case 5:
                    v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p20, v2_1);
                    break;
                case 6:
                    v17 = ((android.os.WorkSource) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p20, v2_1, android.os.WorkSource.CREATOR));
                    break;
                case 7:
                    v16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p20, v2_1);
                    break;
                case 8:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p20, v2_1);
                    break;
                case 9:
                    v18 = ((com.google.android.gms.internal.location.zze) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p20, v2_1, com.google.android.gms.internal.location.zze.CREATOR));
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p20, v1);
        return new com.google.android.gms.location.CurrentLocationRequest(v9, v11, v12, v13, v15, v16, v17, v18);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.CurrentLocationRequest[] v1_1 = new com.google.android.gms.location.CurrentLocationRequest[p1];
        return v1_1;
    }
}
