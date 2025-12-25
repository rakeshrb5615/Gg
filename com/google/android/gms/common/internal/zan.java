package com.google.android.gms.common.internal;
public final class zan implements android.os.Parcelable$Creator {

    public zan()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p20)
    {
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p20);
        int v18 = -1;
        int v8 = 0;
        int v9 = 0;
        int v10 = 0;
        int v17 = 0;
        String v15 = 0;
        String v16 = 0;
        long v11 = 0;
        long v13 = 0;
        while (p20.dataPosition() < v1) {
            int v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p20);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_1)) {
                case 1:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p20, v2_1);
                    break;
                case 2:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p20, v2_1);
                    break;
                case 3:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p20, v2_1);
                    break;
                case 4:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p20, v2_1);
                    break;
                case 5:
                    v13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p20, v2_1);
                    break;
                case 6:
                    v15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p20, v2_1);
                    break;
                case 7:
                    v16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p20, v2_1);
                    break;
                case 8:
                    v17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p20, v2_1);
                    break;
                case 9:
                    v18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p20, v2_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p20, v2_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p20, v1);
        return new com.google.android.gms.common.internal.MethodInvocation(v8, v9, v10, v11, v13, v15, v16, v17, v18);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.internal.MethodInvocation[] v1_1 = new com.google.android.gms.common.internal.MethodInvocation[p1];
        return v1_1;
    }
}
