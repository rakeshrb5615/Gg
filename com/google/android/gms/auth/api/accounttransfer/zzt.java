package com.google.android.gms.auth.api.accounttransfer;
public final class zzt implements android.os.Parcelable$Creator {

    public zzt()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p11)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
        int v4 = 0;
        java.util.ArrayList v5 = 0;
        java.util.ArrayList v6 = 0;
        java.util.ArrayList v7 = 0;
        java.util.ArrayList v8 = 0;
        java.util.ArrayList v9 = 0;
        while (p11.dataPosition() < v0) {
            java.util.ArrayList v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1)) {
                case 1:
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p11, v1_1);
                    break;
                case 2:
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(p11, v1_1);
                    break;
                case 3:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(p11, v1_1);
                    break;
                case 4:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(p11, v1_1);
                    break;
                case 5:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(p11, v1_1);
                    break;
                case 6:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(p11, v1_1);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_1);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0);
        return new com.google.android.gms.auth.api.accounttransfer.zzs(v4, v5, v6, v7, v8, v9);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.accounttransfer.zzs[] v1_1 = new com.google.android.gms.auth.api.accounttransfer.zzs[p1];
        return v1_1;
    }
}
