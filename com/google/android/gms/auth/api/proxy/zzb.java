package com.google.android.gms.auth.api.proxy;
public final class zzb implements android.os.Parcelable$Creator {

    public zzb()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p11)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p11);
        int v4 = 0;
        int v5 = 0;
        int v7 = 0;
        android.app.PendingIntent v6 = 0;
        android.os.Bundle v8 = 0;
        byte[] v9 = 0;
        while (p11.dataPosition() < v0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p11);
            android.os.Parcelable$Creator v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1);
            if (v2_0 == 1) {
                v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p11, v1_1);
            } else {
                if (v2_0 == 2) {
                    v6 = ((android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p11, v1_1, android.app.PendingIntent.CREATOR));
                } else {
                    if (v2_0 == 3) {
                        v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p11, v1_1);
                    } else {
                        if (v2_0 == 4) {
                            v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p11, v1_1);
                        } else {
                            if (v2_0 == 5) {
                                v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p11, v1_1);
                            } else {
                                if (v2_0 == 1000) {
                                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p11, v1_1);
                                } else {
                                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p11, v1_1);
                                }
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p11, v0);
        return new com.google.android.gms.auth.api.proxy.ProxyResponse(v4, v5, v6, v7, v8, v9);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.proxy.ProxyResponse[] v1_1 = new com.google.android.gms.auth.api.proxy.ProxyResponse[p1];
        return v1_1;
    }
}
