package com.google.android.gms.auth.api.credentials;
public final class zbb implements android.os.Parcelable$Creator {

    public zbb()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p10)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p10);
        int v3 = 0;
        boolean v4 = 0;
        boolean v5 = 0;
        boolean v6 = 0;
        int v7 = 0;
        while (p10.dataPosition() < v0) {
            int v1_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p10);
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig v2_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_0);
            if (v2_2 == 1) {
                v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v1_0);
            } else {
                if (v2_2 == 2) {
                    v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v1_0);
                } else {
                    if (v2_2 == 3) {
                        v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p10, v1_0);
                    } else {
                        if (v2_2 == 4) {
                            v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v1_0);
                        } else {
                            if (v2_2 == 1000) {
                                v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p10, v1_0);
                            } else {
                                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p10, v1_0);
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p10, v0);
        return new com.google.android.gms.auth.api.credentials.CredentialPickerConfig(v3, v4, v5, v6, v7);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.credentials.CredentialPickerConfig[] v1_1 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig[p1];
        return v1_1;
    }
}
