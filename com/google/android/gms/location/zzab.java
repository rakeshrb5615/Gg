package com.google.android.gms.location;
public final class zzab implements android.os.Parcelable$Creator {

    public zzab()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p17)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p17);
        boolean v15 = 0;
        com.google.android.gms.location.zzal[] v14 = 0;
        long v12 = 0;
        int v10 = 1;
        int v11 = 1;
        int v9 = 1000;
        while (p17.dataPosition() < v1) {
            boolean v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p17);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1)) {
                case 1:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p17, v2_1);
                    break;
                case 2:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p17, v2_1);
                    break;
                case 3:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p17, v2_1);
                    break;
                case 4:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p17, v2_1);
                    break;
                case 5:
                    v14 = ((com.google.android.gms.location.zzal[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(p17, v2_1, com.google.android.gms.location.zzal.CREATOR));
                    break;
                case 6:
                    v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p17, v2_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p17, v2_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p17, v1);
        return new com.google.android.gms.location.LocationAvailability(v9, v10, v11, v12, v14, v15);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.LocationAvailability[] v1_1 = new com.google.android.gms.location.LocationAvailability[p1];
        return v1_1;
    }
}
