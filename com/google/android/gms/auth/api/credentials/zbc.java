package com.google.android.gms.auth.api.credentials;
public final class zbc implements android.os.Parcelable$Creator {

    public zbc()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p14)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p14);
        int v4 = 0;
        boolean v5 = 0;
        boolean v9 = 0;
        boolean v12 = 0;
        String[] v6 = 0;
        com.google.android.gms.auth.api.credentials.CredentialPickerConfig v7_1 = 0;
        com.google.android.gms.auth.api.credentials.CredentialPickerConfig v8_0 = 0;
        String v10 = 0;
        String v11 = 0;
        while (p14.dataPosition() < v0) {
            android.os.Parcelable v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p14);
            android.os.Parcelable$Creator v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2);
            if (v2_0 == 1000) {
                v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p14, v1_2);
            } else {
                switch (v2_0) {
                    case 1:
                        v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p14, v1_2);
                        break;
                    case 2:
                        v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(p14, v1_2);
                        break;
                    case 3:
                        v7_1 = ((com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR));
                        break;
                    case 4:
                        v8_0 = ((com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p14, v1_2, com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR));
                        break;
                    case 5:
                        v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p14, v1_2);
                        break;
                    case 6:
                        v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p14, v1_2);
                        break;
                    case 7:
                        v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p14, v1_2);
                        break;
                    case 8:
                        v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p14, v1_2);
                        break;
                    default:
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p14, v1_2);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p14, v0);
        return new com.google.android.gms.auth.api.credentials.CredentialRequest(v4, v5, v6, v7_1, v8_0, v9, v10, v11, v12);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.credentials.CredentialRequest[] v1_1 = new com.google.android.gms.auth.api.credentials.CredentialRequest[p1];
        return v1_1;
    }
}
