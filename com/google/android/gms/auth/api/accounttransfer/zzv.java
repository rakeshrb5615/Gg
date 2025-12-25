package com.google.android.gms.auth.api.accounttransfer;
public final class zzv implements android.os.Parcelable$Creator {

    public zzv()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p11)
    {
        String v0_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
        String v2_2 = new java.util.HashSet();
        String v1_7 = 0;
        com.google.android.gms.auth.api.accounttransfer.zzw v4_2 = 0;
        String v5_1 = 0;
        String v6_1 = 0;
        String v7_1 = 0;
        while(true) {
            Integer v3_0 = v1_7;
            if (p11.dataPosition() >= v0_0) {
                if (p11.dataPosition() != v0_0) {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException(g2.g.c(v0_0, "Overread allowed size end="), p11);
                } else {
                    return new com.google.android.gms.auth.api.accounttransfer.zzu(v2_2, v3_0, v4_2, v5_1, v6_1, v7_1);
                }
            } else {
                String v1_6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
                int v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_6);
                if (v8 != 1) {
                    break;
                }
                v1_7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p11, v1_6);
                v2_2.add(Integer.valueOf(1));
            }
        }
        if (v8 == 2) {
            String v1_9 = ((com.google.android.gms.auth.api.accounttransfer.zzw) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p11, v1_6, com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR));
            v2_2.add(Integer.valueOf(2));
            v4_2 = v1_9;
            while (p11.dataPosition() < v0_0) {
            }
        } else {
            if (v8 == 3) {
                String v1_10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_6);
                v2_2.add(Integer.valueOf(3));
                v5_1 = v1_10;
            } else {
                if (v8 == 4) {
                    String v1_11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_6);
                    v2_2.add(Integer.valueOf(4));
                    v6_1 = v1_11;
                } else {
                    if (v8 == 5) {
                        String v1_12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p11, v1_6);
                        v2_2.add(Integer.valueOf(5));
                        v7_1 = v1_12;
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_6);
                    }
                }
            }
        }
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.accounttransfer.zzu[] v1_1 = new com.google.android.gms.auth.api.accounttransfer.zzu[p1];
        return v1_1;
    }
}
