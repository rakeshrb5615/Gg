package com.google.android.gms.fido.fido2.api.common;
public final class zzc implements android.os.Parcelable$Creator {

    public zzc()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        com.google.android.gms.fido.fido2.api.common.UvmEntries v1_1 = 0;
        com.google.android.gms.fido.fido2.api.common.zzf v2_2 = 0;
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs v3_2 = 0;
        com.google.android.gms.fido.fido2.api.common.zzh v4_2 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v1_1 = ((com.google.android.gms.fido.fido2.api.common.UvmEntries) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, com.google.android.gms.fido.fido2.api.common.UvmEntries.CREATOR));
            } else {
                if (v6 == 2) {
                    v2_2 = ((com.google.android.gms.fido.fido2.api.common.zzf) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, com.google.android.gms.fido.fido2.api.common.zzf.CREATOR));
                } else {
                    if (v6 == 3) {
                        v3_2 = ((com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs.CREATOR));
                    } else {
                        if (v6 == 4) {
                            v4_2 = ((com.google.android.gms.fido.fido2.api.common.zzh) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, com.google.android.gms.fido.fido2.api.common.zzh.CREATOR));
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs(v1_1, v2_2, v3_2, v4_2);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs[] v1_1 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs[p1];
        return v1_1;
    }
}
