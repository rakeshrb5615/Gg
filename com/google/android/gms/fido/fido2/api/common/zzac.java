package com.google.android.gms.fido.fido2.api.common;
public final class zzac implements android.os.Parcelable$Creator {

    public zzac()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p7)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p7);
        long v1 = 0;
        while (p7.dataPosition() < v0) {
            int v3_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p7);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v3_0) == 1) {
                v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p7, v3_0);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p7, v3_0);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p7, v0);
        return new com.google.android.gms.fido.fido2.api.common.zzab(v1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.zzab[] v1_1 = new com.google.android.gms.fido.fido2.api.common.zzab[p1];
        return v1_1;
    }
}
