package com.google.android.gms.fido.fido2.api.common;
public final class zzn implements android.os.Parcelable$Creator {

    public zzn()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions v1_1 = 0;
        android.net.Uri v2_2 = 0;
        byte[] v3 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 2) {
                v1_1 = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p8, v4_0, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.CREATOR));
            } else {
                if (v5 == 3) {
                    v2_2 = ((android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p8, v4_0, android.net.Uri.CREATOR));
                } else {
                    if (v5 == 4) {
                        v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p8, v4_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions(v1_1, v2_2, v3);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions[] v1_1 = new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions[p1];
        return v1_1;
    }
}
