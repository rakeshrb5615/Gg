package com.google.android.gms.internal.firebase-auth-api;
public final class zzaja implements android.os.Parcelable$Creator {

    public zzaja()
    {
        return;
    }

    public final synthetic Object createFromParcel(android.os.Parcel p22)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p22);
        String v5 = 0;
        String v6 = 0;
        String v7 = 0;
        String v8 = 0;
        String v9 = 0;
        String v10 = 0;
        String v11 = 0;
        String v12 = 0;
        String v15 = 0;
        String v16 = 0;
        String v17 = 0;
        String v18 = 0;
        String v20 = 0;
        boolean v13 = 0;
        boolean v14 = 0;
        boolean v19 = 0;
        while (p22.dataPosition() < v1) {
            int v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p22);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1)) {
                case 2:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 3:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 4:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 5:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 6:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 7:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 8:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 9:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 10:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p22, v2_1);
                    break;
                case 11:
                    v14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p22, v2_1);
                    break;
                case 12:
                    v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 13:
                    v16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 14:
                    v17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 15:
                    v18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                case 16:
                    v19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p22, v2_1);
                    break;
                case 17:
                    v20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p22, v2_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p22, v2_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p22, v1);
        return new com.google.android.gms.internal.firebase-auth-api.zzajb(v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.firebase-auth-api.zzajb[] v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzajb[p1];
        return v1_1;
    }
}
