package com.google.android.gms.common.stats;
public final class zza implements android.os.Parcelable$Creator {

    public zza()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p27)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p27);
        int v8 = 0;
        int v11 = 0;
        int v13 = 0;
        int v18 = 0;
        boolean v25 = 0;
        String v12 = 0;
        java.util.ArrayList v14 = 0;
        String v15 = 0;
        String v19 = 0;
        String v20 = 0;
        String v24 = 0;
        long v9 = 0;
        long v16 = 0;
        long v22 = 0;
        float v21 = 0;
        while (p27.dataPosition() < v1) {
            boolean v2_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p27);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_2)) {
                case 1:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p27, v2_2);
                    break;
                case 2:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p27, v2_2);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p27, v2_2);
                    break;
                case 4:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p27, v2_2);
                    break;
                case 5:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p27, v2_2);
                    break;
                case 6:
                    v14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(p27, v2_2);
                    break;
                case 8:
                    v16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p27, v2_2);
                    break;
                case 10:
                    v19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p27, v2_2);
                    break;
                case 11:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p27, v2_2);
                    break;
                case 12:
                    v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p27, v2_2);
                    break;
                case 13:
                    v20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p27, v2_2);
                    break;
                case 14:
                    v18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p27, v2_2);
                    break;
                case 15:
                    v21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(p27, v2_2);
                    break;
                case 16:
                    v22 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p27, v2_2);
                    break;
                case 17:
                    v24 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p27, v2_2);
                    break;
                case 18:
                    v25 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p27, v2_2);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p27, v1);
        return new com.google.android.gms.common.stats.WakeLockEvent(v8, v9, v11, v12, v13, v14, v15, v16, v18, v19, v20, v21, v22, v24, v25);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.stats.WakeLockEvent[] v1_1 = new com.google.android.gms.common.stats.WakeLockEvent[p1];
        return v1_1;
    }
}
