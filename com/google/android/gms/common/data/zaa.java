package com.google.android.gms.common.data;
public final class zaa implements android.os.Parcelable$Creator {

    public zaa()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        int v1 = 0;
        android.os.ParcelFileDescriptor v3_2 = 0;
        int v2_1 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 1) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p8, v4_0);
            } else {
                if (v5 == 2) {
                    v3_2 = ((android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p8, v4_0, android.os.ParcelFileDescriptor.CREATOR));
                } else {
                    if (v5 == 3) {
                        v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p8, v4_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.common.data.BitmapTeleporter(v1, v3_2, v2_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.data.BitmapTeleporter[] v1_1 = new com.google.android.gms.common.data.BitmapTeleporter[p1];
        return v1_1;
    }
}
