package com.google.android.gms.location;
public final class zzaa implements android.os.Parcelable$Creator {

    public zzaa()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p12)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p12);
        com.google.android.gms.internal.location.zze v10 = 0;
        int v8 = 0;
        boolean v9 = 0;
        long v6 = 9223372036854775807;
        while (p12.dataPosition() < v0) {
            com.google.android.gms.internal.location.zze v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p12);
            android.os.Parcelable$Creator v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1);
            if (v2_0 == 1) {
                v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p12, v1_1);
            } else {
                if (v2_0 == 2) {
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p12, v1_1);
                } else {
                    if (v2_0 == 3) {
                        v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p12, v1_1);
                    } else {
                        if (v2_0 == 5) {
                            v10 = ((com.google.android.gms.internal.location.zze) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p12, v1_1, com.google.android.gms.internal.location.zze.CREATOR));
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p12, v1_1);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p12, v0);
        return new com.google.android.gms.location.LastLocationRequest(v6, v8, v9, v10);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.location.LastLocationRequest[] v1_1 = new com.google.android.gms.location.LastLocationRequest[p1];
        return v1_1;
    }
}
