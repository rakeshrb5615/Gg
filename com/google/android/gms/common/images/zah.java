package com.google.android.gms.common.images;
public final class zah implements android.os.Parcelable$Creator {

    public zah()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        int v1 = 0;
        int v3 = 0;
        android.net.Uri v4_2 = 0;
        int v2_1 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
            } else {
                if (v6 == 2) {
                    v4_2 = ((android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, android.net.Uri.CREATOR));
                } else {
                    if (v6 == 3) {
                        v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
                    } else {
                        if (v6 == 4) {
                            v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.common.images.WebImage(v1, v4_2, v2_1, v3);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.images.WebImage[] v1_1 = new com.google.android.gms.common.images.WebImage[p1];
        return v1_1;
    }
}
