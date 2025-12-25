package com.google.android.gms.internal.location;
public final class zzi implements android.os.Parcelable$Creator {

    public zzi()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        com.google.android.gms.location.DeviceOrientationRequest v1_1 = com.google.android.gms.internal.location.zzh.zzb;
        java.util.ArrayList v2_1 = com.google.android.gms.internal.location.zzh.zza;
        String v3 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 1) {
                v1_1 = ((com.google.android.gms.location.DeviceOrientationRequest) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p8, v4_0, com.google.android.gms.location.DeviceOrientationRequest.CREATOR));
            } else {
                if (v5 == 2) {
                    v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(p8, v4_0, com.google.android.gms.common.internal.ClientIdentity.CREATOR);
                } else {
                    if (v5 == 3) {
                        v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p8, v4_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.internal.location.zzh(v1_1, v2_1, v3);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.location.zzh[] v1_1 = new com.google.android.gms.internal.location.zzh[p1];
        return v1_1;
    }
}
