package com.google.android.gms.fido.fido2.api.common;
public final class zzy implements android.os.Parcelable$Creator {

    public zzy()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p15)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p15);
        long v12 = 0;
        boolean v10 = 0;
        boolean v11 = 0;
        String v6 = 0;
        String v7 = 0;
        byte[] v8 = 0;
        byte[] v9 = 0;
        while (p15.dataPosition() < v0) {
            long v1_2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p15);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_2)) {
                case 1:
                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p15, v1_2);
                    break;
                case 2:
                    v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p15, v1_2);
                    break;
                case 3:
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p15, v1_2);
                    break;
                case 4:
                    v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p15, v1_2);
                    break;
                case 5:
                    v10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p15, v1_2);
                    break;
                case 6:
                    v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(p15, v1_2);
                    break;
                case 7:
                    v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p15, v1_2);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p15, v1_2);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p15, v0);
        return new com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails(v6, v7, v8, v9, v10, v11, v12);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails[] v1_1 = new com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails[p1];
        return v1_1;
    }
}
