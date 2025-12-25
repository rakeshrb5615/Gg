package com.google.android.gms.auth.api.proxy;
public final class zza implements android.os.Parcelable$Creator {

    public zza()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p14)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p14);
        int v6 = 0;
        int v8 = 0;
        String v7 = 0;
        byte[] v11 = 0;
        android.os.Bundle v12 = 0;
        long v9 = 0;
        while (p14.dataPosition() < v0) {
            int v1_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p14);
            int v2_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v1_1);
            if (v2_0 == 1) {
                v7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p14, v1_1);
            } else {
                if (v2_0 == 2) {
                    v8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p14, v1_1);
                } else {
                    if (v2_0 == 3) {
                        v9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(p14, v1_1);
                    } else {
                        if (v2_0 == 4) {
                            v11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(p14, v1_1);
                        } else {
                            if (v2_0 == 5) {
                                v12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(p14, v1_1);
                            } else {
                                if (v2_0 == 1000) {
                                    v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p14, v1_1);
                                } else {
                                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p14, v1_1);
                                }
                            }
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p14, v0);
        return new com.google.android.gms.auth.api.proxy.ProxyRequest(v6, v7, v8, v9, v11, v12);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.auth.api.proxy.ProxyRequest[] v1_1 = new com.google.android.gms.auth.api.proxy.ProxyRequest[p1];
        return v1_1;
    }
}
