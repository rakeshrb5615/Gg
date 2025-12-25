package com.google.android.gms.common.server.response;
public final class zaj implements android.os.Parcelable$Creator {

    public zaj()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p14)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p14);
        String v9 = 0;
        String v11 = 0;
        com.google.android.gms.common.server.converter.zaa v12_1 = 0;
        int v4 = 0;
        int v5 = 0;
        boolean v6 = 0;
        int v7 = 0;
        boolean v8 = 0;
        int v10 = 0;
        while (p14.dataPosition() < v0) {
            android.os.Parcelable v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p14);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2)) {
                case 1:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p14, v1_2);
                    break;
                case 2:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p14, v1_2);
                    break;
                case 3:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p14, v1_2);
                    break;
                case 4:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p14, v1_2);
                    break;
                case 5:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p14, v1_2);
                    break;
                case 6:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p14, v1_2);
                    break;
                case 7:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p14, v1_2);
                    break;
                case 8:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p14, v1_2);
                    break;
                case 9:
                    v12_1 = ((com.google.android.gms.common.server.converter.zaa) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.common.server.converter.zaa.CREATOR));
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p14, v1_2);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p14, v0);
        return new com.google.android.gms.common.server.response.FastJsonResponse$Field(v4, v5, v6, v7, v8, v9, v10, v11, v12_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.server.response.FastJsonResponse$Field[] v1_1 = new com.google.android.gms.common.server.response.FastJsonResponse$Field[p1];
        return v1_1;
    }
}
