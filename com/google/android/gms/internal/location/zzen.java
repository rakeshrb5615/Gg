package com.google.android.gms.internal.location;
public final class zzen implements android.os.Parcelable$Creator {

    public zzen()
    {
        return;
    }

    public final bridge synthetic Object createFromParcel(android.os.Parcel p8)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(p8);
        String v1 = "";
        java.util.ArrayList v2 = 0;
        android.app.PendingIntent v3_2 = 0;
        while (p8.dataPosition() < v0) {
            int v4_0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(p8);
            int v5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(v4_0);
            if (v5 == 1) {
                v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(p8, v4_0);
            } else {
                if (v5 == 2) {
                    v3_2 = ((android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(p8, v4_0, android.app.PendingIntent.CREATOR));
                } else {
                    if (v5 == 3) {
                        v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(p8, v4_0);
                    } else {
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(p8, v4_0);
                    }
                }
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(p8, v0);
        return new com.google.android.gms.internal.location.zzem(v2, v3_2, v1);
    }

    public final synthetic Object[] newArray(int p1)
    {
        com.google.android.gms.internal.location.zzem[] v1_1 = new com.google.android.gms.internal.location.zzem[p1];
        return v1_1;
    }
}
