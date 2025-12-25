package com.google.android.gms.measurement.internal;
public final class zzs implements android.os.Parcelable$Creator {

    public zzs()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p52)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p52);
        boolean v22 = 0;
        int v28 = 0;
        boolean v30 = 0;
        boolean v38 = 0;
        int v43 = 0;
        int v50 = 0;
        long v16 = 0;
        long v18 = 0;
        long v26 = 0;
        long v32 = 0;
        long v39 = 0;
        long v44 = 0;
        long v48 = 0;
        String v35 = "";
        String v36 = "";
        String v42 = "";
        String v47 = "";
        String v12 = 0;
        String v13 = 0;
        String v14 = 0;
        String v15 = 0;
        String v20 = 0;
        String v25 = 0;
        Boolean v31 = 0;
        java.util.ArrayList v34 = 0;
        String v37 = 0;
        String v46 = 0;
        int v41 = 100;
        boolean v21 = 1;
        boolean v29 = 1;
        long v23 = -2147483648;
        while (p52.dataPosition() < v1) {
            int v2_17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p52);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_17)) {
                case 2:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 3:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 4:
                    v14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 5:
                    v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 6:
                    v16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p52, v2_17);
                    break;
                case 7:
                    v18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p52, v2_17);
                    break;
                case 8:
                    v20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 9:
                    v21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p52, v2_17);
                    break;
                case 10:
                    v22 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p52, v2_17);
                    break;
                case 11:
                    v23 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p52, v2_17);
                    break;
                case 12:
                    v25 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case 24:
                case 33:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p52, v2_17);
                    break;
                case 14:
                    v26 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p52, v2_17);
                    break;
                case 15:
                    v28 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p52, v2_17);
                    break;
                case 16:
                    v29 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p52, v2_17);
                    break;
                case 18:
                    v30 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p52, v2_17);
                    break;
                case 21:
                    v31 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBooleanObject(p52, v2_17);
                    break;
                case 22:
                    v32 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p52, v2_17);
                    break;
                case 23:
                    v34 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(p52, v2_17);
                    break;
                case 25:
                    v35 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 26:
                    v36 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 27:
                    v37 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 28:
                    v38 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p52, v2_17);
                    break;
                case 29:
                    v39 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p52, v2_17);
                    break;
                case 30:
                    v41 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p52, v2_17);
                    break;
                case 31:
                    v42 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 32:
                    v43 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p52, v2_17);
                    break;
                case 34:
                    v44 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p52, v2_17);
                    break;
                case 35:
                    v46 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 36:
                    v47 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p52, v2_17);
                    break;
                case 37:
                    v48 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p52, v2_17);
                    break;
                case 38:
                    v50 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p52, v2_17);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p52, v1);
        return new com.google.android.gms.measurement.internal.zzr(v12, v13, v14, v15, v16, v18, v20, v21, v22, v23, v25, v26, v28, v29, v30, v31, v32, v34, v35, v36, v37, v38, v39, v41, v42, v43, v44, v46, v47, v48, v50);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.measurement.internal.zzr[] v1_1 = new com.google.android.gms.measurement.internal.zzr[p1];
        return v1_1;
    }
}
