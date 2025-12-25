package com.google.android.gms.fido.u2f.api.common;
public final class zzj implements android.os.Parcelable$Creator {

    public zzj()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        com.google.android.gms.fido.u2f.api.common.KeyHandle v1_1 = 0;
        String v2 = 0;
        String v3 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 2) {
                v1_1 = ((com.google.android.gms.fido.u2f.api.common.KeyHandle) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p8, v4_0, com.google.android.gms.fido.u2f.api.common.KeyHandle.CREATOR));
            } else {
                if (v5 == 3) {
                    v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p8, v4_0);
                } else {
                    if (v5 == 4) {
                        v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p8, v4_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.fido.u2f.api.common.RegisteredKey(v1_1, v2, v3);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.u2f.api.common.RegisteredKey[] v1_1 = new com.google.android.gms.fido.u2f.api.common.RegisteredKey[p1];
        return v1_1;
    }
}
