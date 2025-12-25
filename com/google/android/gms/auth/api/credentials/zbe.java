package com.google.android.gms.auth.api.credentials;
public final class zbe implements android.os.Parcelable$Creator {

    public zbe()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p13)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p13);
        com.google.android.gms.auth.api.credentials.CredentialPickerConfig v5_0 = 0;
        String[] v8 = 0;
        String v10 = 0;
        String v11 = 0;
        int v4 = 0;
        boolean v6 = 0;
        boolean v7 = 0;
        boolean v9 = 0;
        while (p13.dataPosition() < v0) {
            android.os.Parcelable v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p13);
            android.os.Parcelable$Creator v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2);
            if (v2_0 == 1000) {
                v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p13, v1_2);
            } else {
                switch (v2_0) {
                    case 1:
                        v5_0 = ((com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p13, v1_2, com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR));
                        break;
                    case 2:
                        v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p13, v1_2);
                        break;
                    case 3:
                        v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p13, v1_2);
                        break;
                    case 4:
                        v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(p13, v1_2);
                        break;
                    case 5:
                        v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p13, v1_2);
                        break;
                    case 6:
                        v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                        break;
                    case 7:
                        v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p13, v1_2);
                        break;
                    default:
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p13, v1_2);
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p13, v0);
        return new com.google.android.gms.auth.api.credentials.HintRequest(v4, v5_0, v6, v7, v8, v9, v10, v11);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.credentials.HintRequest[] v1_1 = new com.google.android.gms.auth.api.credentials.HintRequest[p1];
        return v1_1;
    }
}
