package com.google.android.gms.fido.fido2.api.common;
public final class zzd implements android.os.Parcelable$Creator {

    public zzd()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p14)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p14);
        com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension v3_0 = 0;
        com.google.android.gms.fido.fido2.api.common.zzs v4_0 = 0;
        com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension v5_0 = 0;
        com.google.android.gms.fido.fido2.api.common.zzz v6_1 = 0;
        com.google.android.gms.fido.fido2.api.common.zzab v7_1 = 0;
        com.google.android.gms.fido.fido2.api.common.zzad v8_1 = 0;
        com.google.android.gms.fido.fido2.api.common.zzu v9_1 = 0;
        com.google.android.gms.fido.fido2.api.common.zzag v10_0 = 0;
        com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension v11_0 = 0;
        com.google.android.gms.fido.fido2.api.common.zzai v12_0 = 0;
        while (p14.dataPosition() < v0) {
            android.os.Parcelable v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p14);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2)) {
                case 2:
                    v3_0 = ((com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension.CREATOR));
                    break;
                case 3:
                    v4_0 = ((com.google.android.gms.fido.fido2.api.common.zzs) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.fido.fido2.api.common.zzs.CREATOR));
                    break;
                case 4:
                    v5_0 = ((com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension.CREATOR));
                    break;
                case 5:
                    v6_1 = ((com.google.android.gms.fido.fido2.api.common.zzz) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.fido.fido2.api.common.zzz.CREATOR));
                    break;
                case 6:
                    v7_1 = ((com.google.android.gms.fido.fido2.api.common.zzab) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.fido.fido2.api.common.zzab.CREATOR));
                    break;
                case 7:
                    v8_1 = ((com.google.android.gms.fido.fido2.api.common.zzad) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.fido.fido2.api.common.zzad.CREATOR));
                    break;
                case 8:
                    v9_1 = ((com.google.android.gms.fido.fido2.api.common.zzu) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.fido.fido2.api.common.zzu.CREATOR));
                    break;
                case 9:
                    v10_0 = ((com.google.android.gms.fido.fido2.api.common.zzag) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.fido.fido2.api.common.zzag.CREATOR));
                    break;
                case 10:
                    v11_0 = ((com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension.CREATOR));
                    break;
                case 11:
                    v12_0 = ((com.google.android.gms.fido.fido2.api.common.zzai) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.fido.fido2.api.common.zzai.CREATOR));
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p14, v1_2);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p14, v0);
        return new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions(v3_0, v4_0, v5_0, v6_1, v7_1, v8_1, v9_1, v10_0, v11_0, v12_0);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions[] v1_1 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions[p1];
        return v1_1;
    }
}
