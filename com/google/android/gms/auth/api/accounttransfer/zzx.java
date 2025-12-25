package com.google.android.gms.auth.api.accounttransfer;
public final class zzx implements android.os.Parcelable$Creator {

    public zzx()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p11)
    {
        String v0_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
        String v2_2 = new java.util.HashSet();
        int v5_1 = 0;
        String v4_2 = 0;
        byte[] v6_2 = 0;
        android.app.PendingIntent v7_3 = 0;
        com.google.android.gms.auth.api.accounttransfer.DeviceMetaData v8_0 = 0;
        int v3_0 = 0;
        while (p11.dataPosition() < v0_0) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException v1_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_6)) {
                case 1:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException v1_15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p11, v1_6);
                    v2_2.add(Integer.valueOf(1));
                    v3_0 = v1_15;
                    break;
                case 2:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException v1_14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_6);
                    v2_2.add(Integer.valueOf(2));
                    v4_2 = v1_14;
                    break;
                case 3:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException v1_13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p11, v1_6);
                    v2_2.add(Integer.valueOf(3));
                    v5_1 = v1_13;
                    break;
                case 4:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException v1_12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p11, v1_6);
                    v2_2.add(Integer.valueOf(4));
                    v6_2 = v1_12;
                    break;
                case 5:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException v1_11 = ((android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p11, v1_6, android.app.PendingIntent.CREATOR));
                    v2_2.add(Integer.valueOf(5));
                    v7_3 = v1_11;
                    break;
                case 6:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException v1_8 = ((com.google.android.gms.auth.api.accounttransfer.DeviceMetaData) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p11, v1_6, com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR));
                    v2_2.add(Integer.valueOf(6));
                    v8_0 = v1_8;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_6);
            }
        }
        if (p11.dataPosition() != v0_0) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException(g2.g.c(v0_0, "Overread allowed size end="), p11);
        } else {
            return new com.google.android.gms.auth.api.accounttransfer.zzw(v2_2, v3_0, v4_2, v5_1, v6_2, v7_3, v8_0);
        }
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.accounttransfer.zzw[] v1_1 = new com.google.android.gms.auth.api.accounttransfer.zzw[p1];
        return v1_1;
    }
}
