package com.google.android.gms.internal.location;
public final class zzk implements android.os.Parcelable$Creator {

    public zzk()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p10)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p10);
        com.google.android.gms.internal.location.zzh v1_0 = 0;
        android.os.IBinder v3 = 0;
        android.os.IBinder v4 = 0;
        int v5 = 1;
        while (p10.dataPosition() < v0) {
            int v6_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p10);
            int v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v6_0);
            if (v7 == 1) {
                v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v6_0);
            } else {
                if (v7 == 2) {
                    v1_0 = ((com.google.android.gms.internal.location.zzh) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p10, v6_0, com.google.android.gms.internal.location.zzh.CREATOR));
                } else {
                    if (v7 == 3) {
                        v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(p10, v6_0);
                    } else {
                        if (v7 == 4) {
                            v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(p10, v6_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p10, v6_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p10, v0);
        return new com.google.android.gms.internal.location.zzj(v5, v1_0, v3, v4);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.location.zzj[] v1_1 = new com.google.android.gms.internal.location.zzj[p1];
        return v1_1;
    }
}
