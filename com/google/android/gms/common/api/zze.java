package com.google.android.gms.common.api;
public final class zze implements android.os.Parcelable$Creator {

    public zze()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p9)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p9);
        String v1 = 0;
        com.google.android.gms.common.ConnectionResult v3_2 = 0;
        int v4 = 0;
        android.app.PendingIntent v2_3 = 0;
        while (p9.dataPosition() < v0) {
            int v5_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p9);
            int v6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v5_0);
            if (v6 == 1) {
                v4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(p9, v5_0);
            } else {
                if (v6 == 2) {
                    v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p9, v5_0);
                } else {
                    if (v6 == 3) {
                        v2_3 = ((android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, android.app.PendingIntent.CREATOR));
                    } else {
                        if (v6 == 4) {
                            v3_2 = ((com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p9, v5_0, com.google.android.gms.common.ConnectionResult.CREATOR));
                        } else {
                            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p9, v5_0);
                        }
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p9, v0);
        return new com.google.android.gms.common.api.Status(v4, v1, v2_3, v3_2);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.common.api.Status[] v1_1 = new com.google.android.gms.common.api.Status[p1];
        return v1_1;
    }
}
