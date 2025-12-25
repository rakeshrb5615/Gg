package com.google.android.gms.common;
public final class zza implements android.os.Parcelable$Creator {

    public zza()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        android.app.PendingIntent v1_0 = 0;
        int v3 = 0;
        int v4 = 0;
        String v2_1 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
            } else {
                if (v6 == 2) {
                    v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
                } else {
                    if (v6 == 3) {
                        v1_0 = ((android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, android.app.PendingIntent.CREATOR));
                    } else {
                        if (v6 == 4) {
                            v2_1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p9, v5_0);
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.common.ConnectionResult(v3, v4, v1_0, v2_1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.ConnectionResult[] v1_1 = new com.google.android.gms.common.ConnectionResult[p1];
        return v1_1;
    }
}
