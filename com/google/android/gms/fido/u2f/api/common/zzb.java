package com.google.android.gms.fido.u2f.api.common;
public final class zzb implements android.os.Parcelable$Creator {

    public zzb()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        String v1 = 0;
        int v3 = 0;
        String v2_0 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 2) {
                v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p8, v4_0);
            } else {
                if (v5 == 3) {
                    v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p8, v4_0);
                } else {
                    if (v5 == 4) {
                        v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p8, v4_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.fido.u2f.api.common.ChannelIdValue(v3, v1, v2_0);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue[] v1_1 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue[p1];
        return v1_1;
    }
}
