package com.google.android.gms.location;
public final class zzc implements android.os.Parcelable$Creator {

    public zzc()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p19)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p19);
        android.os.WorkSource v10 = 0;
        String v11 = 0;
        int[] v12 = 0;
        String v14 = 0;
        String v17 = 0;
        long v7 = 0;
        long v15 = 0;
        boolean v9 = 0;
        boolean v13 = 0;
        while (p19.dataPosition() < v1) {
            String v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p19);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1)) {
                case 1:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p19, v2_1);
                    break;
                case 2:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p19, v2_1);
                    break;
                case 3:
                    v10 = ((android.os.WorkSource) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p19, v2_1, android.os.WorkSource.CREATOR));
                    break;
                case 4:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p19, v2_1);
                    break;
                case 5:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(p19, v2_1);
                    break;
                case 6:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p19, v2_1);
                    break;
                case 7:
                    v14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p19, v2_1);
                    break;
                case 8:
                    v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p19, v2_1);
                    break;
                case 9:
                    v17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p19, v2_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p19, v2_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p19, v1);
        return new com.google.android.gms.location.zzb(v7, v9, v10, v11, v12, v13, v14, v15, v17);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.zzb[] v1_1 = new com.google.android.gms.location.zzb[p1];
        return v1_1;
    }
}
