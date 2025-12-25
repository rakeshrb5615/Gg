package com.google.android.gms.internal.measurement;
public final class zzdg implements android.os.Parcelable$Creator {

    public zzdg()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        String v1 = 0;
        int v3 = 0;
        android.content.Intent v2_3 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 1) {
                v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p8, v4_0);
            } else {
                if (v5 == 2) {
                    v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p8, v4_0);
                } else {
                    if (v5 == 3) {
                        v2_3 = ((android.content.Intent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p8, v4_0, android.content.Intent.CREATOR));
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.internal.measurement.zzdf(v3, v1, v2_3);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.measurement.zzdf[] v1_1 = new com.google.android.gms.internal.measurement.zzdf[p1];
        return v1_1;
    }
}
