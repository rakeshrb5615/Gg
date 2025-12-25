package com.google.android.gms.auth.api.accounttransfer;
public final class zzp implements android.os.Parcelable$Creator {

    public zzp()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p10)
    {
        String v0_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p10);
        String v2_2 = new java.util.HashSet();
        int v5_1 = 0;
        java.util.ArrayList v4_2 = 0;
        com.google.android.gms.auth.api.accounttransfer.zzs v6_2 = 0;
        int v3_1 = 0;
        while (p10.dataPosition() < v0_0) {
            com.google.android.gms.auth.api.accounttransfer.zzs v1_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p10);
            int v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_6);
            if (v7 == 1) {
                com.google.android.gms.auth.api.accounttransfer.zzs v1_7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v1_6);
                v2_2.add(Integer.valueOf(1));
                v3_1 = v1_7;
            } else {
                if (v7 == 2) {
                    com.google.android.gms.auth.api.accounttransfer.zzs v1_9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p10, v1_6, com.google.android.gms.auth.api.accounttransfer.zzu.CREATOR);
                    v2_2.add(Integer.valueOf(2));
                    v4_2 = v1_9;
                } else {
                    if (v7 == 3) {
                        com.google.android.gms.auth.api.accounttransfer.zzs v1_10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v1_6);
                        v2_2.add(Integer.valueOf(3));
                        v5_1 = v1_10;
                    } else {
                        if (v7 == 4) {
                            com.google.android.gms.auth.api.accounttransfer.zzs v1_12 = ((com.google.android.gms.auth.api.accounttransfer.zzs) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p10, v1_6, com.google.android.gms.auth.api.accounttransfer.zzs.CREATOR));
                            v2_2.add(Integer.valueOf(4));
                            v6_2 = v1_12;
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p10, v1_6);
                        }
                    }
                }
            }
        }
        if (p10.dataPosition() != v0_0) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException(g2.g.c(v0_0, "Overread allowed size end="), p10);
        } else {
            return new com.google.android.gms.auth.api.accounttransfer.zzo(v2_2, v3_1, v4_2, v5_1, v6_2);
        }
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.accounttransfer.zzo[] v1_1 = new com.google.android.gms.auth.api.accounttransfer.zzo[p1];
        return v1_1;
    }
}
