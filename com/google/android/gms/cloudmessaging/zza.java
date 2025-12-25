package com.google.android.gms.cloudmessaging;
public final class zza implements android.os.Parcelable$Creator {

    public zza()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p6);
        android.content.Intent v1_2 = 0;
        while (p6.dataPosition() < v0) {
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p6);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v2_0) == 1) {
                v1_2 = ((android.content.Intent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p6, v2_0, android.content.Intent.CREATOR));
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p6, v2_0);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p6, v0);
        return new com.google.android.gms.cloudmessaging.CloudMessage(v1_2);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.cloudmessaging.CloudMessage[] v1_1 = new com.google.android.gms.cloudmessaging.CloudMessage[p1];
        return v1_1;
    }
}
