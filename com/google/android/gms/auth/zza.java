package com.google.android.gms.auth;
public final class zza implements android.os.Parcelable$Creator {

    public zza()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p14)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p14);
        int v6 = 0;
        int v10 = 0;
        int v11 = 0;
        long v7 = 0;
        String v9 = 0;
        String v12 = 0;
        while (p14.dataPosition() < v0) {
            String v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p14);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1)) {
                case 1:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p14, v1_1);
                    break;
                case 2:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p14, v1_1);
                    break;
                case 3:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p14, v1_1);
                    break;
                case 4:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p14, v1_1);
                    break;
                case 5:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p14, v1_1);
                    break;
                case 6:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p14, v1_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p14, v1_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p14, v0);
        return new com.google.android.gms.auth.AccountChangeEvent(v6, v7, v9, v10, v11, v12);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.AccountChangeEvent[] v1_1 = new com.google.android.gms.auth.AccountChangeEvent[p1];
        return v1_1;
    }
}
